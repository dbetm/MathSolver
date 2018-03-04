package complejos;

import java.awt.Color;
import org.jfree.chart.axis.NumberAxis;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.VectorRenderer;
import org.jfree.data.xy.VectorSeries;
import org.jfree.data.xy.VectorSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Onder francisco
 */

public class GraficarC {
    JFreeChart grafica;
    VectorSeriesCollection datos = new VectorSeriesCollection();
    XYSeriesCollection Ejes=new XYSeriesCollection();
    VectorRenderer r = new VectorRenderer();
    XYPlot xyplot;
    
    public GraficarC() {
        xyplot = new XYPlot(datos,new NumberAxis("x"),new NumberAxis("y"),r);
        xyplot.setDomainGridlinesVisible(true);
        xyplot.setRangeGridlinesVisible(true);
        grafica=new JFreeChart(xyplot);
    }
  
    public void agregarGrafica(String id, double x, double y) {
        VectorSeries serie = new VectorSeries(id);
        serie.add(0, 0, x, y);
        datos.addSeries(serie);
    }
  
    public void BorrarGrafica() {

    }

    public JPanel obtenerGrafica() {
        return new ChartPanel(grafica);
    }
}
