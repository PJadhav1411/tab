
public class ColorFactory implements AbstractFactory {
	 public Shape getShape(String shapeType){
	 return null;
	 }

	 public Color getColor(String color) 
	 {
	 if(color == null){
	 return null;
	 }

	 if(color.equalsIgnoreCase("RED")){
	 return new Red();

	 }else if(color.equalsIgnoreCase("GREEN")){
	 return new Green();

	 }else if(color.equalsIgnoreCase("BLUE")){
	 return new Blue();
	 }

	 return null;
	 }
	}
