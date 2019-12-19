
package banco;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Antonio Cua
 */
public class Banco extends JFrame{
Vector x = new Vector();
Vector xy = new Vector();
Vector xyz = new Vector();
ImageIcon Ft= new ImageIcon(); 
String date = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
String time = new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
    
//-----------------------------Tabela--------------------------------------------------
String colunas []= {"Número da Conta","tipo","moeda","Saldo", "Data de Abertura"};
Object dados[][];
    
DefaultTableModel modeloTab = new  DefaultTableModel(dados,colunas);
JTable tabelaNomes = new JTable(modeloTab);  
JScrollPane scrollNome = new JScrollPane(tabelaNomes);
    
JPanel pp = new JPanel();
//--------------------------------------------------------------------------------

//-----------------------------Iamgens e Icons Busca-------------------------------------
ImageIcon i =new ImageIcon(this.getClass().getResource("folder/cp.png"));
ImageIcon ic1 =new ImageIcon(this.getClass().getResource("folder/sign.png"));
ImageIcon ic2 =new ImageIcon(this.getClass().getResource("folder/edit.png"));
ImageIcon ic3 =new ImageIcon(this.getClass().getResource("folder/op.png"));
ImageIcon ic4 =new ImageIcon(this.getClass().getResource("folder/disk.png"));
ImageIcon ic5 =new ImageIcon(this.getClass().getResource("folder/cuser.png"));
ImageIcon ic6 =new ImageIcon(this.getClass().getResource("folder/coins.png"));
ImageIcon ic7 =new ImageIcon(this.getClass().getResource("folder/leva.png"));
ImageIcon ic8 =new ImageIcon(this.getClass().getResource("folder/tra.png"));
ImageIcon ic9 =new ImageIcon(this.getClass().getResource("folder/cross.png"));
ImageIcon ic10 =new ImageIcon(this.getClass().getResource("folder/ant.png"));
ImageIcon ic11 =new ImageIcon(this.getClass().getResource("folder/at.png"));
ImageIcon ic12 =new ImageIcon(this.getClass().getResource("folder/money.png"));
ImageIcon ic13 =new ImageIcon(this.getClass().getResource("folder/add.png"));
ImageIcon ic14 =new ImageIcon(this.getClass().getResource("folder/delete.png"));
ImageIcon ic15 =new ImageIcon(this.getClass().getResource("folder/pro.png"));
ImageIcon ic16 =new ImageIcon(this.getClass().getResource("folder/appedit.png"));
ImageIcon ic17 =new ImageIcon(this.getClass().getResource("folder/report.png"));
ImageIcon ic18 =new ImageIcon(this.getClass().getResource("folder/Erase.png"));
ImageIcon ic19 =new ImageIcon(this.getClass().getResource("folder/view.png"));
ImageIcon ic23 =new ImageIcon(this.getClass().getResource("folder/Up.png"));
ImageIcon ic24 =new ImageIcon(this.getClass().getResource("folder/Create.png"));
ImageIcon ic25 =new ImageIcon(this.getClass().getResource("folder/del.gif"));
ImageIcon ic26 =new ImageIcon(this.getClass().getResource("folder/venda.png"));
ImageIcon ic27 =new ImageIcon(this.getClass().getResource("folder/Undo.png"));
ImageIcon ic28 =new ImageIcon(this.getClass().getResource("folder/userc.png"));
ImageIcon ic29 =new ImageIcon(this.getClass().getResource("folder/house.png"));
ImageIcon ic30 =new ImageIcon(this.getClass().getResource("folder/Back.png"));


ImageIcon ic20 =new ImageIcon(this.getClass().getResource("folder/sel.png"));
ImageIcon ic21 =new ImageIcon(this.getClass().getResource("folder/Save.png"));
ImageIcon ic22 =new ImageIcon(this.getClass().getResource("folder/merca.png"));


ImageIcon b =new ImageIcon(this.getClass().getResource("folder/Back.png"));
ImageIcon bt =new ImageIcon(this.getClass().getResource("folder/FOTO.png"));
JButton Foto = new JButton("Foto");
//--------------------------------------------------------------------------------------
 
      
       
JLabel a = new JLabel(b);
JLabel foot = new JLabel("Sistema de Informação do Banco Metical- 2019                   Data: " +date);

//-------------------------------------------------
JDesktopPane jdpDesktop;
static int openFrameCount = 0;
JPanel p = new JPanel();    
int m=0;   
int indice=0;
//--------------------------------------------------
    public Banco(){
    
    
       
p.setLayout(null);
p.add(a);
p.add(foot);
p.add(pp);

pp.setBorder(BorderFactory.createLineBorder(Color.white));
pp.setBackground(new Color(0,204,255));
pp.setLayout(null);
pp.setBounds(-10, -10, 1400, 595);

a.setBounds(250, 70, 820, 460);
foot.setBounds(300, 595, 800, 26);
foot.setFont(new Font("Comic Sans MS",Font.BOLD,16));
foot.setForeground(Color.white);
b.setImage(b.getImage().getScaledInstance(a.getWidth(),a.getHeight(),1)); 

//------------------------------------------------------------------------------
 JMenuBar bara = new JMenuBar();  
 bara.setBackground(new Color(0,153,255)); 
 


JMenu mregisto = new JMenu("Cadastrar");mregisto.setForeground(Color.white); mregisto.setIcon(ic2);
mregisto.setFont(new Font("Comic Sans MS",Font.BOLD,14));
JMenu mov = new JMenu("Movimento");mov.setForeground(Color.white); mov.setIcon(ic1);
mov.setFont(new Font("Comic Sans MS",Font.BOLD,14));
JMenu mop = new JMenu("Operações");mop.setForeground(Color.white);mop.setIcon(ic3);
mop.setFont(new Font("Comic Sans MS",Font.BOLD,14));
JMenu mexit = new JMenu("Fechar");mexit.setForeground(Color.white);mexit.setIcon(i);
mexit.setFont(new Font("Comic Sans MS",Font.BOLD,14));
JMenu musuario = new JMenu("Usuários");musuario.setForeground(Color.white);musuario.setIcon(ic28);
musuario.setFont(new Font("Comic Sans MS",Font.BOLD,14));

JMenuItem  iexit = new JMenuItem(" - Sair do Programa"); iexit.setIcon(ic9);
iexit.setForeground(Color.white);
iexit.setBackground(new Color(0,153,255));
iexit.setFont(new Font("Comic Sans MS",Font.BOLD,13));

JMenuItem iCL = new JMenuItem(" - Cliente e Conta"); iCL.setIcon(ic5);
iCL.setForeground(Color.white); 
iCL.setBackground(new Color(0,153,255));
iCL.setFont(new Font("Comic Sans MS",Font.BOLD,13));

//------------------------------------------------------------------------------

JMenuItem mopv = new JMenuItem(" - Ver todas contas de clientes");mopv.setIcon(ic10);
mopv.setForeground(Color.white); 
mopv.setBackground(new Color(0,153,255));
mopv.setFont(new Font("Comic Sans MS",Font.BOLD,13));
//
//JMenuItem mopE = new JMenuItem(" - Eliminar Cliente");mopE.setIcon(ic9);
//mopE.setForeground(Color.white); 
//mopE.setBackground(new Color(0,153,255));
//mopE.setFont(new Font("Comic Sans MS",Font.BOLD,13));
//
//JMenuItem mopT = new JMenuItem(" - Aumentar taxa de 2.5%");mopT.setIcon(ic13);
//mopT.setForeground(Color.white); 
//mopT.setBackground(new Color(0,153,255));
//mopT.setFont(new Font("Comic Sans MS",Font.BOLD,13));
JMenuItem iU = new JMenuItem("- Registar Usuários");iU.setIcon(ic2);
iU .setForeground(Color.white); 
iU .setBackground(new Color(0,153,255));
iU .setFont(new Font("Comic Sans MS",Font.BOLD,13));

JMenuItem mopa = new JMenuItem(" - Atualizar Movimento");mopa.setIcon(ic11);
mopa.setForeground(Color.white); 
mopa.setBackground(new Color(0,153,255));
mopa.setFont(new Font("Comic Sans MS",Font.BOLD,13));


JMenuItem mops = new JMenuItem(" - Saldo Geral das contas");mops.setIcon(ic12);
mops.setForeground(Color.white); 
mops.setBackground(new Color(0,153,255));
mops.setFont(new Font("Comic Sans MS",Font.BOLD,13));

JMenuItem mopV = new JMenuItem(" - Valor total do Banco por Moeda");mopV.setIcon(ic6);
mopV.setForeground(Color.white); 
mopV.setBackground(new Color(0,153,255));
mopV.setFont(new Font("Comic Sans MS",Font.BOLD,13));

mop.add(mopv);
//mop.add(mopE);
//mop.add(mopT);
mop.add(mopa);
mop.add(mops);
mop.add(mopV);
//==============================================================================

JMenuItem movD = new JMenuItem(" - Depósito");movD.setIcon(ic6);
movD.setForeground(Color.white); 
movD.setBackground(new Color(0,153,255));
movD.setFont(new Font("Comic Sans MS",Font.BOLD,13));

JMenuItem movL = new JMenuItem(" - Levantamento");movL.setIcon(ic7);
movL.setForeground(Color.white); 
movL.setBackground(new Color(0,153,255));
movL.setFont(new Font("Comic Sans MS",Font.BOLD,13));

JMenuItem movT = new JMenuItem(" - Transferência");movT.setIcon(ic8);
movT.setForeground(Color.white); 
movT.setBackground(new Color(0,153,255));
movT.setFont(new Font("Comic Sans MS",Font.BOLD,13));

mov.add(movD);
mov.add(movL);
mov.add(movT);
musuario.add(iU);
 //==============================================================================  




mexit.add(iexit);

mregisto.add(iCL);


bara.add(mregisto);
bara.add(mov);
bara.add(mop);
bara.add(musuario);
bara.add(mexit);


this.setJMenuBar(bara);


//------------------------------------------------------------------------------

jdpDesktop = new JDesktopPane(); 
setContentPane(jdpDesktop);
jdpDesktop.setBackground(new Color(0,153,255));
jdpDesktop.add(a);
jdpDesktop.add(pp);
jdpDesktop.add(foot);



 
//Cliente frame = new Cliente();
//frame.setVisible(true); 
//jdpDesktop.add(frame);

         
iU.addActionListener((ActionEvent e) -> {
    try{
      String a;
       a=JOptionPane.showInputDialog("Senha do Administrador?");
       if(a.equals("0000")){new ADM();} else{JOptionPane.showMessageDialog(null, "          Senha Errada!");}
       if(a.equals(null)){dispose();}
      
   } catch(NullPointerException v){JOptionPane.showMessageDialog(null,"Operação Cancelada. Obrigado!");}
      });
   
  iexit.addActionListener((ActionEvent e) -> {
   dispose();
      });

iCL.addActionListener((ActionEvent e) -> {
     Cliente cl = new Cliente(xy);
  
        cl.setVisible(true); 
         jdpDesktop.add(cl);
         try {
            cl.setSelected(true);
        } catch (java.beans.PropertyVetoException w) {}
  }
);

mopv.addActionListener((ActionEvent e) -> {
     ver cl = new ver(xy);
  
        cl.setVisible(true); 
         jdpDesktop.add(cl);
         try {
            cl.setSelected(true);
        } catch (java.beans.PropertyVetoException w) {}
  }
);


movD.addActionListener((ActionEvent e) -> {
     Depositar cl = new Depositar(xy);
  
        cl.setVisible(true); 
         jdpDesktop.add(cl);
         try {
            cl.setSelected(true);
        } catch (java.beans.PropertyVetoException w) {}
  }
);


movL.addActionListener((ActionEvent e) -> {
     Levantar cl = new Levantar(xy);
  
        cl.setVisible(true); 
         jdpDesktop.add(cl);
         try {
            cl.setSelected(true);
        } catch (java.beans.PropertyVetoException w) {}
  }
);



movT.addActionListener((ActionEvent e) -> {
     Transferir cl = new Transferir(xy);
  
        cl.setVisible(true); 
         jdpDesktop.add(cl);
         try {
            cl.setSelected(true);
        } catch (java.beans.PropertyVetoException w) {}
  }
);



mopa.addActionListener((ActionEvent e) -> {
     updateM cl = new updateM(xy);
  
        cl.setVisible(true); 
         jdpDesktop.add(cl);
         try {
            cl.setSelected(true);
        } catch (java.beans.PropertyVetoException w) {}
  }
);


mops.addActionListener((ActionEvent e) -> {
     saldoGeral cl = new saldoGeral(xy);
  
        cl.setVisible(true); 
         jdpDesktop.add(cl);
         try {
            cl.setSelected(true);
        } catch (java.beans.PropertyVetoException w) {}
  }
);


mopV.addActionListener((ActionEvent e) -> {
     Moeda cl = new Moeda(xy);
  
        cl.setVisible(true); 
         jdpDesktop.add(cl);
         try {
            cl.setSelected(true);
        } catch (java.beans.PropertyVetoException w) {}
  }
);


      



      
 





//------------------------------------------------------------------------------
  this.setSize(1320,680);
   this.setLocation(20, 30);
   this.setVisible(true);
   this.setResizable(false);
   this.setTitle("Sistema do Banco Metical 2019. Menu Principal");
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
//------------------------------------------------------------------------------  
 
    
    
    
    
    
    
    }
    
    
    
    
    
