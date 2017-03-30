
public class pret extends Punktm { // rozszerzenie klasy Punktm. Nowa klasa "pret" jest klas¹ pochodn¹
	private double dlugosc;
	private double d;

		public double getdlugosc(){ // akcesor (inaczej getter)
		return dlugosc;
		}
		public double getd(){ // akcesor (inaczej getter)
		return d;
		}

		public void napis() { //przeci¹¿ona metoda do tworzenia napisu
		System.out.println("Prêt: ");
		}
	
		pret (double masa,double dlugosc,double d){  // Konstruktor z parametrami, przyjmuj¹cy trzy parametry 
		super(masa); // wywo³ywanie konstruktora klasy nadrzêdnej (tej z której dziedziczymy) o podanym parametrze
		this.dlugosc=dlugosc;
		this.d=d;
		}
		
		pret(){ // konstruktor domyœlny, do przypisania sta³ych wartoœci
			super.setmasa(20.5);  //wywo³anie metody setmasa() z klasy nadrzêdnej (Punktm)
			this.dlugosc=2.5;
			this.d=22.5;
		}
		public void dane(){   // metoda do wyœwietlania danych poszczególnych pól u¿ywanych do obliczeñ
			System.out.println("Masa prêta to: "+super.getmasa());
			System.out.println("D³ugoœæ prêta to: "+dlugosc);
			System.out.println("Odleg³oœæ od nowej osi brotu dla prêta to: "+d);
		}
		public void momentgl(){  //przeci¹¿ona metoda do obliczania g³ównego momentu bezw³adnoœci
		System.out.println("G³ówny moment bezw³adnoœci dla prêta wynosi: "+super.getmasa()*dlugosc*dlugosc*1/12);
		}
	
		void Stainer(){ //metoda do obliczania momentu bezw³adnoœci z tw. Steinera
		System.out.println("Moment bezw³adnoœci z tw. Steinera dla prêta wynosi: "+(1/12)*super.getmasa()*dlugosc*dlugosc+super.getmasa()*d*d);
		}}
