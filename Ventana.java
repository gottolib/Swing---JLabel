import javax.swing.*;
import java.awt.Color;
public class Ventana extends JFrame {
	private JLabel label1, label2, label3;
public Ventana()
{
	setLayout(null);
	label1 = new JLabel ();
	label1.setBounds(4,25,150,30);
	label1.setText("TODOS");
	label1.setForeground(Color.ORANGE);
	add(label1);

	label2 = new JLabel ();
	label2.setBounds(4,50,150,30);
	label2.setText("SOMOS");
	label2.setForeground(Color.GREEN);
	add(label2);
	
	label3 = new  JLabel();
	label3.setBounds(4,75,150,30);
	label3.setText("BUENOS PARA ALGO.");
	label3.setForeground(Color.BLUE);
	add(label3);
	}
public static void main (String []ar)
{
	Ventana ventana1 = new Ventana();
	ventana1.setBounds(2,3,400,500);
	ventana1.setResizable(false);
	ventana1.setVisible(true);
	
}
}
