
package Parcial;

import javax.swing.JOptionPane;


public class CrearLista { 
  Nodo cab;
  Nodo col;
  private int tamaño=0;
    public void CrrearLista(){
cab = null;
col = null;
}
public void Crear(String nombre, String documento, int edad){
    Nodo nuevo = new Nodo();
    nuevo.setNombre(nombre);
    nuevo.setDocumento(documento);
    nuevo.setEdad(edad);
    nuevo.setSiguiente(null);
    nuevo.setAnterior(null);
    
    if( edad>=65){
      if(cab==null){
    cab=nuevo;
    col= nuevo;
    tamaño=tamaño+1;
        
    }
    else{
    nuevo.setSiguiente(cab);
    cab.setAnterior(nuevo);
    col = cab;
    cab = nuevo;
    tamaño=tamaño+1;

    }
    
        
        ///editado
    }
    else {
    Nodo temporal=cab;
    
    if(temporal==null){
    cab=nuevo;
    col=nuevo;
    tamaño=tamaño+1;
    }
    else{
    while(temporal.getSiguiente()!=null){
    temporal = temporal.getSiguiente();
    }
    if(temporal==cab){
    cab.setSiguiente(nuevo);
    nuevo.setAnterior(cab);
    col=nuevo;
    tamaño=tamaño+1;
    }
    else{
    temporal.setSiguiente(nuevo);
    nuevo.setAnterior(temporal);
    col=nuevo;
    tamaño=tamaño+1;
    }
    }
    }
    }
    public void imprimir(){
    Nodo temporal = cab;
    if(temporal==null){
        System.out.println("No hay datos en lista");
        System.out.println("---------------------------------->");
    }
    while(temporal!=null){
        System.out.println("Nombre = "+temporal.getNombre());
        System.out.println("Edad = "+temporal.getEdad());
        System.out.println("Documento = "+temporal.getDocumento());
        System.out.println("---------------------------------->");
        temporal=temporal.getSiguiente();
    }
    }
    public void buscar(){
    String bus = JOptionPane.showInputDialog("Ingrese el documento");
    Nodo temporal = cab;
    while(!temporal.getDocumento().equals(bus)){
        temporal = temporal.getSiguiente();
        }
    if(temporal.getDocumento().equals(bus)){
        if(temporal==cab){
        System.out.println("RESULTADO DE BUSQUEDA");
        System.out.println("Nombre = "+temporal.getNombre());
        System.out.println("Edad = "+temporal.getEdad());
        System.out.println("Documento = "+temporal.getDocumento());
        System.out.println("Atras no hay nadie");
        System.out.println("Adelante esta = "+temporal.getSiguiente().getNombre());
        System.out.println("---------------------------------->");
    }else{
            if(temporal.getSiguiente()==null){
            System.out.println("RESULTADO DE BUSQUEDA");
        System.out.println("Nombre = "+temporal.getNombre());
        System.out.println("Edad = "+temporal.getEdad());
        System.out.println("Documento = "+temporal.getDocumento());
        System.out.println("Atras esta = "+temporal.getAnterior().getNombre());
        System.out.println("Adelante no hay nadie");
        System.out.println("---------------------------------->");
        }else{
            System.out.println("RESULTADO DE BUSQUEDA");
        System.out.println("Nombre = "+temporal.getNombre());
        System.out.println("Edad = "+temporal.getEdad());
        System.out.println("Documento = "+temporal.getDocumento());
        System.out.println("Atras esta = "+temporal.getAnterior().getNombre());
        System.out.println("Adelante esta = "+temporal.getSiguiente().getNombre());
        System.out.println("---------------------------------->");
        }}
    }
    else{
        System.out.println(bus+" no esta en la lista");
        System.out.println("---------------------------------->");
    }
    }
    public void editar(){
    Nodo temporal = cab;
    String n;
    int e;
    String bus = (JOptionPane.showInputDialog("Ingrese el documento de la persona para cambiar los datos"));
     while(!temporal.getDocumento().equals(bus)){
     temporal = temporal.getSiguiente();
     }
     if(temporal.getDocumento().equals(bus)){
     n = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
     e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad"));
     temporal.setNombre(n);
     temporal.setEdad(e);
     }
     else{
     System.out.println("Esta persona no esta en la lista");
     System.out.println("---------------------------------->");
     }
    }
    public void EliminarPorDocumento(){
    Nodo temporal = cab;
    Nodo anterior=null;
        String bus = (JOptionPane.showInputDialog("Ingrese el documento de la persona para eliminar"));
      while(!temporal.getDocumento().equals(bus)){
          anterior = temporal;
        temporal = temporal.getSiguiente();
        }
      if(temporal.getDocumento().equals(bus)){
      if(temporal == cab){
      anterior = temporal;
      temporal = temporal.getSiguiente();
      anterior.setSiguiente(null);
      temporal.setAnterior(null);
      cab = temporal;
      tamaño=tamaño-1;
      }
      else{
      if(temporal==col){
      col.setAnterior(null);
      anterior.setSiguiente(null);
      col = anterior;
      tamaño=tamaño-1;
      }
      else{
      Nodo adelante = temporal.getSiguiente();
      temporal.setSiguiente(null);
      temporal.setAnterior(null);
      temporal =null;
      anterior.setSiguiente(adelante);
      adelante.setAnterior(anterior);
      tamaño=tamaño-1;
      }
      }
    }
      
      else{
      System.out.println("Esta persona no esta en la lista");
     System.out.println("---------------------------------->");
      }
    }
    public void CantidadDePersonas(){
          System.out.println("Hay "+tamaño+" en la lista");
      }
    public void EliminarTodo(){
        cab = null;
        col = null;
        tamaño = 0;
        System.out.println("Se elimino la lista");
        System.out.println("------------------------>");
    }
    public void BuscarMayor(){
        Nodo temporal= cab;
        int mayor=0;
        int valor=0;
        String nombre = null;
        String documento= null;
        for(int i=1;i<=tamaño;i++){
            if(temporal.getEdad()>=mayor){
                mayor=temporal.getEdad();
            }
            temporal=temporal.getSiguiente();
        }
        valor=mayor;
        Nodo nodocomp=cab;
        for(int i=1;i<=tamaño;i++){
            String nombre1 = null;
            String documento1= null;
            if(valor==nodocomp.getEdad()){
                nombre1=nodocomp.getNombre();
                documento1=nodocomp.getDocumento();
        System.out.println("PERSONA MAYOR EN LA POSICION #"+i+":");
        System.out.println("Nombre: "+nombre1);
        System.out.println("Documento: "+documento1);
        System.out.println("Edad: "+valor);
            }
            nodocomp=nodocomp.getSiguiente();
        }
    }
}

    
