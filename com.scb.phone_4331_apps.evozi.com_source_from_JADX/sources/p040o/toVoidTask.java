package p040o;

import p040o.Tables;
import p040o.zzfo;

/* renamed from: o.toVoidTask */
public final /* synthetic */ class toVoidTask implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ shouldShowCancelButton MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ toVoidTask(shouldShowCancelButton shouldshowcancelbutton) {
        this.MediaBrowserCompat$CustomActionResultReceiver = shouldshowcancelbutton;
    }

    public final Object write(Object obj) {
        start start = (start) obj;
        return new zzfo.zza(start.MediaBrowserCompat$CustomActionResultReceiver, shouldShowCancelButton.read(start.write, new Tables.ImmutableCell.write(this.MediaBrowserCompat$CustomActionResultReceiver), zzq.read));
    }
}
