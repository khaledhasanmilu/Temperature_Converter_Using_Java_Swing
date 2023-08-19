import javax.swing.*;
import java.awt.event.*;
public class Converter {
    public static void main(String[] args) {
        //comboBox option
        String s1[]={"Celcius","Farenheight","Kelvin"};

        //Jframe
        JFrame jFrame = new JFrame("Temperature Converter");
        jFrame.setSize(550,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        //JtextField
        JTextField show1 = new JTextField();
        show1.setBounds(100,60,90,40);
        JTextField show2 = new JTextField();
        show2.setBounds(100,300,170,40);
        jFrame.add(show1);
        jFrame.add(show2);

        //JLabel
        JLabel jLabel1 = new JLabel("Temp:");
        JLabel jLabel2 = new JLabel("Convert To:");
        JLabel jabel3 = new JLabel("Result:");
        jLabel1.setBounds(40,60,60,40);
        jLabel2.setBounds(40,110,75,40);
        jabel3.setBounds(40,300,60,40);
        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.add(jabel3);

        //JButton
        JButton jButton = new JButton("Convert");
        jButton.setBounds(150,165,90,30);
        jFrame.add(jButton);

        //JComboBox
        JComboBox jComboBox1 = new JComboBox(s1);
        JComboBox jComboBox2 = new JComboBox(s1);
        jComboBox1.setBounds(200,60,100,40);
        jComboBox2.setBounds(120,110,100,40);
        jFrame.add(jComboBox1);
        jFrame.add(jComboBox2);

        //Function Setup
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(jComboBox1.getSelectedIndex()==0 && jComboBox2.getSelectedIndex()==0){
                   show2.setText(show1.getText()+" `C");
               }
               else if(jComboBox1.getSelectedIndex()==0 && jComboBox2.getSelectedIndex()==1 ){
                   double f = Double.parseDouble(show1.getText());
                   double result = ((9*f)/5)+32;
                   show2.setText(String.valueOf(result)+" `F");
               }
               else if(jComboBox1.getSelectedIndex()==0 && jComboBox2.getSelectedIndex()==2) {
                   double c = Double.parseDouble(show1.getText());
                   double result = c + 273;
                   show2.setText(String.valueOf(result)+" `K");
               }
               else if(jComboBox1.getSelectedIndex()==1 && jComboBox2.getSelectedIndex()==0) {
                   double f = Double.parseDouble(show1.getText());
                   double result = (5*(f-32))/9;
                   show2.setText(String.valueOf(result)+" `C");
               }
               else if(jComboBox1.getSelectedIndex()==1 && jComboBox2.getSelectedIndex()==1) {
                   show2.setText(show1.getText()+" `F");
               }
               else if(jComboBox1.getSelectedIndex()==1 && jComboBox2.getSelectedIndex()==2) {
                   double f = Double.parseDouble(show1.getText());
                   double result = (5*(f-32)/9)+273;
                   show2.setText(String.valueOf(result)+" `K");
               }
               else if(jComboBox1.getSelectedIndex()==2 && jComboBox2.getSelectedIndex()==0) {
                   double k = Double.parseDouble(show1.getText());
                   double result = (k-273);
                   show2.setText(String.valueOf(result)+" `C");
               }
               else if(jComboBox1.getSelectedIndex()==2 && jComboBox2.getSelectedIndex()==1) {
                   double k = Double.parseDouble(show1.getText());
                   double result = (9*(k-273)/5)+32;
                   show2.setText(String.valueOf(result)+" `F");
               }
               else if(jComboBox1.getSelectedIndex()==2 && jComboBox2.getSelectedIndex()==2) {
                   show2.setText(show1.getText()+" `K");
               }
            }
        });

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
