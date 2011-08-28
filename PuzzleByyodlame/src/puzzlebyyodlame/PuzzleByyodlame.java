package puzzlebyyodlame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.*;
import java.util.*;
import javax.swing.*;

public class PuzzleByyodlame extends  JFrame implements ActionListener{

    private JLabel lblstatus;
    private Image source;
    private Image image;
    private Image ranImage;
    private JLabel label;
    private JPanel centerPanel,panel,lvpanel;
    private JButton button,b1,b2,b3,btn1,btn2,btn3,btn4;
    private byte[] imgByte;
    int[][] position;
    int index;
    int zero = 0;
    int width, height;
    int x,y,z;
    int temp;
    int breaking,count = 0;
    int selectlv;
  
    Random generator = new Random();
    ArrayList lineOfImg = new ArrayList();
    ArrayList Check = new ArrayList();
     
    public PuzzleByyodlame(String title){
            this();
            setTitle(title);
   }
   
    public PuzzleByyodlame(){
            
        position = new int[][] { //3*3
                            {0, 1, 2}, 
                            {3, 4, 5}, 
                            {6, 7, 8}
                      };
             index = 3;

        b1 =new JButton("New Game");
        b2 =new JButton("Help me");
        b3 =new JButton("Reset");      
        
        lblstatus = new JLabel("Start Game(10000)"); 
        
        panel =new JPanel();
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        btn1 =new JButton("Easy"); //300
        btn2 =new JButton("Normal"); //150
        btn3 =new JButton("Hard"); //75
        btn4 =new JButton("Fin"); //75
        
        lvpanel = new JPanel();
        lvpanel.setLayout(new GridLayout(4, 1, 0, 0));
        lvpanel.add(btn1);
        lvpanel.add(btn2);
        lvpanel.add(btn3);
        lvpanel.add(btn4);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

             initComponents();
             //System.out.println(index);
           
       
        //add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.NORTH);    
        add(centerPanel, BorderLayout.CENTER);
        add(lvpanel, BorderLayout.EAST);
        add(lblstatus,BorderLayout.SOUTH); 
        add(panel, BorderLayout.NORTH);
       
        
        for ( int i = 0; i < index; i++) {
            for ( int j = 0; j < index; j++) {
  
                image = createImage(new FilteredImageSource(source.getSource(),
                        new CropImageFilter(j*width/index, i*height/index, 
                            (width/index), height/index)));                   
                    lineOfImg.add(image);
                } 
            }
        
        Check = lineOfImg;       
        temp = lineOfImg.size(); 

        z = generator.nextInt(lineOfImg.size());
        y = lineOfImg.size();
        
       
        RandomPic();
        JOptionPane.showMessageDialog(this, "Please select level for play");
        JOptionPane.showMessageDialog(this, "My default level is Normal");
        JOptionPane.showMessageDialog(this, "Your move is 150 moves");
        //JOptionPane.showMessageDialog(this,setIconImage(image));
        setSize(800,600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);
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
            case 1: ImageIcon sid2 = new ImageIcon(kit.getImage("Image/2.jpg"));
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
            case 9: ImageIcon sid10 = new ImageIcon(kit.getImage("Image/10.jpg"));
                    source = sid10.getImage();
                    width = sid10.getIconWidth();
                    height = sid10.getIconHeight();
                break;
        }
        
        
       
    
    }
          
    public void actionPerformed(ActionEvent e) {
         
        Object source = e.getSource();
        
        selectlv = 2;
        
        if(source == b1){
        int val = JOptionPane.showConfirmDialog(this, "Do you want to new game?", "New Game", JOptionPane.OK_CANCEL_OPTION);
            if(val== JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(this, "Your Pic is Changed.");
            new PuzzleByyodlame("Puzzle Funny.");
            }
        }
        
        else if(source==b2){      
            JOptionPane.showMessageDialog(this, "Help Yourself ^ ^.");
            
        }
        
        else if(source==b3){
            int val2 = JOptionPane.showConfirmDialog(this, "Are you sure?", "Reset", JOptionPane.OK_CANCEL_OPTION);
        if(val2== JOptionPane.OK_OPTION){
         JOptionPane.showMessageDialog(this, "Your Score is :  " + count*50);
        System.exit(0);
        }
        }
        
        else if(source==btn1){
        int val2 = JOptionPane.showConfirmDialog(this, "Are you sure?", "Easy", JOptionPane.OK_CANCEL_OPTION);
        if(val2== JOptionPane.OK_OPTION){
        JOptionPane.showMessageDialog(this,"This is Easy Mode.");
        JOptionPane.showMessageDialog(this,"Your move is 300 moves.");
        selectlv = 1;
        }
        }
        
        else if(source==btn2){
        int val2 = JOptionPane.showConfirmDialog(this, "Are you sure?", "Normal", JOptionPane.OK_CANCEL_OPTION);
        if(val2== JOptionPane.OK_OPTION){
        JOptionPane.showMessageDialog(this,"This is Normal Mode.");
         JOptionPane.showMessageDialog(this,"Your move is 150 moves.");
        selectlv = 2;
        }
        }
        
        else if(source==btn3){
        int val2 = JOptionPane.showConfirmDialog(this, "Are you sure?", "Hard", JOptionPane.OK_CANCEL_OPTION);
        if(val2== JOptionPane.OK_OPTION){
        JOptionPane.showMessageDialog(this,"This is Hard Mode.");
        JOptionPane.showMessageDialog(this,"Your move is 75 moves.");
        selectlv = 3;
        }
        }
       
        else if(source==btn4){
        JOptionPane.showMessageDialog(this,"จบเกมส์จริงหรอ");
        JOptionPane.showMessageDialog(this,"ตรงตำแหน่งหรือยัง");
        JOptionPane.showMessageDialog(this,"ซื่อสัตย์ต่อตนเองนะครับ");
        JOptionPane.showMessageDialog(this,"ห้ามโกงหล่ะ");
        int val2 = JOptionPane.showConfirmDialog(this, "Are you sure?", "Finish", JOptionPane.OK_CANCEL_OPTION);
        if(val2== JOptionPane.OK_OPTION){
        JOptionPane.showMessageDialog(this, "Your Score is :  " + (10000 - (count*50)));
        JOptionPane.showMessageDialog(this,"Congratulation!!");
        int val3 = JOptionPane.showConfirmDialog(this, "Are you want to play again?", "Finish", JOptionPane.OK_CANCEL_OPTION);
            if (val3 == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(this, "As you wish.");
            new PuzzleByyodlame("Puzzle Funny");
            }
            else{
            JOptionPane.showMessageDialog(this,"Thank you for playing.");
            JOptionPane.showMessageDialog(this,"See Ya.");
            System.exit(0);
            }
        }
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
        Check.add(button);
          //System.out.println(buttonIndex);

        if (labelX == buttonX && (labelY - buttonY) == size.height ) {

             int labelIndex = buttonIndex + index;

             centerPanel.remove(buttonIndex);
             centerPanel.add(label, buttonIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.validate();
             count++;
             lblstatus.setText("Count :  " + count);
        }

        if (labelX == buttonX && (labelY - buttonY) == -size.height ) {

             int labelIndex = buttonIndex - index;
             centerPanel.remove(labelIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.add(label, buttonIndex);
             centerPanel.validate();
             count++;
             lblstatus.setText("Count :  " + count);
        }

        if (labelY == buttonY && (labelX - buttonX) == size.width ) {

             int labelIndex = buttonIndex + 1;

             centerPanel.remove(buttonIndex);
             centerPanel.add(label, buttonIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.validate();
             count++;
             lblstatus.setText("Count :  " + count);
        }

        if (labelY == buttonY && (labelX - buttonX) == -size.width ) {

             int labelIndex = buttonIndex - 1;

             centerPanel.remove(buttonIndex);
             centerPanel.add(label, labelIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.validate();
             count++;
             lblstatus.setText("Count :  " + count);
        }
        
           switch(selectlv){
                case 1: if(count == 300){ 
                    JOptionPane.showMessageDialog(this,"Game over.");
                     JOptionPane.showMessageDialog(this, "Your Score is :  " + zero);
                    System.exit(0);
                    }
                break;   
                case 2: if(count == 150){ 
                    JOptionPane.showMessageDialog(this,"Game over.");
                     JOptionPane.showMessageDialog(this, "Your Score is :  " + zero);
                     System.exit(0);
                    }
                break;
                      case 3: if(count == 75){ 
                    JOptionPane.showMessageDialog(this,"Game over");
                     JOptionPane.showMessageDialog(this, "Your Score is :  " + zero);
                     System.exit(0);
                    }
                break;
        }

    }
}