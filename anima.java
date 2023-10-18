public class ani{
      void animal(){
        System.out.print("Animals..");
    }

}
public class dog2 extends ani{
    void dog(){
        System.out.println("Dog 69");
    }
}
public class cat1 extends ani{
    void cat(){
        System.out.println("Cat 47");
    }
}
public class anima {
    public static void main(String[] args) { 
        cat1 foo = new cat1();
        dog2 foo1 = new dog2();
        foo.cat();
        foo1.dog();
    }


}

