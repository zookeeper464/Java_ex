public class String {
  public static void main(String[] args) {
    String var1 = "Happy Java";
    String var2 = "a"; // String은 큰따옴표를 사용한다.
    String var3 = new String("a");
    String var4 = "a";
    System.out.println(var2.equals(var3));
    System.out.println(var2.equals(var4));
    System.out.println(var2 == var3);
    System.out.println(var2 == var4);
    System.out.println(var1.indexOf("Java"));
    System.out.println(var1.charAt(6));
    System.out.println(var1.replaceAll("Java","World"));
    System.out.println(var1.substring(0,5));
    System.out.println(var1.toUpperCase());

    int number = 10;
    String day = "three";
    System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
  }
}
