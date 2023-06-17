package org.example;

public class Lector implements Observer {
    private String name;

    public Lector(String name){
        this.name =name;
    }

    @Override
    public void update(String param) {
        System.out.println(name + ": Se publiícado el siguiente articulo: " + param);
    }

    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Lector{" +
                "name='" + '\'' +
                '}';
    }
}
