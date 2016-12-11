
public class StartRail implements MazeElement{

	private Direction direction;
	
	public StartRail(Direction direction){
		this.direction = direction;
	}
	
	@Override
	public boolean isConnectedToDirection(Direction dir) {
		return (dir.isEqualTo(direction));
	}

	@Override
	public Direction getDirection() {
		return direction;
	}
}