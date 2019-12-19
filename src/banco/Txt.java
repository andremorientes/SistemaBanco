/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Antonio Cua
 */
public class Txt {
      
//----------------------------Conexao Base de Dados---------------------------------
private String driver="com.mysql.jdbc.Driver";
private String url="jdbc:mysql://localhost:3306/sgv?zeroDateTimeBehavior=convertToNull";
private String user="root";
private String pass="";
private Connection con=null;
private Statement sta=null;
private ResultSet resultado=null; 
//-------------------___--------------___----------------------------___------------
//double sum
//public void prencher(){
//   
//    try{
//                     
//           Class.forName(driver);
//           //--------------------Limpando tabela----------------------------
//           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//           
//          ((DefaultTableModel)jTable1.getModel()).setNumRows(0); 
//          
//           jTable1.updateUI(); 
//           //---------------------------------------------------------------
//           
//           String [] linha= new String [14];
//           
//          this.con=DriverManager.getConnection(url, user, pass);
//          sta=con.createStatement();
//
//         String query2="select Matricula,QuantidadeAbastecida,ValorPago,KmRodado"
//                 + " from combustivel order by CodigoAbastecimento asc";
//            
//         
//         String a ="select QuantidadeAbastecida,ValorPago,KmRodado from combustivel where matricula=(select matricula from viatura) "
//                 + "and marca=(select marca from viatura) modelo;";
//          this.resultado=sta.executeQuery(query2);
//            
//          while(resultado.next()){   
//             
//             linha[0]=resultado.getString("DtaAbastecimento");
//             linha[1]=resultado.getString("NomeBombas");
//             linha[2]=resultado.getInt("CodigoAbastecimento")+"";
//             linha[3]=resultado.getString("Matricula");
//             linha[4]=resultado.getString("Marca");
//             linha[5]=resultado.getString("Modelo"); 
//             linha[6]=resultado.getDouble("ValorPago")+"0"; 
//             linha[7]=resultado.getDouble("ValorLitro")+""; 
//             linha[8]=resultado.getDouble("QuantidadeAbastecida")+""; 
//             linha[9]=resultado.getInt("KmInicial")+""; 
//             linha[10]=resultado.getInt("KmFinal")+""; 
//             linha[11]=resultado.getInt("KmRodado")+""; 
//             linha[12]=resultado.getDouble("PrecoKmRodado")+""; 
//             linha[13]=resultado.getDouble("MediaKmLitro")+"";
//              
//           model.addRow(linha);
//           
//            }
//       }catch(SQLException e){
//            JOptionPane.showMessageDialog(null, "Falha na busca dos dados \n"
//                   + "Descrição do erro: \n"
//                   + "- "+e+" ","Erro de pesquisa Tabela", JOptionPane.ERROR_MESSAGE);
//           
//       }catch(ClassNotFoundException e){
//            JOptionPane.showMessageDialog(null, "Driver ");  
//       }
//       catch(NumberFormatException e){
//           JOptionPane.showMessageDialog(null, "Falha de numero"); 
//       }      
//    }
////
}