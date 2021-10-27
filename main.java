public class main {

  public static  void main(String[] args) {
    int myVariable = 15;
    for (int i = 1; i < 20; i++) {
      myVariable = myVariable * i;
      System.out.print(i);
      System.out.print(" ");
      System.out.println(myVariable);
    }
}
}