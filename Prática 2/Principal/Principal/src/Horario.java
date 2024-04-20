public class Horario{

    int hora;
    int minuto;
    int segundo;

    Horario(int hora, int minuto, int segundo){
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
    }

    Horario(int segundos){
        this.hora=(segundos/3600);
        this.minuto=(segundos%3600)/60;
        this.segundo=(segundos%3600)%60;
    }

    void exibir(){
        System.out.printf("%02dh : %02dm : %02ds\n", hora, minuto, segundo);
    }

}