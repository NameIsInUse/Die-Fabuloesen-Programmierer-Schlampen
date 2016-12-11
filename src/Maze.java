public class Maze {
	
	//Richtungen (Directions) bitte nur als Direction() speichern, nicht als int oder byte!
	
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
		
		addStartRail();
		
		addRails();
		
		showMazeOnConsole();
	}
	
	private void showMazeOnConsole() {
		for(int h = 0; h<height; h++){
			for(int w = 0; w<width; w++){
				System.out.print(mazeElements[w][h].getDirection().getDir() + "\t");
			}
			System.out.println("");
		}
	}

	private void addStartRail(){
		mazeElements[(int) (width*0.5f)][(int) (height*0.5f)] = new StartRail(new Direction((int) (java.lang.Math.random()*4) +1));
	}
	
	private void addRails(){
		for(int w = 0; w<width; w++){
			for(int h = 0; h<height; h++){
				addRail(w, h);
			}
		}
	}
	
	private void addRail(int x, int y){
		boolean[] possibleDirection = new boolean[5];
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
		
		switch(possibleDirectionNumber){
		case(0): break;
		case(1): {
				if(possibleDirection[1] || possibleDirection[3]){
					mazeElements[x][y] = new StandardRail(new Direction(1));
					break;
				} else {
					mazeElements[x][y] = new StandardRail(new Direction(2));
					break;
				}
			}
		}
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