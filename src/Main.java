public class Main {

    // Interfaz
    static ITransportable tipoTransp;

    public static void main(String[] args) {

        tipoTransp = Factoria_Transporte.getProducto(Factoria_Transporte.CAMION);
        
        System.out.println("El coste total del envío es: " + tipoTransp.costeTotal(10500) + " euros");
        System.out.println(tipoTransp.tipoEmbalaje(70F, 70F, 70F, 45F));


        tipoTransp = Factoria_Transporte.getProducto(Factoria_Transporte.BICI);
        
        System.out.println("El coste total es: " + tipoTransp.costeTotal(16500) + " euros");
        System.out.println(tipoTransp.tipoEmbalaje(20F, 20F, 20F, 3.5F));

    }
}