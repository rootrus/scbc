package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.DetectedDocumentBoundary */
public final class DetectedDocumentBoundary extends writeUInt64NoTag<IdParameters> {

    /* renamed from: o.DetectedDocumentBoundary$DetectedBoundaryType */
    public final /* synthetic */ class DetectedBoundaryType implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ DetectedBoundaryType MediaBrowserCompat$ItemReceiver = new DetectedBoundaryType();

        private /* synthetic */ DetectedBoundaryType() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((IdParameters.C6915a) obj).setChecked();
        }
    }

    /* renamed from: o.DetectedDocumentBoundary$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IdParameters> {
        private /* synthetic */ String write;

        public read(String str) {
            this.write = str;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdParameters) obj).IconCompatParcelizer(this.write);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public DetectedDocumentBoundary(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
