import dao.BaseDatos;
import model.Paciente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.PacienteService;

public class PacienteTestService {

    @Test
    public void buscarUnPaciente(){
        BaseDatos.crearTablas();
        PacienteService pacienteService = new PacienteService();
        Integer buscar1 = 1;
        Paciente paciente = pacienteService.buscarPorID(buscar1);
        Assertions.assertTrue(paciente != null);
    }
}
