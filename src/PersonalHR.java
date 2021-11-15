public class PersonalHR extends Angajat {
    PersonalHR(String numeAngajat, String adresa, float salariu, String rol) {
        super(numeAngajat, adresa, salariu, rol);
    }

    @Override
    public String toString() {
        return "[PersonalHR] " + super.toString();
    }
}
