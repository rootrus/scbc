package p040o;

import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.loadShader */
public final /* synthetic */ class loadShader implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ColorPassThroughShader IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ loadShader(ColorPassThroughShader colorPassThroughShader, int i) {
        this.IconCompatParcelizer = colorPassThroughShader;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ColorPassThroughShader colorPassThroughShader = this.IconCompatParcelizer;
        setCvv.write write = (setCvv.write) obj;
        write.IconCompatParcelizer(colorPassThroughShader.f2688x50fd9e4a.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver));
        write.MediaBrowserCompat$ItemReceiver(ColorPassThroughShader.MediaBrowserCompat$ItemReceiver());
    }
}
