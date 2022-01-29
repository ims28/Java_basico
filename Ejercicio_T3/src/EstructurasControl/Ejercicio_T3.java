package EstructurasControl;

public class Ejercicio_T3 {
    public static void main(String[] args) {

        /* En este ejercicio tenéis que crear un bucle que permita concatenar textos
         * e imprima el resultado final por consola.
         * Tened en cuenta que los textos pueden venir de un array de tipo String.
         */

        //Creo un array de tipo String con 4 cadenas de texto
        String[] textos = {"Hola.","Cómo","estás","??"};

        //Inicializo la variable concateno
        String concateno = "";

        //Creo un bucle for que recorra el array "textos"
        for (int i = 0; i < textos.length; i++){

            //Hago que la variable concateno vaya sumando las variables del array
            concateno = concateno + " " + textos[i];
            System.out.println(concateno); //Imprimo concateno
        }
    }
}
