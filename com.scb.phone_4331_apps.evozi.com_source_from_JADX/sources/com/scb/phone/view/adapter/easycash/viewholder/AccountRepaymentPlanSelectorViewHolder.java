package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomTileToggle;
import p040o.CLSUUID;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.convertLongToTwoByteBuffer;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class AccountRepaymentPlanSelectorViewHolder extends AccountHeaderViewHolder {
    @BindView
    public View container;
    @BindView
    public CustomTileToggle repaymentToggle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountRepaymentPlanSelectorViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public final void IconCompatParcelizer(convertLongToTwoByteBuffer convertlongtotwobytebuffer, boolean z, FundFactSheetActivity<? super String, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) convertlongtotwobytebuffer, "display");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onSelectedRepaymentPlan");
        CLSUUID clsuuid = convertlongtotwobytebuffer;
        onGetStartedClick.write((Object) clsuuid, "display");
        CustomEasyCashSectionLabel customEasyCashSectionLabel = this.textHeader;
        if (customEasyCashSectionLabel == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textHeader");
        }
        customEasyCashSectionLabel.setText(clsuuid.MediaBrowserCompat$CustomActionResultReceiver);
        if (z) {
            CustomTileToggle customTileToggle = this.repaymentToggle;
            if (customTileToggle == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentToggle");
            }
            View view = customTileToggle.MediaBrowserCompat$CustomActionResultReceiver;
            if (view != null) {
                view.setBackground(setLastBaselineToBottomHeight.write(customTileToggle.getContext(), R.drawable.bg_white_rounded));
            }
            View view2 = this.container;
            if (view2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
            }
            view2.setVisibility(8);
            return;
        }
        View view3 = this.container;
        if (view3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
        }
        view3.setVisibility(0);
        CustomTileToggle customTileToggle2 = this.repaymentToggle;
        if (customTileToggle2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentToggle");
        }
        customTileToggle2.read(new read(this, fundFactSheetActivity));
    }

    static final class read implements CustomTileToggle.read {
        private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
        private /* synthetic */ AccountRepaymentPlanSelectorViewHolder MediaBrowserCompat$ItemReceiver;

        read(AccountRepaymentPlanSelectorViewHolder accountRepaymentPlanSelectorViewHolder, FundFactSheetActivity fundFactSheetActivity) {
            this.MediaBrowserCompat$ItemReceiver = accountRepaymentPlanSelectorViewHolder;
            this.IconCompatParcelizer = fundFactSheetActivity;
        }

        public final void IconCompatParcelizer(int i, View view) {
            CustomTileToggle customTileToggle = this.MediaBrowserCompat$ItemReceiver.repaymentToggle;
            if (customTileToggle == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentToggle");
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) view, (Object) customTileToggle.leftTile)) {
                this.IconCompatParcelizer.invoke("FULL_AMOUNT");
                return;
            }
            CustomTileToggle customTileToggle2 = this.MediaBrowserCompat$ItemReceiver.repaymentToggle;
            if (customTileToggle2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentToggle");
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) view, (Object) customTileToggle2.rightTile)) {
                this.IconCompatParcelizer.invoke("MIN_AMOUNT");
            }
        }
    }
}
