import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class PuzzleByyodlame extends JFrame{
     
    public PuzzleByyodlame(String title){
         this();
         setTitle(title);
     }
   
    public PuzzleByyodlame(){
        
       setSize(400,300);//�ա�á�˹���Ҵ ������� frame ������ҧ��� default �ѹ���բ�Ҵ���ع�� ����������ö�ͧ�����
       setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Toolkit kit =Toolkit.getDefaultToolkit();
        Image img = kit.getImage("path file image");
       setIconImage(img);
       setVisible(true);
    }

    public static void main(String[] args) {
        PuzzleByyodlame frame = new PuzzleByyodlame("Puzzle Funny");
        
        
    }
}