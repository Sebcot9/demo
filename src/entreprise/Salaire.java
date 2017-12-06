
public class Salaire {
	int salaire;
	
	public Salaire(int salaire){
		this.salaire =salaire;
	}
	
	public void versement()
	{
		if(salaire == 1500)
		{
			System.out.println("Vous avez reçu "+salaire+"€. Vous etes payé");
		}
		else if(salaire > 1500)
		{
			System.out.println("Vous avez reçu "+salaire+"€. Vous etes bien payé");
		}
		else
		{
			System.out.println("Vous avez reçu "+salaire+"€. Vous etes sous payé");
		}
	}
}
