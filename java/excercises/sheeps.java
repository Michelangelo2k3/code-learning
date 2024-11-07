class Kata {
  //If you can't sleep, just count sheep!!
  //Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
  //Input will always be valid, i.e. no negative integers.
  public static String countingssheeps(int num) {
    String frase = "";
    int counter = 0;
      if (num == 0){
        return "";
      }
      while (counter != num){
        counter++;
        frase += counter+" sheep...";
      }
    return frase; 
  }    
}