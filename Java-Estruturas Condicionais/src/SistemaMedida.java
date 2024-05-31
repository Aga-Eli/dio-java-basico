public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "G";

        String resultado = (sigla == "P") ? "PEQUENO" : (sigla == "M") ? "MEDIO" : (sigla == "G") ? "GRANDE" : "INDEFINIDO";
        System.out.println(resultado);

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");;
        }
    }
}
