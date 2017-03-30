
public class kula extends Punktm{  // rozszerzenie klasy Punktm. Nowa klasa "kula" jest klas� pochodn�
	private double promien;
	private double d;
	
	public double getpromien(){ // akcesor (inaczej getter)
		return promien;
		}
	
	public double getd(){ // akcesor (inaczej getter)
		return d;
		}
	
	public void napis() { //przeci��ona metoda do tworzenia napisu
		System.out.println("Kula: ");
		}
	
	kula (double masa,double promien,double d){ // Konstruktor z parametrami, przyjmuj�cy trzy parametry 
		super(masa);  // wywo�ywanie konstruktora klasy nadrz�dnej (tej z kt�rej dziedziczymy) o podanym parametrze
		this.promien=promien;
		this.d=d;
		}
	
	kula(){  // konstruktor domy�lny, do przypisania sta�ych warto�ci
		super.setmasa(20.5);  //wywo�anie metody setmasa() z klasy nadrz�dnej (Punktm)
		this.promien=2.5;
		this.d=22.5;
	}
	
	public void dane(){  // metoda do wy�wietlania danych poszczeg�lnych p�l u�ywanych do oblicze�
		System.out.println("Masa kuli to: "+super.getmasa());
		System.out.println("Promie� kuli to: "+promien);
		System.out.println("Odleg�o�� od nowej osi brotu dla kuli to: "+d);
	}
	
	public void momentgl(){  //przeci��ona metoda do obliczania g��wnego momentu bezw�adno�ci
		System.out.println("G��wny moment bezw�adno�ci dla kuli wynosi: "+super.getmasa()*promien*promien*2/5);
		
	}
	void Stainer(){  //metoda do obliczania momentu bezw�adno�ci z tw. Steinera
		System.out.println("Moment bezw�adno�ci z tw. Steinera dla walca wynosi: "+(2/5)*super.getmasa()*promien*promien+super.getmasa()*d*d);
		}
}
