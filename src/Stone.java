
public class Stone implements MazeElement{

	@Override
	public boolean isConnectedToDirection(Direction dir) {
		return false;
	}

	@Override
	public Direction getDirection() {
		return new Direction(0);
	}
}