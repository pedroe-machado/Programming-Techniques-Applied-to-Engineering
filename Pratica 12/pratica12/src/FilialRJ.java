public class FilialRJ extends Salario{
    @Override
    public double descVT(double salarioBruto){
        return 0.08 * salarioBruto;

    }

    @Override
    public double descPS(double salarioBruto){
        return 0.05 * salarioBruto;
    }
}
