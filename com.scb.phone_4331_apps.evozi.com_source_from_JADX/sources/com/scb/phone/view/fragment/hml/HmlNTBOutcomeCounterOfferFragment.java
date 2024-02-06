package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.hml.HmlNTBSelectedOfferReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CrashlyticsController;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBOutcomeCounterOfferFragment extends HmlOutcomeCounterOfferFragment {
    public static final C6000xa959713a MediaBrowserCompat$CustomActionResultReceiver = new C6000xa959713a((byte) 0);

    /* access modifiers changed from: protected */
    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return "ntb";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        setSplitBackground();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsController.C322720 r5) {
        onGetStartedClick.write((Object) r5, "display");
        HmlNTBSelectedOfferReviewActivity.read read = HmlNTBSelectedOfferReviewActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) r5, "display");
        Intent intent = new Intent(requireContext, HmlNTBSelectedOfferReviewActivity.class);
        intent.putExtra("SELECTED_OFFER_REVIEW", r5);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(requireContext, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(requireContext.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            requireContext.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
