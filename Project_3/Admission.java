package Project_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Admission extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    Home_Page home=new Home_Page();
    JFrame Addmission=new JFrame("Welcome to Admission Page");
    void addmi(){
        String[] gender={"Male","Female","Other"};
        String[] enguiry={"Inquiry","Register"};
        String[] courseDuration={"2 Months","4 Months"};
        String[]  PaymentCourse={"Partly","Full"};


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

        JComboBox CourseDuration=new JComboBox(courseDuration);
        CourseDuration.setBounds(220,300,150,30);

        JLabel duration=new JLabel("Course Duration");
        duration.setBounds(50,300,150,30);

        JComboBox Payment=new JComboBox(PaymentCourse);
        Payment.setBounds(220,340,150,30);

        JLabel pay=new JLabel("Course Fees");
        pay.setBounds(50,340,150,30);
        
        JLabel courseLabel=new JLabel("Courses");
        courseLabel.setBounds(50,380,250,30);

        JCheckBox coursejava=new JCheckBox("Java");
        coursejava.setBounds(220,380,100,30);

        JCheckBox courseSpring=new JCheckBox("Spring");
        courseSpring.setBounds(320,380,100,30);

        JCheckBox coursePython= new JCheckBox("Python");
        coursePython.setBounds(420,380,100,30);



        JButton BackButton=new JButton("Back");
        BackButton.setBounds(130,460,100,30);
        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd=e.getActionCommand();
                if(cmd.equals("Back")){
                    Addmission.dispose();
                    home.Home.setVisible(true);



                }
            }
        });

        JButton SubmitButton=new JButton("Submit");
        SubmitButton.setBounds(330,460,100,30);
        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Student Has Been Admitted");
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

        Addmission.add(name);
        Addmission.add(nameLabel);
        Addmission.add(surname);
        Addmission.add(SurnameLabel);
        Addmission.add(BD);
        Addmission.add(BirthDate);
        Addmission.add(Address);
        Addmission.add(AddressLabel);
        Addmission.add(Gender);
        Addmission.add(GenderBox);
        Addmission.add(duration);
        Addmission.add(CourseDuration);
        Addmission.add(Payment);
        Addmission.add(pay);
        Addmission.add(courseLabel);
        Addmission.add(coursejava);
        Addmission.add(courseSpring);
        Addmission.add(coursePython);
        Addmission.add(BackButton);
        Addmission.add(SubmitButton);
        Addmission.setSize(800,900);
        Addmission.setLayout(null);
        Addmission.setVisible(true);

    }
}
