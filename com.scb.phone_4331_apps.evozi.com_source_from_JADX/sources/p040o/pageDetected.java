package p040o;

import p040o.MetaDataStore;
import p040o.writeUInt64NoTag;

/* renamed from: o.pageDetected */
public final /* synthetic */ class pageDetected implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX IconCompatParcelizer;

    public /* synthetic */ pageDetected(getPosX getposx) {
        this.IconCompatParcelizer = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.IconCompatParcelizer;
        RttiJsonPassport rttiJsonPassport = (RttiJsonPassport) obj;
        MetaDataStore.C36551 r1 = getposx.IconCompatParcelizer;
        boolean z = true;
        r1.ParcelableVolumeInfo = !r1.ParcelableVolumeInfo;
        if (getposx.IconCompatParcelizer.ParcelableVolumeInfo) {
            MetaDataStore.C36551 r12 = getposx.IconCompatParcelizer;
            gzipInputStream gzipinputstream = new gzipInputStream();
            onGetStartedClick.write((Object) gzipinputstream, "<set-?>");
            r12.MediaSessionCompat$QueueItem = gzipinputstream;
            gzipInputStream gzipinputstream2 = getposx.IconCompatParcelizer.MediaSessionCompat$QueueItem;
            onGetStartedClick.write((Object) "", "<set-?>");
            gzipinputstream2.MediaBrowserCompat$CustomActionResultReceiver = "";
            getposx.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = false;
            getposx.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = false;
            rttiJsonPassport.MediaBrowserCompat$CustomActionResultReceiver(0);
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
