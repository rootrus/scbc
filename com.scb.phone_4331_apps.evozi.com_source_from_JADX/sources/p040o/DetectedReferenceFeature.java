package p040o;

import java.util.List;
import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.DetectedReferenceFeature */
public final /* synthetic */ class DetectedReferenceFeature implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ DetectedReferenceFeature IconCompatParcelizer = new DetectedReferenceFeature();

    /* renamed from: o.DetectedReferenceFeature$DetectedFeatureType */
    public final /* synthetic */ class DetectedFeatureType implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ List IconCompatParcelizer;

        public /* synthetic */ DetectedFeatureType(List list) {
            this.IconCompatParcelizer = list;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getAdditionalRightScanLinesWidth) obj).read((List<access$lambda$0>) this.IconCompatParcelizer);
        }
    }

    private /* synthetic */ DetectedReferenceFeature() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.C69271.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver();
    }
}