    public static void main(String[] args) {
        new Banco();
    }
 
    
    
    
//-----------------------------------------------------Campo de formularios JInternalFrame ------------------------- 
    
public class Cliente extends JInternalFrame {
    
static final int xPosition = 30, yPosition = 30;



JPanel Painel = new JPanel();
Container  c = getContentPane();
 
JLabel lblNUIT = new JLabel("NUIT:");
JLabel lblnome = new JLabel("Nome do Cliente:");
JLabel lblsexo = new JLabel("Sexo:");
JLabel lblDataN = new JLabel("Data de Nascimento: ");
JLabel lblContacto = new JLabel("Contacto:");

JLabel lblnumero = new JLabel("Número: ");
JLabel lbltipo = new JLabel("Tipo de conta: ");
JLabel lblmoeda = new JLabel("Moeda: ");
JLabel lblsaldo = new JLabel("Saldo: ");
JLabel lblDataA = new JLabel("Data de Abertura: ");

JLabel lblI = new JLabel("Contas Criadas pelo Cliente: ");



JTextField txtNUIT = new  JTextField();
JTextField txtnome = new  JTextField();
JComboBox txtsexo= new  JComboBox();
JTextField txtDataN = new  JTextField();
JTextField txtContacto = new  JTextField();

JTextField txtnumero = new  JTextField();
JComboBox txttipo = new  JComboBox();
JComboBox txtmoeda = new  JComboBox();
JTextField txtsaldo = new  JTextField();
JTextField txtDataA = new  JTextField();


JButton butG = new JButton("Cadastrar");
JButton butPes = new JButton("Pesquisar Cliente");
JButton butOP = new JButton("Apagar Cliente");
JButton  butA= new JButton("Actualizar dados");
JButton butADD = new JButton("Novo");
JButton butAD = new JButton("Ver Dados");



JButton first = new JButton("Menu Principal");
JButton next = new JButton("Proximo");
JButton previos = new JButton("anterior");
JButton last = new JButton("ultimo");

JButton adici = new JButton("Adicionar");
JButton dele = new JButton("Eliminar");


JPanel RG = new JPanel();
JPanel FT = new JPanel();
JPanel OP = new JPanel();
JPanel NT = new JPanel();
JPanel BT = new JPanel();
JPanel Cliente = new JPanel();
JPanel Conta = new JPanel();


 

ButtonGroup gp = new ButtonGroup();

public Cliente(Vector d) {
   
    
   super("Registo dos Clientes do Banco." , 
     false, //resizable
     true, //closable
     false, //maximizable
     true);//iconifiable 
    
     xy=d;
    //------------------------------------------------------------------------------
    Painel.setLayout(null);
    c.add(Painel);
    //-----------------Inclusao no Painel dos COmponentes
    Painel.add(lblNUIT);
    Painel.add(lblnome);
    Painel.add(lblsexo);
    Painel.add(lblDataN);
    Painel.add(lblContacto);
    
    Painel.add(lblnumero);
    Painel.add(lbltipo);
    Painel.add(lblmoeda);
    Painel.add(lblsaldo);
    Painel.add(lblDataA);
    
    Painel.add(dele);
    Painel.add(lblI);
    
    Painel.add(txtNUIT);
    Painel.add(txtnome);
    Painel.add(txtsexo);
    Painel.add(txtDataN);
    Painel.add(txtContacto);
    
    Painel.add(txtnumero);
    Painel.add(txttipo);
    Painel.add(txtmoeda);
    Painel.add(txtsaldo);
    Painel.add(txtDataA);
    
    
    Painel.add(butG);
    Painel.add(butPes);
    Painel.add(butA);
    Painel.add(butOP);
    Painel.add(butAD);
    Painel.add(butADD);
    Painel.add(adici);
    
     Painel.add(first);
//    Painel.add(next);
//    Painel.add(previos);
//    Painel.add(last);
     
    Painel.add(Foto);
    
    Painel.add(scrollNome);
    
//-------------------------------------------------------------------------------
 txtsexo.addItem("Masculino");
 txtsexo.addItem("Feminino");
 txtsexo.setBackground(new Color(0,153,255));
 txtsexo.setForeground(Color.white); 
 
 txttipo.addItem("Ordem");
 txttipo.addItem("Prazo");
 txttipo.addItem("Poupanca");
 txttipo.setBackground(new Color(0,153,255));
 txttipo.setForeground(Color.white); 
 
 txtmoeda.addItem("Metical");
 txtmoeda.addItem("Dolar");
 txtmoeda.addItem("Rand");
 txtmoeda.setBackground(new Color(0,153,255));
 txtmoeda.setForeground(Color.white); 
 
 txtsexo.setSelectedIndex(-1);
    txttipo.setSelectedIndex(-1);
    txtmoeda.setSelectedIndex(-1);
//-------------------------------------------------------------------------------
//    
//   lblNome.setBounds(20,30, 290,25);
//   lblCD.setBounds(330,70,100,25);
//   lblP.setBounds(20,70, 180,25);
//   lblD.setBounds(20,110, 180,25);
//   lblQ.setBounds(20,150, 180,25);
//   lblPr.setBounds(310,110, 180,25);
//   lblV.setBounds(310,150, 180,25);
//   
//   txtCD.setBounds(440,70,120,25);
//   txtNome.setBounds(130,30,390,25);
//   txtP.setBounds(80,70, 240,25);
//   txtD.setBounds(110,110, 180,25);
//   txtQ.setBounds(110,150, 180,25);
//   txtPr.setBounds(385,110, 180,25);
//   txtV.setBounds(385,150, 180,25);
   
  
   
   butG.setBounds(30, 500,150,27); butG.setBackground(Color.white); butG.setIcon(ic4);
   butPes.setBounds(228, 500,160,27);butPes.setBackground(Color.white); butPes.setIcon(ic15);
   butA.setBounds(430, 500,150,27);butA.setBackground(Color.white); butA.setIcon(ic16);
   butOP.setBounds(630, 500,150,27);butOP.setBackground(Color.white); butOP.setIcon(ic14);
   butAD.setBounds(830, 500,150,27);butAD.setBackground(Color.white); butAD.setIcon(ic17);
   butADD.setBounds(1025, 500,150,27);butADD.setBackground(Color.white); butADD.setIcon(ic13);
    
    
    
    
    
    RG.setBorder(BorderFactory.createTitledBorder(null,""));
    RG.setLayout(null);
    RG.setBounds(10,10,895,450);
    RG.setBackground(new Color(0,0,0,0));
    //----------------------------SETBOUND DOS COMPONentes-------------------------------------------------------
    Cliente.setBorder(BorderFactory.createTitledBorder(null,"Dados Cliente"));
    Cliente.setLayout(null);
    Cliente.setBounds(20,30,450,215);
    Cliente.setBackground(new Color(0,153,255));
    
   lblNUIT.setBounds(40,50, 290,25);
   lblnome.setBounds(40,90,290,25);
   lblsexo.setBounds(40,130, 290,25);
   lblDataN.setBounds(40,170, 290,25);
   lblContacto.setBounds(40,210, 290,25);
   
   txtNUIT.setBounds(100,50,350,23);
   txtnome.setBounds(150,90,300,23);
   txtsexo.setBounds(100,130, 250,23);
   txtDataN.setBounds(170,170, 240,23);
   txtContacto.setBounds(110,210, 210,23);
   
   lblI.setBounds(20, 260, 870, 10);
   scrollNome.setBounds(20, 280, 870, 165);
    
    //-------------------------------------------------------------------------------------
    
    Conta.setBorder(BorderFactory.createTitledBorder(null,"Dados da conta"));
    Conta.setLayout(null);
    Conta.setBounds(480,30,410,250);
    Conta.setBackground(new Color(0,153,255));
    
   lblnumero.setBounds(500,50, 290,25);
   lbltipo.setBounds(500,90,290,25);
   lblmoeda.setBounds(500,130, 290,25);
   lblsaldo.setBounds(500,170, 290,25);
   lblDataA.setBounds(500,210, 290,25);
   
   txtnumero.setBounds(580,50,270,23);
   txttipo.setBounds(610,90,270,23);
   txtmoeda.setBounds(566,130, 250,23);
   txtsaldo.setBounds(560,170, 250,23);
   txtDataA.setBounds(610,210, 240,23);
   
   adici.setBounds(500,245, 170, 29);adici.setBackground(Color.white);adici.setIcon(ic24);
   dele.setBounds(700,245, 170, 29);dele.setBackground(Color.white);dele.setIcon(ic25);
     //-------------------------------------------------------------------------------------
    
    FT.setBorder(BorderFactory.createTitledBorder(null,"Imagem do Cliente"));
    FT.setLayout(null);
    FT.setBounds(920,10,310,250);
    FT.setBackground(new Color(0,153,255));
    
    Foto.setBounds(940, 40, 270,200);
    Foto.setBackground(new Color(255,204,204));
    Foto.setIcon(bt);
    bt.setImage(bt.getImage().getScaledInstance(Foto.getWidth(),Foto.getHeight(),1)); 
   
    //-----------------------------------------------------------------.-----------------
    
    OP.setBorder(BorderFactory.createTitledBorder(null,null));
    OP.setLayout(null);
    OP.setBounds(920,280,310,160);
    OP.setBackground(new Color(0,153,255));
    
   first.setBounds(925,285,300,150);first.setBackground(new Color(255,204,204));first.setIcon(ic29);
   first.setFont(new Font("Consolas",Font.BOLD,26));
   
//   next.setBounds(1100,330, 100,25);
//   previos.setBounds(950,380, 100,25);
//   last.setBounds(1100,380, 100,25);
    //------------------------------------------------------------------------------
    
    BT.setBorder(BorderFactory.createTitledBorder(null,"Botões"));
    BT.setLayout(null);
    BT.setBounds(10,470,1220,75);
    BT.setBackground(new Color(0,0,0,0));
    
    BT.add(Cliente);
    BT.add(Conta);
    RG.add(Cliente);
    RG.add(Conta); 
    
    Painel.add(OP);
    Painel.add(RG);
    Painel.add(FT);
    Painel.add(BT);
    Painel.add(Cliente);
    Painel.add(Conta);
    Painel.setBackground(new Color(0,153,255));
    
    
            setSize(1250,600);
            //Set the window's location.
            setLocation(30, 10);
            
              //-------------Limpando todos os campos--------------- 
    txtNUIT.setText(null);
     txtnome.setText(null);
     txtnumero.setText(null);
     txtsexo.setSelectedIndex(-1);
     txtContacto.setText(null);
     txtmoeda.setSelectedIndex(-1);
     txttipo.setSelectedIndex(-1);
     txtsaldo.setText(null);
     txtDataA.setText(null);
     txtDataN.setText(null);
     Foto.setIcon(bt); 
      while (modeloTab.getRowCount()>0) modeloTab.removeRow(0);
     //---------------------------------------------------
         
 first .addActionListener((ActionEvent e) -> {
   dispose();
      });
 
 Foto .addActionListener((ActionEvent e) -> {
   Foto.setIcon(foto());
      });
 butG.addActionListener((ActionEvent e) -> {
       Registo(); 
    }); 
 butPes.addActionListener((ActionEvent e) -> {
       this.Pesquisar();
    }); 
 txtNUIT.addActionListener((ActionEvent e) -> {
       this.Pesquisar();
    }); 

 butOP.addActionListener((ActionEvent e) -> {
       this.Apagar();
    }); 
 adici.addActionListener((ActionEvent e) -> {
       this.RegistoCl();
    }); 
butA.addActionListener((ActionEvent e) -> {
       this.actualizar();
    }); 
dele.addActionListener((ActionEvent e) -> {
       this.UmaCOnta();
    }); 

txtnumero.addActionListener((ActionEvent e) -> {
        PNumeroCO();
     });
butAD.addActionListener((ActionEvent e) -> {
     ver cl = new ver(xy);
  
        cl.setVisible(true); 
         jdpDesktop.add(cl);
         try {
            cl.setSelected(true);
        } catch (java.beans.PropertyVetoException w) {}
  }
);




butADD.addActionListener((ActionEvent e) -> {
       
     //-------------Limpando todos os campos--------------- 
    txtNUIT.setText(null);
     txtnome.setText(null);
     txtnumero.setText(null);
     txtsexo.setSelectedIndex(-1);
     txtContacto.setText(null);
     txtmoeda.setSelectedIndex(-1);
     txttipo.setSelectedIndex(-1);
     txtsaldo.setText(null);
     txtDataA.setText(null);
     txtDataN.setText(null);
     Foto.setIcon(bt); 
      while (modeloTab.getRowCount()>0) modeloTab.removeRow(0);
     //---------------------------------------------------
    
    
    
    }); 
 
  try {
       x=(Vector) ob.lerObjecto("CL.DAT");
       } catch(Exception e){
           
       }
  
  try {
       xy=(Vector) ob.lerObjecto("CO.DAT");
       } catch(Exception e){
           
       }
       
    }

int cal=0;
public int last(){
 va a;
    
   if(xy.size()>0){
       indice=xy.size()-1;
       a=(va) xy.get(indice);
       
      
    cal = Integer.parseInt(a.getCnumero());
    cal=2019+cal;
    
   
   }
  return cal;   
}


public int mostra(va a ){;
    cal = Integer.parseInt(a.getCnumero());
    cal=001+cal;
    
    return cal;
     }

 
public void prenche(){
    va a = new va(); 
    while (modeloTab.getRowCount()>0) modeloTab.removeRow(0);
         
          String [] linha= new String [5];
         
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
          if(a.getCnomeC().equals(txtnome.getText())){
             linha[0]=a.getCnumero();
             linha[1]=a.getCtipo();
             linha[2]=a.getCmoeda();
             linha[3]=a.getCsaldo()+"";
             linha[4]=a.getcDataAB();
             
            modeloTab.addRow(linha);
          
          }
        } 
    
}

public void prencher(String n){
    va a = new va(); 
    while (modeloTab.getRowCount()>0) modeloTab.removeRow(0);
         
          String [] linha= new String [5];
         
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
          if(a.getCnomeC().equals(n)){
             linha[0]=a.getCnumero();
             linha[1]=a.getCtipo();
             linha[2]=a.getCmoeda();
             linha[3]=a.getCsaldo()+"";
             linha[4]=a.getcDataAB()+"";
             
            modeloTab.addRow(linha);
          
          }
        } 
    
}

