package p040o;

import java.util.List;
import p040o.CrashlyticsCore;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.WscRequest */
public final /* synthetic */ class WscRequest implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getDocumentNote$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.WscRequest$FIELD_INDEXES */
    public final /* synthetic */ class FIELD_INDEXES implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ List IconCompatParcelizer;

        public /* synthetic */ FIELD_INDEXES(List list) {
            this.IconCompatParcelizer = list;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getMicrAmount$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
        }
    }

    public /* synthetic */ WscRequest(getDocumentNote$MediaBrowserCompat$ItemReceiver getdocumentnote_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getdocumentnote_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        CrashlyticsCore.C32441 unused = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        ((getMicrAmount.IconCompatParcelizer) obj).read();
    }
}
