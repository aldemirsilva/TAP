import java.awt.*;
import javax.swing.*;

public class JediAcademy extends JFrame {
	public JediAcademy() {
		super("Jedi Academy v1.0");
		this.setLayout(null);
		this.setSize(260, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		JediAcademy mainWindow = new JediAcademy();
		// Preencha aqui os dados da janela ..
		mainWindow.setVisible(true);
	}
}