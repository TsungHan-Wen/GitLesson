package printeverything;

public class Tree {
	
	// 用方法印出樹，可以用傳入參數控制要印幾層的樹
	
	public static void printTree(int i) {

		for (int m=1; m<=i; m++) {            // 外層for迴圈為目前執行到第幾層(縱向)
			for (int n=1; n<=(i*2-1); n++) {  // 內層for迴圈唯每層印出*的流程(橫向)
				if(n == i) {
					System.out.print("*");
				}
				else if(n >= (i-(m-1)) && n <= (i+(m-1)) ) {  
					System.out.print("*");
				}
				else {
					System.out.print(" ");		
				}
			}
			
			System.out.println();
			
			System.out.println("git測試分支");
		}
				
	}
	
	
	public static void main(String[] args) {
	
		/* 印出下面的樹圖形
		 * 
		 *        *        第1層：1個*
	 	 *       ***       第2層：3個*
		 *      *****	        第3層：5個*
		 *     *******     第4層：7個*
		 *    *********    第5層：9個 *
		 *   ***********   第6層：11個*
		 */
		
		
//		for (int i=1; i<=6; i++) {
//			for (int j=1; j<=11; j++) {
//				if (j == 6) {
//					System.out.print("*");
//				}
//				else if (j>=(6-(i-1)) && j<=(6+(i-1))) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		printTree(20);   // 傳入參數決定要印幾層的樹
		
	}

}
