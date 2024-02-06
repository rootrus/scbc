package com.scb.phone.view.activity.sme.deals;

import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewCommonActivity;
import p040o.AbstractMapBasedMultiset;
import p040o.C5162qF;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.addStringPart;
import p040o.getBottomRightCornerWidth;
import p040o.safeContains;
import p040o.safeContains$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.standardStartAndWait;

public class DealsBuyReviewActivity extends ReviewCommonActivity implements getBottomRightCornerWidth {
    @HmlPinActivity
    public C5162qF dealsReviewPresenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dealsReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        C5162qF qFVar = this.dealsReviewPresenter;
        addStringPart addstringpart = new addStringPart(qFVar);
        if (qFVar.RatingCompat != null) {
            addstringpart.IconCompatParcelizer(qFVar.RatingCompat);
        }
        this.scbAnalytics.write("billpay_review", new ZSYR2K("source", "sme_deal"), new ZSYR2K("subtype", "deals"));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo13826x50fd9e4a() {
        return getString(R.string.deal_review_bill_payment_title);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        C5162qF qFVar = this.dealsReviewPresenter;
        if (qFVar.RatingCompat != null) {
            qFVar.RatingCompat.AlertController$RecycleListView();
        }
        AbstractMapBasedMultiset abstractMapBasedMultiset = qFVar.IconCompatParcelizer;
        safeContains$MediaBrowserCompat$CustomActionResultReceiver write = safeContains.write();
        write.IconCompatParcelizer = qFVar.f2925x50fd9e4a.IconCompatParcelizer.IconCompatParcelizer().setChecked;
        abstractMapBasedMultiset.IconCompatParcelizer(new safeContains(write, (byte) 0));
        qFVar.IconCompatParcelizer.IconCompatParcelizer(new C5162qF.write(qFVar, (byte) 0));
    }

    public final void write(standardStartAndWait standardstartandwait) {
        DealsSuccessActivity.IconCompatParcelizer(this, standardstartandwait);
    }

    public final void write() {
        finish();
    }
}
