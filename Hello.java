import java.util.Scanner;


public class Hello{
	public static void main(String[] args){
		System.out.println("bonjour et bienvenu dans mon programme java");
		Scanner sc = new Scanner(System.in);
		System.out.println("quel est votre nom ?");
		String surname = sc.nextLine();
		System.out.println("salut " + surname);
		System.out.println("quel est votre prénom ?");
		String firstname = sc.nextLine();
		System.out.println("bienvenue " + surname + " " + firstname);
	}
}