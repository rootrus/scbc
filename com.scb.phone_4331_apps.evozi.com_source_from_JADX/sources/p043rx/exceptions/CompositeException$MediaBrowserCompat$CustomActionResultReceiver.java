package p043rx.exceptions;

import java.io.PrintStream;
import p043rx.exceptions.CompositeException;

/* renamed from: rx.exceptions.CompositeException$MediaBrowserCompat$CustomActionResultReceiver */
class CompositeException$MediaBrowserCompat$CustomActionResultReceiver extends CompositeException.read {
    private final PrintStream read;

    CompositeException$MediaBrowserCompat$CustomActionResultReceiver(PrintStream printStream) {
        super((byte) 0);
        this.read = printStream;
    }

    /* access modifiers changed from: package-private */
    public final Object MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        this.read.println(obj);
    }
}
