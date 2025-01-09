package graficas;

import modelo.WeatherData;

import javax.swing.*;
import java.util.ArrayList;

public interface Grafico {
    JPanel crearGrafico(ArrayList<WeatherData> datos);
}
