package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.PlanetScbCardDeepLinkActivity */
public final class PlanetScbCardDeepLinkActivity extends DebitCardCoachMarkActivity {
    private DataPrivacyManagementDeepLinkActivity IconCompatParcelizer;

    public PlanetScbCardDeepLinkActivity(DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        this.IconCompatParcelizer = dataPrivacyManagementDeepLinkActivity;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        Runnable runnable = HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
        CreditCardServiceDefaultCardDeepLinkActivity creditCardServiceDefaultCardDeepLinkActivity = new CreditCardServiceDefaultCardDeepLinkActivity(runnable);
        debitCardRequestInputActivity.onSubscribe(creditCardServiceDefaultCardDeepLinkActivity);
        try {
            this.IconCompatParcelizer.read();
            if (!creditCardServiceDefaultCardDeepLinkActivity.isDisposed()) {
                debitCardRequestInputActivity.onComplete();
            }
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            if (!creditCardServiceDefaultCardDeepLinkActivity.isDisposed()) {
                debitCardRequestInputActivity.onError(th);
            } else {
                AlertController$RecycleListView.read.read(th);
            }
        }
    }
}
