
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @see http://stackoverflow.com/questions/7702697
 */
public class GridButtonPanel {

    private static final int N = 4;
    private final List<JButton> list = new ArrayList<JButton>();

    private JButton getGridButton(int r, int c) {
        int index = r * N + c;
        return list.get(index);
    }

    private JButton createGridButton(final int row, final int col) {
        final JButton b = new JButton("");
        b.setBackground((int)(Math.random()*2) == 1 ? Color.RED :Color.WHITE);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton gb = GridButtonPanel.this.getGridButton(row, col);
                
                for(int i=0;i<4;i++){
                    if(row == i )continue ;

                    JButton autherButton = GridButtonPanel.this.getGridButton(i, col);
                    	
                    autherButton .setBackground(autherButton.getBackground() == Color.WHITE ? Color.RED :Color.WHITE);

                }
                
                for(int i=0;i<4;i++){

                    JButton autherButton = GridButtonPanel.this.getGridButton(row, i);
                    	
                    autherButton .setBackground(autherButton.getBackground() == Color.WHITE ? Color.RED :Color.WHITE);
                }
                
                
                System.out.println("r" + row + ",c" + col
                    + " " + (b == gb)
                    + " " + (b.equals(gb)));
            }
        });
        return b;
    }

    private JPanel createGridPanel() {
        JPanel p = new JPanel(new GridLayout(N, N));
        for (int i = 0; i < N * N; i++) {
            int row = i / N;
            int col = i % N;
            JButton gb = createGridButton(row, col);
            list.add(gb);
            p.add(gb);
        }
        return p;
    }

    private void display() {
        JFrame f = new JFrame("TP");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(createGridPanel());
        f.pack();
        f.setLocationRelativeTo(null);
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GridButtonPanel().display();
            }
        });
    }
}
