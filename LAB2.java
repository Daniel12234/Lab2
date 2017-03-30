
public class LAB2 {
public static void main(String args[]){
		
		Walec obiekt1=new Walec(); // utworzenie obiektu punkt
		Walec obiekt2=new Walec(1,2,3,4); // utworzenie obiektu punkt2
		//nastêpne cztery linie kodu s¹ analogiczne do powy¿szych
		kula obiekt3=new kula(); 
		kula obiekt4=new kula(5,6,7);
		
		pret obiekt5=new pret();
		pret obiekt6=new pret(8,9,10);
		
		//Wywo³ywanie metod dla walca:
		obiekt1.napis();  //wywo³anie metody gdzie znajduje siê napis dla obiektu obiekt1
		System.out.println(); //Komenda u¿yta tylko w celu zwiêkszenia przejrzystoœci wykonanego programu
		obiekt1.dane(); //wywo³anie metody do wypisania odpowiednich danych do obliczeñ (dla konstruktora domyœlnego)
		obiekt1.momentgl();  // wywo³anie metody do wyœwietlenia wartoœæi g³ownego momentu bezw³adnoœci
		obiekt1.Stainer();  // wywo³anie metody do wyœwietlenia wartoœæi momentu bezw³adnoœci z tw. Steinera oraz wypisanie go
		System.out.println();
		obiekt2.dane(); //wywo³anie metody do wypisania odpowiednich danych do obliczeñ (dla konstruktora z parametrami)
		obiekt2.momentgl();  // wywo³anie metody do wyœwietlenia wartoœæi g³ownego momentu bezw³adnoœci
		obiekt2.Stainer();   // wywo³anie metody do wyœwietlenia wartoœæi momentu bezw³adnoœci z tw. Steinera oraz wypisanie go
		System.out.println();
		System.out.println();

		//Wywo³ywanie metod dla kuli odbywa siê w sposób analogiczny jak dla walca
		obiekt3.napis();
		System.out.println();
		obiekt3.dane();
		obiekt3.momentgl();
		obiekt3.Stainer();
		System.out.println();
		obiekt4.dane();
		obiekt4.momentgl();
		obiekt4.Stainer();
		System.out.println();
		System.out.println();
		
		//Wywo³ywanie metod dla prêta odbywa siê w sposób analogiczny jak dla walca
		obiekt5.napis();
		System.out.println();
		obiekt5.dane();
		obiekt5.momentgl();
		obiekt5.Stainer();
		System.out.println();
		obiekt6.dane();
		obiekt6.momentgl();
		obiekt6.Stainer();
		System.out.println();
		System.out.println();
		
	//Tablice obiektów klas pochodnych dla walca:
		
		Walec tablica[][][][] = new Walec[5][5][5][5]; //utworzenie tablicy mog¹cej przechowywaæ 10 obiektów klasy Walec

		for(int i=0;i<tablica.length;i++){  //pêtla która przypisuje odpowiednim miejscom tablicy, nowo utworzone obiekty typu Walec
			tablica[i][i][i][i]=new Walec(i,i,i,5.5);
		}
		
		for(int i=0;i<tablica.length;i++){ //pêtla przechodz¹ca przez wszystkie elementy wyzej utworzonej tablicy
			tablica[i][i][i][i].napis(); //wywo³anie metody gdzie znajduje siê napis
			tablica[i][i][i][i].dane(); //wywo³anie metody do wypisania odpowiednich danych do obliczeñ
			tablica[i][i][i][i].momentgl(); // wywo³anie metody do wyœwietlenia wartoœæi g³ownego momentu bezw³adnoœci
			tablica[i][i][i][i].Stainer();  // wywo³anie metody do wyœwietlenia wartoœæi momentu bezw³adnoœci z tw. Steinera oraz wypisanie go
			System.out.println();
			
		}
		//Tablice obiektów klas pochodnych dla kuli:
		
		kula tablica2[][][] = new kula[5][5][5]; //utworzenie tablicy mog¹cej przechowywaæ 10 obiektów klasy kula

		for(int i=0;i<tablica2.length;i++){   //pêtla która przypisuje odpowiednim miejscom tablicy, nowo utworzone obiekty typu kula
			tablica2[i][i][i]=new kula(i,i,5.5);
		}
		
		for(int i=0;i<tablica2.length;i++){ //pêtla przechodz¹ca przez wszystkie elementy wyzej utworzonej tablicy
			//Dzia³anie jest analogiczne jak w powy¿szej pêtli dla walca
			tablica2[i][i][i].napis();
			tablica2[i][i][i].dane();
			tablica2[i][i][i].momentgl();
			tablica2[i][i][i].Stainer();
			System.out.println();
			
		}
		
		//Tablice obiektów klas pochodnych dla preta
		
		pret tablica3[][][] = new pret[5][5][5]; //utworzenie tablicy mog¹cej przechowywaæ 10 obiektów klasy prêt

		for(int i=0;i<tablica3.length;i++){  //pêtla która przypisuje odpowiednim miejscom tablicy, nowo utworzone obiekty typu kula
			tablica3[i][i][i]=new pret(i,i,5.5);
		}
		
		for(int i=0;i<tablica3.length;i++){ //pêtla przechodz¹ca przez wszystkie elementy wyzej utworzonej tablicy
			//Dzia³anie jest analogiczne jak w wy¿ej w pêtli dla walca
			tablica3[i][i][i].napis();
			tablica3[i][i][i].dane();
			tablica3[i][i][i].momentgl();
			tablica3[i][i][i].Stainer();
			System.out.println();
			}	
}}
