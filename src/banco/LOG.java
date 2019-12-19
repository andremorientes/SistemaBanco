/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.io.*;

import javax.swing.*;

public class LOG extends JFrame{
  ImageIcon ico =new ImageIcon(this.getClass().getResource("folder/login.png"));    
    JLabel lblcod = new JLabel("Senha");
    JLabel lblNome = new JLabel("Nome");
     
    
    JLabel butico = new JLabel(ico);
    
     JPasswordField txtcod = new   JPasswordField ();
     JTextField txtNome = new  JTextField ();
    
    JButton  butAceder = new JButton("Aceder");
    JButton butCancelar = new JButton("Cancelar");
   
    JPanel painel =new JPanel();
    Container cont = getContentPane();
        
    
    
public LOG(){
        
   painel.setLayout(null);
   
   painel.add(lblcod);
   painel.add(lblNome);
  
   painel.add(txtcod);
   painel.add(txtNome);
   
   painel.add(butAceder);
   painel.add(butCancelar);
   painel.add(butico);
   
   cont.add(painel);
   
   lblNome.setBounds(170,17,100,25);
   lblcod.setBounds(170,65,100,25);
   
   txtNome.setBounds(170,40,320, 27);       
   txtcod.setBounds(170,88,320,27);         
   
   butAceder.setBounds(180,135,130,27);
   butCancelar.setBounds(350,135,130,27);
   butico.setBounds(5,20,155,155); 
  
   ico.setImage(ico.getImage().getScaledInstance(butico.getHeight(), butico.getWidth(), 1));
  
   lblcod.setForeground(Color.black) ;
   lblNome.setForeground(Color.black);
   
  painel.setBackground(new Color(0,204,255));
  butCancelar.setBackground(Color.white);
  butAceder.setBackground(Color.white);
  butico.setBackground(Color.white);
    
   butCancelar.setToolTipText("Encerar o Programa");
   butAceder.setToolTipText("Abrir Formulario Principal");
   
   this.setSize(540,230);
   this.setLocation(390, 240);
   this.setVisible(true);
   this.setResizable(false);
   this.setTitle("Formalario Login");
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
   
   
   
   
        
       
    butCancelar.addActionListener((ActionEvent e) -> {
         System.exit(0);
      });
      
       
  
      
     butAceder.addActionListener((ActionEvent e) -> {
         
        Abrir();
        
           });
                   
        
    }
    
    
    
public void Abrir(){
 String nome="", senha="",co="";   
   try{
File f=new File("ADM.txt");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);

nome=br.readLine();

while(nome!=null){
senha=br.readLine();
co=br.readLine();
if(nome.equals(txtNome.getText()) && senha.equals(txtcod.getText())){
dispose();
new Banco();
break;
}
nome=br.readLine();
}
br.close();
}catch(IOException e){JOptionPane.showMessageDialog(null,"Falha na Leitura", "Erro",JOptionPane.ERROR_MESSAGE); 
}
    }
    
    
    
public static void main (String args[]){
    new LOG();
}
    
    
}