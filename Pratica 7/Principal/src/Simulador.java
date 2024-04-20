import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Simulador {
    
    private Queue<Cliente> filaClientes;
    private ArrayList<Atendente> listaAtendentes;
    private int numAtendentes;
    private int durSimulacao;

    public Simulador(int nAtend, int durSim){
        numAtendentes = nAtend;
        durSimulacao = durSim;
        gerarFila();
        contrataAtendentes();
    }

    private void gerarFila(){
        filaClientes = new LinkedList<Cliente>();
        
        Random r = new Random();
        int chegada=0, durAtend=1+r.nextInt(7);
        while(chegada+durAtend<100){
            chegada += r.nextInt(4);
            durAtend = 1 + r.nextInt(7);
            Cliente cliente = new Cliente(chegada, durAtend);
            filaClientes.add(cliente);
        }
    }

    private void contrataAtendentes(){
        listaAtendentes = new ArrayList<>(numAtendentes);

        for(int i=0; i<numAtendentes; i++){
            Atendente atend = new Atendente();
            listaAtendentes.add(atend);
        }
    }

    public void simular(){
        for(int ts=0; ts<durSimulacao; ts++){
            for(Atendente at: listaAtendentes){
                if(at.estaDisponivel(ts)){
                    if(filaClientes.size()>0){
                        if(filaClientes.peek().getTempoChegada()<=ts){
                            at.atenderCliente(ts,filaClientes.poll().getDuracaoAtendimento());
                            System.out.println("tempo:"+ts+"  Tem "+filaClientes.size()+" pessoas na fila!");
                        }
                    }
                }
            }
        }
    }


}
