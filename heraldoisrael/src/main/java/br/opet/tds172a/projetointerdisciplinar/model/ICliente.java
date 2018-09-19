package br.opet.tds172a.projetointerdisciplinar.model;

import br.opet.tds172a.projetointerdisciplinar.vo.Cliente;
/**
 * interface que contem os metodos padr�es a serem utilizados 
 * @author heraldo
 *
 */
public interface ICliente {

	/**
	 * fun��o que insere cliente
	 * @param cliente
	 * @return
	 */
	public abstract boolean inserirCliente(Cliente cliente);

	/**
	 * fun��o que altera o cliente.
	 * @param cpfCliente
	 * @param cliente
	 * @return
	 */
	public abstract Cliente alterarCliente(Cliente cliente);

}
