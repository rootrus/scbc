package p039io.reactivex.exceptions;

import java.io.PrintStream;
import p039io.reactivex.exceptions.CompositeException;

/* renamed from: io.reactivex.exceptions.CompositeException$MediaBrowserCompat$CustomActionResultReceiver */
final class CompositeException$MediaBrowserCompat$CustomActionResultReceiver extends CompositeException.write {
    private final PrintStream read;

    CompositeException$MediaBrowserCompat$CustomActionResultReceiver(PrintStream printStream) {
        this.read = printStream;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(Object obj) {
        this.read.println(obj);
    }
}
