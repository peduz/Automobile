


public class App {
    
    public static void main(String[] args) throws Exception {
        
        // Scanner scan = new Scanner(System.in);
        String ciao = new String("Ciao");
        String pippo;//dichiarata
        pippo = null;//stato di nullità
        pippo = "pippo";//inizializzato con valore
        System.out.println(new String());

        Auto auto1 = new Auto(null);
        auto1.setAlimentazione("Benzina");
        System.out.println(auto1.getColore());

        Auto auto2 = new Auto("");
        auto2.setAlimentazione("Diesel");
        System.out.println("Colore auto 2: " + auto2.getColore());
        // auto2.colore = "blue";
        auto2.cambiaColore("blue");
        System.out.println("Colore auto 2: " + auto2.getColore());
        System.out.println("Colore auto 1: " + auto1.getColore());


        Auto auto3 = new Auto("FG651AE");
        auto3.setCilindrata(1600);
        auto3.setNumeroPosti(5);
        auto3.setNumeroPorte( 5);
        // auto3.targa = "FG651AE";
        System.out.println(auto3.saluta("Giuseppe"));
        auto3.descriviAuto();
        auto3 = null;
        System.gc();
    }
}
