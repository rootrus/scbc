package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.SetupScheduleActivity$MediaBrowserCompat$ItemReceiver */
public final class SetupScheduleActivity$MediaBrowserCompat$ItemReceiver implements Iterator<T>, FundOnboardingSuccessActivity_ViewBinding {
    private /* synthetic */ SetupScheduleActivity IconCompatParcelizer;
    private T MediaBrowserCompat$CustomActionResultReceiver;
    private final Iterator<T> read;
    private int write = -1;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    SetupScheduleActivity$MediaBrowserCompat$ItemReceiver(SetupScheduleActivity setupScheduleActivity) {
        this.IconCompatParcelizer = setupScheduleActivity;
        this.read = setupScheduleActivity.write.read();
    }

    private final void write() {
        while (this.read.hasNext()) {
            T next = this.read.next();
            if (this.IconCompatParcelizer.read.invoke(next).booleanValue() == this.IconCompatParcelizer.IconCompatParcelizer) {
                this.MediaBrowserCompat$CustomActionResultReceiver = next;
                this.write = 1;
                return;
            }
        }
        this.write = 0;
    }

    public final T next() {
        if (this.write == -1) {
            write();
        }
        if (this.write != 0) {
            T t = this.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write = -1;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        if (this.write == -1) {
            write();
        }
        return this.write == 1;
    }
}
