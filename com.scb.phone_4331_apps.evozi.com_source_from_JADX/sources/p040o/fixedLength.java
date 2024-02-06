package p040o;

import p040o.CustomConcurrentHashMap;

/* renamed from: o.fixedLength */
public final /* synthetic */ class fixedLength implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomConcurrentHashMap.EntryFactory MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ fixedLength(CustomConcurrentHashMap.EntryFactory entryFactory) {
        this.MediaBrowserCompat$ItemReceiver = entryFactory;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(Boolean.valueOf(!this.MediaBrowserCompat$ItemReceiver.write.isEmpty()));
    }
}
