package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentType */
public final /* synthetic */ class DocumentType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPersonalShortCuts$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

    /* renamed from: o.DocumentType$FriendDT */
    public final /* synthetic */ class FriendDT implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ FriendDT write = new FriendDT();

        private /* synthetic */ FriendDT() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((ExtractionParameters_Factory) obj).setTitle();
        }
    }

    /* renamed from: o.DocumentType$SourceServer */
    public final /* synthetic */ class SourceServer implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ SourceServer MediaBrowserCompat$CustomActionResultReceiver = new SourceServer();

        private /* synthetic */ SourceServer() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getExtractionType) obj).MediaMetadataCompat();
        }
    }

    public /* synthetic */ DocumentType(getPersonalShortCuts$MediaBrowserCompat$ItemReceiver getpersonalshortcuts_mediabrowsercompat_itemreceiver) {
        this.IconCompatParcelizer = getpersonalshortcuts_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule_GetIJsonExactionHelperRttiFactory) obj).MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write.read.MediaBrowserCompat$SearchResultReceiver());
    }
}