public ImageIcon foto(){
    
    ImageIcon conteudo=null;
    String Caminho=null;
    try{
    JFileChooser choose = new JFileChooser("C:\\Users\\hp\\Documents\\NetBeansProjects\\Banco\\foto\\Cliente");
   int ok=choose.showOpenDialog(null);
   
   if(ok==choose.APPROVE_OPTION){
       
    Caminho=choose.getCurrentDirectory().getPath()+"/"+choose.getSelectedFile().getName();
    
    conteudo=new ImageIcon(Caminho);
   
    conteudo.setImage(conteudo.getImage().getScaledInstance(Foto.getWidth(),Foto.getHeight(),1));
    Ft=conteudo;
   File f= choose.getSelectedFile();
   
     
       
   }else{
       choose.cancelSelection();
   }
    }catch(Exception e){
        e.printStackTrace();
    }
     return conteudo;  
     
}

public void Registo(){
 try {
      if(txtnome.getText().length()!=0 && txtNUIT.getText().length()!=0&& txtsaldo.getText().length()!=0 &&       
        txtDataN.getText().length()!=0){ 
        va a = new va();
        a.NuitC=txtNUIT.getText();
        a.NomeC=txtnome.getText();
        a.SexoC=txtsexo.getSelectedItem().toString();
        a.DataNC=txtDataN.getText();
        a.ContactoC=Integer.parseInt(txtContacto.getText());
        a.foto=Ft; 
      
        x.addElement(a);
        RegistoCl();
        JOptionPane.showMessageDialog(null," Conta do Cliente Criada com Sucesso. Obrigado! ");
        
        
 }else {JOptionPane.showMessageDialog(null," Verifique se Preencheu todos Campos Disponiveis. Obrigado! ");}
        try {
          ob.gravarObjecto(x,"CL.DAT"); 
        } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Gravar");JOptionPane.showMessageDialog(null,e);}
       
        }catch(Exception e){ }
       
        }


public void RegistoCl(){
    
 try {
    
     if(txtnome.getText().length()!=0&&txtNUIT.getText().length()!=0){
        va a = new va();
        a.setCnomeC(txtnome.getText());
        a.setcNUITC(txtNUIT.getText());
        a.setCnumero(this.last()+"");
        a.setCtipo(txttipo.getSelectedItem().toString());
        a.setCmoeda(txtmoeda.getSelectedItem().toString());
        a.setCsaldo(Double.parseDouble(txtsaldo.getText()));
        a.setcDataAB(date);
       
      
        xy.addElement(a);
        prenche();
      //JOptionPane.showMessageDialog(null,"SUcesso");
     }else{JOptionPane.showMessageDialog(null,"Verifique se preencheu todos os campos. Obrigado.!"); }
        try {
          ob.gravarObjecto(xy,"CO.DAT"); 
        } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Gravar"); JOptionPane.showMessageDialog(null,e);}
       
        }catch(Exception e){ }
       
        }
    
        
   

public void Pesquisar(){
    
     try {
          if(txtNUIT.getText().length()!=0){ 
va a;
    
       String NUIT;
          NUIT=txtNUIT.getText();
     
     txtnome.setText(null);
     txtnumero.setText(null);
     txtsexo.setSelectedIndex(-1);
     txtContacto.setText(null);
     txtmoeda.setSelectedIndex(-1);
     txttipo.setSelectedIndex(-1);
     txtsaldo.setText(null);
     txtDataA.setText(null);
     txtDataN.setText(null);
     Foto.setIcon(bt);
     
     
     for(int i=0;i<x.size();i++){
         
      a=(va)x.get(i);
      
      if(a.NuitC.equals(NUIT)){ 
          
          txtnome.setText(a.NomeC);
          txtsexo.setSelectedItem(a.SexoC);
          txtDataN.setText(a.DataNC);
          txtContacto.setText(a.ContactoC+"");
          Foto.setIcon(a.foto);
          this.prencher(a.NomeC);
        
        
      }
     }
          }else{JOptionPane.showMessageDialog(null,"Verifique se o campo NUIT esta preenchido.  Obrigado!");}
       try {
          ob.lerObjecto("CL.DAT");
       } catch(Exception e){
JOptionPane.showMessageDialog(null,"Por favor verifique se os dados estao armazenados!"," Falha na leitura ",
        JOptionPane.ERROR_MESSAGE); JOptionPane.showMessageDialog(null,e);
                   
       }
         
        
     }catch(Exception e){ }
       
     }
      



public void teste(){
    
     try {
va a;
    
       String NUIT;
          NUIT=txtNUIT.getText();
     
     txtnome.setText(null);
     txtnumero.setText(null);
     txtsexo.setSelectedIndex(-1);
     txtContacto.setText(null);
     txtmoeda.setSelectedIndex(-1);
     txttipo.setSelectedIndex(-1);
     txtsaldo.setText(null);
     txtDataA.setText(null);
     txtDataN.setText(null);
     Foto.setIcon(bt);
     
     
     for(int i=0;i<x.size();i++){
         
      a=(va)x.get(i);
      
      if(a.NuitC.equals(NUIT)){ 
          
         
        
        
      }
     }
     
       try {
          ob.lerObjecto("CL.DAT");
       } catch(Exception e){ 
JOptionPane.showMessageDialog(null,"Por favor verifique se os dados estao armazenados!"," Falha na leitura ",
        JOptionPane.ERROR_MESSAGE); JOptionPane.showMessageDialog(null,e);
                   
       }
         
        
     }catch(Exception e){ }
       
     }
      

public void PNumeroCO(){
    
     try {
va a;
    
       String numero;
          numero=txtnumero.getText(); 
          
     //---------------Clean----------------
     txtmoeda.setSelectedIndex(-1);
     txttipo.setSelectedIndex(-1);
     txtsaldo.setText(null);
     txtDataA.setText(null);
     //--------------------------------------
     for(int i=0;i<xy.size();i++){
         
      a=(va)xy.get(i);
      
      if(a.getCnumero().equals(numero)){ 
          
    
     txtmoeda.setSelectedItem(a.getCmoeda());
     txttipo.setSelectedItem(a.getCtipo());
     txtsaldo.setText(a.getCsaldo()+"");
     txtDataA.setText(a.getcDataAB());
        
        
      }
     }
     
       try {
          ob.lerObjecto("CO.DAT");
       } catch(Exception e){ 
JOptionPane.showMessageDialog(null,"Por favor verifique se os dados estao armazenados!"," Falha na leitura ",
        JOptionPane.ERROR_MESSAGE); JOptionPane.showMessageDialog(null,e);
                   
       }
         
        
     }catch(Exception e){ }
       
     }
      


public void Apagar(){
    
    if(txtNUIT.getText().length()!=0){ 
      va a;   
       String NUIT;
          NUIT=txtNUIT.getText();
         
         for(int i =0;i<x.size();i++){
             
             a=(va)x.get(i);        
         if(a.NuitC.equals(NUIT)){
             
              
              int resp = JOptionPane.showConfirmDialog(this, "Deseja excluir esse Cliente?",
                "Atenção", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_NO_OPTION) {
            x.removeElementAt(i);
            JOptionPane.showMessageDialog(null, "Apagado com Sucesso");
            this.ApagarCO(a.NuitC);
        }
             
     //-------------Limpando todos os campos---------------
     txtnome.setText(null);
     txtnumero.setText(null);
     txtsexo.setSelectedIndex(-1);
     txtContacto.setText(null);
     txtmoeda.setSelectedIndex(-1);
     txttipo.setSelectedIndex(-1);
     txtsaldo.setText(null);
     txtDataA.setText(null);
     txtDataN.setText(null);
     Foto.setIcon(bt); 
     while (modeloTab.getRowCount()>0) modeloTab.removeRow(0);
     //---------------------------------------------------
           
     
      
         }        
         
         }
         
    }else{JOptionPane.showMessageDialog(null,"Verifique se o campo NUIT esta Preenchido. Obrigado!");}
    
        
         try {
          ob.gravarObjecto(x,"CL.DAT");
       } catch(Exception e){}
     }



