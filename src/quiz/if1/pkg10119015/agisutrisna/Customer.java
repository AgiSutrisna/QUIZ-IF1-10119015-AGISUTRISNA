/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119015.agisutrisna;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class Customer {
    private String name;
    private String email;
    private boolean member;
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public boolean getMember(){
        return this.member;
    }
    
    public void setEmail(boolean member){
        this.member = member;
    }
}
