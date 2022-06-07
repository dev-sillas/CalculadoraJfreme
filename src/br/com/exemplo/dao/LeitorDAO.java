package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.Leitor;
import br.com.exemplo.ultil.ConnectionFactory;

public class LeitorDAO {
 //CRUD
	private Leitor leitor;
	private Connection conn; // conecta com o banco de dados
	private PreparedStatement ps;//permite executar querys
	private ResultSet rs;//tabela
	 
	 public LeitorDAO() throws Exception{
		 try {
			 conn = ConnectionFactory.getConnection();
		 }
	 catch(Exception e) {
		 throw new Exception("Erro"+ e.getMessage());
	 }
}
	 public void salvar(Leitor leitor) throws Exception{
		 try {
			String sql= "INSERT INTO tbLeitor(codLeitor, nomeLeitor,tipoLeitor)"
					+"values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1,leitor.getCodLeitor());
			ps.setString(2,leitor.getNomeLeitor());
			ps.setString(3,leitor.getTipoLeitor());
			ps.executeUpdate();
			}
	 catch(Exception e) {
		 throw new Exception("Erro ao salvar"+ e.getMessage());
   }
  }
	 public List listarTodos()throws Exception{
		List<Leitor>lista= new ArrayList<Leitor>();
		try {
		ps = conn.prepareStatement("SELECT*FROM tbLeitor");
		rs = ps.executeQuery();
		while(rs.next()) {
			int codLeitor =rs.getInt("codLeitor");
			String nomeLeitor=rs.getString("nomeLeitor");
			String tipoLeitor=rs.getString("tipoLeitor");
			leitor=new Leitor (nomeLeitor, codLeitor, tipoLeitor);
			lista.add(leitor);
		}
		return lista;
			
	 } catch(Exception e) {
		 throw new Exception("Erro ao listar"+ e.getMessage());
	 	}
	 }
	 public void alterar(Leitor leitor) throws Exception{
		 try {
			String sql= "UPDATE tbLeitor set nomeLeitor=?,tipoLeitor=?, codLeitor=?"
					+"WHERE codLeitor=?";
			ps = conn.prepareStatement(sql);
		
			ps.setString(1,leitor.getNomeLeitor());
			ps.setString(2,leitor.getTipoLeitor());
			ps.setInt(3,leitor.getCodLeitor());
			ps.executeUpdate();
			}
	 catch(Exception e) {
		 throw new Exception("Erro ao alterar"+ e.getMessage());
   }
  }
	 public void excluir(int codLeitor) throws Exception{
		 try {
			String sql= "DELETE DROM tbLeitor"
					+"WHERE codLeitor=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1,codLeitor);
			ps.executeUpdate();
			}
	 catch(Exception e) {
		 throw new Exception("Erro ao excluir"+ e.getMessage());
   }
  }
	 
	 public Leitor consultar(int codLeitor)throws Exception{
			try {
			ps = conn.prepareStatement("SELECT*FROM tbLeitor WHERE codLeitor=?");
			ps.setInt(1,codLeitor);
			ps.executeUpdate();
			rs = ps.executeQuery();
			if(rs.next()) {
				String nomeLeitor=rs.getString("nomeLeitor");
				String tipoLeitor=rs.getString("tipoLeitor");
				leitor=new Leitor (nomeLeitor, codLeitor, tipoLeitor);
			}
			return leitor;
				
		 } catch(Exception e) {
			 throw new Exception("Erro ao listar"+ e.getMessage());
		 	}
		 } 
	
	 
 }
