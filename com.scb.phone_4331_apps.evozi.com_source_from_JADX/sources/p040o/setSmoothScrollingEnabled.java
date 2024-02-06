package p040o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.ViewOverlayApi14;

/* renamed from: o.setSmoothScrollingEnabled */
public class setSmoothScrollingEnabled extends ViewOverlayApi14 implements CheckCaptureModule_RttiExceptionResponseDeserializer_Factory {
    public setSmoothScrollingEnabled(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    public static setSmoothScrollingEnabled MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup) {
        return (setSmoothScrollingEnabled) ViewOverlayApi14.MediaBrowserCompat$ItemReceiver(viewGroup);
    }

    public void IconCompatParcelizer(View view) {
        this.write.IconCompatParcelizer(view);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        this.write.write(view);
    }
}
