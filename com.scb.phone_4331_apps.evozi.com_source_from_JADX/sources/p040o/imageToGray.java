package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.imageToGray */
public final /* synthetic */ class imageToGray implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ lambda$getSortedCustomAttributes$0 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ imageToGray(lambda$getSortedCustomAttributes$0 lambda_getsortedcustomattributes_0) {
        this.MediaBrowserCompat$CustomActionResultReceiver = lambda_getsortedcustomattributes_0;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((RttiPassportExtractor_Factory) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver.write);
    }
}
