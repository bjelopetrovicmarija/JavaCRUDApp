/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrolor;

import dbbroker.DBBroker;
import forme.FDodajDobavljaca;
import forme.FDodajKatalog;
import forme.FDodajMesto;
import forme.FIzmenaMesta;
import forme.FIzmeniArtikal;
import forme.FIzmeniFakturu;
import forme.FIzmeniKatalog;
import forme.FIzmeniKupca;
import forme.FIzmeniPorudzbinu;
import forme.FIzmeniUlicu;
import forme.FKreirajArtikal;
import forme.FKreirajFakturu;
import forme.FKreirajKupca;
import forme.FKreirajPorudzbinu;
import forme.FKreirajUlicu;
import forme.FRadSaArtiklima;
import forme.FRadSaDobavljacima;
import forme.FRadSaFakturama;
import forme.FRadSaKatalozima;
import forme.FRadSaKupcima;
import forme.FRadSaMestima;
import forme.FRadSaPorudzbinama;
import forme.FRadSaUlicama;
import forme.GlavnaForma;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import model.StavkaKataloga;
import model.StavkaPorudzbine;
import model.TekuciRacun;
import model.Ulica;
import model.Valuta;

/**
 *
 * @author Dell
 */
public class Kontroler {

    private static Kontroler instanca;
    DBBroker db;

    private Kontroler() {
        db = new DBBroker();
    }

    public static Kontroler getInstanca() {
        if (instanca == null) {
            instanca = new Kontroler();
        }
        return instanca;
    }

    public ArrayList<Mesto> vratiMesta() {
        //ArrayList<Mesto> lista = new ArrayList<>();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Mesto> lista = db.vratiMesta();
        db.zatvoriKonekciju();

        return lista;

    }

    public ArrayList<Ulica> vratiUliceZaMesto(Mesto m) {
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Ulica> lista = db.vratiUliceZaMesto(m);
        db.zatvoriKonekciju();

        return lista;

    }

