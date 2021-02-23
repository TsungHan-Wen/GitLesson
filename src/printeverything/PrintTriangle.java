package printeverything;

import java.util.Scanner;

public class PrintTriangle {
	
	// 印等腰三角形
	/*
	 * 
	 *        *        第1層：1個*
 	 *       ***       第2層：3個*
	 *      *****	        第3層：5個*
	 *     *******     第4層：7個*
	 *    *********    第5層：9個 *
	 */
	
	public static void triangle1 () {
		
		System.out.print("git測試");
		
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入三角形的層數：");
		int layer=input.nextInt();
		
		while (layer<2)
		{
			System.out.print("請輸入三角形的層數(層數為2以上的正整數)：");
			layer=input.nextInt();
		}
			
		
		for (int i=1; i<=layer; i++)    //控制第幾層
		{
			for (int j=1; j<=layer-i; j++) 
				System.out.print(" ");     //印出每層的空白，從中心點往左邊看，以第一層來說，4空白+1*；第二層3空白+2*
			
			for (int k=1; k<=2*i-1; k++)   //印出每層的星號
					System.out.print("*");
			
			System.out.println();
		}
	}
	
	
	// 列印直角三角形，直角在左下
	/*
	 *	 *
	 * 	 **
	 * 	 ***
	 * 	 ****
	 * 	 *****
	 */
	public static void triangle2 (int layer) {
		
		if (layer<2)
			System.out.println("請輸入三角形的層數(層數為2以上的正整數)：");
		
		for (int i=1; i<=layer; i++)    // 控制第幾層
		{
			for (int j=1; j<=i; j++)    // 控制每層要印幾個*
			System.out.print("*");
			
			System.out.println();
		}
	}
	
	// 列印直角三角形，直角在右下
	/*
	 *   	 *
	 * 		**
	 *     ***
	 * 	  ****
	 *	 ***** 
	 */
	
	public static void triangle3 (int layer) {
		
		if (layer<2)
			System.out.println("請輸入三角形的層數(層數為2以上的正整數)：");
		
		for (int i=1; i<=layer; i++)         // 控制第幾層
		{
			for (int j=1; j<=layer-i; j++)   // 每層由左邊要印的空白數目
				System.out.print(" "); 
			for (int k=1; k<=i; k++)         // 每層要印的* 
				System.out.print("*");
			
			System.out.println();
		}
		
	}
	
	// 列印直角三角形，直角在左上
	/*
	 *	 *****
	 *	 ****  
	 * 	 ***
	 * 	 **
	 * 	 *
	 */
	
	public static void triangle4 (int layer) {
		
		if (layer<2)
			System.out.println("請輸入三角形的層數(層數為2以上的正整數)");
		
		for(int i=1; i<=layer; i++)             // 控制第幾層
		{
			for (int j=1; j<=layer-(i-1); j++)  // 每層要印的* 
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	// 列印直角三角形，直角在右上
	/*
	 * 	 *****
	 * 	  ****
	 * 	   ***
	 * 		**
	 * 		 *
	 */
	
	public static void triangle5 (int layer) {
		
		if (layer<2)
			System.out.println("請輸入三角形的層數(層數為2以上的正整數)");
		
		for (int i=1; i<=layer; i++)            // 控制第幾層
		{
			for (int j=1; j<=i-1; j++)          // 每層要印的空白
				System.out.print(" ");
			
			for (int k=1; k<=(layer-i+1); k++)  // 每層要印的*
				System.out.print("*");
		
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		

		
//		triangle1();
//		System.out.println("=================================");
		
//		triangle2(6);
//		System.out.println("=================================");
//		
//		triangle3(5);
//		System.out.println("=================================");
		
		triangle4(5);
		System.out.println("=================================");
		
		triangle5(5);
		System.out.println("=================================");
	}

}
