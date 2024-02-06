package p040o;

import p040o.MetaDataStore;
import p040o.writeUInt64NoTag;

/* renamed from: o.StabilityDelayEvent */
public final /* synthetic */ class StabilityDelayEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ StabilityDelayEvent(getPosX getposx) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.MediaBrowserCompat$CustomActionResultReceiver;
        RttiJsonPassport rttiJsonPassport = (RttiJsonPassport) obj;
        MetaDataStore.C36551 r1 = getposx.IconCompatParcelizer;
        boolean z = true;
        r1.MediaBrowserCompat$SearchResultReceiver = !r1.MediaBrowserCompat$SearchResultReceiver;
        if (getposx.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver) {
            rttiJsonPassport.IconCompatParcelizer(1);
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
