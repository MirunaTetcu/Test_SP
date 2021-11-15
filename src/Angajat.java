public class Angajat {
    protected String numeAngajat;
    protected String adresa;
    protected float salariu;
    protected String rol;

    Angajat(String numeAngajat, String adresa, float salariu, String rol) {
        this.numeAngajat = numeAngajat;
        this.adresa = adresa;
        this. salariu = salariu;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Angajat " + numeAngajat + ", adresa= " + adresa + ", salariu=" + salariu + ", rol='" + rol;
    }
}
