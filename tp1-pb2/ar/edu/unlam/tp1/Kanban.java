package ar.edu.unlam.tp1;

import java.util.HashSet;

public class Kanban {
	HashSet <Usuario>usuarios;
	HashSet <Tarea> tareas;
	
	public Kanban() {
		usuarios = new HashSet();
		tareas = new HashSet();
	}
	
	public Boolean agregarUsuario(Usuario nuevo) {
		return usuarios.add(nuevo);
	}
	
	public Boolean agregarTarea(Tarea nueva) {
		return tareas.add(nueva);
	}
	
	public Boolean cambiarDeEstadoLaTarea(Tarea nueva , String estadoNuevo , Usuario asignado) {
		for (Tarea tarea : tareas) {
			if (nueva.getNumeroDeTarea().equals(tarea.getNumeroDeTarea())) {
				if (nueva.getUsuarioQueLaCreo().getNombreDeUsuario().equals(asignado.getNombreDeUsuario())) {
					tarea.setEstado(estadoNuevo);
					return true;
				}else if (tarea.getEstado()!= "En curso") {
					tarea.setEstado(estadoNuevo);
					return true;
				}
			}
		}
		return false;
	}
}
