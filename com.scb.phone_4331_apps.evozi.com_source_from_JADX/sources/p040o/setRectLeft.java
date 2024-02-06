package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRectLeft */
public final /* synthetic */ class setRectLeft implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsBackgroundWorker.C32164 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setRectLeft(CrashlyticsBackgroundWorker.C32164 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        setMicrData.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, (CheckExtractActivity_MembersInjector.RatingCompat) obj);
    }
}
