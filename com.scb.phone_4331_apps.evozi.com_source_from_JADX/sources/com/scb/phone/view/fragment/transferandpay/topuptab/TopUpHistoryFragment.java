package com.scb.phone.view.fragment.transferandpay.topuptab;

import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.AnyTransferHistoryFragment;
import p040o.C5168qN;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.getCausedBy;
import p040o.getIExceptionResponseDeserializerKta;
import p040o.onGetStartedClick;
import p040o.setFrames;

public final class TopUpHistoryFragment extends AnyTransferHistoryFragment {
    @HmlPinActivity
    public getIExceptionResponseDeserializerKta presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final C5168qN MediaDescriptionCompat() {
        getIExceptionResponseDeserializerKta getiexceptionresponsedeserializerkta = this.presenter;
        if (getiexceptionresponsedeserializerkta == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return getiexceptionresponsedeserializerkta;
    }

    public final String MediaMetadataCompat() {
        String string = getString(R.string.auto_regen_repeat_top_up_no_history);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.auto_…repeat_top_up_no_history)");
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
        String str4 = setframes.MediaBrowserCompat$MediaItem;
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
        String str6 = setframes.MediaSessionCompat$ResultReceiverWrapper;
        if (str6 != null) {
            str3 = str6;
        }
        zsyr2kArr[4] = new ZSYR2K("service_number", str3);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("topup_regenerate_slip", zsyr2kArr);
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
        String str4 = setframes.MediaBrowserCompat$MediaItem;
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
        String str6 = setframes.MediaSessionCompat$ResultReceiverWrapper;
        if (str6 != null) {
            str3 = str6;
        }
        zsyr2kArr[4] = new ZSYR2K("service_number", str3);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("topup_repeat_transaction", zsyr2kArr);
        }
    }
}
