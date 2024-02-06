package com.scb.phone.view.fragment.easycash.loaninformation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;
import p040o.setImageFilePath;
import p040o.setImageTag;

public final class EasycashCommercialLoanAccountFragment extends BaseCommonAccountFragment implements CheckExtractActivity_MembersInjector.MediaDescriptionCompat {
    public static final C5935xc23f28aa MediaBrowserCompat$CustomActionResultReceiver = new C5935xc23f28aa((byte) 0);
    @HmlPinActivity
    public setImageTag presenter;
    @BindView
    protected CustomEasyCashSectionLabel receivingAccountLabel;
    @BindView
    public CustomEasyCashSectionLabel repayAccountLabel;
    @BindView
    protected TextView tvDisclaimer;

    public final setImageFilePath<?> write() {
        setImageTag setimagetag = this.presenter;
        if (setimagetag == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return setimagetag;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87052131493932, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        setImageTag setimagetag = this.presenter;
        if (setimagetag == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setimagetag.MediaBrowserCompat$ItemReceiver(this);
        super.onViewCreated(view, bundle);
    }

    public final void write(String str) {
        CustomEasyCashSectionLabel customEasyCashSectionLabel = this.receivingAccountLabel;
        if (customEasyCashSectionLabel == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("receivingAccountLabel");
        }
        customEasyCashSectionLabel.setText(getString(R.string.easycash_receiving_repay_label));
        CustomEasyCashSectionLabel customEasyCashSectionLabel2 = this.repayAccountLabel;
        if (customEasyCashSectionLabel2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("repayAccountLabel");
        }
        customEasyCashSectionLabel2.setVisibility(8);
        MediaBrowserCompat$CustomActionResultReceiver().setVisibility(8);
        if (str != null) {
            TextView textView = this.tvDisclaimer;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDisclaimer");
            }
            textView.setVisibility(0);
            TextView textView2 = this.tvDisclaimer;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDisclaimer");
            }
            textView2.setText(str);
        }
    }

    public final String PlaybackStateCompat() {
        String string = getString(R.string.loan_info_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.loan_info_title)");
        return string;
    }

    public final void onDestroyView() {
        setImageTag setimagetag = this.presenter;
        if (setimagetag == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setimagetag.onDestroy();
        super.onDestroyView();
    }
}
