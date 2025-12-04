public class BestTimeBuySellStocks2 {
    
	public static void main(String args[]){
	int prices[]={7,1,5,3,6,4};
	System.out.println(BestTimeSellStock(prices));}

	public static int BestTimeSellStock(int[] prices){
		int n=prices.length;
		int Max_profit=0;

		for(int i=0;i<n;i++){

		if(prices[i+1]>prices[i]){
			Max_profit+=prices[i+1]-prices[i];
					}
				}
				return Max_profit;		
			}
}
