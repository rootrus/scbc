package com.scb.phone.view.fragment.ccrredemption.review;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.CreditCardTermsAndConditionsActivity;
import com.scb.phone.view.activity.ccrredemption.categories.RewardsHomeActivity;
import com.scb.phone.view.activity.ccrredemption.confirm.ConfirmRedemptionActivity;
import com.scb.phone.view.custom.cardmanagement.TermsAndConditionsView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AnalyticsConnectorRegistrar;
import p040o.HmlPinActivity;
import p040o.IdCaptureBackActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getObjectives;
import p040o.getSupertype;
import p040o.lambda$intoSet$2;
import p040o.newParameterizedTypeWithOwner;
import p040o.resolveTypeVariable;
import p040o.setTapText;
import p040o.verifyPurposefulFeatures;

public class ReviewRedemptionFragment extends BaseFragment implements IdCaptureBackActivity, verifyPurposefulFeatures, getObjectives {
    private lambda$intoSet$2 MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button btnConfirm;
    @BindView
    TextView cashRewardsEta;
    @BindView
    TextView deliveryEta;
    @BindView
    ConstraintLayout layoutEffectiveDate;
    @BindView
    TextView oprUserReviewConsent;
    @HmlPinActivity
    public newParameterizedTypeWithOwner reviewRedemptionPresenter;
    @BindView
    TermsAndConditionsView termsAndConditionsView;
    @BindView
    ConstraintLayout totalPayableSection;
    @BindView
    TextView txvCardNo;
    @BindView
    TextView txvCardType;
    @BindView
    TextView txvCurrency;
    @BindView
    TextView txvEffectiveDate;
    @BindView
    TextView txvItemDescription;
    @BindView
    TextView txvItemName;
    @BindView
    TextView txvPoints;
    @BindView
    TextView txvTotalPayable;
    @BindView
    TextView txvTotalPoints;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89542131494181, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        lambda$intoSet$2 lambda_intoset_2 = (lambda$intoSet$2) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.review.ReviewRedemptionActivity.REVIEW_DTO_EXTRA");
        this.MediaBrowserCompat$CustomActionResultReceiver = lambda_intoset_2;
        this.reviewRedemptionPresenter.IconCompatParcelizer = lambda_intoset_2;
        this.reviewRedemptionPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.txvCardType.setText(this.MediaBrowserCompat$CustomActionResultReceiver.write);
        this.txvCardNo.setText(this.MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView);
        this.txvItemName.setText(this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor);
        this.txvItemDescription.setText(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver);
        this.txvTotalPoints.setText(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat);
        newParameterizedTypeWithOwner newparameterizedtypewithowner = this.reviewRedemptionPresenter;
        getSupertype getsupertype = new getSupertype(Integer.parseInt(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.replace(",", "")));
        if (newparameterizedtypewithowner.RatingCompat != null) {
            getsupertype.IconCompatParcelizer(newparameterizedtypewithowner.RatingCompat);
        }
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper) {
            this.totalPayableSection.setVisibility(0);
            this.txvTotalPayable.setText(this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat);
            this.txvCurrency.setText(this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat);
        } else {
            this.totalPayableSection.setVisibility(8);
        }
        this.termsAndConditionsView.setTermsAndConditionsListener(this);
        this.termsAndConditionsView.setTermsCheckboxListener(this);
        this.btnConfirm.setEnabled(false);
        if (Boolean.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token).booleanValue()) {
            this.deliveryEta.setText(getResources().getString(R.string.voucher_delivery_eta));
            this.cashRewardsEta.setText(getResources().getString(R.string.cash_rewards_eta_opr));
        } else {
            this.deliveryEta.setText(getResources().getString(R.string.item_delivery_eta));
            this.cashRewardsEta.setText(getResources().getString(R.string.cash_rewards_eta));
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver.f2885x50fd9e4a) {
            this.layoutEffectiveDate.setVisibility(0);
            this.txvEffectiveDate.setText(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem);
            this.cashRewardsEta.setVisibility(8);
            this.deliveryEta.setVisibility(8);
            this.oprUserReviewConsent.setVisibility(0);
            this.txvItemDescription.setVisibility(8);
        } else {
            this.layoutEffectiveDate.setVisibility(8);
            this.cashRewardsEta.setVisibility(0);
            this.deliveryEta.setVisibility(0);
            this.oprUserReviewConsent.setVisibility(8);
        }
        return inflate;
    }

    @OnCheckedChanged
    public void onTermsAndConditionsCheckChanged(boolean z) {
        this.btnConfirm.setEnabled(z);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onConfirmRedemptionClick() {
        this.reviewRedemptionPresenter.IconCompatParcelizer();
    }

    public final void MediaBrowserCompat$ItemReceiver(AnalyticsConnectorRegistrar analyticsConnectorRegistrar) {
        if (RewardsHomeActivity.MediaSessionCompat$Token()) {
            Intent intent = new Intent(getActivity(), RewardsHomeActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.confirm.ConfirmRedemptionActivity.CARD_POINTS_BALANCE", analyticsConnectorRegistrar.Keep);
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
        Intent write2 = ConfirmRedemptionActivity.write(getContext(), analyticsConnectorRegistrar);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                write2 = setTapText.write(activity2, write2).read();
            }
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb2.append(write2.getData());
            sb2.append("\n with context ");
            sb2.append(activity2.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
            startActivityForResult(write2, 104);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void MediaMetadataCompat() {
        Intent IconCompatParcelizer = CreditCardTermsAndConditionsActivity.IconCompatParcelizer(getActivity(), "CREDITCARDREWARDS");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaDescriptionCompat() {
        Intent IconCompatParcelizer = CreditCardTermsAndConditionsActivity.IconCompatParcelizer(getActivity(), "CREDITCARDREWARDS_ONEPOINT");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void RatingCompat() {
        this.txvPoints.setText(getResources().getString(R.string.point_label));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 104 && intent != null) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.btnConfirm.setEnabled(z);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        newParameterizedTypeWithOwner newparameterizedtypewithowner = this.reviewRedemptionPresenter;
        resolveTypeVariable resolvetypevariable = new resolveTypeVariable(this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token, this.MediaBrowserCompat$CustomActionResultReceiver.f2885x50fd9e4a);
        if (newparameterizedtypewithowner.RatingCompat != null) {
            resolvetypevariable.IconCompatParcelizer(newparameterizedtypewithowner.RatingCompat);
        }
    }

    public void onDestroy() {
        this.reviewRedemptionPresenter.onDestroy();
        super.onDestroy();
    }
}
