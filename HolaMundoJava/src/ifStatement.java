public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
        }else{
            System.out.println("Por favor enciente tu bluetooth para iniciar la transferenia");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
