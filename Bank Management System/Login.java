import java.awt.*;  //importing all java awt class extenion 

import java.awt.event.*; //imorting event package so that our buttons could listen to text

import javax.swing.*;    //importing all java swing class extenion 

public class Login extends JFrame implements ActionListener{  //login class is created and called in main function

    JButton login, signup, clear;   //globally defining the butoon so that we can use in another class

    JTextField cardTextField;

    JPasswordField pinTextField;

    Login() {

        setTitle("AUTOMATED TELLER MACHINE");   //Seting the title of the file
        setLayout(null);
         
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));     //importing the icon image from the icon folder
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);

        ImageIcon i3 = new ImageIcon(i2);           //setting the size and place of the image
        JLabel label= new JLabel(i3);
        label.setBounds(70,10, 100,100);
        add(label);

        JLabel text= new JLabel("Welcome to ATM");       // setting the font of the label
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);



        JLabel cardno= new JLabel("Card No.");   // setting the card no. font 
        cardno.setFont(new Font("Raleway", Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);

        cardTextField = new JTextField(); //setting the textfield of the cardno with its size
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardTextField);



        JLabel pin= new JLabel("Pin");   // setting the pin font
        pin.setFont(new Font("Raleway", Font.BOLD,28));
        pin.setBounds(120,220,400,40);
        add(pin);


        pinTextField = new JPasswordField();  //setting the textfield of the pin with its size
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(pinTextField);

        //creating buttons
        login= new JButton("SIGN IN");   //Login button
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this); // adding actions to the buttons
        add(login);


        clear= new JButton("CLEAR");   //Clear Button
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this); // adding actions to the buttons
        add(clear);

        signup= new JButton("SIGN UP");   //SignUp button
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this); // adding actions to the buttons
        add(signup);
        


        getContentPane().setBackground(Color.white);  //set background colour
        
        setSize(800,480); //setting the size of the opening window
        setVisible(true);
        setLocation(350,200);     // setting the location of the window
    }


    public void actionPerformed(ActionEvent ae){  //using abstract method for overriding 
       
        if(ae.getSource() == clear)
        {
            cardTextField.setText("");  //clearing the text of cardno
            pinTextField.setText("");  //clearing the text of pin no
        }
        else if(ae.getSource() == login)
        {

        }
        else if(ae.getSource() == signup)
        {
            
        }

    }

    public static void main(String args[])
    {
        new Login();  //main class execute another class so that it directly opens the window
    }
}