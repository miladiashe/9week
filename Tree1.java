import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree1 {
    public Tree1(String msg){
        JFrame jf = new JFrame(msg);
        DefaultMutableTreeNode jc = new DefaultMutableTreeNode("jc");

        DefaultMutableTreeNode jp = new DefaultMutableTreeNode("jp");
        DefaultMutableTreeNode jt = new DefaultMutableTreeNode("jt");
        DefaultMutableTreeNode jn = new DefaultMutableTreeNode("jn");

        jc.add(jp);
        jc.add(jt);
        jc.add(jn);

        DefaultMutableTreeNode jta= new DefaultMutableTreeNode("jta");
        DefaultMutableTreeNode jtf = new DefaultMutableTreeNode("jtf");

        jt.add(jta);
        jt.add(jtf);

        JTree t = new JTree(jc);

        JScrollPane sp = new JScrollPane(t);

        jf.getContentPane().add(sp, BorderLayout.CENTER);

        jf.setSize(300,200);
        jf.setVisible(true);
    }
}
