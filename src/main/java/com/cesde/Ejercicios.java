package com.cesde;

public class Ejercicios {
    
    public String ejercicio1(int num1, int num2) {
        if (num1 > num2){
            return "El número mayor es: " + num1;
        } else if (num2 > num1){
            return "El número mayor es: " + num2;
        } else{
            return "Los dos números son iguales.";
        }
    }
    
    public String ejercicio2(double calificacion) {
        if(calificacion < 3.5){
            return "Lo siento, usted ha reprobado el examen.";
        }else {
            return "¡Felicidades! Usted ha aprobado el examen.";
        }
    }

    
    public double ejercicio3(double precio) {
        if (precio >= 50000) {
            double descuento = 0.1;
            precio -= precio * descuento;
        }
        return precio;        
    }
    
    public String ejercicio4(int tipoFigura, double ladoCuadrado, double baseTriangulo, double alturaTriangulo,
            double radioCirculo) {
        // Implementar solución
        return "";
    }
    
    public int ejercicio5(int num1, int num2, int num3) {
        int numeroMenor = Math.min(Math.min(num1, num2), num3);
        return numeroMenor;
    }
}
