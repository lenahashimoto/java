import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class QuestionDialog extends JDialog implements ActionListener {
	
	String answer;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		answer = e.getActionCommand();
		dispose(); //close the dialog
	}

}
