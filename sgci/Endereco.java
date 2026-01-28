package br.com.sgci.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

// @Entity - Indica que esta classe é uma entidade JPA, ou seja, 
// será mapeada para uma tabela no banco de dados
@Entity
// @Table - Especifica o nome da tabela no banco de dados (ENDERECO)
@Table(name = "ENDERECO")
public class Endereco {	
	
	// CONSTRUTOR
	// Construtor personalizado que recebe os atributos principais
	// @Size - Validação que limita o tamanho máximo dos campos String
	public Endereco(
			@Size(max = 8) String cep,          // CEP com no máximo 8 caracteres
			@Size(max = 255) String estado,     // Estado com no máximo 255 caracteres
			@Size(max = 255) String cidade,     // Cidade com no máximo 255 caracteres
			@Size(max = 255) String rua,        // Rua com no máximo 255 caracteres
			@Size(max = 255) String bairro,     // Bairro com no máximo 255 caracteres
			Integer numero) {                   // Número (pode ser null)
		super();
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}
	// FIM DO CONSTRUTOR
	
	// @Id - Indica que este campo é a chave primária da tabela
	// @GeneratedValue - Define a estratégia de geração automática do ID
	// GenerationType.IDENTITY - O banco de dados gera o ID automaticamente (auto_increment)
	// @Column - Mapeia o campo para a coluna "ID_ENDERECO" no banco
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ENDERECO")
	private Long id;  // Identificador único do endereço

	// CEP - Código de Endereçamento Postal
	// @Size(max = 8) - Validação: máximo de 8 caracteres (ex: "12345-678")
	// @Column(name = "CEP") - Mapeia para coluna "CEP" no banco
	@Size(max = 8)
	@Column(name = "CEP")
	private String cep;

	// Estado (UF) - Ex: "SP", "MG", "RJ"
	@Size(max = 255)
	@Column(name = "ESTADO")
	private String estado;

	// Cidade - Ex: "São Paulo", "Rio de Janeiro"
	@Size(max = 255)
	@Column(name = "CIDADE")
	private String cidade;

	// Rua/Logradouro - Nome da rua, avenida, etc.
	@Size(max = 255)
	@Column(name = "RUA")
	private String rua;

	// Bairro - Região/distrito da cidade
	@Size(max = 255)
	@Column(name = "BAIRRO")
	private String bairro;

	// Número - Número do endereço (pode ser nulo para endereços sem número)
	// Não tem @Size porque é Integer, mas poderia ter @Min/@Max para validação numérica
	@Column(name = "NUMERO")
	private Integer numero;

	// MÉTODOS GETTERS E SETTERS
	// Getters - Métodos para acessar/ler os valores dos atributos
	// Setters - Métodos para modificar/atribuir valores aos atributos
	
	// Getter para ID (somente leitura geralmente, pois é gerado automaticamente)
	public Long getId() {
		return id;
	}

	// Setter para ID (cuidado ao usar, pode causar inconsistências)
	public void setId(Long id) {
		this.id = id;
	}

	// Getter e Setter para CEP
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	// Getter e Setter para Estado
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	// Getter e Setter para Cidade
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	// Getter e Setter para Rua
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	// Getter e Setter para Bairro
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	// Getter e Setter para Número
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}