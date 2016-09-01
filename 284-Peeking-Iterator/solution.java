// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {

    boolean hasPeeked;
    Integer peekedElement ;
    Iterator<Integer> iterator;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        hasPeeked = false;
        peekedElement = null;
        this.iterator = iterator;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(!hasPeeked)
        {
            hasPeeked = true;
            peekedElement = iterator.next();
        }
        return peekedElement;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(!hasPeeked)
	    {
	        return iterator.next();
	    }
	    Integer retElem = peekedElement;
	    hasPeeked = false;
	    peekedElement = null;
	    return retElem;
	}

	@Override
	public boolean hasNext() {
	    return hasPeeked || iterator.hasNext();    
	}
}