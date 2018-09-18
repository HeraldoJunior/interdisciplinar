package br.opet.tds172a.projetointerdisciplinar.model;

import java.util.List;

import br.opet.tds172a.projetointerdisciplinar.dao.ClienteDAO;
import br.opet.tds172a.projetointerdisciplinar.vo.Cliente;
import br.opet.tds172a.projetointerdisciplinar.vo.Produto;

public class ClienteModel {

	private ClienteDAO clienteDAO;

	public ClienteModel() {
		this.clienteDAO = new ClienteDAO();
	}

	/**
	 * função que insere o cliente e retorna se foi efetuado ou não
	 * 
	 * @param cliente
	 * @return
	 */
	public boolean inserirCliente(Cliente cliente) {
		boolean deuCerto = clienteDAO.inserirCliente(cliente);
		return deuCerto;
		}

	/**
	 * metodo para excluir o cliente.
	 * 
	 * @param cpfCliente
	 * @return
	 */
	public String excluirCliente(String cpfCliente) {

		return this.clienteDAO.excluirCliente(cpfCliente);
	}

	/**
	 * função que altera o cliente e retorna se foi efetuado ou não
	 * 
	 * @param cpfCliente
	 * @param cliente
	 * @return
	 */
	public Cliente alterarCliente(Cliente cliente) {

		return this.clienteDAO.alterarCliente(cliente);
	}

	/**
	 * 
	 * @param cliente
	 * @return
	 */
	public Cliente efetuarLogin(Cliente cliente) {
		// TODO Auto-generated method stub
		return this.clienteDAO.efetuarLogin(cliente);
	}

	/**
	 * metodo de listagem dos produtos
	 * 
	 * @return
	 */
	public List<Produto> listarProdutos() {
		return this.clienteDAO.listarProdutos();

	}

}
