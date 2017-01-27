import java.awt.EventQueue;

public class MainRunProgramme {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JeuView().display();
            }
        });
    }
}
