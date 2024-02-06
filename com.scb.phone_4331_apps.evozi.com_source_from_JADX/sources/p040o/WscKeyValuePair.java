package p040o;

/* renamed from: o.WscKeyValuePair */
public final /* synthetic */ class WscKeyValuePair implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String IconCompatParcelizer;

    /* renamed from: o.WscKeyValuePair$FIELD_INDEXES */
    public final /* synthetic */ class FIELD_INDEXES implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ FIELD_INDEXES(String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final boolean write(Object obj) {
            return ((InstallIdProvider) obj).MediaBrowserCompat$ItemReceiver.toLowerCase().contains(this.MediaBrowserCompat$CustomActionResultReceiver.toLowerCase());
        }
    }

    public /* synthetic */ WscKeyValuePair(String str) {
        this.IconCompatParcelizer = str;
    }

    public final boolean write(Object obj) {
        return ((InstallIdProvider) obj).MediaBrowserCompat$ItemReceiver.toLowerCase().contains(this.IconCompatParcelizer.toLowerCase());
    }
}
