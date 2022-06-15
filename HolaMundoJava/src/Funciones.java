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

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta USD o PEN
     * @return quantity Devuevle la cantidad actualizada en Dolares
     * */
    public static double converToDolar(double quantity, String currency){
        //SOLES DOLARES
        switch (currency){
            case "PEN":
                quantity = quantity / 4;
                break;
            case "USD":
                quantity = quantity * 1;
                break;
        }

        return quantity;
    }
}
