package p040o;

import android.text.TextUtils;
import p040o.writeUInt64NoTag;

/* renamed from: o.getStabilityThreshold */
public final /* synthetic */ class getStabilityThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getVisibility write;

    public /* synthetic */ getStabilityThreshold(getVisibility getvisibility) {
        this.write = getvisibility;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getExtractionListener) obj).write(!TextUtils.isEmpty(this.write.ParcelableVolumeInfo));
    }
}
