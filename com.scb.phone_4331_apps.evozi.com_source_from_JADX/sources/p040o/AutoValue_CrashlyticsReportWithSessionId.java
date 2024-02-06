package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p040o.AnalyticsReceiver;

/* renamed from: o.AutoValue_CrashlyticsReportWithSessionId */
public final class AutoValue_CrashlyticsReportWithSessionId extends onCrashlyticsOriginEvent {
    public final String IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final int MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public String RatingCompat;
    public boolean read;

    public /* synthetic */ AutoValue_CrashlyticsReportWithSessionId(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener, String str, String str2, String str3, String str4, int i, int i2, String str5) {
        this(crashlyticsOriginEventListener, str, str2, str3, str4, 2, i2, str5, false, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AutoValue_CrashlyticsReportWithSessionId(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener, String str, String str2, String str3, String str4, int i, int i2, String str5, boolean z, boolean z2) {
        super(crashlyticsOriginEventListener, str);
        onGetStartedClick.write((Object) crashlyticsOriginEventListener, "key");
        onGetStartedClick.write((Object) str, "label");
        onGetStartedClick.write((Object) str3, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        onGetStartedClick.write((Object) str4, "errorText");
        onGetStartedClick.write((Object) str5, "regexValidate");
        this.MediaBrowserCompat$MediaItem = str2;
        this.RatingCompat = str3;
        this.IconCompatParcelizer = str4;
        this.MediaMetadataCompat = i;
        this.MediaBrowserCompat$SearchResultReceiver = i2;
        this.MediaDescriptionCompat = str5;
        this.read = false;
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
    }
}
