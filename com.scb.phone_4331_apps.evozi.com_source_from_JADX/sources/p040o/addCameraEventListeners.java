package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.addCameraEventListeners */
public final /* synthetic */ class addCameraEventListeners implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getTextColor read;

    public /* synthetic */ addCameraEventListeners(getTextColor gettextcolor) {
        this.read = gettextcolor;
    }

    public final void IconCompatParcelizer(Object obj) {
        RttiJsonPassport_MembersInjector rttiJsonPassport_MembersInjector = (RttiJsonPassport_MembersInjector) obj;
        if (!this.read.read.MediaBrowserCompat$CustomActionResultReceiver.setShortcut()) {
            rttiJsonPassport_MembersInjector.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            rttiJsonPassport_MembersInjector.write();
        }
    }
}
