package p040o;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

@HmlSetNTBPinActivity
/* renamed from: o.createMultiContext */
public abstract class createMultiContext implements Closeable {

    /* renamed from: o.createMultiContext$read */
    interface read {
        read MediaBrowserCompat$CustomActionResultReceiver(Context context);

        createMultiContext MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: package-private */
    public abstract C7507tQ MediaBrowserCompat$CustomActionResultReceiver();

    public abstract getPointerSize write();

    createMultiContext() {
    }

    public void close() throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver().close();
    }
}
