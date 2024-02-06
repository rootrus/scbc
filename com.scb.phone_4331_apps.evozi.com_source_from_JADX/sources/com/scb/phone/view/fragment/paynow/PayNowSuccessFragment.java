package com.scb.phone.view.fragment.paynow;

import android.os.Bundle;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import java.util.List;
import p040o.getUserId;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class PayNowSuccessFragment extends PurchaseSuccessFragment {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        standardStartAndWait standardstartandwait;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (standardstartandwait = (standardStartAndWait) arguments.getParcelable("EXTRA_PAY_NOW_SUCCESS_DISPLAY")) != null) {
            this.presenter.read(standardstartandwait, (List<getUserId>) null);
            onGetStartedClick.IconCompatParcelizer((Object) standardstartandwait, "it");
            if (standardstartandwait.MediaBrowserCompat$MediaItem) {
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("outward_remittance_pp_eslip");
                }
            } else if (getActivity() != null) {
                ((BaseActivity) getActivity()).mo13676d_("outward_remittance_pp_request_successful");
            }
        }
    }

    public final void onDestroyView() {
        this.presenter.onDestroy();
        super.onDestroyView();
    }
}
