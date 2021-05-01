import java.awt.*;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
public class JIF1 {
    JDesktopPane dsk;
    JInternalFrame in;
    JButton ok;
    public JIF1(String msg) {
        JFrame jf = new JFrame(msg);
        dsk = new JDesktopPane();
        in = new JInternalFrame("in1", true, true, false, false);

        ok = new JButton("ok");

        in.getContentPane().add(ok, BorderLayout.SOUTH);

        in.setSize(200,100);
        in.setVisible(true);
        dsk.add(in);

        jf.getContentPane().add(dsk, BorderLayout.CENTER);

        jf.setSize(300, 200);
        jf.setVisible(true);
    }
}
