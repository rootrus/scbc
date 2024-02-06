package p040o;

import com.thunderhead.trackoption.TrackOptionActivity;

/* renamed from: o.DeejungPlansActivity_ViewBinding */
public final /* synthetic */ class DeejungPlansActivity_ViewBinding implements onAccountSummaryClick$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ TrackOptionActivity.C62762 write;

    public /* synthetic */ DeejungPlansActivity_ViewBinding(TrackOptionActivity.C62762 r1) {
        this.write = r1;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        TrackOptionActivity.C62762 r0 = this.write;
        TrackOptionActivity.this.setResult(-1, TrackOptionActivity.MediaBrowserCompat$MediaItem());
        TrackOptionActivity.this.finish();
    }
}
