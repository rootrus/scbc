package p040o;

import p040o.FloatingActionButton;

/* renamed from: o.Flags */
public final /* synthetic */ class Flags implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ FloatingActionButton.Behavior MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ Flags(FloatingActionButton.Behavior behavior, String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = behavior;
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public final Object write(Object obj) {
        DebitCardCoachMarkActivity write = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.write(new getActivityType((String) obj, this.read, this.MediaBrowserCompat$CustomActionResultReceiver));
        DebitCardResetOtpActivity just = DebitCardResetOtpActivity.just(Boolean.TRUE);
        HmlLatestPersonalInformationDeepLinkActivity.write(just, "next is null");
        return new lambda$showFloatingButton$1$NTBBankingServiceActivity(write, just);
    }
}
