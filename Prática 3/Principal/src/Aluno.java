public class Aluno {
    
    private String nome;
    private String categoria;
    private int[] notas;
    private int disciplinasCursadas;

    public Aluno(String name, String category, int qtdDisciplinas){
        nome = name;
        categoria = category;
        notas = new int[qtdDisciplinas];
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public float calculaCR() {
        float cr=0;
        for (int index = 0; index < disciplinasCursadas; index++) {
            cr += notas[index];
        }
        return cr/disciplinasCursadas;
    }

    public String situacao(float cra){
        if(categoria.equals("bolsista")){
            if (cra>=75) return "Regular";
            else return "Desligado";
        } else {
            if (cra>=70) return "Regular";
            else return "Desligado";
        }
    }

    public void setNotas(int ultimaNota){
        notas[disciplinasCursadas] = ultimaNota;
        disciplinasCursadas++;
    }

}
