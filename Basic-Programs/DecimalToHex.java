import java.io.*;
import java.util.*;

public class DecimalToHex {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int decimal = sc.nextInt();
    int rem;
    String hex = "";
    char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    while (decimal > 0) {
      rem = decimal % 16;
      hex = hexchars[rem] + hex;
      decimal = decimal / 16;
    }
    System.out.println(hex);
  }
}