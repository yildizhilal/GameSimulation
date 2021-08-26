
public class GamerManager implements GamerService {
	
	
	public void signIn(Gamer gamer)
	{
		if(GamerCheckManager.checkIfInformationTrue(gamer))
		{
		System.out.println("Gamer registered "+gamer.getFirstName());
		}
	}
	public void logIn(Gamer gamer)	
	{
		if(GamerCheckManager.checkIfInformationTrue(gamer))
		{
		System.out.println("Gamer logged in "+gamer.getFirstName());
		}
	};
	public void deleteAccount(Gamer gamer)
	{
        GamerCheckManager.checkIfInformationTrue(gamer);

	};
	public void updateAccount(Gamer gamer)
	{
		if(GamerCheckManager.checkIfInformationTrue(gamer))
		{
		System.out.println("Gamer has been updated "+gamer.getFirstName());
		}
	};
	

}
