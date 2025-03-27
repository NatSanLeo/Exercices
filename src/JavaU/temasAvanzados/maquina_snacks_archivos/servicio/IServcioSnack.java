package JavaU.temasAvanzados.maquina_snacks_archivos.servicio;

import JavaU.temasAvanzados.maquina_snacks_archivos.dominio.Snack;
import java.util.List;

public interface IServcioSnack {

  void agregarSnack(Snack snack);

  void mostrarSnacks();

  List<Snack> getSnacks();

}
