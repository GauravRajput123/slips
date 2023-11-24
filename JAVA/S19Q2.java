import javax.swing.*;    
import java.awt.event.*;    
public class S19Q2 {    
JFrame f;    
S19Q2(){    
    f=new JFrame("T. Y. B.Sc.(Computer Science)");   
    final JLabel label = new JLabel();          
    label.setHorizontalAlignment(JLabel.CENTER);  
    label.setSize(400,100);  
    JButton b=new JButton("Show");  
    b.setBounds(200,100,75,20);  
    String subjects[]={"Foundation of Data Science","Internet Programming","Blockchain","Java","Python","TCS","networking"};        
    final JComboBox cb=new JComboBox(subjects);    
    cb.setBounds(50, 100,90,20);    
    f.add(cb); f.add(label); f.add(b);    
    f.setLayout(null);    
    f.setSize(550,350);    
    f.setVisible(true);       
    b.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) {       
String data = "Selected subject is : "+ cb.getItemAt(cb.getSelectedIndex());  
label.setText(data);  
}  
});           
}    
public static void main(String[] args) {    
    new S19Q2();         
}    
}