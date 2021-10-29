package fit.challenge;

public class ImcCalculator {
    public static String calculate(double weitgh, double height){
        double result = 0.0;
        result = weitgh /Math.pow(height , 2);
        if (result  < 18.5 ) return "magreza";
        if (result >= 18.5 && result < 24.9 ) return "normal";
        if (result >= 24.9 && result < 30 ) return "Sobrepeso";
        return "Obesidade";

    

    };
    
}
