
package puzzlebyyodlame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.*;
import java.util.*;
import javax.swing.*;



public class PuzzleByyodlame extends  JFrame implements ActionListener{
     private JMenuBar menuBar; 
     private JMenu fileMenu; 
     private JMenuItem easy; 
     private JMenuItem normal;
     private JMenuItem hard;
     private JMenuItem exitMenu;    
     private JLabel display;
    private Image source;
    private Image image;
    private Image ranImage;
    private JLabel label;
    private JPanel centerPanel;
    private JButton button;
    private byte[] imgByte;
    int[][] position;
    int index,level;
    int width, height;
    int x,y,z;
    int temp;
    int breaking,count = 0;
  
    Random generator = new Random();
    ArrayList lineOfImg = new ArrayList();
    ArrayList Check = new ArrayList();
     
         public PuzzleByyodlame(String title){
            this();
            setTitle(title);
   }
   
    public PuzzleByyodlame(){
           menuBar = new JMenuBar(); 
     
           fileMenu = new JMenu("New Game"); 
           fileMenu.setMnemonic(KeyEvent.VK_F); 
         
           easy = new JMenuItem("Easy", KeyEvent.VK_E); 
           normal = new JMenuItem("Normal",KeyEvent.VK_N);
           hard = new JMenuItem("Hard",KeyEvent.VK_H);
           exitMenu = new JMenuItem("Exit",KeyEvent.VK_X); 
     
           easy.addActionListener(this); 
           normal.addActionListener(this);
           hard.addActionListener(this);
           exitMenu.addActionListener(this);
           
           menuBar.add(fileMenu);            
           fileMenu.add(easy);
           fileMenu.add(normal);
           fileMenu.add(hard);
           fileMenu.add(exitMenu);
           
           setJMenuBar(menuBar);        
                                
            position = new int[][] {
                            {0, 1, 2}, 
                            {3, 4, 5}, 
                            {6, 7, 8}
                                   };
             index = 3;
             initComponents();
             System.out.println(index);
           
       
        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.NORTH);    
        add(centerPanel, BorderLayout.CENTER);
       
        for ( int i = 0; i < index; i++) {
            for ( int j = 0; j < index; j++) {
  
                image = createImage(new FilteredImageSource(source.getSource(),
                        new CropImageFilter(j*width/index, i*height/index, 
                            (width/index), height/index)));                   
                    lineOfImg.add(image);
                } 
            }
        Check = lineOfImg;
        System.out.println(Check.get(0));
        temp = lineOfImg.size(); 
        //lineOfImg.add(null); 
        //System.out.println(lineOfImg.size());
        z = generator.nextInt(lineOfImg.size());
        y = lineOfImg.size();
        
       
        RandomPic();
       
        setSize(width,height);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    public void RandomPic(){
         
        while(breaking != 999){ 
           for ( int i = 0; i < index; i++) {
            for ( int j = 0; j < index; j++) {
                 if(y == lineOfImg.size()) {
                    label = new JLabel("");
                    centerPanel.add(label);
                    lineOfImg.remove(y-1);
                     temp = temp - 1;
                    z = generator.nextInt(temp);
                   }else{
                    button = new JButton();
                    button.addActionListener(this);
                    centerPanel.add(button);
                    ranImage = (Image)lineOfImg.get(z);
                    button.setIcon(new ImageIcon(ranImage));
                    //lineOfImg.add(image); 
                    lineOfImg.remove(z);
                    temp = temp - 1;
                   
                    // System.out.println("temp :"+ temp);
                    
                    if (temp != 0) {
                    z = generator.nextInt(temp);
                    }else{
                    breaking = 999;
                    }
                 }
                } 
            }
        } 
    }

    public void initComponents(){
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(index, index, 0, 0));
        Toolkit kit = Toolkit.getDefaultToolkit();
        
        Image img = kit.getImage("Image/puzzle_blue.png");
        setIconImage(img);

        
        x = generator.nextInt(10);
        
