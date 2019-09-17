package Project_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Enquiry extends JFrame implements ActionListener {
    static JFrame Enq=new JFrame("Enquiry Page");
    void inquiry(){
        Home_Page home=new Home_Page();
        String[] gender={"Male","Female","Other"};
        String[] enguiry={"Inquiry","Register"};


        JTextField name=new JTextField();
        name.setBounds(220,100,250,30);

        JLabel nameLabel=new JLabel("Name");
        nameLabel.setBounds(50,100,150,30);

        JTextField surname=new JTextField();
        surname.setBounds(220,140,250,30);

        JLabel SurnameLabel=new JLabel("Surname");
        SurnameLabel.setBounds(50,140,150,30);

        JTextField BD=new JTextField();
        BD.setBounds(220,180,250,30);

        JLabel BirthDate=new JLabel("Birth Date");
        BirthDate.setBounds(50,180,150,30);

        JTextField Address=new JTextField();
        Address.setBounds(220,220,250,30);

        JLabel AddressLabel=new JLabel("Address");
        AddressLabel.setBounds(50,220,150,30);


        JComboBox GenderBox=new JComboBox(gender);
        GenderBox.setBounds(220,260,150,30);

        JLabel Gender=new JLabel("Gender");
        Gender.setBounds(50,260,250,30);

        JComboBox InqBox=new JComboBox(enguiry);
        InqBox.setBounds(220,300,150,30);

        JLabel EnquiryLabel=new JLabel("Reason");
        EnquiryLabel.setBounds(50,300,250,30);


        JButton BackButton=new JButton("Back");
        BackButton.setBounds(280,380,100,30);
        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd=e.getActionCommand();
                if(cmd.equals("Back")){
                    Enq.dispose();
                    home.Home.setVisible(true);
                }

            }
        });

        JButton SubmitButton=new JButton("Submit");
        SubmitButton.setBounds(400,380,100,30);
        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Data Has Been Registered" );
            }
        });

        Enq.add(name);
        Enq.add(nameLabel);
        Enq.add(surname);
        Enq.add(SurnameLabel);
        Enq.add(BD);
        Enq.add(BirthDate);
        Enq.add(Address);
        Enq.add(AddressLabel);
        Enq.add(Gender);
        Enq.add(GenderBox);
        Enq.add(InqBox);
        Enq.add(EnquiryLabel);
        Enq.add(BackButton);
        Enq.add(SubmitButton);
        Enq.setSize(800,900);
        Enq.setLayout(null);
        Enq.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
