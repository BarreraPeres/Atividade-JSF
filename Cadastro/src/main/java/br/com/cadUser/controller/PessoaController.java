package br.com.cadUser.controller;

import br.com.cadUser.model.Pessoa;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class PessoaController {
	private Pessoa pessoa = new Pessoa();
	
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String addNomeDigitado() {
        pessoa.getNomesDigitados().add(pessoa.getNome());
        return "sucesso";  // Redireciona para a página 'sucesso.xhtml'
    }

}