public void ApagarCO(String nui){
      va a;   
       
         for(int i =0;i<xy.size();i++){
             
             a=(va)xy.get(i);        
         if(a.getcNUITC().equals(nui)){
              
             xy.removeElementAt(i);
     //-------------Limpando todos os campos---------------
     txtnome.setText(null);
     txtnumero.setText(null);
     txtsexo.setSelectedIndex(-1);
     txtContacto.setText(null);
     txtmoeda.setSelectedIndex(-1);
     txttipo.setSelectedIndex(-1);
     txtsaldo.setText(null);
     txtDataA.setText(null);
     txtDataN.setText(null);
     Foto.setIcon(bt); 
     modeloTab.removeRow(0);
     //---------------------------------------------------
            
         }        
         
         }
         try {
          ob.gravarObjecto(xy,"CO.DAT");
       } catch(Exception e){}
     }



public void UmaCOnta(){
      va a;   
       if(txtnumero.getText().length()!=0){
      String numero=txtnumero.getText();
      
         for(int i =0;i<xy.size();i++){
             
             a=(va)xy.get(i);        
         if(a.getCnumero().equals(numero)){
              
             xy.removeElementAt(i);
     //-------------Limpando todos os campos---------------
     txtnumero.setText(null);
     txtmoeda.setSelectedIndex(-1);
     txttipo.setSelectedIndex(-1);
     txtsaldo.setText(null);
     txtDataA.setText(null);
     this.prenche();
     //---------------------------------------------------
     JOptionPane.showMessageDialog(null,"Conta Apagada do Sistema. Obrigado!");
         }        
         
         }
       }else{JOptionPane.showMessageDialog(null,"Preencha o campo do numero da Conta. Obrigado!");}
         try {
          ob.gravarObjecto(xy,"CO.DAT");
       } catch(Exception e){}
     }
      


public void actualizar(){
          if(txtNUIT.getText().length()!=0){ 
va a = new va();
        
        String NUIT;
          NUIT=txtNUIT.getText();
          
         for(int i=0;i<x.size();i++){
             a=(va) x.get(i);
             
             if(a.NuitC.equals(NUIT)){ 
                 
        a.NuitC=txtNUIT.getText();
        a.NomeC=txtnome.getText();
        a.SexoC=txtsexo.getSelectedItem().toString();
        a.DataNC=txtDataN.getText();
        a.ContactoC=Integer.parseInt(txtContacto.getText());
        //a.foto=Ft;
        
                 x.setElementAt(a,i);   
             }  
         }
         
         ATConta();
          }else{JOptionPane.showMessageDialog(null,"Verifique se preencheu o campo NUIT. Obrigado.");}
         try {
          ob.gravarObjecto(x,"CL.DAT");
       } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Inserir Cliente");
       JOptionPane.showMessageDialog(null,e);}
     }
     

public void ATConta(){
         
va a = new va();
        
        String NUIT;
          NUIT=txtNUIT.getText();
          
         for(int i=0;i<xy.size();i++){
             a=(va) xy.get(i);
             
             if(a.getcNUITC().equals(NUIT)){ 
                 
        a.setcNUITC(txtNUIT.getText());
        a.setCnomeC(txtnome.getText());
       
        
                 xy.setElementAt(a,i);   
             }  
         }
         
 JOptionPane.showMessageDialog(null, "Atualizado com Sucesso! Obrigado");
         
         
         try {
          ob.gravarObjecto(xy,"CO.DAT");
       } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Inserir Conta");
       JOptionPane.showMessageDialog(null,e);}
     }
     






    


 }
 //-----------------------------------------------------Fim do formulario JInternalFrame CLiente -------------------------    
    
    
    
public class ver extends JInternalFrame {
   
//-----------------------------Tabela--------------------------------------------------
String colunas2 []= {"Número da Conta","tipo","moeda","Saldo","Data de Abertura"};
Object dados2[][];
    
DefaultTableModel modeloTab2 = new  DefaultTableModel(dados2,colunas2);
JTable tabelaNomes2 = new JTable(modeloTab2);  
JScrollPane scrollNome2 = new JScrollPane(tabelaNomes2);
    
//--------------------------------------------------------------------------------
static final int xPosition = 30, yPosition = 30;
 
JLabel lblcod = new JLabel("Nuit do Cliente:");
JLabel lblname = new JLabel("Nome do Cliente:");

JLabel lblto = new JLabel("Saldo total do Cliente:");
JTextField txtto = new  JTextField();

JLabel l = new JLabel(ic19);

JTextField txtcod = new  JTextField();
JTextField txtname = new  JTextField();

JButton butclose = new JButton("Fechar");



JPanel Painel2 = new JPanel();
Container  c = getContentPane();

JPanel Pesq = new JPanel();
JPanel table = new JPanel();


ButtonGroup gp = new ButtonGroup();

public ver(Vector v) {
    
    
   super("Ver contas de Clientes." , 
     false, //resizable
     true, //closable
     false, //maximizable
     true);//iconifiable 
    
    xy=v;
    //------------------------------------------------------------------------------
    Painel2.setLayout(null);
    c.add(Painel2);
    //-----------------Inclusao no Painel dos COmponentes
    
    Painel2.add(lblcod);
    Painel2.add(lblname);
    Painel2.add(txtname);
    Painel2.add(txtcod);
    Painel2.add(butclose);
    
    Painel2.add(lblto);
    Painel2.add(txtto);
    Painel2.add(l);
    
    
    Painel2.add(scrollNome2);
    

  
   
    Pesq.setBorder(BorderFactory.createTitledBorder(null,"Pesquisa de Dados"));
    Pesq.setLayout(null);
    Pesq.setBounds(90,20,830,60);
    Pesq.setBackground(new Color(0,0,0,0));
    
      
   lblcod.setBounds(120,40, 290,25);
   lblname.setBounds(460,40,100,25);
   txtcod.setBounds(240,40, 200,25);
   txtname.setBounds(590,40, 270,25);
   l.setBounds(870,40,30,24);
   butclose.setBounds(930, 40,105,28);butclose.setIcon(ic18);butclose.setBackground(Color.white); 
    //----------------------------SETBOUND DOS COMPONentes-------------------------------------------------------
    table.setBorder(BorderFactory.createTitledBorder(null,"Informação das Contas do Cliente"));
    table.setLayout(null);
    table.setBounds(20,90,1000,360);
    table.setBackground(new Color(0,153,255));
    
    scrollNome2.setBounds(30, 110, 980, 300);
    
    lblto.setBounds(30, 415, 200, 25);
    txtto.setBounds(180,415,400,24); 
    //-------------------------------------------------------
    Painel2.add(Pesq);
    Painel2.add(table);
   
    Painel2.setBackground(new Color(0,153,255));
    
    
            setSize(1050,500);
            //Set the window's location.
            setLocation(120, 50);
 
txtcod.addActionListener((ActionEvent e) -> {
      InfoN();
    });  
txtname.addActionListener((ActionEvent e) -> {
       Info();
    });  
            
butclose.addActionListener((ActionEvent e) -> {
       dispose();
    }); 
   
    
    
  try {
       x=(Vector) ob.lerObjecto("CL.DAT");
       } catch(Exception e){
           
       }
  
  try {
       xy=(Vector) ob.lerObjecto("CO.DAT");
       } catch(Exception e){
           
       }
    
    }

    


public void Info(){
    txtcod.setText(null); 
    double s=0;
    va a = new va(); 
    while (modeloTab2.getRowCount()>0) modeloTab2.removeRow(0);
         
          String [] linha= new String [5];
         s=0;
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
         
         
         
          if(a.getCnomeC().equals(txtname.getText())){ 
              txtcod.setText(a.getMnuit()); 
             linha[0]=a.getCnumero();
             linha[1]=a.getCtipo();
             linha[2]=a.getCtipo(); 
             linha[3]=a.getCsaldo()+""; 
             linha[4]=a.getcDataAB()+""; 
             
             s=s+a.getCsaldo();
             
            modeloTab2.addRow(linha);
          
          }
        } txtto.setText(s+" "+a.getCsaldo()); 
         //JOptionPane.showMessageDialog(null,"                Sucesso! ");
    
}


public void InfoN(){
    txtname.setText(null);
    double s=0;
    va a = new va(); 
    
    while (modeloTab2.getRowCount()>0) modeloTab2.removeRow(0);
         
          String [] linha= new String [5];
          
          s=0;
          
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
         
         if(a.getcNUITC().equals(txtcod.getText())){ 
              txtname.setText(a.getCnomeC());
             linha[0]=a.getCnumero();
             linha[1]=a.getCtipo();
             linha[2]=a.getCmoeda(); 
             linha[3]=a.getCsaldo()+""; 
             linha[4]=a.getcDataAB()+""; 
             
             s=s+a.getCsaldo();
            modeloTab2.addRow(linha);
          
          }
        } 
        txtto.setText(s+" Unidades Monetarias");
    
}




    }
    
    
 //-----------Fim do formulario JInternalFrame CLiente -------------------    
    
    
    
     
