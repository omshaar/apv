package cx.hell.android.lib.pagesview;


/**
 * Tile definition.
 * Can be used as a key in maps (hashable, comparable).
 */
public class Tile {

	/**
	 * X position of tile in pixels.
	 */
	private int x;
	
	/**
	 * Y position of tile in pixels.
	 */
	private int y;
	
	private int zoom;
	private int page;
	private int rotation;
	
	int _hashCode;
	
	public Tile(int page, int zoom, int x, int y, int rotation) {
		this.page = page;
		this.zoom = zoom;
		this.x = x;
		this.y = y;
		this.rotation = rotation;
	}
	
	public String toString() {
		return "Tile(" +
			this.page + ", " +
			this.zoom + ", " +
			this.x + ", " +
			this.y + ", " +
			this.rotation + ")";
	}
	
	public int hashCode() {
		return this._hashCode;
	}
	
	public boolean equals(Object o) {
		if (! (o instanceof Tile)) return false;
		Tile t = (Tile) o;
		return (
					this._hashCode == t._hashCode
					&& this.page == t.page
					&& this.zoom == t.zoom
					&& this.x == t.x
					&& this.y == t.y
					&& this.rotation == t.rotation
				);
	}
	
	public int getPage() {
		return this.page;
	}
	
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getZoom() {
		return this.zoom;
	}

	public int getRotation() {
		return this.rotation;
	}
}
