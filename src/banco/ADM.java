/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Antonio Cua
 */
public class ADM extends JFrame{
    Vector x = new Vector ();

//ImageIcon icon =new ImageIcon(this.getClass().getResource("folder/190657.png"));
    
//JLabel foto = new JLabel(icon);    
  
JLabel lblcod = new JLabel("Senha do Usuário:");
JLabel lblNome = new JLabel("Nome do Usuário: ");
JLabel lblconfirmacao = new JLabel("Confirmação da Senha:");
    
JTextField txtcod = new JTextField();
JTextField txtconfirmacao = new JTextField();
JTextField txtNome = new  JTextField ();
  
JButton butAceder = new JButton("Registar");
JButton butS = new JButton("Limpar");
JButton butCancelar = new JButton("Voltar");

    
 JPanel pan1 = new JPanel();   
JPanel painel =new JPanel();
Container cont = getContentPane();
    
public ADM(){
    
    
  painel.setLayout(null);
   
painel.add(lblcod);
painel.add(lblNome);
 
painel.add(lblconfirmacao);
painel.add(txtconfirmacao);
  
painel.add(txtcod);
painel.add(txtNome);
   
painel.add(butAceder);
painel.add(butS);
painel.add(butCancelar);
//painel.add(foto);

   
cont.add(painel);
painel.setBackground(new Color(255,204,204));
   
 
   lblconfirmacao.setBounds(70, 130,150, 25);  lblconfirmacao.setForeground(Color.black);
    lblNome.setBounds(70,40,120,25);          lblNome.setForeground(Color.black);
   lblcod.setBounds(70,85,120,25);            lblcod.setForeground(Color.black); 
   
   txtNome.setBounds(250,40,260, 27);       
   txtcod.setBounds(250,85,240,27);         
   txtconfirmacao.setBounds(250, 130, 240, 27);
   
   
   
   butAceder.setBounds(50,180,150,26);           butAceder.setBackground(Color.white);
   butS.setBounds(225,180,150,26);              
   butCancelar.setBounds(400, 180, 150, 26);    butCancelar.setBackground(Color.white); 

butS.setBackground( Color.white);
      
   butAceder.setForeground(Color.black);
   butCancelar.setForeground(Color.black);
   butS.setForeground(Color.black);
  
   
    
   pan1.setBorder(BorderFactory.createTitledBorder(null,"Cadastro Usuário"));
   pan1.setLayout(null);
   pan1.setBounds(10, 10, 575, 220);
   pan1.setBackground(new Color(255,204,204));
   //pan1.setBorder(BorderFactory.createTitledBorder(null,"Cadastro Usuario",TitledBorder.LEFT, 1, null, Color.black));
    
   painel.add(pan1);
   
   
   
 
  this.setSize(600,280);
  this.setLocation(390, 200);
   this.setVisible(true);
   this.setResizable(false);
   this.setTitle("Registo Dos Usuários");
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
   
    
   butAceder.addActionListener((ActionEvent e) -> {
      
     at();
                 });
      
   butS.addActionListener((ActionEvent e) -> {
    txtNome.setText(""); txtcod.setText(""); txtconfirmacao.setText(null);
        
           });
   
   butCancelar.addActionListener((ActionEvent e) -> {
      
       dispose();
       
        
           });
   
     
    
    
    
}   
    
    
public void at(){
    String a,b;
    a=txtcod.getText();
    b=txtconfirmacao.getText();
   
    
    if(a.equals(b)){
        
    registo();
    
}else{ 
            
        JOptionPane.showMessageDialog(null,"Verifique a Senha e Confirmacao da Senha.");
    }
    
}
    




public void registo(){
     va y = new va();
     
 
           
 y.co=txtconfirmacao.getText();
 y.nome=txtNome.getText();
 y.senha=txtcod.getText(); 
 
 x.addElement(y);
 
   JOptionPane.showMessageDialog(null,"Registo Feito com Sucesso. Obrigado !!");
    txtNome.setText(null);
   txtcod.setText(null);
   txtconfirmacao.setText(null);
    Texto(); 
     }
 
 
//==============================================================================
   public void Texto(){
   try {
       
        File f = new File("ADM.txt");
       FileWriter fw = new FileWriter(f,true); 
       BufferedWriter bw = new BufferedWriter(fw);        
      va y;   
      
   for(int i=0;i<x.size();i++){ 
          y=(va) x.get(i);     
     
       bw.write(y.nome); bw.newLine();
       bw.write(y.senha);bw.newLine();
       bw.write(y.co); bw.newLine();
         
       
  }  
   bw.close();
     } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Escrever");}
    
   } 
   




/*
public void procurar(){
    Sup y;

          String nome =txtNome.getText();
        
         txtcod.setText("");  
         txtconfirmacao.setText("");
           
        for(int i=0;i<x.size();i++){
         y=(Sup)  x.get(i); 
         
         if(y.nome.equals(nome)){
             
             txtcod.setText(y.co);  
             txtconfirmacao.setText(y.co);  
             
         }
}
        
}
    */


public void procurar(){
String nome="----",senha="---";     
     try{
File f=new File("ADM.TXT");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);


nome=br.readLine();


while(nome!=null){
    
senha=br.readLine();

if(nome.equals(txtNome.getText()) ){

 txtcod.setText(nome);  
 txtconfirmacao.setText(senha);  
               
           
    break;
}
nome=br.readLine();
}

    }catch(Exception e){ JOptionPane.showMessageDialog(null,"Verifique os Seus Dados!");    }
     
        
    }
    
    
public static void main(String args [])  {
    new ADM();
    
}  
}

