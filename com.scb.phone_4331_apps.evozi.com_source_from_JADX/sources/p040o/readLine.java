package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.logEvent;

/* renamed from: o.readLine */
public final class readLine extends constrainedListMultimap {
    @HmlPinActivity
    public readLine(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: o.readLine$read */
    public static final class read implements findFragmentByWho {
        private final /* synthetic */ setProfilePictureUri MediaBrowserCompat$CustomActionResultReceiver;

        private read() {
        }

        public /* synthetic */ read(setProfilePictureUri setprofilepictureuri) {
            this.MediaBrowserCompat$CustomActionResultReceiver = setprofilepictureuri;
        }

        public final Object IconCompatParcelizer(Object obj) {
            LottieListener lottieListener = (LottieListener) obj;
            logEvent.IconCompatParcelizer iconCompatParcelizer = new logEvent.IconCompatParcelizer();
            iconCompatParcelizer.write = lottieListener.MediaBrowserCompat$CustomActionResultReceiver;
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = lottieListener.write;
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = lottieListener.write;
            return new logEvent(iconCompatParcelizer, (byte) 0);
        }
    }
}
