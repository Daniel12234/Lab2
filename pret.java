
public class pret extends Punktm { // rozszerzenie klasy Punktm. Nowa klasa "pret" jest klas� pochodn�
	private double dlugosc;
	private double d;

		public double getdlugosc(){ // akcesor (inaczej getter)
		return dlugosc;
		}
		public double getd(){ // akcesor (inaczej getter)
		return d;
		}

		public void napis() { //przeci��ona metoda do tworzenia napisu
		System.out.println("Pr�t: ");
		}
	
		pret (double masa,double dlugosc,double d){  // Konstruktor z parametrami, przyjmuj�cy trzy parametry 
		super(masa); // wywo�ywanie konstruktora klasy nadrz�dnej (tej z kt�rej dziedziczymy) o podanym parametrze
		this.dlugosc=dlugosc;
		this.d=d;
		}
		
		pret(){ // konstruktor domy�lny, do przypisania sta�ych warto�ci
			super.setmasa(20.5);  //wywo�anie metody setmasa() z klasy nadrz�dnej (Punktm)
			this.dlugosc=2.5;
			this.d=22.5;
		}
		public void dane(){   // metoda do wy�wietlania danych poszczeg�lnych p�l u�ywanych do oblicze�
			System.out.println("Masa pr�ta to: "+super.getmasa());
			System.out.println("D�ugo�� pr�ta to: "+dlugosc);
			System.out.println("Odleg�o�� od nowej osi brotu dla pr�ta to: "+d);
		}
		public void momentgl(){  //przeci��ona metoda do obliczania g��wnego momentu bezw�adno�ci
		System.out.println("G��wny moment bezw�adno�ci dla pr�ta wynosi: "+super.getmasa()*dlugosc*dlugosc*1/12);
		}
	
		void Stainer(){ //metoda do obliczania momentu bezw�adno�ci z tw. Steinera
		System.out.println("Moment bezw�adno�ci z tw. Steinera dla pr�ta wynosi: "+(1/12)*super.getmasa()*dlugosc*dlugosc+super.getmasa()*d*d);
		}}
