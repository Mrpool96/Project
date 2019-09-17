package Project_3;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.text.SimpleAttributeSet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home_Page extends JFrame implements ActionListener {
    static JFrame Home=new JFrame("Welcome to Home Page");
    public static void main(String[] args) {
        Enquiry Inq=new Enquiry();
        Admission Eddm=new Admission();
        Data_Records datarec=new Data_Records();
        Login_Frame login_frame=new Login_Frame();
        JMenuBar Menu=new JMenuBar();
        JMenu home=new JMenu("Home");
        JMenu enquiry=new JMenu("Enquiry");
        JMenu  Sub=new JMenu("Subjects");
        JMenuItem Java=new JMenuItem("JAVA");
        Java.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame java=new JFrame("Java Information");
                JTextPane pane=new JTextPane();
                SimpleAttributeSet set=new SimpleAttributeSet();
                pane.setCharacterAttributes(set,true);
                pane.setText("Welcome to Java");
                pane.setVisible(true);
                java.add(pane);
                java.setVisible(true);
            }
        });
            JMenuItem Spring=new JMenuItem("SpringBoot");
            Sub.add(Java);
            Sub.add(Spring);
            //enquiry fuction added
            enquiry.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                Inq.inquiry();
                Home.dispose();
                //Inq.setVisible(true);

            }
            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
           JMenu addmission=new JMenu("Admission");
           addmission.addMenuListener(new MenuListener() {
               @Override
               public void menuSelected(MenuEvent e) {
                   Eddm.addmi();
                   //Eddm.setVisible(true);
                   Home.dispose();
               }

               @Override
               public void menuDeselected(MenuEvent e) {

               }

               @Override
               public void menuCanceled(MenuEvent e) {

               }
           });
           JMenu Records=new JMenu("Administrative");
           Records.addMenuListener(new MenuListener() {
               @Override
               public void menuSelected(MenuEvent e) {
                   login_frame.log();
                   Home.dispose();
               }

               @Override
               public void menuDeselected(MenuEvent e) {

               }

               @Override
               public void menuCanceled(MenuEvent e) {

               }
           });
        Menu.add(home);
        Menu.add(enquiry);
        Menu.add(Sub);
        Menu.add(addmission);
        Menu.add(Records);

        Home.setJMenuBar(Menu);
        Home.setSize(800,900);
        Home.setLayout(null);
        Home.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
