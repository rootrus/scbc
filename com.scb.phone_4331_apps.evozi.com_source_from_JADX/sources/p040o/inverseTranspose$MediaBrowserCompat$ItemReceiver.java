package p040o;

import android.content.Context;
import p040o.createMultiContext;

/* renamed from: o.inverseTranspose$MediaBrowserCompat$ItemReceiver */
final class inverseTranspose$MediaBrowserCompat$ItemReceiver implements createMultiContext.read {
    private Context MediaBrowserCompat$ItemReceiver;

    private inverseTranspose$MediaBrowserCompat$ItemReceiver() {
    }

    /* synthetic */ inverseTranspose$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final createMultiContext MediaBrowserCompat$CustomActionResultReceiver() {
        Context context = this.MediaBrowserCompat$ItemReceiver;
        Class<Context> cls = Context.class;
        if (context != null) {
            return new inverseTranspose(context, (byte) 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ createMultiContext.read MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        if (context != null) {
            this.MediaBrowserCompat$ItemReceiver = context;
            return this;
        }
        throw null;
    }
}
