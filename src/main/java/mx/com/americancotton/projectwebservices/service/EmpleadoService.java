/**
 * 
 */
package mx.com.americancotton.projectwebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import mx.com.americancotton.projectwebservices.entity.Empleado;

/**
 * @author sistemas
 *
 */
public class EmpleadoService {

	/**
	 * Metodo que permite consultar un empleado por su id
	 * @param numEmpleado {@link String} numero del empleado
	 * @return {@link Empleado} empleado consultado.
	 */
	public Empleado consultarEpleadoPorNumeroEmpleado(String numEmpleado) {
		List<Empleado> empleadosConsultados = this.consultarEmpleados();
		
		for (Empleado empleadoConsultado : empleadosConsultados) {
			if (empleadoConsultado.getNumEmpleado().equals(numEmpleado)) {
				return empleadoConsultado;
			}
		}
		return null;

	}

	/**
	 * Metodo que simula la consulta de un empleado
	 * 
	 * @return {@link Empleado} empleado consutado
	 */
	public Empleado consultarEmpleado() {
		Empleado empleado = new Empleado();
		empleado.setNumEmpleado("123");
		empleado.setNombre("David");
		empleado.setPrimerApellido("Serrano");
		empleado.setSegundoApellido("Cortés");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(28);
		return empleado;
	}

	/**
	 * Metodo que permite consultar la lista de empleados
	 * @return {@link List} Lista consultada
	 */
	public List<Empleado> consultarEmpleados() {
		List<Empleado> empleados = new ArrayList();

		Empleado empleado = new Empleado();
		empleado.setNumEmpleado("123");
		empleado.setNombre("David");
		empleado.setPrimerApellido("Serrano");
		empleado.setSegundoApellido("Cortés");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(28);

		Empleado empleado2 = new Empleado();
		empleado2.setNumEmpleado("465");
		empleado2.setNombre("Erik");
		empleado2.setPrimerApellido("Guerrero");
		empleado2.setSegundoApellido("Gomez");
		empleado2.setFechaCreacion(LocalDateTime.now());
		empleado2.setEdad(28);

		empleados.add(empleado);
		empleados.add(empleado2);

		return empleados;

	}

}
