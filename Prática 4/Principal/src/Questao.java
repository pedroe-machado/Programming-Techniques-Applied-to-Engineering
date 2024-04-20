import java.util.Random;

public class Questao{
    
    private static int questoesCriadas=0;
    private String enunciado;
    private int idQuestao; 
    private int resposta;

    public Questao(){
        questoesCriadas++;
        Random nRandom = new Random();
        int num1 = nRandom.nextInt(10);
        int num2 = nRandom.nextInt(10);

        idQuestao = questoesCriadas;
        resposta = num1*num2;
        enunciado = ("Questao "+idQuestao+") Quanto é " + num1 + "* " + num2 + "?");
    } 

    public String getEnunciado(){
        return enunciado;
    }

    public boolean corrige(int chute){
        if(chute==resposta) return true;
        return false;
    }

}
