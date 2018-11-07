import javax.swing.*;

public class ComputeAverage {
	public static double computeAverage(int how_many) { 

		double total_points = 0.0; // 총점 
		int count = 0; // 얼마나 읽었나? 루프 카운터
		while (count < how_many) 
			
		// 매 반복마다 다음을 만족한다. 루프 불변식 (loop invariant)
		//   total_score == exam_1 + exam_2 + ... + exam_count
		{
			// 시험점수를 입력 받는다.
			String input = JOptionPane.showInputDialog
	                         ("Type next exam score:"); 
			int score = Integer.parseInt(input);    
			total_points = total_points + score; // 누적 
			count = count + 1; 
			// 진행결과를 인쇄 
			System.out.println("count = " + count + 
	                        "; total = " + total_points);
		} 
		// 결론: total_points == exam_1 + exam_2 + ... + exam_how_many
		return (total_points / how_many); 
	}
	
	public static void main(String args[]) {
//		System.out.println(computeAverage(3));
//		System.out.println(computeAverage(-1));
		System.out.println(computeAverage(0));
	}
}
