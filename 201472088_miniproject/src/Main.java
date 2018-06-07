

import javax.swing.JFrame;

public class Main 
{
	public static void main(String[] args) 
	{
		Home homeframe = new Home();
		homeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		homeframe.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		homeframe.setMinimumSize(new java.awt.Dimension(600, 400));
		homeframe.getContentPane().setLayout(null);
		homeframe.setResizable(false);
		homeframe.setLocationRelativeTo(null);
		homeframe.setVisible(true);
		
		
	}
}
