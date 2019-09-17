package Project_3;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Data_Records extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    Home_Page homep=new Home_Page();
    JFrame Record=new JFrame("Administratve Page");

    void data(){


        JButton Update=new JButton("Update");
        Update.setBounds(150,365,100,30);

        JButton Delete=new JButton("Delete");
        Delete.setBounds(330,365,100,30);

        JButton Main=new JButton("Home");
        Main.setBounds(230,460,100,30);
        Main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd=e.getActionCommand();
                if(cmd.equals("Home")){
                    Record.dispose();
                    homep.Home.setVisible(true);

                }
            }
        });

        JButton Excel=new JButton("Import to Excel");
        Excel.setBounds(500,650,150,30);
        Record.add(Update);
        Record.add(Delete);
        Record.add(Main);
        Record.add(Excel);
        Record.setSize(800,900);
        Record.setLayout(null);
        Record.setVisible(true);
    }

}
