package Negocio;

public class RegrasNegocio {

public String verificaDados(int idade){
    if(idade >=18)
        return "Cadastro efetuado com sucesso ";
    else
        return "Cadastro invalido1";
}    
}
