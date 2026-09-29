/*class Excercise1{
     
    public static void main(String[] args) {
        int a=30;
       float b=40.5f;
         char c='a';
        System.out.println(a + ", " + b + ", " + c);
    }
}*/



/*class Excercise1{
void display()
{
System.out.println("this is method");

}

public static void main(String[] args) {
 Excercise1 obj=new Excercise1();
obj.display();

  }

}*/

class Excercise1{
Excercise1(int a ,int b)
{
System.out.println(a+b);

}
Excercise1(int a=30,int b=20){
this.a=a;
this.b=b;
System.out.println(a+b);
}

public static void main(String[] args) {
 Excercise1 obj=new Excercise1(10,20);


  }

}