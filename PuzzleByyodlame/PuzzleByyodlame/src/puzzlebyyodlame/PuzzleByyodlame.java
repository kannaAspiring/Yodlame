
package puzzlebyyodlame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class PuzzleByyodlame extends JFrame{
    //  private Image source;
    //  private Image image;
      int width, height;
       
     
    public PuzzleByyodlame(String title){
         this();
         setTitle(title);
     }
   
    public PuzzleByyodlame(){
            
  
        Toolkit kit = Toolkit.getDefaultToolkit();
    
             
        
        setSize(400,300);//มีการกำหนดขนาด เพราะว่า frame ที่สร้างขึ้น default มันจะมีขนาดเป็นศุนย์ และไม่สามารถมองเห็นได้
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Image img = kit.getImage("Image/puzzle_blue.png");
        setIconImage(img);
       
        Image img1 = kit.getImage("Image/social.jpg");
        Icon icon1 = new ImageIcon(img1);     
        JButton b1 =new JButton(icon1);
        add(b1);
        
    
       
     
                 
       
    }

}
