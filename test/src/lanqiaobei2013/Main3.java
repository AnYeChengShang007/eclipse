package lanqiaobei2013;

public class Main3 {
	static int sum;
	static char[][] cs={{'��','��','��','��','��'},
						{'��','��','��','��','��'},
						{'��','��','��','��','��'},
						{'��','��','��','��','��'}};
	
	public static void main(String[] args) {
		f(0,0,8,"");
		System.out.println(sum/2);
	}
	
	
	
	public static void f(int i,int j,int num,String s) {
		
		
		if(num==0) {
			if(s.equals("�������������л�") ) {
				sum++;
			}
			return;
		}
		if( i>3  || j>4) {
			return;
		}
		s+=cs[i][j];
		
		
		f(i+1,j,num-1,s);
		f(i,j+1,num-1,s);
		
	}
}
