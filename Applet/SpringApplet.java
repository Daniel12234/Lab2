import javax.swing.JApplet;
public class SpringApplet extends JApplet {
	
	
	public void init() {
		
		Vector2D wektor1=new Vector2D(10,15); //stworzenie obiektu dla klasy Vector2D
		Vector2D wektor2=new Vector2D(20,25); //stworzenie obiektu dla klasy Vector2D
		System.out.println("Wspó³rzêdne pierwszego wektora to: ["+wektor1.x+"]["+wektor1.y+"]"); //wypisanie wspó³rzêdnych dla wektora
		System.out.println("Wspó³rzêdne pierwszego wektora to: ["+wektor2.x+"]["+wektor2.y+"]"); //wypisanie wspó³rzêdnych dla wektora
		
		
		Vector2D suma=new Vector2D(); //obliczenie sumy wektorów i zapis wyniku do nowej zmiennej
		suma=wektor1.sumaWektorow(wektor2);
		System.out.println("Suma wektorów wynosi: ["+suma.x+"]["+suma.y+"]"); //wyœwietlenie obliczonych wartoœci
		
		Vector2D roznica=new Vector2D(); //obliczenie ró¿nicy wektorów i zapis wyniku do nowej zmiennej
		roznica=wektor1.roznicaWektorow(wektor2);
		System.out.println("Ró¿nica wektorów wynosi: ["+roznica.x+"]["+roznica.y+"]"); //wyœwietlenie obliczonych wartoœci
		
		Vector2D znormalizowany1=new Vector2D(); //obliczenie wartoœci wektora znormalizowanego i zapis wyniku do nowej zmiennej
		znormalizowany1=wektor1.wektorNorm();
		System.out.println("Wartoœci wektora znormalizowanego: ["+znormalizowany1.x+"]["+znormalizowany1.y+"]"); //wyœwietlenie obliczonych wartoœci
		
		Vector2D znormalizowany2=new Vector2D(); //obliczenie wartoœci wektora znormalizowanego i zapis wyniku do nowej zmiennej
		znormalizowany2=wektor2.wektorNorm();
		System.out.println("Wartoœci wektora znormalizowanego: ["+znormalizowany2.x+"]["+znormalizowany2.y+"]"); //wyœwietlenie obliczonych wartoœci
		
		double dlugosc1=wektor1.dlugoscWektora(); //obliczanie d³ugoœci wektora1
		System.out.println("D³ugoœæ wektora pierwszego wynosi: ["+dlugosc1+"]"); //wyœwietlenie obliczonych wartoœci
		double dlugosc2=wektor2.dlugoscWektora();  //obliczanie d³ugoœci wektora2
		System.out.println("D³ugoœæ wektora pierwszego wynosi: ["+dlugosc2+"]"); //wyœwietlenie obliczonych wartoœci
		
		Vector2D mnozenie=new Vector2D();  //obliczanie wektora po pomno¿eniu przez sta³a, wynosz¹c¹ 7
		mnozenie=wektor1.mnozenieWektora();
		System.out.println("Wartoœæ wektora po pomno¿eniu przez sta³¹ k=7 wynosi : ["+mnozenie.x+"]["+mnozenie.y+"]"); //wyœwietlenie obliczonych wartoœci
		
	}
	public void paint(){
		
	}}
