public enum Menu {

    INCOME("Dodaj Przychód"),
    OUTGO("Kolejny Wydatek"),
    STATS("Wyświetl statystyki"),
    SAVE("Zapis danych do pliku"),
    LOAD("Odczyt danych z pliku"),
    EXIT("Wyjście z programu");

    private final String optionDescr;

    Menu(String optionDescr) {
        this.optionDescr = optionDescr;
    }

    public String getOptionDescr() {
        return optionDescr;
    }

    public static void printMenu (){
        Menu[] options = Menu.values();
        for (Menu option : options) {
            System.out.print(option.ordinal()+1 + "-" + option.getOptionDescr() + ", ");
        }
        System.out.println();
    }
//    public  void printOptionDescr (){
//        System.out.println(this.optionDescr);
//    }
}
