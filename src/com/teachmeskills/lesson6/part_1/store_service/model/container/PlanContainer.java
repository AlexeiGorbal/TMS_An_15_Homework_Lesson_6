package com.teachmeskills.lesson6.part_1.store_service.model.container;

public class PlanContainer {

    int width;
    int length;
    int depth;

    public PlanContainer(){
        System.out.println("Without parameters");
    }

    public PlanContainer(int w){
        System.out.println("With 1 parameter");
        this.width = w;
    }

    public PlanContainer(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public PlanContainer(int w, int l, int d){
        System.out.println("With parameters");
        this.width = w;
        this.depth = d;
        this.length = l;
    }

    public void showConrainerMesssage(){
        System.out.println("Show container message");
    }

    public void showConrainerMesssage(int n){
        System.out.println("____________________");
        for(int i = 0; i < n; i++){
            System.out.println("This is a container");
        }
        System.out.println("____________________");
    }

    public String getMessage(){
        return "THIS IS SPARTA";
    }


}
