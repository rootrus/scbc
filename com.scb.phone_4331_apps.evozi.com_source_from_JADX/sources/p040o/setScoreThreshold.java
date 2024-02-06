package p040o;

import p040o.FloatingActionButton;

/* renamed from: o.setScoreThreshold */
public final /* synthetic */ class setScoreThreshold implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FloatingActionButton.Behavior IconCompatParcelizer;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ setScoreThreshold(FloatingActionButton.Behavior behavior, String str, String str2) {
        this.IconCompatParcelizer = behavior;
        this.read = str;
        this.write = str2;
    }

    public final Object write(Object obj) {
        DebitCardCoachMarkActivity IconCompatParcelizer2 = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(new getActivityType((String) obj, this.read, this.write));
        DebitCardResetOtpActivity just = DebitCardResetOtpActivity.just(Boolean.TRUE);
        HmlLatestPersonalInformationDeepLinkActivity.write(just, "next is null");
        return new lambda$showFloatingButton$1$NTBBankingServiceActivity(IconCompatParcelizer2, just);
    }
}
