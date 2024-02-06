package com.scb.phone.view.fragment.transferandpay.transfer;

import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.AnyTransferHistoryFragment;
import p040o.C5168qN;
import p040o.HmlPinActivity;
import p040o.KtaBillExtractor_Factory;
import p040o.ZSYR2K;
import p040o.getICheckDeserializerRtti;
import p040o.onGetStartedClick;
import p040o.setFrames;

public final class TransferHistoryFragment extends AnyTransferHistoryFragment {
    @HmlPinActivity
    public KtaBillExtractor_Factory presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final C5168qN MediaDescriptionCompat() {
        KtaBillExtractor_Factory ktaBillExtractor_Factory = this.presenter;
        if (ktaBillExtractor_Factory == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return ktaBillExtractor_Factory;
    }

    public final String MediaMetadataCompat() {
        String string = getString(R.string.auto_regen_repeat_transfer_tab_history_empty_state_message);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.auto_…tory_empty_state_message)");
        return string;
    }

    public final void MediaBrowserCompat$ItemReceiver(setFrames setframes) {
        onGetStartedClick.write((Object) setframes, "historyTransactionDisplay");
        ZSYR2K[] zsyr2kArr = new ZSYR2K[5];
        String str = setframes.MediaSessionCompat$Token;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        zsyr2kArr[0] = new ZSYR2K("date_time", str);
        String str3 = setframes.MediaSessionCompat$ResultReceiverWrapper;
        if (str3 == null) {
            str3 = str2;
        }
        zsyr2kArr[1] = new ZSYR2K("account_from", str3);
        String str4 = setframes.write;
        if (str4 == null) {
            str4 = str2;
        }
        zsyr2kArr[2] = new ZSYR2K("bank_name", str4);
        String IconCompatParcelizer = getICheckDeserializerRtti.IconCompatParcelizer(true, false, setframes.read);
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = str2;
        }
        zsyr2kArr[3] = new ZSYR2K("account_to", IconCompatParcelizer);
        String str5 = setframes.MediaBrowserCompat$ItemReceiver;
        if (str5 != null) {
            str2 = str5;
        }
        zsyr2kArr[4] = new ZSYR2K("amount", str2);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("transfer_regenerate_slip", zsyr2kArr);
        }
    }

    public final void IconCompatParcelizer(setFrames setframes) {
        onGetStartedClick.write((Object) setframes, "historyTransactionDisplay");
        ZSYR2K[] zsyr2kArr = new ZSYR2K[5];
        String str = setframes.MediaSessionCompat$Token;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        zsyr2kArr[0] = new ZSYR2K("date_time", str);
        String str3 = setframes.MediaSessionCompat$ResultReceiverWrapper;
        if (str3 == null) {
            str3 = str2;
        }
        zsyr2kArr[1] = new ZSYR2K("account_from", str3);
        String str4 = setframes.write;
        if (str4 == null) {
            str4 = str2;
        }
        zsyr2kArr[2] = new ZSYR2K("bank_name", str4);
        String IconCompatParcelizer = getICheckDeserializerRtti.IconCompatParcelizer(true, false, setframes.read);
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = str2;
        }
        zsyr2kArr[3] = new ZSYR2K("account_to", IconCompatParcelizer);
        String str5 = setframes.MediaBrowserCompat$ItemReceiver;
        if (str5 != null) {
            str2 = str5;
        }
        zsyr2kArr[4] = new ZSYR2K("amount", str2);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("transfer_repeat_transaction", zsyr2kArr);
        }
    }
}
