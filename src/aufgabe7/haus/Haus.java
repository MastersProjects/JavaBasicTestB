package aufgabe7.haus;

import aufgabe7.mensch.*;
public class Haus
{

    public Haus()
    {
        Mann owner = new Mann();
        //age = 5; nicht möglich weil alter ist private
        //name = "hans"; //nicht möglich weil name ist protected und Haus ist keine speizialisierte Klasse von Mensch
        owner.gender = "men"; //möglich weil gender ist public
        //mann.weight = 75; //nicht möglich weil weight ist nur im Package verfügbar und Haus und Mann sind im gleichen Package
    }

}
