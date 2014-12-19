package sedmica6utorak;

public class DHLPackage extends Package{
public float getDimensionalWeght(){
		
		float dimensionalWeight=(getWeight()*getHeight()+getLength())/5000;
		return dimensionalWeight;
	}
}