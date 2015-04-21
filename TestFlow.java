public class TestFlow{
	public static void main(String args[]){
		System.out.println("test");
		int x = 1;
		int y = 2;
		twoADD(x, y);
		twoMin(x, y);
		twoMax(x, y);
	}
	statis void twoMin(int x, int y){
		if(x<y)
			System.out.println("MIN:"+x);
		else
			System.out.println("MIN:"+y);
	}
}