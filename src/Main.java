
public class Main {

	public static void main(String[] args) {
		
		Game game= new Game(1,"GTA",99.99,"action");
		Gamer gamer= new Gamer(1,"Hilal","deniz","123456",2);
		Campaing campaing=new Campaing(1,"Campaing!","01.09.2021");
		
		GamerManager gamerManager = new GamerManager();
	    gamerManager.signIn(gamer);
	    gamerManager.logIn(gamer);
	    gamerManager.updateAccount(gamer);
	    gamerManager.deleteAccount(gamer);
	    
	    GameManager gameManager=new GameManager();
	    gameManager.add(game);
	    gameManager.delete(game);
	    
	    
	    SaleManager saleManager=new SaleManager();
	    saleManager.sale(game, gamer);
	    
	    CampaingManager campaingManager=new CampaingManager();
	    campaingManager.add(campaing, game);
	    campaingManager.update(campaing, game);
	    campaingManager.delete(campaing, game);
	}
	

}
