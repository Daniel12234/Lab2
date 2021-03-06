
public class Walec extends Punktm{  // rozszerzenie klasy Punktm. Nowa klasa "Walec" jest klasą pochodną

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
				
				public void napis() { //przeciążona metoda do tworzenia napisu
					System.out.println("Walec: ");
					}
				
				Walec (double masa,double wysokosc,double promien,double d){    // Konstruktor z parametrami, przyjmujący cztery parametry 
					super(masa);   // wywoływanie konstruktora klasy nadrzędnej (tej z której dziedziczymy) o podanym parametrze
					this.wysokosc=wysokosc;
					this.promien=promien;
					this.d=d;
				}
				
				Walec(){ // konstruktor domyślny, do przypisania stałych wartości
					super.setmasa(20.5); //wywołanie metody setmasa() z klasy nadrzędnej (Punktm)
					this.promien=2.5;
					this.wysokosc=12.5;
					this.d=22.5;
				}

				public void dane(){  // metoda do wyświetlania danych poszczególnych pól używanych do obliczeń
					System.out.println("Masa walca to: "+super.getmasa()); // na koncu polecenia mamy wywołanie metody getmasa() z klasy nadrzędnej (Punktm)
					System.out.println("Wysokość walca to: "+wysokosc);
					System.out.println("Promień walca to: "+promien);
					System.out.println("Odległość od nowej osi brotu dla walca to: "+d);
					
				}
				
				public void momentgl(){  //przeciążona metoda do obliczania głównego momentu bezwładności
					System.out.println("Główny moment bezwładności dla walca wynosi: "+super.getmasa()*promien*promien*0.5);
					
				}
				 void Stainer(){ //metoda do obliczania momentu bezwładności z tw. Steinera
					 System.out.println("Moment bezwładności z tw. Steinera dla walca wynosi: "+0.5*super.getmasa()*promien*promien+super.getmasa()*d*d);
					}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
