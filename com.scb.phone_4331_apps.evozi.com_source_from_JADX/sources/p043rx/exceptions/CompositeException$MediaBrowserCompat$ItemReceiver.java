package p043rx.exceptions;

import java.io.PrintWriter;
import p043rx.exceptions.CompositeException;

/* renamed from: rx.exceptions.CompositeException$MediaBrowserCompat$ItemReceiver */
class CompositeException$MediaBrowserCompat$ItemReceiver extends CompositeException.read {
    private final PrintWriter write;

    CompositeException$MediaBrowserCompat$ItemReceiver(PrintWriter printWriter) {
        super((byte) 0);
        this.write = printWriter;
    }

    /* access modifiers changed from: package-private */
    public final Object MediaBrowserCompat$ItemReceiver() {
        return this.write;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        this.write.println(obj);
    }
}
