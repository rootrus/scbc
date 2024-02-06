package p040o;

import java.util.List;
import p040o.AnalyticsReceiver;

/* renamed from: o.AppData */
public final class AppData extends onCrashlyticsOriginEvent {
    public final List<String> IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public String RatingCompat;
    public final List<String> read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppData(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener, String str, String str2, List<String> list, List<String> list2, String str3) {
        super(crashlyticsOriginEventListener, str);
        onGetStartedClick.write((Object) crashlyticsOriginEventListener, "key");
        onGetStartedClick.write((Object) str, "label");
        onGetStartedClick.write((Object) list, "rawValues");
        onGetStartedClick.write((Object) list2, "displayValues");
        onGetStartedClick.write((Object) str3, "selectedKey");
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = list;
        this.read = list2;
        this.RatingCompat = str3;
    }
}
