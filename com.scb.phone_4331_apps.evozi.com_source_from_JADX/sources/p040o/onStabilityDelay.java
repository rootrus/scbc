package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.onStabilityDelay */
public final /* synthetic */ class onStabilityDelay implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX read;

    public /* synthetic */ onStabilityDelay(getPosX getposx) {
        this.read = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.read;
        getposx.read = "CURRENT";
        ((RttiJsonPassport) obj).MediaBrowserCompat$CustomActionResultReceiver(getposx.IconCompatParcelizer.IconCompatParcelizer, getposx.read);
    }
}
