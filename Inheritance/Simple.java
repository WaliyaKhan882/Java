public class Simple{
    int a;
    int b;
    int c;

    public void A(int m,int k,int l){
        a = m;
        b = k;
        c = l;
    }
    public static void main(String[] args){
        B b=new B(3,4,5,6);
        b.show();
    }
}

class B extends Simple{
    int d;

    B(int g, int h, int i, int j){
        super.A(g,h,i);
        d=j;
    }
    void show(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}