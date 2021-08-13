import java.util.Scanner;

class Cal_num {
  int i_num;
  double d_num;
  boolean isint = true;
  
  Cal_num(int num) {
    this.i_num = num;
  }
  Cal_num(double num) {
    this.d_num = num;
    this.isint = false;
  }
  
  int Output_i() {
    return this.i_num;
  }
  double Output_d() {
    return this.d_num;
  }
}

class Calculator {
  //덧셈 오버로딩
  int Sum(int fst, int snd) {
    return fst+snd;
  }
  double Sum(int fst, double snd) {
    return fst+snd;
  }
  double Sum(double fst, int snd) {
    return fst+snd;
  }
  double Sum(double fst, double snd) {
    return fst+snd;
  }
  //뺄셈 오버로딩
  int Sub(int fst, int snd) {
    return fst-snd;
  }
  double Sub(int fst, double snd) {
    return fst-snd;
  }
  double Sub(double fst, int snd) {
    return fst-snd;
  }
  double Sub(double fst, double snd) {
    return fst-snd;
  }
  //곱셈 오버로딩
  int Mul(int fst, int snd) {
    return fst*snd;
  }
  double Mul(int fst, double snd) {
    return fst*snd;
  }
  double Mul(double fst, int snd) {
    return fst*snd;
  }
  double Mul(double fst, double snd) {
    return fst*snd;
  }
  //나눗셈 오버로딩
  int Div(int fst, int snd) {
    return fst/snd;
  }
  double Div(int fst, double snd) {
    return fst/snd;
  }
  double Div(double fst, int snd) {
    return fst/snd;
  }
  double Div(double fst, double snd) {
    return fst/snd;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Calculator cal = new Calculator();
    String operator;
    System.out.println("Start the Calculator");
    
    Cal_num fst;
    Cal_num snd;
    String temp_num;
    boolean isint=true;
    
    String restart="Y";
    
    for(;;) {
      if(restart.equals("N")) {
        System.out.println("quit the calculator");
        break;
      }
      for(;;) {
        System.out.println("Please select an operator");
        System.out.println("+,-,*,/");
        operator = scan.next();
        if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) break;
        else {
          System.out.println("Please enter the correct value");
        }
      }
      
      
      System.out.println("Please enter the first number");
      temp_num = scan.next();
      for(int i=0; i<temp_num.length(); i++) {
        if(temp_num.charAt(i) == '.') isint = false; 
      }
      if(isint == false) {
        double temp = Double.parseDouble(temp_num);
        fst = new Cal_num(temp);
      }
      else {
        int temp = Integer.parseInt(temp_num);
        fst = new Cal_num(temp);
      }
      
      isint=true;
      System.out.println("Please enter the second number");
      temp_num = scan.next();
      for(int i=0; i<temp_num.length(); i++) {
        if(temp_num.charAt(i) == '.') isint = false; 
      }
      if(isint == false) {
        double temp = Double.parseDouble(temp_num);
        snd = new Cal_num(temp);
      }
      else {
        int temp = Integer.parseInt(temp_num);
        snd = new Cal_num(temp);
      }
      
      if(operator.equals("+")) {
        System.out.println(cal.Sum(fst.isint? fst.i_num : fst.d_num,snd.isint? snd.i_num : snd.d_num));
      }
      else if(operator.equals("-")) {
        System.out.println(cal.Sub(fst.isint? fst.i_num : fst.d_num,snd.isint? snd.i_num : snd.d_num));
      }
      else if(operator.equals("*")) {
        System.out.println(cal.Mul(fst.isint? fst.i_num : fst.d_num,snd.isint? snd.i_num : snd.d_num));
      }
      else if(operator.equals("/")) {
        System.out.println(cal.Div(fst.isint? fst.i_num : fst.d_num,snd.isint? snd.i_num : snd.d_num));
      }
      else {
        System.out.println("Fail");
      }
      
      System.out.println("Would you like to use more?");
      System.out.println("Y/N");
      restart=scan.next();
    }
  }
}