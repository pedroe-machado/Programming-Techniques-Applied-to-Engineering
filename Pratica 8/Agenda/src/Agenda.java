import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> agenda;

    public Agenda(){
        agenda = new ArrayList<>();
    }

    public void adicionaContato(String nome, String endereco, String email, String documento, String estadoCivil){ 
        agenda.add(new PessoaFisica(nome, endereco, email, documento, estadoCivil));
    }

    public void adicionaContato(String nome, String endereco, String email, String documento, int inscricaoEstadual){ 
        agenda.add(new PessoaJuridica(nome, endereco, email, documento, inscricaoEstadual));
    }
    
    public Contato removeContato(String documento){
        for (Contato contato : agenda) {
            if (contato.getDocumento.equals(documento)) {
                
            }
        }
    }

    public void imprimeAgenda(){
        for(Contato contato : agenda){
            System.out.println(contato);
        }
    }
}
