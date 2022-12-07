import java.awt.*;  
import javax.swing.*;  
public class Panel{  
     Panel()  
        {  
        JFrame f= new JFrame("Tic-Tac-Toe");    
        JPanel panel=new JPanel();  
        panel.setBounds(20,80,150,150);    
        panel.setBackground(Color.gray); 
        
        JButton b1=new JButton(" ");     
        b1.setBounds(50,100,40,40);    
        b1.setBackground(Color.yellow);   
        JButton b2=new JButton(" ");   
        b2.setBounds(100,100,40,40);    
        b2.setBackground(Color.green);   
        JButton b3=new JButton(" ");   
        b3.setBounds(150,100,40,40);    
        b3.setBackground(Color.yellow);
          
        JButton b4=new JButton(" ");   
        b4.setBounds(50,150,40,40);    
        b4.setBackground(Color.green);
        JButton b5=new JButton(" ");   
        b5.setBounds(100,150,40,40);    
        b5.setBackground(Color.yellow);
        JButton b6=new JButton(" ");   
        b6.setBounds(150,150,40,40);    
        b6.setBackground(Color.green);

        JButton b7=new JButton(" ");   
        b7.setBounds(50,200,40,40);    
        b7.setBackground(Color.yellow);
        JButton b8=new JButton(" ");   
        b8.setBounds(100,200,40,40);    
        b8.setBackground(Color.green);
        JButton b9=new JButton(" ");   
        b9.setBounds(150,200,40,40);    
        b9.setBackground(Color.yellow);
        
        

        panel.add(b1); panel.add(b2); panel.add(b3);
        panel.add(b4); panel.add(b5); panel.add(b6);
        panel.add(b7); panel.add(b8); panel.add(b9);
        f.add(panel);  
                f.setSize(400,400);    
                f.setLayout(null);    
                f.setVisible(true);    
        } 

    public void ticPage() {
    String s = (String)JOptionPane.showInputDialog(new JFrame(),
           "o/x?",
           "Pick Your Team",
           JOptionPane.PLAIN_MESSAGE
         );
    if(s.equals("o")){
      oPick();
    }
}

  public void oPick(){
    String s = (String)JOptionPane.showInputDialog(new JFrame(),
           "Bot or Player");
  }
  
  // public void Bot(){
  //   String s = (String)JOptionPane.showInputDialog(new JFrame());
  //   if(s.equals("Bot")){
  //     RunBot();
  //   }
    
  //   public void RunBot(){
  //     Random select = new Random();
  //     select.nextInt(9) +1;

  //   }
  // }
//   ArrayList<Random> list = new ArrayList<Random>();
// list.add(row1column1);
// list.add(row1column2);
// list.add(row1column3);
// list.add(row2column1);
// list.add(row2column2);
// list.add(row2column3);
// list.add(row3column1);
// list.add(row3column2);
// list.add(row3column3);
// int index = 0;
// while(index < list.size()){
// 	list.remove(index);
// 	index++;
// }

    }  