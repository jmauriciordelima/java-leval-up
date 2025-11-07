package fundamentos_java.serializable;

import java.io.*;

public class Main {

    private static final String NOME_ARQUIVO = "cliente.bytes";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente("Marcos Augusto", "12345698700", "marcosaugusto@gmail.com");

        String informacaoCliente = cliente.toString();

        System.out.println(informacaoCliente);

        serializacaoCliente(cliente);

        deserializarCliente();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOME_ARQUIVO));
        Cliente.deserializar(ois);


    }

    static void serializacaoCliente(Object cliente) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bytes"))){
            oos.writeObject(cliente);
            System.out.println("Objeto Cliete Serializado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deserializarCliente() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOME_ARQUIVO));
        Cliente cliente = (Cliente) ois.readObject();
        System.out.println("Deserializando Cliente: " + cliente);
    }
}

/**
 * Serializable - é uma interface de marcação
 */
