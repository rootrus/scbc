package com.scb.phone.view.fragment.ccsof;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerSelectedFragment;
import p040o.onGetStartedClick;

public final class CcSofBillPaymentInputFragment extends BillPaymentBillerSelectedFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.mCustomTransferAndPayBiller.mBackButton.setVisibility(8);
        View view2 = this.toTextView;
        onGetStartedClick.IconCompatParcelizer((Object) view2, "toTextView");
        view2.setVisibility(0);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }
}
