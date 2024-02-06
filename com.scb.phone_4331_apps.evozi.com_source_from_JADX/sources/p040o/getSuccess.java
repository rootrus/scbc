package p040o;

import java.util.NoSuchElementException;
import p040o.StandardTable;
import p040o.addBarCodeFoundEventListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSuccess */
public final /* synthetic */ class getSuccess implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ addBarCodeFoundEventListener.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ isSupportFragmentClass write;

    public /* synthetic */ getSuccess(addBarCodeFoundEventListener.IconCompatParcelizer iconCompatParcelizer, isSupportFragmentClass issupportfragmentclass) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.write = issupportfragmentclass;
    }

    public final void IconCompatParcelizer(Object obj) {
        addBarCodeFoundEventListener.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        isSupportFragmentClass issupportfragmentclass = this.write;
        getCheckUsabilityData$MediaBrowserCompat$ItemReceiver getcheckusabilitydata_mediabrowsercompat_itemreceiver = (getCheckUsabilityData$MediaBrowserCompat$ItemReceiver) obj;
        StandardTable.C38192 unused = addBarCodeFoundEventListener.this.MediaMetadataCompat;
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            getcheckusabilitydata_mediabrowsercompat_itemreceiver.write(StandardTable.C38192.MediaBrowserCompat$CustomActionResultReceiver((getPhoneNumber) t));
            return;
        }
        throw new NoSuchElementException("No value present");
    }
}
