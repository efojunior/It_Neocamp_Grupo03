public class OutrasOperacoes implements IOutrasOperacoes{
    double num1, num2;

    public OutrasOperacoes(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    @Override
    public double exponenciacao(){
        return Math.pow(num1, num2);
    }

    @Override
    public double raiz(){
        return Math.sqrt(num1);
    }
    @Override
    public double porcentagem(){
        return num1/100;
    }
}
