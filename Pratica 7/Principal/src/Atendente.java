public class Atendente {
    
    private int estaraDisponivel;

    public Atendente(){
        estaraDisponivel=0;
    }

    public boolean estaDisponivel(int ts){
        if(ts>=estaraDisponivel) return true;
        return false;
    }

    public void atenderCliente(int ts, int duracaoAtendimento){
        estaraDisponivel = ts + duracaoAtendimento;
    }

}
