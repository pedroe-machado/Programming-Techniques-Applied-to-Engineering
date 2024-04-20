public abstract class Contato {
    private String nome;
    private String endereco;
    private String email;

    public Contato(String nome, String endereco, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public abstract String getDocumento();

    public String toString(){
        
    }
}
