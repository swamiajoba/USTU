package cg3;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMarkerClass ob=new MyMarkerClass();
		if(ob instanceof MyMarkerClass)
			System.out.println("Instance of MyMarkerClass class");
		if (ob instanceof MyMarker)
			System.out.println("Instance of MyMarker interface");
	}

}



// java.io.Serializable --> marker
// suppose u implements this interface in Employee class
// Employee class object can be convertable to the byteStream
// serialization
