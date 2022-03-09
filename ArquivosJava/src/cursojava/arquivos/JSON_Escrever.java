package cursojava.arquivos;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JSON_Escrever {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("463.354.353-30");
		usuario1.setLogin("vitorosouza");
		usuario1.setSenha("123456");
		usuario1.setNome("Vitor Souza");
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("233.343.343-05");
		usuario2.setLogin("jeanneoli");
		usuario2.setSenha("654321");
		usuario2.setNome("Jeanne Matni");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter ("C:\\workspace\\java-projects\\ArquivosJava\\src\\cursojava\\arquivos\\filejson.json");
		
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		//*****************LENDO O ARQUIVO JSON*********************
	
		FileReader fileReader = new FileReader("C:\\workspace\\java-projects\\ArquivosJava\\src\\cursojava\\arquivos\\filejson.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		
		//For usado para varrer o JsonArray. Pra cada "chave" é um JsonElement 
		for (JsonElement jsonElement : jsonArray) { 
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listUsuarios.add(usuario);
		}
		
		System.out.println("Leitura do JSON: " + listUsuarios);
		
	}
	
}
