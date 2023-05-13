public class CalcUsingAlg3 implements CalcSomething{
    public  static double ap2 = 45.56;
    public  static double ap3 = 102.98;
    public static  float ap4 = 21.9f;


    public double calculate(){

        return ap2 * ap3 / ap4;

    }
    @Override
    public String toString(){
        return getClass().getName();
    }
}
