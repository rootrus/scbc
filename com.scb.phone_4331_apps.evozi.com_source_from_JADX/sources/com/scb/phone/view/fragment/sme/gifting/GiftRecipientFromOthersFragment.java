package com.scb.phone.view.fragment.sme.gifting;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.concurrent.TimeUnit;
import p040o.ActivityBuilder_ContributeRemittanceFaqActivity;
import p040o.ActivityBuilder_ContributeRemittanceSenderAddressReviewActivity;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CheckParameters_MembersInjector;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.setLastBaselineToBottomHeight;
import p040o.startZoomInMessage;
import p040o.startZoomInMessage$MediaBrowserCompat$CustomActionResultReceiver;

public class GiftRecipientFromOthersFragment extends BaseFragment implements CheckParameters_MembersInjector.MediaMetadataCompat {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    @BindView
    EditText accountNumber;
    @BindView
    ImageView bankIcon;
    @BindView
    protected DefaultButton confirmButton;
    @HmlPinActivity
    public startZoomInMessage selectRecipientFromOtherPresenter;

    public static GiftRecipientFromOthersFragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new GiftRecipientFromOthersFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87662131493993, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.selectRecipientFromOtherPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.IconCompatParcelizer = DebitCardResetOtpActivity.interval(1, TimeUnit.SECONDS).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new ActivityBuilder_ContributeRemittanceFaqActivity(this), ActivityBuilder_ContributeRemittanceSenderAddressReviewActivity.MediaBrowserCompat$ItemReceiver);
        getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(getContext(), R.drawable.bankicon_scb), this.bankIcon, (int) R.drawable.bankicon_scb, getContext().getResources().getDimensionPixelOffset(R.dimen.f72032131165280));
        return inflate;
    }

    @OnClick
    public void buttonConfirmClick() {
        startZoomInMessage startzoominmessage = this.selectRecipientFromOtherPresenter;
        String obj = this.accountNumber.getText().toString();
        startzoominmessage.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setStackedBackground());
        startzoominmessage.IconCompatParcelizer.IconCompatParcelizer(new startZoomInMessage$MediaBrowserCompat$CustomActionResultReceiver(startzoominmessage, obj));
    }

    public final void MediaBrowserCompat$ItemReceiver(AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder) {
        Intent intent = new Intent();
        intent.putExtra("GIFT_RECIPIENT_INFO", builder);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    public void onDestroyView() {
        super.onDestroyView();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
        this.selectRecipientFromOtherPresenter.onDestroy();
    }

    public static /* synthetic */ void IconCompatParcelizer(GiftRecipientFromOthersFragment giftRecipientFromOthersFragment) {
        giftRecipientFromOthersFragment.confirmButton.setButtonEnabled(giftRecipientFromOthersFragment.accountNumber.getText().length() >= 10);
    }
}
