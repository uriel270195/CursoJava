package Curso.Service.impl;

import Curso.Service.ProfesorService;
import Personal.Alumno;

public class ProfesorServiceImpl implements ProfesorService{

	@Override
	public void aplicarExamen(Alumno[] alumnos) {
		// TODO Auto-generated method stub
		//mandar 10 alumnos y sacar el promedio de calificacion aleatoria del 0 al 10
		double promedio=0,max=0,min=10;
		int maxp=0,minp=0;
		for(int i=0;i<10;i++) {
			//System.out.print("Nombre: "+alumnos[i].getNom()+"\nApellidos: "+alumnos[i].getApellidos()+"\nEdad: "+alumnos[i].getEdad()+"\nSexo: "+alumnos[i].getSexo());
			//System.out.println("\nCalificacion: "+String.format("%.2f", alumnos[i].getCalificacion()));
			System.out.println("Nombre\t\tApellidos\tEdad\tSexo\tPromedio");
			System.out.println(alumnos[i].getNom()+"\t"+alumnos[i].getApellidos()+"\t"+alumnos[i].getEdad()+"\t"+alumnos[i].getSexo()+"\t"+String.format("%.2f", alumnos[i].getCalificacion()));
			
			promedio=promedio+alumnos[i].getCalificacion();
			if(min>alumnos[i].getCalificacion()) {
				min=alumnos[i].getCalificacion();
				minp=i;
			}
			if(max<alumnos[i].getCalificacion()) {
				max=alumnos[i].getCalificacion();
				maxp=i;
			}
		}
		promedio=promedio/alumnos.length;
		System.out.println("\n\n\t\tPromedio: "+String.format("%.2f", promedio));
		System.out.println("\n\n\t\tCalificacion mas alta: "+String.format("%.2f", max)+" de "+alumnos[maxp].getNom());
		System.out.println("\n\n\t\tCalificacion mas baja: "+String.format("%.2f", min)+" de "+alumnos[minp].getNom());
	}

}
