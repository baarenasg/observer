package org.example;

public class Periodico extends Subject {
    private String articulo;

    public void addArticulo(String titulo){
        this.articulo = titulo;
        System.out.println("Se agregó un nuevo artículo");
        this.notifiy();
    }
    public String getArticulo(){
        return articulo;
    }
    @Override
    public void notifiy(){
        observers.forEach(observer -> observer.update(this.articulo));
    }

    public void removeByName(String name){
        this.removeObserver(observers.stream().filter(observer -> observer instanceof Lector && ((Lector) observer).getName().equals(name))
                .findFirst()
                .get());
    }
}
