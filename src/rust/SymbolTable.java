/**
 * 
 */
package rust;

import java.util.Hashtable;

/**
 * @author Sergiocima
 *
 */
public class SymbolTable {

	private Hashtable<String, SymbolTableEntry> symbolTable;

	public SymbolTable() {
		this.symbolTable = new Hashtable<String, SymbolTableEntry>();
	}

	public SymbolTableEntry searchByName(String name) {
		if (symbolTable.contains(name)) {
			return symbolTable.get(name);
		} else
			return null;
	}

	public void addSymbolEntry(SymbolTableEntry newEntry) {
		SymbolTableEntry symbolTableEntry = symbolTable.get(newEntry.getName());
		if (symbolTableEntry == null)
			symbolTable.put(newEntry.getName(), newEntry);
		else {
			symbolTableEntry.addPosition(newEntry.getPositions().get(0));
		}

	}

	@Override
	public String toString() {
		return "SymbolTable [symbolTable=" + symbolTable + "]";
	}

	public void print() {
		for (String key : symbolTable.keySet()) {
			System.out.println(symbolTable.get(key).toString());
		}
	}

}
