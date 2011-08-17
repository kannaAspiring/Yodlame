
package puzzlebyyodlame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class PuzzleByyodlame extends JFrame{
     
    public PuzzleByyodlame(String title){
         this();
         setTitle(title);
     }
   
    public PuzzleByyodlame(){
        
       setSize(400,300);//มีการกำหนดขนาด เพราะว่า frame ที่สร้างขึ้น default มันจะมีขนาดเป็นศุนย์ และไม่สามารถมองเห็นได้
       setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Toolkit kit =Toolkit.getDefaultToolkit();
        Image img = kit.getImage("path file image");
       setIconImage(img);
       
    }

    public static void main(String[] args) {
        PuzzleByyodlame frame = new PuzzleByyodlame("Puzzle Funny");
        frame.setVisible(true);
        
    }
}
