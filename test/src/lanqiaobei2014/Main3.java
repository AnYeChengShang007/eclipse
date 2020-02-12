package lanqiaobei2014;

public class Main3 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefghijklmnopqrs");
		String s = "abcdefghijklmnopqrs";
		for(int i=1;i<106;i++) {
			sb.append(s);
		}
		while(sb.length()!=1) {
			int len = sb.length();
			char[] cs = sb.toString().toCharArray();
			sb.delete(0, len);
			for(int i=0;i<cs.length;i++) {
				if(i%2!=0) {
					sb.append(""+cs[i]);
				}
			}
		}
		System.out.println(sb);
		
	}

}
