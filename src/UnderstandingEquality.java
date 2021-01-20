public class UnderstandingEquality {

  public static void main(String[] args) {
    StringBuilder one = new StringBuilder();
    StringBuilder two = new StringBuilder();
    StringBuilder three = one.append("Java");

    System.out.println(one == two);//two totally different objects.
    System.out.println(one == three);//the append method returns the same StringBuilder which is then
    //referenced to three.

    String x = "Java";
    String y = "Java";

    System.out.println(x == y);//Strings are immutable and literals are checked in the String pool
    //so a == b.

    String a = "Java";
    String b = " Java".trim();

    System.out.println(a == b);//prints false because a new String is formed.

    String c = "Java";
    String d = " Ja".trim() + "va";

    System.out.println(c == d);//String d will be created at runtime and will be a new String.
  }
}
