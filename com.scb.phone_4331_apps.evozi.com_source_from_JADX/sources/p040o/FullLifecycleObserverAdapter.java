package p040o;

import android.graphics.Bitmap;
import java.io.IOException;

/* renamed from: o.FullLifecycleObserverAdapter */
public final class FullLifecycleObserverAdapter implements isVisible<isHidden, Bitmap> {
    private final CheckParameters_MembersInjector IconCompatParcelizer;

    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(Object obj, onActivityResult onactivityresult) throws IOException {
        return true;
    }

    public final /* synthetic */ performOptionsMenuClosed MediaBrowserCompat$CustomActionResultReceiver(Object obj, int i, int i2, onActivityResult onactivityresult) throws IOException {
        Bitmap MediaDescriptionCompat = ((isHidden) obj).MediaDescriptionCompat();
        CheckParameters_MembersInjector checkParameters_MembersInjector = this.IconCompatParcelizer;
        if (MediaDescriptionCompat == null) {
            return null;
        }
        return new getLastCustomNonConfigurationInstance(MediaDescriptionCompat, checkParameters_MembersInjector);
    }

    public FullLifecycleObserverAdapter(CheckParameters_MembersInjector checkParameters_MembersInjector) {
        this.IconCompatParcelizer = checkParameters_MembersInjector;
    }
}
