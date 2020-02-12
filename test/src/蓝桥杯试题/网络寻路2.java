package À¶ÇÅ±­ÊÔÌâ;

import java.util.ArrayList;
import java.util.Scanner;

public class ÍøÂçÑ°Â·2 {
    public static int N, M;
    public static ArrayList<Integer> temp;
    public static ArrayList<Integer>[] list;
    public static long count = 0;
    
    public void dfs(int start, int father, int step) {
        if(step == 3) {
            if(temp.get(0) != temp.get(2) && temp.get(1) != temp.get(3))
                count++;
            return;
        } else {
            for(int i = 0;i < list[start].size();i++) {
                if(list[start].get(i) == father)
                    continue;
                temp.add(list[start].get(i));
                dfs(list[start].get(i), start, step + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
    	ÍøÂçÑ°Â·2 test = new ÍøÂçÑ°Â·2();
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        list = new ArrayList[N + 1];
        for(int i = 1;i <= N;i++)
            list[i] = new ArrayList<Integer>();
        for(int i = 1;i <= M;i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            list[u].add(v);
            list[v].add(u);
        }
        for(int i = 1;i <= N;i++) {
            temp = new ArrayList<Integer>();
            temp.add(i);
            test.dfs(i, -1, 0);
        }
        System.out.println(count);
    }
    
}