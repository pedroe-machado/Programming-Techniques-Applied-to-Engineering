import java.util.Scanner;

public class Prova {
    
    private Questao[] questoes;

    public Prova(){
        questoes = new Questao[5];
        for(int i=0; i<5; i++){
            questoes[i] = new Questao();
        }
    }

    public void aplicar(){
        Scanner entrada = new Scanner(System.in);
        int questaoAtual=0;
        while(questaoAtual<5){
            int tentativas=1;
            System.out.println(questoes[questaoAtual].getEnunciado());
            boolean resultado = questoes[questaoAtual].corrige(entrada.nextInt());
            while(tentativas<2){
                if(resultado) System.out.printf("Você tentou %d vez(es) e acertou a questão", tentativas);
                else {
                    System.out.println("Você ganhou mais uma chance! Digite outra resposta para a questão: \n");
                }
                resultado = questoes[questaoAtual].corrige(entrada.nextInt());
                tentativas++;
            }
        if(!resultado) System.out.println("Você tentou 2 vezes e errou a questão");      
    }
    entrada.close();
    }
}
