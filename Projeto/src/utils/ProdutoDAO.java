package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Product;

public class ProdutoDAO {

	public static void salvar(Product prod) {
		Connection con = Conect.getConexao();
		String sql = "insert into tb_produto(descricao, price, stock)values(?, ?, ?);";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, prod.getDescription());
			stm.setDouble(2, prod.getPrice());
			stm.setInt(3, prod.getStock());
			stm.execute();
			System.out.println();
			System.out.println("Produto Adicionado.");
			System.out.println();

		} catch (SQLException error) {
			error.printStackTrace();
		} finally {
			Conect.fecharConexao();
		}
	}

	public static void consultar() {
		Connection con = Conect.getConexao();
		String sql = "select * from tb_produto;";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				System.out.println("Posição: [" + rs.getInt("id") + "]");
				System.out.println("Descrição: " + rs.getString("descricao"));
				System.out.println("Valor: R$ " + rs.getDouble("price"));
				System.out.println("Estoque: " + rs.getInt("stock"));
				System.out.println();
			}
		} catch (SQLException error) {
			error.printStackTrace();
		} finally {
			Conect.fecharConexao();
		}
	}

	public static void alterar(int index, Product prod) {
		Connection con = Conect.getConexao();
		String sql = "update tb_produto set descricao = ?, price = ?, stock = ? where id = ?;";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, prod.getDescription());
			stm.setDouble(2, prod.getPrice());
			stm.setInt(3, prod.getStock());
			stm.setInt(4, index);
			stm.execute();
			System.out.println();
			System.out.println("Produto Alterado.");
			System.out.println();

		} catch (SQLException error) {
			error.printStackTrace();
		} finally {
			Conect.fecharConexao();
		}
	}

	public static void remover(int position) {
		Connection con = Conect.getConexao();
		String sql = "delete from tb_produto where id = ?;";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, position);
			stm.execute();
			System.out.println();
			System.out.println("Produto Excluído.");
			System.out.println();

		} catch (SQLException error) {
			error.printStackTrace();
		} finally {
			Conect.fecharConexao();
		}
	}

	public static void selecionar(int position) {
		Connection con = Conect.getConexao();
		String sql = "select * from tb_produto where id = ?";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, position);
			stm.execute();
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				System.out.println("Posição: [" + rs.getInt("id") + "]");
				System.out.println("Descrição: " + rs.getString("descricao"));
				System.out.println("Valor: R$ " + rs.getDouble("price"));
				System.out.println("Estoque: " + rs.getInt("stock"));
				System.out.println();
			}

		} catch (SQLException error) {
			error.printStackTrace();
		} finally {
			Conect.fecharConexao();
		}
	}
}
