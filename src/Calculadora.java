import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="calculadora")
@SessionScoped
public class Calculadora {
	
	public String numero;
	public double resposta;
	public String nome = "Artur";
	
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getResposta() {
		return resposta;
	}

	public void setResposta(double resposta) {
		this.resposta = resposta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void conta(){
		double a = Double.parseDouble(numero);
		resposta = a * a;
	}
}
