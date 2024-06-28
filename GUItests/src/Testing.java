import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Testing{

	
	
	
	public static void main(String[] args) {
		
	
		Random random = new Random();
		int randomColor_Red = random.nextInt(255);
		int randomColor_Green = random.nextInt(255);
		int randomColor_Blue = random.nextInt(255);
		System.out.println(randomColor_Red);
		System.out.println(randomColor_Green);
		System.out.println(randomColor_Blue);
		
		JFrame frame1 = new JFrame();
		
		JTextField textfield = new JTextField();
		textfield.setText("Typesomething");

		JLabel label = new JLabel();
		//label.setText("Red: " + String.valueOf(randomColor_Red) + " " +  "Green: " + String.valueOf(randomColor_Green) + " " + "Blue: " + String.valueOf(randomColor_Blue));
		label.setText("Right-click to close, ctrl-s to save");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Helvetica", Font.PLAIN, 20));
	/*	label.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e){
				System.out.println("Click");
				frame1.dispose();
			}
			
			public void mouseExited(MouseEvent e){
				System.out.println("Mouse Exited");
			}
			
			public void mouseReleased(MouseEvent e){
				System.out.println("Mouse Released");
			}
			
			public void mousePressed(MouseEvent e){
				System.out.println("Mouse Pressed");
			}
			
			public void mouseEntered(MouseEvent e){
				System.out.println("Mouse Entered");
		
			}
		});

*/
		
		
		frame1.getContentPane().setBackground(new Color(randomColor_Red, randomColor_Green, randomColor_Blue));
		frame1.setTitle("MyLittleProgram");	
		frame1.setSize(400, 400);
		frame1.add(label);
		frame1.setVisible(true);

	}
}