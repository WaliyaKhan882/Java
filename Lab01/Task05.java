public class Task05{
    public static void main(String[] args){
        int startingPoint=0,endingPoint=500;
        Task05 num=new Task05();
        num.printArmstrong(startingPoint,endingPoint);
    }
    public void printArmstrong(int start,int end){
        for(int i=start;i<=end;i++){
            boolean found=findArmstrong(i);
            if(found){
                System.out.println(i);
            }
        }
    }
    public static boolean findArmstrong(int num){
        int sum=0;
        int OrigNum=num;
        boolean armstrong=false;
        while(num!=0){
            sum+=Math.pow(num%10,3);
            num=num/10;
        }
        if(sum==OrigNum){
           armstrong=true;
        }
        return armstrong;
    }
}