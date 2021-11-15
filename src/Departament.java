import java.util.ArrayList;

public class Departament {
    private ArrayList<Angajat> angajati;
    private ArrayList<Departament> departamente;

    private String numeDepartament;
    private String categorie;

    Departament(String numeDepartament, String categorie) {
        this.numeDepartament = numeDepartament;
        this.categorie = categorie;
        this.angajati = new ArrayList<>();
        this.departamente = new ArrayList<>();
    }

    public void adaugaAngajat(Angajat angajat) {
        this.angajati.add(angajat);
    }

    public void adaugaDepartament(Departament departament) {
        this.departamente.add(departament);
    }

    @Override
    public String toString() {
        String result = "";

        result += "Departamentul de " + this.categorie + " are ca angajati: \n";
        for (int i = 0; i < this.angajati.size(); i++) {
            result += this.angajati.get(i).toString() + "\n";
        }

        if (this.departamente.size() == 0) {
            result += "Acest departament nu are alte sub-departamente\n";
        } else {
            result += "Cele " + this.departamente.size() + " departamente sunt: \n";
            for (int i = 0; i < this.departamente.size(); i++) {
                result += this.departamente.get(i).toString() + "\n";
            }
        }

        return result;
    }
}
