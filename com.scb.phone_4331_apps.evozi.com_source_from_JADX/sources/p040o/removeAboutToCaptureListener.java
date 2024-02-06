package p040o;

import java.util.List;
import p040o.getImageWidth;
import p040o.getImageWidth.IconCompatParcelizer;

/* renamed from: o.removeAboutToCaptureListener */
public abstract class removeAboutToCaptureListener<T extends getImageWidth.IconCompatParcelizer> extends writeUInt64NoTag<T> {
    public removeAboutToCaptureListener(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<String> list) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append("\n\n");
            }
        }
        setCheckDetectionSettings setcheckdetectionsettings = new setCheckDetectionSettings(sb);
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setcheckdetectionsettings.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
