//wajp to exchange/swap two integers without using third variable & using CLA
/* 
// WITHOUT 3RD VARIABLE
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

//WITH 3RD VARIABLE
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

//ERROR INCOMPATIBLE TYPE

/*
class P2{
	public static void main(String args[]){
		int n1,n2, n3;
		n1 = (args[0]);   // as integer asked got string so error
		n2 = (args[1]);   // as integer asked got string so error
		System.out.println("n1= "+ n1 + " n2= "+n2);
		n3= n1;
		n1=n2;
		n2= n3;
		System.out.println("n1= "+ n1 + " n2= "+n2);
	}
}
*/