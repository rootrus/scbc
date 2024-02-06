package p040o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.GiftingTransferLandingActivity */
public final class GiftingTransferLandingActivity implements Serializable, Comparator<SplashActivity> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        SplashActivity splashActivity = (SplashActivity) obj;
        SplashActivity splashActivity2 = (SplashActivity) obj2;
        int compareTo = splashActivity.MediaBrowserCompat$ItemReceiver().compareTo(splashActivity2.MediaBrowserCompat$ItemReceiver());
        if (compareTo == 0) {
            String MediaBrowserCompat$CustomActionResultReceiver = splashActivity.MediaBrowserCompat$CustomActionResultReceiver();
            String str = "";
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                MediaBrowserCompat$CustomActionResultReceiver = str;
            } else if (MediaBrowserCompat$CustomActionResultReceiver.indexOf(46) == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(".local");
                MediaBrowserCompat$CustomActionResultReceiver = sb.toString();
            }
            String MediaBrowserCompat$CustomActionResultReceiver2 = splashActivity2.MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                if (MediaBrowserCompat$CustomActionResultReceiver2.indexOf(46) == -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(MediaBrowserCompat$CustomActionResultReceiver2);
                    sb2.append(".local");
                    str = sb2.toString();
                } else {
                    str = MediaBrowserCompat$CustomActionResultReceiver2;
                }
            }
            compareTo = MediaBrowserCompat$CustomActionResultReceiver.compareToIgnoreCase(str);
        }
        if (compareTo != 0) {
            return compareTo;
        }
        String IconCompatParcelizer = splashActivity.IconCompatParcelizer();
        String str2 = "/";
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = str2;
        }
        String IconCompatParcelizer2 = splashActivity2.IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            str2 = IconCompatParcelizer2;
        }
        return IconCompatParcelizer.compareTo(str2);
    }
}
