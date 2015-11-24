package aufgabe10.Collection;

public class Starter {
	private static CollectionController controller;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		controller = new CollectionController();
		
		controller.setCollectioMapData("Wert1", 5.5);
		controller.setCollectioMapData("Wert2", 8.8);
		controller.setCollectioMapData("Wert3", 98.638);
		
		controller.setCollectioSetData("Wert1");
		controller.setCollectioSetData("Wert2");
		controller.setCollectioSetData("Wert3");
		
		System.out.println("Collection");
		System.out.println("Map:");
		controller.getCollectionMapDataAndPrintValue("Wert3");
		
		System.out.println("**************************");
		System.out.println("Set:");
		controller.getCollectionSetDataAndPrintValue();
	}

}
