
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class Tree2 {
    JTree Tree;
    public Tree2(String msg){
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

        Tree = new JTree(jc);

        JScrollPane sp = new JScrollPane(Tree);

        jf.getContentPane().add(sp, "Center");

        DefaultTreeCellRenderer rr = new DefaultTreeCellRenderer();

        rr.setLeafIcon(new ImageIcon("0n2.gif"));
        rr.setClosedIcon(new ImageIcon("0n23.gif"));
        rr.setOpenIcon(new ImageIcon("0n23.gif"));
        Tree.setCellRenderer(rr);
        Tree.setEditable(true);

        jf.setSize(300,200);
        jf.setVisible(true);

        Tree.addTreeSelectionListener(new TreeSelectionListener(){
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)(e.getPath().getLastPathComponent());
                Object nodeobj= node.getUserObject();

                System.out.println("path = "+e.getPath());
                System.out.println("obj = "+nodeobj);
                
            }
        });
    }
}
