package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory */
public final /* synthetic */ class CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getTextColor IconCompatParcelizer;
    private final /* synthetic */ boolean read;

    public /* synthetic */ CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory(getTextColor gettextcolor, boolean z) {
        this.IconCompatParcelizer = gettextcolor;
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTextColor gettextcolor = this.IconCompatParcelizer;
        ((RttiJsonPassport_MembersInjector) obj).MediaBrowserCompat$ItemReceiver(gettextcolor.write, this.read);
    }
}
