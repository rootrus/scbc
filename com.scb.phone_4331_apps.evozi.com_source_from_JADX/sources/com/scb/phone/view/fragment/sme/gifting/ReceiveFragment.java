package com.scb.phone.view.fragment.sme.gifting;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingOpenedActivity;
import com.scb.phone.view.adapter.sme.gifting.GiftingBaseListAdapter;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.confirmNTBReferral;
import p040o.setTapText;

public class ReceiveFragment extends GiftingFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer, confirmNTBReferral.read {
    /* access modifiers changed from: protected */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return R.string.gifts_receive_empty_msg;
    }

    /* access modifiers changed from: protected */
    public final GiftingBaseListAdapter MediaBrowserCompat$CustomActionResultReceiver(List<AutoValue_CrashlyticsReport_Session_User> list) {
        return new confirmNTBReferral(getContext(), list, this);
    }

    public final void IconCompatParcelizer(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        String str;
        if (autoValue_CrashlyticsReport_Session_User.f2682x50fd9e4a != null) {
            String str2 = "";
            if (autoValue_CrashlyticsReport_Session_User.f2682x50fd9e4a.equals("M")) {
                str = "money";
            } else {
                str = autoValue_CrashlyticsReport_Session_User.f2682x50fd9e4a.equals("P") ? "present" : str2;
            }
            if (autoValue_CrashlyticsReport_Session_User.PlaybackStateCompat$CustomAction.MediaBrowserCompat$CustomActionResultReceiver.equals("OPEN NOW")) {
                str2 = "not_open";
            } else if (autoValue_CrashlyticsReport_Session_User.PlaybackStateCompat$CustomAction.MediaBrowserCompat$CustomActionResultReceiver.equals("OPENED")) {
                str2 = "opened";
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$MediaItem)) {
                ((BaseActivity) getActivity()).scbAnalytics.write("gift_received_slip", new ZSYR2K("gift_type", str), new ZSYR2K("status", str2), new ZSYR2K("gift_id", autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$MediaItem));
            }
        }
        Intent intent = new Intent(getContext(), GiftingOpenedActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_GIFT_STATUS_SELECTED", autoValue_CrashlyticsReport_Session_User);
        intent.putExtras(bundle);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
