package Gravacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProdutoPersiste extends Produto{
	
	
	public String gravar() {
		String caminho = "C:\\Users\\Administrador\\Desktop\\Produtos\\";
		String ret = "Produto armazenado com sucesso!";
		try {
			FileOutputStream file = new FileOutputStream(caminho+"produto"+this.getCodigo());
			ObjectOutputStream stream = new ObjectOutputStream(file);
			stream.writeObject(this);
			stream.flush();
		}catch (Exception erro) {
			ret = "Falha de gravacao\n "+erro.toString();
		}
		return ret;
	}
	
	public static Produto ler(int codigo) {
		String caminho = "C:\\Users\\Administrador\\Desktop\\Produtos\\";
		try {
			FileInputStream file = new FileInputStream(caminho+"produto"+ codigo);
			ObjectInputStream stream = new ObjectInputStream(file);
			return (Produto) stream.readObject();
		}catch (Exception erro) {
			System.out.println("Falha na leitura \n "+ erro.toString());
			return null;
		}
	}

}
