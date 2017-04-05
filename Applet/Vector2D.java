public class Vector2D {
public double x;   // pierwsza wsp�rz�dna wektora
public double y;   // druga wsp�rz�dna wektora
public double k=7; //sta�a kt�r� u�ywamy do mno�enia

public Vector2D(){	//konstruktor domy�lny
}

public Vector2D(double x, double y){  //konstruktor z parametrami 
	this.x=x;
	this.y=y;
}

public Vector2D sumaWektorow(Vector2D x1){ //metoda z parametrem zwracaj�ca obiekt b�d�cy sum� wektora kt�ry zosta� wywo�any i wektora podanego jako parametr
	Vector2D wektor = new Vector2D(x + x1.x,y + x1.y);
	return wektor;
}

public Vector2D roznicaWektorow(Vector2D  x1){  //metoda z parametrem zwracaj�ca obiekt b�d�cy r�nic� wektora kt�ry zosta� wywo�any i wektora podanego jako parametr
	Vector2D wektor = new Vector2D(x - x1.x,y - x1.y);
	return wektor;
}

public Vector2D mnozenieWektora(){  //metoda z parametrem zwracaj�ca obiekt b�d�cy wektorem przemno�onym przez sta��
	
	Vector2D wektor = new Vector2D(x*k,y*k);
	return wektor;
}
	
public double dlugoscWektora(){ //metoda z parametrem zwracaj�ca d�ugo�� wektora dla kt�rego metoda zosta�a wywo�ana
	return Math.sqrt(x*x+y*y);
}

public Vector2D wektorNorm(){  //metoda z parametrem zwracaj�ca obiekt b�d�cy znormalizowanym wektorem dla kt�rego metoda zosta�a wywo�ana
	
	double x2;
	double y2;

	x2=x/(Math.sqrt(x*x+y*y));
	y2=y/(Math.sqrt(x*x+y*y));
	Vector2D wektor = new Vector2D(x2, y2);
	return wektor;
	
}}
