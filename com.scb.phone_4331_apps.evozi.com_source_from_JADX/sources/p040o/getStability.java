package p040o;

import p040o.MetaDataStore;
import p040o.writeUInt64NoTag;

/* renamed from: o.getStability */
public final /* synthetic */ class getStability implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getStability(getPosX getposx) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.MediaBrowserCompat$CustomActionResultReceiver;
        MetaDataStore.C36551 r0 = getposx.IconCompatParcelizer;
        boolean z = true;
        r0.RatingCompat = !r0.RatingCompat;
        if (getposx.IconCompatParcelizer.RatingCompat) {
            MetaDataStore.C36551 r02 = getposx.IconCompatParcelizer;
            gzipInputStream gzipinputstream = new gzipInputStream();
            onGetStartedClick.write((Object) gzipinputstream, "<set-?>");
            r02.MediaMetadataCompat = gzipinputstream;
            gzipInputStream gzipinputstream2 = getposx.IconCompatParcelizer.MediaMetadataCompat;
            onGetStartedClick.write((Object) "", "<set-?>");
            gzipinputstream2.MediaBrowserCompat$CustomActionResultReceiver = "";
            getposx.IconCompatParcelizer.f2759x50fd9e4a = false;
            getposx.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = false;
            getposx.IconCompatParcelizer.MediaDescriptionCompat = false;
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
