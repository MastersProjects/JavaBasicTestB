package aufgabe10.Collection;

public class CollectionController {
	private Collection collection;
	private double wertMap;
	private int wertSet;
	private String wertQueue;
	
	protected CollectionController(){
		collection = new Collection();
	}

	
	protected void setCollectioMapData(String title, Double number){
		collection.map.put(title, number);
	}
	
	protected void getCollectionMapDataAndPrintValue(String title){
		wertMap = collection.map.get(title);
		System.out.println(title + ": " + wertMap);
	}
	
	protected void setCollectioSetData(String title){
		collection.set.add(title);
	}
	
	protected void getCollectionSetDataAndPrintValue(){
		wertSet = collection.set.size();
		System.out.println("Anzahl Werte in dem Set: " + wertSet);
	}
	
	protected void getCollectionQueueDataAndPrintValue(){
		wertQueue = collection.queue.peek();
		System.out.println("Werte: " + wertQueue);
	}
	
	protected void setCollectionQueueData(String name) {
		collection.queue.add(name);
	}
}
