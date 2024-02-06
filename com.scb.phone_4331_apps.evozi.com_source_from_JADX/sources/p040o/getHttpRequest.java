package p040o;

import p040o.AnalyticsReceiver;

/* renamed from: o.getHttpRequest */
public final class getHttpRequest extends onCrashlyticsOriginEvent {
    public String IconCompatParcelizer;
    public String read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getHttpRequest(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener, String str, String str2, String str3) {
        super(crashlyticsOriginEventListener, str);
        onGetStartedClick.write((Object) crashlyticsOriginEventListener, "key");
        onGetStartedClick.write((Object) str, "label");
        this.read = str2;
        this.IconCompatParcelizer = str3;
    }
}
