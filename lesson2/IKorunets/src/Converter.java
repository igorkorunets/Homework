public class Converter {
  public static void main(String[] args) {
    String s = "1011011";

    System.out.println(s + "(2) = " + convert(s) + "(10)");
  }
  public static int convert(String binary) {
    int dec = 0;                      //��������� - ���������� �����
    int length = binary.length() - 1; //������ ���. ���������� � �������� �� ���������� �������� � ������� �������,
                                      //������ ��� � ������ ������ ��� ������ charAt ��� ����� ���� �������,
                                      //� ������ ������ ���������� � ����.

    for(int i = 0; i <= length; i++){
      if(binary.charAt(i) == '1') {     //�� ������ �������� ����� charAt �������� ����� �� ������ �� ������� ����� �������,
                                        //� ���� ����� ��������� �������,
        dec += Math.pow(2, length - i); //�� ����� pow �������� ������ �� �������� ���������� length ����� �������� ������� � �������
                                        //� ���������� � ����������
      }
    }
    return dec; //���������� � ���������� ��� ���������
  }
}
