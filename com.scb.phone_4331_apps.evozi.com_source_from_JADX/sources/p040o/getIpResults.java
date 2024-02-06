package p040o;

import p040o.getCropTetragon;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIpResults */
public final /* synthetic */ class getIpResults implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCropTetragon.read MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getIpResults(getCropTetragon.read read) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer((getMicrAmount.RatingCompat) obj);
    }
}
