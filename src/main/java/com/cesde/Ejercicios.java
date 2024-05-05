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
        if(calificacion >= 3.5){
            return "¡Felicidades! Usted ha aprobado el examen.";
        }else {
            return "Lo siento, usted ha reprobado el examen.";
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
        
        double area = 0;
        switch (tipoFigura) {
            case 1:
                //Area del cuadrado
                area = ladoCuadrado*ladoCuadrado;
                break;
                //Area del triangulo
            case 2:
                area = (baseTriangulo*alturaTriangulo)/2;
                break;
                //Area del circulo
            case 3: 
                area = Math.PI*(Math.pow(radioCirculo, 2));
                break;
            default:
                 return "Tipo de figura no válida.";
        }
        return "El área de la figura es: " + area;
    }
    
    public int ejercicio5(int num1, int num2, int num3) {
        int numeroMenor = num1;
        if(num2 < numeroMenor){
        numeroMenor = num2;
        }
        if(num3 < numeroMenor){
        numeroMenor = num3;
        }
        return numeroMenor;
    }
}
