
public class Salaire {
	int salaire;
	
	public Salaire(int salaire){
		this.salaire =salaire;
	}
	
	public void versement()
	{
		if(salaire == 1500)
		{
			System.out.println("Vous avez re�u "+salaire+"�. Vous etes pay�");
		}
		else if(salaire > 1500)
		{
			System.out.println("Vous avez re�u "+salaire+"�. Vous etes bien pay�");
		}
		else
		{
			System.out.println("Vous avez re�u "+salaire+"�. Vous etes sous pay�");
		}
	}
}
