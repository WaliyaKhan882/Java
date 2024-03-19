//final keyword

//in inheritance
//error==>Final.java:10: error: cannot inherit from final Class
//public class Final extends Class{
final class Class{
    public void show(){
        System.out.println("Main Class");
    }
}

public class Final extends Class{
    public void show(){
        System.out.println("Derived Class");
    }

    public static void main(String[] args){
        Class f=new Final();
        f.show();
    }
}

//for variables==>value can't be changed
//error ==> error: cannot assign a value to final variable speed

//public class Final{
//    public final int speed=50;
//
//    public Final(int s){
//        speed=s;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public static void main(String[] args){
//        Final f=new Final(5);
//        System.out.println(f.getSpeed());
//    }
//}

//for method/function with final keyword
//class Class{
//    public int speed;
//
//    public Class(int s){
//        speed=s;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public final void show(){
//        System.out.println(getSpeed());
//    }
//}
//
//public class Final extends Class{
//    String Model;
//    public Final(int s,String m){
//        super(s);
//        Model=m;
//    }
//
//    public String getModel() {
//        return Model;
//    }
//
//    public void show(){
//        System.out.println(getSpeed()+getModel());
//    }
//
//    public static void main(String[] args){
//        Class f=new Final(50,"Honda");
//        f.show();
//    }
//}
//erroe==>error: show() in Final cannot override show() in Class
//    public void show(){
//                ^
//  overridden method is final


