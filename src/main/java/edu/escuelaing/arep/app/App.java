package edu.escuelaing.arep.app;
import java.util.List;


public class App 
{
    public static double media( List<Double> listaMedia ){
    	double cont=0.0;
        for(double i: listaMedia) {
        	cont+=i;
        }
        return cont/listaMedia.size();
    }
	public static double desviacion( List<Double> listaDesviacion ){
		double cont = 0.0;
		double promedio= media(listaDesviacion);
		for(double i: listaDesviacion) {
        	cont+=Math.pow((i*promedio),2);
        }
		return Math.sqrt(cont/(listaDesviacion.size()-1));
	}
}
