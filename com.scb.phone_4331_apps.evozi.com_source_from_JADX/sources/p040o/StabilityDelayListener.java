package p040o;

import p040o.MetaDataStore;
import p040o.writeUInt64NoTag;

/* renamed from: o.StabilityDelayListener */
public final /* synthetic */ class StabilityDelayListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX write;

    public /* synthetic */ StabilityDelayListener(getPosX getposx) {
        this.write = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.write;
        RttiJsonPassport rttiJsonPassport = (RttiJsonPassport) obj;
        MetaDataStore.C36551 r1 = getposx.IconCompatParcelizer;
        boolean z = true;
        r1.MediaBrowserCompat$MediaItem = !r1.MediaBrowserCompat$MediaItem;
        if (getposx.IconCompatParcelizer.MediaBrowserCompat$MediaItem) {
            rttiJsonPassport.IconCompatParcelizer(2);
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
