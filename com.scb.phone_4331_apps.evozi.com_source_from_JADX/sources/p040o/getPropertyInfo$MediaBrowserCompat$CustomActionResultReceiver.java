package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.getPropertyInfo$MediaBrowserCompat$CustomActionResultReceiver */
public final class getPropertyInfo$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule.C6974a> {
    private /* synthetic */ listCompleteSessionFiles MediaBrowserCompat$ItemReceiver;

    public getPropertyInfo$MediaBrowserCompat$CustomActionResultReceiver(listCompleteSessionFiles listcompletesessionfiles) {
        this.MediaBrowserCompat$ItemReceiver = listcompletesessionfiles;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.C6974a) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
