
package stackbuilders;
import java.util.Date;
import java.util.Scanner;

public class StackBuilders {
    public static int leerEntero(String mensaje){
        Scanner br=new Scanner(System.in);
        System.out.println(""+mensaje);
        int dato=br.nextInt();
        return dato;
    }
    
    public static String leerString(String mensaje){
        Scanner br1=new Scanner(System.in);
        System.out.println(""+mensaje);
        String dato=br1.nextLine();
        return dato;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String dia;
        Scanner entrada=new Scanner(System.in);
        Auto a1=new Auto();
        Date fecha=new Date();
        int ultimo;       
        a1.setPlaca(leerString("Ingrese la placa del auto en formato PPP-XXXX: "));   
        char ultimo1=a1.getPlaca().charAt(7);    
        ultimo = Integer.parseInt(String.valueOf(ultimo1));
        dia = leerString("Ingrese el día (Primera letra con mayúsculas):");
        fecha.setHours(leerEntero("Ingrese la hora en formato XX 24h:"));
        fecha.setMinutes(leerEntero("Ingrese los minutos en formato XX 60m:"));
        System.out.println("La hora es: "+fecha.getHours()+":"+fecha.getMinutes());
        
        if (dia.equals("Lunes")){
            if(ultimo==1 || ultimo==2){   
                if (fecha.getHours()>=7 && fecha.getHours()<=9){
                        if(fecha.getMinutes()>0 && fecha.getMinutes()<=30){
                            System.out.println("***Puede circular****");
                            return;
                        }
                    }else if (fecha.getHours()>=16 && fecha.getHours()<=19){
                        if(fecha.getMinutes()>0 && fecha.getMinutes()<=30){
                            System.out.println("****Puede circular****");
                            return;
                        }
                    } 
                System.out.println("No puede circular");
                return;
            }
            System.out.println("Puede circular");
        }
        else if(dia.equals("Martes")){
            if(ultimo==3 || ultimo==4){   
                if (fecha.getHours()>=7 && fecha.getHours()<=9){
                        if(fecha.getMinutes()>0 && fecha.getMinutes()<=30){
                            System.out.println("****Puede circular****");
                            return;
                        }
                    }else if (fecha.getHours()>=16 && fecha.getHours()<=19){
                        if(fecha.getMinutes()>0 && fecha.getMinutes()<=30){
                            System.out.println("****Puede circular****");
                            return;
                        }
                    } 
                System.out.println("No puede circular");
                return;
            }
            System.out.println("Puede circular");        
        }
        else if(dia.equals("Miercoles")){
            if(ultimo==5 || ultimo==6){
                if (fecha.getHours()>=7 && fecha.getHours()<=9){
                        if(fecha.getMinutes()>0 && fecha.getMinutes()<=30){
                            System.out.println("****Puede circular****");
                            return;
                        }
                    }else if (fecha.getHours()>=16 && fecha.getHours()<=19){
                        if(fecha.getMinutes()>0 && fecha.getMinutes()<=30){
                            System.out.println("****Puede circular****");
                            return;
                        }
                    } 
                System.out.println("No puede circular");
                return;
            }     
            System.out.println("Puede circular");
        }
        else if(dia.equals("Jueves")){
            if(ultimo==7 || ultimo==8){
                if (fecha.getHours()>=7 && fecha.getHours()<=9){
                        if(fecha.getMinutes()>0 && fecha.getMinutes()<=30){
                            System.out.println("****Puede circular****");
                            return;
                        }
                    }else if (fecha.getHours()>=16 && fecha.getHours()<=19){
                        if(fecha.getMinutes()>0 && fecha.getMinutes()<=30){
                            System.out.println("****Puede circular****");
                            return;
                        }
                    } 
                System.out.println("No puede circular");
                return;
            }     
            System.out.println("Puede circular");
        }
        else if(dia.equals("Viernes")){
            if(ultimo==9 || ultimo==0){
                if (fecha.getHours()>=7 && fecha.getHours()<=9){
                        if(fecha.getMinutes()>0 && fecha.getMinutes()<=30){
                            System.out.println("****Puede circular****");
                            return;
                        }
                    }else if (fecha.getHours()>=16 && fecha.getHours()<=19){
                        if(fecha.getMinutes()>0 && fecha.getMinutes()<=30){
                            System.out.println("****Puede circular****");
                            return;
                        }
                    } 
                System.out.println("No puede circular");
                return;
            }     
            System.out.println("Puede circular");        
        }else if(dia.equals("Sabado") || dia.equals("Domingo")){            
                System.out.println("Puede circular");                  
        }
             
    }
}



    
    

