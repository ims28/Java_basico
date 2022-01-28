package Java_basico;

public class EjercicioTema2 {

    /* Crear una función que reciba un precio y devuelva ese
     * precio con el IVA incluido.
     */

    public static void main(String[] args) {

        //Le damos un valor a la variable precio
        double precio = 20.95;

        //Le damos un nombre al resultado de la función para llamarla más facilmente con el println
        double precioFinal = damePrecio(precio);
        System.out.println("El precio final del producto con IVA es: " + precioFinal);

    }

    //Creamos una función que admite parámetros, así podemos darle el valor de precio
    static double damePrecio (double precio){
        return precio + (precio * 0.21); //El return de la función es el precio final del producto con el IVA
    }
}


