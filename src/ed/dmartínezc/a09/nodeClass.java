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
public class nodeClass<T> {

    //Atributos
    nodeClass next;
    private T data;

    //Constructor
    public nodeClass() {
        this.data = null;
        this.next = null;
    }

    public nodeClass(T data) {
        this.data = data;
        this.next = null;
    }

    protected T getData() {
        return this.data;
    }

    protected void setData(T d) {
        this.data = d;
    }

}
