package p040o;

import android.text.TextUtils;
import p040o.ColorPassThroughShader;
import p040o.StreetViewPanorama;

/* renamed from: o.setPreviewResoution */
public final /* synthetic */ class setPreviewResoution implements findFragmentByWho {
    private final /* synthetic */ ColorPassThroughShader.IconCompatParcelizer write;

    public /* synthetic */ setPreviewResoution(ColorPassThroughShader.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final Object IconCompatParcelizer(Object obj) {
        ColorPassThroughShader.IconCompatParcelizer iconCompatParcelizer = this.write;
        StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener = (StreetViewPanorama.OnStreetViewPanoramaLongClickListener) obj;
        offset unused = ColorPassThroughShader.this.f2688x50fd9e4a;
        boolean itemInvoker = ColorPassThroughShader.this.MediaSessionCompat$QueueItem.write.setItemInvoker();
        if (onStreetViewPanoramaLongClickListener == null) {
            return "";
        }
        String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(onStreetViewPanoramaLongClickListener.write, itemInvoker);
        String str = onStreetViewPanoramaLongClickListener.ParcelableVolumeInfo;
        String str2 = onStreetViewPanoramaLongClickListener.MediaDescriptionCompat;
        if (TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(MediaBrowserCompat$CustomActionResultReceiver);
        return sb2.toString();
    }
}
