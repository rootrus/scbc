package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.IpLib */
public final /* synthetic */ class IpLib implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeWriteTiffImageWithMetaData IconCompatParcelizer;
    private final /* synthetic */ finalizePreviousNativeSession MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ IpLib(nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata, finalizePreviousNativeSession finalizepreviousnativesession) {
        this.IconCompatParcelizer = nativewritetiffimagewithmetadata;
        this.MediaBrowserCompat$CustomActionResultReceiver = finalizepreviousnativesession;
    }

    /* renamed from: o.IpLib$ProcessingProgressClient */
    public final /* synthetic */ class ProcessingProgressClient implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ ProcessingProgressClient(boolean z) {
            this.MediaBrowserCompat$ItemReceiver = z;
        }

        public final void IconCompatParcelizer(Object obj) {
            getCountryLong getcountrylong = (getCountryLong) obj;
            if (this.MediaBrowserCompat$ItemReceiver) {
                getcountrylong.MediaBrowserCompat$SearchResultReceiver();
            } else {
                getcountrylong.write();
            }
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata = this.IconCompatParcelizer;
        finalizePreviousNativeSession finalizepreviousnativesession = this.MediaBrowserCompat$CustomActionResultReceiver;
        FieldLocation fieldLocation = (FieldLocation) obj;
        fieldLocation.read(finalizepreviousnativesession.RatingCompat, finalizepreviousnativesession.MediaBrowserCompat$MediaItem);
        fieldLocation.mo14444a_(nativewritetiffimagewithmetadata.MediaBrowserCompat$CustomActionResultReceiver());
    }
}
