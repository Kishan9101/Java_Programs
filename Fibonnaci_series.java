package Extra_Programs;

public class Fibonnaci_series {

	public static void main(String[] args) {
		
		int n=100, t1=0, t2=1;
		System.out.println("Fibonnaci series upto " + n + ": ");
		
		while(t1<=n){
			System.out.print(t1 + ",");
			int t3 = t1 + t2;
			t1 = t2;
			t2 = t3;// TODO Auto-generated method stub
		}

	}

}
