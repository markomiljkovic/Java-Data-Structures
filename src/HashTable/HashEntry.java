package HashTable;

public class HashEntry {

	
	
	String key;
	int value;
	
	public HashEntry(String key,int value){
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString(){
		return "Key -"+this.key +" Value-"+this.value;
	}
	
}
