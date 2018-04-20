package Curso.Service.impl;

import Curso.Service.ExamenService;
import Personal.Alumno;

public class ExamenServiceImpl implements ExamenService{

	@Override
	public void aplicarExamen(Alumno uriel) {
		// TODO Auto-generated method stub
		System.out.print("Nombre: "+uriel.getNom()+"\nApellidos: "+uriel.getApellidos()+"\nEdad: "+uriel.getEdad()+"\nSexo: "+uriel.getSexo());
		System.out.println("\nHerencia: Para programacion es cuando una clase hereda de otra clase ya existente adquiriendo sus variables y metodos asi como tambien su comportamiento.");
		System.out.println("Polimorfismo: Es especificar a un objeto pueda tener ciertos atributos especificos que lo distingue de otro.");
		System.out.println("Encapsulamiento: Siempre inicia desde cuando se crea un paquete donde contendra los atributos y metodos en privado.\n\tAyuda para ocultar cierto contenido que no puede ser utilizado por un usuario.");
		System.out.println("Calificacion: "+uriel.getCalificacion());
	}

}
