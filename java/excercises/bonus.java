public class Kata{
    //Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean. If bonus is true, the 
    //salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money and must receive only his 
    //stated salary. Return the total figure the individual will receive as a string prefixed with "£" (= "\u00A3", JS, Go, Java, Scala, and Julia), "$" (C#, C++, 
    //Dart, Ruby, Clojure, Elixir, PHP, Python, Haskell, and Lua) or "¥" (Rust).
  public static String bonusTime(final int salary, final boolean bonus) {
    String frase;
    if (bonus == true){return frase =  "£" + salary*10 ;}
    else if (bonus == false){return frase = "£" + salary  ;}
    return null; 
  }
}  