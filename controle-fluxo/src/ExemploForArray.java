public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // For mais arrays
        /*for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x= " + x + " é " + alunos [x]);
        }*/

        // For each
        for(String aluno : alunos){
                System.out.println("Nome do alune é " + aluno);
        }
    }
}
