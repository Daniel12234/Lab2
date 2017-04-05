import javax.swing.JApplet;
public class SpringApplet extends JApplet {
	
	
	public void init() {
		
		Vector2D wektor1=new Vector2D(10,15); //stworzenie obiektu dla klasy Vector2D
		Vector2D wektor2=new Vector2D(20,25); //stworzenie obiektu dla klasy Vector2D
		System.out.println("Wsp�rz�dne pierwszego wektora to: ["+wektor1.x+"]["+wektor1.y+"]"); //wypisanie wsp�rz�dnych dla wektora
		System.out.println("Wsp�rz�dne pierwszego wektora to: ["+wektor2.x+"]["+wektor2.y+"]"); //wypisanie wsp�rz�dnych dla wektora
		
		
		Vector2D suma=new Vector2D(); //obliczenie sumy wektor�w i zapis wyniku do nowej zmiennej
		suma=wektor1.sumaWektorow(wektor2);
		System.out.println("Suma wektor�w wynosi: ["+suma.x+"]["+suma.y+"]"); //wy�wietlenie obliczonych warto�ci
		
		Vector2D roznica=new Vector2D(); //obliczenie r�nicy wektor�w i zapis wyniku do nowej zmiennej
		roznica=wektor1.roznicaWektorow(wektor2);
		System.out.println("R�nica wektor�w wynosi: ["+roznica.x+"]["+roznica.y+"]"); //wy�wietlenie obliczonych warto�ci
		
		Vector2D znormalizowany1=new Vector2D(); //obliczenie warto�ci wektora znormalizowanego i zapis wyniku do nowej zmiennej
		znormalizowany1=wektor1.wektorNorm();
		System.out.println("Warto�ci wektora znormalizowanego: ["+znormalizowany1.x+"]["+znormalizowany1.y+"]"); //wy�wietlenie obliczonych warto�ci
		
		Vector2D znormalizowany2=new Vector2D(); //obliczenie warto�ci wektora znormalizowanego i zapis wyniku do nowej zmiennej
		znormalizowany2=wektor2.wektorNorm();
		System.out.println("Warto�ci wektora znormalizowanego: ["+znormalizowany2.x+"]["+znormalizowany2.y+"]"); //wy�wietlenie obliczonych warto�ci
		
		double dlugosc1=wektor1.dlugoscWektora(); //obliczanie d�ugo�ci wektora1
		System.out.println("D�ugo�� wektora pierwszego wynosi: ["+dlugosc1+"]"); //wy�wietlenie obliczonych warto�ci
		double dlugosc2=wektor2.dlugoscWektora();  //obliczanie d�ugo�ci wektora2
		System.out.println("D�ugo�� wektora pierwszego wynosi: ["+dlugosc2+"]"); //wy�wietlenie obliczonych warto�ci
		
		Vector2D mnozenie=new Vector2D();  //obliczanie wektora po pomno�eniu przez sta�a, wynosz�c� 7
		mnozenie=wektor1.mnozenieWektora();
		System.out.println("Warto�� wektora po pomno�eniu przez sta�� k=7 wynosi : ["+mnozenie.x+"]["+mnozenie.y+"]"); //wy�wietlenie obliczonych warto�ci
		
	}
	public void paint(){
		
	}}
