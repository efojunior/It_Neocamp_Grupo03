public class OperacaoBasica implements IoperacaoBasica{

    private float num1, num2, resultado;
    @Override
    public float Soma(){
       this.resultado=this.num1 + this.num2;
       return resultado;
    }
    @Override
    public float Diminuir(){
        this.resultado=this.num1 - this.num2;
        return resultado;
    }
    @Override
    public float Multiplicar(){
        this.resultado=this.num1 * this.num2;
        return resultado;
    }
    @Override
    public float Dividir(){
        this.resultado=this.num1 / this.num2;
        return resultado;
    }

    public OperacaoBasica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }


}
