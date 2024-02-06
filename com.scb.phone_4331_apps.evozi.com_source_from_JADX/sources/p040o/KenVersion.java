package p040o;

import p040o.GoogleMap;
import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.KenVersion */
public final /* synthetic */ class KenVersion implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ createPropertyInfo IconCompatParcelizer;
    private final /* synthetic */ String read;

    public /* synthetic */ KenVersion(createPropertyInfo createpropertyinfo, String str) {
        this.IconCompatParcelizer = createpropertyinfo;
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        createPropertyInfo createpropertyinfo = this.IconCompatParcelizer;
        PassportCaptureModule.C6976c cVar = (PassportCaptureModule.C6976c) obj;
        String lowerCase = createpropertyinfo.read.read.MediaBrowserCompat$SearchResultReceiver().toString().toLowerCase();
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = createpropertyinfo.MediaBrowserCompat$ItemReceiver.write.AppCompatDelegateImpl$ListMenuDecorView();
        if (AppCompatDelegateImpl$ListMenuDecorView != null) {
            String str = AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer;
        }
        cVar.IconCompatParcelizer(lowerCase);
    }
}
