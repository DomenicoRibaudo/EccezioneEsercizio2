
//Scrivere una funzione che controlli se un carattere è un numero, altrimenti lanciare una eccezione.

public class Main {

    public static void main(String[] args) {
        char carattereTest = '9';
        System.out.println(checkCarattere(carattereTest));
    }

    public static boolean checkCarattere(char carattere) {

        if (Character.isLetter(carattere)) {
            throw new ArithmeticException();
        } else {
            return true;
        }
    }
}
