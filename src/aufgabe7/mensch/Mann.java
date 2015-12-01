package aufgabe7.mensch;

public class Mann extends Mensch
{

    public Mann()
    {
        //age = 25; nicht möglich weil alter ist private
        name = "hans"; //möglich weil name ist protected und Mann ist eine speizialisierte Klasse von Mensch
        gender = "men"; //möglich weil gender ist public
        weight = 75; //möglich weil weight ist nur im Package verfügbar und Mann und Mensch sind im gleichen Package
    }
}
