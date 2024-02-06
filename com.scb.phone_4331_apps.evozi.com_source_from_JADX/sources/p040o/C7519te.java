package p040o;

import p040o.C7434sI;
import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.te */
public final /* synthetic */ class C7519te implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C7434sI.write MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C7519te(C7434sI.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        C7434sI.write write = this.MediaBrowserCompat$CustomActionResultReceiver;
        startUp RatingCompat = C7434sI.this.MediaBrowserCompat$SearchResultReceiver;
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder MediaMetadataCompat = C7434sI.this.read;
        C7434sI sIVar = C7434sI.this;
        ((getTopLeftCornerWidth.setExpandedFormat) obj).MediaBrowserCompat$ItemReceiver(RatingCompat.IconCompatParcelizer(MediaMetadataCompat, C7434sI.MediaBrowserCompat$CustomActionResultReceiver(sIVar, sIVar.read.IconCompatParcelizer), C7434sI.this.MediaBrowserCompat$ItemReceiver.read.setItemInvoker()));
    }
}
