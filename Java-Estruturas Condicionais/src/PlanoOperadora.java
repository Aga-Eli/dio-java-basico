public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";
        // Pensa que no switch case, o programa vai direto para o caso true e vai descendo

        switch (plano) {
            case "T":
                System.out.println("5Gb Youtube");
            case "M":
                System.out.println("Whats e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");
        }
    }
}
