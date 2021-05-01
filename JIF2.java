import javax.swing.*;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class JIF2 {
    JDesktopPane dsk;
    JInternalFrame in1, in2;
    JButton ok;
    public JIF2(String msg){
        JFrame jf = new JFrame(msg);
        dsk = new JDesktopPane();
        in1 = new JInternalFrame("in1", true, true, false, false);

        ok = new JButton("ok");

        in1.getContentPane().add(ok, BorderLayout.SOUTH);

        in1.setSize(200,100);
        in1.setVisible(true);

        in2 = new JInternalFrame("in2", true, true, false, false);
        JPanel jp = new JPanel();

        ImageIcon a = new ImageIcon("aaaa.gif");

        JButton icon = new JButton ("a");
        in2.getContentPane().add(jp, BorderLayout.SOUTH);

        in2.setSize(500,500);
        in2.setVisible(true);

        dsk.add(in1);
        dsk.add(in2);

        jf.getContentPane().add(dsk, BorderLayout.CENTER);

        jf.setSize(1000, 1000);
        jf.setVisible(true);


    }
}
