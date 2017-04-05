public class Vector2D {
public double x;   // pierwsza wspó³rzêdna wektora
public double y;   // druga wspó³rzêdna wektora
public double k=7; //sta³a któr¹ u¿ywamy do mno¿enia

public Vector2D(){	//konstruktor domyœlny
}

public Vector2D(double x, double y){  //konstruktor z parametrami 
	this.x=x;
	this.y=y;
}

public Vector2D sumaWektorow(Vector2D x1){ //metoda z parametrem zwracaj¹ca obiekt bêd¹cy sum¹ wektora który zosta³ wywo³any i wektora podanego jako parametr
	Vector2D wektor = new Vector2D(x + x1.x,y + x1.y);
	return wektor;
}

public Vector2D roznicaWektorow(Vector2D  x1){  //metoda z parametrem zwracaj¹ca obiekt bêd¹cy ró¿nic¹ wektora który zosta³ wywo³any i wektora podanego jako parametr
	Vector2D wektor = new Vector2D(x - x1.x,y - x1.y);
	return wektor;
}

public Vector2D mnozenieWektora(){  //metoda z parametrem zwracaj¹ca obiekt bêd¹cy wektorem przemno¿onym przez sta³¹
	
	Vector2D wektor = new Vector2D(x*k,y*k);
	return wektor;
}
	
public double dlugoscWektora(){ //metoda z parametrem zwracaj¹ca d³ugoœæ wektora dla którego metoda zosta³a wywo³ana
	return Math.sqrt(x*x+y*y);
}

public Vector2D wektorNorm(){  //metoda z parametrem zwracaj¹ca obiekt bêd¹cy znormalizowanym wektorem dla którego metoda zosta³a wywo³ana
	
	double x2;
	double y2;

	x2=x/(Math.sqrt(x*x+y*y));
	y2=y/(Math.sqrt(x*x+y*y));
	Vector2D wektor = new Vector2D(x2, y2);
	return wektor;
	
}}
