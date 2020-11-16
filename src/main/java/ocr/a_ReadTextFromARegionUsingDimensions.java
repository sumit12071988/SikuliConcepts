package ocr;
import org.sikuli.script.Screen;

public class a_ReadTextFromARegionUsingDimensions {

	public static void main(String[] args) {
		
		Screen s = new Screen();
		
		// 	Step #1: Define a Region using x-Axis, y-Axis, width, height
		//			Width 	= Initial X-axis coordinate - Final X-Axis coordinate which is diagonally opposite to initial X coordinate
		//			Height 	= Initial Y-axis coordinate - Final Y-Axis coordinate which is diagonally opposite to initial Y coordinate
		//
		//	Step #2: Highlight for 1-2 seconds
		//	Step #3: use text() method to fetch data from the Region
		//		
		//		Q: How to Locate x-Axis and y-Axis ?
		//		A: Take snapshot of entire screen --> Copy in mspaint --> Expand the pics to 800% 
		//			--> Draw a border so that element is clearly visible keeping some distance b/w words and border  
		//			--> read the coordinates at the bottom-left corner of the screen to get x and y coordinates clearly
		//
		//		width 	= Difference b/w final x-axis from starting x-axis
		//		height 	= Difference b/e final y-axis from starting y-axis
		String mentor1 = s.newRegion(151, 119,61, 12).highlight(2).text();
		System.out.println(mentor1);	// O/p: Rahul Arora

		String mentor2 = s.newRegion(126, 174, (191-126), (188-174)).highlight(2).text();
		System.out.println(mentor2);	// O/p: Rahul Shetty
		
		String mentor3 = s.newRegion(53, 353, 120-53, 368-353).highlight(2).text();
		System.out.println(mentor3);	// O/p: Experiments
		
	}
	
}
