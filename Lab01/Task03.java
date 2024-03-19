public class Task03{
    public double payAmount=2000.00, payPeriods=12,annualPay;
    public static void main (String[] args){
        Task03 AP=new Task03();
        AP.annualPay= AP.totalAnnualPay(AP.payAmount,AP.payPeriods);
        System.out.println(AP.annualPay);
    }
    public double totalAnnualPay(double PP,double PA){
        return PP*PA;
    }
}