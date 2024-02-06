package p040o;

import p040o.MetaDataStore;
import p040o.writeUInt64NoTag;

/* renamed from: o.getLuminance */
public final /* synthetic */ class getLuminance implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getLuminance(getPosX getposx) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.MediaBrowserCompat$CustomActionResultReceiver;
        RttiJsonPassport rttiJsonPassport = (RttiJsonPassport) obj;
        MetaDataStore.C36551 r1 = getposx.IconCompatParcelizer;
        boolean z = true;
        r1.MediaBrowserCompat$ItemReceiver = !r1.MediaBrowserCompat$ItemReceiver;
        if (getposx.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver) {
            gzipInputStream gzipinputstream = getposx.IconCompatParcelizer.IconCompatParcelizer;
            onGetStartedClick.write((Object) "", "<set-?>");
            gzipinputstream.MediaBrowserCompat$CustomActionResultReceiver = "";
            getposx.IconCompatParcelizer.MediaBrowserCompat$MediaItem = false;
            rttiJsonPassport.write(1);
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
