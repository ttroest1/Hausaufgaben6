package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean compareArraysVal(int[]a,int[]b) {
		int z = 0;
		int x = 0;
		if(a.length==b.length) {
			for(int i = 0; i<a.length;i++) {
				z = 0;
				x = 0;
				for(int j = 0;j<a.length;j++) {
					if(a[i]==b[j]) {
						z+=1;
					}
					if(a[i]==a[j]) {
						x+=1;
					}
				}
				if(x!=z) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
		
	}

}
