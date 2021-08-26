
public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+" bought the game "+game.getName());	
	}

}
