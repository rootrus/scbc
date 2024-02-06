package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.processFrame */
public final /* synthetic */ class processFrame implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigureFromFile MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ processFrame(nativeConfigureFromFile nativeconfigurefromfile) {
        this.MediaBrowserCompat$ItemReceiver = nativeconfigurefromfile;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigureFromFile nativeconfigurefromfile = this.MediaBrowserCompat$ItemReceiver;
        ((IdParameters.C6915a) obj).MediaBrowserCompat$SearchResultReceiver(nativeconfigurefromfile.IconCompatParcelizer.mo26549c_("th".equalsIgnoreCase(nativeconfigurefromfile.MediaMetadataCompat.setCheckable()) ? "/ntb/ekycbutton_th.png" : "/ntb/ekycbutton_en.png"));
    }
}
