import javax.swing.*;

public class ComputeAverageModified {
	public static double computeAverage() { 

		double total_points = 0.0; // 총점 
		int count = 0; // 얼마나 읽었나? 루프 카운터
		boolean processing = true; 
		
		while (processing) {
			// 시험점수를 입력 받는다.
			String input = JOptionPane.showInputDialog
	                         ("Type next exam score:"); 
		   if (input == null) processing = false; // 취소 단추를 누르셨군요
		   else {
			   int score = Integer.parseInt(input);    
				total_points = total_points + score; // 누적 
				count = count + 1; 
				// 진행결과를 인쇄 
				System.out.println("count = " + count + 
		                        "; total = " + total_points);
		   }
			
		}
		if ( count == 0 ) // 처음부터 취소 단추를 누른 경우
			throw new RuntimeException("error: no input supplied");  

		// 결론: total_points == exam_1 + exam_2 + ... + exam_how_many
		return (total_points / count); 
	}
	
	public static void main(String args[]) {
		System.out.println(computeAverage());
	}
}
