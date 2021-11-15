public class Main {
    public static void main(String[] args) {
        Angajat angajat1 = new PersonalHR("Andreea", "Timisoara, 1", 4500, "Lead");
        Angajat angajat2 = new PersonalHR("Ionut", "Timisoara, 2", 3800, "Senior HR");
        Angajat angajat3 = new PersonalHR("Andrei", "Timisoara, 3", 1500, "Intern");

        Angajat angajat4 = new Manager("Florin S.", "Bucuresti, 55", 10600, "CEO");
        Angajat angajat5 = new Manager("Adrian M..", "Timisoara, 324", 5500, "Manager Timisoara");


        Angajat angajat6 = new PersonalIT("Sorin.", "Timisoara, 324", 6500, "Senior Software Engineer");
        Angajat angajat7 = new PersonalIT("Bogdan", "Timisoara, 324", 1500, "Intern Software Developer");
        Angajat angajat8 = new PersonalIT("Alex", "Timisoara, 324", 3500, "Database Administrator");

        Departament departamentIT = new Departament("Companie IT", "Dezvoltare");
        departamentIT.adaugaAngajat(angajat6);
        departamentIT.adaugaAngajat(angajat7);
        departamentIT.adaugaAngajat(angajat8);

        Departament departamentHR = new Departament("HR", "Logistica");
        departamentHR.adaugaAngajat(angajat1);
        departamentHR.adaugaAngajat(angajat2);
        departamentHR.adaugaAngajat(angajat3);

        Departament departamentManagement = new Departament("Management", "Infrastructura");
        departamentManagement.adaugaAngajat(angajat4);
        departamentManagement.adaugaAngajat(angajat5);

        departamentManagement.adaugaDepartament(departamentHR);
        departamentManagement.adaugaDepartament(departamentIT);

        System.out.println(departamentManagement);
    }
}
