package Curso.ejecutable;

import Curso.Service.ExamenService;
import Curso.Service.ProfesorService;
import Curso.Service.impl.ExamenServiceImpl;
import Curso.Service.impl.ProfesorServiceImpl;
import Personal.Alumno;

public class Menu {
	public static void main(String args[]) {
		ExamenService impl=new ExamenServiceImpl();
		Alumno uriel=new Alumno();
		uriel.setCalificacion(10);
		uriel.setPersona("Irvin Uriel", "Aguilar Cosme", 23, 'H');
		impl.aplicarExamen(uriel);
		System.out.println("\n------------------------Lista Alumnos-----------------");
		ProfesorService impl2=new ProfesorServiceImpl();
		Alumno[] alumnos=new Alumno[10];
		for(int i=1;i<10;i++) {
			alumnos[i]=new Alumno();
			alumnos[i].setCalificacion(sacarPromedio());
		}
		alumnos[0]=uriel;
		alumnos[1].setPersona("Fulanito 1", "Perez Perez", 20, 'M');
		alumnos[2].setPersona("Fulanito 2", "Perez Perez", 21, 'H');
		alumnos[3].setPersona("Fulanito 3", "Perez Perez", 22, 'M');
		alumnos[4].setPersona("Fulanito 4", "Perez Perez", 23, 'H');
		alumnos[5].setPersona("Fulanito 5", "Perez Perez", 24, 'M');
		alumnos[6].setPersona("Fulanito 6", "Perez Perez", 23, 'H');
		alumnos[7].setPersona("Fulanito 7", "Perez Perez", 22, 'H');
		alumnos[8].setPersona("Fulanito 8", "Perez Perez", 21, 'H');
		alumnos[9].setPersona("Fulanito 9", "Perez Perez", 20, 'M');
		impl2.aplicarExamen(alumnos);
		
		System.out.println("------------Gerarquia de operadores algebraicos-----------");
		String Nombre="Irvin Uriel";
        int a=5,b=6,c=3,d=8,resultado;
        resultado=a+b*c/d;
		System.out.println("Resultado= "+resultado);
	}
	public static double sacarPromedio() {
		return Math.random()*10;
	}
}