public class Depositar extends JInternalFrame {
   
static final int xPosition = 30, yPosition = 30;



JPanel Painel = new JPanel();
Container  c = getContentPane();
 
JLabel lblNuit = new JLabel("Nuit do Cliente:");
JLabel lblnome = new JLabel("Nome do Cliente:");

JLabel lblSaldoActual = new JLabel("Saldo Atual do Cliente:");
JTextField txtSaldoActual = new  JTextField();


JLabel lblValorDeposito = new JLabel("Valor a Depositar na Conta:");
JTextField txtValorDeposito = new  JTextField();


JLabel lblActual = new JLabel("Novo Saldo Actual do Cliente:");
JTextField txtsActual = new  JTextField();

JLabel contal = new JLabel("Selecione a Conta:");
JComboBox conta = new  JComboBox();

JLabel l = new JLabel(ic19);
JLabel D = new JLabel(ic26);


JTextField txtNuit = new  JTextField();
JTextField txtnome = new  JTextField();

JButton butclosi = new JButton("Fechar");
JButton butd = new JButton("Depositar Valor");



JPanel Painel3 = new JPanel();

JPanel Pesq = new JPanel();
JPanel table = new JPanel();



 

ButtonGroup gp = new ButtonGroup();

public Depositar( Vector p) {
    
    
   super("Depósito de Valor." , 
     false, //resizable
     true, //closable
     false, //maximizable
     true);//iconifiable 
    
    xy=p;
    //------------------------------------------------------------------------------
    Painel3.setLayout(null);
    c.add(Painel3);
    //-----------------Inclusao no Painel dos COmponentes
    
    Painel3.add(lblNuit);
    Painel3.add(lblnome);
    Painel3.add(txtnome);
    Painel3.add(txtNuit);
    Painel3.add(butclosi);
    Painel3.add(butd);
    
    Painel3.add(conta);
     Painel3.add(contal);
    Painel3.add(D);
    
    Painel3.add(lblSaldoActual);
    Painel3.add(txtSaldoActual);
    
    
    Painel3.add(lblValorDeposito);
    Painel3.add(txtValorDeposito);
    
    
    Painel3.add(lblActual);
    Painel3.add(txtsActual);
    Painel3.add(l);
    
    

//-------------------------------------------------------------------------------
//    
   
  
   
    Pesq.setBorder(BorderFactory.createTitledBorder(null,"Acesso ao Cliente"));
    Pesq.setLayout(null);
    Pesq.setBounds(90,20,830,60);
    Pesq.setBackground(new Color(0,0,0,0));
    
      
   lblNuit.setBounds(120,40, 290,25);
   lblnome.setBounds(460,40,100,25);
   txtNuit.setBounds(240,40, 200,25);
   txtnome.setBounds(590,40, 270,25);
   l.setBounds(870,40,30,24);
   
    //----------------------------SETBOUND DOS COMPONentes-------------------------------------------------------
    table.setBorder(BorderFactory.createTitledBorder(null,"Saldo da Conta do Cliente"));
    table.setLayout(null);
    table.setBounds(20,90,1000,350);
    table.setBackground(new Color(0,153,255));
    
    
    lblSaldoActual.setBounds(90, 160, 200, 25);
    txtSaldoActual.setBounds(300,160,290,24);
    
    
    lblValorDeposito.setBounds(90, 220, 200, 25);
    txtValorDeposito.setBounds(300,220,290,24);
   
    
    lblActual.setBounds(90, 280, 200, 25);
    txtsActual.setBounds(300,280,290,24);
    
    butd.setBounds(90, 340, 250, 70);butd.setIcon(ic6);butd.setBackground(Color.white); 
    butd.setFont(new Font("Consolas",Font.BOLD,18));
     butclosi.setBounds(400, 340,160,40);butclosi.setIcon(ic18);butclosi.setBackground(Color.white);
     butclosi.setFont(new Font("Consolas",Font.BOLD,18));
    
    D.setBounds(680, 120,250, 230);
    
    ic26.setImage(ic26.getImage().getScaledInstance(D.getWidth(),D.getHeight(),1)); 
    //-------------------------------------------------------
    Painel3.add(Pesq);
    Painel3.add(table);
   
    Painel3.setBackground(new Color(0,153,255));
    
    
            setSize(1050,500);
            setLocation(120, 50);
            
butclosi.addActionListener((ActionEvent e) -> {
       dispose();
     }); 
conta.addActionListener((ActionEvent e) -> {
       Busca3();
     }); 
txtNuit.addActionListener((ActionEvent e) -> {
       Busca();
    });
txtnome.addActionListener((ActionEvent e) -> {
       Busca2();
    });
txtValorDeposito.addActionListener((ActionEvent e) -> {
       Calcula();
    });
butd.addActionListener((ActionEvent e) -> {
     Deposito();
    });
   
        


    
    
  try {
       x=(Vector) ob.lerObjecto("CL.DAT");
       } catch(Exception e){
           
       }
  
  try {
       xy=(Vector) ob.lerObjecto("CO.DAT");
       } catch(Exception e){
           
       }
  
  try {
       xyz=(Vector) ob.lerObjecto("DE.DAT");
       } catch(Exception e){
           
       }
    
    }


public void Busca(){
   txtnome.setText(null);
   txtSaldoActual.setText(null);
   txtValorDeposito.setText(null);
   txtsActual.setText(null);
   
   
    va a = new va(); 
   // conta.removeAllItems();
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
          
         if(a.getcNUITC().equals(txtNuit.getText())){ 
             
           txtnome.setText(a.getCnomeC()); 
           
           txtSaldoActual.setText(a.getCsaldo()+""); 
           
           //conta.addItem(a.cnumero);
          
            
          }
        } 
       
}


public void Busca2(){
   txtNuit.setText(null);
   txtSaldoActual.setText(null);
   txtValorDeposito.setText(null);
   txtsActual.setText(null);
   
    va a = new va(); 
      
     //conta.removeAllItems();
     
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
         
         if(a.getCnomeC().equals(txtnome.getText())){ 
             
           txtNuit.setText(a.getcNUITC());
           txtSaldoActual.setText(a.getCsaldo()+""); 
          // conta.addItem(a.cnumero);
           
          }
        }      
}


public void Busca3(){
   //txtcodi.setText(null);
   txtSaldoActual.setText(null);
   txtValorDeposito.setText(null);
   txtsActual.setText(null);
   
    va a = new va(); 
    
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
         
         if(a.getCnumero().equals(conta.getSelectedItem().toString())){ 
          
           txtSaldoActual.setText(a.getCsaldo()+"");
          }
        }      
}

public void Calcula(){
    
    double saldoActual = Double.parseDouble(txtSaldoActual.getText());
    double ValorDeposito = Double.parseDouble(txtValorDeposito.getText());
    
    double soma=saldoActual+ValorDeposito;
    
    txtsActual.setText(soma+"");
    
   
}

     

public void Deposito(){
         
va a = new va();
        

if(txtNuit.getText().length()!=0){  
        String NUIT;
          NUIT=txtNuit.getText();
          
         for(int i=0;i<xy.size();i++){
             a=(va) xy.get(i);
             
             if(a.getcNUITC().equals(NUIT)){ 
                 double saldoActual = Double.parseDouble(txtSaldoActual.getText());
    double ValorDeposito = Double.parseDouble(txtValorDeposito.getText());
    
    double soma=saldoActual+ValorDeposito;
        a.setCsaldo(soma);
       
        
        
                 xy.setElementAt(a,i);   
                 
    JOptionPane.showMessageDialog(null, "       Depósito com Sucesso. Obrigado");
    JOptionPane.showMessageDialog(null, "       O saldo actual da Conta e de "+a.getCsaldo());
    MovD();  
   txtNuit.setText(null);
   txtSaldoActual.setText(null);
   txtValorDeposito.setText(null);
   txtsActual.setText(null);
   txtnome.setText(null);
             }  
         }
       
         
 
          }else{JOptionPane.showMessageDialog(null, "       Preencha o campo Saldo atual. Obrigado");}
         
         try {
          ob.gravarObjecto(xy,"CO.DAT");
       } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Inserir Conta");
       JOptionPane.showMessageDialog(null,e);}
     }
     




int cal=0;
public int last(){
 va a;
    
   if(xyz.size()>0){
       indice=xyz.size()-1;
       a=(va) xyz.get(indice);
       
     // JOptionPane.showMessageDialog(null,a.getMnumeroS());
    cal = a.getMnumeroS();
    cal=cal+1;
   // JOptionPane.showMessageDialog(null,cal);
    
   
   }
  return cal;   
}
public void MovD(){
    
 try {
     
        
       
        va a = new va();
        a.setMnome(txtnome.getText());
        a.setMnuit(txtNuit.getText());
        a.setMvalor(Double.parseDouble(txtValorDeposito.getText()));
        a.setMOperacao("Deposito"); 
        a.setMData(date);
        a.setMHora(time);
        a.setMnumeroS(last());
       
      
        xyz.addElement(a);
      JOptionPane.showMessageDialog(null,"O seu número de sequência é o seguinte: "+a.getMnumeroS()
                   ,"Registo de Operação", JOptionPane.INFORMATION_MESSAGE);
        try {
          ob.gravarObjecto(xyz,"DE.DAT"); 
        } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Gravar"); JOptionPane.showMessageDialog(null,e);}
       
        }catch(Exception e){ } 
       
        }
    
        
//=========3e2roemrw[3===================











    }
    
    
 //-----------------------------------------------------Fim do formulario JInternalFrame CLiente -------------------------    
    
    
    
    
    
    
     
    public class Levantar extends JInternalFrame {
   
static final int xPosition = 30, yPosition = 30;



JPanel Painel = new JPanel();
Container  c = getContentPane();
 
JLabel lblNuit = new JLabel("Nuit do Cliente:");
JLabel lblnome = new JLabel("Nome do Cliente:");

JLabel lblSaldoActual = new JLabel("Saldo Atual do Cliente:");
JTextField txtSaldoActual = new  JTextField();


JLabel lblValorLevantar = new JLabel("Insira o Valor a Levantar:");
JTextField txtValorLevantar = new  JTextField();


JLabel lblsActual = new JLabel("Novo Saldo Actual do Cliente:");
JTextField txtsActual = new  JTextField();


JLabel contal = new JLabel("Selecione a Conta:");
JComboBox conta = new  JComboBox();

JLabel l = new JLabel(ic19);
JLabel D = new JLabel(ic20);


JTextField txtNuit = new  JTextField();
JTextField txtnome = new  JTextField();

JButton butclosi = new JButton("Fechar");
JButton butd = new JButton("Levantar Valor");


JPanel Painel2 = new JPanel();

JPanel Pesq = new JPanel();
JPanel table = new JPanel();


 

ButtonGroup gp = new ButtonGroup();

public Levantar( Vector lev) {
    
    
   super("Levantamento de valor." , 
     false, //resizable
     true, //closable
     false, //maximizable
     true);//iconifiable 
    
   xy=lev;
    
    //------------------------------------------------------------------------------
    Painel2.setLayout(null);
    c.add(Painel2);
    //-----------------Inclusao no Painel dos COmponentes
    
    Painel2.add(lblNuit);
    Painel2.add(lblnome);
    Painel2.add(txtnome);
    Painel2.add(txtNuit);
    Painel2.add(butclosi);
    Painel2.add(D);
    
    Painel2.add(lblSaldoActual);
    Painel2.add(txtSaldoActual);
    
    Painel2.add(contal);
    Painel2.add(conta);
    
    Painel2.add(butd);
    Painel2.add(lblValorLevantar);
    Painel2.add(txtValorLevantar);
    
    
    Painel2.add(lblsActual);
    Painel2.add(txtsActual);
    Painel2.add(l);
    
    

//-------------------------------------------------------------------------------
//    
   
  
   
    Pesq.setBorder(BorderFactory.createTitledBorder(null,"Acesso ao Cliente"));
    Pesq.setLayout(null);
    Pesq.setBounds(90,20,830,60);
    Pesq.setBackground(new Color(0,153,255));
    
//      
   lblNuit.setBounds(120,40, 290,25);
   lblnome.setBounds(460,40,100,25);
   txtNuit.setBounds(240,40, 200,25);
   txtnome.setBounds(590,40, 270,25);
   l.setBounds(870,40,30,24);
  
    //----------------------------SETBOUND DOS COMPONentes-------------------------------------------------------
    table.setBorder(BorderFactory.createTitledBorder(null,"Saldo da Conta do Cliente"));
    table.setLayout(null);
    table.setBounds(20,90,1000,340);
    table.setBackground(new Color(0,153,255));

    
    lblSaldoActual.setBounds(90, 160, 200, 25);
    txtSaldoActual.setBounds(300,160,290,24);
    
    
    lblValorLevantar.setBounds(90, 220, 200, 25);
    txtValorLevantar.setBounds(300,220,290,24);
    
    lblsActual.setBounds(90, 280, 200, 25);
    txtsActual.setBounds(300,280,290,24);
    
    D.setBounds(680, 125,250, 235);
    ic20.setImage(ic20.getImage().getScaledInstance(D.getWidth(),D.getHeight(),1)); 
    
      butd.setBounds(90, 340, 250, 70);butd.setIcon(ic6);butd.setBackground(Color.white); 
    butd.setFont(new Font("Consolas",Font.BOLD,18));
     butclosi.setBounds(400, 340,160,40);butclosi.setIcon(ic18);butclosi.setBackground(Color.white);
     butclosi.setFont(new Font("Consolas",Font.BOLD,18));
    //-------------------------------------------------------
    Painel2.add(Pesq);
    Painel2.add(table);
   
    Painel2.setBackground(new Color(0,153,255));
    
    
            setSize(1050,500);
            //Set the window's location.
            setLocation(120, 50);
            
   conta.addActionListener((ActionEvent e) -> {
             Busca3();
     });        
    butclosi.addActionListener((ActionEvent e) -> {
              dispose();
     });
    txtNuit.addActionListener((ActionEvent e) -> {
       Busca();
    });
    txtnome.addActionListener((ActionEvent e) -> {
       Busca2();
    });
    
    txtValorLevantar.addActionListener((ActionEvent e) -> {
           Calcula();
     });
    butd.addActionListener((ActionEvent e) -> {
         Levantar();
     });
   
    try {
       x=(Vector) ob.lerObjecto("CL.DAT");
       } catch(Exception e){
           
       }
  
  try {
       xy=(Vector) ob.lerObjecto("CO.DAT");
       } catch(Exception e){
           
       }
    
  try {
       xyz=(Vector) ob.lerObjecto("DE.DAT");
       } catch(Exception e){
           
       }
    
    
    }


public void Busca(){
   txtnome.setText(null);
   txtSaldoActual.setText(null);
   txtValorLevantar.setText(null);
   txtsActual.setText(null);
   
   
    va a = new va(); 
   // conta.removeAllItems();
    
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
          
         if(a.getcNUITC().equals(txtNuit.getText())){ 
             
           txtnome.setText(a.getCnomeC()); 
           
           txtSaldoActual.setText(a.getCsaldo()+" ");
          // conta.addItem(a.cnumero);
          
            
          }
        } 
       
}


