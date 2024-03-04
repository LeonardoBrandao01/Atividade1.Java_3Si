package banco;

public class Funcionario {

    String nome;
    String departamento;
    Double salario;
    String dataEntrada;
    String rg;
    boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    } // departamento

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    } // data entrada

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    } // RG

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean getAtivo() {
        return ativo;
    } // ativo

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    void bonifica(double aumento) {
        this.salario = this.salario + aumento;
    }

    void demite() {
        this.ativo = false;
    }

    void mostra(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Documento: "+ this.rg);
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Salário: "+ this.salario);

        if (this.ativo==true){ System.out.println( "É um colaborador do banco ");
        }else {
            System.out.println("Foi desligado de suas atividades na empresa ");
        }

        System.out.println("data de inicio:"+ this.dataEntrada);



    }

}
