package p040o;

import p040o.AppStatsSqLiteDs;
import p040o.ICheckExtractorListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.aQ */
public final /* synthetic */ class C3983aQ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getLogBytes MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C3983aQ(getLogBytes getlogbytes) {
        this.MediaBrowserCompat$ItemReceiver = getlogbytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsSqLiteDs.C30394.read(this.MediaBrowserCompat$ItemReceiver, (ICheckExtractorListener.IconCompatParcelizer) obj);
    }
}
