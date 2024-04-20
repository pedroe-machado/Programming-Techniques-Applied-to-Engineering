public abstract class Beneficiario {
    private String cpf;
    private String nome;

    public Beneficiario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calculaAposentadoria();

    @Override
    public String toString(){
        return ("Nome: " + nome +"\nCpf: " + cpf + "\nAposentadoria: " + String.format("%.2f", calculaAposentadoria()));
    }

}
