
public class LAB2 {
public static void main(String args[]){
		
		Walec obiekt1=new Walec(); // utworzenie obiektu punkt
		Walec obiekt2=new Walec(1,2,3,4); // utworzenie obiektu punkt2
		//nast�pne cztery linie kodu s� analogiczne do powy�szych
		kula obiekt3=new kula(); 
		kula obiekt4=new kula(5,6,7);
		
		pret obiekt5=new pret();
		pret obiekt6=new pret(8,9,10);
		
		//Wywo�ywanie metod dla walca:
		obiekt1.napis();  //wywo�anie metody gdzie znajduje si� napis dla obiektu obiekt1
		System.out.println(); //Komenda u�yta tylko w celu zwi�kszenia przejrzysto�ci wykonanego programu
		obiekt1.dane(); //wywo�anie metody do wypisania odpowiednich danych do oblicze� (dla konstruktora domy�lnego)
		obiekt1.momentgl();  // wywo�anie metody do wy�wietlenia warto��i g�ownego momentu bezw�adno�ci
		obiekt1.Stainer();  // wywo�anie metody do wy�wietlenia warto��i momentu bezw�adno�ci z tw. Steinera oraz wypisanie go
		System.out.println();
		obiekt2.dane(); //wywo�anie metody do wypisania odpowiednich danych do oblicze� (dla konstruktora z parametrami)
		obiekt2.momentgl();  // wywo�anie metody do wy�wietlenia warto��i g�ownego momentu bezw�adno�ci
		obiekt2.Stainer();   // wywo�anie metody do wy�wietlenia warto��i momentu bezw�adno�ci z tw. Steinera oraz wypisanie go
		System.out.println();
		System.out.println();

		//Wywo�ywanie metod dla kuli odbywa si� w spos�b analogiczny jak dla walca
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
		
		//Wywo�ywanie metod dla pr�ta odbywa si� w spos�b analogiczny jak dla walca
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
		
	//Tablice obiekt�w klas pochodnych dla walca:
		
		Walec tablica[][][][] = new Walec[5][5][5][5]; //utworzenie tablicy mog�cej przechowywa� 10 obiekt�w klasy Walec

		for(int i=0;i<tablica.length;i++){  //p�tla kt�ra przypisuje odpowiednim miejscom tablicy, nowo utworzone obiekty typu Walec
			tablica[i][i][i][i]=new Walec(i,i,i,5.5);
		}
		
		for(int i=0;i<tablica.length;i++){ //p�tla przechodz�ca przez wszystkie elementy wyzej utworzonej tablicy
			tablica[i][i][i][i].napis(); //wywo�anie metody gdzie znajduje si� napis
			tablica[i][i][i][i].dane(); //wywo�anie metody do wypisania odpowiednich danych do oblicze�
			tablica[i][i][i][i].momentgl(); // wywo�anie metody do wy�wietlenia warto��i g�ownego momentu bezw�adno�ci
			tablica[i][i][i][i].Stainer();  // wywo�anie metody do wy�wietlenia warto��i momentu bezw�adno�ci z tw. Steinera oraz wypisanie go
			System.out.println();
			
		}
		//Tablice obiekt�w klas pochodnych dla kuli:
		
		kula tablica2[][][] = new kula[5][5][5]; //utworzenie tablicy mog�cej przechowywa� 10 obiekt�w klasy kula

		for(int i=0;i<tablica2.length;i++){   //p�tla kt�ra przypisuje odpowiednim miejscom tablicy, nowo utworzone obiekty typu kula
			tablica2[i][i][i]=new kula(i,i,5.5);
		}
		
		for(int i=0;i<tablica2.length;i++){ //p�tla przechodz�ca przez wszystkie elementy wyzej utworzonej tablicy
			//Dzia�anie jest analogiczne jak w powy�szej p�tli dla walca
			tablica2[i][i][i].napis();
			tablica2[i][i][i].dane();
			tablica2[i][i][i].momentgl();
			tablica2[i][i][i].Stainer();
			System.out.println();
			
		}
		
		//Tablice obiekt�w klas pochodnych dla preta
		
		pret tablica3[][][] = new pret[5][5][5]; //utworzenie tablicy mog�cej przechowywa� 10 obiekt�w klasy pr�t

		for(int i=0;i<tablica3.length;i++){  //p�tla kt�ra przypisuje odpowiednim miejscom tablicy, nowo utworzone obiekty typu kula
			tablica3[i][i][i]=new pret(i,i,5.5);
		}
		
		for(int i=0;i<tablica3.length;i++){ //p�tla przechodz�ca przez wszystkie elementy wyzej utworzonej tablicy
			//Dzia�anie jest analogiczne jak w wy�ej w p�tli dla walca
			tablica3[i][i][i].napis();
			tablica3[i][i][i].dane();
			tablica3[i][i][i].momentgl();
			tablica3[i][i][i].Stainer();
			System.out.println();
			}	
}}
