package PraticasAula.exerciciosVetor;

public class exercicioVetor07
{
	public static void main(String[] args) {
		double[] temp = new double[48];
		double horas, media=0;
		int i;
		
		for(i=0; i<48;i++){
		    horas = i+1;
		    temp[i]=19.06 + 0.211*Math.cos(0.08721*horas)+(-5.51*Math.sin(0.08721 * horas));
		    media=media+temp[i];
		}
		media = media/i;
		System.out.printf("Média gual á: %.1f\n",media);
		
		/*for(i=0; i<48;i++){
		    if(temp[i]>media){
		        System.out.println("Horas maiores que a media: "+temp[i]);
		    }
		    if(temp[i] < media){
		        System.out.println("Horas menores que a media: "+temp[i]);
		    }
		}*/
		System.out.println("Temperaturas maiores que a media: ");
		for(i=0; i<48;i++){
		    if(temp[i]>media){
		        System.out.printf("%.1f\n",temp[i]);
		    }
		}
		
		System.out.println("\nTemperaturas menores que a media: ");
		for(i=0; i<48;i++){
		    if(temp[i] < media){
		        System.out.printf("%.1f\n",temp[i]);
		    }
		}
	}
}
