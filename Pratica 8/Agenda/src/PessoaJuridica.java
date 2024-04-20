public class PessoaJuridica extends Contato {
    private String cnpj;
    private int inscricaoEstadual;

    public PessoaJuridica(String nome, String endereco, String email, String documento, int inscricaoEstadual){
        super(nome, endereco, email);
        cnpj = documento;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    @Override
    public String getDocumento(){
        return cnpj;
    }

    public int getInscricao(){
        return inscricaoEstadual;
    }

    public void 
}
