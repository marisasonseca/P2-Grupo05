package mp.exceptions.crearEntrada;

import mp.exceptions.Result;
import mp.subforos.entradas.EntradaGenerica;
import mp.subforos.SubForo;

public class EntradaCreada extends Result {
    public EntradaCreada(EntradaGenerica entrada, SubForo subForo) {
        super("Entrada con titulo " + entrada.getTitulo() + ", y con id  " + entrada.getId() + " creada correctamente para el SUBFORO " + subForo.getId() + " -> " + subForo.getNombre() + ". CREACIÓN ENTRADA CORRECTA");
    }
}
