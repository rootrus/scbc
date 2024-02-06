package p040o;

import p040o.MetaDataStore;
import p040o.writeUInt64NoTag;

/* renamed from: o.TorchLuminanceListener */
public final /* synthetic */ class TorchLuminanceListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX IconCompatParcelizer;

    public /* synthetic */ TorchLuminanceListener(getPosX getposx) {
        this.IconCompatParcelizer = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.IconCompatParcelizer;
        RttiJsonPassport rttiJsonPassport = (RttiJsonPassport) obj;
        MetaDataStore.C36551 r1 = getposx.IconCompatParcelizer;
        boolean z = true;
        r1.f2759x50fd9e4a = !r1.f2759x50fd9e4a;
        if (getposx.IconCompatParcelizer.f2759x50fd9e4a) {
            gzipInputStream gzipinputstream = getposx.IconCompatParcelizer.MediaSessionCompat$QueueItem;
            onGetStartedClick.write((Object) "", "<set-?>");
            gzipinputstream.MediaBrowserCompat$CustomActionResultReceiver = "";
            getposx.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = false;
            getposx.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = false;
            rttiJsonPassport.MediaBrowserCompat$CustomActionResultReceiver(1);
        }
        Utility utility = new Utility(getposx);
        if (getposx.RatingCompat == null) {
            z = false;
        }
        if (z) {
            utility.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
