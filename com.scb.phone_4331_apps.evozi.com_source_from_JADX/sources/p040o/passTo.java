package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.passTo */
public final /* synthetic */ class passTo implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ generateShader read;

    public /* synthetic */ passTo(generateShader generateshader) {
        this.read = generateshader;
    }

    public final void IconCompatParcelizer(Object obj) {
        setCvv$MediaBrowserCompat$CustomActionResultReceiver setcvv_mediabrowsercompat_customactionresultreceiver = (setCvv$MediaBrowserCompat$CustomActionResultReceiver) obj;
        String str = this.read.write.f2673x50fd9e4a;
        setcvv_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver(str != null && !str.isEmpty() && str.length() == 12);
    }
}
