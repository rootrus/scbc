package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferInstallmentOtpActivity;
import com.scb.phone.view.custom.cardmanagement.TermsAndConditionsView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.DefaultDateTypeAdapter;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getCountryShort;
import p040o.newOutgoingSummary;
import p040o.registerAnalyticsConnectorListener;
import p040o.reviewPayer;
import p040o.setTapText;
import p040o.toUserAgent;
import p040o.verifyPurposefulFeatures;

public class DeejungTransferInstallmentReviewBottomFragment extends BaseFragment implements getCountryShort, verifyPurposefulFeatures {
    public registerAnalyticsConnectorListener IconCompatParcelizer;
    @BindView
    public Button confirmButton;
    @HmlPinActivity
    public DefaultDateTypeAdapter presenter;
    @BindView
    public TermsAndConditionsView txvTermAndConditions;

    public static final /* synthetic */ void IconCompatParcelizer(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((DeejungTransferInstallmentReviewBottomFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90212131494248, viewGroup, false);
        this.IconCompatParcelizer = (registerAnalyticsConnectorListener) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungTransferInstallmentsSummaryFragment.KEY_TRANSFER_INSTALLMENTS_SUMMARY_DISPLAY_MODEL");
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.txvTermAndConditions.setTermsCheckboxListener(new newOutgoingSummary(this));
        this.txvTermAndConditions.setTermsAndConditionsListener(this);
        return inflate;
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        FragmentActivity activity;
        reviewPayer reviewpayer = new reviewPayer(this);
        if (isAdded() && (activity = getActivity()) != null) {
            reviewpayer.MediaBrowserCompat$ItemReceiver(activity);
        }
    }

    @OnClick
    public void handleConfirmClick() {
        DefaultDateTypeAdapter defaultDateTypeAdapter = this.presenter;
        toUserAgent touseragent = new toUserAgent(this.IconCompatParcelizer.ParcelableVolumeInfo);
        if (defaultDateTypeAdapter.RatingCompat != null) {
            touseragent.IconCompatParcelizer(defaultDateTypeAdapter.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent read = DeejungTransferInstallmentOtpActivity.read(getContext(), this.IconCompatParcelizer);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 8565);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 8565 && i2 == -1) {
            getActivity().finish();
        }
    }
}
