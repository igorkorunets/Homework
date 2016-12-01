public class Converter {
  public static void main(String[] args) {
    String s = "1011011";

    System.out.println(s + "(2) = " + convert(s) + "(10)");
  }
  public static int convert(String binary) {
    int dec = 0;                      //результат - дес€тичное число
    int length = binary.length() - 1; //вводим доп. переменную и отнимакм от количества символов в стороке единицу,
                                      //потому как в данной задаче дл€ метода charAt нам нужно семь позиций,
                                      //и перва€ должна начинатьс€ с нул€.

    for(int i = 0; i <= length; i++){
      if(binary.charAt(i) == '1') {     //на каждой итерации метод charAt выбирает числа из строки по пор€дку слева направо,
                                        //и если число равн€етс€ единице,
        dec += Math.pow(2, length - i); //то метод pow умножает двойку на значение переменной length минус значение позиции в стороке
                                        //и прибавл€ет к результату
      }
    }
    return dec; //возвращает в вызывающий код результат
  }
}
