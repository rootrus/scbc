package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.Documents */
public final /* synthetic */ class Documents implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigureFromFile read;

    public /* synthetic */ Documents(nativeConfigureFromFile nativeconfigurefromfile) {
        this.read = nativeconfigurefromfile;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigureFromFile nativeconfigurefromfile = this.read;
        ((IdParameters.C6915a) obj).AlertController$RecycleListView();
        nativeconfigurefromfile.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        nativeconfigurefromfile.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new nativeConfigureFromFile$MediaBrowserCompat$ItemReceiver(nativeconfigurefromfile, (byte) 0));
    }
}
