package p040o;

import p040o.CheckParameters_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.hT */
public final /* synthetic */ class C10004hT implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setZoomOutMsg IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C10004hT(setZoomOutMsg setzoomoutmsg, String str) {
        this.IconCompatParcelizer = setzoomoutmsg;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        setZoomOutMsg setzoomoutmsg = this.IconCompatParcelizer;
        ((CheckParameters_MembersInjector.read) obj).IconCompatParcelizer(setzoomoutmsg.IconCompatParcelizer.IconCompatParcelizer(setzoomoutmsg.MediaBrowserCompat$ItemReceiver, "present", setzoomoutmsg.read.IconCompatParcelizer.AppCompatDialogFragment(), this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
