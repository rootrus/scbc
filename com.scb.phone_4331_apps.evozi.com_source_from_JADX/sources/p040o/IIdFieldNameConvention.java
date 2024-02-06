package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.IIdFieldNameConvention */
public final class IIdFieldNameConvention extends writeUInt64NoTag<CheckCaptureModule_GetIExtractionServerRttiFactory> {

    /* renamed from: o.IIdFieldNameConvention$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule_GetIExtractionServerRttiFactory> {
        private /* synthetic */ standardStartAndWait MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(standardStartAndWait standardstartandwait) {
            this.MediaBrowserCompat$ItemReceiver = standardstartandwait;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CheckCaptureModule_GetIExtractionServerRttiFactory) obj).read(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public IIdFieldNameConvention(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
