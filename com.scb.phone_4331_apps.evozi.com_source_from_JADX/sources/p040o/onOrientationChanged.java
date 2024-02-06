package p040o;

import p040o.CheckParameters_MembersInjector;
import p040o.showRect;
import p040o.writeUInt64NoTag;

/* renamed from: o.onOrientationChanged */
public final /* synthetic */ class onOrientationChanged implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ showRect.write read;

    public /* synthetic */ onOrientationChanged(showRect.write write) {
        this.read = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters_MembersInjector.write) obj).read(this.read.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
