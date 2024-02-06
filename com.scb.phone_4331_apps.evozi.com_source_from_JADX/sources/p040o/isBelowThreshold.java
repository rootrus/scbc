package p040o;

import p040o.MetaDataStore;
import p040o.writeUInt64NoTag;

/* renamed from: o.isBelowThreshold */
public final /* synthetic */ class isBelowThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isBelowThreshold(getPosX getposx) {
        this.MediaBrowserCompat$ItemReceiver = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.MediaBrowserCompat$ItemReceiver;
        RttiJsonPassport rttiJsonPassport = (RttiJsonPassport) obj;
        MetaDataStore.C36551 r1 = getposx.IconCompatParcelizer;
        boolean z = true;
        r1.MediaBrowserCompat$CustomActionResultReceiver = !r1.MediaBrowserCompat$CustomActionResultReceiver;
        if (getposx.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) {
            gzipInputStream gzipinputstream = getposx.IconCompatParcelizer.IconCompatParcelizer;
            onGetStartedClick.write((Object) "", "<set-?>");
            gzipinputstream.MediaBrowserCompat$CustomActionResultReceiver = "";
            getposx.IconCompatParcelizer.MediaBrowserCompat$MediaItem = false;
            rttiJsonPassport.write(2);
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
