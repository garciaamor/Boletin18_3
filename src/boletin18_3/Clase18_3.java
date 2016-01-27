package boletin18_3;

import javax.swing.JOptionPane;

public class Clase18_3 {
    int numElementos=pedirElementos();
    int []notasModulo =new int[numElementos];
    String []nomes = new String [numElementos];
    String auxn;
    int aux;
    
    public int pedirElementos(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de alumnos") );
    }
    public String pedirNome(){
           return JOptionPane.showInputDialog("Introduce el nombre del alumno");
       }
    public int ponerNotas(){
          int notas;
        do{
            notas=Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota"));
            if (notas<1||notas>10)
                JOptionPane.showMessageDialog(null, "Introduce una nota valida (entre 1 y 10)");
        } while (notas<1||notas>10);
        return notas;
    }
    public void cargarArray(){
        for (int i=0;i<notasModulo.length;i++){
            nomes[i]=pedirNome();
            notasModulo[i]=ponerNotas();
            
        }
    }
    public void notaAlta(){
        int mayor = 0;
        for (int i=0;i<notasModulo.length;i++){
            if (notasModulo[i]>mayor){
                mayor=notasModulo[i];
            }
               }
        System.out.println("La nota mas alta es : "+mayor);
    }
    public void notaMedia(){
        int media=0;
        
        for (int i=0;i<notasModulo.length;i++){
            media=media+notasModulo[i];
        }       
        
        System.out.println("La nota media de la clase es  : "+media/notasModulo.length );
    }
    public void aprobados(){
        int aprobados=0;
        int suspensos=0;
        for (int i=0;i<notasModulo.length;i++){
          if (notasModulo[i]<5){
              suspensos++;
              
          }
          else {aprobados++;
          }
        }
        System.out.println("numero de suspensos  "+suspensos);
        System.out.println("numero de aprobados  "+aprobados +" \n");
    }
    public void visualObj(){
        int x=0;
        for (int i=0;i<numElementos;i++){
            
        }do{
            x=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion del alumno"));
            if (x<0||x>numElementos)
                JOptionPane.showMessageDialog(null, "Introduce una numero entre 1 y "+ numElementos);
        } while (x<0||x>numElementos);
                
        System.out.println("La nota del alumno "+ x +" es : "+notasModulo[x-1] + "\n");
    }
    public void listaAprobados(){
        String aprobadoslist="";
        for (int i=0;i<numElementos;i++){
            if (notasModulo[i]>=5){
                aprobadoslist+=nomes[i]+"  aprobo con un : "+notasModulo[i]+"\n";
            }
        }
        System.out.println(aprobadoslist);
    }
    public void mentomay(){
           for (int i=0;i<numElementos-1;i++){
               for (int j=i+1;j<numElementos;j++)
                   if (notasModulo[i]>notasModulo[j]){
                       aux=notasModulo[i];
                       notasModulo[i]=notasModulo[j];
                       notasModulo[j]=aux;
                       auxn=nomes[i];
                       nomes[i]=nomes[j];
                       nomes[j]=auxn;                       
                   }
                  }
           System.out.println("");
    }
    public void visualizarOrden(){
        
        for (int i=0;i<numElementos;i++){
            System.out.println("Alumno "+ nomes[i] + "  nota : " +notasModulo[i]);
        }
    }
    public void consultarNota(){
           String nomBusqueda=JOptionPane.showInputDialog("introduce el nombre del alumno a buscar");
           boolean atopado=false;
           for (int i=0;i<numElementos;i++){
               if ((nomes[i].compareToIgnoreCase(nomBusqueda)==0)){
                   System.out.println("el alumno de nombre "+ nomBusqueda + "  ha sacado un "+notasModulo[i]);
                   atopado=true;
               }
           }
       }
}
