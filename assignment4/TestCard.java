package assignment4;
public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCard card = new TravelCard();
		card.CardNo=4430;
		card.swipeLimit=60;
		card.availableBalance=20000;
		card.rechargeCard(2000);
		card.swipeCard(300);
		System.out.println(card.toString());
		System.out.println(card.rewardPoints(200));

	}

}
