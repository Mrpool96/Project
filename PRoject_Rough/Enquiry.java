package PRoject_Rough;

import javafx.scene.control.DatePicker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Calendar;

public class Enquiry extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        }
    JFrame Inquiry=new JFrame();
    void frame() {


        String[] gender={"Male","Female","Other"};
        String[] enguiry={"Inquiry","Register"};

        JTextField id=new JTextField();
        id.setBounds(220,100,200,30);

        JLabel IDLabel=new JLabel("ID");
        IDLabel.setBounds(50,100,150,30);


        JTextField name=new JTextField();
        name.setBounds(220,140,250,30);

        JLabel nameLabel=new JLabel("Name");
        nameLabel.setBounds(50,140,150,30);

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

        JButton SubmitButton=new JButton("Submit");
        SubmitButton.setBounds(400,380,100,30);
        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,"Data has registered");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "110296sk");
                    String u1 =name.getText();
                    String u2=surname.getText();
                    PreparedStatement pst = con.prepareStatement("insert  into student values(?,?)");
                    pst.setString(1,u1);
                    pst.setString(2,u2);
                    pst.executeUpdate();
                    ResultSet rs=pst.executeQuery("select * from student");
                    while(rs.next()){
                        System.out.println( rs.getString(1));
                    }
                    con.close();

                }
                catch (Exception ea){

                }
            }
        });

        Inquiry.add(id);
        Inquiry.add(IDLabel);
        Inquiry.add(name);
        Inquiry.add(nameLabel);
        Inquiry.add(surname);
        Inquiry.add(SurnameLabel);
        Inquiry.add(BirthDate);

        Inquiry.add(Address);
        Inquiry.add(AddressLabel);
        Inquiry.add(Gender);
        Inquiry.add(GenderBox);
        Inquiry.add(InqBox);
        Inquiry.add(EnquiryLabel);
        Inquiry.add(BackButton);
        Inquiry.add(SubmitButton);
        Inquiry.setSize(800,900);
        Inquiry.setLayout(null);
        Inquiry.setVisible(true);

    }

}
