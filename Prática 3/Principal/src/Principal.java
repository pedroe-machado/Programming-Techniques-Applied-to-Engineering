import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.println("Insira a categoria do aluno: ");
        String categoria = entrada.nextLine();

        System.out.println("Entre com a quantidade de disciplinas cursadas: ");
        int qtdDisciplinas = entrada.nextInt();

        Aluno aluno = new Aluno(nome, categoria, qtdDisciplinas);

        for (int index=0; index < qtdDisciplinas; index++){
            System.out.printf("Insira a nota na disciplina %d: ", index);
            aluno.setNotas(entrada.nextInt());
        }
    
        float crFinal = aluno.calculaCR();

        System.out.printf("############### RELATORIO FINAL ###############\n");
        System.out.printf("Nome do aluno: %s\n", nome);
        System.out.printf("Coeficiente de Rendimento: %.02f\n", crFinal);
        System.out.printf("Situacao final: %s\n", aluno.situacao(crFinal));

        entrada.close();
    }
}
