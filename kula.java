
public class kula extends Punktm{  // rozszerzenie klasy Punktm. Nowa klasa "kula" jest klas¹ pochodn¹
	private double promien;
	private double d;
	
	public double getpromien(){ // akcesor (inaczej getter)
		return promien;
		}
	
	public double getd(){ // akcesor (inaczej getter)
		return d;
		}
	
	public void napis() { //przeci¹¿ona metoda do tworzenia napisu
		System.out.println("Kula: ");
		}
	
	kula (double masa,double promien,double d){ // Konstruktor z parametrami, przyjmuj¹cy trzy parametry 
		super(masa);  // wywo³ywanie konstruktora klasy nadrzêdnej (tej z której dziedziczymy) o podanym parametrze
		this.promien=promien;
		this.d=d;
		}
	
	kula(){  // konstruktor domyœlny, do przypisania sta³ych wartoœci
		super.setmasa(20.5);  //wywo³anie metody setmasa() z klasy nadrzêdnej (Punktm)
		this.promien=2.5;
		this.d=22.5;
	}
	
	public void dane(){  // metoda do wyœwietlania danych poszczególnych pól u¿ywanych do obliczeñ
		System.out.println("Masa kuli to: "+super.getmasa());
		System.out.println("Promieñ kuli to: "+promien);
		System.out.println("Odleg³oœæ od nowej osi brotu dla kuli to: "+d);
	}
	
	public void momentgl(){  //przeci¹¿ona metoda do obliczania g³ównego momentu bezw³adnoœci
		System.out.println("G³ówny moment bezw³adnoœci dla kuli wynosi: "+super.getmasa()*promien*promien*2/5);
		
	}
	void Stainer(){  //metoda do obliczania momentu bezw³adnoœci z tw. Steinera
		System.out.println("Moment bezw³adnoœci z tw. Steinera dla walca wynosi: "+(2/5)*super.getmasa()*promien*promien+super.getmasa()*d*d);
		}
}
