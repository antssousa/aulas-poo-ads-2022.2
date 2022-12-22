public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private int anoIngresso;
    private double coeficiente;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String dataNascimento, String telefone, String matricula, String curso,
            int anoIngresso, double coeficiente) {
        super(nome, cpf, dataNascimento, telefone);
        this.matricula = matricula;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.coeficiente = coeficiente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " Aluno [matricula=" + matricula + ", curso=" + curso + ", anoIngresso=" + anoIngresso
                + ", coeficiente="
                + coeficiente + "]";
    }

}
