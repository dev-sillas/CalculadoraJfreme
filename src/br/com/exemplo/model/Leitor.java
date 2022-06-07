package br.com.exemplo.model;

public class Leitor {
//atributos
	private String nomeLeitor;
	private int codLeitor;
	private String tipoLeitor;
	
	public Leitor(){
	}
	
	public Leitor(String nomeLeitor, int codLeitor, String tipoLeitor) {
		super();
		this.nomeLeitor = nomeLeitor;
		this.codLeitor = codLeitor;
		this.tipoLeitor = tipoLeitor;
	}

	

	public String getNomeLeitor() {
		return nomeLeitor;
	}

	public void setNomeLeitor(String nomeLeitor) {
		this.nomeLeitor = nomeLeitor;
	}

	public int getCodLeitor() {
		return codLeitor;
	}

	public void setCodLeitor(int codLeitor) {
		this.codLeitor = codLeitor;
	}

	public String getTipoLeitor() {
		return tipoLeitor;
	}

	public void setTipoLeitor(String tipoLeitor) {
		this.tipoLeitor = tipoLeitor;
	}
	
}