    public boolean obrisiMesto(Mesto mestoZaBrisanje) {
        boolean uspesno = false;
        FRadSaMestima fm = new FRadSaMestima();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.obrisiMesto(mestoZaBrisanje);
            db.commit();
            uspesno = true;
            JOptionPane.showMessageDialog(fm, "Uspesno ste obrisali  zeljeno mesto");

        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fm, ex);
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();
        return uspesno;

    }

    public void izmeniMesto(Mesto m) {
        FRadSaMestima frm = new FRadSaMestima();
        FIzmenaMesta fim = new FIzmenaMesta(frm, true);
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.izmeniMesto(m);
            db.commit();
            JOptionPane.showMessageDialog(frm, "Uspesno ste izmenili mesto");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(frm, "Greska prilikom izmene mesta:" + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();

    }

    public int vratiMaxMestoID() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        int maxID = db.vratiMaxMestoID();
        db.zatvoriKonekciju();

        return maxID;

    }

    public void sacuvajMesto(Mesto m) {
        GlavnaForma gf = new GlavnaForma();
        FDodajMesto fdm = new FDodajMesto(gf, true);
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.sacuvajMesto(m);
            db.commit();
            JOptionPane.showMessageDialog(fdm, "Uspesno sacuvano mesto");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fdm, "Greska prilikom dodavanja novog mesta: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();

    }

    public ArrayList<Dobavljac> vratiDobavljace() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Dobavljac> lista = db.vratiDobavljace();
        db.zatvoriKonekciju();

        return lista;

    }

    public int vratiMaxDobId() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        int maxID = db.vratiMaxDobID();
        db.zatvoriKonekciju();

        return maxID;

    }

    public ArrayList<TekuciRacun> vratiTekuceRacune() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<TekuciRacun> lista = db.vratiTekuceRacune();
        db.zatvoriKonekciju();

        return lista;

    }

    public ArrayList<Delatnost> vratiDelatnosti() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Delatnost> lista = db.vratiDelatnosti();
        db.zatvoriKonekciju();

        return lista;

    }

    public ArrayList<Ulica> vratiUlice() {
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Ulica> lista = db.vratiUlice();
        db.zatvoriKonekciju();

        return lista;
    }

    public ArrayList<Adresa> vratiAdrese() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Adresa> lista = db.vratiAdrese();
        db.zatvoriKonekciju();

        return lista;

    }

    public void sacuvajDobavljaca(Dobavljac dobavljac) {
        FDodajDobavljaca fdd = new FDodajDobavljaca();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.sacuvajDobavljaca(dobavljac);
            db.commit();
            JOptionPane.showMessageDialog(fdd, "Uspesno sacuvan dobavljac");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fdd, ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();

    }

    public int vratiMaxArtikalID() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        int maxID = db.vratiMaxArtikalID();
        db.zatvoriKonekciju();
        return maxID;

    }

    public ArrayList<Valuta> vratiValute() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Valuta> lista = db.vratiValute();
        db.zatvoriKonekciju();

        return lista;

    }

    public void sacuvajArtikal(Artikal artikal) {
        FKreirajArtikal fka = new FKreirajArtikal();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Cena> cene = artikal.getCene();
        try {
            db.sacuvajArtikal(artikal);
            for (Cena c : cene) {

                c.setArtikal(artikal);
                db.sacuvajCenu(c);

            }
            db.commit();
            JOptionPane.showMessageDialog(fka, "Uspesno sacuvan artikal");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fka, "Doslo je do greske prilikom cuvanja artikla: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }

        db.zatvoriKonekciju();

    }

    public ArrayList<NacinIsporuke> vratiNacineIsporuke() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<NacinIsporuke> lista = db.vratiNacineIsporuke();
        db.zatvoriKonekciju();

        return lista;

    }

    public ArrayList<Placanje> vratiPlacanja() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Placanje> lista = db.vratiPlacanja();
        db.zatvoriKonekciju();

        return lista;

    }

    public ArrayList<Datum> vratiDatume() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Datum> lista = db.vratiDatume();
        db.zatvoriKonekciju();

        return lista;

    }

    public ArrayList<Kupac> vratiKupce() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Kupac> lista = db.vratiKupce();
        db.zatvoriKonekciju();

        return lista;

    }

    public ArrayList<Dobavljac> vrati_Dobavljace() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Dobavljac> lista = db.vrati_Dobavljace();
        db.zatvoriKonekciju();

        return lista;

    }

    public int vratiMaxBrojPorudzbine() {
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        int maxID = db.vratiMaxBrojPorudzbine();
        db.zatvoriKonekciju();
        return maxID;

    }

    public ArrayList<Artikal> vratiArtikle() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Artikal> lista = db.vratiArtikle();
        db.zatvoriKonekciju();

        return lista;

    }

    public ArrayList<JedinicaMere> vratiJediniceMere() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<JedinicaMere> lista = db.vratiJediniceMere();
        db.zatvoriKonekciju();

        return lista;

    }

    public void sacuvajPorudzbinu(Porudzbina porudzbina) {
        FKreirajPorudzbinu fkp = new FKreirajPorudzbinu();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<StavkaPorudzbine> stavke = porudzbina.getListaStavki();
        try {
            db.sacuvajPorudzbinu(porudzbina);
            for (StavkaPorudzbine sp : stavke) {
                sp.setPorudzbina(porudzbina);
                db.sacuvajStavkuPorudzbine(sp);

            }
            db.commit();
            JOptionPane.showMessageDialog(fkp, "Uspesno sacuvana porudzbina");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fkp, "Doslo je do greske prilikom cuvanja porudzbine: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();

    }

    public ArrayList<Porudzbina> vratiPorudzbine() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Porudzbina> lista = db.vratiPorudzbine();
        db.zatvoriKonekciju();
        return lista;

    }

    public void obrisiPorudzbinu(Porudzbina p) {
        FRadSaPorudzbinama frp = new FRadSaPorudzbinama();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.obrisiPorudzbinu(p);
            db.commit();
            JOptionPane.showMessageDialog(frp, "Uspesno obrisana porudzbina");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(frp, "Greska prilikom brisanja porudzbine: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();

    }

    public void izmeniPorudzbinu(Porudzbina porudzbina, String dodatak) {
        FIzmeniPorudzbinu fip = new FIzmeniPorudzbinu();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<StavkaPorudzbine> stavke = porudzbina.getListaStavki();
        try {
            db.izmeniPorudzbinu(porudzbina, dodatak);
            if (stavke.size() > 0) {

                for (StavkaPorudzbine sp : stavke) {
                    sp.setPorudzbina(porudzbina);
                    if (sp.getStatus().equals("update")) {
                        db.izmeniStavkuPorudzbine(sp);
                    } else if (sp.getStatus().equals("insert")) {

                        db.sacuvajStavkuPorudzbine(sp);
                    } else if (sp.getStatus().equals("delete")) {
                        db.obrisiStavkuPorudzbine(sp);

                    }

                }

            }
            db.commit();
            JOptionPane.showMessageDialog(fip, "Uspesno izmenjena porudzbina");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fip, "Greska prilikom izmene porudzbine: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();

    }

    public ArrayList<Otpremnica> vratiOtpremnice() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Otpremnica> lista = db.vratiOtpremnice();
        db.zatvoriKonekciju();
        return lista;

    }

    public int vratiBrojFakture() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        int maxID = db.vratiMaxBrojFakture();
        db.zatvoriKonekciju();
        return maxID;

    }

    public void sacuvajFakturu(Faktura faktura) {
        FKreirajFakturu fkf = new FKreirajFakturu();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.sacuvajFakturu(faktura);
            db.commit();
            JOptionPane.showMessageDialog(fkf, "Uspesno sacuvana faktura");
        } catch (Exception ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fkf, "Doslo je do greske prilikom cuvanja fakture: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();

    }

    public ArrayList<Faktura> vratiFakture() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Faktura> lista = db.vratiFakture();
        db.zatvoriKonekciju();
        return lista;

    }

    public void obrisiFakturu(Faktura f) {
        FRadSaFakturama frf = new FRadSaFakturama();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.obrisiFakturu(f);
            db.commit();
            JOptionPane.showMessageDialog(frf, "Uspesno obrisana faktura");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(frf, "Greska prilikom brisanja fakture: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();

    }

    public void izmeniFakturu(Faktura faktura) {
        FRadSaFakturama frf = new FRadSaFakturama();
        FIzmeniFakturu fif = new FIzmeniFakturu(frf, true);
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.izmeniFakturu(faktura);
            db.commit();
            JOptionPane.showMessageDialog(fif, "Uspesno izmenjena faktura");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fif, "Greska prilikom izmene fakture: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();

    }

    public int vratiMaxSifruKupca() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        int maxID = db.vratiMaxSifruKupca();
        db.zatvoriKonekciju();
        return maxID;

    }

    public void sacuvajKupca(Kupac kupac) {
        FKreirajKupca fkk = new FKreirajKupca();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.sacuvajKupca(kupac);
            db.commit();
            JOptionPane.showMessageDialog(fkk, "Uspesno sacuvan kupac");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fkk, "Doslo je do greske prilikom unosa kupca: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();

    }

    public boolean obrisiKupca(Kupac kupac) {
        boolean uspesno = false;
        FRadSaKupcima fkk = new FRadSaKupcima();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.obrisiKupca(kupac);
            db.commit();
            JOptionPane.showMessageDialog(fkk, "Uspesno obrisan kupac");
            uspesno = true;
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fkk, "Doslo je do greske prilikom brisanja kupca: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();
        return uspesno;

    }

    public void izmeniKupca(Kupac kupac) {
        FRadSaKupcima frk = new FRadSaKupcima();
        FIzmeniKupca fik = new FIzmeniKupca(frk, true);
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.izmeniKupca(kupac);
            db.commit();
            JOptionPane.showMessageDialog(fik, "Uspesno izmenjen kupac");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fik, "Doslo je do greske prilikom izmene kupca: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();
    }

    public boolean obrisiDobavljaca(Dobavljac d) {

        boolean uspesno = false;
        FRadSaDobavljacima frd = new FRadSaDobavljacima();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.obrisiDobavljaca(d);
            db.commit();
            JOptionPane.showMessageDialog(frd, "Uspesno obrisan dobavljac");
            uspesno = true;
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(frd, "Doslo je do greske prilikom brisanja dobavljaca: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();
        return uspesno;

    }

    public void izmeniDobavljaca(Dobavljac dobavljac, String dodatak) {
        FRadSaDobavljacima frd = new FRadSaDobavljacima();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.izmeniDobavljaca(dobavljac, dodatak);
            db.commit();
            JOptionPane.showMessageDialog(frd, "Uspesno izmenjen dobavljac");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(frd, "Doslo je do greske prilikom izmene dobavljaca: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();

    }

    public boolean obrisiArtikal(Artikal a) {
        boolean uspesno = false;
        FRadSaArtiklima fra = new FRadSaArtiklima();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.obrisiArtikal(a);
            db.commit();
            JOptionPane.showMessageDialog(fra, "Uspesno obrisan artikal");
            uspesno = true;
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fra, "Doslo je do greske prilikom brisanja artikla: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();
        return uspesno;

    }

    public ArrayList<Cena> vratiCeneZaArtikal(Artikal a) {
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Cena> lista = db.vratiCeneZaArtikal(a);
        db.zatvoriKonekciju();

        return lista;

    }

    public void izmeniArtikal(Artikal artikal) {
        FIzmeniArtikal fia = new FIzmeniArtikal();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Cena> cene = artikal.getCene();
        try {
            db.izmeniArtikal(artikal);
            for (Cena c : cene) {

                c.setArtikal(artikal);
                if (c.getStatus().equals("update")) {
                    db.izmeniCenu(c);
                } else if (c.getStatus().equals("insert")) {

                    db.sacuvajCenu(c);
                } else if (c.getStatus().equals("delete")) {
                    db.obrisiCenu(c);

                }

            }
            db.commit();
            JOptionPane.showMessageDialog(fia, "Uspesno izmenjen artikal");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fia, "Doslo je do greske prilikom izmene artikla: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }

        db.zatvoriKonekciju();

    }

    public ArrayList<Katalog> vratiKataloge() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Katalog> lista = db.vratiKataloge();
        db.zatvoriKonekciju();
        return lista;

    }

    public void sacuvajKatalog(Katalog k) {
        FDodajKatalog fdk = new FDodajKatalog();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<StavkaKataloga> stavke = k.getListaStavki();
        try {
            db.sacuvajKatalog(k);
            for (StavkaKataloga sk : stavke) {
                sk.setKatalog(k);
                db.sacuvajStavkuKataloga(sk);

            }
            db.commit();
            JOptionPane.showMessageDialog(fdk, "Uspesno sacuvan katalog");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fdk, "Doslo je do greske prilikom unosa kataloga: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();
    }

    public void sacuvajUlicu(Ulica ulica) {
        FKreirajUlicu fuk = new FKreirajUlicu();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Adresa> adrese = ulica.getAdrese();
        try {
            db.sacuvajUlicu(ulica);
            for (Adresa a : adrese) {
                a.setUlica(ulica);
                db.sacuvajAdresu(a);
            }
            db.commit();
            JOptionPane.showMessageDialog(fuk, "Uspesno sacuvana ulica");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fuk, "Doslo je do greske prilikom unosa ulice: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();
    }

    public boolean obrisiUlicu(Ulica ulica) {

        boolean uspesno = false;
        FRadSaUlicama fra = new FRadSaUlicama();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.obrisiUlicu(ulica);
            db.commit();
            JOptionPane.showMessageDialog(fra, "Uspesno obrisana ulica");
            uspesno = true;
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fra, "Doslo je do greske prilikom brisanja ulice: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();
        return uspesno;

    }

    public ArrayList<Adresa> vratiAdreseZaUlicu(Ulica ulica) {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Adresa> lista = db.vratiAdreseZaUlicu(ulica);
        db.zatvoriKonekciju();

        return lista;
    }

    public void izmeniUlicu(Ulica u, String dodatak) {
        FIzmeniUlicu fiu = new FIzmeniUlicu();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<Adresa> adrese = u.getAdrese();
        try {
            db.izmeniUlicu(u, dodatak);
            for (Adresa a : adrese) {

                a.setUlica(u);
                if (a.getStatus().equals("update")) {
                    db.izmeniAdresu(a);
                } else if (a.getStatus().equals("insert")) {

                    db.sacuvajAdresu(a);
                } else if (a.getStatus().equals("delete")) {
                    db.obrisiAdresu(a);

                }

            }
            db.commit();
            JOptionPane.showMessageDialog(fiu, "Uspesno izmenjena ulica");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fiu, "Doslo je do greske prilikom izmene ulice: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }

        db.zatvoriKonekciju();
    }

    public ArrayList<StavkaKataloga> vratiStavkeZaKatalog(Katalog k) {
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<StavkaKataloga> lista = db.vratiStavkeKataloga(k);
        db.zatvoriKonekciju();

        return lista;
    }

    public boolean obrisiKatalog(Katalog k) {

        boolean uspesno = false;
        FRadSaKatalozima fkk = new FRadSaKatalozima();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        try {
            db.obrisiKatalog(k);
            db.commit();
            JOptionPane.showMessageDialog(fkk, "Uspesno obrisan katalog");
            uspesno = true;
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fkk, "Doslo je do greske prilikom brisanja kataloga: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.zatvoriKonekciju();
        return uspesno;

    }

    public int vratiMaxKatalogID() {

        db.ucitajDrajver();
        db.uspostaviKonekciju();
        int maxID = db.vratiMaxKatalogID();
        db.zatvoriKonekciju();

        return maxID;

    }

    public void izmeniKatalog(Katalog k) {

        FIzmeniKatalog fik = new FIzmeniKatalog();
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<StavkaKataloga> stavke = k.getListaStavki();
        try {
            db.izmeniKatalog(k);
            for (StavkaKataloga sk : stavke) {

                sk.setKatalog(k);
                if (sk.getStatus().equals("update")) {
                    db.izmeniStavkuKataloga(sk);
                } else if (sk.getStatus().equals("insert")) {

                    db.sacuvajStavkuKataloga(sk);
                } else if (sk.getStatus().equals("delete")) {
                    db.obrisiStavkuKataloga(sk);

                }

            }
            db.commit();
            JOptionPane.showMessageDialog(fik, "Uspesno izmenjen katalog");
        } catch (SQLException ex) {
            db.rollback();
            JOptionPane.showMessageDialog(fik, "Doslo je do greske prilikom izmene kataloga: " + ex.getMessage());
            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
        }

        db.zatvoriKonekciju();

    }

    public ArrayList<StavkaPorudzbine> vratiStavkeZaPorudzbinu(Porudzbina p) {
        db.ucitajDrajver();
        db.uspostaviKonekciju();
        ArrayList<StavkaPorudzbine> lista = db.vratiStavkeZaPorudzbinu(p);
        db.zatvoriKonekciju();
        return lista;

    }

}
