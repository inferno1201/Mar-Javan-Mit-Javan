public class BuyAndSellStocks {

    public static int getProfit(int price[]){
        int bp=price[0];
        int profit=0;

        for(int day=1;day<price.length; day++ ){
            profit= Math.max( (price[day]-bp) , profit);
            bp=Math.min( bp , price[day]);
        }
        return profit;
    }

    public static void main(String args[]){
        int arr[]={0,1,5,8,1,7,4};
        int profit=getProfit(arr);
        System.out.println("the max profit is:"+ profit);
    }
}
