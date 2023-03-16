public interface ITransportable {

    /**
     * Método abstracto 'costeTotal' para que calcule, según el código postal enviado, el precio del envío
     *
     * @param cp (código postal)
     * @return costeTotal (precio por el envío)
     */
    Float costeTotal(Integer cp);
    
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
    Integer tipoEmbalaje(Float dX, Float dY, Float dZ, Float peso);

    /**
     * Variable @param codigoPostal usada para asignar un precio en base al codigo postal
    */ 
    int codigoPostal = 15000;

}