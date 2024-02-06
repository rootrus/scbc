package p040o;

import com.scb.phone.view.fragment.demo.ntb.NTBBankingServiceFragment;

/* renamed from: o.deleteDocument */
public final /* synthetic */ class deleteDocument implements Runnable {
    private final /* synthetic */ NTBBankingServiceFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ deleteDocument(NTBBankingServiceFragment nTBBankingServiceFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nTBBankingServiceFragment;
    }

    public final void run() {
        averageLightness averagelightness = this.MediaBrowserCompat$CustomActionResultReceiver.bankingServicePresenter;
        zzwi write = averagelightness.write.read.write();
        if (write != null && write.f3005x50fd9e4a != null && write.f3005x50fd9e4a.IconCompatParcelizer != null && write.f3005x50fd9e4a.IconCompatParcelizer.length() != 0) {
            Values values = new Values(averagelightness, write.f3005x50fd9e4a.IconCompatParcelizer);
            if (averagelightness.RatingCompat != null) {
                values.IconCompatParcelizer(averagelightness.RatingCompat);
            }
        }
    }
}
