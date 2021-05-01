import java.awt.*;
import javax.swing.*;

public class Jtablet {
    public Jtablet(String msg) {
        JFrame jf = new JFrame(msg);

        String columnName[]={
            "이름", "전번", "메일"
        };

        String data[][] = {
            {"김김김", "111111111", "aa@a"},
            {"김김김2", "22222222", "aa@a"},
            {"김김김3", "133331", "aa@a"}
        };

        JTable table = new JTable(data, columnName);
        JScrollPane sp = new JScrollPane(table);
        jf.getContentPane().add(sp, BorderLayout.CENTER);

        jf.setSize(400, 400);
        jf.setVisible(true);
    }
    
}
