package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.BarCodeCaptureView_MembersInjector */
public final /* synthetic */ class BarCodeCaptureView_MembersInjector implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ setFocusAreas read;
    private final /* synthetic */ String write;

    public /* synthetic */ BarCodeCaptureView_MembersInjector(setFocusAreas setfocusareas, String str, String str2, String str3, boolean z) {
        this.read = setfocusareas;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        setFocusAreas setfocusareas = this.read;
        ((C7172x585a5cc0) obj).write(this.IconCompatParcelizer, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, setfocusareas.MediaBrowserCompat$ItemReceiver.write, setfocusareas.MediaBrowserCompat$ItemReceiver.read, setfocusareas.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver);
    }
}
