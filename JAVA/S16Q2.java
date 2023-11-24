import javax.swing.*;  
class S16Q2  
{  
          JMenu menu, submenu,m1,m2;  
          JMenuItem i1, i2, i3, i4, i5, i6, i7,i8;  
          S16Q2()
          {  
          JFrame f= new JFrame("Menu and MenuItem Example");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("FILE");  
          m1=new JMenu("EDIT");
          m2=new JMenu("HELP");
          i1=new JMenuItem("NEW");  
          i2=new JMenuItem("OPEN");  
          submenu =new JMenu("SAVE AS");
          i4=new JMenuItem("docx");  
          i5=new JMenuItem("pdf");
          i6=new JMenuItem("img");
          i7=new JMenuItem("ppt");
          i3=new JMenu("SHOW ABOUT"); 
          i8=new JMenu("Exit"); 
          menu.add(i1); menu.add(i2); menu.add(i3);  
          submenu.add(i4); submenu.add(i5); submenu.add(i6); submenu.add(i7);  
          menu.add(submenu);menu.add(i8);
          mb.add(menu);  
          mb.add(m1);
          mb.add(m2);        
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
}  
public static void main(String args[])  
{  
new S16Q2();  
}}  