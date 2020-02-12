package com.fjx.cg;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		Map<String,	List<Integer>> map = new HashMap<String, List<Integer>>();
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			List<Integer> list = map.get(ss[0]);
			if(list!=null) {
				list.add(Integer.parseInt(ss[1]));
			}else {
				list = new LinkedList<Integer>();
				list.add(Integer.parseInt(ss[1]));
				map.put(ss[0], list);
			}
		}
		List<Integer> list = map.get("QBH");
		Integer[] QBH = new Integer[list.size()];
		list.toArray(QBH);
		list = map.get("ZZZ");
		Integer[] ZZZ= new Integer[list.size()];
		list.toArray(ZZZ);
		list = map.get("WJJ");
		Integer[] WJJ= new Integer[list.size()];
		list.toArray(WJJ);
		list = map.get("NZXM");
		Integer[] NZXM= new Integer[list.size()];
		list.toArray(NZXM);
		list = map.get("PPY");
		Integer[] PPY= new Integer[list.size()];
		list.toArray(PPY);
		list = map.get("HCC");
		Integer[] HCC= new Integer[list.size()];
		list.toArray(HCC);
		list = map.get("RYAN");
		Integer[] RYAN= new Integer[list.size()];
		list.toArray(RYAN);
		list = map.get("PPG");
		Integer[] PPG= new Integer[list.size()];
		list.toArray(PPG);
		for(int a=0;a<QBH.length;a++) {
			for(int b=0;b<ZZZ.length;b++) {
				if(((QBH[a]+ZZZ[b])&1)==0) {
					ans+=WJJ.length*NZXM.length*PPY.length*HCC.length*RYAN.length*PPG.length;
					continue;
				}
				for(int c=0;c<WJJ.length;c++) {
					for(int d=0;d<NZXM.length;d++) {
						for(int e=0;e<PPY.length;e++) {
							if(((WJJ[c]+NZXM[d]+PPY[e])&1)==0) {
								ans+=HCC.length*RYAN.length*PPG.length;
								continue;
							}
							for(int f=0;f<HCC.length;f++) {
								if(((ZZZ[b]+HCC[f])&1)==0) {
									ans+=RYAN.length*PPG.length;
									continue;
								}
								for(int g=0;g<RYAN.length;g++) {
									for (int h = 0; h < PPG.length; h++) {
										if(((RYAN[g]+PPG[h])&1)==0) {
											ans++;
											continue;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(ans);
		
	}
	
	

}
