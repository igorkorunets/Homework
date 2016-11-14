public class Converter {
  public static void main(String[] args) {
    String s = "1011011";

    System.out.println(s + "(2) = " + convert(s) + "(10)");
  }
  public static int convert(String binary) {
    int dec = 0;
    int length = binary.length() - 1;

    for(int i = 0; i <= length; i++){
      if(binary.charAt(i) == '1') {
        dec += Math.pow(2, length - i);
      }
    }
    return dec;
  }
}
