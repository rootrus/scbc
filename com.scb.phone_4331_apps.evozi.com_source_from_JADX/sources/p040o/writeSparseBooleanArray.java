package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.hml.C5993x5a636e5f;

/* renamed from: o.writeSparseBooleanArray */
public final /* synthetic */ class writeSparseBooleanArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C5993x5a636e5f MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ writeSparseBooleanArray(C5993x5a636e5f hmlNTBAdditionalDocumentInputFragment$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$ItemReceiver = hmlNTBAdditionalDocumentInputFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$ItemReceiver.write.IconCompatParcelizer((removeListener) ((SingleDataEntity) obj).getData());
    }
}
