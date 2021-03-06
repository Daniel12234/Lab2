
public class kula extends Punktm{  // rozszerzenie klasy Punktm. Nowa klasa "kula" jest klasą pochodną
	private double promien;
	private double d;
	
	public double getpromien(){ // akcesor (inaczej getter)
		return promien;
		}
	
	public double getd(){ // akcesor (inaczej getter)
		return d;
		}
	
	public void napis() { //przeciążona metoda do tworzenia napisu
		System.out.println("Kula: ");
		}
	
	kula (double masa,double promien,double d){ // Konstruktor z parametrami, przyjmujący trzy parametry 
		super(masa);  // wywoływanie konstruktora klasy nadrzędnej (tej z której dziedziczymy) o podanym parametrze
		this.promien=promien;
		this.d=d;
		}
	
	kula(){  // konstruktor domyślny, do przypisania stałych wartości
		super.setmasa(20.5);  //wywołanie metody setmasa() z klasy nadrzędnej (Punktm)
		this.promien=2.5;
		this.d=22.5;
	}
	
	public void dane(){  // metoda do wyświetlania danych poszczególnych pól używanych do obliczeń
		System.out.println("Masa kuli to: "+super.getmasa());
		System.out.println("Promień kuli to: "+promien);
		System.out.println("Odległość od nowej osi brotu dla kuli to: "+d);
	}
	
	public void momentgl(){  //przeciążona metoda do obliczania głównego momentu bezwładności
		System.out.println("Główny moment bezwładności dla kuli wynosi: "+super.getmasa()*promien*promien*2/5);
		
	}
	void Stainer(){  //metoda do obliczania momentu bezwładności z tw. Steinera
		System.out.println("Moment bezwładności z tw. Steinera dla walca wynosi: "+(2/5)*super.getmasa()*promien*promien+super.getmasa()*d*d);
		}
}
