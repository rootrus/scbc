package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getAsNumber */
public final /* synthetic */ class getAsNumber implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ eagerInDefaultApp MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getAsNumber(eagerInDefaultApp eagerindefaultapp) {
        this.MediaBrowserCompat$CustomActionResultReceiver = eagerindefaultapp;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getMiddleName) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
    }
}
