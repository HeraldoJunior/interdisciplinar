package br.opet.tds172a.projetointerdisciplinar.controller;

import java.util.List;

import br.opet.tds172a.projetointerdisciplinar.model.ClienteModel;
import br.opet.tds172a.projetointerdisciplinar.vo.Cliente;
import br.opet.tds172a.projetointerdisciplinar.vo.Produto;

/**
 * 
 * @author heraldo
 *
 */
public class ClienteController {

	private ClienteModel clienteModel;

	public ClienteController() {

		this.clienteModel = new ClienteModel();
	}

	/**
	 * função que insere o cliente e retorna se foi efetuado ou não
	 * 
	 * @param cliente
	 * @return
	 */
	public boolean inserirCliente(Cliente cliente) {

		return this.clienteModel.inserirCliente(cliente);

	}

	/**
	 * função que exclui o cliente e retorna se foi efetuado ou não
	 * @param cliente 
	 * 
	 * @return
	 */
	public String excluirCliente(String cpfCliente) {

		return this.clienteModel.excluirCliente(cpfCliente);

	}

	/**
	 * função que altera o cliente e retorna se foi efetuado ou não
	 * 
	 * @param cpfCliente
	 * @param cliente
	 * @return
	 */
	public Cliente alterarCliente(Cliente cliente) {

		return this.clienteModel.alterarCliente(cliente);
	}

	/**
	 * meotodo de efetuar o login
	 * @param cliente
	 * @return
	 */
	public Cliente efetuarLogin(Cliente cliente) {

		return this.clienteModel.efetuarLogin(cliente);
	}

	/**
	 * metodo de listagem dos produtos
	 * 
	 * @return
	 */
	public List<Produto> listarProdutos() {
		List<Produto> listaProdutosRecuperados = clienteModel.listarProdutos();

		return listaProdutosRecuperados;
	}

}
