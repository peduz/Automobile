public class Auto {

    /*
     * CARATTERISTICHE
     */
    private String colore;

    private String marca;

    private int annoImmatricolazione;

    private String modello;

    private String alimentazione;

    private String targa;

    private double kmPercorsi;

    private int proprietariPrecedenti;

    private int numeroPosti;

    private int numeroPorte;

    private double cilindrata;

    // public Auto() {
    //     /*
    //      * Lo scopo del costruttore è inizializzare gli attributi 
    //      * in questo caso (perchè è senza parametri) dando dei 
    //      * valori di default
    //      */
    //     colore = "red";
    // }

    public Auto(String targa) {
        if(targa == null || targa.length() < 7) {
            System.out.println("La targa inserita non è valida");
            this.targa = "NON VALIDA";
        } else {
            this.targa = targa;
        }
    }


    public Auto unisciDueAuto(Auto auto1, Auto auto2) {
        return new Auto("targa");
    }

    public void descriviAuto() {
        System.out.println("L'automobile ha " 
        + numeroPosti + " posti, ha " 
        + numeroPorte + " porte, è " 
        + cilindrata + " di cilindrata,"
        + " e ha come numero di targa: " + targa );
    }

    public void parti() {
        System.out.println("VROOOOOOMMMMMMM");
    }

    public void cambiaColore(String nuovoColore) {
        colore = nuovoColore;
    }

    public String saluta(String nomeDaSalutare) {
        String saluto = "Ciao " + nomeDaSalutare + " sono un'automobile di colore " + colore;
        return saluto;
    }
    /*
     * OVERLOAD
     */
    public String saluta() {
        return "Ciao";
    }

    public String saluta(int numeroVolte) {
        String risultato = "Ciao ";
        for(int i = 0; i < numeroVolte; i++) {
            risultato += "\n " + i + " volte";
        }
        return risultato;
    }

    public String saluta(int numeroVolte, String nomeDaSalutare) {
        String risultato = "Ciao " + nomeDaSalutare + " ";
        for(int i = 0; i < numeroVolte; i++) {
            risultato += "\n " + i + " volte";
        }
        return risultato;
    }


    public String getColore() {
        return colore;
    }


    public String getMarca() {
        return marca;
    }


    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }


    public String getModello() {
        return modello;
    }


    public String getAlimentazione() {
        return alimentazione;
    }


    public String getTarga() {
        return targa;
    }


    public double getKmPercorsi() {
        return kmPercorsi;
    }


    public int getProprietariPrecedenti() {
        return proprietariPrecedenti;
    }


    public int getNumeroPosti() {
        return numeroPosti;
    }


    public int getNumeroPorte() {
        return numeroPorte;
    }


    public double getCilindrata() {
        return cilindrata;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }
    
    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

}
