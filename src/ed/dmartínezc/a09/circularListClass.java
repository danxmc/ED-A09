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
public class circularListClass<T> {

    //Atributes
    private nodeClass pivot;

    //Constructor
    public circularListClass() {
        pivot = null;
    }

    protected void insert(T d) {
        nodeClass node = new nodeClass(d);
        if (!isEmpty()) {//Si la lista no esta vacia
            //Inserta el nodo al inicio y recorremos los nodos
            node.next = pivot;
            findLast().next = node;
            pivot = node;
        } else {//Si la lista esta vacio
            //Insertar nodo al inicio y apuntador se señala a si mismo
            pivot = node;
            node.next = pivot;
        }
    }

    private boolean isEmpty() {
        return pivot == null;
    }

    protected void eNode(T d) {
        if (isEmpty()) {
            System.out.println("Lista vacia");
        } else if (findLast().next.getData() == d) {//Si el dato esta en el pivote
            nodeClass aux = findLast();
            aux.next = aux.next.next;//El apuntador anterior ahora apunta al siguiente nodo del pivote
            pivot = aux.next;//El pivote ahora es el sigueinte nodo del anterior pivote
            System.out.println("Dato '" + d + "' eliminado");
        } else { //Si el dato no esta en el pivote
            nodeClass aux = pivot;
            while (aux.next.getData() != d && aux.next != pivot) {
                aux = aux.next;
            }
            if (aux.next.getData() == d) {
                aux.next = aux.next.next;
                System.out.println("Dato '" + d + "' eliminado");
            } else {
                System.out.println("No se encontro el dato");
            }
        }
    }

    private nodeClass findLast() {
        nodeClass aux = pivot;
        while (aux.next != pivot) {
            aux = aux.next;
        }
        return aux;
    }

    protected nodeClass searchNode(T d) {
        nodeClass aux = pivot;
        do {
            if (aux.getData() == d) {
                return aux;
            } else {
                aux = aux.next;
            }
        } while (aux != pivot || aux.getData() != d);
        return null;
    }

    protected void showList() {
        if (isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            nodeClass aux = pivot;
            System.out.print("[" + aux.getData() + "] ");
            while (aux.next != pivot) {
                System.out.print("[" + aux.next.getData() + "] ");
                aux = aux.next;
            }
            System.out.println("");
        }
    }
}