public void Busca2(){
    txtNuit.setText(null);
   txtSaldoActual.setText(null);
   txtValorLevantar.setText(null);
   txtsActual.setText(null);
    va a = new va(); 
    // conta.removeAllItems();
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
         
         if(a.getCnomeC().equals(txtnome.getText())){ 
           txtNuit.setText(a.getcNUITC()); 
            txtSaldoActual.setText(a.getCsaldo()+"");
         
        //   conta.addItem(a.cnumero);
           
          }
        }      
}


public void Busca3(){
  
   txtSaldoActual.setText(null);
   txtValorLevantar.setText(null);
   txtsActual.setText(null);
   
    va a = new va(); 
    
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
         
         if(a.getCnumero().equals(conta.getSelectedItem().toString())){ 
          
           txtSaldoActual.setText(a.getCsaldo()+"");
          }
        }      
}



public void Calcula(){
    
    double saldoActual = Double.parseDouble(txtSaldoActual.getText());
    double ValorDeposito = Double.parseDouble(txtValorLevantar.getText());
    
    if(saldoActual>=ValorDeposito){
    double soma=saldoActual-ValorDeposito;
    
    txtsActual.setText(soma+"");
    
    }else{JOptionPane.showMessageDialog(null,"      Valor Insuficiente");}
}


public void Levantar(){
         
va a = new va();
        
try{
if(txtNuit.getText().length()!=0){
    
        String NUIT;
          NUIT=txtNuit.getText();
          
         for(int i=0;i<xy.size();i++){
             a=(va) xy.get(i);
             
             if(a.getcNUITC().equals(NUIT)){ 
                 
        a.setCsaldo(cal);
       
        
        
                 xy.setElementAt(a,i);   
                 
    JOptionPane.showMessageDialog(null,"       Levantamento com Sucesso. Obrigado");MovD();  
   txtNuit.setText(null);
   txtSaldoActual.setText(null);
   txtValorLevantar.setText(null);
   txtsActual.setText(null);
   txtnome.setText(null);
             }  
         }
       
         
 
         }else{JOptionPane.showMessageDialog(null, "          Preencha o campo Novo Saldo Atual. Obrigado.");}
         
         try {
          ob.gravarObjecto(xy,"CO.DAT");
       } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Inserir Conta");
       JOptionPane.showMessageDialog(null,e);}
       
         } catch(NullPointerException e){ }
     }
     






int cal=0;
public int last(){
 va a;
    
   if(xyz.size()>0){
       indice=xyz.size()-1;
       a=(va) xyz.get(indice);
       
     //JOptionPane.showMessageDialog(null,a.getMnumeroS());
    cal = a.getMnumeroS();
    cal=cal+1;
  // JOptionPane.showMessageDialog(null,cal);
    
   
   }
  return cal;   
}
public void MovD(){
    
 try {
     
      
        
       
        va a = new va();
        a.setMnome(txtnome.getText());
        a.setMnuit(txtNuit.getText());
        a.setMvalor(Double.parseDouble(txtValorLevantar.getText()));
        a.setMOperacao("Levantamento"); 
        a.setMData(date);
        a.setMHora(time);
        a.setMnumeroS(last());
       
      
        xyz.addElement(a);
        
      JOptionPane.showMessageDialog(null,"O seu número de sequência é o seguinte: "+last()
                   ,"Registo de Operação", JOptionPane.INFORMATION_MESSAGE);
        try {
          ob.gravarObjecto(xyz,"DE.DAT"); 
        } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Gravar"); JOptionPane.showMessageDialog(null,e);}
       
        }catch(Exception e){ } 
       
        }
    

    }
    
    
 //-----------------------------------------------------Fim do formulario JInternalFrame CLiente -------------------------    
    
    
    
     //-----------------------------------------------------Fim do formulario JInternalFrame CLiente -------------------------    
    
    
    
     
    public class Transferir extends JInternalFrame {
   
static final int xPosition = 30, yPosition = 30;



JPanel Painel = new JPanel();
Container  c = getContentPane();
 
JLabel lblNuit = new JLabel("Nuit do Cliente:");
JLabel lblnome = new JLabel("Nome do Cliente:");

JLabel lblSaldoActual = new JLabel("Saldo Atual do Cliente:");
JTextField txtSaldoActual = new  JTextField();


JLabel lblValorTrans = new JLabel("Insira o Valor a Tranferir:");
JTextField txtValorTrans = new  JTextField();


JLabel lblConta = new JLabel("Insira a Conta a Transferir:");
JTextField txtConta = new  JTextField();

JLabel l = new JLabel(ic19);
JLabel D = new JLabel(ic22);


JTextField txtNuit = new  JTextField();
JTextField txtnome = new  JTextField();

JButton butclosi = new JButton("Fechar");
JButton butd = new JButton("Tranferir Valor");


JPanel Painel2 = new JPanel();

JPanel Pesq = new JPanel();
JPanel table = new JPanel();


 

ButtonGroup gp = new ButtonGroup();

public Transferir( Vector tra) {
    
    
   super("Transferência de valores entre contas." , 
     false, //resizable
     true, //closable
     false, //maximizable
     true);//iconifiable 
    
   xy=tra;
    
    //------------------------------------------------------------------------------
    Painel2.setLayout(null);
    c.add(Painel2);
    //-----------------Inclusao no Painel dos COmponentes
    
    Painel2.add(lblNuit);
    Painel2.add(lblnome);
    Painel2.add(txtnome);
    Painel2.add(txtNuit);
    Painel2.add(butclosi);
    Painel2.add(D);
    
    Painel2.add(lblSaldoActual);
    Painel2.add(txtSaldoActual);
    
    Painel2.add(butd);
    Painel2.add(lblValorTrans);
    Painel2.add(txtValorTrans);
    
    
    Painel2.add(lblConta);
    Painel2.add(txtConta);
    Painel2.add(l);
    
    

//-------------------------------------------------------------------------------
//    
   
  
   
    Pesq.setBorder(BorderFactory.createTitledBorder(null,"Acesso ao Cliente"));
    Pesq.setLayout(null);
    Pesq.setBounds(90,20,830,60);
    Pesq.setBackground(new Color(0,0,0,0));
    
      
   lblNuit.setBounds(120,40, 290,25);
   lblnome.setBounds(460,40,100,25);
   txtNuit.setBounds(240,40, 200,25);
   txtnome.setBounds(590,40, 270,25);
   l.setBounds(870,40,30,24);
  
    //----------------------------SETBOUND DOS COMPONentes-------------------------------------------------------
    table.setBorder(BorderFactory.createTitledBorder(null,"Saldo da Conta do Cliente"));
    table.setLayout(null);
    table.setBounds(20,90,1000,300);
    table.setBackground(new Color(0,153,255));
    
    lblSaldoActual.setBounds(90, 130, 200, 25);
    txtSaldoActual.setBounds(300,130,290,24);
    
    
    lblValorTrans.setBounds(90, 190, 200, 25);
    txtValorTrans.setBounds(300,190,290,24);
    
    
    lblConta.setBounds(90, 250, 200, 25);
    txtConta.setBounds(300,250,290,24);
    
    D.setBounds(680, 130,250, 230);
     ic22.setImage(ic22.getImage().getScaledInstance(D.getWidth(),D.getHeight(),1)); 
    
     butd.setBounds(90, 300, 250, 70);butd.setIcon(ic23);butd.setBackground(Color.white); 
     butd.setFont(new Font("Consolas",Font.BOLD,18));
     butclosi.setBounds(400, 300,160,40);butclosi.setIcon(ic18);butclosi.setBackground(Color.white);
     butclosi.setFont(new Font("Consolas",Font.BOLD,18));
    //-------------------------------------------------------
    Painel2.add(Pesq);
    Painel2.add(table);
   
    Painel2.setBackground(new Color(0,153,255));
    
    
            setSize(1050,500);
            //Set the window's location.
            setLocation(120, 50);
            
            
 butclosi.addActionListener((ActionEvent e) -> {
              dispose();
     });
 txtNuit.addActionListener((ActionEvent e) -> {
       Busca();
    });
    txtnome.addActionListener((ActionEvent e) -> {
       Busca2();
    });
    txtValorTrans.addActionListener((ActionEvent e) -> {
           Calcula();
     });
    butd.addActionListener((ActionEvent e) -> {
          this.actualizar();
     });
//    butOP.addActionListener((ActionEvent e) -> {
//               P=txtP.getText(); 
//                 Operacoes fram = new Operacoes();
//  
//        fram.setVisible(true); 
//         jdpDesktop.add(fram);
//         // Depois de adicionar vai prencher a tabela
//          prencher();
//     });
//            
//    butG.addActionListener((ActionEvent e) -> {
//       Registo(); 
//    });
//    
//    
//    butPes.addActionListener((ActionEvent e) -> {
//       Pesquisar(); 
//    });
//    
//     butA.addActionListener((ActionEvent e) -> {
//       apagar(); 
//    });
//     
//     
   
    try {
       x=(Vector) ob.lerObjecto("CL.DAT");
       } catch(Exception e){
           
       }
  
  try {
       xy=(Vector) ob.lerObjecto("CO.DAT");
       } catch(Exception e){
           
       }
    
  try {
       xyz=(Vector) ob.lerObjecto("DE.DAT");
       } catch(Exception e){
           
       }
    
    
    }


public void Busca(){
   txtnome.setText(null);
   txtSaldoActual.setText(null);
   txtValorTrans.setText(null);
   txtConta.setText(null);
   
   
    va a = new va(); 
    
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
         
         if(a.getcNUITC().equals(txtNuit.getText())){ 
           txtnome.setText(a.getCnomeC()); 
           txtSaldoActual.setText(a.getCsaldo()+"");
            
          }
        }       
}


public void Busca2(){
   txtNuit.setText(null);
   txtSaldoActual.setText(null);
   txtValorTrans.setText(null);
   txtConta.setText(null);
   
    va a = new va(); 
    
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
         
         if(a.getCnomeC().equals(txtnome.getText())){ 
           txtNuit.setText(a.getcNUITC()); 
           txtSaldoActual.setText(a.getCsaldo()+"");
            
          }
        }      
}    



public void Calcula(){
    
    if(txtSaldoActual.getText().length()!=0 && txtValorTrans.getText().length()!=0){
    
    double saldoActual = Double.parseDouble(txtSaldoActual.getText());
    double ValorTrans = Double.parseDouble(txtValorTrans.getText());
    
    if(saldoActual>=ValorTrans){
       
    
    }else{JOptionPane.showMessageDialog(null,"      Valor Insuficiente");txtSaldoActual.setText(null);}
    
    }else{JOptionPane.showMessageDialog(null,"      Campos Vazios");}
}




