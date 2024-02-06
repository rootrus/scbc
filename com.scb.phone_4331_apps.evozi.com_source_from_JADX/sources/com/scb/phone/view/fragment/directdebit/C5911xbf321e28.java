package com.scb.phone.view.fragment.directdebit;

import android.content.DialogInterface;
import com.scb.phone.view.activity.BaseActivity;
import p040o.C5203rU;
import p040o.ZTBSV;
import p040o.onGetStartedClick;
import p040o.rU$MediaBrowserCompat$ItemReceiver;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.directdebit.DirectDebitTermsAndConditionsFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5911xbf321e28 implements DialogInterface.OnClickListener {
    private /* synthetic */ DirectDebitTermsAndConditionsFragment IconCompatParcelizer;

    C5911xbf321e28(DirectDebitTermsAndConditionsFragment directDebitTermsAndConditionsFragment) {
        this.IconCompatParcelizer = directDebitTermsAndConditionsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DirectDebitTermsAndConditionsFragment directDebitTermsAndConditionsFragment = this.IconCompatParcelizer;
        ZTBSV IconCompatParcelizer2 = DirectDebitTermsAndConditionsFragment.IconCompatParcelizer(directDebitTermsAndConditionsFragment);
        if (directDebitTermsAndConditionsFragment.getActivity() != null) {
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(((BaseActivity) directDebitTermsAndConditionsFragment.getActivity()).scbAnalytics, "direct_debit_tc");
        }
        C5203rU rUVar = this.IconCompatParcelizer.presenter;
        if (rUVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = rU$MediaBrowserCompat$ItemReceiver.read;
        if (rUVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(rUVar.RatingCompat);
        }
        dialogInterface.dismiss();
    }
}
