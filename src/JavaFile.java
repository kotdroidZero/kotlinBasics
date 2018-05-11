
public class JavaFile {
    public static void main(String[] a){
        System.out.println("largets in 9 and 8 is :"+KotlinBasics.getlargest(8,9));

        MyLambda myLambda=()->System.out.println("This is Foo");
    }


    public void greetUs(Greeting greeting){

    }
}

interface MyLambda{
    void foo();
}



interface Greeting{
    void perform();
}