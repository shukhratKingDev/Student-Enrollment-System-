package app;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuKeyEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Objects;

public class Forms extends JFrame{




        private JPanel contentPane;
        private JTextField Applicant_textField;
        private JTextField Birthdate_textField;
        private JTextField Email_textField;
        private JTextField Moblie_textField;
        private JTextField Degree_textField;
        private JTextField Attended_University_textField;
        private JTextField GPA_textField;
        private JTextField Gender_textField;
        private JTextField Address_textField;


        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Forms frame = new Forms();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }


        public Forms() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 1189, 795);
            contentPane = new JPanel();
            contentPane.setBackground(Color.WHITE);
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);


            JPanel panel = new JPanel();
            panel.setBounds(100, 25, 268, 900);
            panel.setBackground(Color.WHITE);
            JLabel label=new JLabel();
            label.setIcon(new ImageIcon("src\\static\\images\\BackgroundImage.jpg"));
            panel.add(label);
            contentPane.add(panel);

Image icon=Toolkit.getDefaultToolkit().getImage("src\\static\\images\\logo.jpg");
            for (Frame frame : Forms.getFrames()) {
                frame.setIconImage(icon);
                frame.setTitle("SKUU New Students Enrollment");
            }


            JLabel lblNewLabel_10 = new JLabel();
            lblNewLabel_10.setIcon(new ImageIcon(Objects.requireNonNull(Forms.class.getResource("/static/images/AppForm1.png"))));
            lblNewLabel_10.setBounds(400,10,751,117);
            contentPane.add(lblNewLabel_10);


            JLabel Applicant_Name = new JLabel("Applicant Name");
            Applicant_Name.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
            Applicant_Name.setBounds(505, 139, 139, 28);
            contentPane.add(Applicant_Name);

            JLabel Birth_date = new JLabel("Birth date");
            Birth_date.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
            Birth_date.setBounds(554, 231, 90, 28);
            contentPane.add(Birth_date);

            JLabel Email = new JLabel("Email");
            Email.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
            Email.setBounds(584, 269, 60, 28);
            contentPane.add(Email);

            JLabel Mobile_no = new JLabel("Mobile no.");
            Mobile_no.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
            Mobile_no.setBounds(544, 307, 100, 28);
            contentPane.add(Mobile_no);

            JLabel Degree = new JLabel("Degree");
            Degree.setBounds(573, 350, 71, 28);
            Degree.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
            contentPane.add(Degree);

            JLabel Attended_University = new JLabel("Attended University (Graduate)");
            Attended_University.setBounds(391, 394, 256, 28);
            Attended_University.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
            contentPane.add(Attended_University);

            JLabel GPA = new JLabel("GPA (Graduate)");
            GPA.setBounds(505, 432, 127, 28);
            GPA.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
            contentPane.add(GPA);

            JLabel Personal_Statement = new JLabel("Personal Statement");
            Personal_Statement.setBounds(657, 473, 178, 28);
            Personal_Statement.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
            Personal_Statement.setVisible(true);
            contentPane.add(Personal_Statement);

            JLabel Address = new JLabel("Address");
            Address.setBounds(573, 643, 127, 28);
            Address.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
            contentPane.add(Address);



            Applicant_textField = new JTextField();
            Applicant_textField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {

                }
            });
            Applicant_textField.setHorizontalAlignment(SwingConstants.LEFT);
            Applicant_textField.setBounds(677, 139, 324, 27);
            contentPane.add(Applicant_textField);
            Applicant_textField.setColumns(10);

            Birthdate_textField = new JTextField();
            Birthdate_textField.setColumns(10);
            Birthdate_textField.setBounds(677, 227, 324, 27);
            contentPane.add(Birthdate_textField);

            Email_textField = new JTextField();
            Email_textField.setColumns(10);
            Email_textField.setBounds(677, 268, 324, 27);
            contentPane.add(Email_textField);

            JLabel Numbers_only = new JLabel("");
            Numbers_only.setForeground(new Color(255, 0, 0));
            Numbers_only.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
            Numbers_only.setBounds(1026, 307, 100, 28);
            contentPane.add(Numbers_only);

            Moblie_textField = new JTextField();

            Moblie_textField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    String mobileStr=Moblie_textField.getText();
                    int l = mobileStr.length();

                    if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyCode()== MenuKeyEvent.VK_BACK_SPACE ) {
                        Moblie_textField.setEditable(true);
                        Numbers_only.setText("");


                    } else {
                        Moblie_textField.setEditable(false);
                        Numbers_only.setText("* Numbers only");
                    }

                }
            });
            Moblie_textField.setColumns(10);
            Moblie_textField.setBounds(677, 311, 324, 27);
            contentPane.add(Moblie_textField);

            JLabel degree_error = new JLabel("");
            degree_error.setForeground(Color.RED);
            degree_error.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
            degree_error.setBounds(1026, 350, 100, 28);
            contentPane.add(degree_error);


            Attended_University_textField = new JTextField();
            Attended_University_textField.setColumns(10);
            Attended_University_textField.setBounds(677, 394, 324, 27);
            contentPane.add(Attended_University_textField);

            GPA_textField = new JTextField();
            GPA_textField.setColumns(10);
            GPA_textField.setBounds(677, 436, 324, 27);
            contentPane.add(GPA_textField);

            Degree_textField = new JTextField();
            Degree_textField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    String bachelorString="Bachelor";
                    String bachelorString1="bachelor";
                    if(Degree_textField.getText().equals(bachelorString) ||Degree_textField.getText().equals(bachelorString1)) {
                        degree_error.setText("No need to add university and GPA ");
                        Attended_University_textField.setEditable(false);
                        Attended_University_textField.setEnabled(false);
                        GPA_textField.setEditable(false);
                        GPA_textField.setEnabled(false);
                    }
                }
            });
            Degree_textField.setColumns(10);
            Degree_textField.setBounds(677, 354, 324, 27);
            contentPane.add(Degree_textField);



            JTextArea Personal_Statement_TEXT = new JTextArea();
            Personal_Statement_TEXT.setWrapStyleWord(true);
            Personal_Statement_TEXT.setLineWrap(true);
            Personal_Statement_TEXT.addKeyListener(new KeyAdapter() {
                 int count=0;
                @Override
                public void keyPressed(KeyEvent e) {
                    if (count==0) {
                        Personal_Statement_TEXT.setText("");
                    }
                    count++;
                    String textString=Personal_Statement_TEXT.getText();
                    String words[]=textString.split("\\s");
                }
            });
            Personal_Statement_TEXT.setText("At least 100 words...");
            Personal_Statement_TEXT.setBackground(new Color(250, 235, 215));
            Personal_Statement_TEXT.setForeground(new Color(255, 0, 0));
            Personal_Statement_TEXT.setBounds(447, 511, 603, 88);
            Personal_Statement_TEXT.setEditable(true);
            Personal_Statement_TEXT.setVisible(true);
            contentPane.add(Personal_Statement_TEXT);

            JLabel lblNewLabel_1_1 = new JLabel("Gender");
            lblNewLabel_1_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 17));
            lblNewLabel_1_1.setBounds(573, 182, 71, 28);
            contentPane.add(lblNewLabel_1_1);

            Gender_textField = new JTextField();
            Gender_textField.setToolTipText("asdfghj");
            Gender_textField.setHorizontalAlignment(SwingConstants.LEFT);
            Gender_textField.setColumns(10);
            Gender_textField.setBounds(677, 184, 324, 27);
            contentPane.add(Gender_textField);

            Address_textField = new JTextField();
            Address_textField.setColumns(10);
            Address_textField.setBounds(689, 647, 373, 27);
            contentPane.add(Address_textField);

            JButton Submit_Button = new JButton("Submit application");
            Submit_Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int count=0;
                    String []messages=new String[9];
                    String textString=Applicant_textField.getText();
                    String words[]=textString.split("\\s");
                    if(words.length!=2 ) {

                        messages[count]="Name or Surname missing";
                        count++;
                    }
                    else if (textString==" ") {
                        messages[count]="Applicant name not filled";
                        count++;
                    }

                    String dateString=Birthdate_textField.getText();
                    String [] dateList=dateString.split("/");
