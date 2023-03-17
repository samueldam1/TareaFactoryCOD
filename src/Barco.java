public class Barco implements ITransportable {

    // Constante literal referente al tipo de embalaje palet
    public static final int PALET = 0;
    // Constante literal referente al tipo de embalaje de carton
    public static final int ENVOLTORIO_CARTON = 1;
    // Constante literal referente al tipo de embalaje de caja de madera
    public static final int CAJA_MADERA = 2;

    /**
     * Metodo que recibe un codigo postal @param cp (codigo postal)
     * Lo compara con otro @param codigoPostal
     * @return Float reference al coste total del envio
     */
    public Float costeTotal(Integer cp) {

        Float precio;

        if (cp < codigoPostal) {

            precio = 40.0F;

        } else {

            precio = 70.0F;

        }

        return precio;
    }

    /**
     * Metodo que recibe las dimensiones de un paquete y su peso
     *
     * @param dimension está formado por la multiplicacion de 3 parametros:
     * @param dX longitud del paquete
     * @param dY altura del paquete
     * @param dZ ancho del paquete
     *
     * @param peso peso del paquete
     *
     * @return Integer que indicará el tipo de embalaje del paquete
     */
    @Override
    public Integer tipoEmbalaje(Float dX, Float dY, Float dZ, Float peso) {

        Float dimension = (dX * dY * dZ);

        if (dimension < 10000 && peso < 5) {

            System.out.println("El embalaje es: PALET");
            return 0;

        } else if (dimension > 10000 && dimension < 30000 && peso > 15) {

            System.out.println("El embalaje es: ENVOLTORIO DE CARTON");
            return 1;

        } else {

            System.out.println("El embalaje es: CADA DE MADERA");
            return 2;

        }

    }
}