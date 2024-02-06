package p040o;

import java.util.TimeZone;

/* renamed from: o.PrepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver */
class C7001xbc5e5929 {
    TimeZone MediaBrowserCompat$CustomActionResultReceiver;
    int read;

    C7001xbc5e5929(TimeZone timeZone, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = timeZone;
        this.read = z ? timeZone.getDSTSavings() : 0;
    }
}
