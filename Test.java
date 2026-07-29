import java.util.Scanner;


public class Test{
	public static void main(String[] args){
		if (args.length == 0){
			Scanner sc = new Scanner(System.in);
			System.out.println("Ecrivez un nombre");
			if (sc.hasNextInt()){
				int nb = sc.nextInt();
				nb = Integer.valueOf(nb);
				if(nb < 0) System.out.println(nb + " est négatif");
				else if (nb >0) System.out.println(nb + " est positif");
				else System.out.println(nb + " est nul");
				if (nb % 2 == 0)System.out.println(nb + " est pair");
				else System.out.println(nb + " est impair");
			}
			else{
				System.out.println("Erreur : Ce n'est pas un nombre entier valide");
			}
			sc.close();
		}
		else{
			int nb = Integer.parseInt(args[0]);
			nb = Integer.valueOf(nb);
			if(nb < 0) System.out.println(nb + " est négatif");
			else if (nb >0) System.out.println(nb + " est positif");
			else System.out.println(nb + " est nul");
			if (nb % 2 == 0)System.out.println(nb + " est pair");
			else System.out.println(nb + " est impair");
		}
	}
}