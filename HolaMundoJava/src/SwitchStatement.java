public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste LightMode");
                break;
            case "Night":
                System.out.println("Sleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Seleccionas una opción válida");
        }
    }
}
