
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @see http://stackoverflow.com/questions/7702697
 */
public class JeuView {
	
	private JeuModel jeuModel = new JeuModel();
	private JeuController jeuController = new JeuController();

    private JButton createGridButton(final int row, final int col) {
        final JButton b = new JButton("");
        b.setBackground((int)(Math.random()*2) == 1 ? Color.RED :Color.WHITE);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	
            	jeuController.ChangeColor(row, col, b,jeuModel.getList(),JeuModel.N);
           


			}
        });
        return b;
    }

    private JPanel createGridPanel() {
        JPanel p = new JPanel(new GridLayout(JeuModel.N, JeuModel.N));
        for (int i = 0; i < JeuModel.N * JeuModel.N; i++) {
            int row = i / JeuModel.N;
            int col = i % JeuModel.N;
            JButton gb = createGridButton(row, col);
            jeuModel.getList().add(gb);
            p.add(gb);
        }
        return p;
    }

    public void display() {
        JFrame f = new JFrame("TP");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(createGridPanel());
        f.pack();
        f.setLocationRelativeTo(null);
        f.setSize(500, 500);
        f.setVisible(true);
    }


}