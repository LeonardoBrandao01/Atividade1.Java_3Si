package banco;

public class TesteFuncionario {

    public static void main(String[] args){

        Funcionario f1 = new Funcionario();

        f1.nome = "Leozim";
        f1.salario = 100.0;
        f1.bonifica(50);
        f1.ativo = true;
        f1.rg = "581406154";
        f1.dataEntrada ="01/03/2023";
        f1.departamento = "Almoxarifado";


        System.out.println("salario atual: "+ f1.salario);
        System.out.println("documento do funcionário:"+ f1.rg);
        System.out.println("departamento: " + f1.departamento);

        if (f1.ativo==true){ System.out.println( "É um colaborador do banco ");

        }else {
            System.out.println("Foi desligado de suas atividades na empresa ");
        }



        f1.demite();  //demissão do funcionário

        if (f1.ativo==true){ System.out.println( "É um colaborador do banco ");

        }else {
            System.out.println("Foi desligado de suas atividades na empresa ");
        }

        f1.mostra();













    }

}