public void actualizar(){
         
va a = new va();
         
         Calcula();
         String NUIT =txtNuit.getText();
         
          if(txtValorTrans.getText().length()!=0){    
              
         for(int i=0;i<xy.size();i++){
             a=(va) xy.get(i);
             
             if(a.getcNUITC().equals(NUIT)){    
                 double ValorDeposito = Double.parseDouble(txtValorTrans.getText());
                 double SaldoActual =Double.parseDouble(txtSaldoActual.getText());
                 
                double soma=SaldoActual- ValorDeposito;
                 
                 a.setCsaldo(soma);
              
                 
                 xy.setElementAt(a,i);   
             }  
             
             if(a.getCnumero().equals(txtConta.getText())){   
                 
                 a.setCsaldo(a.getCsaldo()+Double.parseDouble(txtValorTrans.getText()));
              
                 
                 xy.setElementAt(a,i);   
             }  
         }
 JOptionPane.showMessageDialog(null, "       Transferencia com Sucesso. Obrigado");MovD();
 txtNuit.setText(null);
 txtnome.setText(null);
   txtSaldoActual.setText(null);
   txtValorTrans.setText(null);
   txtConta.setText(null);
 
          }else{JOptionPane.showMessageDialog(null, "          Preencha o campo Valor a Transferir. Obrigado.");}
         
         try {
        ob.gravarObjecto(xy,"CO.DAT");
       } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Inserir");}
     }
     

    

int cal=0;
public int last(){
 va a;
    
   if(xyz.size()>0){
       indice=xyz.size()-1;
       a=(va) xyz.get(indice);
       
  //  JOptionPane.showMessageDialog(null,a.getMnumeroS());
    cal = a.getMnumeroS();
    cal=cal+1;
   // JOptionPane.showMessageDialog(null,cal);
    
   
   }
  return cal;   
}
public void MovD(){
    
 try {
     
       
       
        va a = new va();
        a.setMnome(txtnome.getText());
        a.setMnuit(txtNuit.getText());
        a.setMvalor(Double.parseDouble(txtValorTrans.getText()));
        a.setMOperacao("Transferencia"); 
        a.setMData(date);
        a.setMHora(time);
        a.setMnumeroS(last());
       
      
        xyz.addElement(a);
        
     JOptionPane.showMessageDialog(null,"O seu número de sequência é o seguinte: "+a.getMnumeroS()
                   ,"Registo de Operação", JOptionPane.INFORMATION_MESSAGE);
        try {
          ob.gravarObjecto(xyz,"DE.DAT"); 
        } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Gravar"); JOptionPane.showMessageDialog(null,e);}
       
        }catch(Exception e){ } 
       
        }
    

    }
    
    


    
    
    
    
    //-----------------------------------------------------Fim do formulario JInternalFrame CLiente -------------------------    
    
    
    
public class updateM extends JInternalFrame {
   
//-----------------------------Tabela--------------------------------------------------
String colunas2 []= {"Número de Sequência","Valor","Operação","Data","Hora"};
Object dados2[][];
    
DefaultTableModel modeloTab2 = new  DefaultTableModel(dados2,colunas2);
JTable tabelaNomes2 = new JTable(modeloTab2);  
JScrollPane scrollNome2 = new JScrollPane(tabelaNomes2);
    
//--------------------------------------------------------------------------------
static final int xPosition = 30, yPosition = 30;
 
JLabel lblcod = new JLabel("Número de Sequência da Operação:");
JTextField txtcod = new  JTextField();


JLabel lblname = new JLabel("Nome do Cliente:");
JTextField txtname = new  JTextField();

JLabel lblto = new JLabel("Insira o Valor a Reaver:");
JTextField txtto = new  JTextField();

JLabel l = new JLabel(ic19);




JButton butclose = new JButton("Fechar");
JButton butat = new JButton("UPDATE NEGATIVO");
JButton butat1 = new JButton("UPDATE POSITIVO");



JPanel Painel2 = new JPanel();
Container  c = getContentPane();

JPanel Pesq = new JPanel();
JPanel table = new JPanel();


ButtonGroup gp = new ButtonGroup();

public updateM(Vector v) {
    
    
   super("Atualizar Movimentos Realizados." , 
     false, //resizable
     true, //closable
     false, //maximizable
     true);//iconifiable 
    
    xyz=v;
    //------------------------------------------------------------------------------
    Painel2.setLayout(null);
    c.add(Painel2);
    //-----------------Inclusao no Painel dos COmponentes
    
    Painel2.add(lblcod);
    Painel2.add(lblname);
    Painel2.add(txtname);
    Painel2.add(txtcod);
    
    Painel2.add(butclose);
    Painel2.add(butat);
    Painel2.add(butat1);
    
    Painel2.add(lblto);
    Painel2.add(txtto);
    Painel2.add(l);
    
    
    Painel2.add(scrollNome2);
    

  
   //--------------------------------------------------------------------------------
    Pesq.setBorder(BorderFactory.createTitledBorder(null,"Pesquisa de Dados"));
    Pesq.setLayout(null);
    Pesq.setBounds(90,20,830,60);
    Pesq.setBackground(new Color(0,153,255));
    
      
   lblcod.setBounds(190,40, 290,25);
  
   txtcod.setBounds(430,40, 330,25);
  
   l.setBounds(770,40,30,24);
   butclose.setBounds(930, 40,105,28);butclose.setIcon(ic18);butclose.setBackground(Color.white); 
   butclose.setFont(new Font("Consolas",Font.BOLD,13));
    //----------------------------SETBOUND DOS COMPONentes-------------------------------------------------------
    table.setBorder(BorderFactory.createTitledBorder(null,"Informação do Movimento Realizado pelo Cliente"));
    table.setLayout(null);
    table.setBounds(20,90,1000,360);
    table.setBackground(new Color(0,153,255));
    
    scrollNome2.setBounds(30, 110, 980, 150);
    
    butat.setBounds(520, 280, 230, 120);butat.setIcon(ic27);butat.setBackground(Color.white); 
    butat.setFont(new Font("Consolas",Font.BOLD,18));
    
    butat1.setBounds(770, 280, 230, 120);butat1.setIcon(ic27);butat1.setBackground(Color.white); 
    butat1.setFont(new Font("Consolas",Font.BOLD,18));
    
    
    
    lblto.setBounds(50, 370, 200, 25);
    txtto.setBounds(200,370,290,24); 
    
     lblname.setBounds(50,300,300,27);
      txtname.setBounds(180,300, 270,25);
    //-------------------------------------------------------
    Painel2.add(Pesq);
    Painel2.add(table);
   
    Painel2.setBackground(new Color(0,153,255));
    
    
            setSize(1050,500);
            //Set the window's location.
            setLocation(120, 50);
 
txtcod.addActionListener((ActionEvent e) -> {
     
    });  
butat.addActionListener((ActionEvent e) -> {
       this.actualizarN();
    });  
butat1.addActionListener((ActionEvent e) -> {
       this.actualizarPO();
    });  
            
butclose.addActionListener((ActionEvent e) -> {
       dispose();
    }); 

txtcod.addKeyListener(new KeyListener(){

       @Override
       public void keyTyped(KeyEvent e) {
          }

       @Override
       public void keyPressed(KeyEvent e) {
        }

       @Override
       public void keyReleased(KeyEvent e) {
       InfoN(); 
       }


}

);
    
    
  try {
       x=(Vector) ob.lerObjecto("CL.DAT");
       } catch(Exception e){
           
       }
  
  try {
       xy=(Vector) ob.lerObjecto("CO.DAT");
       } catch(Exception e){
           
       }
  
  try {
       xyz=(Vector) ob.lerObjecto("DE.DAT");
       } catch(Exception e){
           
       }
    
    }





public void InfoN(){
    
    try{
    txtname.setText(null);
    txtto.setText(null);
   
    va a = new va(); 
    
    while (modeloTab2.getRowCount()>0) modeloTab2.removeRow(0);
         
          String [] linha= new String [5];
          
        for(int j=0;j<xyz.size();j++){  
            
         a=(va)xyz.get(j);  
         
         if(a.getMnumeroS()==Integer.parseInt(txtcod.getText())){ 
             linha[0]=a.getMnumeroS()+"";
             linha[1]=a.getMvalor()+"";
             linha[2]=a.getMOperacao();
             linha[3]=a.getMData();
             linha[4]=a.getMHora();
             
            txtname.setText(a.getMnome());
            modeloTab2.addRow(linha);
          
          }
        } 
       } catch(NumberFormatException e){
           //JOptionPane.showMessageDialog(null, "numero"); 
       }
      // JOptionPane.showMessageDialog(null,"                Sucesso! ");
    
}




public void actualizarN(){
         
va a = new va();
         
         
         
         
          if(txtto.getText().length()!= 0 && txtcod.getText().length()!=0){    
              int SQ =Integer.parseInt(txtcod.getText());
              
         for(int i=0;i<xyz.size();i++){
             a=(va) xyz.get(i);
             
             if(a.getMnumeroS()==SQ){    
                 
                 double r = Double.parseDouble(txtto.getText());
                 
                 a.setMvalor(a.getMvalor()-r);
                 
                 this.ContaA(a.getMnuit());
                 
                 xyz.setElementAt(a,i);   
             }  
             
         }
 JOptionPane.showMessageDialog(null, "Movimento Actualizado com Sucesso. Obrigado");
   txtcod.setText(null);
 
          }else{JOptionPane.showMessageDialog(null, "Preencha o campo Valor a Reaver. Obrigado.");}
         
         try {
        ob.gravarObjecto(xyz,"DE.DAT");
       } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Inserir");}
     }
     




public void ContaA(String NUIT){
         
va a = new va();
         
       
         for(int i=0;i<xy.size();i++){
             a=(va) xy.get(i);
             
             if(a.getcNUITC().equals(NUIT)){ 
                 
                 double r = Double.parseDouble(txtto.getText());
                
                 
                 a.setCsaldo(a.getCsaldo()+r);
                 
                 xy.setElementAt(a,i);   
             }  
             
         }
 JOptionPane.showMessageDialog(null, "Atualizado com Sucesso. Obrigado");
         
         try {
        ob.gravarObjecto(xy,"CO.DAT");
       } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Inserir");}
     }
     






public void actualizarPO(){
         
va a = new va();
         
         
          if(txtto.getText().length()!= 0 && txtcod.getText().length()!=0){    
              int SQ =Integer.parseInt(txtcod.getText());
              
         for(int i=0;i<xyz.size();i++){
             a=(va) xyz.get(i);
             
             if(a.getMnumeroS()==SQ){    
                 
                 double r = Double.parseDouble(txtto.getText());
                 
                 a.setMvalor(a.getMvalor()+r);
                 
                 this.ContaAP(a.getMnuit());
                 
                 xyz.setElementAt(a,i);   
             }  
             
         }
 JOptionPane.showMessageDialog(null, "Movimento Actualizado com Sucesso. Obrigado");
   txtcod.setText(null);
 
          }else{JOptionPane.showMessageDialog(null, "Preencha o campo Valor a Reaver. Obrigado.");}
         
         try {
        ob.gravarObjecto(xyz,"DE.DAT");
       } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Inserir");}
     }
     




public void ContaAP(String NUIT){
         
va a = new va();
         
       
         for(int i=0;i<xy.size();i++){
             a=(va) xy.get(i);
             
             if(a.getcNUITC().equals(NUIT)){ 
                 
                 double r = Double.parseDouble(txtto.getText());
                
                 a.setCsaldo(a.getCsaldo()-r);
                 
                 xy.setElementAt(a,i);   
             }  
             
         }
 JOptionPane.showMessageDialog(null, "       Atualizado com Sucesso. Obrigado");
   
 
          
         
         try {
        ob.gravarObjecto(xy,"CO.DAT");
       } catch(Exception e){ JOptionPane.showMessageDialog(null,"Falha ao Inserir");}
     }
     



}




