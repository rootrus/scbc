package p040o;

import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;

/* renamed from: o.toSoapObjectForWscRequest */
public final /* synthetic */ class toSoapObjectForWscRequest implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ ScbsAccountDetailPresenter write;

    public /* synthetic */ toSoapObjectForWscRequest(ScbsAccountDetailPresenter scbsAccountDetailPresenter) {
        this.write = scbsAccountDetailPresenter;
    }

    public final void IconCompatParcelizer(Object obj) {
        ScbsAccountDetailPresenter scbsAccountDetailPresenter = this.write;
        Throwable th = (Throwable) obj;
        getPartNumber getpartnumber = getPartNumber.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (scbsAccountDetailPresenter.RatingCompat != null) {
            getpartnumber.IconCompatParcelizer(scbsAccountDetailPresenter.RatingCompat);
        }
        setDocumentNote setdocumentnote = new setDocumentNote(scbsAccountDetailPresenter, th);
        if (scbsAccountDetailPresenter.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setdocumentnote.IconCompatParcelizer(scbsAccountDetailPresenter.RatingCompat);
        }
    }
}
