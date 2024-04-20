public abstract class Ingredientes extends Sanduiches {
    
    private Sanduiches sanduiche;

    public Ingredientes(Sanduiches sanduiche){
        this.sanduiche = sanduiche;
    }

    public Sanduiches getSanduiche(){
        return sanduiche;
    }
}
