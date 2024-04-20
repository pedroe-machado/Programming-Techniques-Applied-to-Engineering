import java.util.Scanner;

public class Menu {

    private Scanner input;
    private Agenda agenda;

    public Menu(){
        input = new Scanner(System.in);
        agenda = new Agenda()
    }

    public void exibirMenu(){
        System.out.println("=======Menu de Opções=======");
        System.out.println("1 - Cadastrar uma pessoa física");
        System.out.println("2 - Cadastrar uma pessoa jurídica");
        System.out.println("3 - Remover um contato");
        System.out.println("4 - Imprimir dados da agenda");
        System.out.println("5 - Sair");
    }
    
    public int executarOpcao(int op){
        switch(op){
            case 1:
                System.out.println("Nome: ");
                String nome = input.nextLine();
                System.out.println("Endereço: ");
                String endereco = input.nextLine();
                System.out.println("Email: ");
                String email = input.nextLine();
                System.out.println("CPF: ");
                String cpf = input.nextLine();
                System.out.println("Estado Civil: ");
                String estadoCivil = input.nextLine();

                agenda.adicionaContato(nome, endereco, email, cpf, estadoCivil);
            return 1;

            case 2:
                System.out.println("Nome: ");
                String nome = input.nextLine();
                System.out.println("Endereço: ");
                String endereco = input.nextLine();
                System.out.println("Email: ");
                String email = input.nextLine();
                System.out.println("CNPJ: ");
                String cnpj = input.nextLine();
                System.out.println("Estado Civil: ");
                int inscricaoEstadual = Integer.parseInt(input.nextLine());

                agenda.adicionaContato(nome, endereco, email, cnpj, inscricaoEstadual);
            return 2;

            case 3:
                System.out.println("Documento: ");
                String documento = input.nextLine();
                agenda.removeContato(documento);
            return 3;

            case 4:
                agenda.imprimeAgenda();
            return 4;

            case 5: return 5;
            default: System.out.println("Opção invalida"); return 0;            
        }
    }

    public void executar(){
        int op = 0;
        do{
            exibirMenu();
            op = executarOpcao(Integer.parseInt(input.nextLine()));
        } while(op!=5);
    }
}
