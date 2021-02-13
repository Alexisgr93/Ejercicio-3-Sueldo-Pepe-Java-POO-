//esta clase BonoPorPresentismo Implementa IBono
//cuando sale el error apretar add unimplemented methods
public class BonoPorPresentismo implements IBono {

	@Override
	public double MontoBono(int faltas) {
		// generar el codigo if
		
		if(faltas == 0) {
			
			return 100;
			
		}
		
		if(faltas == 1) {
			
			return 50;
			
		}
		
		return 0;
	}

}
