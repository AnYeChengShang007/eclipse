package lanqiaobei2013;

public class Main3 {
	static int sum;
	static char[][] cs={{'从','我','做','起','振'},
						{'我','做','起','振','兴'},
						{'做','起','振','兴','中'},
						{'起','振','兴','中','华'}};
	
	public static void main(String[] args) {
		f(0,0,8,"");
		System.out.println(sum/2);
	}
	
	
	
	public static void f(int i,int j,int num,String s) {
		
		
		if(num==0) {
			if(s.equals("从我做起振兴中华") ) {
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
