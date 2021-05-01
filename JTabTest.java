import java.awt.*;
import javax.swing.*;

public class JTabTest {
    JFrame jf;
    JTabbedPane tabpane;

public JTabTest(String msg){
    jf = new JFrame(msg);
    tabpane = new JTabbedPane();
    JPanel one = new JPanel();
    JPanel two = new JPanel();
    JPanel three = new JPanel();
    one.setBackground(Color.red);
    two.setBackground(Color.green);
    three.setBackground(Color.yellow);
    // Tab의 Panel에 사진 붙이기
    ImageIcon logo = new ImageIcon("../"+"aaaa.gif");
    JLabel label=new JLabel("Help", logo, JLabel.RIGHT);
    label.setFont(new Font(" 굴림", Font.BOLD, 30));
    one.add(label);
    tabpane.addTab("aaaaaaa", one);
    tabpane.addTab("why", two);
    tabpane.addTab("noimage", three);
    jf.getContentPane().add(tabpane,BorderLayout.CENTER);
    jf.setSize(800,800);
    jf.setVisible(true);
    
}
}