class Lesson9_3 {
  public static void main(String[] args){
    int x = 8;
    int y = 3;
    int z = 20;

    System.out.println(x >= 5 && x <= 10);
    System.out.println(y >= 5 && y <= 10);

    System.out.println(x == 3 || x == 3);
    System.out.println(y == 1 || y == 1);

    x++;
    System.out.println(x);

    System.out.println(x += 10);
    // １８
    System.out.println(z += y);
    // ２３

    x++;
    y--;

    System.out.println(x);
    System.out.println(y);
  }
}