import java.lang.String;


public class FECHA {

	public void Fecha(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
		
	}
	
	public void suma(int numDias) {
		
		this.day += numDias;
		int resto = this.day - monthsDay[this.month - 1];
		
		while(resto > 0) {
			this.day -=  monthsDay[this.month - 1];
			if(this.month < 12) {
				this.month++;
			}
			else {
				this.month = 1;
				this.year++;
			}
			
			resto = this.day - monthsDay[this.month - 1];
		}
		
		
	}
	
	public void escribe () {
		System.out.println(toString());
	}
	
	public String toString() {
		return String.format("%d/%d/%d",this.day,this.month,this.year);
	}
	
	public int recuentoDias() {
		
		int numDias = 0;
		int i = 0;
		
		while(i <= this.month - 1) {
			if(i == this.month - 1) {
				numDias += this.day;
			}
			else {
				numDias += monthsDay[i];
			}
			i++;
		}
		
		return numDias;
	}
	
	public int diferencia(FECHA fecha) {
		int restoDias;
		restoDias = Math.abs((this.year - fecha.getYear())*365);
		int i = 0;
		int j = 0;
		
		restoDias = restoDias + Math.abs(recuentoDias() - fecha.recuentoDias());
		
		return restoDias;
	}
	
	public int getYear() {
		
		return this.year;
	}
	
	
	
	private int [] monthsDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int day;
	private int month;
	private int year;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
