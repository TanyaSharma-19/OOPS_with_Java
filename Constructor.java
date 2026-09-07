class A{
    int a , b , c;
    A()
    {
        System.out.println("Default");
    }

    A(int a){
        this.a = a;
        System.out.println(a);
    }

    A(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println(a + " " + b);
    }

    A(int a , int b , int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(a+" " + b + " "+c);
    }
}


public class Constructor {

    public static void main(String [] args){
        A obj1 = new A();
        A obj2 = new A(10);
        A obj3 = new A(10 , 20);
        A obj4 = new A(10 , 20,  30);
    }
}
