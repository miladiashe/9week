import java.awt.*;
import javax.swing.*;

public class JTCtest extends JFrame{

    JPanel top, center, bottom, p1, p2, p3, p4;
    JLabel llg, lpw, lnote;
    JTextField login;
    JPasswordField passwd;
    JTextArea note;
    JButton ok;

    public JTCtest(String msg){
        super(msg);

        setLayout(new BorderLayout());


        top = new JPanel();
        top.setLayout(new GridLayout(2,0));
        center = new JPanel();
        bottom = new JPanel();
        p1 = new JPanel();
        p1.setLayout(new GridLayout(0,2));
        p2 = new JPanel();
        p2.setLayout(new GridLayout(0,2));
        p3 = new JPanel();
        p4 = new JPanel();
        p4.setLayout(new GridLayout(0,2));

        llg = new JLabel("Login");
        lpw = new JLabel("pw");
        lnote = new JLabel("press");

        login = new JTextField(30);
        passwd = new JPasswordField(30);

        passwd.setEchoChar('*');

        note = new JTextArea("enter for your opinion", 10, 10);
        ok = new JButton("ok");

        p1.add(llg);
        p1.add(login);
        p2.add(lpw);
        p2.add(passwd);
        p3.add(note);
        p4.add(lnote);
        p4.add(ok);
        top.add(p1);
        top.add(p2);
        center.add(p3);
        bottom.add(p4);

        getContentPane().add(top, "North");

        getContentPane().add(center, "Center");

        getContentPane().add(bottom, "South");

        setSize(300, 400);

        setVisible(true);
    }
}
