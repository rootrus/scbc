package net.sourceforge.zbar;

import java.util.AbstractCollection;
import java.util.Iterator;
import p040o.TouchPointSelectAccountActivity;

public class SymbolSet extends AbstractCollection<Symbol> {
    private long peer;

    static {
        System.loadLibrary("zbarjni");
        init();
    }

    public SymbolSet(long j) {
        this.peer = j;
    }

    private native void destroy(long j);

    private native long firstSymbol(long j);

    private static native void init();

    public Iterator<Symbol> iterator() {
        long firstSymbol = firstSymbol(this.peer);
        return firstSymbol == 0 ? new TouchPointSelectAccountActivity((Symbol) null) : new TouchPointSelectAccountActivity(new Symbol(firstSymbol));
    }

    public native int size();

    /* access modifiers changed from: protected */
    public void finalize() {
        synchronized (this) {
            if (this.peer != 0) {
                destroy(this.peer);
                this.peer = 0;
            }
        }
    }
}
