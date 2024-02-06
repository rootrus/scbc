package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.removeCameraEventListeners */
public final /* synthetic */ class removeCameraEventListeners implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ persistEvent MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getTextColor read;

    public /* synthetic */ removeCameraEventListeners(getTextColor gettextcolor, persistEvent persistevent) {
        this.read = gettextcolor;
        this.MediaBrowserCompat$ItemReceiver = persistevent;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTextColor gettextcolor = this.read;
        persistEvent persistevent = this.MediaBrowserCompat$ItemReceiver;
        RttiJsonPassport_MembersInjector rttiJsonPassport_MembersInjector = (RttiJsonPassport_MembersInjector) obj;
        boolean shortcut = gettextcolor.read.MediaBrowserCompat$CustomActionResultReceiver.setShortcut();
        rttiJsonPassport_MembersInjector.write(!shortcut);
        rttiJsonPassport_MembersInjector.read(persistevent);
        if (shortcut) {
            boolean z = false;
            CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory captureAnimationsModule_ProvideIISelfieOverlayViewFactory = new CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory(gettextcolor, false);
            if (gettextcolor.RatingCompat != null) {
                z = true;
            }
            if (z) {
                captureAnimationsModule_ProvideIISelfieOverlayViewFactory.IconCompatParcelizer(gettextcolor.RatingCompat);
            }
        }
    }
}
