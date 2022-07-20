package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date dataNascimento;
	
	public Cliente() {
	}

	public Cliente(String nome, String email, Date dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAniversario() {
		return dataNascimento;
	}

	public void setAniversario(Date aniversario) {
		this.dataNascimento = aniversario;
	}
	
	@Override
	public String toString() {
		return getNome() + " (" 
				+ sdf.format(dataNascimento) + ") - " 
				+ getEmail();
	}
	
}
