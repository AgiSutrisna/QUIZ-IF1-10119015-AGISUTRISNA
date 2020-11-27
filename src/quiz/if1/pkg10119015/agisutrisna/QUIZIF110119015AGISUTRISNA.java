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
public class QUIZIF110119015AGISUTRISNA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer pelanggan = new Customer();
        pelanggan.setName("Agi Sutrisna");
        pelanggan.setEmail("AgySut01@yahoo.com");
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.println("Customer Name : " + pelanggan.getName());
        System.out.println("Customer Email : " + pelanggan.getEmail());
        
        
    }
    
}
