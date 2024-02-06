package p040o;

import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.RemittanceGetStartDeepLinkActivity */
public final class RemittanceGetStartDeepLinkActivity extends DebitCardCoachMarkActivity {
    final DebitCardMarketConductDeepLinkActivity<? super Throwable> IconCompatParcelizer;
    final DataPrivacyManagementDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    final DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> MediaBrowserCompat$ItemReceiver;
    final DataPrivacyManagementDeepLinkActivity MediaDescriptionCompat;
    private DebitCardProductCatalogActivity MediaMetadataCompat;
    final DataPrivacyManagementDeepLinkActivity read;
    final DataPrivacyManagementDeepLinkActivity write;

    public RemittanceGetStartDeepLinkActivity(DebitCardProductCatalogActivity debitCardProductCatalogActivity, DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity3, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity4) {
        this.MediaMetadataCompat = debitCardProductCatalogActivity;
        this.MediaBrowserCompat$ItemReceiver = debitCardMarketConductDeepLinkActivity;
        this.IconCompatParcelizer = debitCardMarketConductDeepLinkActivity2;
        this.read = dataPrivacyManagementDeepLinkActivity;
        this.MediaDescriptionCompat = dataPrivacyManagementDeepLinkActivity2;
        this.write = dataPrivacyManagementDeepLinkActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = dataPrivacyManagementDeepLinkActivity4;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        this.MediaMetadataCompat.IconCompatParcelizer(new IconCompatParcelizer(debitCardRequestInputActivity));
    }

    /* renamed from: o.RemittanceGetStartDeepLinkActivity$IconCompatParcelizer */
    final class IconCompatParcelizer implements DebitCardRequestInputActivity, BulkTransferDeepLinkActivity {
        private DebitCardRequestInputActivity MediaBrowserCompat$CustomActionResultReceiver;
        private BulkTransferDeepLinkActivity read;

        IconCompatParcelizer(DebitCardRequestInputActivity debitCardRequestInputActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = debitCardRequestInputActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            try {
                RemittanceGetStartDeepLinkActivity.this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(bulkTransferDeepLinkActivity);
                if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.read, bulkTransferDeepLinkActivity)) {
                    this.read = bulkTransferDeepLinkActivity;
                    this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                bulkTransferDeepLinkActivity.dispose();
                this.read = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }

        public final void onError(Throwable th) {
            if (this.read == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            try {
                RemittanceGetStartDeepLinkActivity.this.IconCompatParcelizer.IconCompatParcelizer(th);
                RemittanceGetStartDeepLinkActivity.this.MediaDescriptionCompat.read();
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                th = new CompositeException(th, th2);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
            try {
                RemittanceGetStartDeepLinkActivity.this.write.read();
            } catch (Throwable th3) {
                AlertController$RecycleListView.read.write(th3);
                AlertController$RecycleListView.read.read(th3);
            }
        }

        public final void onComplete() {
            if (this.read != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                try {
                    RemittanceGetStartDeepLinkActivity.this.read.read();
                    RemittanceGetStartDeepLinkActivity.this.MediaDescriptionCompat.read();
                    this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
                    try {
                        RemittanceGetStartDeepLinkActivity.this.write.read();
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        AlertController$RecycleListView.read.read(th);
                    }
                } catch (Throwable th2) {
                    AlertController$RecycleListView.read.write(th2);
                    this.MediaBrowserCompat$CustomActionResultReceiver.onError(th2);
                }
            }
        }

        public final void dispose() {
            try {
                RemittanceGetStartDeepLinkActivity.this.MediaBrowserCompat$CustomActionResultReceiver.read();
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                AlertController$RecycleListView.read.read(th);
            }
            this.read.dispose();
        }

        public final boolean isDisposed() {
            return this.read.isDisposed();
        }
    }
}
