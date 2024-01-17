/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosnum;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;
/**
 *
 * @author Yasmin
 */
public class derivada {
    private String funcion="";
    
    DJep djep;
    Node nodofuncion;
    Node nododerivada;


public derivada(){


}  
public void setfuncionaderivar(String funcion){
this.funcion=funcion; 
}
    public String getfuncionderivada(){
    return this.funcion;
    } 
    
    public void derivar(){
     try{
     this.djep=new DJep();
     this.djep.addStandardFunctions();
     this.djep.addStandardConstants();
     this.djep.addComplex();
     this.djep.setAllowUndeclared(true);
     this.djep.setAllowAssignment(true);
     this.djep.setImplicitMul(true);
     this.djep.addStandardDiffRules();
     this.nodofuncion=this.djep.parse(this.funcion);
     
     Node diff= this.djep.differentiate(nodofuncion, "x");
     this .nododerivada=this.djep.simplify(diff);
     this.funcion=this.djep.toString(this.nododerivada);
     
     } catch (ParseException e) {
         System.out.println("Error"+e.getErrorInfo());
     }
    }
}
