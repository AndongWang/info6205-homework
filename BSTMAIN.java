package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class BSTMAIN {
	public static void main(String[] args) {
		BSTSimple<Integer,Integer> bst = new BSTSimple<>();
		for (int cutoff = 10;cutoff<1000;cutoff+=10) {
			Random random = new Random();
			for(int j =0; j<100;j++) {
				int i = random.nextInt();
				int z = random.nextInt(cutoff);
				bst.put(z, i);
			}
		
	
			long startTime = System.nanoTime();
			for( int m = 0; m<=1000;m++) {
				int n = random.nextInt(2);
				if(n==0)
					bst.put(random.nextInt(cutoff), random.nextInt());
				else
					bst.delete(random.nextInt(cutoff));
			}
			long endtime = System.nanoTime();
			long count = endtime-startTime;
			System.out.println("Key range" + cutoff);
			System.out.println(count+"nanosec");
			System.out.println("depth: "+bst.length(bst.root));
			System.out.println();
		}	
	}
}
