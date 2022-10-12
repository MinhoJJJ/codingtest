public class Test1 {
	public static void main(String[] args) {
		String a=args[0];
		String b=args[1];
		int ia=Integer.parseInt(a);
		int ib=Integer.parseInt(b);
		if(2<=ia&&ib<=9) {
			for(int j=ia;j<=ib;j++) {
				for(int i=1;i<=9;i++) {
					System.out.println(j+"*"+i+"="+j*i);
				}
			}
		}
	}
}
