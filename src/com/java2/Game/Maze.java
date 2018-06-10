package com.java2.Game;


public class Maze {
	int row;
	int col;
	int snareCount;
	int[] Location;
	Player player = new Player();
	public Maze(int row,int col,int snareCount) {
		this.row = row;
		this.col = col;
		this.snareCount = snareCount;
	
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getsnareCount() {
		return snareCount;
	}
	public void setsnareCount(int snareCount) {
		this.snareCount = snareCount;
	}
	public int[] Location() {
		return Location;
	}

	public void setTrapLocation(int[] Location) {
		this.Location = Location;
	}
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	public class Player {
		int HP = 100;
		int location = 0;
	}
}
