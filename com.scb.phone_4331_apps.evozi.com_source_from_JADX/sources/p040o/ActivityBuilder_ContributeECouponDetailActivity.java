package p040o;

import com.scb.phone.view.fragment.loan.LoanDetailFragment;
import p040o.Futures;

/* renamed from: o.ActivityBuilder_ContributeECouponDetailActivity */
public final /* synthetic */ class ActivityBuilder_ContributeECouponDetailActivity implements FragmentBuilder_BindBillPaymentReviewFragment {
    private final /* synthetic */ LoanDetailFragment IconCompatParcelizer;
    private final /* synthetic */ Futures.C34051 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeECouponDetailActivity(LoanDetailFragment loanDetailFragment, Futures.C34051 r2) {
        this.IconCompatParcelizer = loanDetailFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = r2;
    }

    public final void IconCompatParcelizer() {
        LoanDetailFragment loanDetailFragment = this.IconCompatParcelizer;
        Futures.C34051 r1 = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeFileStatusEvent writefilestatusevent = loanDetailFragment.loanDetailPresenter;
        registerExportHandler registerexporthandler = new registerExportHandler(r1);
        if (writefilestatusevent.RatingCompat != null) {
            registerexporthandler.IconCompatParcelizer(writefilestatusevent.RatingCompat);
        }
    }
}
