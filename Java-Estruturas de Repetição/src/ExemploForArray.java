public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int i=0; i<alunos.length; i++){
            System.out.println("O aluno no indice: i = " + i + " é " + alunos[i]);
        }

        for (String aluno : alunos){ // q nem em Python com for aluno in alunos
            System.out.println(aluno);
        }

        // Lembrando que em java, também temos continue e break
        // Lembrando que continue *pula* para a proxima repetição
    }
}
