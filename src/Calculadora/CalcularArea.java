public class CalcularArea implements ICalcularArea {
    float num1,num2;

    @Override
    public float AreaTriangulo() {
        return (num1*num2)/2;
    }

    @Override
    public float AreaRetangulo() {
        return num1*num2;
    }

    @Override
    public float AreaCirculo() {
        return (float) (Math.PI * (num1 * num1));
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

    public CalcularArea() {}
}
