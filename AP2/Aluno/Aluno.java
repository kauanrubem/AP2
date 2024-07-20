package Aluno;

public class Aluno {
    
private String nome;
private String matricula;
private String dataNascimento;
private String CPF;

public void setNome(String nomeAluno){
nome = nomeAluno;
}

public String getNome (){
return nome;
}

public void setMatricula(String matriculaAluno){
matricula = matriculaAluno;
}
        
public String getMatricula (){
return matricula;
}

public void setDataNascimento(String dataNascimentoAluno){
dataNascimento = dataNascimentoAluno;
}
            
public String getDatadenascimento (){
return dataNascimento;
}

        
public void setCPF(String CPFAluno){
CPF = CPFAluno;
}
                    
public String getCPF (){
return CPF;
}
}
