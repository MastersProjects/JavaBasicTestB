package aufgabe7.mensch;

public class Kind
{

    public Kind()
    {
        Mann vater = new Mann();
        //age = 5; nicht möglich weil alter ist private
        //name = "hans"; //nicht möglich weil name ist protected und Kind ist keine speizialisierte Klasse von Mensch
        vater.gender = "men"; //möglich weil gender ist public
        vater.weight = 75; //möglich weil weight ist nur im Package verfügbar und Kind und Mensch sind im gleichen Package
    }
}
