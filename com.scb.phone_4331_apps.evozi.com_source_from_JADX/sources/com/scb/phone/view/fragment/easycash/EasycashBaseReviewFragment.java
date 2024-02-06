package com.scb.phone.view.fragment.easycash;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashCreditPowerInputActivity;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.easycash.EasycashSuccessDialogFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C6389x3f85625c;
import p040o.MyECouponActivity_ViewBinding;
import p040o.dropBreadcrumb;
import p040o.onGetStartedClick;
import p040o.serializeEvent;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public abstract class EasycashBaseReviewFragment extends BreadcrumbFragment implements C6389x3f85625c, EasycashSuccessDialogFragment.read {
    @BindView
    public Button btnSubmit;
    @BindView
    public TextView disclaimerDescription;
    @BindView
    public CustomEasyCashSectionLabel disclaimerHeader;
    @BindView
    public LinearLayout sectionLayout;

    public final int ParcelableVolumeInfo() {
        return 3;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final boolean setHasDecor() {
        return true;
    }

    public final String PlaybackStateCompat() {
        String string = getString(R.string.review_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.review_title)");
        return string;
    }

    public final void MediaBrowserCompat$ItemReceiver(dropBreadcrumb dropbreadcrumb, int i) {
        onGetStartedClick.write((Object) dropbreadcrumb, "summaryItemDisplay");
        CustomEasyCashSectionLabel customEasyCashSectionLabel = new CustomEasyCashSectionLabel(getContext());
        customEasyCashSectionLabel.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        customEasyCashSectionLabel.setVisibility(0);
        customEasyCashSectionLabel.setText(dropbreadcrumb.read);
        Context context = customEasyCashSectionLabel.getContext();
        if (context != null) {
            customEasyCashSectionLabel.setBackgroundColor(setLastBaselineToBottomHeight.read(context, R.color.f66132131099768));
        }
        CustomSeparatedViews customSeparatedViews = new CustomSeparatedViews(getContext());
        customSeparatedViews.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        customSeparatedViews.MediaBrowserCompat$ItemReceiver(dropbreadcrumb.MediaBrowserCompat$ItemReceiver);
        LinearLayout linearLayout = this.sectionLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("sectionLayout");
        }
        linearLayout.addView(customEasyCashSectionLabel);
        LinearLayout linearLayout2 = this.sectionLayout;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("sectionLayout");
        }
        linearLayout2.addView(customSeparatedViews);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        CustomEasyCashSectionLabel customEasyCashSectionLabel = this.disclaimerHeader;
        if (customEasyCashSectionLabel == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("disclaimerHeader");
        }
        customEasyCashSectionLabel.setVisibility(0);
        CustomEasyCashSectionLabel customEasyCashSectionLabel2 = this.disclaimerHeader;
        if (customEasyCashSectionLabel2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("disclaimerHeader");
        }
        customEasyCashSectionLabel2.setText(str);
        TextView textView = this.disclaimerDescription;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("disclaimerDescription");
        }
        textView.setVisibility(0);
        TextView textView2 = this.disclaimerDescription;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("disclaimerDescription");
        }
        textView2.setText(str2);
    }

    public final void read(serializeEvent serializeevent) {
        onGetStartedClick.write((Object) serializeevent, "display");
        EasycashSuccessDialogFragment.write(serializeevent).show(getChildFragmentManager().read(), "dialog");
    }

    public final void MediaSessionCompat$QueueItem() {
        Intent write = EasycashCreditPowerInputActivity.write(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
    }
}
