public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        double area = circleArea(3);
        System.out.println(area);

        System.out.println("SOLES A DOLARES: " + converToDolar(4,"PEN"));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4*Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3 * Math.PI * Math.pow(r,3));
    }

    public static double converToDolar(double quantity, String currency){
        //SOLES DOLARES
        switch (currency){
            case "PEN":
                quantity = quantity / 4;
                break;
            case "USD":
                quantity = quantity * 4;
                break;
        }

        return quantity;
    }
}
