public class Maze {
	
	private int width, height;
	
	private MazeElement[][] mazeElements;
	
	public Maze(int width, int height){
		this.width = width;
		this.height = height;
		
		mazeElements = new MazeElement[width][height];
		
		for(int w = 0; w<width; w++){
			for(int h = 0; h<height; h++){
				mazeElements[w][h] = new Stone();
			}
		}
	}
	
	private void addStartRail(){
		mazeElements[(int) (width*0.5f)][(int) (height*0.5f)] = new StartRail(new Direction((int) (java.lang.Math.random()*4) +1));
	}
	
	private void addRail(int x, int y){
		boolean[] possibleDirection = new boolean[4];
		byte possibleDirectionNumber = 0;
		
		//check for connection to top
		if(isConnectedToDirection(x, y-1, new Direction(3))){
			possibleDirection[1] = true;
			possibleDirectionNumber++;
		}
		
		//check for connection to bottom
		if(isConnectedToDirection(x, y+1, new Direction(1))){
			possibleDirection[3] = true;
			possibleDirectionNumber++;
		}
		
		//check for connection to left
		if(isConnectedToDirection(x-1, y, new Direction(2))){
			possibleDirection[4] = true;
			possibleDirectionNumber++;
		}
		
		//check for connection to right
		if(isConnectedToDirection(x+1, y, new Direction(4))){
			possibleDirection[2] = true;
			possibleDirectionNumber++;
		}
		
		//add a rail that connects the given connections
	}
	
	private boolean isConnectedToDirection(int x, int y, Direction direction){
		if(!(x<0 || x>=width || y<0 || y>=height)){
			if(mazeElements[x][y].isConnectedToDirection(direction)){
				return true;
			}
		}
		return false;
	}
}