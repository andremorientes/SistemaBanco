/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author Antonio Cua
 */
public class va implements Serializable {
   String co,nome,senha;
   //-----------------Cliente-----------------
    String NuitC, NomeC, SexoC, DataNC;
    int ContactoC;
    ImageIcon foto;
   //-----------------Conta-------------------
    private String cnumero;
     private String ctipo, cmoeda, cDataAB,cnomeC, cNUITC;
    private double csaldo;
    
   
    //--------Movimentos----------------------
    private int MnumeroS;
    private double Mvalor;
    private String MOperacao,Mnome, Mnuit;
    private String MData, MHora;

    public String getCnumero() {
        return cnumero;
    }

    public void setCnumero(String cnumero) {
        this.cnumero = cnumero;
    }

    public String getCtipo() {
        return ctipo;
    }

    public void setCtipo(String ctipo) {
        this.ctipo = ctipo;
    }

    public String getCmoeda() {
        return cmoeda;
    }

    public void setCmoeda(String cmoeda) {
        this.cmoeda = cmoeda;
    }

    public String getcDataAB() {
        return cDataAB;
    }

    public void setcDataAB(String cDataAB) {
        this.cDataAB = cDataAB;
    }

    public String getCnomeC() {
        return cnomeC;
    }

    public void setCnomeC(String cnomeC) {
        this.cnomeC = cnomeC;
    }

    public String getcNUITC() {
        return cNUITC;
    }

    public void setcNUITC(String cNUITC) {
        this.cNUITC = cNUITC;
    }

    public double getCsaldo() {
        return csaldo;
    }

    public void setCsaldo(double csaldo) {
        this.csaldo = csaldo;
    }

    public int getMnumeroS() {
        return MnumeroS;
    }

    public void setMnumeroS(int MnumeroS) {
        this.MnumeroS = MnumeroS;
    }

    public double getMvalor() {
        return Mvalor;
    }

    public void setMvalor(double Mvalor) {
        this.Mvalor = Mvalor;
    }

    public String getMOperacao() {
        return MOperacao;
    }

    public void setMOperacao(String MOperacao) {
        this.MOperacao = MOperacao;
    }

    public String getMnome() {
        return Mnome;
    }

    public void setMnome(String Mnome) {
        this.Mnome = Mnome;
    }

    public String getMnuit() {
        return Mnuit;
    }

    public void setMnuit(String Mnuit) {
        this.Mnuit = Mnuit;
    }

    public String getMData() {
        return MData;
    }

    public void setMData(String MData) {
        this.MData = MData;
    }

    public String getMHora() {
        return MHora;
    }

    public void setMHora(String MHora) {
        this.MHora = MHora;
    }

    
}
