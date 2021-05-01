import java.awt.*;
import javax.swing.*;

public class Jtablet2 {
    public Jtablet2(String msg) {
        JFrame jf = new JFrame(msg);

        String columnName[]={
            "이름", "나이", "메일"
        };

        Object [][] data = {
            {"김김김", new Integer(30), "aa@a"},
            {"김김김2", new Integer(30), "aa@a"},
            {"김김김3", new Integer(30), "aa@a"}
        };

        JTable table = new JTable(data, columnName);
        JScrollPane sp = new JScrollPane(table);
        jf.getContentPane().add(sp, BorderLayout.CENTER);

        jf.setSize(400, 300);
        jf.setVisible(true);
    }
    
}
