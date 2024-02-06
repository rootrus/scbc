package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setOSVersion */
public final /* synthetic */ class setOSVersion implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setOSVersion(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTaskReturnValue.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, (getHighestVersion) obj);
    }
}
