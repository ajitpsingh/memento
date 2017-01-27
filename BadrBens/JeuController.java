import java.awt.Color;
import java.util.List;

import javax.swing.JButton;

public class JeuController {

	
	public  void ChangeColor(final int row, final int col, final JButton b,List<JButton> list ,int N) {
		JButton gb = getGridButton(row, col,list,N);
        
        for(int i=0;i<4;i++){
            if(row == i )continue ;

            JButton autherButton = getGridButton(i, col,list,N);
            	
            autherButton .setBackground(autherButton.getBackground() == Color.WHITE ? Color.RED :Color.WHITE);

        }
        
        for(int i=0;i<4;i++){

            JButton autherButton = getGridButton(row, i,list,N);
            	
            autherButton .setBackground(autherButton.getBackground() == Color.WHITE ? Color.RED :Color.WHITE);
        }
	
	}
        
        public JButton getGridButton(int r, int c ,List<JButton> list ,int N) {
            int index = r * N + c;
            return list.get(index);
        }



}
