public class Task04{
    public static void main(String[] args){
     int totalCustomers=12467,cat1per=14,cat2per=64;
     Task04 customer=new Task04();
     int count1=customer.CustomerCount(totalCustomers,cat1per);
     int count2=customer.CustomerCount(totalCustomers,cat2per);
     System.out.println("Customers in the survey who purchase one or more energy drinks per week are ~ "+count1);
     System.out.println("Customers in the survey who prefer citrus flavored energy drinks are ~ "+count2);
    }
    public int CustomerCount(int TC,int CatPer){
        int count=(TC*CatPer)/100;
        return count;
    }
}