package DSA;


public class Main {
static int linearSearchExample (int[] data, int key) {
  for (int index = 0; index < data.length; index++) {
    if (data[index] == key){ return index;}

  }
  return -1;
}
  public static void main(String[] args) {
// System.out.println("What is your name? ");
// Scanner scanner = new Scanner (System.in);
// String name  = scanner.nextLine();
// System.out.println("How old are you?");
// int age  = scanner.nextInt();
// System.out.println("What is your height?");
// Double height = scanner.nextDouble();

// System.out.println(sign); 

//     System.out.println("Your name is " + name + " ,and you are " + age + " years old" + " and you are " + height);

//      scanner.close();
int[] checker = {1,2,3,4,5}; 

System.out.println (linearSearchExample (checker ,3 ));


}

}

  
