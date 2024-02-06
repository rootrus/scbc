package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferMinFullOtpActivity;
import com.scb.phone.view.custom.cardmanagement.TermsAndConditionsView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AnalyticsConnectorImpl;
import p040o.FirebaseVisionText;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.deserializeToDate;
import p040o.getCardRefFromDeepLinkId;
import p040o.getCountry;
import p040o.getObjectives;
import p040o.setTapText;
import p040o.verifyPurposefulFeatures;

public class DeejungTransferMinFullReviewFragment extends BaseFragment implements verifyPurposefulFeatures, getObjectives, getCountry {
    public AnalyticsConnectorImpl MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button btnConfirm;
    @HmlPinActivity
    public deserializeToDate presenter;
    @BindView
    TermsAndConditionsView termsAndConditionsView;
    @BindView
    TextView txvInterestDeclaration;

    public static final /* synthetic */ void write(Fragment fragment, Intent intent) {
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
            ((DeejungTransferMinFullReviewFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90232131494250, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        AnalyticsConnectorImpl analyticsConnectorImpl = (AnalyticsConnectorImpl) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungTransferMinFullSummaryFragment.KEY_TRANSFER_INSTALLMENT_SUMMARY_DISPLAY_MODEL");
        this.MediaBrowserCompat$CustomActionResultReceiver = analyticsConnectorImpl;
        this.txvInterestDeclaration.setText(getString(R.string.min_max_transfer_declaration, analyticsConnectorImpl.read, this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo));
        this.termsAndConditionsView.setTermsAndConditionsListener(this);
        this.termsAndConditionsView.setTermsCheckboxListener(this);
        this.btnConfirm.setEnabled(false);
        return inflate;
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        FragmentActivity activity;
        getCardRefFromDeepLinkId getcardreffromdeeplinkid = new getCardRefFromDeepLinkId(this);
        if (isAdded() && (activity = getActivity()) != null) {
            getcardreffromdeeplinkid.MediaBrowserCompat$ItemReceiver(activity);
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        this.btnConfirm.setEnabled(z);
    }

    public final void write() {
        Intent MediaBrowserCompat$ItemReceiver = DeejungTransferMinFullOtpActivity.MediaBrowserCompat$ItemReceiver(getContext(), this.MediaBrowserCompat$CustomActionResultReceiver);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 8565);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void handlleConfirmButtonClick() {
        deserializeToDate deserializetodate = this.presenter;
        FirebaseVisionText.TextBase textBase = new FirebaseVisionText.TextBase(this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat);
        if (deserializetodate.RatingCompat != null) {
            textBase.IconCompatParcelizer(deserializetodate.RatingCompat);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 8565 && i2 == -1) {
            getActivity().finish();
        }
    }
}
