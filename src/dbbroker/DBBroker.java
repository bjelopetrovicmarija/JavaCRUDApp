/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbbroker;

import forme.FRadSaDobavljacima;
import forme.GlavnaForma;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.MapBinding;
import javax.swing.JOptionPane;
import model.Adresa;
import model.Artikal;
import model.Cena;
import model.Datum;
import model.Delatnost;
import model.Dobavljac;
import model.Faktura;
import model.JedinicaMere;
import model.Katalog;
import model.Kupac;
import model.Mesto;
import model.NacinIsporuke;
import model.Otpremnica;
import model.Placanje;
import model.Porudzbina;
import model.Procenat;
import model.StavkaKataloga;
import model.StavkaPorudzbine;
import model.TekuciRacun;
import model.Ulica;
import model.UlicaBroj;
import model.Valuta;
import model.Zaposleni;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleTypes;
import static oracle.jdbc.OracleTypes.STRUCT;

/**
 *
 * @author Dell
 */
public class DBBroker {

    private Connection conn;
    private Statement s;

    public void ucitajDrajver() {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception ex) {
            System.err.println("Greska prilikom ucitavanja drajvera: " + ex);
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void uspostaviKonekciju() {

        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "marija", "marija");
            conn.setAutoCommit(false);

        } catch (SQLException e) {
            System.err.println("Greska prilikom uspostavljanja konekcije sa bazom: " + e);

        }

    }

    public void zatvoriKonekciju() {

        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void commit() {

        try {
            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void rollback() {

        try {
            conn.rollback();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Mesto> vratiMesta() {
        ArrayList<Mesto> lista = new ArrayList<>();

        String upit = "SELECT * FROM mesto ORDER BY mestoid";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {

                lista.add(new Mesto(rs.getInt("mestoid"), rs.getString("nazivmesta"), null, null));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public ArrayList<Ulica> vratiUliceZaMesto(Mesto m) {

        ArrayList<Ulica> lista = new ArrayList<>();
        String upit = "SELECT * FROM ulica u join mesto m on u.mestoid=" + m.getMestoID();
        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {

                lista.add(new Ulica(rs.getInt("ulicaid"), rs.getString("nazivulice"), rs.getString("nazivmesta"), null, null, null));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public void obrisiMesto(Mesto mestoZaBrisanje) throws SQLException {

        String upit = "DELETE FROM mesto WHERE mestoid=" + mestoZaBrisanje.getMestoID();
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.executeUpdate();

    }

    public void izmeniMesto(Mesto m) throws SQLException {

        String upit = "UPDATE mesto SET nazivmesta='" + m.getNazivMesta() + "' WHERE mestoid=" + m.getMestoID();

        s = conn.createStatement();

        s.executeUpdate(upit);

    }

    public int vratiMaxMestoID() {
        int maxID = 0;

        String upit = "SELECT max(mestoid) as max from mesto";
        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                maxID = rs.getInt("max");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ++maxID;
    }

    public void sacuvajMesto(Mesto m) throws SQLException {

        String upit = "INSERT INTO mesto (mestoid,nazivmesta) VALUES (?,?)";

        PreparedStatement ps = conn.prepareStatement(upit);
        ps.setInt(1, m.getMestoID());
        ps.setString(2, m.getNazivMesta());
        ps.execute();

    }

    public int vratiMaxDobID() {

        int maxID = 0;

        String upit = "SELECT max(dobid) as max from dobavljac";
        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                maxID = rs.getInt("max");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ++maxID;

    }

    public ArrayList<TekuciRacun> vratiTekuceRacune() {
        ArrayList<TekuciRacun> lista = new ArrayList<>();

        String upit = "SELECT * FROM tekuciracun";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {

                lista.add(new TekuciRacun(rs.getInt("tekuciracunid"), rs.getString("brojracuna")));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public ArrayList<Delatnost> vratiDelatnosti() {

        ArrayList<Delatnost> lista = new ArrayList<>();

        String upit = "SELECT * FROM delatnost";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {

                lista.add(new Delatnost(rs.getInt("delatnostid"), rs.getString("nazivdel")));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public ArrayList<Ulica> vratiUlice() {

        ArrayList<Ulica> lista = new ArrayList<>();

        String upit = "SELECT * FROM ulica u join mesto m on u.mestoid=m.mestoid";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {
                Mesto m = new Mesto(rs.getInt("mestoid"), rs.getString("nazivmesta"), null, null);
                lista.add(new Ulica(rs.getInt("ulicaid"), rs.getString("nazivulice"), rs.getString("nazivmesta"), null, m, null));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public ArrayList<Adresa> vratiAdrese() {

        ArrayList<Adresa> lista = new ArrayList<>();

        String upit = "SELECT * FROM adresa a join ulica u on a.ulicaid=u.ulicaid join mesto m on u.mestoid=m.mestoid";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            OracleConnection oraConn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "marija", "marija");
            Map map = oraConn.getTypeMap();

            map.put("MARIJA.ULICA_BROJ", Class.forName("model.UlicaBroj"));

            while (rs.next()) {
                Mesto m = new Mesto(rs.getInt("mestoid"), rs.getString("nazivmesta"), null, null);
                Ulica u = new Ulica(rs.getInt("ulicaid"), rs.getString("nazivulice"), null, null, m, upit);
                lista.add(new Adresa(rs.getInt("adresaid"), (UlicaBroj) rs.getObject("broj", map), u, ""));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public void sacuvajDobavljaca(Dobavljac dobavljac) throws SQLException {

        String upit = "INSERT INTO dobavljac VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(upit);
        ps.setInt(1, dobavljac.getDobavljacID());
        ps.setString(2, dobavljac.getNazivDobavljaca());
        ps.setString(3, dobavljac.getPib());
        ps.setString(4, dobavljac.getTelefon());
        ps.setString(5, dobavljac.getFax());
        ps.setString(6, dobavljac.getMail());
        ps.setInt(7, dobavljac.getTekuciRacun().getTekuciRacunID());
        ps.setInt(8, dobavljac.getDelatnost().getDelatnostID());
        ps.setInt(9, dobavljac.getMesto().getMestoID());
        ps.setInt(10, dobavljac.getUlica().getUlicaID());
        ps.setInt(11, dobavljac.getAdresa().getAdresaID());
        ps.setString(12, dobavljac.getBrojRacuna());

        ps.executeUpdate();

    }

    public int vratiMaxArtikalID() {

        int maxID = 0;

        String upit = "SELECT max(artikalid) as max from artikal";
        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                maxID = rs.getInt("max");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ++maxID;

    }

    public ArrayList<Valuta> vratiValute() {
        ArrayList<Valuta> lista = new ArrayList<>();

        String upit = "SELECT * FROM valuta";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {

                lista.add(new Valuta(rs.getInt("valutaid"), rs.getString("nazivvalute"), rs.getString("oznakavalute")));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public void sacuvajCenu(Cena c) throws SQLException {

        String upit = "INSERT INTO cena VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, c.getArtikal().getArtikalID());
        ps.setDate(2, new Date(c.getDatumOd().getTime()));
        ps.setDouble(3, c.getIznos());
        ps.setInt(4, c.getValuta().getValutaID());

        ps.execute();

    }

    public void sacuvajArtikal(Artikal artikal) throws SQLException {

        String upit = "INSERT INTO artikal VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, artikal.getArtikalID());
        ps.setString(2, artikal.getNazivArtikla());
        ps.setString(3, artikal.getOpisArtikla());
        ps.setDouble(4, artikal.getAktuelnaCena());

        ps.execute();

    }

    public ArrayList<NacinIsporuke> vratiNacineIsporuke() {
        ArrayList<NacinIsporuke> lista = new ArrayList<>();
        String upit = "SELECT * FROM nacinisporuke";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {
                lista.add(new NacinIsporuke(rs.getInt("nacinisporukeid"), rs.getString("nazivnacinaisp")));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public ArrayList<Placanje> vratiPlacanja() {

        ArrayList<Placanje> lista = new ArrayList<>();
        String upit = "SELECT * FROM placanje p join valuta v on p.valutaid=v.valutaid";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {
                Valuta v = new Valuta(rs.getInt("valutaid"), rs.getString("nazivvalute"), rs.getString("oznakavalute"));
                lista.add(new Placanje(rs.getInt("placanjeid"), rs.getString("nacinplacanja"), rs.getString("rokplacanja"), v));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public ArrayList<Datum> vratiDatume() {

        ArrayList<Datum> lista = new ArrayList<>();
        String upit = "SELECT * FROM datum";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {
                lista.add(new Datum(rs.getInt("datumid"), rs.getInt("godina"), rs.getInt("mesec"), rs.getInt("dan")));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public ArrayList<Kupac> vratiKupce() {

        ArrayList<Kupac> lista = new ArrayList<>();
        String upit = "SELECT * FROM kupac_view k join mesto m on k.mestoid=m.mestoid join ulica u on k.ulicaid=u.ulicaid join adresa a on k.adresaid=a.adresaid";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            Map map = conn.getTypeMap();

            map.put("MARIJA.ULICA_BROJ", Class.forName("model.UlicaBroj"));

            while (rs.next()) {
                Mesto m = new Mesto(rs.getInt("mestoid"), rs.getString("nazivmesta"), null, null);
                Ulica u = new Ulica(rs.getInt("ulicaid"), rs.getString("nazivulice"), rs.getString("nazivmesta"), null, m, null);
                Adresa a = new Adresa(rs.getInt("adresaid"), (UlicaBroj) rs.getObject("broj", map), u, null);

                Kupac kupac = new Kupac(rs.getInt("sifrakupca"), rs.getString("nazivkupca"), m, u, a, rs.getString("pib"), rs.getString("telefon"), rs.getString("fax"), null);
                if (!lista.contains(kupac)) {

                    lista.add(kupac);

                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, e);
        }

        return lista;

    }

    public ArrayList<Dobavljac> vrati_Dobavljace() {
        ArrayList<Dobavljac> lista = new ArrayList<>();
        String upit = "SELECT * FROM dobavljac";
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {

                lista.add(new Dobavljac(rs.getInt("dobid"), rs.getString("nazivdob"), rs.getString("pib"), rs.getString("telefon"), rs.getString("fax"), rs.getString("mail"), null, null, null, null, null, null, null));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public int vratiMaxBrojPorudzbine() {

        int maxID = 0;

        String upit = "SELECT max(brporudz) as max from porudzbina";
        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                maxID = rs.getInt("max");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ++maxID;

    }

    public ArrayList<Artikal> vratiArtikle() {

        ArrayList<Artikal> lista = new ArrayList<>();
        String upit = "SELECT * FROM artikal ORDER BY artikalid";
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {

                lista.add(new Artikal(rs.getInt("artikalid"), rs.getString("nazivartikla"), rs.getString("opisartikla"), null, rs.getDouble("aktuelnacena")));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public ArrayList<JedinicaMere> vratiJediniceMere() {
        ArrayList<JedinicaMere> lista = new ArrayList<>();
        String upit = "SELECT * FROM jedinicamere";
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {

                lista.add(new JedinicaMere(rs.getInt("jmid"), rs.getString("nazivjm")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public void sacuvajPorudzbinu(Porudzbina porudzbina) throws SQLException {

        String upit = "INSERT INTO porudzbina VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, porudzbina.getPorudzbinaID());
        ps.setString(2, porudzbina.getNacinPorudzbine());
        ps.setString(3, porudzbina.getInformacijeOPorudzbini());
        ps.setInt(4, porudzbina.getNacinIsporuke().getNacinIsporukeID());
        ps.setInt(5, porudzbina.getDatum().getDatumID());
        ps.setInt(6, porudzbina.getPlacanje().getPlacanjeID());
        ps.setInt(7, porudzbina.getDobavljac().getDobavljacID());
        ps.setInt(8, porudzbina.getKupac().getSifraKupca());
        ps.setInt(9, porudzbina.getValuta().getValutaID());
        ps.setDouble(10, porudzbina.getUkupanIznos());

        ps.execute();
    }

    public void sacuvajStavkuPorudzbine(StavkaPorudzbine sp) throws SQLException {

        String upit = "INSERT INTO stavkaporudzbine VALUES (?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, sp.getPorudzbina().getPorudzbinaID());
        ps.setInt(2, sp.getRbStavke());
        ps.setInt(3, sp.getKolicina());
        ps.setInt(4, sp.getArtikal().getArtikalID());
        ps.setInt(5, sp.getJedinicaMere().getJmID());

        ps.execute();

    }

    public ArrayList<Porudzbina> vratiPorudzbine() {

        ArrayList<Porudzbina> lista = new ArrayList<>();
        String upit = "SELECT * FROM porudzbina p join nacinisporuke n on p.nacinisporukeid=n.nacinisporukeid join datum da on p.datumid=da.datumid join dobavljac d on p.dobid=d.dobid join placanje pl on p.placanjeid=pl.placanjeid join kupac_view k on p.sifrakupca=k.sifrakupca join valuta v on p.valutaid=v.valutaid";
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {
                Dobavljac dobavljac = new Dobavljac(rs.getInt("dobid"), rs.getString("nazivdob"), rs.getString("pib"), rs.getString("telefon"), rs.getString("fax"), rs.getString("mail"), null, null, null, null, null, null, null);
                Datum datum = new Datum(rs.getInt("datumid"), rs.getInt("godina"), rs.getInt("mesec"), rs.getInt("dan"));
                Kupac kupac = new Kupac(rs.getInt("sifrakupca"), rs.getString("nazivkupca"), null, null, null, rs.getString("pib"), rs.getString("telefon"), rs.getString("fax"), null);
                Valuta valuta = new Valuta(rs.getInt("valutaid"), rs.getString("nazivvalute"), rs.getString("oznakavalute"));
                Placanje placanje = new Placanje(rs.getInt("placanjeid"), rs.getString("nacinplacanja"), rs.getString("rokplacanja"), valuta);
                NacinIsporuke nacinIsporuke = new NacinIsporuke(rs.getInt("nacinisporukeid"), rs.getString("nazivnacinaisp"));

                lista.add(new Porudzbina(rs.getInt("brporudz"), rs.getString("nacinporudz"), rs.getString("infoporudz"), nacinIsporuke, datum, placanje, dobavljac, kupac, null, rs.getDouble("ukupaniznos"), valuta));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public void obrisiPorudzbinu(Porudzbina p) throws SQLException {
        String upit = "DELETE FROM porudzbina WHERE brporudz=" + p.getPorudzbinaID();

        PreparedStatement ps = conn.prepareStatement(upit);
        ps.executeUpdate();

    }

    public void izmeniPorudzbinu(Porudzbina porudzbina, String dodatak) throws SQLException {

        String upit = "UPDATE porudzbina SET nacinporudz=?, infoporudz=?, dobid=?, datumid=?, sifrakupca=?, placanjeid=?, nacinisporukeid=?,"
                + "ukupaniznos=?" + dodatak + " WHERE brporudz=?";

        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setString(1, porudzbina.getNacinPorudzbine());
        ps.setString(2, porudzbina.getInformacijeOPorudzbini());
        ps.setInt(3, porudzbina.getDobavljac().getDobavljacID());
        ps.setInt(4, porudzbina.getDatum().getDatumID());
        ps.setInt(5, porudzbina.getKupac().getSifraKupca());
        ps.setInt(6, porudzbina.getPlacanje().getPlacanjeID());
        ps.setInt(7, porudzbina.getNacinIsporuke().getNacinIsporukeID());
        ps.setDouble(8, porudzbina.getUkupanIznos());
        ps.setInt(9, porudzbina.getPorudzbinaID());

        ps.executeUpdate();

    }

    public ArrayList<Otpremnica> vratiOtpremnice() {

        ArrayList<Otpremnica> lista = new ArrayList<>();
        String upit = "SELECT * FROM otpremnica o join dobavljac d on o.dobid=d.dobid join datum zeljeni on o.zeljenitermin=zeljeni.datumid join datum dat on o.datumotpremnice=dat.datumid join porudzbina p on o.brporudz=p.brporudz join zaposleni od on o.odobrio=od.zaposleniid join zaposleni pr on o.primio=pr.zaposleniid";
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {
                Dobavljac dobavljac = new Dobavljac(rs.getInt("dobid"), rs.getString("nazivdob"), rs.getString("pib"), rs.getString("telefon"), rs.getString("fax"), rs.getString("mail"), null, null, null, null, null, null, null);
//                Datum datumOtpr = new Datum(rs.getInt("dat.datumid"), rs.getInt("dat.godina"), rs.getInt("dat.mesec"), rs.getInt("dat.dan"));
//                Datum zeljeni = new Datum(rs.getInt("zeljeni.datumid"), rs.getInt("zeljeni.godina"), rs.getInt("zeljeni.mesec"), rs.getInt("zeljeni.dan"));
                Zaposleni od = new Zaposleni(rs.getInt("zaposleniid"), rs.getString("imeprezimezap"), rs.getString("brojlk"), null);
                Zaposleni pr = new Zaposleni(rs.getInt("zaposleniid"), rs.getString("imeprezimezap"), rs.getString("brojlk"), null);
                Porudzbina p = new Porudzbina(rs.getInt("brporudz"), rs.getString("nacinporudz"), rs.getString("infoporudz"), null, null, null, null, null, null, rs.getDouble("ukupaniznos"), null);
                lista.add(new Otpremnica(rs.getInt("brojotpremnice"), rs.getString("napomena"), null, null, dobavljac, p, od, pr, null));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public int vratiMaxBrojFakture() {
        int maxID = 0;
        String upit = "SELECT max(brojfakture) as max from faktura";
        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                maxID = rs.getInt("max");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ++maxID;

    }

    public void sacuvajFakturu(Faktura faktura) throws Exception {

        String upit = "INSERT INTO faktura (brojfakture, osnovica, brojotpremnice, mestoid, sifrakupca, dobid, datumfakture, datumprometa, stopapdv) VALUES (?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, faktura.getBrojFakture());
        ps.setDouble(2, faktura.getOsnovica());
        ps.setInt(3, faktura.getOtpremnica().getBrojOtpremnice());
        ps.setInt(4, faktura.getMesto().getMestoID());
        ps.setInt(5, faktura.getKupac().getSifraKupca());
        ps.setInt(6, faktura.getDobavljac().getDobavljacID());
        ps.setInt(7, faktura.getDatumFakture().getDatumID());
        ps.setInt(8, faktura.getDatumPrometa().getDatumID());
        ps.setObject(9, faktura.getStopaPDV(), OracleTypes.STRUCT);

        ps.execute();

    }

    public ArrayList<Faktura> vratiFakture() {
        ArrayList<Faktura> lista = new ArrayList<>();

        String upit = "SELECT * FROM faktura f join otpremnica o on f.brojotpremnice=o.brojotpremnice join kupac_view k on f.sifrakupca=k.sifrakupca join dobavljac d on f.dobid=d.dobid join mesto m on f.mestoid=m.mestoid join datum d1 on f.datumfakture=d1.datumid join datum d2 on f.datumprometa=d2.datumid";
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            Map map = conn.getTypeMap();

            map.put("MARIJA.PROCENAT", Class.forName("model.Procenat"));

            while (rs.next()) {

                Dobavljac dobavljac = new Dobavljac(rs.getInt("dobid"), rs.getString("nazivdob"), rs.getString("pib"), rs.getString("telefon"), rs.getString("fax"), rs.getString("mail"), null, null, null, null, null, null, null);
                Datum datumF = new Datum(rs.getInt("datumid"), rs.getInt("godina"), rs.getInt("mesec"), rs.getInt("dan"));
                Datum datumPr = new Datum(rs.getInt("datumid"), rs.getInt("godina"), rs.getInt("mesec"), rs.getInt("dan"));
                Mesto mesto = new Mesto(rs.getInt("mestoid"), rs.getString("nazivmesta"), null, null);
                Kupac kupac = new Kupac(rs.getInt("sifrakupca"), rs.getString("nazivkupca"), null, null, null, rs.getString("pib"), rs.getString("telefon"), rs.getString("fax"), null);
                Otpremnica o = new Otpremnica(rs.getInt("brojotpremnice"), rs.getString("napomena"), null, null, dobavljac, null, null, null, null);
                lista.add(new Faktura(rs.getInt("brojfakture"), rs.getDouble("osnovica"), rs.getDouble("iznospdv"), rs.getDouble("ukupaniznos"), o, mesto, kupac, dobavljac, datumF, datumPr, (Procenat) rs.getObject("stopapdv", map), null, null));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException cnfe) {

            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, cnfe);

        }

        return lista;

    }

    public void obrisiFakturu(Faktura f) throws SQLException {

        String upit = "DELETE FROM faktura WHERE brojfakture=" + f.getBrojFakture();
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.executeUpdate();

    }

    public void izmeniFakturu(Faktura faktura) throws SQLException {

        String upit = "UPDATE faktura SET osnovica=?, iznospdv=?, ukupaniznos=?, brojotpremnice=?, mestoid=?, dobid=?, sifrakupca=?,"
                + "datumfakture=?, datumprometa=?, stopapdv=? WHERE brojfakture=?";

        PreparedStatement ps = conn.prepareStatement(upit);
        ps.setDouble(1, faktura.getOsnovica());
        ps.setDouble(2, faktura.getIznosPDV());
        ps.setDouble(3, faktura.getUkupanIznos());
        ps.setInt(4, faktura.getOtpremnica().getBrojOtpremnice());
        ps.setInt(5, faktura.getMesto().getMestoID());
        ps.setInt(6, faktura.getDobavljac().getDobavljacID());
        ps.setInt(7, faktura.getKupac().getSifraKupca());
        ps.setInt(8, faktura.getDatumFakture().getDatumID());
        ps.setInt(9, faktura.getDatumPrometa().getDatumID());
        ps.setObject(10, faktura.getStopaPDV(), OracleTypes.STRUCT);
        ps.setInt(11, faktura.getBrojFakture());

        ps.executeUpdate();

    }

    public int vratiMaxSifruKupca() {

        int maxID = 0;
        String upit = "SELECT max(sifrakupca) as max from kupac";
        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                maxID = rs.getInt("max");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ++maxID;

    }

    public void sacuvajKupca(Kupac kupac) throws SQLException {

        String upit = "INSERT INTO kupac_view VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, kupac.getSifraKupca());
        ps.setString(2, kupac.getNazivKupca());
        ps.setInt(3, kupac.getMesto().getMestoID());
        ps.setInt(4, kupac.getUlica().getUlicaID());
        ps.setInt(5, kupac.getAdresa().getAdresaID());
        ps.setString(6, kupac.getPib());
        ps.setString(7, kupac.getTelefon());
        ps.setString(8, kupac.getFax());

        ps.execute();

    }

    public void obrisiKupca(Kupac kupac) throws SQLException {
        String upit = "DELETE FROM kupac_view where sifrakupca=" + kupac.getSifraKupca();
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.executeUpdate();

    }

    public void izmeniKupca(Kupac kupac) throws SQLException {

        String upit = "UPDATE kupac_view SET nazivkupca=?,mestoid=?, ulicaid=?, adresaid=?, pib=?, telefon=?, fax=? where sifrakupca=?";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setString(1, kupac.getNazivKupca());
        ps.setInt(2, kupac.getMesto().getMestoID());
        ps.setInt(3, kupac.getUlica().getUlicaID());
        ps.setInt(4, kupac.getAdresa().getAdresaID());
        ps.setString(5, kupac.getPib());
        ps.setString(6, kupac.getTelefon());
        ps.setString(7, kupac.getFax());
        ps.setInt(8, kupac.getSifraKupca());

        ps.executeUpdate();

    }

    public ArrayList<Dobavljac> vratiDobavljace() {
        ArrayList<Dobavljac> lista = new ArrayList<>();
        String upit = "SELECT * FROM dobavljac d join delatnost del on d.delatnostid=del.delatnostid join tekuciracun t on d.tekuciracunid=t.tekuciracunid join mesto m on d.mestoid=m.mestoid join ulica u on d.ulicaid=u.ulicaid join adresa a on d.adresaid=a.adresaid ";

        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            Map map = conn.getTypeMap();

            map.put("MARIJA.ULICA_BROJ", Class.forName("model.UlicaBroj"));

            while (rs.next()) {
                Mesto m = new Mesto(rs.getInt("mestoid"), rs.getString("nazivmesta"), null, null);
                Ulica u = new Ulica(rs.getInt("ulicaid"), rs.getString("nazivulice"), rs.getString("nazivmesta"), null, null, null);
                Adresa a = new Adresa(rs.getInt("adresaid"), (UlicaBroj) rs.getObject("broj", map), null, null);
                Delatnost d = new Delatnost(rs.getInt("delatnostid"), rs.getString("nazivdel"));
                TekuciRacun t = new TekuciRacun(rs.getInt("tekuciracunid"), rs.getString("brojracuna"));

                Dobavljac dobavljac = new Dobavljac(rs.getInt("dobid"), rs.getString("nazivdob"), rs.getString("pib"), rs.getString("telefon"), rs.getString("fax"), rs.getString("mail"), t, d, m, u, a, null, rs.getString("brojracuna"));
                if (!lista.contains(dobavljac)) {

                    lista.add(dobavljac);

                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, e);

        }

        return lista;
    }

    public void obrisiDobavljaca(Dobavljac d) throws SQLException {

        String upit = "DELETE FROM dobavljac WHERE dobid=" + d.getDobavljacID();
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.execute();

    }

    public void izmeniDobavljaca(Dobavljac dobavljac, String dodatak) throws SQLException {

        String upit = "UPDATE dobavljac set nazivdob=?, pib=?, telefon=?, fax=?, mail=?, tekuciracunid=?, delatnostid=?, mestoid=?, ulicaid=?, adresaid=?" + dodatak + " WHERE dobid=?";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setString(1, dobavljac.getNazivDobavljaca());
        ps.setString(2, dobavljac.getPib());
        ps.setString(3, dobavljac.getTelefon());
        ps.setString(4, dobavljac.getFax());
        ps.setString(5, dobavljac.getMail());
        ps.setInt(6, dobavljac.getTekuciRacun().getTekuciRacunID());
        ps.setInt(7, dobavljac.getDelatnost().getDelatnostID());
        ps.setInt(8, dobavljac.getMesto().getMestoID());
        ps.setInt(9, dobavljac.getUlica().getUlicaID());
        ps.setInt(10, dobavljac.getAdresa().getAdresaID());
        ps.setInt(11, dobavljac.getDobavljacID());

        ps.executeUpdate();

    }

    public void obrisiArtikal(Artikal a) throws SQLException {
        String upit = "DELETE FROM artikal WHERE artikalid=" + a.getArtikalID();
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.executeUpdate();

    }

    public ArrayList<Cena> vratiCeneZaArtikal(Artikal a) {

        ArrayList<Cena> lista = new ArrayList<>();
        String upit = "SELECT * FROM cena c join artikal a on c.artikalid=a.artikalid join valuta v on c.valutaid=v.valutaid where c.artikalid=" + a.getArtikalID();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {
                Valuta v = new Valuta(rs.getInt("valutaid"), rs.getString("nazivvalute"), rs.getString("oznakavalute"));
                lista.add(new Cena(new Date(rs.getDate("datumod").getTime()), rs.getDouble("iznos"), v, a, ""));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public void izmeniCenu(Cena c) throws SQLException {
        String upit = "UPDATE cena SET   iznos=? WHERE  artikalid=? AND datumod=?";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setDouble(1, c.getIznos());
        ps.setInt(2, c.getArtikal().getArtikalID());
        ps.setDate(3, new Date(c.getDatumOd().getTime()));

        ps.executeUpdate();
    }

    public void izmeniArtikal(Artikal artikal) throws SQLException {
        String upit = "UPDATE artikal SET  nazivartikla=?, opisartikla=?, aktuelnacena=? WHERE  artikalid=?";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setString(1, artikal.getNazivArtikla());
        ps.setString(2, artikal.getOpisArtikla());
        ps.setDouble(3, artikal.getAktuelnaCena());
        ps.setInt(4, artikal.getArtikalID());

        ps.executeUpdate();

    }

    public void obrisiCenu(Cena c) throws SQLException {

        String upit = "DELETE FROM cena WHERE artikalid=? AND datumod=?";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, c.getArtikal().getArtikalID());
        ps.setDate(2, new Date(c.getDatumOd().getTime()));

        ps.executeUpdate();

    }

    public void sacuvajKatalog(Katalog k) throws SQLException {

        String upit = "INSERT INTO katalog VALUES (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, k.getDobavljac().getDobavljacID());
        ps.setInt(2, k.getKatalogID());
        ps.setInt(3, k.getBrojStranica());

        ps.execute();

    }

    public void sacuvajStavkuKataloga(StavkaKataloga sk) throws SQLException {
        String upit = "INSERT INTO stavkakataloga VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, sk.getKatalog().getDobavljac().getDobavljacID());
        ps.setInt(2, sk.getKatalog().getKatalogID());
        ps.setInt(3, sk.getStavkaID());
        ps.setInt(4, sk.getRbStavke());
        ps.setInt(5, sk.getArtikal().getArtikalID());
        ps.setInt(6, sk.getJedinicaMere().getJmID());
        ps.setString(7, sk.getNazivDobavljaca());

        ps.execute();
    }

    public void sacuvajUlicu(Ulica ulica) throws SQLException {

        String upit = "INSERT INTO ulica VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, ulica.getMesto().getMestoID());
        ps.setInt(2, ulica.getUlicaID());
        ps.setString(3, ulica.getNazivUlice());
        ps.setString(4, ulica.getNazivMesta());

        ps.execute();

    }

    public void sacuvajAdresu(Adresa a) throws SQLException {

        String upit = "INSERT INTO adresa VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, a.getUlica().getMesto().getMestoID());
        ps.setInt(2, a.getUlica().getUlicaID());
        ps.setInt(3, a.getAdresaID());
        ps.setObject(4, a.getUlicaBroj());

        ps.execute();

    }

    public void obrisiUlicu(Ulica ulica) throws SQLException {

        String upit = "DELETE FROM ulica WHERE ulicaid=? AND mestoid=?";
        PreparedStatement ps = conn.prepareStatement(upit);
        ps.setInt(1, ulica.getUlicaID());
        ps.setInt(2, ulica.getMesto().getMestoID());
        ps.executeUpdate();

    }

    public ArrayList<Adresa> vratiAdreseZaUlicu(Ulica ulica) {

        ArrayList<Adresa> lista = new ArrayList<>();

        String upit = "SELECT * FROM adresa a join ulica u on a.ulicaid=u.ulicaid join mesto m on a.mestoid=m.mestoid where a.ulicaid=" + ulica.getUlicaID() + " and a.mestoid=" + ulica.getMesto().getMestoID();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            OracleConnection oraConn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "marija", "marija");
            Map map = oraConn.getTypeMap();

            map.put("MARIJA.ULICA_BROJ", Class.forName("model.UlicaBroj"));

            while (rs.next()) {
                Mesto m = new Mesto(rs.getInt("mestoid"), rs.getString("nazivmesta"), null, null);
                Ulica u = new Ulica(rs.getInt("ulicaid"), rs.getString("nazivulice"), null, null, m, upit);
                lista.add(new Adresa(rs.getInt("adresaid"), (UlicaBroj) rs.getObject("broj", map), u, ""));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public void izmeniUlicu(Ulica u, String dodatak) throws SQLException {

        String upit = "UPDATE  ulica SET nazivulice=?" + dodatak + " WHERE ulicaid=? AND mestoid=?";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setString(1, u.getNazivUlice());
        ps.setInt(2, u.getUlicaID());
        ps.setInt(3, u.getMesto().getMestoID());

        ps.execute();

    }

    public void obrisiAdresu(Adresa a) throws SQLException {

        String upit = "DELETE FROM adresa WHERE adresaid=? AND ulicaid=? AND mestoid=?";
        PreparedStatement ps = conn.prepareStatement(upit);
        ps.setInt(1, a.getAdresaID());
        ps.setInt(2, a.getUlica().getUlicaID());
        ps.setInt(3, a.getUlica().getMesto().getMestoID());

        ps.executeUpdate();

    }

    public void izmeniAdresu(Adresa a) throws SQLException {

        String upit = "UPDATE adresa SET broj=? WHERE adresaid=? AND ulicaid=? AND mestoid=?";
        PreparedStatement ps = conn.prepareStatement(upit);
        ps.setObject(1, a.getUlicaBroj());
        ps.setInt(2, a.getAdresaID());
        ps.setInt(3, a.getUlica().getUlicaID());
        ps.setInt(4, a.getUlica().getMesto().getMestoID());

        ps.executeUpdate();

    }

    public ArrayList<Katalog> vratiKataloge() {

        ArrayList<Katalog> lista = new ArrayList<>();
        String upit = "SELECT * FROM katalog k join dobavljac d on k.dobid=d.dobid";

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {
                Dobavljac d = new Dobavljac(rs.getInt("dobid"), rs.getString("nazivdob"), rs.getString("pib"), rs.getString("telefon"), rs.getString("fax"), rs.getString("mail"), null, null, null, null, null, null, null);
                lista.add(new Katalog(rs.getInt("katalogid"), rs.getInt("brojStranica"), null, d, ""));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public ArrayList<StavkaKataloga> vratiStavkeKataloga(Katalog k) {

        ArrayList<StavkaKataloga> lista = new ArrayList<>();
        String upit = "SELECT * FROM stavkakataloga sk join katalog k on sk.katalogid=k.katalogid join dobavljac d on sk.dobid=d.dobid join artikal a on sk.artikalid=a.artikalid join jedinicamere jm on sk.jmid=jm.jmid WHERE sk.katalogid=" + k.getKatalogID();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {
                Dobavljac d = new Dobavljac(rs.getInt("dobid"), rs.getString("nazivdob"), rs.getString("pib"), rs.getString("telefon"), rs.getString("fax"), rs.getString("mail"), null, null, null, null, null, null, null);
                Katalog katalog = new Katalog(rs.getInt("katalogid"), rs.getInt("brojStranica"), null, d, "");
                Artikal a = new Artikal(rs.getInt("artikalid"), rs.getString("nazivartikla"), rs.getString("opisartikla"), null, rs.getDouble("aktuelnacena"));
                JedinicaMere jm = new JedinicaMere(rs.getInt("jmid"), rs.getString("nazivjm"));
                lista.add(new StavkaKataloga(rs.getInt("stavkaid"), rs.getInt("rbstavke"), a, jm, rs.getString("nazivdob"), katalog, ""));

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

    public void obrisiKatalog(Katalog k) throws SQLException {
        String upit = "DELETE FROM katalog WHERE katalogid=" + k.getKatalogID();
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.executeUpdate();

    }

    public int vratiMaxKatalogID() {

        int maxID = 0;

        String upit = "SELECT max(katalogid) as max from katalog";
        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);
            while (rs.next()) {
                maxID = rs.getInt("max");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ++maxID;

    }

    public void izmeniKatalog(Katalog k) throws SQLException {
        String upit = "UPDATE katalog set brojstranica=? WHERE dobid=? AND katalogid=?";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, k.getBrojStranica());
        ps.setInt(2, k.getDobavljac().getDobavljacID());
        ps.setInt(3, k.getKatalogID());

        ps.executeUpdate();
    }

    public void izmeniStavkuKataloga(StavkaKataloga sk) throws SQLException {

        String upit = "UPDATE stavkakataloga SET nazivdob=? WHERE dobid=? AND katalogid=? AND stavkaid=?";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setString(1, sk.getNazivDobavljaca());
        ps.setInt(2, sk.getKatalog().getDobavljac().getDobavljacID());
        ps.setInt(3, sk.getKatalog().getKatalogID());
        ps.setInt(4, sk.getStavkaID());

        ps.executeUpdate();

    }

    public void obrisiStavkuKataloga(StavkaKataloga sk) throws SQLException {

        String upit = "DELETE FROM stavkakataloga WHERE dobid=? AND katalogid=? AND stavkaid=?";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, sk.getKatalog().getDobavljac().getDobavljacID());
        ps.setInt(2, sk.getKatalog().getKatalogID());
        ps.setInt(3, sk.getStavkaID());

        ps.executeUpdate();

    }

    public ArrayList<StavkaPorudzbine> vratiStavkeZaPorudzbinu(Porudzbina p) {
        ArrayList<StavkaPorudzbine> lista = new ArrayList<>();
        String upit = "SELECT * FROM stavkaporudzbine sp join porudzbina p on sp.brporudz=p.brporudz join artikal a on sp.artikalid=a.artikalid join jedinicamere jm on sp.jmid=jm.jmid WHERE sp.brporudz=" + p.getPorudzbinaID();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(upit);

            while (rs.next()) {
                Artikal a = new Artikal(rs.getInt("artikalid"), rs.getString("nazivartikla"), rs.getString("opisartikla"), null, rs.getDouble("aktuelnacena"));
                JedinicaMere jm = new JedinicaMere(rs.getInt("jmid"), rs.getString("nazivjm"));
                Porudzbina por = new Porudzbina(rs.getInt("brporudz"), rs.getString("nacinporudz"), rs.getString("infoporudz"), null, null, null, null, null, null, rs.getDouble("ukupaniznos"), null);
                lista.add(new StavkaPorudzbine(por, rs.getInt("rbstavke"), rs.getInt("kolicina"), a, jm, ""));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public void obrisiStavkuPorudzbine(StavkaPorudzbine sp) throws SQLException {

        String upit = "DELETE FROM stavkaporudzbine WHERE brporudz=? AND rbstavke=?";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, sp.getPorudzbina().getPorudzbinaID());
        ps.setInt(2, sp.getRbStavke());

        ps.executeUpdate();

    }

    public void izmeniStavkuPorudzbine(StavkaPorudzbine sp) throws SQLException {

        String upit = "UPDATE stavkaporudzbine SET kolicina=? WHERE brporudz=? AND rbstavke=?";
        PreparedStatement ps = conn.prepareStatement(upit);

        ps.setInt(1, sp.getKolicina());
        ps.setInt(2, sp.getPorudzbina().getPorudzbinaID());
        ps.setInt(3, sp.getRbStavke());

        ps.executeUpdate();

    }

}
