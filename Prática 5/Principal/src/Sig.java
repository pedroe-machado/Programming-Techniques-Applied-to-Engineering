import java.util.Scanner;
import java.util.HashMap;

public class Sig {
    
    private HashMap<String,Disciplina> disciplinas;
    private Scanner input;
    
    public Sig(){
        disciplinas = new HashMap<>();
        input = new Scanner(System.in);
    }   

    public void executar(){
        int op;        
        do{
            exibirMenu();
            op = Integer.parseInt(input.nextLine());
            executarOpcao(op);

        } while(op!=5); 
    }

    private void exibirMenu(){
        System.out.println("############### MENU ###############");
        System.out.println(" Escolha uma opcao:");
        System.out.println("1. Cadastrar disciplina");
        System.out.println("2. Cadastrar dados de aluno em uma disciplina");
        System.out.println("3. Mostrar diario de disciplina");
        System.out.println("4. Exibir disciplinas cadastradas");
        System.out.println("5. Sair");
    }

    private void executarOpcao(int opcao){
        switch(opcao){
            case 1:
                cadastrarDisciplina();
            break;
            case 2:
                cadastrarAlunoNaDisciplina();
            break;
            case 3:
                mostrarDiario();
            break;
            case 4:
                exibirDisciplinas();
            break;
            case 5: break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private void cadastrarDisciplina(){
        String codigoDisciplina = input.nextLine();
        if(buscaDisciplina(codigoDisciplina)==null) disciplinas.put(codigoDisciplina, new Disciplina(codigoDisciplina));
    }

    private void cadastrarAlunoNaDisciplina(){

        System.out.println("Preencha os campos abaixo");
        System.out.println("Código da disciplina:");
        String code = input.nextLine();

        System.out.println("Nome do Aluno:");
        String nomeAluno = input.nextLine();

        System.out.println("Nota obtida pelo aluno:");
        int notaAluno = Integer.parseInt(input.nextLine());

        System.out.println("Faltas registradas:");
        int faltasAluno = Integer.parseInt(input.nextLine());

        Disciplina d = buscaDisciplina(code);
        if(d!=null) d.adicionarAluno(new Aluno(nomeAluno,notaAluno,faltasAluno));
        else System.out.println("Disciplina não encontrada");
    }

    private Disciplina buscaDisciplina(String codigo){
        return disciplinas.get(codigo);
    }

    private void mostrarDiario(){

        System.out.println("Insira o codigo da disciplina: ");
        Disciplina objDisciplina = buscaDisciplina(input.nextLine());

        if(objDisciplina!=null){ 
            System.out.println("\nDisciplina: " + objDisciplina.getCodigo());
            System.out.printf("%-10s %-12s %-8s %-10s %n","Nome","Nota","Faltas","Situacao");
            
            objDisciplina.ordenarDiario();
            for (Aluno a : objDisciplina.getListaAlunos()){
                System.out.printf("%-10s %-12s %-8s %-10s %n",a.getNome(),a.getNota(),a.getFaltas(),a.getSituacao());
            }
        } else System.out.println("Disciplina não cadastrada");

    }

    public void exibirDisciplinas(){
        System.out.println("Disciplinas cadastradas:");
        for(String d: disciplinas.keySet()){
            System.out.println(d);
        }
    }

}
