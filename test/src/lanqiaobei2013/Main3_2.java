package lanqiaobei2013;

public class Main3_2 {
	static int sum;
	static char[][] cs={{'��','��','��','��','��'},
						{'��','��','��','��','��'},
						{'��','��','��','��','��'},
						{'��','��','��','��','��'}};
	
	public static void main(String[] args) {
		dfs(0,0,8,"");
		System.out.println(sum);
	}
	
	public static void dfs(int i,int j,int num,String s) {
		
		if(i>3 || j>4) {
			return;
		}
		if(num<=0) {
			return;
		}
		
		if(cs[i][j]=='��') {
			if((s+"��").equals("�������������л�")) {
				sum++;
			}
		}
		
		s+=cs[i][j];
		
		dfs(i+1,j,num-1,s);
		dfs(i,j+1,num-1,s);
		
	}
	
}
