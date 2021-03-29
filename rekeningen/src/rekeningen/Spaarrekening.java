package rekeningen;

/**
 * @invar | 0 <= getBalans()
 */
public class Spaarrekening extends Rekening {

	/**
	 * @post | getBalans() == 0
	 */
	public Spaarrekening() {}
	
	/**
	 * @pre | 0 <= bedrag
	 * @mutates | this
	 * @post | getBalans() == old(getBalans())
	 * @post | result == 0
	 */
	@Override
	public int neemAf(int bedrag) {
		return 0;
	}

}
