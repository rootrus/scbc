package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.CaptureExperience */
public final /* synthetic */ class CaptureExperience implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ lambda$getSortedCustomAttributes$0 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ CaptureExperience(lambda$getSortedCustomAttributes$0 lambda_getsortedcustomattributes_0) {
        this.MediaBrowserCompat$ItemReceiver = lambda_getsortedcustomattributes_0;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((RttiPassportExtractor) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}
