public class Factoria_Transporte {

    public static final int CAMION = 1;

    public static final int BICI = 2;


    public static ITransportable getProducto(int opcion) {

        switch (opcion) {

            case CAMION:

                return new Camion();

            case BICI:

                return new Bici();

            default:
                return null;

        }

    }
    
}