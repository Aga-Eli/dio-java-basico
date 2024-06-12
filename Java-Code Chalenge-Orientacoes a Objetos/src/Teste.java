public class Teste {

    private char tese = 'c';

    public char getTese() {
        return tese;
    }

    public static void main(String[] args) {
        Teste teste = new Teste();

        System.out.println(Character.toUpperCase(teste.getTese()));
    }
}
