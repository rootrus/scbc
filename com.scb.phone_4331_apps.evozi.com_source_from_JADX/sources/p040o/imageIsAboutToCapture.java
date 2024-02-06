package p040o;

import java.util.NoSuchElementException;
import p040o.writeUInt64NoTag;

/* renamed from: o.imageIsAboutToCapture */
public final /* synthetic */ class imageIsAboutToCapture implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C9853xbd733978 MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ isSupportFragmentClass read;

    public /* synthetic */ imageIsAboutToCapture(C9853xbd733978 addbarcodefoundeventlistener_mediabrowsercompat_customactionresultreceiver, isSupportFragmentClass issupportfragmentclass) {
        this.MediaBrowserCompat$ItemReceiver = addbarcodefoundeventlistener_mediabrowsercompat_customactionresultreceiver;
        this.read = issupportfragmentclass;
    }

    public final void IconCompatParcelizer(Object obj) {
        C9853xbd733978 addbarcodefoundeventlistener_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        isSupportFragmentClass issupportfragmentclass = this.read;
        getCheckUsabilityData$MediaBrowserCompat$ItemReceiver getcheckusabilitydata_mediabrowsercompat_itemreceiver = (getCheckUsabilityData$MediaBrowserCompat$ItemReceiver) obj;
        valueIteratorImpl unused = addbarcodefoundeventlistener_mediabrowsercompat_customactionresultreceiver.write.MediaDescriptionCompat;
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            getcheckusabilitydata_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver(valueIteratorImpl.IconCompatParcelizer((getAddress) t));
            return;
        }
        throw new NoSuchElementException("No value present");
    }
}
