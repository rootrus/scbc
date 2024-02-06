package p040o;

import android.content.Context;
import android.os.SystemClock;
import p040o.writeUInt64NoTag;

/* renamed from: o.dP */
public final /* synthetic */ class C9885dP implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Context MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4261dN read;

    public /* synthetic */ C9885dP(C4261dN dNVar, Context context) {
        this.read = dNVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4261dN dNVar = this.read;
        ((getAdditionalLeftScanLinesWidth) obj).read(String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.opt_delay), new Object[]{String.valueOf((15000 - (SystemClock.elapsedRealtime() - dNVar.write)) / 1000)}));
    }
}
