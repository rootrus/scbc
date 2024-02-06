package com.scb.phone.view.fragment.sme.gifting;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.sme.gifting.GiftPreviewActivity;
import com.scb.phone.view.custom.common.CustomSelectAccountGift;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayBiller;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.concurrent.TimeUnit;
import p040o.ActivityBuilder_ContributeRemittanceSenderAddressActivity;
import p040o.ActivityBuilder_ContributeRemittanceSenderAddressReviewActivity;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C6399x149707a6;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindBillPaymentTabFragment;
import p040o.FragmentBuilder_BindCloseAccountDetailsFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlETBLandingActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public abstract class BaseGiftTransferInputFragment extends BaseFragment implements C6399x149707a6, FragmentBuilder_BindCloseAccountDetailsFragment, FragmentBuilder_BindBillPaymentTabFragment {
    protected BulkTransferDeepLinkActivity IconCompatParcelizer;
    @BindView
    protected CustomSelectAccountGift customSelectAccountGift;
    @BindView
    protected CustomTransferAndPayBiller customTransferAndPayBiller;
    @BindView
    protected TextView giftTransferDescription;
    @BindView
    protected ImageView giftTransferImage;
    @BindView
    protected TextView giftTransferTitle;
    @BindView
    protected NoteEditText noteEditText;
    @BindView
    protected DefaultButton previewButton;
    @BindView
    protected DefaultButton sendGiftButton;

    /* access modifiers changed from: protected */
    public abstract void IconCompatParcelizer(AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder);

    public abstract void MediaBrowserCompat$SearchResultReceiver();

    /* access modifiers changed from: protected */
    public abstract void RatingCompat();

    /* access modifiers changed from: protected */
    @OnClick
    public abstract void onPreviewButtonClicked();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View IconCompatParcelizer2 = IconCompatParcelizer(layoutInflater, viewGroup);
        this.sendGiftButton.setButtonEnabled(false);
        this.customSelectAccountGift.setOnSelectAccountGiftListener(this);
        this.customTransferAndPayBiller.setEditButtonImage();
        this.customTransferAndPayBiller.setOnCustomTransferAndPayItemListener(this);
        this.IconCompatParcelizer = DebitCardResetOtpActivity.interval(1, TimeUnit.SECONDS).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new ActivityBuilder_ContributeRemittanceSenderAddressActivity(this), ActivityBuilder_ContributeRemittanceSenderAddressReviewActivity.MediaBrowserCompat$ItemReceiver);
        return IconCompatParcelizer2;
    }

    /* access modifiers changed from: protected */
    public View IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f87642131493991, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r4) {
        getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(getContext(), R.color.f66402131099796), this.giftTransferImage, r4.MediaMetadataCompat);
        this.giftTransferTitle.setText(r4.MediaBrowserCompat$SearchResultReceiver);
        this.giftTransferDescription.setText(r4.read);
    }

    public final void write(AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder) {
        this.customSelectAccountGift.setVisibility(8);
        if (TextUtils.isEmpty(builder.MediaMetadataCompat)) {
            this.customTransferAndPayBiller.setTitle(builder.read);
            CustomTransferAndPayBiller customTransferAndPayBiller2 = this.customTransferAndPayBiller;
            customTransferAndPayBiller2.mDescriptionTextView.setText("");
            customTransferAndPayBiller2.mDescriptionTextView.setVisibility(8);
        } else {
            this.customTransferAndPayBiller.setTitle(builder.MediaMetadataCompat);
            this.customTransferAndPayBiller.setDescription(builder.read);
        }
        this.customTransferAndPayBiller.setAvatar(builder.IconCompatParcelizer);
        this.customTransferAndPayBiller.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.customSelectAccountGift.setVisibility(0);
        this.customTransferAndPayBiller.setVisibility(8);
    }

    public final void write() {
        this.noteEditText.write();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1) {
            IconCompatParcelizer((AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder) intent.getParcelableExtra("GIFT_RECIPIENT_INFO"));
        }
    }

    public final void aD_() {
        MediaBrowserCompat$MediaItem();
    }

    public final void IconCompatParcelizer(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        Intent intent = new Intent(getActivity(), GiftPreviewActivity.class);
        intent.putExtra("EXTRA_GIFT_STATUS_SELECTED", autoValue_CrashlyticsReport_Session_User);
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

    @OnClick
    public void onSendGiftButtonClicked() {
        RatingCompat();
    }

    public final void MediaMetadataCompat() {
        DefaultButton defaultButton = this.sendGiftButton;
        defaultButton.setButtonEnabled(!defaultButton.isEnabled());
    }
}
