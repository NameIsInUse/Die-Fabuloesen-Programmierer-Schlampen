
public class Direction {

	private int dir;
	
	public Direction(int direction){
		this.dir = direction;
	}
	
	public Direction getInvertedDirection(){
		if(dir>2){
			return(new Direction(dir-2));
		}
		
		return(new Direction(dir+2));
	}

	public boolean isEqualTo(Direction direction) {
		if(dir == direction.getDir()){
			return true;
		}
		return false;
	}
	
	public int getDir(){
		return dir;
	}
}