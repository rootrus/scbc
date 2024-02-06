package p040o;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.CustomCheckboxView_ViewBinding */
public final class CustomCheckboxView_ViewBinding {
    private static final AtomicReference<CustomCheckboxView_ViewBinding> read = new AtomicReference<>();
    private final CameraApi2$CameraHardwareNotSupportException MediaBrowserCompat$ItemReceiver = new setBorderAnimationListener(Looper.getMainLooper());

    private CustomCheckboxView_ViewBinding() {
        setHideChildrenWhenUnchecked.MediaBrowserCompat$CustomActionResultReceiver().IconCompatParcelizer();
    }

    public static CameraApi2$CameraHardwareNotSupportException write() {
        CustomCheckboxView_ViewBinding customCheckboxView_ViewBinding;
        do {
            customCheckboxView_ViewBinding = read.get();
            if (customCheckboxView_ViewBinding != null) {
                break;
            }
            customCheckboxView_ViewBinding = new CustomCheckboxView_ViewBinding();
        } while (!read.compareAndSet((Object) null, customCheckboxView_ViewBinding));
        return customCheckboxView_ViewBinding.MediaBrowserCompat$ItemReceiver;
    }
}
