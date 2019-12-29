import java.util.*;


class Main {
  public static void main(String[] args) {
    /*Question #1;
    int num1 = 5;
    double num2 = 10.0;
    printSum(num1, num2);
    printProduct(num1, num2);
    */

   //questionTwo();
   //questionThree();
   //questionFour();
   //questionFive();
   //System.out.println(questionSix());
   //questionSeven();
   //questionEight();

   //questionTwelve();
  }

  public static void printSum(int x, double y){
    System.out.println(x+y);
  }
  public static void printProduct(double x, int y){
    System.out.println(x*y);
  }

  
  public static void questionTwo(){
    int a = 1988;
    int b = 1990;

    String claim = " that the world's athelets " + "completed in Olympic Games in ";
    String s = "It is " + true + claim + a + " but " + false + claim + b + ".";

    System.out.println(s);
  }

  public static void questionThree(){
    int count = 0;
    String[] wordList = {"apple", "banana", "coconut", "lemon", "orange", "pear"};

    for (String word : wordList){
      if (word.indexOf("a") >= 0){
        count++;
      }
    }
    System.out.println(count);
  }

  public static void questionFour(){
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 2, 4, 5));
    for (int k = list.size() - 1; k >= 0; k--){
      if (list.get(k) > k){
        System.out.print(k + " ");
      }
    }
    System.out.println();
  }

  public static void questionFive(){
    int x = 4;
    boolean test = x % 2 == 0;
    if (test){
      System.out.println("YES");

    }
    else{
      System.out.println("NO");
    }
  }

  public static boolean questionSix(){
    int[] textList = {1, 2, 3, 3, 4, 5, 6};
    for (int k = 0; k < textList.length - 1; k++){
      if (textList[k] == textList[k+1]){
        return true;
      }
    }
    return false;
  }

  public static void questionSeven(){
    int x = 7;
    int y = 4;
    boolean a = false;
    boolean b = false;

    if (x > y){
      if (x % y >= 3){
        a = true;
        x -= y;
      }
      else{
        x += y;
      }
    }
    if (x < y){
      if (y % x >= 3){
        b = true;
        x -= y;
      }
      else{
        x += y;
      }
    }
    System.out.println("a: " + a + "\t b: " + b + "\t x:" +x);
  }

  public static void questionEight(){
    ArrayList years = new ArrayList();
    years.add(1);
    years.add("hey");
    years.add(2);
    years.add("there!");
    years.add(3);
    for (int i = 0; i < years.size(); i++){
      if (years.get(i) instanceof String){
        System.out.print("String: ");
      }
      if (years.get(i) instanceof Integer){
        System.out.print("Integer: ");
      }
      System.out.println(years.get(i));
    }
  }
  public static void questionTwelve(){
    String[][] board = new String[5][5];
    for (int row = 0; row < 5; row++){
      for (int col = 0; col < 5; col++){
        board[row][col] = "0";
      }
    }

    for (int val = 0; val < 5; val++){
      if (val % 2 == 1){
        int row = val;
        int col = 0;
        while (col < 5 && row >= 0){
          board[row][col] = "X";
          col++;
          row--;
        }
      }
    }

    for (int i = 0; i < 5; i++){
      System.out.println(Arrays.toString(board[i]));
    }
  }

  
}