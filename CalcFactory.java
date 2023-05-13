package PACKAGE_NAME;public class CalcFactory {
   public static CalcSomething getCalculator() {
        //open the configuration file
        int alg = AlgoValueClass.AlgorValue;
        int algoresult=alg % 5;

        if (algoresult > 2 && algoresult < 4)
            return new CalcUsingAlg3();
        else if (algoresult < 2) {
            float p1=AlgoValueClass.PropertyValue1;
            double p2=AlgoValueClass.PropertyValue2;
            return new CalcUsingAlg2(p1, p2);}
         else { return new CalcUsingAl1();

         }


        }

}
