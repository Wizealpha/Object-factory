public class CalcUsingAlg2 implements CalcSomething{
    private  float prop1;
    private double prop2;

    public  CalcUsingAlg2(float prop1, double prop2){
        this.prop1 = prop1;
        this.prop2 = prop2;
    }


    public double calculate(){
        return  prop1 * prop2;
    }
    @Override
    public String toString(){
        return getClass().getName();
    }
}
