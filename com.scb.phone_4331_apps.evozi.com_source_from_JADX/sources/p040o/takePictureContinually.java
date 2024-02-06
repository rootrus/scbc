package p040o;

import android.text.TextUtils;
import p040o.writeUInt64NoTag;

/* renamed from: o.takePictureContinually */
public final /* synthetic */ class takePictureContinually implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getVisibility IconCompatParcelizer;

    public /* synthetic */ takePictureContinually(getVisibility getvisibility) {
        this.IconCompatParcelizer = getvisibility;
    }

    public final void IconCompatParcelizer(Object obj) {
        getVisibility getvisibility = this.IconCompatParcelizer;
        ((getExtractionListener) obj).write(!TextUtils.isEmpty(getvisibility.MediaSessionCompat$QueueItem) && !TextUtils.isEmpty(getvisibility.IconCompatParcelizer));
    }
}
