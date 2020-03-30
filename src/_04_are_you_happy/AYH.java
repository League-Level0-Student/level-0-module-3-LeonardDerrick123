package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AYH {
	public static void main(String[] args) {
				String emotions= JOptionPane.showInputDialog("Are you happy");
			if (emotions.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever your doing");
			}
			else {
				JOptionPane.showInputDialog(null, "do you whant to be happy");
				if (emotions.equalsIgnoreCase("yes")) {
					JOptionPane.showMessageDialog(null, "change something");
				}else {
						JOptionPane.showMessageDialog(null,"Keep doing whatever your doing");
					}
					
							
				}
			
		}
}