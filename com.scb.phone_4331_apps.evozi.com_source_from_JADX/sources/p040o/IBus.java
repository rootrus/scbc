package p040o;

import p040o.C4121bx;
import p040o.RttiJsonBill_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.IBus */
public final /* synthetic */ class IBus implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4121bx.C41221 IconCompatParcelizer;
    private final /* synthetic */ RttiJsonBill_MembersInjector.read.C10785read MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ zoomIn MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ IBus(C4121bx.C41221 r1, zoomIn zoomin, RttiJsonBill_MembersInjector.read.C10785read read) {
        this.IconCompatParcelizer = r1;
        this.MediaBrowserCompat$ItemReceiver = zoomin;
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4121bx.C41221 r0 = this.IconCompatParcelizer;
        zoomIn zoomin = this.MediaBrowserCompat$ItemReceiver;
        RttiJsonBill_MembersInjector.read.C10785read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        getVariant getvariant = (getVariant) obj;
        checkNotClosed MediaBrowserCompat$CustomActionResultReceiver2 = C4121bx.this.IconCompatParcelizer;
        onGetStartedClick.write((Object) zoomin, "model");
        getInstallationUuid getinstallationuuid = new getInstallationUuid();
        getinstallationuuid.write = MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer("dd MMM yyyy - HH:mm", zoomin.read);
        getinstallationuuid.MediaBrowserCompat$ItemReceiver = zoomin.IconCompatParcelizer;
        getvariant.aj_();
        if (RttiJsonBill_MembersInjector.read.C10785read.COMPLETED == read) {
            getvariant.IconCompatParcelizer(getinstallationuuid.write, getinstallationuuid.MediaBrowserCompat$ItemReceiver);
        } else if (RttiJsonBill_MembersInjector.read.C10785read.REJECTED == read) {
            getvariant.read();
        }
    }
}
