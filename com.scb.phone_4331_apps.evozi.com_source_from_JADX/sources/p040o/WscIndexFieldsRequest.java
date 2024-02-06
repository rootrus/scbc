package p040o;

import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.WscIndexFieldsRequest */
public final /* synthetic */ class WscIndexFieldsRequest implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String read;

    /* renamed from: o.WscIndexFieldsRequest$FIELD_INDEXES */
    public final /* synthetic */ class FIELD_INDEXES implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ FIELD_INDEXES(String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getMicrAmount.IconCompatParcelizer) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public /* synthetic */ WscIndexFieldsRequest(String str) {
        this.read = str;
    }

    public final boolean write(Object obj) {
        return ((InstallIdProvider) obj).MediaBrowserCompat$ItemReceiver.toLowerCase().contains(this.read.toLowerCase());
    }
}
