package com.edureka.inter;
interface QueueInterface{


    void insert ();
    void delete();

}

public class Q1Interfaces implements QueueInterface {

    public void insert(){
        System.out.println("The data has been inserted.");
    }

    public void delete(){
        System.out.println("the data has been deleted.");
    }


    public static void main(String[] args){
        QueueInterface qRef = new Q1Interfaces();
        qRef.insert();
        qRef.delete();

    }
}
