package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable; //para poder usar la suma o lo demas los n1 y n2
	

@RestController
public class Cacluladora {
 //Esta es la pagina princpial de la calculadora, se usa el getmaping para asi leer el link de la pagina
	@GetMapping ("/")
	public String root () {
		return "Calculadora web de temu";
		
	}
	//Lo de aria es el mensage por defecto al entrar a la pagina, lo cual sirve para ver que este funciona
	//para hacer la suma es necesario el escribir suma en el biscador despues de /
	@GetMapping ("/suma/{n1}/{n2}")
	public String sumar(@PathVariable int n1, @PathVariable int n2	) {
		int resultado =n1+n2;
		return "La suma web es "+ resultado;
		
	}
}
