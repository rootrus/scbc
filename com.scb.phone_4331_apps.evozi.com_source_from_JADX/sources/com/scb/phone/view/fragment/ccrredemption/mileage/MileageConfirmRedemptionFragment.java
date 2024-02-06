package com.scb.phone.view.fragment.ccrredemption.mileage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AbstractComponentContainer;
import p040o.HmlPinActivity;
import p040o.Maps;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getAnnotation;
import p040o.getDeclaredType;
import p040o.getHair;
import p040o.separateCamelCase;
import p040o.setTapText;

public class MileageConfirmRedemptionFragment extends BaseFragment implements getHair {
    private AbstractComponentContainer MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button btnRedeemAnotherReward;
    @HmlPinActivity
    public separateCamelCase presenter;
    @BindView
    TextView txvCardBalanceAfterRedemption;
    @BindView
    TextView txvMilesDeliveryEta;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88482131494075, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        AbstractComponentContainer abstractComponentContainer = (AbstractComponentContainer) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.mileage.MileageConfirmRedemptionActivity.KEY_CONFIRM_REDEMPTION_DTO");
        this.MediaBrowserCompat$CustomActionResultReceiver = abstractComponentContainer;
        abstractComponentContainer.setBackgroundResource = new Maps.MapDifferenceImpl(getResources());
        separateCamelCase separatecamelcase = this.presenter;
        getAnnotation getannotation = new getAnnotation(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat);
        if (separatecamelcase.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getannotation.IconCompatParcelizer(separatecamelcase.RatingCompat);
        }
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onAccountSummaryClick() {
        separateCamelCase separatecamelcase = this.presenter;
        getDeclaredType getdeclaredtype = new getDeclaredType(Boolean.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat));
        if (separatecamelcase.RatingCompat != null) {
            getdeclaredtype.IconCompatParcelizer(separatecamelcase.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onRedeemAnotherRewardClick() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.confirm.ConfirmRedemptionActivity.CARD_POINTS_BALANCE", this.MediaBrowserCompat$CustomActionResultReceiver.Keep);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public final void IconCompatParcelizer() {
        this.txvCardBalanceAfterRedemption.setText(this.MediaBrowserCompat$CustomActionResultReceiver.read());
    }

    public final void write() {
        this.txvMilesDeliveryEta.setText(getResources().getString(R.string.miles_delivery_eta_opr));
        this.btnRedeemAnotherReward.setVisibility(8);
    }

    public final void read() {
        this.txvMilesDeliveryEta.setText(getResources().getString(R.string.miles_delivery_eta));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent(getContext(), HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
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
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, HomeActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
            intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    intent = setTapText.write(activity2, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            activity.finish();
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
