package com.scb.phone.view.fragment.ntb.selectaccount;

import android.content.Context;
import com.scb.phone.view.fragment.ntb.ekyc.EkycTermsAndConditionsFragment;
import okhttp3.internal.cache.DiskLruCache;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.onGetStartedClick;

public final class EkycProductTermConditionFragment extends EkycTermsAndConditionsFragment {
    private FragmentBuilder_BindChangeChannelStatementReviewFragment.read MediaBrowserCompat$CustomActionResultReceiver;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.read) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindChangeChannelStatementReviewFragment.read) context;
        }
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "productCode");
        onGetStartedClick.write((Object) str2, "objectiveId");
        FragmentBuilder_BindChangeChannelStatementReviewFragment.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (read != null) {
            read.IconCompatParcelizer(DiskLruCache.VERSION_1);
        }
    }

    public static final EkycProductTermConditionFragment read(String str, String str2) {
        onGetStartedClick.write((Object) str, "depositProductCode");
        onGetStartedClick.write((Object) str2, "objectiveId");
        EkycProductTermConditionFragment ekycProductTermConditionFragment = new EkycProductTermConditionFragment();
        ekycProductTermConditionFragment.setArguments(MediaBrowserCompat$CustomActionResultReceiver(str, str2));
        return ekycProductTermConditionFragment;
    }
}
