
public class StandardRail implements MazeElement{

	private Direction direction;
	
	public StandardRail(Direction direction){
		this.direction = direction;
	}
	
	@Override
	public boolean isConnectedToDirection(Direction dir) {
		if(dir.isEqualTo(direction)){
			return true;
		}
		
		if(direction.isEqualTo(dir.getInvertedDirection())){
			return true;
		}
		
		return false;
	}

	@Override
	public Direction getDirection() {
		return direction;
	}
	
}