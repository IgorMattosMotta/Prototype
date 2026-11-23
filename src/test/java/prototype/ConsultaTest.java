package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsultaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Consulta consulta = new Consulta(1, "Dr. Carlos Lima", new Paciente("Paciente Original", 30), "Cardiologia");

        Consulta consultaClone = consulta.clone();
        consultaClone.setNumero(2);
        consultaClone.setMedico("Dra. Ana Costa");
        consultaClone.getPaciente().setNome("Paciente Clonado");

        assertEquals("Consulta{numero=1, medico='Dr. Carlos Lima', paciente=Paciente{nome='Paciente Original', idade=30}, especialidade='Cardiologia'}", consulta.toString());
        assertEquals("Consulta{numero=2, medico='Dra. Ana Costa', paciente=Paciente{nome='Paciente Clonado', idade=30}, especialidade='Cardiologia'}", consultaClone.toString());
    }
}
