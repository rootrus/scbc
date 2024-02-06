package p040o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: o.NestedScrollView */
public class NestedScrollView implements CheckCaptureModule_RttiExceptionResponseDeserializer_Factory {
    private final ViewGroupOverlay IconCompatParcelizer;

    public NestedScrollView(ViewGroup viewGroup) {
        this.IconCompatParcelizer = viewGroup.getOverlay();
    }

    public void IconCompatParcelizer(View view) {
        this.IconCompatParcelizer.add(view);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        this.IconCompatParcelizer.remove(view);
    }
}
