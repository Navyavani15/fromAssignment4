package assignment4;

public class TravelCard extends PrepaidCard implements Rewardable{
	int rewardPoints;
	boolean swipeCard(double amount) {
		// TODO Auto-generated method stub
		
		if(amount>swipeLimit && amount>availableBalance)
			return false;
		else {
			amount = amount * 60;
			this.availableBalance = this.availableBalance - amount - 0.05*amount;
			return true;
		}
	}
	@Override
	public int rewardPoints(double amount) {
		// TODO Auto-generated method stub
		this.rewardPoints = (int) ((amount/100) * 5);
		System.out.print("reward points ");
		return rewardPoints;

}
}