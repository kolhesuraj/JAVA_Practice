package demo;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Gui {
	Gui(){
		JFrame frame = new JFrame("My First GUI");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       JButton button = new JButton("Click me");
	       frame.getContentPane().add(button); // Adds Button to content pane of frame
			frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui obj = new Gui();

	}

}
