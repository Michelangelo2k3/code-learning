public class seconds {
  public static void main(String[] args) {
    int segundos_iniciales=500;
    int minutos;
    int segundos_restantes;
    minutos = segundos_iniciales/60;
    segundos_restantes = segundos_iniciales% 60;
    System.out.println(minutos +""+ segundos_restantes);   

  }
}