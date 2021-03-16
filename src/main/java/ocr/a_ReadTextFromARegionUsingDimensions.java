package ocr;
import org.sikuli.script.OCR;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class a_ReadTextFromARegionUsingDimensions {
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
	@Test
	private void method1UsingTEXT() {
		String mentor1 = s.newRegion(162, 108, (244-162), (122-108)).highlight(2).text();
		System.out.println(mentor1);	// O/p: Mukesh Otwani
	}

	
	
	@Test
	private void method2UsingREADTEXT() {
		String mentor2 = OCR.readText(s.newRegion(162, 108, (244-162), (122-108)).highlight(2));
		System.out.println(mentor2);	// O/p: Mukesh Otwani
		
		
		//	NOTE: SOMETIMES readText() doesn't work. Then we need to use readLine()
	}
	
	
	
	@Test
	private void method3UsingREADLINE() {
		String mentor3 = OCR.readLine(s.newRegion(162, 108, (244-162), (122-108)).highlight(2));
		System.out.println(mentor3);	// O/p: Mukesh Otwani
	}
	
	
	
	
}
