
public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing, Game game) {
		System.out.println(campaing.getName()+" "+game.getName()+" game has 10% discount.");
	}

	@Override
	public void update(Campaing campaing, Game game) {
		System.out.println(campaing.getName()+"The campaign has been updated in the " +game.getName()+" game. There is a 20% discount");
	}

	@Override
	public void delete(Campaing campaing, Game game) {
		System.out.println(campaing.getName()+"deleted");	
	}

}
