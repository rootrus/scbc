package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.EdgeGuidance */
public final /* synthetic */ class EdgeGuidance implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ EdgeGuidance MediaBrowserCompat$CustomActionResultReceiver = new EdgeGuidance();

    private /* synthetic */ EdgeGuidance() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((QuickExtractorAgent) obj).MediaBrowserCompat$CustomActionResultReceiver(true);
    }

    /* renamed from: o.EdgeGuidance$EdgeType */
    public final /* synthetic */ class EdgeType implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ buildNameMap IconCompatParcelizer;
        private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ EdgeType(buildNameMap buildnamemap, boolean z) {
            this.IconCompatParcelizer = buildnamemap;
            this.MediaBrowserCompat$ItemReceiver = z;
        }

        public final void IconCompatParcelizer(Object obj) {
            buildNameMap buildnamemap = this.IconCompatParcelizer;
            boolean z = this.MediaBrowserCompat$ItemReceiver;
            QuickExtractorAgent quickExtractorAgent = (QuickExtractorAgent) obj;
            quickExtractorAgent.MediaSessionCompat$QueueItem();
            quickExtractorAgent.read(z);
            quickExtractorAgent.IconCompatParcelizer(buildnamemap.MediaDescriptionCompat());
        }
    }
}
