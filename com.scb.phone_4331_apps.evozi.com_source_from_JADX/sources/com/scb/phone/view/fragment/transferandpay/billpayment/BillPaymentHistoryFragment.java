package com.scb.phone.view.fragment.transferandpay.billpayment;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.AnyTransferHistoryFragment;
import kotlin.TypeCastException;
import p040o.C5168qN;
import p040o.C7085x54efaba5;
import p040o.C7476su;
import p040o.HmlPinActivity;
import p040o.ServerProjectProvider$5$MediaBrowserCompat$MediaItem;
import p040o.ZSYR2K;
import p040o.getCausedBy;
import p040o.onGetStartedClick;
import p040o.setFrames;

public final class BillPaymentHistoryFragment extends AnyTransferHistoryFragment {
    @HmlPinActivity
    public C7476su presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onAttach(Context context) {
        ServerProjectProvider$5$MediaBrowserCompat$MediaItem write;
        super.onAttach(context);
        if (getParentFragment() != null && (getParentFragment() instanceof C7085x54efaba5)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                C7085x54efaba5 serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver = (C7085x54efaba5) parentFragment;
                if (serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver != null && (write = serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver.write()) != null) {
                    write.MediaBrowserCompat$CustomActionResultReceiver(new C6183xc0a9e4f2(this));
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.views.transferandpay.BillPaymentView.BillPaymentPageOnScrollListener");
        }
    }

    public final C5168qN MediaDescriptionCompat() {
        C7476su suVar = this.presenter;
        if (suVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return suVar;
    }

    public final String MediaMetadataCompat() {
        String string = getString(R.string.auto_regen_repeat_billpayment_tab_history_empty_state_message);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.auto_…tory_empty_state_message)");
        return string;
    }

    public final void MediaBrowserCompat$ItemReceiver(setFrames setframes) {
        String str;
        onGetStartedClick.write((Object) setframes, "historyTransactionDisplay");
        ZSYR2K[] zsyr2kArr = new ZSYR2K[5];
        String str2 = setframes.MediaSessionCompat$Token;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        zsyr2kArr[0] = new ZSYR2K("date_time", str2);
        String str4 = setframes.MediaSessionCompat$ResultReceiverWrapper;
        if (str4 == null) {
            str4 = str3;
        }
        zsyr2kArr[1] = new ZSYR2K("account_from", str4);
        getCausedBy getcausedby = setframes.MediaBrowserCompat$SearchResultReceiver;
        if (getcausedby != null) {
            str = getcausedby.read;
        } else {
            str = null;
        }
        if (str == null) {
            str = str3;
        }
        zsyr2kArr[2] = new ZSYR2K("biller_name", str);
        String str5 = setframes.MediaBrowserCompat$ItemReceiver;
        if (str5 == null) {
            str5 = str3;
        }
        zsyr2kArr[3] = new ZSYR2K("amount", str5);
        String str6 = setframes.MediaBrowserCompat$MediaItem;
        if (str6 != null) {
            str3 = str6;
        }
        zsyr2kArr[4] = new ZSYR2K("ref_1", str3);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("billpayment_regenerate_slip", zsyr2kArr);
        }
    }

    public final void IconCompatParcelizer(setFrames setframes) {
        String str;
        onGetStartedClick.write((Object) setframes, "historyTransactionDisplay");
        ZSYR2K[] zsyr2kArr = new ZSYR2K[5];
        String str2 = setframes.MediaSessionCompat$Token;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        zsyr2kArr[0] = new ZSYR2K("date_time", str2);
        String str4 = setframes.MediaSessionCompat$ResultReceiverWrapper;
        if (str4 == null) {
            str4 = str3;
        }
        zsyr2kArr[1] = new ZSYR2K("account_from", str4);
        getCausedBy getcausedby = setframes.MediaBrowserCompat$SearchResultReceiver;
        if (getcausedby != null) {
            str = getcausedby.read;
        } else {
            str = null;
        }
        if (str == null) {
            str = str3;
        }
        zsyr2kArr[2] = new ZSYR2K("biller_name", str);
        String str5 = setframes.MediaBrowserCompat$ItemReceiver;
        if (str5 == null) {
            str5 = str3;
        }
        zsyr2kArr[3] = new ZSYR2K("amount", str5);
        String str6 = setframes.MediaBrowserCompat$MediaItem;
        if (str6 != null) {
            str3 = str6;
        }
        zsyr2kArr[4] = new ZSYR2K("ref_1", str3);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("billpayment_repeat_transaction", zsyr2kArr);
        }
    }
}
