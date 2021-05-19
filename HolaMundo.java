package ejercicio;

public class HolaMundo {
	private int[] sueldos;
	 public void cargar()
	    {
	       
	        sueldos=new int[5];
	        for(int f=0;f<5;f++) {
	          
	            sueldos[f]=f;
	        }	
	    }
		
	    public void imprimir() {
	        for(int f=0;f<5;f++) {
	            System.out.println(sueldos[f]);
	        }
	    }
	

	public static void main(String[] args) {
		HolaMundo pv=new HolaMundo();
        pv.cargar();
        pv.imprimir();
		
		
	}
	
		

}
