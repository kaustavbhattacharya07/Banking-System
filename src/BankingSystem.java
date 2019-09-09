import java.sql.ResultSet;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.io.*;
public class BankingSystem {
    JButton button1;
    JButton button2;
    JFrame frame;
    JFrame frame02;
    int AC;
   // Details Customer=new Details();
    //Dimension dim=new Dimension();
    public static void main(String[] args){
        BankingSystem bank = new BankingSystem();
        bank.run();
    }
    public void run(){
        frame=new JFrame();
        button1=new JButton("Login");
        button2=new JButton("Register");
        Color lightblue = new Color(31,190,214);
        MyDrawPanel panel=new MyDrawPanel(lightblue,Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        Font BigFont0 = new Font("Arial",Font.PLAIN,60);
        JLabel label011=new JLabel("ACCESS YOUR");
        label011.setFont(BigFont0);
        JLabel label012=new JLabel("ACCOUNT HERE");
        label012.setFont(BigFont0);
        JLabel label021 =new JLabel("NEW USER?");
        label021.setFont(BigFont0);
        JLabel label022 =new JLabel("REGISTER HERE");
        label022.setFont(BigFont0);
        panel.add(label011);
        panel.add(label012);
        panel.add(button1);
        panel.add(label021);
        panel.add(label022);
        panel.add(button2);
        frame.setSize(1370,720);
        frame.setVisible(true);
        button1.addActionListener(new button1Listener());
        button2.addActionListener(new button2Listener());
         MyDrawPanel panel5=new MyDrawPanel(lightblue,Color.white);
                    frame.getContentPane().add(BorderLayout.NORTH,panel5);
                    panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                    MyDrawPanel panel6=new MyDrawPanel(lightblue,Color.white);
                    frame.getContentPane().add(BorderLayout.SOUTH,panel6);
                   // panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel5.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,50);
                    label08.setFont(BigFont3);
                    panel6.add(label08);
         MyDrawPanel panel7=new MyDrawPanel(lightblue,Color.white);
         frame.getContentPane().add(BorderLayout.EAST,panel7);
          panel7.setLayout(new BoxLayout(panel7,BoxLayout.Y_AXIS));
          MyDrawPanel panel8=new MyDrawPanel(lightblue,Color.white);
         frame.getContentPane().add(BorderLayout.WEST,panel8);
          panel8.setLayout(new BoxLayout(panel8,BoxLayout.Y_AXIS));
         JLabel label091=new JLabel("YOUR MONEY ");
         JLabel label092=new JLabel("IS SAFE ");
         JLabel label093=new JLabel("WITH US");
                    label091.setFont(BigFont3);
                    label092.setFont(BigFont3);
                    label093.setFont(BigFont3);
                    panel7.add(label091);
                    panel7.add(label092);
                    panel7.add(label093);
        JLabel label0101=new JLabel("CHECK OUT THE");
         JLabel label0102=new JLabel("NEW PLANS");
         JLabel label0103=new JLabel("OF THE BANK ");
                    label0101.setFont(BigFont3);
                    label0102.setFont(BigFont3);
                    label0103.setFont(BigFont3);
                    panel8.add(label0101);
                    panel8.add(label0102);
                    panel8.add(label0103);
         
    }
    public class button1Listener implements ActionListener{
        JTextField text1;
        JPasswordField text2;
        JFrame frame2;
        public void actionPerformed(ActionEvent ev){
            frame2=new JFrame();
            MyDrawPanel panel2=new MyDrawPanel(Color.ORANGE,Color.YELLOW);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.getContentPane().add(BorderLayout.CENTER,panel2);
            //panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
            frame2.setSize(1370,720);
            frame2.setVisible(true);
            frame.setVisible(false);
            Font BigFont2 = new Font("Arial",Font.BOLD,30);
            JLabel label1 = new JLabel("UserName");
            label1.setFont(BigFont2);
            text1 = new JTextField(105);
            JLabel label2 = new JLabel("PassWord");
            label2.setFont(BigFont2);
            text2 = new JPasswordField(105);
            panel2.add(label1);
            panel2.add(text1);
            panel2.add(label2);
            panel2.add(text2);
            JButton button=new JButton("LOGIN");
            /*JButton button2=new JButton("BACK");
            JButton button3=new JButton("HOMEPAGE");
            frame2.getContentPane().add(BorderLayout.EAST,button2);
            frame2.getContentPane().add(BorderLayout.WEST,button3);*/
            panel2.add(button);
            button.addActionListener(new buttonListener());
             MyDrawPanel panel5=new MyDrawPanel(Color.ORANGE,Color.YELLOW);
                    frame2.getContentPane().add(BorderLayout.NORTH,panel5);
                    panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                    MyDrawPanel panel6=new MyDrawPanel(Color.ORANGE,Color.YELLOW);
                    frame2.getContentPane().add(BorderLayout.SOUTH,panel6);
                   // panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel5.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                    label08.setFont(BigFont3);
                    panel6.add(label08);
                    JButton Back=new JButton("BACK");
                    Back.addActionListener(new backListener());
                    panel5.add(Back);
                }
                public class backListener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame.setVisible(true);
                    frame2.setVisible(false);
                    }
                }
        
        public class buttonListener implements ActionListener{
           // ArrayList<Details> AllInfo=new ArrayList<Details>();
            
