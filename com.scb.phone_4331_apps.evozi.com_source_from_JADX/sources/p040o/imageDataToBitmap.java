package p040o;

import p040o.MetaDataStore;
import p040o.writeUInt64NoTag;

/* renamed from: o.imageDataToBitmap */
public final /* synthetic */ class imageDataToBitmap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX read;

    public /* synthetic */ imageDataToBitmap(getPosX getposx) {
        this.read = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.read;
        RttiJsonPassport rttiJsonPassport = (RttiJsonPassport) obj;
        MetaDataStore.C36551 r1 = getposx.IconCompatParcelizer;
        boolean z = true;
        r1.read = !r1.read;
        if (getposx.IconCompatParcelizer.read) {
            MetaDataStore.C36551 r12 = getposx.IconCompatParcelizer;
            gzipInputStream gzipinputstream = new gzipInputStream();
            onGetStartedClick.write((Object) gzipinputstream, "<set-?>");
            r12.IconCompatParcelizer = gzipinputstream;
            gzipInputStream gzipinputstream2 = getposx.IconCompatParcelizer.IconCompatParcelizer;
            onGetStartedClick.write((Object) "", "<set-?>");
            gzipinputstream2.MediaBrowserCompat$CustomActionResultReceiver = "";
            getposx.IconCompatParcelizer.MediaBrowserCompat$MediaItem = false;
            rttiJsonPassport.write(0);
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
