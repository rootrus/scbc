package com.scb.phone.view.fragment.investment.redeem;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.redeem.FundRedeemOtpActivity;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.investment.BaseInvestmentSuccessReviewFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CheckWorkflowActivity;
import p040o.CrashlyticsFileMarker;
import p040o.HmlPinActivity;
import p040o.MetaDataStore;
import p040o.MyECouponActivity_ViewBinding;
import p040o.isBuildIdValid;
import p040o.onGetStartedClick;
import p040o.setCropTetragon;
import p040o.setCropTetragon$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class FundRedeemReviewFragment extends BaseInvestmentSuccessReviewFragment implements CheckWorkflowActivity.write {
    @BindView
    public RadioButton rbHoldingNo;
    @BindView
    public RadioButton rbHoldingYes;
    @HmlPinActivity
    public setCropTetragon redeemReviewPresenter;
    @BindView
    public CustomTransferAndPayItem tvTransactionDate;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intent intent;
        Bundle extras;
        MetaDataStore metaDataStore;
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89282131494155, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver(this, inflate);
        setCropTetragon setcroptetragon = this.redeemReviewPresenter;
        if (setcroptetragon == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("redeemReviewPresenter");
        }
        setcroptetragon.MediaBrowserCompat$ItemReceiver(this);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (intent = activity.getIntent()) == null || (extras = intent.getExtras()) == null || (metaDataStore = (MetaDataStore) extras.getParcelable("com.scb.phone.REDEEM_FUND_VERIFICATION_DETAILS")) == null)) {
            onGetStartedClick.IconCompatParcelizer((Object) metaDataStore, "display");
            isBuildIdValid isbuildidvalid = metaDataStore.IconCompatParcelizer;
            getContext();
            setCropTetragon setcroptetragon2 = this.redeemReviewPresenter;
            if (setcroptetragon2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("redeemReviewPresenter");
            }
            super.IconCompatParcelizer(isbuildidvalid, inflate, "ACCOUNT_MASKING_REVIEW", setcroptetragon2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setItemInvoker());
            setCropTetragon setcroptetragon3 = this.redeemReviewPresenter;
            if (setcroptetragon3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("redeemReviewPresenter");
            }
            onGetStartedClick.write((Object) metaDataStore, "redeemVerificationDisplay");
            setcroptetragon3.write = metaDataStore;
            writeUInt64NoTag.IconCompatParcelizer setcroptetragon_mediabrowsercompat_itemreceiver = new setCropTetragon$MediaBrowserCompat$ItemReceiver(metaDataStore);
            if (setcroptetragon3.RatingCompat != null) {
                setcroptetragon_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setcroptetragon3.RatingCompat);
            }
            String str = metaDataStore.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) str, "redeemVerificationDisplay.statementOfHolding");
            writeUInt64NoTag.IconCompatParcelizer read = new setCropTetragon.read(setcroptetragon3, str);
            if (setcroptetragon3.RatingCompat != null) {
                z = true;
            }
            if (z) {
                read.IconCompatParcelizer(setcroptetragon3.RatingCompat);
            }
        }
        super.setTransitioning();
        ActionBarContextView();
        setActionBarVisibilityCallback();
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("mfschedule_redeemreview");
        }
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ActionBarContextView();
        setActionBarVisibilityCallback();
    }

    @OnClick
    public final void onHoldingYesRadioButtonClicked() {
        setCropTetragon setcroptetragon = this.redeemReviewPresenter;
        if (setcroptetragon == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("redeemReviewPresenter");
        }
        onGetStartedClick.write((Object) "Y", "statementOfHolding");
        setcroptetragon.IconCompatParcelizer = "Y";
    }

    @OnClick
    public final void onHoldingNoRadioButtonClicked() {
        setCropTetragon setcroptetragon = this.redeemReviewPresenter;
        if (setcroptetragon == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("redeemReviewPresenter");
        }
        onGetStartedClick.write((Object) "N", "statementOfHolding");
        setcroptetragon.IconCompatParcelizer = "N";
    }

    @OnClick
    public final void onConfirmButtonClicked() {
        setCropTetragon setcroptetragon = this.redeemReviewPresenter;
        if (setcroptetragon == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("redeemReviewPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write = new setCropTetragon.write(setcroptetragon);
        if (setcroptetragon.RatingCompat != null) {
            write.IconCompatParcelizer(setcroptetragon.RatingCompat);
        }
    }

    public final void write(String str, MetaDataStore metaDataStore) {
        onGetStartedClick.write((Object) str, "statementOfHolding");
        onGetStartedClick.write((Object) metaDataStore, "display");
        Intent write = FundRedeemOtpActivity.write(getContext(), str, metaDataStore);
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

    public final void read() {
        RadioButton radioButton = this.rbHoldingYes;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingYes");
        }
        radioButton.setChecked(true);
        RadioButton radioButton2 = this.rbHoldingYes;
        if (radioButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingYes");
        }
        radioButton2.setEnabled(false);
        RadioButton radioButton3 = this.rbHoldingNo;
        if (radioButton3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingNo");
        }
        radioButton3.setEnabled(false);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RadioButton radioButton = this.rbHoldingNo;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingNo");
        }
        radioButton.setChecked(true);
        RadioButton radioButton2 = this.rbHoldingYes;
        if (radioButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingYes");
        }
        radioButton2.setEnabled(false);
        RadioButton radioButton3 = this.rbHoldingNo;
        if (radioButton3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingNo");
        }
        radioButton3.setEnabled(false);
    }

    public final void write() {
        RadioButton radioButton = this.rbHoldingNo;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingNo");
        }
        radioButton.setChecked(true);
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "date");
        CustomTransferAndPayItem customTransferAndPayItem = this.tvTransactionDate;
        if (customTransferAndPayItem == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTransactionDate");
        }
        customTransferAndPayItem.setValue(str);
    }

    public final void IconCompatParcelizer() {
        ParcelableVolumeInfo(getString(R.string.review_redeem_title));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ParcelableVolumeInfo(getString(R.string.review_redeem_scheduled_title));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsFileMarker crashlyticsFileMarker) {
        onGetStartedClick.write((Object) crashlyticsFileMarker, "investmentScheduleDisplay");
        read(crashlyticsFileMarker);
    }

    public final void onDestroy() {
        setCropTetragon setcroptetragon = this.redeemReviewPresenter;
        if (setcroptetragon == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("redeemReviewPresenter");
        }
        setcroptetragon.onDestroy();
        super.onDestroy();
    }
}
