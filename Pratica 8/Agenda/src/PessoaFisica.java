public class PessoaFisica extends Contato{
    private String cpf;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String email, String documento, String estadoCivil){
        super(nome,endereco,email)
        this.cpf = documento;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String getDocumento(){
        return cpf;
    }

    public String getEstadoCivil(){
        return estadoCivil;
    }


}
