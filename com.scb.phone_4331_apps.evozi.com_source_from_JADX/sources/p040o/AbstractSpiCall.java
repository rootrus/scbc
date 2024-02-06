package p040o;

import java.util.List;
import p040o.AnalyticsReceiver;

/* renamed from: o.AbstractSpiCall */
public final class AbstractSpiCall extends onCrashlyticsOriginEvent {
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<overrideProtocolAndHost> read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractSpiCall(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener, String str, List<overrideProtocolAndHost> list, String str2) {
        super(crashlyticsOriginEventListener, str);
        onGetStartedClick.write((Object) crashlyticsOriginEventListener, "key");
        onGetStartedClick.write((Object) str, "label");
        onGetStartedClick.write((Object) list, "rawListValue");
        onGetStartedClick.write((Object) str2, "selectedKey");
        this.read = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
