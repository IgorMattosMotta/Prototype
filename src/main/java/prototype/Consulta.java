package prototype;

public class Consulta implements Cloneable {
    private int numero;
    private String medico;
    private Paciente paciente;
    private String especialidade;

    public Consulta(int numero, String medico, Paciente paciente, String especialidade) {
        this.numero = numero;
        this.medico = medico;
        this.paciente = paciente;
        this.especialidade = especialidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public Consulta clone() throws CloneNotSupportedException {
        Consulta consultaClone = (Consulta) super.clone();
        consultaClone.paciente = (Paciente) consultaClone.paciente.clone();
        return consultaClone;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "numero=" + numero +
                ", medico='" + medico + '\'' +
                ", paciente=" + paciente +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
