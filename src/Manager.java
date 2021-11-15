public class Manager extends Angajat {
    Manager(String numeAngajat, String adresa, float salariu, String rol) {
        super(numeAngajat, adresa, salariu, rol);
    }

    @Override
    public String toString() {
        return "[Manager] " + super.toString();
    }
}
