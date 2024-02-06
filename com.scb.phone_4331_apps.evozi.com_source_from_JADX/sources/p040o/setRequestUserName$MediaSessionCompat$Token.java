package p040o;

import java.util.Collection;
import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestUserName$MediaSessionCompat$Token */
public final class setRequestUserName$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor> {
    private /* synthetic */ captureEventData MediaBrowserCompat$CustomActionResultReceiver;

    public setRequestUserName$MediaSessionCompat$Token(captureEventData captureeventdata) {
        this.MediaBrowserCompat$CustomActionResultReceiver = captureeventdata;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        List<String> list;
        List<String> list2;
        PassportExtractor passportExtractor = (PassportExtractor) obj;
        captureEventData captureeventdata = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<String> list3 = null;
        if (captureeventdata != null) {
            list = captureeventdata.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            list = null;
        }
        Collection collection = list;
        boolean z = false;
        boolean z2 = collection == null || collection.isEmpty();
        captureEventData captureeventdata2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (captureeventdata2 != null) {
            list2 = captureeventdata2.MediaBrowserCompat$ItemReceiver;
        } else {
            list2 = null;
        }
        Collection collection2 = list2;
        boolean z3 = collection2 == null || collection2.isEmpty();
        captureEventData captureeventdata3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (captureeventdata3 != null) {
            list3 = captureeventdata3.write;
        }
        Collection collection3 = list3;
        if (collection3 == null || collection3.isEmpty()) {
            z = true;
        }
        passportExtractor.read(!(z2 & z3 & z));
    }
}
