public class TestFlow{
	public static void main(String args[]){
		System.out.println("test");
		int x = 1;
		int y = 2;
		twoADD(x, y);
		twoMin(x, y);
		twoMax(x, y);
		System.out.println("JoeyChiou");
	}
<<<<<<< HEAD
	statis void twoMin(int x, int y){
		if(x<y)
			System.out.println("MIN:"+x);
		else
			System.out.println("MIN:"+y);
=======

	static void twoADD(int x, int y){
		System.out.println(x+y);
>>>>>>> 30b10369fd93fcf39fa0590c99dbcd40d91c45eb
	}
}