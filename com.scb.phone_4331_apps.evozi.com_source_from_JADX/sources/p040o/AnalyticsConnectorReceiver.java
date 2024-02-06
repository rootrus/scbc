package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p040o.AnalyticsReceiver;

/* renamed from: o.AnalyticsConnectorReceiver */
public final class AnalyticsConnectorReceiver extends remainingCapacity {
    public Double IconCompatParcelizer;
    public Double MediaBrowserCompat$CustomActionResultReceiver;
    public Double MediaBrowserCompat$ItemReceiver;
    public Double read;

    /* renamed from: o.AnalyticsConnectorReceiver$read */
    public static final class read {
        public Double IconCompatParcelizer;
        public Double MediaBrowserCompat$CustomActionResultReceiver;
        public Double MediaBrowserCompat$ItemReceiver;
        public Double read;
    }

    public /* synthetic */ AnalyticsConnectorReceiver(read read2, byte b) {
        this(read2);
    }

    private AnalyticsConnectorReceiver(read read2) {
        this.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
        this.read = read2.read;
        this.IconCompatParcelizer = read2.IconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.AnalyticsConnectorReceiver$BreadcrumbHandler */
    public final class BreadcrumbHandler extends onCrashlyticsOriginEvent {
        public boolean IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String MediaMetadataCompat;
        public final int RatingCompat;
        public final int read;

        public /* synthetic */ BreadcrumbHandler(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener, String str, String str2, String str3, String str4, int i, int i2, String str5) {
            this(crashlyticsOriginEventListener, str, str2, str3, str4, i, i2, str5, true);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private BreadcrumbHandler(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener, String str, String str2, String str3, String str4, int i, int i2, String str5, boolean z) {
            super(crashlyticsOriginEventListener, str);
            onGetStartedClick.write((Object) crashlyticsOriginEventListener, "key");
            onGetStartedClick.write((Object) str, "label");
            onGetStartedClick.write((Object) str3, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            onGetStartedClick.write((Object) str4, "errorText");
            onGetStartedClick.write((Object) str5, "regexValidate");
            this.MediaBrowserCompat$SearchResultReceiver = str2;
            this.MediaBrowserCompat$MediaItem = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str4;
            this.read = i;
            this.RatingCompat = i2;
            this.MediaMetadataCompat = str5;
            this.IconCompatParcelizer = true;
        }
    }
}
