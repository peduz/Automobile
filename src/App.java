


public class App {
    
    public static void main(String[] args) throws Exception {
        
        // Scanner scan = new Scanner(System.in);
        String ciao = new String("Ciao");
        String pippo;//dichiarata
        pippo = null;//stato di nullità
        pippo = "pippo";//inizializzato con valore
        System.out.println(new String());

        Auto auto1 = new Auto(null);
        auto1.alimentazione = "Benzina";
        System.out.println(auto1.colore);

        Auto auto2 = new Auto("");
        auto2.alimentazione = "Diesel";
        System.out.println("Colore auto 2: " + auto2.colore);
        // auto2.colore = "blue";
        auto2.cambiaColore("blue");
        System.out.println("Colore auto 2: " + auto2.colore);
        System.out.println("Colore auto 1: " + auto1.colore);


        Auto auto3 = new Auto("FG651AE");
        auto3.cilindrata = 1600;
        auto3.numeroPosti = 5;
        auto3.numeroPorte = 5;
        // auto3.targa = "FG651AE";
        System.out.println(auto3.saluta("Giuseppe"));
        auto3.descriviAuto();
        auto3 = null;
        System.gc();
    }
}
