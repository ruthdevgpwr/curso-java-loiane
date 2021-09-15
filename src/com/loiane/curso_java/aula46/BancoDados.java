package com.loiane.curso_java.aula46;

public interface BancoDados extends sqlDCL, sqlDDL, sqlDML{

    void abrirConexao();
    void fecharConexao();
}
