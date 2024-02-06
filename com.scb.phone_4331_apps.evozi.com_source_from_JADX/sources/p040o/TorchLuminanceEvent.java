package p040o;

import p040o.MetaDataStore;
import p040o.writeUInt64NoTag;

/* renamed from: o.TorchLuminanceEvent */
public final /* synthetic */ class TorchLuminanceEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX write;

    public /* synthetic */ TorchLuminanceEvent(getPosX getposx) {
        this.write = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.write;
        RttiJsonPassport rttiJsonPassport = (RttiJsonPassport) obj;
        MetaDataStore.C36551 r1 = getposx.IconCompatParcelizer;
        boolean z = true;
        r1.MediaDescriptionCompat = !r1.MediaDescriptionCompat;
        if (getposx.IconCompatParcelizer.MediaDescriptionCompat) {
            rttiJsonPassport.IconCompatParcelizer(0);
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
