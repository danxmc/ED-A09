/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.a09;

/**
 *
 * @author danx_
 */
public class EDDMartínezCA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circularListClass Lista = new circularListClass();
        Lista.insert('O');
        Lista.insert('L');
        Lista.insert('L');
        Lista.insert('A');
        Lista.insert('H');
        Lista.showList();
        Lista.eNode('A');
        Lista.showList();
    }
    
}
