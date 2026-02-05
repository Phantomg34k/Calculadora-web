package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable; //para poder usar la suma o lo demas los n1 y n2
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
 
public class Calculadora {
//Se cambia el link para ahora pedir la calc y despues el / y despues la accion, esto por requerimientos necesarios 
      //Esta es la pagina princpial de la calculadora, se usa el getmaping para asi leer el link de la pagina
    @GetMapping("/")
    public String root() {
        return "Calculadora web de temu ";
    }
  //Lo de aria es el mensage por defecto al entrar a la pagina, lo cual sirve para ver que este funciona
  	//para hacer la suma es necesario el escribir suma en el biscador despues de /
    @GetMapping("/resta/{n1}/{n2}")
    public String restar(@PathVariable int n1, @PathVariable int n2) {
        int resultado = n1 - n2;
        return "La resta es " + resultado;
    }
    @GetMapping("/suma/{n1}/{n2}")
    public String sumar(@PathVariable int n1, @PathVariable int n2) {
        int resultado = n1 + n2;
        return "La suma es " + resultado;
    }
    
    //Multiplicacion web
    @GetMapping("/multi/{n1}/{n2}")
    public String multiplicar(@PathVariable int n1, @PathVariable int n2) {
        int resultado = n1*n2;
        return "La multiplicación es " + resultado;
    }
}