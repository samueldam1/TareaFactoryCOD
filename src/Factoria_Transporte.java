public class Factoria_Transporte {

    // Constante literal que indica que el transporte se efectuará en camión
    public static final int CAMION = 1;
    // Constante literal que indica que el transporte se efectuará en bicicleta
    public static final int BICI = 2;

    // Constante literal que indica que el transporte se efecturá en barco
    public static final int BARCO = 3

    /**
     * Método que devuelve el tipo de transporte usado
     *
     * @param opcion un int que se usará para escoger el tipo de transporte con un Switch case
     * @return un objeto del tipo del transporte elegido
     */
    public static ITransportable getProducto(int opcion) {

        switch (opcion) {

            case CAMION:

                return new Camion();

            case BICI:

                return new Bici();

            case BARCO:

                return new Barco();

            default:
                return null;

        }

    }

}