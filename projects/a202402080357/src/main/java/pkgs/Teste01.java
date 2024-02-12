package pkgs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Teste01 {

	private static String caminhoArquivo = "C:\\tmp\\202402100418\\savedFiles\\saopaulo.ser";

	public static void main(String[] args) {
		//writeObject();
		readObject();
	}

	public static void writeObject() {
		try {
			System.out.println("Teste01.writeObject()");
			int a1 = 1;
			Integer a2 = Integer.valueOf(2);
			String a3 = "a3";
			// Bean01 bean01 = new Bean01(a1, a2, a3);
			Bean01 bean01 = null;
			System.out.println("[bean01=" + (bean01) + "]");

			FileOutputStream fos = new FileOutputStream(caminhoArquivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bean01);
			oos.close();
			System.out.println("/Teste01.writeObject()");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readObject() {
		try {
			System.out.println("Teste01.readObject()");
			FileInputStream fis = new FileInputStream(caminhoArquivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Bean01 bean01 = (Bean01) ois.readObject();
			bean01.mTeste01();
			ois.close();
			System.out.println("[bean01=" + (bean01) + "]");
			System.out.println("/Teste01.readObject()");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