            public void actionPerformed(ActionEvent ev){
               /*try{
                    FileInputStream fs=new FileInputStream("Banking.ser");
                    ObjectInputStream os=new ObjectInputStream(fs);
                    int i;
                    for(i=0;i<Details.getCount();i++){
                        Details D = (Details)os.readObject();
                        AllInfo.add(D);
                    }
                    for(i=0;i<Details.getCount();i++){            
                        if(text2.getText().equals(AllInfo.get(i).getPassword()) && text1.getText().equals(AllInfo.get(i).getUsername())) {
                            break;
                        }        
                        } 
                        if(i==Details.getCount()){
                            JLabel label3=new JLabel("Username or Password not found!");
                            Font BigFont2 = new Font("Arial",Font.BOLD,25);
                            label3.setForeground(Color.red);
                            label3.setFont(BigFont2);
                            frame2.getContentPane().add(BorderLayout.NORTH,label3);
                        }
                        else{*/
               
                        String Username=text1.getText();
                        String Password=text2.getText();
                        text1.setText("");
                        text2.setText("");
                        int counter=0;
                    if (Username.isEmpty())JOptionPane.showMessageDialog(frame,"Username not Entered");
                    else if (Password.isEmpty())JOptionPane.showMessageDialog(frame,"Password not Entered");
                    else {
                    try{
                        
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        String query1="SELECT * FROM userinfo WHERE username='"+Username+"'AND password='"+Password+"';";
                        ResultSet rs1 = stmt.executeQuery(query1);
                        if(rs1.next()){
                           AC=rs1.getInt("Accountno");
                           counter++;
                     
                             frame02= new JFrame();
                             frame02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                             MyDrawPanel panel2=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                             frame02.getContentPane().add(BorderLayout.CENTER,panel2);
                            // panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
                             frame02.setSize(1370,730);
                             frame02.setVisible(true);
                             frame2.setVisible(false);
                             Font BigFont = new Font("Arial",Font.PLAIN,25);
                             JLabel label021=new JLabel("OUR BANK PROVIDES");
                             JLabel label022=new JLabel("YOU ALL THE");
                             JLabel label023=new JLabel("FACILITIES THROUGH");
                             JLabel label024=new JLabel("THE INTERNET.");
                             JLabel label025=new JLabel("YOU CAN ACCESS");
                             JLabel label026=new JLabel("YOUR ACCOUNT ANYTIME");
                             JLabel label027=new JLabel("FROM OUR WEBSITE");
                             JLabel label028=new JLabel("CHECK OUT OUR NEW");
                             JLabel label029=new JLabel("POLICIES IN THE ");
                             JLabel label0210=new JLabel("ADJOINIG SECTION");
                             label021.setFont(BigFont);
                             label022.setFont(BigFont);
                             label023.setFont(BigFont);
                             label024.setFont(BigFont);
                             label025.setFont(BigFont);
                             label026.setFont(BigFont);
                             label027.setFont(BigFont);
                             label028.setFont(BigFont);
                             label029.setFont(BigFont);
                             label0210.setFont(BigFont);
                             panel2.add(label021);
                             panel2.add(label022);
                             panel2.add(label023);
                             panel2.add(label024);
                             panel2.add(label025);
                             panel2.add(label026);
                             panel2.add(label027);
                             panel2.add(label028);
                             panel2.add(label029);
                             panel2.add(label0210);
                             JButton button01=new JButton("NETBANKING");
                             JButton button02=new JButton("CASH WITHDRAWAL");
                             JButton button03=new JButton("CASH DEPOSITION");
                             JButton button04=new JButton("TAKE LOAN");
                             JButton button05=new JButton("CHECK BALANCE");
                             JButton button06=new JButton("PERSONAL INFORMATION");
                             JButton button07=new JButton("BANK POLICIES");
                             JButton button08=new JButton("POLICIES ADOPTED");
                             JButton button09=new JButton("LOAN DETAILS");
                             
                             JLabel label01=new JLabel("Make Online Transactions");
                             label01.setFont(BigFont);
                             JLabel label02=new JLabel("Withdraw Cash From Your Current Account");
                             label02.setFont(BigFont);
                             JLabel label03=new JLabel("Deposit Cash In Your Current Account");
                             label03.setFont(BigFont);
                             JLabel label04=new JLabel("Take A Loan At Low Interest Rates");
                             label04.setFont(BigFont);
                             JLabel label05=new JLabel("Check Your Account Balance");
                             label05.setFont(BigFont);
                             JLabel label06=new JLabel("View And Edit Your Personal Information");
                             label06.setFont(BigFont);
                             JLabel label09=new JLabel("Check the policies that you have adopted");
                             label09.setFont(BigFont);
                             JLabel label010=new JLabel("Check if you have any loan to clear");
                             label010.setFont(BigFont);
                             MyDrawPanel panel3=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                             frame02.getContentPane().add(BorderLayout.EAST,panel3);
                             panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
                             MyDrawPanel panel4=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                             frame02.getContentPane().add(BorderLayout.WEST,panel4);
                             panel4.setLayout(new BoxLayout(panel4,BoxLayout.Y_AXIS));
                             MyDrawPanel panel5=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                             frame02.getContentPane().add(BorderLayout.NORTH,panel5);
                             panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                             MyDrawPanel panel6=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                             frame02.getContentPane().add(BorderLayout.SOUTH,panel6);
                            // panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                             JLabel label07=new JLabel("WELCOME TO THE BANK");
                             Font BigFont2 = new Font("Arial",Font.PLAIN,100);
                             label07.setFont(BigFont2);
                             panel5.add(label07);
                             JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                             Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                             label08.setFont(BigFont3);
                             panel6.add(label08);
                             panel4.add(button01);
                             panel4.add(label01);
                             panel4.add(button02);
                             panel4.add(label02);
                             panel4.add(button03);
                             panel4.add(label03);
                             panel4.add(button08);
                             panel4.add(label09);
                             panel3.add(button04);
                             panel3.add(label04);
                             panel3.add(button05);
                             panel3.add(label05);
                             panel3.add(button06);
                             panel3.add(label06);
                             panel3.add(button09);
                             panel3.add(label010);
                             panel2.add(button07);
                             button01.addActionListener(new Listener01());
                             button02.addActionListener(new Listener02());
                             button03.addActionListener(new Listener03());
                             button04.addActionListener(new Listener04());
                             button05.addActionListener(new Listener05());
                             button06.addActionListener(new Listener06());
                             button07.addActionListener(new Listener07());
                             button08.addActionListener(new Listener08());
                             button09.addActionListener(new Listener09());
                       // }
                        
                    
              /*  }catch(Exception ex){
                    ex.printStackTrace();
                }*/
              JButton Back=new JButton("LOG OUT");
                    Back.addActionListener(new backListener());
                    JLabel label00=new JLabel("                                                                                            ");
                    panel5.add(Back);
                    panel5.add(label00);
                        } 
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                    
                }
                    if(counter==0)JOptionPane.showMessageDialog(frame,"Invalid Username or Password");
            }
                public class backListener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame2.setVisible(true);
                    frame02.setVisible(false);
                    }
                
        }
            public class Listener01 implements ActionListener{
                JFrame newframe;
                JTextField text011,text012,text013;
                JPasswordField p011;
                public void actionPerformed(ActionEvent ev){
                    newframe=new JFrame();
                    newframe.setSize(1370,730);
                    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newframe.setVisible(true);
                    frame02.setVisible(false);
                    MyDrawPanel newpanel=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.CENTER,newpanel);
                   // newpanel.setLayout(new BoxLayout(newpanel,BoxLayout.Y_AXIS));
                    Font BigFont2 = new Font("Arial",Font.PLAIN,30);
                    MyDrawPanel panel5=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.NORTH,panel5);
                    panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                    MyDrawPanel panel6=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.SOUTH,panel6);
                   // panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel5.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                    label08.setFont(BigFont3);
                    panel6.add(label08);
                    JButton Back=new JButton("BACK");
                    Back.addActionListener(new backListener());
                    panel5.add(Back);
                    JLabel label011=new JLabel("AccountNumber of Receiver:");
                    text011=new JTextField(83);
                    JLabel label012=new JLabel("   Your AccountNumber :   ");
                    text012=new JTextField(83);
                    JLabel label014=new JLabel("           Amount         ");
                    text013=new JTextField(83);
                    JLabel label013=new JLabel("         Password:        ");
                    p011=new JPasswordField(95);
                    label011.setFont(BigFont2);
                    label012.setFont(BigFont2);
                    label013.setFont(BigFont2);
                    label014.setFont(BigFont2);
                    JButton button011=new JButton("Transfer");
                    button011.addActionListener(new button011Listener());
                    newpanel.add(label011);
                    newpanel.add(text011);
                    newpanel.add(label012);
                    newpanel.add(text012);
                    newpanel.add(label014);
                    newpanel.add(text013);
                    newpanel.add(label013);
                    newpanel.add(p011);
                    newpanel.add(button011);
                }
                public class button011Listener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    /*Money Transfer Code GOes Here*/
                        String AC1=text011.getText();
                        String AC2=text012.getText();
                        String Amount=text013.getText();
                        String Password=p011.getText();
                       // int iAC1=Integer.parseInt(AC1);
                        int iAC2=Integer.parseInt(AC2);
                        float iAmount=Float.parseFloat(Amount);
                    if (AC1.isEmpty())JOptionPane.showMessageDialog(frame,"Account Number not Entered");
                    else if (AC2.isEmpty())JOptionPane.showMessageDialog(frame,"Account Number not Entered");
                    else if (Amount.isEmpty())JOptionPane.showMessageDialog(frame,"Amount not Entered");
                    
                    else if (Password.isEmpty())JOptionPane.showMessageDialog(frame,"Password not Entered");
                    else if(iAC2==AC){
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        
                       // String query2="SELECT * FROM Bank WHERE Accountno='"+AC2+"';";
                        String query3="SELECT balance FROM Balance WHERE Accountno='"+AC+"';";
                        ResultSet rs0=stmt.executeQuery(query3);
                        float ibalance=0;
                        if(rs0.next())ibalance=rs0.getInt("balance");
                        
                        
                        String query1="SELECT username FROM userinfo WHERE Accountno='"+AC1+"';";
                        ResultSet rs1 = stmt.executeQuery(query1);
                        String flag=null;
                      if(rs1.next())flag=rs1.getString("username");
                       else{JOptionPane.showMessageDialog(frame,"Wrong Account Number");}
                        //ResultSet rs2 = stmt.executeQuery(query2);
                       // ResultSet rs3 = stmt.executeQuery(query3);
                       String query4="SELECT * FROM userinfo WHERE Password='"+Password+"' AND Accountno='"+AC+"';";
                        ResultSet rs4 = stmt.executeQuery(query4);
                        
                           if(rs4.next()){
                           
                               if(iAmount<=ibalance&&flag!=null){
                                       String query00="start transaction";
                                       String query01="update balance set balance=balance-'"+iAmount+"' where Accountno='"+AC2+"';";
                                       String query02="update balance set balance=balance+'"+iAmount+"' where Accountno='"+AC1+"';"; 
                                       String query03="commit";
                                       stmt.executeUpdate(query00);
                                       stmt.executeUpdate(query01);
                                       stmt.executeUpdate(query02);
                                       stmt.executeUpdate(query03);
                                           
                               }else{JOptionPane.showMessageDialog(frame,"Amount exceeding balance");}
                           } else{JOptionPane.showMessageDialog(frame,"Wrong Account Number or Password");}
                           /*AC=Details.generateAccountNumber();
                           String query="INSERT INTO Bank VALUES('"+Name+"','"+Emailid+"','"+Contactno+"','"+Username+"','"+Password+"','"+AC+"');";
                           stmt.executeUpdate(query);*/
                      // }else{JOptionPane.showMessageDialog(frame,"Wrong Account Number or Password");}
                      // }else{JOptionPane.showMessageDialog(frame,"Wrong Account Number");}
                       // String query="INSERT INTO Contact VALUES('"+Name+"','"+Mobile+"','"+Email+"');";
                       // stmt.executeUpdate(query);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                    }else{JOptionPane.showMessageDialog(frame,"Wrong Account Number or Password");}
                     }
                }
                public class backListener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    }
                }
            }
            public class Listener02 implements ActionListener{
                JFrame newframe;
                JTextField text011,text012;
                JPasswordField p011;
                public void actionPerformed(ActionEvent ev){
                    newframe=new JFrame();
                    newframe.setSize(1370,730);
                    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newframe.setVisible(true);
                    frame02.setVisible(false);
                    MyDrawPanel newpanel=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.CENTER,newpanel);
                    //newpanel.setLayout(new BoxLayout(newpanel,BoxLayout.Y_AXIS));
                    Font BigFont2 = new Font("Arial",Font.PLAIN,30);
                    MyDrawPanel panel5=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.NORTH,panel5);
                    panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                    MyDrawPanel panel6=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.SOUTH,panel6);
                    panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel5.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                    label08.setFont(BigFont3);
                    panel6.add(label08);
                    JButton Back=new JButton("BACK");
                    Back.addActionListener(new backListener());
                    panel5.add(Back);
                    JLabel label011=new JLabel("Amount to be Withdrawn:");
                    text011=new JTextField(83);
                    JLabel label012=new JLabel("   Your AccountNumber :   ");
                    text012=new JTextField(83);
                    JLabel label013=new JLabel("         Password:        ");
                    p011=new JPasswordField(95);
                    label011.setFont(BigFont2);
                    label012.setFont(BigFont2);
                    label013.setFont(BigFont2);
                    JButton button011=new JButton("Withdraw");
                    button011.addActionListener(new button011Listener());
                    newpanel.add(label011);
                    newpanel.add(text011);
                    newpanel.add(label012);
                    newpanel.add(text012);
                    newpanel.add(label013);
                    newpanel.add(p011);
                    newpanel.add(button011);
                }
                public class button011Listener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    /*Money Transfer Code GOes Here*/
                    //public void actionPerformed(ActionEvent ev){
                    String Amount=text011.getText();
                    float iAmount=Float.parseFloat(Amount);
                    String AC1=text012.getText();
                    int iAC1=Integer.parseInt(AC1);
                    String Password=p011.getText();
                    if (Amount.isEmpty())JOptionPane.showMessageDialog(frame,"Amount not Entered");
                    else if (AC1.isEmpty())JOptionPane.showMessageDialog(frame,"Account Number not Entered");
                    else if (Password.isEmpty())JOptionPane.showMessageDialog(frame,"Password not Entered");
                    else if(iAC1==AC){
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        String query1="select balance from balance where Accountno='"+AC+"';";
                        ResultSet rs0=stmt.executeQuery(query1);
                        float ibalance=0;
                        if(rs0.next()){ibalance=rs0.getInt("balance");}
                        String query2="select * from userinfo where Password='"+Password+"' && Accountno='"+AC+"';";
                        ResultSet rs=stmt.executeQuery(query2);
                        if(rs.next()){
                        if(iAmount<=ibalance){
                                      // String query00="start transaction";
                                       String query01="update balance set balance=balance-'"+iAmount+"' where Accountno='"+AC+"';";
                                       //String query02="commit";
                                       //stmt.executeUpdate(query00);
                                       stmt.executeUpdate(query01);
                                       //stmt.executeUpdate(query02);
                                       
                        }else{JOptionPane.showMessageDialog(frame,"Amount exceeding balance");}
                        }else{JOptionPane.showMessageDialog(frame,"Wrong Account Number or Password.");}
                       // String query="INSERT INTO Contact VALUES('"+Name+"','"+Mobile+"','"+Email+"');";
                       // stmt.executeUpdate(query);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                    }else{JOptionPane.showMessageDialog(frame,"Wrong Account Number or Password.");}
                    }
                }
                public class backListener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    }
                }
                
            }
            public class Listener03 implements ActionListener{
                JFrame newframe;
                JTextField text011,text012;
                JPasswordField p011;
                public void actionPerformed(ActionEvent ev){
                    newframe=new JFrame();
                    newframe.setSize(1370,730);
                    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newframe.setVisible(true);
                    frame02.setVisible(false);
                    MyDrawPanel newpanel=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.CENTER,newpanel);
                   // newpanel.setLayout(new BoxLayout(newpanel,BoxLayout.Y_AXIS));
                    Font BigFont2 = new Font("Arial",Font.PLAIN,30);
                    MyDrawPanel panel5=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.NORTH,panel5);
                    panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                    MyDrawPanel panel6=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.SOUTH,panel6);
                    panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel5.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                    label08.setFont(BigFont3);
                    panel6.add(label08);
                    JButton Back=new JButton("BACK");
                    Back.addActionListener(new backListener());
                    panel5.add(Back);
                
                    JLabel label011=new JLabel("Amount to be Deposited:");
                    text011=new JTextField(83);
                    JLabel label012=new JLabel("   Your AccountNumber :   ");
                    text012=new JTextField(83);
                    JLabel label013=new JLabel("         Password:        ");
                    p011=new JPasswordField(95);
                    label011.setFont(BigFont2);
                    label012.setFont(BigFont2);
                    label013.setFont(BigFont2);
                    JButton button011=new JButton("Deposit");
                    button011.addActionListener(new button011Listener());
                    newpanel.add(label011);
                    newpanel.add(text011);
                    newpanel.add(label012);
                    newpanel.add(text012);
                    newpanel.add(label013);
                    newpanel.add(p011);
                    newpanel.add(button011);
                }
                public class button011Listener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    /*Money Transfer Code GOes Here*/
                   // public void actionPerformed(ActionEvent ev){
                    String Amount=text011.getText();
                    float iAmount=Float.parseFloat(Amount);
                    String AC1=text012.getText();
                    int iAC1=Integer.parseInt(AC1);
                    String Password=p011.getText();
                    if (Amount.isEmpty())JOptionPane.showMessageDialog(frame,"Amount not Entered");
                    else if (AC1.isEmpty())JOptionPane.showMessageDialog(frame,"Account Number not Entered");
                    else if (Password.isEmpty())JOptionPane.showMessageDialog(frame,"Password not Entered");
                    else if(iAC1==AC){
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        String query2="select * from userinfo where Password='"+Password+"' && Accountno='"+AC+"';";
                        ResultSet rs=stmt.executeQuery(query2);
                        if(rs.next()){
                        
                                      // String query00="start transaction";
                                       String query01="update balance set balance=balance+'"+iAmount+"' where Accountno='"+AC+"';";
                                       //String query02="commit";
                                       //stmt.executeUpdate(query00);
                                       stmt.executeUpdate(query01);
                                       //stmt.executeUpdate(query02);
                                       
                        
                        }else{JOptionPane.showMessageDialog(frame,"Wrong Account Number or Password.");}
                       // String query="INSERT INTO Contact VALUES('"+Name+"','"+Mobile+"','"+Email+"');";
                       // stmt.executeUpdate(query);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                    }else{JOptionPane.showMessageDialog(frame,"Wrong Account Number or Password.");}
                    }
                }
                public class backListener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    }
                }
                
            }
            public class Listener04 implements ActionListener{
                JFrame newframe;
                JTextField text011,text012;
                JPasswordField p011;
                public void actionPerformed(ActionEvent ev){
                    newframe=new JFrame();
                    newframe.setSize(1370,730);
                    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newframe.setVisible(true);
                    frame02.setVisible(false);
                    MyDrawPanel newpanel=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.CENTER,newpanel);
                   // newpanel.setLayout(new BoxLayout(newpanel,BoxLayout.Y_AXIS));
                    Font BigFont2 = new Font("Arial",Font.PLAIN,30);
                    Font font01 = new Font("Arial",Font.PLAIN,50);
                    MyDrawPanel panel5=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.NORTH,panel5);
                    panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                    MyDrawPanel panel6=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.SOUTH,panel6);
                    panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel5.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                    label08.setFont(BigFont3);
                    panel6.add(label08);
                    JButton Back=new JButton("BACK");
                    Back.addActionListener(new backListener());
                    panel5.add(Back);
                    JLabel label010=new JLabel("Loan Available at 15% Interest p.a.");
                    label010.setFont(font01);
                    JLabel label011=new JLabel("Amount to Loan to be Taken:");
                    text011=new JTextField(83);
                    JLabel label012=new JLabel("    Your AccountNumber :   ");
                    text012=new JTextField(83);
                    JLabel label013=new JLabel("          Password:        ");
                    p011=new JPasswordField(95);
                    label011.setFont(BigFont2);
                    label012.setFont(BigFont2);
                    label013.setFont(BigFont2);
                    JButton button011=new JButton("Take Loan");
                    button011.addActionListener(new button011Listener());
                    newpanel.add(label011);
                    newpanel.add(text011);
                    newpanel.add(label012);
                    newpanel.add(text012);
                    newpanel.add(label013);
                    newpanel.add(p011);
                    newpanel.add(button011);
                }
                public class button011Listener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    /*Money Transfer Code GOes Here*/
                   // public void actionPerformed(ActionEvent ev){
                   String Amount=text011.getText();
                    float iAmount=Float.parseFloat(Amount);
                    String AC1=text012.getText();
                    int iAC1=Integer.parseInt(AC1);
                    String Password=p011.getText();
                    if (Amount.isEmpty())JOptionPane.showMessageDialog(frame,"Amount not Entered");
                    else if (AC1.isEmpty())JOptionPane.showMessageDialog(frame,"Account Number not Entered");
                    else if (Password.isEmpty())JOptionPane.showMessageDialog(frame,"Password not Entered");
                    else if(iAC1==AC){
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        String query2="select * from userinfo where Password='"+Password+"' && Accountno='"+AC+"';";
                        ResultSet rs=stmt.executeQuery(query2);
                        if(rs.next()){
                        
                                      
                                       String query01="update balance set balance=balance+'"+iAmount+"' where Accountno='"+AC+"';";
                                       String query02="insert into loans(accountno,loanamount) values('"+AC+"','"+iAmount+"');";
                                       stmt.executeUpdate(query01);
                                       stmt.executeUpdate(query02);
                        }else{JOptionPane.showMessageDialog(frame,"Wrong Account Number or Password.");}
                        }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                    }else{JOptionPane.showMessageDialog(frame,"Wrong Account Number or Password.");}
                    
                    }
                }
                public class backListener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    }
                }
                
            }
            public class Listener05 implements ActionListener{
                JFrame newframe;
                public void actionPerformed(ActionEvent ev){
                    newframe=new JFrame();
                    newframe.setSize(1370,730);
                    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newframe.setVisible(true);
                    frame02.setVisible(false);
                    MyDrawPanel newpanel=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.CENTER,newpanel);
                    newpanel.setLayout(new BoxLayout(newpanel,BoxLayout.Y_AXIS));
                    Font BigFont2 = new Font("Arial",Font.PLAIN,50);
                    MyDrawPanel panel5=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.NORTH,panel5);
                    panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                    MyDrawPanel panel6=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.SOUTH,panel6);
                    panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel5.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                    label08.setFont(BigFont3);
                    panel6.add(label08);
                    JButton Back=new JButton("BACK");
                    Back.addActionListener(new backListener());
                    panel5.add(Back);
                    float balance=0;
                    
                    /*Other Code*/
                    /*JButton button011=new JButton("OK");
                    button011.addActionListener(new button011Listener());
                    newpanel.add(button011);
                }
                public class button011Listener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);*/
                    /*Money Transfer Code GOes Here*/
                   // public void actionPerformed(ActionEvent ev){
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        String query="select balance from balance where accountno='"+AC+"';";
                        ResultSet rs=stmt.executeQuery(query);
                        if(rs.next()){
                        balance=rs.getFloat("Balance");
                        }
                       // String query="INSERT INTO Contact VALUES('"+Name+"','"+Mobile+"','"+Email+"');";
                       // stmt.executeUpdate(query);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                    JLabel label09=new JLabel("YOUR BALANCE IN THE ACCOUNT IS: Rs." + balance);
                    Font BigFont4 = new Font("Arial",Font.PLAIN,40);
                    label09.setFont(BigFont4);
                    newpanel.add(label09);
                   // }
                }
                public class backListener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    }
                }
                
            }
            public class Listener06 implements ActionListener{
                JFrame newframe;
                JTextField text01,text02,text03,text04,text05;
                public void actionPerformed(ActionEvent ev){
                    newframe=new JFrame();
                    newframe.setSize(1370,730);
                    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newframe.setVisible(true);
                    frame02.setVisible(false);
                    MyDrawPanel newpanel=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.CENTER,newpanel);
                    //newpanel.setLayout(new BoxLayout(newpanel,BoxLayout.Y_AXIS));
                    Font BigFont2 = new Font("Arial",Font.PLAIN,50);
                    MyDrawPanel panel5=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.NORTH,panel5);
                    panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                    MyDrawPanel panel6=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.SOUTH,panel6);
                    panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel5.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                    label08.setFont(BigFont3);
                    panel6.add(label08);
                    JButton Back=new JButton("BACK");
                    Back.addActionListener(new backListener());
                    panel5.add(Back);
                     /*Other Code*/
                    String Name=null,Email=null,Username=null;
                    int Contactno=0,Accountno=0;
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        String query="select * from userinfo where accountno='"+AC+"';";
                        ResultSet rs=stmt.executeQuery(query);
                        if(rs.next()){
                        Name=rs.getString("Name");
                        Email=rs.getString("Email");
                        Contactno=rs.getInt("Contactno");
                        Username=rs.getString("Username");
                        Accountno=rs.getInt("Accountno");}
                        }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                        Font BigFont02 = new Font("Arial",Font.BOLD,30);
                    JLabel label1 = new JLabel("Name:         ");
            label1.setFont(BigFont02);
            text01=new JTextField(100);
            JLabel label2 = new JLabel("Email id      ");
            label2.setFont(BigFont02);
            text02=new JTextField(100);
            JLabel label3 = new JLabel("Contact number");
            label3.setFont(BigFont02);
            text03=new JTextField(100);
            JLabel label4 = new JLabel("Username      ");
            label4.setFont(BigFont02);
            text04=new JTextField(100);
            JLabel label5 = new JLabel("Account Number");
            label5.setFont(BigFont02);
            text05=new JTextField(100);
            text01.setEditable(false);
            text01.setText(""+Name);
            text02.setEditable(false);
            text02.setText(""+Email);
            text03.setEditable(false);
            text03.setText(""+Contactno);
            text04.setEditable(false);
            text04.setText(""+Username);
            text05.setEditable(false);
            text05.setText(""+Accountno);
            newpanel.add(label1);
            newpanel.add(text01);
            newpanel.add(label2);
            newpanel.add(text02);
            newpanel.add(label3);
            newpanel.add(text03);
            newpanel.add(label4);
            newpanel.add(text04);
            newpanel.add(label5);
            newpanel.add(text05);
            
                       // stmt.executeUpdate(query);
                    JButton button011=new JButton("Edit");
                    button011.addActionListener(new button011Listener());
                    newpanel.add(button011); 
                    JLabel label010=new JLabel("                                                                        ");
                    newpanel.add(label010);
                    JButton button012=new JButton("Save");
                    button012.addActionListener(new button012Listener());
                    newpanel.add(button012);
                    
                }public class button011Listener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                         text01.setEditable(true);
                         text02.setEditable(true);
                         text03.setEditable(true);
                     }
                
                     }
                public class button012Listener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    //frame02.setVisible(true);
                    //newframe.setVisible(false);
                    
                    String Name=text01.getText();
                    String Emailid=text02.getText();
                    String iContactno= text03.getText();
                    int contactno=Integer.parseInt(iContactno);
                    if (Name.isEmpty())JOptionPane.showMessageDialog(frame,"Name not Entered");
                    else if (Emailid.isEmpty())JOptionPane.showMessageDialog(frame,"Emailid not Entered");
                    else if (iContactno.isEmpty())JOptionPane.showMessageDialog(frame,"Contact number not Entered");
                    else{
                    text01.setEditable(false);
                    text02.setEditable(false);
                    text03.setEditable(false);
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        String query="update userinfo set Name='"+Name+"',Email='"+Emailid+"',Contactno='"+contactno+"' where accountno='"+AC+"';";
                        stmt.executeUpdate(query);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                    }
                    }
                }
                public class backListener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    }
                }
                
            }
             public class Listener07 implements ActionListener{
                JFrame newframe;
                boolean apply1=false,apply2=false,apply3=false,apply4=false,apply5=false,apply6=false,apply7=false,apply8=false,apply9=false,apply10=false;
                JCheckBox check1,check2,check3,check4,check5,check6,check7,check8,check9,check10;
                JButton button071;
                public void actionPerformed(ActionEvent ev){
                    newframe=new JFrame();
                    newframe.setSize(1370,730);
                    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newframe.setVisible(true);
                    frame02.setVisible(false);
                    MyDrawPanel newpanel=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                     JScrollPane scroller=new JScrollPane(newpanel);
                    newframe.getContentPane().add(BorderLayout.CENTER,scroller);
                    newpanel.setLayout(new BoxLayout(newpanel,BoxLayout.Y_AXIS));
                    Font BigFont2 = new Font("Arial",Font.PLAIN,40);
                    MyDrawPanel panel5=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.NORTH,panel5);
                    panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                    MyDrawPanel panel6=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.SOUTH,panel6);
                   // panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel5.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                    label08.setFont(BigFont3);
                    panel6.add(label08);
                    JButton Back=new JButton("BACK");
                    Back.addActionListener(new backListener2());
                    panel5.add(Back);
                    JLabel label070=new JLabel("CHECK THE POLICIES WHICH YOU WANT TO ADOPT");
                    label070.setFont(BigFont2);
                    JCheckBox check1=new JCheckBox("POLICY1");
                    JLabel label071=new JLabel("Details of policy1");
                    label071.setFont(BigFont2);
                    JCheckBox check2=new JCheckBox("POLICY2");
                    JLabel label072=new JLabel("Details of policy2");
                    label072.setFont(BigFont2);
                    JCheckBox check3=new JCheckBox("POLICY3");
                    JLabel label073=new JLabel("Details of policy3");
                    label073.setFont(BigFont2);
                    JCheckBox check4=new JCheckBox("POLICY4");
                    JLabel label074=new JLabel("Details of policy4");
                    label074.setFont(BigFont2);
                    JCheckBox check5=new JCheckBox("POLICY5");
                    JLabel label075=new JLabel("Details of policy5");
                    label075.setFont(BigFont2);
                    JCheckBox check6=new JCheckBox("POLICY6");
                    JLabel label076=new JLabel("Details of policy6");
                    label076.setFont(BigFont2);
                    JCheckBox check7=new JCheckBox("POLICY7");
                    JLabel label077=new JLabel("Details of policy7");
                    label077.setFont(BigFont2);
                    JCheckBox check8=new JCheckBox("POLICY8");
                    JLabel label078=new JLabel("Details of policy8");
                    label078.setFont(BigFont2);
                    JCheckBox check9=new JCheckBox("POLICY9");
                    JLabel label079=new JLabel("Details of policy9");
                    label079.setFont(BigFont2);
                    JCheckBox check10=new JCheckBox("POLICY10");
                    JLabel label0710=new JLabel("Details of policy10");
                    label0710.setFont(BigFont2);
                    newpanel.add(label070);
                    newpanel.add(check1);
                    newpanel.add(label071);
                    newpanel.add(check2);
                    newpanel.add(label072);
                    newpanel.add(check3);
                    newpanel.add(label073);
                    newpanel.add(check4);
                    newpanel.add(label074);
                    newpanel.add(check5);
                    newpanel.add(label075);
                    newpanel.add(check6);
                    newpanel.add(label076);
                    newpanel.add(check7);
                    newpanel.add(label077);
                    newpanel.add(check8);
                    newpanel.add(label078);
                    newpanel.add(check9);
                    newpanel.add(label079);
                    newpanel.add(check10);
                    newpanel.add(label0710);
                    JButton button071=new JButton("OK");
                    newpanel.add(button071);
                   scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                   scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                   check1.addItemListener(new Check1Listener());
                   check2.addItemListener(new Check2Listener());
                   check3.addItemListener(new Check3Listener());
                   check4.addItemListener(new Check4Listener());
                   check5.addItemListener(new Check5Listener());
                   check6.addItemListener(new Check6Listener());
                   check7.addItemListener(new Check7Listener());
                   check8.addItemListener(new Check8Listener());
                   check9.addItemListener(new Check9Listener());
                   check10.addItemListener(new Check10Listener());
                   button071.addActionListener(new BListener());
                   }
                 public class Check1Listener implements ItemListener{
                    public void itemStateChanged(ItemEvent ev){
                        if(check1.isSelected())apply1=true;
                    }
                }
                  public class Check2Listener implements ItemListener{
                    public void itemStateChanged(ItemEvent ev){
                        if(check2.isSelected())apply2=true;
                    }
                }
                   public class Check3Listener implements ItemListener{
                    public void itemStateChanged(ItemEvent ev){
                        if(check3.isSelected())apply3=true;
                    }
                }
                    public class Check4Listener implements ItemListener{
                    public void itemStateChanged(ItemEvent ev){
                        if(check4.isSelected())apply4=true;
                    }
                }
                     public class Check5Listener implements ItemListener{
                    public void itemStateChanged(ItemEvent ev){
                        if(check5.isSelected())apply5=true;
                    }
                }
                      public class Check6Listener implements ItemListener{
                    public void itemStateChanged(ItemEvent ev){
                        if(check6.isSelected())apply6=true;
                    }
                }
                       public class Check7Listener implements ItemListener{
                    public void itemStateChanged(ItemEvent ev){
                        if(check7.isSelected())apply7=true;
                    }
                }
                        public class Check8Listener implements ItemListener{
                    public void itemStateChanged(ItemEvent ev){
                        if(check8.isSelected())apply8=true;
                    }
                }
                         public class Check9Listener implements ItemListener{
                    public void itemStateChanged(ItemEvent ev){
                        if(check9.isSelected())apply9=true;
                    }
                }
                          public class Check10Listener implements ItemListener{
                    public void itemStateChanged(ItemEvent ev){
                        if(check10.isSelected())apply10=true;
                    }
                }
                          public class BListener implements ActionListener{
                              public void actionPerformed(ActionEvent ev){
                                  frame02.setVisible(true);
                                  newframe.setVisible(false);
                              /*Policy addition code goes here*/
                              try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        String query="delete from policies where accountno='"+AC+"';";
                        stmt.executeUpdate(query);
                        if(apply1){
                            String p="policy1";
                            String query0 ="insert into policies values('"+AC+"','"+p+"');";
                            stmt.executeUpdate(query0);
                        }
                        if(apply2){
                            String p="policy2";
                            String query0 ="insert into policies values('"+AC+"','"+p+"');";
                            stmt.executeUpdate(query0);
                        }
                        if(apply3){
                            String p="policy3";
                            String query0 ="insert into policies values('"+AC+"','"+p+"');";
                            stmt.executeUpdate(query0);
                        }
                        if(apply4){
                            String p="policy4";
                            String query0 ="insert into policies values('"+AC+"','"+p+"');";
                            stmt.executeUpdate(query0);
                        }
                        if(apply5){
                            String p="policy5";
                            String query0 ="insert into policies values('"+AC+"','"+p+"');";
                            stmt.executeUpdate(query0);
                        }
                        if(apply6){
                            String p="policy6";
                            String query0 ="insert into policies values('"+AC+"','"+p+"');";
                            stmt.executeUpdate(query0);
                        }
                        if(apply7){
                            String p="policy7";
                            String query0 ="insert into policies values('"+AC+"','"+p+"');";
                            stmt.executeUpdate(query0);
                        }
                        if(apply8){
                            String p="policy8";
                            String query0 ="insert into policies values('"+AC+"','"+p+"');";
                            stmt.executeUpdate(query0);
                        }
                        if(apply9){
                            String p="policy9";
                            String query0 ="insert into policies values('"+AC+"','"+p+"');";
                            stmt.executeUpdate(query0);
                        }
                        if(apply10){
                            String p="policy10";
                            String query0 ="insert into policies values('"+AC+"','"+p+"');";
                            stmt.executeUpdate(query0);
                        }
                        }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                          }
                          }
             
                public class backListener2 implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    }
                }
            }
             public class Listener08 implements ActionListener{
                JFrame newframe;
                public void actionPerformed(ActionEvent ev){
                    newframe=new JFrame();
                    newframe.setSize(1370,730);
                    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newframe.setVisible(true);
                    frame02.setVisible(false);
                    MyDrawPanel newpanel=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.CENTER,newpanel);
                    newpanel.setLayout(new BoxLayout(newpanel,BoxLayout.Y_AXIS));
                    Font BigFont2 = new Font("Arial",Font.PLAIN,30);
                    MyDrawPanel panel5=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.NORTH,panel5);
                    panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                    MyDrawPanel panel6=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.SOUTH,panel6);
                    panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel5.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                    label08.setFont(BigFont3);
                    panel6.add(label08);
                    JButton Back=new JButton("BACK");
                    Back.addActionListener(new backListener());
                    panel5.add(Back);
                     /*Other Code*/
                    /*JButton button011=new JButton("OK");
                    button011.addActionListener(new button011Listener());
                    newpanel.add(button011);
                }
                public class button011Listener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);*/
                   
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        String query="select policies from policies where Accountno='"+AC+"';";
                        ResultSet rs=stmt.executeQuery(query);
                        JLabel label00=new JLabel("You have adopted the following policies:");
                        label00.setFont(BigFont2);
                        newpanel.add(label00);
                        while(rs.next()){
                            String s=label00.getText();
                            label00.setText(s+" "+rs.getString("policies")+"\n");
                        }
                       // String query="INSERT INTO Contact VALUES('"+Name+"','"+Mobile+"','"+Email+"');";
                       // stmt.executeUpdate(query);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                    }
             
                
                public class backListener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    }
                }
             }
            }
             public class Listener09 implements ActionListener{
                JFrame newframe;
                public void actionPerformed(ActionEvent ev){
                    newframe=new JFrame();
                    newframe.setSize(1370,730);
                    newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newframe.setVisible(true);
                    frame02.setVisible(false);
                    MyDrawPanel newpanel=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.CENTER,newpanel);
                    newpanel.setLayout(new BoxLayout(newpanel,BoxLayout.Y_AXIS));
                    Font BigFont2 = new Font("Arial",Font.PLAIN,50);
                    MyDrawPanel panel5=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.NORTH,panel5);
                    panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
                    MyDrawPanel panel6=new MyDrawPanel(Color.YELLOW,Color.GREEN);
                    newframe.getContentPane().add(BorderLayout.SOUTH,panel6);
                    panel6.setLayout(new BoxLayout(panel6,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel5.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                    label08.setFont(BigFont3);
                    panel6.add(label08);
                    JButton Back=new JButton("BACK");
                    Back.addActionListener(new backListener());
                    panel5.add(Back);
                     /*Other Code*/
                    JLabel label00=new JLabel("");
                    label00.setFont(BigFont2);
                    newpanel.add(label00);
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        //String query1="update loans set currentdate='curdate()' where accountno='"+AC+"';";
                        String query2="select * from loans where accountno='"+AC+"';";
                        //stmt.executeUpdate(query1);
                        ResultSet rs=stmt.executeQuery(query2);
                        if(rs.next()){
                            /*String s1=rs.getString("loandate");
                            String s2=rs.getString("currentdate");
                            String query3="select datediff(day,s1,s2)";
                            ResultSet rs1=stmt.executeQuery(query2);
                            int diff=rs1.getInt();*/
                            label00.setText("Loan Amount :"+rs.getString("LoanAmount"));
                        }else{label00.setText("No Loans Pending.");
                        }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                    
                    JButton button011=new JButton("PAY");
                    button011.addActionListener(new button011Listener());
                    newpanel.add(button011);
                }
                public class button011Listener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    /*Money Transfer Code GOes Here*/
                   // public void actionPerformed(ActionEvent ev){
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        String query1="select loanamount from loans where accountno='"+AC+"';";
                        ResultSet rs2=stmt.executeQuery(query1);
                        int loan=0;
                        if(rs2.next())loan=rs2.getInt("loanamount");
                        String query2="select balance from balance where accountno='"+AC+"';";
                        
                        ResultSet rs1=stmt.executeQuery(query2);
                        int bal=0;
                        if(rs1.next()){
                            bal=rs1.getInt("balance");
                            if(loan>bal)
                             JOptionPane.showMessageDialog(frame,"You don't have enough money!");  
                            else{
                                String query3="update balance set balance=balance-'"+loan+"' where accountno='"+AC+"';";
                                String query4="delete from loans where accountno='"+AC+"' and loanamount='"+loan+"';";
                                stmt.executeUpdate(query3);
                                stmt.executeUpdate(query4);
                            }
                        }
                        
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                    }
                }
                public class backListener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame02.setVisible(true);
                    newframe.setVisible(false);
                    }
                }
                
            }
        
        }
    
        public class button2Listener implements ActionListener{
        JTextField text1,text2,text3,text4;
        JPasswordField text5;
        JFrame frame3;
        public void actionPerformed(ActionEvent ev){
            frame3=new JFrame();
            JButton button3=new JButton("Create new Account");
            MyDrawPanel panel3=new MyDrawPanel(Color.MAGENTA,Color.PINK);
            MyDrawPanel panel31=new MyDrawPanel(Color.MAGENTA,Color.PINK);
           /* MyDrawPanel panel32=new MyDrawPanel();*/
            MyDrawPanel panel32=new MyDrawPanel(Color.MAGENTA,Color.PINK);
           
           /* MyDrawPanel panel34=new MyDrawPanel();*/
            frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame3.getContentPane().add(BorderLayout.CENTER,panel3);
            
            frame3.getContentPane().add(BorderLayout.NORTH,panel31);
            panel31.setLayout(new BoxLayout(panel31,BoxLayout.Y_AXIS));
           /* frame3.getContentPane().add(BorderLayout.SOUTH,panel32);
            frame3.getContentPane().add(BorderLayout.EAST,panel33);*/
           
                    frame3.getContentPane().add(BorderLayout.SOUTH,panel32);
                   // panel32.setLayout(new BoxLayout(panel32,BoxLayout.Y_AXIS));
                    JLabel label07=new JLabel("WELCOME TO THE BANK");
                    Font BigFont = new Font("Arial",Font.PLAIN,100);
                    label07.setFont(BigFont);
                    panel31.add(label07);
                    JLabel label08=new JLabel("THANK YOU FOR USING OUR SERVICES");
                    Font BigFont3 = new Font("Arial",Font.PLAIN,60);
                    label08.setFont(BigFont3);
                    panel32.add(label08);
            //frame3.getContentPane().add(BorderLayout.WEST,panel34);
           // panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
            frame3.setSize(1370,720);
            //frame3.setResizable(false);
            frame3.setVisible(true);
            frame.setVisible(false);
            Font BigFont1 = new Font("Times New Roman",Font.BOLD,60);
            Font BigFont2 = new Font("Arial",Font.BOLD,30);
            JLabel label = new JLabel("PLEASE ENTER THE FOLLOWING DETAILS:");
            label.setFont(BigFont1);
            JLabel label1 = new JLabel("Name:         ");
            label1.setFont(BigFont2);
            text1=new JTextField(100);
            JLabel label2 = new JLabel("Email id      ");
            label2.setFont(BigFont2);
            text2=new JTextField(100);
            JLabel label3 = new JLabel("Contact number");
            label3.setFont(BigFont2);
            text3=new JTextField(100);
            JLabel label4 = new JLabel("Username      ");
            label4.setFont(BigFont2);
            text4=new JTextField(100);
            JLabel label5 = new JLabel("Password      ");
            label5.setFont(BigFont2);
            text5=new JPasswordField(100);
            
             JButton Back=new JButton("BACK");
                    Back.addActionListener(new backListener());
                    panel31.add(Back);
                    panel31.add(label);
            panel3.add(label1);
            panel3.add(text1);
            panel3.add(label2);
            panel3.add(text2);
            panel3.add(label3);
            panel3.add(text3);
            panel3.add(label4);
            panel3.add(text4);
            panel3.add(label5);
            panel3.add(text5);
            panel3.add(button3);
            //frame3.getContentPane().add(BorderLayout.SOUTH,button3);
            button3.addActionListener(new button3Listener());
            /*public void actionPerformed(ActionEvent ev){
                Details customer=new Details();
                customer.setUsername(text1.getText());*/
                
            }
            public class button3Listener implements ActionListener{
                JFrame frame4;
                
                public void actionPerformed(ActionEvent ev){
                    String Name=text1.getText();
                    String Emailid=text2.getText();
                    String iContactno= text3.getText();
                    int Contactno=Integer.parseInt(iContactno);
                    String Username=text4.getText();
                    String Password=text5.getText();
                    if (Name.isEmpty())JOptionPane.showMessageDialog(frame,"Name not Entered");
                    else if (Emailid.isEmpty())JOptionPane.showMessageDialog(frame,"Emailid not Entered");
                    else if (iContactno.isEmpty())JOptionPane.showMessageDialog(frame,"Contact number not Entered");
                    else if (Username.isEmpty())JOptionPane.showMessageDialog(frame,"Username not Entered");
                    else if (Password.isEmpty())JOptionPane.showMessageDialog(frame,"Password not Entered");
                    else{
                    try{
                        Class.forName("java.sql.DriverManager");
                        Connection con = (Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","1234");
                        Statement stmt = (Statement) con.createStatement();
                        String query1="SELECT Name FROM userinfo WHERE Username='"+Username+"';";
                        
                        ResultSet rs = stmt.executeQuery(query1);
                       if(rs.next())JOptionPane.showMessageDialog(frame,"Username Already Exists");
                       else{
                           AC=Details.generateAccountNumber();
                           String query="INSERT INTO userinfo VALUES('"+Name+"','"+Emailid+"','"+Contactno+"','"+Username+"','"+Password+"','"+AC+"');";
                           stmt.executeUpdate(query);
                           String query01="insert into balance values('"+AC+"','"+0+"');";
                           stmt.executeUpdate(query01);
                      
                        
                    /*Details customer=new Details();
                    customer.setName(text1.getText());
                    customer.setEmailid(text2.getText());
                    customer.setPhno(text3.getText());
                    customer.setUsername(text4.getText());
                    customer.setPassword(text5.getText());
                    try{
                        FileOutputStream fs=new FileOutputStream("Banking.ser");
                        ObjectOutputStream os=new ObjectOutputStream(fs);
                        os.writeObject(customer);
                       // os.close();
                        }catch(Exception ex){
                        ex.printStackTrace();
                    }
                    JFrame frame4=new JFrame();
                    frame4.setVisible(true);
                    frame4.setSize(600,600);
                    frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
                    //frame3.setVisible(false);
                    frame4=new JFrame();
                    MyDrawPanel panelf=new MyDrawPanel(Color.gray,Color.LIGHT_GRAY);
                    frame4.setContentPane(panelf);
                    frame4.pack();
                    Font BigFont1 = new Font("Times New Roman",Font.BOLD,35);
                    JLabel labelf=new JLabel("Your Account Number is:      "+AC);
                    labelf.setFont(BigFont1);
                    JLabel labelf2=new JLabel("Please go back and login.        ");
                    labelf2.setFont(BigFont1);
                    JButton buttonf=new JButton("OK");
                    buttonf.addActionListener(new oklistener());
                    frame4.setSize(700,700);
                    frame4.setVisible(true);
                    panelf.add(labelf);
                    panelf.add(labelf2);
                    panelf.add(buttonf);
                   // Customer=customer;
                     }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(frame,e.getMessage());
                    }
                }
            
                }
           
                public class oklistener implements ActionListener{
                    public void actionPerformed(ActionEvent ev){
                        frame.setVisible(true);
                        frame4.setVisible(false);
                        frame3.setVisible(false);
                    }
                }
            }
                public class backListener implements ActionListener{
                     public void actionPerformed(ActionEvent ev){
                    frame.setVisible(true);
                    frame3.setVisible(false);
                    }
                }
            }
    }

 


