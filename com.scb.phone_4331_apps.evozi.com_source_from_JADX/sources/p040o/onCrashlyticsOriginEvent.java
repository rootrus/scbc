package p040o;

import p040o.AnalyticsReceiver;

/* renamed from: o.onCrashlyticsOriginEvent */
public abstract class onCrashlyticsOriginEvent {
    public final AnalyticsReceiver.CrashlyticsOriginEventListener MediaBrowserCompat$ItemReceiver;
    public final String write;

    private onCrashlyticsOriginEvent(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener, String str, byte b) {
        this.MediaBrowserCompat$ItemReceiver = crashlyticsOriginEventListener;
        this.write = str;
    }

    /* synthetic */ onCrashlyticsOriginEvent(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener, String str) {
        this(crashlyticsOriginEventListener, str, (byte) 0);
    }
}
