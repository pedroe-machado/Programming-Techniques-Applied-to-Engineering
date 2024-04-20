public class FilialMG extends Salario {
    @Override
    public double descVT(double salarioBruto){
        return  0.06 * salarioBruto;

    }

    @Override
    public double descPS(double salarioBruto){
        return 0.02 * salarioBruto;
    }
}
