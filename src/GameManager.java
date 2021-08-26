
public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" added");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" deleted");
		
	}

}
