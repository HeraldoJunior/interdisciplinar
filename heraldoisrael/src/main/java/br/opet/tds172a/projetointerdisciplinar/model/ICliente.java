package br.opet.tds172a.projetointerdisciplinar.model;

import br.opet.tds172a.projetointerdisciplinar.vo.Cliente;
/**
 * interface que contem os metodos padrões a serem utilizados 
 * @author heraldo
 *
 */
public interface ICliente {

	/**
	 * função que insere cliente
	 * @param cliente
	 * @return
	 */
	public abstract boolean inserirCliente(Cliente cliente);

	/**
	 * função que altera o cliente.
	 * @param cpfCliente
	 * @param cliente
	 * @return
	 */
	public abstract Cliente alterarCliente(Cliente cliente);

}
