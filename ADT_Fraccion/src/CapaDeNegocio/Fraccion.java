/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeNegocio;

/**
 *
 * @author ferna
 */
public class Fraccion {
    //Atributos
    int numerador; //Contiene el Numerador y signo
    int denominador; //Contiene el Denominador
    //Constuctor

    public Fraccion() {
        this.numerador=0;
        this.denominador=1;
    }

    public Fraccion(char signo,int num,int deno){
        if (deno==0) {
            System.out.println("Error:Fraccion:El Denominador es 0");
            System.exit(1);  //sale del algoritmo
        }else{
            if (signo=='+') {       //el Signo va con el numerador
                this.numerador=+Math.abs(num);
            }else{
                this.numerador=-Math.abs(num);
            }
            this.denominador=Math.abs(deno);
        }
    }
    /*Nombre:SetNumerador
    Descripcion:insertar el numerador
    Datos De entrada:un numerador
    Datos de Salida:no
    Pre Condicion:no
    Post Condicion:insertar el numerador
    */
    public void setNumerador(int num){
        if (this.numerador>=0) {
            this.numerador=Math.abs(num);
        }else{
            this.numerador=-Math.abs(num);
        }
        //Simplificar();
    }
    
    /*Nombre:SetDenominador
    Descripcion:insertar el Denominador
    Datos De entrada:un Denominador
    Datos de Salida:no
    Pre Condicion:no
    Post Condicion:insertar el Denominador
    */
    public void setDenominador(int deno){
        if (deno==0) {
            System.out.println("Error:setDenominador:El Denominador es 0");
            System.exit(1);
        }else{
            this.denominador=Math.abs(deno);
        }
        //Simplificar();
    }
    /*Nombre:SetSigno
    Descripcion:insertar el Signo
    Datos De entrada:un Signo
    Datos de Salida:no
    Pre Condicion:no
    Post Condicion:insertar el Signo
    */
    public void setSigno(char signo){
        if (signo=='+') {
            this.numerador=+Math.abs(numerador);
        }else{
            this.numerador=-Math.abs(numerador);
        }
    }
    
    
    public int getNumerador(){
        return Math.abs(numerador);
    }
    
    public int getDenominador(){
        return denominador;
    }
    
    public char getSigno(){
        if (this.numerador>=0) {
            return '+';
        }else{
            return '-';
        }
    }
    
   
    
    @Override
    public String toString() {
      String S="";
     /// S=S+" "+getNumerador()+"\n "+getSigno()+"  "+"------\n"+getDenominador();
     S=S+getSigno()+" "+getNumerador()+"/"+getDenominador();
       return S;
    }
    
    
    public static void main(String[] args) {
        Fraccion fraccionP=new Fraccion();
        System.out.println(fraccionP.toString()); 
        System.out.println("--------------------------------------------------------------");
        //Llamada de un procedimento 
        fraccionP.setNumerador(2);
        fraccionP.setSigno('+');
        fraccionP.setDenominador(3);
         System.out.println(fraccionP.toString()); 
    }
    
}