//-----------------------------------------------------Fim do formulario JInternalFrame CLiente -------------------------    
    
    
    
public class saldoGeral extends JInternalFrame {
   
//-----------------------------Tabela--------------------------------------------------
String colunas3 []= {"Número","tipo","moeda","Saldo","Data de Abertura"};
Object dados3[][];
    
DefaultTableModel modeloTab3 = new  DefaultTableModel(dados3,colunas3);
JTable tabelaNomes3 = new JTable(modeloTab3);  
JScrollPane scrollNome3 = new JScrollPane(tabelaNomes3);
    
//--------------------------------------------------------------------------------
static final int xPosition = 30, yPosition = 30;
 
JLabel lblcod = new JLabel("Nuit do Cliente:");
JLabel lblname = new JLabel("Nome do Cliente:");

JLabel lblto = new JLabel("Saldo Geral em Meticais:");
JTextField txtto = new  JTextField();

JLabel l = new JLabel(ic19);

JTextField txtcod = new  JTextField();
JTextField txtname = new  JTextField();

JButton butclose = new JButton("Fechar");



JPanel Painel2 = new JPanel();
Container  c = getContentPane();

JPanel Pesqu = new JPanel();
JPanel table = new JPanel();


ButtonGroup gp = new ButtonGroup();

public saldoGeral(Vector b) {
    
    
   super("Saldo Geral das Contas do Cliente em Meticais." , 
     false, //resizable
     true, //closable
     false, //maximizable
     true);//iconifiable 
    
    xy=b;
    //------------------------------------------------------------------------------
    Painel2.setLayout(null);
    c.add(Painel2);
    //-----------------Inclusao no Painel dos COmponentes
    
    Painel2.add(lblcod);
    Painel2.add(lblname);
    Painel2.add(txtname);
    Painel2.add(txtcod);
    Painel2.add(butclose);
    
    Painel2.add(lblto);
    Painel2.add(txtto);
    Painel2.add(l);
    
    
    Painel2.add(scrollNome3);
    

//-------------------------------------------------------------------------------
//    
//   lblNome.setBounds(20,30, 290,25);
//   lblCD.setBounds(330,70,100,25);
//   lblP.setBounds(20,70, 180,25);
//   lblD.setBounds(20,110, 180,25);
//   lblQ.setBounds(20,150, 180,25);
//   lblPr.setBounds(310,110, 180,25);
//   lblV.setBounds(310,150, 180,25);
//   
//   txtCD.setBounds(440,70,120,25);
//   txtNome.setBounds(130,30,390,25);
//   txtP.setBounds(80,70, 240,25);
//   txtD.setBounds(110,110, 180,25);
//   txtQ.setBounds(110,150, 180,25);
//   txtPr.setBounds(385,110, 180,25);
//   txtV.setBounds(385,150, 180,25);
   
  
   
    Pesqu.setBorder(BorderFactory.createTitledBorder(null,"Pesquisa de Dados"));
    Pesqu.setLayout(null);
    Pesqu.setBounds(90,20,830,60);
    Pesqu.setBackground(new Color(0,153,255));
    
      
   lblcod.setBounds(120,40, 290,25);
   lblname.setBounds(460,40,100,25);
   txtcod.setBounds(240,40, 200,25);
   txtname.setBounds(590,40, 270,25);
   l.setBounds(870,40,30,24);
   butclose.setBounds(930, 40,105,28);butclose.setIcon(ic18);butclose.setBackground(Color.white); 
    //----------------------------SETBOUND DOS COMPONentes-------------------------------------------------------
    table.setBorder(BorderFactory.createTitledBorder(null,"Contas do Cliente"));
    table.setLayout(null);
    table.setBounds(20,90,1000,360);
    table.setBackground(new Color(0,153,255));
    
    scrollNome3.setBounds(30, 110, 980, 270);
    
    lblto.setBounds(50, 400, 300, 25);lblto.setForeground(Color.white);lblto.setFont(new Font("Consolas",Font.BOLD,20));
     txtto.setBounds(360,400,290,33); 
    txtto.setFont(new Font("Consolas",Font.BOLD,23));
    txtto.setForeground(Color.BLUE);
     //-------------------------------------------------------
   Painel2.add(Pesqu);
    Painel2.add(table);
   
    Painel2.setBackground(new Color(0,153,255));
    
    
            setSize(1050,500);
            //Set the window's location.
            setLocation(120, 50);
 
txtcod.addActionListener((ActionEvent e) -> {
      InfoN();
    });  
txtname.addActionListener((ActionEvent e) -> {
       Info();
    });  
            
butclose.addActionListener((ActionEvent e) -> {
       dispose();
    }); 

  try {
       x=(Vector) ob.lerObjecto("CL.DAT");
       } catch(Exception e){
           
       }
  
  try {
       xy=(Vector) ob.lerObjecto("CO.DAT");
       } catch(Exception e){
           
       }
    
    }




public void Info(){
    txtcod.setText(null); 
    double saldo=0;
    va a = new va(); 
    while (modeloTab3.getRowCount()>0) modeloTab3.removeRow(0);
         
          String [] linha= new String [5];
         saldo=0;
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
         
         
         
          if(a.getCnomeC().equals(txtname.getText())){
               if(a.getCmoeda().equalsIgnoreCase("Metical")){
              txtcod.setText(a.getcNUITC());
              
             linha[0]=a.getCnumero();
             linha[1]=a.getCtipo();
             linha[2]=a.getCmoeda(); 
             linha[3]=a.getCsaldo()+""; 
             linha[4]=a.getcDataAB()+""; 
             
             saldo=saldo+a.getCsaldo();
             
            modeloTab3.addRow(linha);
          
               }
          }
        } txtto.setText(saldo+" Mt"); 
         //JOptionPane.showMessageDialog(null,"                Sucesso! ");
    
}


public void InfoN(){
    txtname.setText(null);
    double s=0;
    va a = new va(); 
    
    while (modeloTab3.getRowCount()>0) modeloTab3.removeRow(0);
         
          String [] linha= new String [5];
          
          s=0;
          
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
         
         if(a.getcNUITC().equals(txtcod.getText())){ 
              if(a.getCtipo().equals("Metical")){
                   linha[0]=a.getCnumero();
             linha[1]=a.getCtipo();
             linha[2]=a.getCmoeda(); 
             linha[3]=a.getCsaldo()+""; 
             linha[4]=a.getcDataAB()+""; 
             
              
             
             s=s+a.getCsaldo();
            modeloTab3.addRow(linha);
          
              }
          }
        } 
        txtto.setText(s+"  Mt");
      //  JOptionPane.showMessageDialog(null,"                Sucesso! ");
    
}


















}




//-----------------------------------------------------Fim do formulario JInternalFrame CLiente -------------------------    
    
    
    
public class Moeda extends JInternalFrame {
   
//-----------------------------Tabela--------------------------------------------------
String colunas3 []= {"Número","tipo","moeda","Saldo","Data de Abertura"};
Object dados3[][];
    
DefaultTableModel modeloTab3 = new  DefaultTableModel(dados3,colunas3);
JTable tabelaNomes3 = new JTable(modeloTab3);  
JScrollPane scrollNome3 = new JScrollPane(tabelaNomes3);
    
//--------------------------------------------------------------------------------
static final int xPosition = 30, yPosition = 30;
 
JLabel lblcodi = new JLabel("Insira a Moeda:");
JLabel lblname = new JLabel("Nome do Cliente:");

JLabel lblto = new JLabel("Saldo Geral Do Banco:");
JTextField txtto = new  JTextField();

JLabel l = new JLabel(ic19);

JTextField txtcod = new  JTextField();
JTextField txtname = new  JTextField();

JButton butclose = new JButton("Fechar");



JPanel Painel2 = new JPanel();
Container  c = getContentPane();

JPanel Pesqu = new JPanel();
JPanel table = new JPanel();


ButtonGroup gp = new ButtonGroup();

public Moeda(Vector M) {
    
    
   super("Valor Total do Banco por Moeda." , 
     false, //resizable
     true, //closable
     false, //maximizable
     true);//iconifiable 
    
    xy=M;
    //------------------------------------------------------------------------------
    Painel2.setLayout(null);
    c.add(Painel2);
    //-----------------Inclusao no Painel dos COmponentes
    
    Painel2.add(lblcodi);
    Painel2.add(lblname);
    Painel2.add(txtname);
    Painel2.add(txtcod);
    Painel2.add(butclose);
    
    Painel2.add(lblto);
    Painel2.add(txtto);
    Painel2.add(l);
    
    
    Painel2.add(scrollNome3);
   
  
   
    Pesqu.setBorder(BorderFactory.createTitledBorder(null,"Pesquisa de Dados"));
    Pesqu.setLayout(null);
    Pesqu.setBounds(90,20,830,60);
    Pesqu.setBackground(new Color(255,204,204));
    
      
   lblcodi.setBounds(300,40, 290,25);
  
   txtcod.setBounds(420,40, 330,25);
   l.setBounds(750,40,30,24);
   butclose.setBounds(930, 40,105,28);butclose.setIcon(ic18);butclose.setBackground(Color.white); 
    //----------------------------SETBOUND DOS COMPONentes-------------------------------------------------------
    table.setBorder(BorderFactory.createTitledBorder(null,"Contas Disponiveis"));
    table.setLayout(null);
    table.setBounds(20,90,1000,360);
    table.setBackground(new Color(255,204,204));
    
    scrollNome3.setBounds(30, 110, 980, 270);
    
    lblto.setBounds(50, 400, 300, 25);lblto.setForeground(Color.white);lblto.setFont(new Font("Consolas",Font.BOLD,20));
     txtto.setBounds(310,400,600,33); 
    txtto.setFont(new Font("Consolas",Font.BOLD,23));
    txtto.setForeground(Color.BLUE);
     //-------------------------------------------------------
   Painel2.add(Pesqu);
    Painel2.add(table);
   
    Painel2.setBackground(new Color(255,204,204));
    
    
            setSize(1050,500);
            //Set the window's location.
            setLocation(120, 50);
 
txtcod.addActionListener((ActionEvent e) -> {
      InfoN();
    });  
 
            
butclose.addActionListener((ActionEvent e) -> {
       dispose();
    }); 
    
  try {
       x=(Vector) ob.lerObjecto("CL.DAT");
       } catch(Exception e){
           
       }
  
  try {
       xy=(Vector) ob.lerObjecto("CO.DAT");
       } catch(Exception e){
           
       }
    
    }




public void InfoN(){
    txtto.setText(null);
    double s=0;
    va a = new va(); 
    
    while (modeloTab3.getRowCount()>0) modeloTab3.removeRow(0);
         
          String [] linha= new String [5];
          
          s=0;
         
          
        for(int j=0;j<xy.size();j++){  
            
         a=(va)xy.get(j);  
         
         if(a.getcNUITC().equals(txtcod.getText())){ 
              
                   
             linha[0]=a.getCnumero();
             linha[1]=a.getCtipo();
             linha[2]=a.getCmoeda(); 
             linha[3]=a.getCsaldo()+""; 
             linha[4]=a.getcDataAB()+""; 
             
              
             
             s=s+a.getCsaldo();
            modeloTab3.addRow(linha);
          
              
          }
        } 
        txtto.setText(s+"  Unidades Monetárias");
      //  JOptionPane.showMessageDialog(null,"                Sucesso! ");
    
}
  




    } 
    







}
    
 //-----------------------------------------------------Fim do formulario JInternalFrame CLiente -------------------------    
    
    
    





    
    
    
    

