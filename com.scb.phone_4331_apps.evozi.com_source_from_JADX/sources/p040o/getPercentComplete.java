package p040o;

import p040o.AppStatsSessionEvent;
import p040o.ICheckExtractorListener;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getPercentComplete */
public final /* synthetic */ class getPercentComplete implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AppStatsSessionEvent.C30373 IconCompatParcelizer;
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getPercentComplete(AppStatsSessionEvent.C30373 r1, Throwable th) {
        this.IconCompatParcelizer = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsSessionEvent.C30373 r0 = this.IconCompatParcelizer;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        ICheckExtractorListener.MediaDescriptionCompat mediaDescriptionCompat = (ICheckExtractorListener.MediaDescriptionCompat) obj;
        mediaDescriptionCompat.aj_();
        mediaDescriptionCompat.write(AppStatsSessionEvent.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
