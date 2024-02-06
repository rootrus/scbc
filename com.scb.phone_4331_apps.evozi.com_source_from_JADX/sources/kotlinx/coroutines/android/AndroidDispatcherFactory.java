package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p040o.MwPinnedSuccessActivity;
import p040o.moveCameraToCurrentLocation;
import p040o.onGetStartedClick;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public final int getLoadPriority() {
        return 1073741823;
    }

    public final String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public final moveCameraToCurrentLocation createDispatcher(List<? extends MainDispatcherFactory> list) {
        onGetStartedClick.write((Object) list, "allFactories");
        Looper mainLooper = Looper.getMainLooper();
        onGetStartedClick.IconCompatParcelizer((Object) mainLooper, "Looper.getMainLooper()");
        return new moveCameraToCurrentLocation(MwPinnedSuccessActivity.IconCompatParcelizer(mainLooper), "Main");
    }
}
