
public class Empleado {
	
	private Categoria categoria;
	private IBono Bono;
	private int faltas;
	
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	public IBono getBono() {
		return Bono;
	}
	public void setBono(IBono bono) {
		Bono = bono;
	}
	
	
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	
	public double CalcularSueldo() {
		
		return this.categoria.getNeto() + this.Bono.MontoBono(this.faltas);
		
	}

}