        switch(x){
            case 0: ImageIcon sid = new ImageIcon(kit.getImage("Image/1.jpg"));
                    source = sid.getImage();
                    width = sid.getIconWidth();
                    height = sid.getIconHeight();
                break;
            case 1: ImageIcon sid2 = new ImageIcon(kit.getImage("Image/10.jpg"));
                    source = sid2.getImage();
                    width = sid2.getIconWidth();
                    height = sid2.getIconHeight();
                break;
            case 2: ImageIcon sid3 = new ImageIcon(kit.getImage("Image/3.jpg"));
                    source = sid3.getImage();
                    width = sid3.getIconWidth();
                    height = sid3.getIconHeight();
                break;
            case 3: ImageIcon sid4 = new ImageIcon(kit.getImage("Image/4.jpg"));
                    source = sid4.getImage();
                    width = sid4.getIconWidth();
                    height = sid4.getIconHeight();
                break;
            case 4: ImageIcon sid5 = new ImageIcon(kit.getImage("Image/5.jpg"));
                    source = sid5.getImage();
                    width = sid5.getIconWidth();
                    height = sid5.getIconHeight();
                break;
            case 5: ImageIcon sid6 = new ImageIcon(kit.getImage("Image/6.jpg"));
                    source = sid6.getImage();
                    width = sid6.getIconWidth();
                    height = sid6.getIconHeight();
                break;
            case 6: ImageIcon sid7 = new ImageIcon(kit.getImage("Image/7.jpg"));
                    source = sid7.getImage();
                    width = sid7.getIconWidth();
                    height = sid7.getIconHeight();
                break;
            case 7: ImageIcon sid8 = new ImageIcon(kit.getImage("Image/8.jpg"));
                    source = sid8.getImage();
                    width = sid8.getIconWidth();
                    height = sid8.getIconHeight();
                break;
            case 8: ImageIcon sid9 = new ImageIcon(kit.getImage("Image/9.jpg"));
                    source = sid9.getImage();
                    width = sid9.getIconWidth();
                    height = sid9.getIconHeight();
                break;
            case 9: ImageIcon sid10 = new ImageIcon(kit.getImage("Image/0.jpg"));
                    source = sid10.getImage();
                    width = sid10.getIconWidth();
                    height = sid10.getIconHeight();
                break;
        }
        
        
       
    
    }
        
    
    
     public void actionPerformed(ActionEvent e) {
         
        Object source = e.getSource();
        if(source ==easy)
             System.out.println("Easy");
        else if(source==normal)
            System.out.println("Normal");
        else if(source==hard)
            System.out.println("Hard");
        else if(source==exitMenu){
        int val = JOptionPane.showConfirmDialog(this, "Do you want to exit programe?", "Exit", JOptionPane.OK_CANCEL_OPTION);
        if(val== JOptionPane.OK_OPTION)
        System.exit(0);
}
         
        JButton button = (JButton) e.getSource();
        Dimension size = button.getSize();

        int labelX = label.getX();
        int labelY = label.getY();
        int buttonX = button.getX();
        int buttonY = button.getY();
        int buttonPosX = buttonX / size.width;
        int buttonPosY = buttonY / size.height;
        int buttonIndex = position[buttonPosY][buttonPosX];



        if (labelX == buttonX && (labelY - buttonY) == size.height ) {

             int labelIndex = buttonIndex + index;

             centerPanel.remove(buttonIndex);
             centerPanel.add(label, buttonIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.validate();
             count++;
             System.out.println("Count :  " + count);
        }

        if (labelX == buttonX && (labelY - buttonY) == -size.height ) {

             int labelIndex = buttonIndex - index;
             centerPanel.remove(labelIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.add(label, buttonIndex);
             centerPanel.validate();
             count++;
             System.out.println("Count :  " + count);
        }

        if (labelY == buttonY && (labelX - buttonX) == size.width ) {

             int labelIndex = buttonIndex + 1;

             centerPanel.remove(buttonIndex);
             centerPanel.add(label, buttonIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.validate();
             count++;
             System.out.println("Count :  " + count);
        }

        if (labelY == buttonY && (labelX - buttonX) == -size.width ) {

             int labelIndex = buttonIndex - 1;

             centerPanel.remove(buttonIndex);
             centerPanel.add(label, labelIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.validate();
             count++;
             System.out.println("Count :  " + count);
        }
        

    }
}