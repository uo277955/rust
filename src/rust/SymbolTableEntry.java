/**
 * 
 */
package rust;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Sergiocima
 *
 */
public class SymbolTableEntry {

	private String name; // El nombre del identificador.
	private String kind; // Esto es el tipo del identificador.
	private String type; // Tipo del token.
	private List<Position> positions; // La posicion del token en el codigo.

	public SymbolTableEntry(String name) {
		super();
		this.name = name;
		this.kind = "";
		this.type = "";
		this.positions = new LinkedList<Position>();
	}

	public SymbolTableEntry(String name, Position position) {
		this.name = name;
		this.kind = "";
		this.type = "";
		this.positions = new LinkedList<Position>();
		positions.add(position);
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void addPosition(Position position) {
		positions.add(position);
	}

	public String getName() {
		return name;
	}

	public String getKind() {
		return kind;
	}

	public String getType() {
		return type;
	}

	public List<Position> getPositions() {
		return positions;
	}

	@Override
	public String toString() {
		return "SymbolTableEntry [name=" + name + ", positions=" + positions + "]";
	}

}
