public class caracteresescape {
    public static void main(String[] args) {
        String texto = "Hola \"Mundo\"";
        // Ponemos slash para que en pantalla se muestren las comillas.
        System.out.println(texto);
        String texto1 = "C:\\Hola \"Mundo\">";
        // Ponemos slash para que en pantalla se muestre la ruta
        System.out.println(texto1);
        String texto2 = "Hola \nMundo";
        // Ponemos (\n) para pasar Mundo a la siguiente línea
        System.out.println(texto2);
        String texto3 = "Hola \tMundo";
        // Ponemos (\t) para hacer un tab en Mundo
        System.out.println(texto3);

    }

}
