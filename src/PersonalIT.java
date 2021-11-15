public class PersonalIT extends Angajat {
    PersonalIT(String numeAngajat, String adresa, float salariu, String rol) {
        super(numeAngajat, adresa, salariu, rol);
    }

    @Override
    public String toString() {
        return "[PersonalIT] " + super.toString();
    }
}
