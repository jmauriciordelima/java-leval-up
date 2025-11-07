package fundamentos_java.serializable.v2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;

public class Cliente implements Serializable {

    private static final ObjectStreamField[] serialPersistentFields = {
            new ObjectStreamField("nome", String.class),
            new ObjectStreamField("cpf", String.class),
            new ObjectStreamField("email", String.class)
    };

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        var fields = stream.readFields();
        var nome = (String) fields.get("nome", null);
        var cpf = (String) fields.get("cpf", null);
        var email = (String) fields.get("email", null);
        System.out.println("Nome: " + nome + " - CPF: " + cpf + " - Email: " + email);

    }

//    public static void deserializar(ObjectInputStream stream) throws IOException, ClassNotFoundException {
//        serializable.Cliente cliente = (serializable.Cliente) stream.readObject();
//        System.out.println(cliente);
//
//    }

}
