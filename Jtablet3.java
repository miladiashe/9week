import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class Jtablet3 {
    JTable table;

    public Jtablet3(String msg) {
        JFrame jf = new JFrame(msg);
        TableModel M = new TableModel(); 

        //여기 안됨
        table = new JTable(M);

        setUpDeptColumn(table.getColumnModel().getColumn(2));
        jf.getContentPane().add(new JScrollPane(table), "Center");


        jf.setSize(400, 400);
        jf.setVisible(true); 

    }

    public void setUpDeptColumn(TableColumn deptColumn) {
        JComboBox cB = new JComboBox<>();

        cB.addItem("1");
        cB.addItem("2");
        cB.addItem("3");

        deptColumn.setCellEditor(new DefaultCellEditor(cB)); 
        
        DefaultTableCellRenderer rdr = new DefaultTableCellRenderer();

        rdr.setToolTipText("눌러");
        deptColumn.setCellRenderer(rdr);

        TableCellRenderer hdr = deptColumn.getHeaderRenderer();
        if (hdr instanceof DefaultTableCellRenderer){
            ((DefaultTableCellRenderer)hdr).setToolTipText("살");
        }

    }
    
}
