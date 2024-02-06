package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import net.sourceforge.zbar.Symbol;

/* renamed from: o.TouchPointSelectAccountActivity */
public final class TouchPointSelectAccountActivity implements Iterator<Symbol> {
    private Symbol MediaBrowserCompat$CustomActionResultReceiver;

    public TouchPointSelectAccountActivity(Symbol symbol) {
        this.MediaBrowserCompat$CustomActionResultReceiver = symbol;
    }

    public final boolean hasNext() {
        return this.MediaBrowserCompat$CustomActionResultReceiver != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException("SymbolIterator is immutable");
    }

    public final /* synthetic */ Object next() {
        Symbol symbol = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (symbol != null) {
            long next = symbol.next();
            if (next != 0) {
                this.MediaBrowserCompat$CustomActionResultReceiver = new Symbol(next);
            } else {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
            return symbol;
        }
        throw new NoSuchElementException("access past end of SymbolIterator");
    }
}
