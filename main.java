public class main {
    public static void main(String[] args){

            CalcSomething calc = CalcFactory.getCalculator();
            double result = calc.calculate();

            System.out.println("the result of the calculation is " + result);
    }
}
