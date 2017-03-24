package calculator;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Style {
    public static int width;
    public static int height;
    
public static void removeBtn(JButton button[]){
    for(int i=0; i < button.length; i++){
        button[i].setBorderPainted(true);
        button[i].setContentAreaFilled(false);
        button[i].setFocusPainted(false);    
    }        
}

public static void windowFullScreen(JFrame frame){
    Toolkit tk = Toolkit.getDefaultToolkit();
    int xsize = (int) tk.getScreenSize().getWidth();
    int ysize = (int) tk.getScreenSize().getHeight();
    frame.setSize(xsize, ysize);
    frame.setUndecorated(true);    
}

public static void resolution() {
    Toolkit tk = Toolkit.getDefaultToolkit();
    width = (int) tk.getScreenSize().getWidth();
    height = (int) tk.getScreenSize().getHeight();
}

}


