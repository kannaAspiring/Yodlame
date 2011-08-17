
package puzzlebyyodlame;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;



public class PuzzleByyodlame extends JFrame{
      private Image source;
      private Image image;
      private JLabel label;
      private JPanel centerPanel;
      private JButton button;
      int[][] position;
      int width, height;
       
     
    public PuzzleByyodlame(String title){
         this();
         setTitle(title);
     }
   
    public PuzzleByyodlame(){
           position = new int[][] {
                            {0, 1, 2}, 
                            {3, 4, 5}, 
                            {6, 7, 8},
                        };    
        
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3, 3, 0, 0));
        Toolkit kit = Toolkit.getDefaultToolkit();
        
        Image img = kit.getImage("Image/puzzle_blue.png");
        setIconImage(img);
        
        ImageIcon sid = new ImageIcon(kit.getImage("Image/social.jpg"));
              source = sid.getImage();
              width = sid.getIconWidth();
              height = sid.getIconHeight();
        
        
        
    
//        Icon icon1 = new ImageIcon(img1);     
//        JButton b1 =new JButton(icon1);
//        add(b1);
              
        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.NORTH);    
        add(centerPanel, BorderLayout.CENTER);
        
        for ( int i = 0; i < 3; i++) {
            for ( int j = 0; j < 3; j++) {
                  button = new JButton();
                    //button.addActionListener(this);
                    centerPanel.add(button);
                    image = createImage(new FilteredImageSource(source.getSource(),
                        new CropImageFilter(j*width/3, i*height/3, 
                            (width/3), height/3)));
                    button.setIcon(new ImageIcon(image));  
//                }
                } 
            }  
        
        setSize(width,height);//มีการกำหนดขนาด เพราะว่า frame ที่สร้างขึ้น default มันจะมีขนาดเป็นศุนย์ และไม่สามารถมองเห็นได้
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
    }

}
