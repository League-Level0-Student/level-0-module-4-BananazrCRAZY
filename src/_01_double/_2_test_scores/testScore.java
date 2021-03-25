package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testScore {
	public static void main(String[] args) {
		String p = JOptionPane.showInputDialog("Input Percent Score");
		
		int per = Integer.parseInt(p);
		double percent = (double) per;
		
		if (percent <= 50) {
			JOptionPane.showMessageDialog(null, "Wow get better");
		} else if (percent < 70 && percent > 50) {
			JOptionPane.showMessageDialog(null, "Wow getting better");
		} else if (percent < 80 && percent >= 70) {
			JOptionPane.showMessageDialog(null, "Wow got better");
		} else if (percent < 90 && percent >= 80) {
			JOptionPane.showMessageDialog(null, "Wow better");
		} else if (percent < 100 && percent >= 90) {
			JOptionPane.showMessageDialog(null, "Wow");
		} else if (percent == 100) {
			JOptionPane.showMessageDialog(null, "W");
		} else if (percent > 100) {
			JOptionPane.showMessageDialog(null, "Hacker!!!");
		}
	}
}
