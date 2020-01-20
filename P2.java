//wajp to exchange/swap two integers without using third variable & using CLA
/*
class P2{
	public static void main(String args[]){
		int n1,n2;
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		System.out.println("n1= "+ n1 + "n2= "+n2);
		n1 = n1+n2;
		n2 = n1-n2;
		n1 = n1-n2;
		System.out.println("n1= "+ n1 + "n2= "+n2);
	}
}
*/

class P2{
	public static void main(String args[]){
		int n1,n2, n3;
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		System.out.println("n1= "+ n1 + " n2= "+n2);
		n3= n1;
		n1=n2;
		n2= n3;
		System.out.println("n1= "+ n1 + " n2= "+n2);
	}
}