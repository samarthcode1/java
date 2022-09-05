package class3;

 //@author Java_Programs



public class Class3 {



    public static void main(String[] args) {

        A ob = new A(70f, 80f, 75f);

        System.out.println("Student 1 Per: " +ob.getPercentage());

                

        B obj = new B(70f , 75f , 80f , 70f);

        System.out.println("Student 2 Per: " +obj.getPercentage());

        

    }   

}



abstract class Mark{



    abstract float getPercentage();

}



class A extends Mark{

    float sub1 , sub2 , sub3;

    float per=0;

        

    A(float a , float b, float c){

    sub1 = a;

    sub2 = b;

    sub3 = c;    

    }

    @Override

    public float getPercentage(){

    per = (sub1 + sub2 + sub3 )/300* 100; 

        return per;

    }

}



class B extends Mark{

    float sub1 , sub2 , sub3 , sub4;

    float per=0;

        

    B(float a , float b, float c,float d){

    sub1 = a ;

    sub2 = b;

    sub3 = c;    

    sub4 = d;

    }

    

    @Override

    public float getPercentage(){

    per = (sub1 + sub2 + sub3 + sub4 )/400* 100; 

    

        return per;

    }

}
