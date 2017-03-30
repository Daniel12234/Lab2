
public class Walec extends Punktm{  // rozszerzenie klasy Punktm. Nowa klasa "Walec" jest klas¹ pochodn¹

	private double wysokosc;
	private double promien;
	private double d;
	
			public double getwysokosc(){  // akcesor (inaczej getter)
			return wysokosc;
			}
				public double getpromien(){  // akcesor (inaczej getter)
				return promien;
				}
				public double getd(){ //  akcesor (inaczej getter)
					return d;
					}
				
				public void napis() { //przeci¹¿ona metoda do tworzenia napisu
					System.out.println("Walec: ");
					}
				
				Walec (double masa,double wysokosc,double promien,double d){    // Konstruktor z parametrami, przyjmuj¹cy cztery parametry 
					super(masa);   // wywo³ywanie konstruktora klasy nadrzêdnej (tej z której dziedziczymy) o podanym parametrze
					this.wysokosc=wysokosc;
					this.promien=promien;
					this.d=d;
				}
				
				Walec(){ // konstruktor domyœlny, do przypisania sta³ych wartoœci
					super.setmasa(20.5); //wywo³anie metody setmasa() z klasy nadrzêdnej (Punktm)
					this.promien=2.5;
					this.wysokosc=12.5;
					this.d=22.5;
				}

				public void dane(){  // metoda do wyœwietlania danych poszczególnych pól u¿ywanych do obliczeñ
					System.out.println("Masa walca to: "+super.getmasa()); // na koncu polecenia mamy wywo³anie metody getmasa() z klasy nadrzêdnej (Punktm)
					System.out.println("Wysokoœæ walca to: "+wysokosc);
					System.out.println("Promieñ walca to: "+promien);
					System.out.println("Odleg³oœæ od nowej osi brotu dla walca to: "+d);
					
				}
				
				public void momentgl(){  //przeci¹¿ona metoda do obliczania g³ównego momentu bezw³adnoœci
					System.out.println("G³ówny moment bezw³adnoœci dla walca wynosi: "+super.getmasa()*promien*promien*0.5);
					
				}
				 void Stainer(){ //metoda do obliczania momentu bezw³adnoœci z tw. Steinera
					 System.out.println("Moment bezw³adnoœci z tw. Steinera dla walca wynosi: "+0.5*super.getmasa()*promien*promien+super.getmasa()*d*d);
					}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