if (dateList.length!=3){
    messages[count]="Birthdate must be in 'dd/mm/yyyy' format";
    count++;

}

String email=Email_textField.getText();
                    if (!email.contains("@")|| email==null) {
                   messages[count]="Email must be like this:  'example@some.some' ";
                   count++;
                    }

                    String phone=Moblie_textField.getText();
                    if (phone.length()==0) {
                    messages[count]="Phone number field must not be empty";
                    count++;
                    }


                    String degree=Degree_textField.getText();
                    if(!degree.equalsIgnoreCase("Bachelor")){
                        if (Attended_University_textField.getText().isEmpty()){
                       messages[count]="For graduate, you have to enter previous university";
                       count++;
                        }
                        if (GPA_textField.getText().isEmpty()){
                      messages[count]="For graduate, you have to enter your GPA";
                      count++;
                        }

                    }
String gpaText=GPA_textField.getText();
                    if (!gpaText.isEmpty()) {

try{
                    double gpa=Double.parseDouble(GPA_textField.getText());



                    if (gpa>4.5){
                   messages[count]="GPA must be between 0 and 4.5";
                   count++;
                    }
}catch (ArithmeticException exception){
    System.out.println(exception.getMessage());
}

                    }

                    String []wordList=Personal_Statement_TEXT.getText().split(" ");
                    if (wordList.length<100){
                  messages[count]="Your Personal Statement must be at least 100 words";
                  count++;

                    }
                    if (count!=0){
                    String message="";
                    int counter=1;
                    for (String s : messages) {
                        if(s!=null){
                        message+=counter+". "+s;
                        message+="\n";
                        counter++;
                        }

                    }
                    JOptionPane.showMessageDialog(null,message);
                    }else{
                        JOptionPane.showMessageDialog(null,"Successfully submitted");
                    }
                }
            });
            Submit_Button.setEnabled(true);
            Submit_Button.setBackground(new Color(0, 0, 255));

            Submit_Button.setBorderPainted(false);
            Submit_Button.setFocusPainted(false);
            Submit_Button.setText("Submit application");
            Submit_Button.setForeground(new Color(255, 255, 255));
            Submit_Button.setFont(new Font("Segoe UI Symbol", Font.BOLD, 21));
            Submit_Button.setBounds(728, 703, 250, 40);
            contentPane.add(Submit_Button);
        }
}