package p040o;

import p040o.AnalyticsReceiver;

/* renamed from: o.onRun */
public final class onRun extends onCrashlyticsOriginEvent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onRun(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener, String str) {
        super(crashlyticsOriginEventListener, str);
        onGetStartedClick.write((Object) crashlyticsOriginEventListener, "key");
        onGetStartedClick.write((Object) str, "label");
    }
}
