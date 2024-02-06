package p040o;

import p040o.GoogleMap;
import p040o.writeUInt64NoTag;
import p040o.zzct;

/* renamed from: o.saveToFileBuffer */
public final /* synthetic */ class saveToFileBuffer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ StringBuilder IconCompatParcelizer;
    private final /* synthetic */ KofaxWebServiceObjectBase write;

    public /* synthetic */ saveToFileBuffer(KofaxWebServiceObjectBase kofaxWebServiceObjectBase, StringBuilder sb) {
        this.write = kofaxWebServiceObjectBase;
        this.IconCompatParcelizer = sb;
    }

    public final void IconCompatParcelizer(Object obj) {
        KofaxWebServiceObjectBase kofaxWebServiceObjectBase = this.write;
        C6978x206b8e03 passportCaptureModule_GetIExceptionResponseDeserializerKtaFactory = (C6978x206b8e03) obj;
        String str = kofaxWebServiceObjectBase.IconCompatParcelizer.read.MediaBrowserCompat$SearchResultReceiver() == zzct.zza.BUSINESS_OWNER ? "business_owner" : "consumer";
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = kofaxWebServiceObjectBase.MediaBrowserCompat$ItemReceiver.write.AppCompatDelegateImpl$ListMenuDecorView();
        if (AppCompatDelegateImpl$ListMenuDecorView != null) {
            String str2 = AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer;
        }
        passportCaptureModule_GetIExceptionResponseDeserializerKtaFactory.MediaBrowserCompat$CustomActionResultReceiver(str, kofaxWebServiceObjectBase.read.read.MediaBrowserCompat$SearchResultReceiver);
    }
}
