package p040o;

import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaFragment;

/* renamed from: o.isAborted */
public final /* synthetic */ class isAborted implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ ScbsAccountDetailPresenter IconCompatParcelizer;

    public /* synthetic */ isAborted(ScbsAccountDetailPresenter scbsAccountDetailPresenter) {
        this.IconCompatParcelizer = scbsAccountDetailPresenter;
    }

    public final void IconCompatParcelizer(Object obj) {
        ScbsAccountDetailPresenter scbsAccountDetailPresenter = this.IconCompatParcelizer;
        StreetViewPanoramaFragment.zza zza = (StreetViewPanoramaFragment.zza) obj;
        getPartNumber getpartnumber = getPartNumber.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (scbsAccountDetailPresenter.RatingCompat != null) {
            getpartnumber.IconCompatParcelizer(scbsAccountDetailPresenter.RatingCompat);
        }
        List<CrashlyticsReport.Session.Event.Application.Execution> MediaBrowserCompat$ItemReceiver = scbsAccountDetailPresenter.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(zza.write, scbsAccountDetailPresenter.billPaymentCase.IconCompatParcelizer.setCheckable());
        if (MediaBrowserCompat$ItemReceiver != null && !MediaBrowserCompat$ItemReceiver.isEmpty()) {
            CrashlyticsReport.Session.Event.Application.Execution execution = MediaBrowserCompat$ItemReceiver.get(0);
            execution.setPopupCallback = scbsAccountDetailPresenter.read.MediaBrowserCompat$CustomActionResultReceiver;
            execution.setGroupDividerEnabled = scbsAccountDetailPresenter.read.write;
            execution.MediaMetadataCompat();
            setCancelled setcancelled = new setCancelled(execution);
            if (scbsAccountDetailPresenter.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setcancelled.IconCompatParcelizer(scbsAccountDetailPresenter.RatingCompat);
            }
        }
    }
}
