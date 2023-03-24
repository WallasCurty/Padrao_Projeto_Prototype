import org.example.Paciente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Paciente paciente = new Paciente(123456, "Fernando", "Porto Alegre");

        Paciente pacienteClone = paciente.clone();
        pacienteClone.setCPF(654321);
        pacienteClone.setNome("Fernando o clone");
        pacienteClone.setLocalNascimento("Porto das Galinhas");

        assertEquals("Pacientecpf=123456, nome='Fernando', numero=1}, localNascimento='Porto Alegre'}", paciente.toString());
        assertEquals("Paciente{cpf=654321, nome='Fernando o clone', numero=2}, localNascimento='Porto das Galinhas'}", pacienteClone.toString());
    }

}
