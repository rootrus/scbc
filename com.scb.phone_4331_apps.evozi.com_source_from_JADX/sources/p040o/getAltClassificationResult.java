package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getAltClassificationResult */
public final /* synthetic */ class getAltClassificationResult implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getErrCause read;

    public /* synthetic */ getAltClassificationResult(getErrCause geterrcause) {
        this.read = geterrcause;
    }

    public final void IconCompatParcelizer(Object obj) {
        getErrCause geterrcause = this.read;
        ((getLatestCachedModelDataBuildInfo) obj).read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(geterrcause.write, (String) null, geterrcause.MediaBrowserCompat$ItemReceiver, (String) null, (String) null, true, false, (String) null, 72));
    }
}
