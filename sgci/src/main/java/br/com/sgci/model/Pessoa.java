/*package br.com.sgci.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

public class Pessoa {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "ID_ENDERECO")
		private Long id;  


		@Size(max = 8)
		@Column(name = "CEP")
		private String cep;

	
		@Size(max = 255)
		@Column(name = "ESTADO")
		private String estado;

		
		@Size(max = 255)
		@Column(name = "CIDADE")
		private String cidade;

		
		@Size(max = 255)
		@Column(name = "RUA")
		private String rua;

		
		@Size(max = 255)
		@Column(name = "BAIRRO")
		private String bairro;


		@Column(name = "NUMERO")
		private Integer numero;


}
*/


package br.com.sgci.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "PESSOA")

public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PESSOA")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "ID_ENDERECO", referencedColumnName = "ID_ENDERECO")
    private Endereco endereco;
    
    @Size(max = 255)
    @Column(name = "NOME")
    private String nome;
    
    @Size(max = 255)
    @Column(name = "EN_TIPO")
    private String tipo;
    
    @Size(max = 255)
    @Column(name = "DOCUMENTO", unique = true)
    private String documento;
    
    @Size(max = 255)
    @Column(name = "TX_PROFISSAO")
    private String profissao;
    
    @Size(max = 255)
    @Column(name = "EN_ESTADO_CIVIL")
    private String estadoCivil;

    // Construtores
    public Pessoa() {
    }
    
    public Pessoa(
            Endereco endereco,
            @Size(max = 255) String nome,
            @Size(max = 255) String tipo,
            @Size(max = 255) String documento,
            @Size(max = 255) String profissao,
            @Size(max = 255) String estadoCivil) {
        this.endereco = endereco;
        this.nome = nome;
        this.tipo = tipo;
        this.documento = documento;
        this.profissao = profissao;
        this.estadoCivil = estadoCivil;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }
    
    

    public void setId(Long id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}