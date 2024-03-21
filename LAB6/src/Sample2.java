class Player {
	int player_id=7;
	boolean ball=true;
	boolean run=true;
	void show() {
		System.out.println("Player Id : "+player_id);
		System.out.println("Ball used : "+ball);
		System.out.println("Running involved : "+run);
	}
}
class Cricket_player extends Player{
	String type = "Cricket";
	public void show() {
		System.out.println("\nPlayer Type : "+type );
		super.show();
	}	
}
class Hockey_player extends Player{
	String type = "Hockey";
	public void show() {
		System.out.println("\nType of Player : "+type);
		super.show();
	}
}
class Football_player extends Player{
	String type="Football";
	public void show() {
		System.out.println("\nPlayer Type : "+type );
		super.show();
	}
}
class Sample2{
	public static void main(String args[]) {
		Cricket_player c=new Cricket_player();
		Football_player f=new Football_player();
		Hockey_player h= new Hockey_player();
		c.show();
		f.show();
		h.show();
	}	
}