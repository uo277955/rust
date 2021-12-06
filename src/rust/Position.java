/**
 * 
 */
package rust;

/**
 * @author Sergiocima
 *
 */
public class Position {

	private int beginLine;
	private int beginColumn;
	private int endLine;
	private int endColumn;

	public Position(int beginLine, int beginColumn, int endLine, int endColumn) {
		this.beginColumn = beginColumn;
		this.beginLine = beginLine;
		this.endColumn = endColumn;
		this.endLine = endLine;
	}

	@Override
	public String toString() {
		return "Position [beginLine=" + beginLine + ", beginColumn=" + beginColumn + ", endLine=" + endLine
				+ ", endColumn=" + endColumn + "]";
	}

	public int getBeginLine() {
		return beginLine;
	}

	public void setBeginLine(int beginLine) {
		this.beginLine = beginLine;
	}

	public int getBeginColumn() {
		return beginColumn;
	}

	public void setBeginColumn(int beginColumn) {
		this.beginColumn = beginColumn;
	}

	public int getEndLine() {
		return endLine;
	}

	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	public int getEndColumn() {
		return endColumn;
	}

	public void setEndColumn(int endColumn) {
		this.endColumn = endColumn;
	}

}
