
public class Walec extends Punktm{  // rozszerzenie klasy Punktm. Nowa klasa "Walec" jest klas� pochodn�

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
				
				public void napis() { //przeci��ona metoda do tworzenia napisu
					System.out.println("Walec: ");
					}
				
				Walec (double masa,double wysokosc,double promien,double d){    // Konstruktor z parametrami, przyjmuj�cy cztery parametry 
					super(masa);   // wywo�ywanie konstruktora klasy nadrz�dnej (tej z kt�rej dziedziczymy) o podanym parametrze
					this.wysokosc=wysokosc;
					this.promien=promien;
					this.d=d;
				}
				
				Walec(){ // konstruktor domy�lny, do przypisania sta�ych warto�ci
					super.setmasa(20.5); //wywo�anie metody setmasa() z klasy nadrz�dnej (Punktm)
					this.promien=2.5;
					this.wysokosc=12.5;
					this.d=22.5;
				}

				public void dane(){  // metoda do wy�wietlania danych poszczeg�lnych p�l u�ywanych do oblicze�
					System.out.println("Masa walca to: "+super.getmasa()); // na koncu polecenia mamy wywo�anie metody getmasa() z klasy nadrz�dnej (Punktm)
					System.out.println("Wysoko�� walca to: "+wysokosc);
					System.out.println("Promie� walca to: "+promien);
					System.out.println("Odleg�o�� od nowej osi brotu dla walca to: "+d);
					
				}
				
				public void momentgl(){  //przeci��ona metoda do obliczania g��wnego momentu bezw�adno�ci
					System.out.println("G��wny moment bezw�adno�ci dla walca wynosi: "+super.getmasa()*promien*promien*0.5);
					
				}
				 void Stainer(){ //metoda do obliczania momentu bezw�adno�ci z tw. Steinera
					 System.out.println("Moment bezw�adno�ci z tw. Steinera dla walca wynosi: "+0.5*super.getmasa()*promien*promien+super.getmasa()*d*d);
					}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
