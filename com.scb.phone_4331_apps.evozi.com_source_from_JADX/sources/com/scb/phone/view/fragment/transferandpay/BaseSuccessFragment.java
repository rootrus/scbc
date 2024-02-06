package com.scb.phone.view.fragment.transferandpay;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomPhotoLeftDetails;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import p040o.CrashlyticsReport;
import p040o.getUuidUtf8Bytes;
import p040o.setJailbroken;
import p040o.setLastBaselineToBottomHeight;

public class BaseSuccessFragment extends BaseReviewFragment {
    @BindView
    CustomNoteItem edonationRemark;
    @BindView
    CustomPhotoLeftDetails giftDetails;
    @BindView
    CustomNoteItem messageDetails;
    @BindView
    TextView slipQRCodeDescriptionTextView;
    @BindView
    ImageView slipQRCodeImageView;
    @BindView
    RelativeLayout slipQRSection;
    @BindView
    ImageView successIcon;
    @BindView
    TextView textDateTime;
    @BindView
    TextView textReferenceId;
    @BindView
    TextView textTitle;

    /* access modifiers changed from: protected */
    public final boolean write() {
        String visibility = setVisibility();
        return "bill_payment".equals(visibility) || "ebill".equals(visibility) || "gifting".equals(visibility) || "sf".equals(visibility) || "deals".equals(visibility);
    }

    public void read(getUuidUtf8Bytes getuuidutf8bytes, View view, Context context) {
        String str;
        super.MediaBrowserCompat$ItemReceiver(getuuidutf8bytes.PlaybackStateCompat, view, context);
        ButterKnife.IconCompatParcelizer(this, view);
        this.textTitle.setText(getuuidutf8bytes.AlertController$RecycleListView);
        this.textDateTime.setText(getuuidutf8bytes.MediaDescriptionCompat);
        this.textReferenceId.setText(getuuidutf8bytes.MediaSessionCompat$Token);
        int i = 8;
        this.customAmount.amountInfo.setVisibility(8);
        this.fullDivider.setVisibility(8);
        this.customAmount.mDividerView.setVisibility(8);
        boolean z = true;
        this.customAmount.setFullDivider(true);
        int i2 = 0;
        this.customSource.setDivider(false);
        this.customFees.mTopSpace.setVisibility(8);
        this.customFees.setFullDivider(true);
        this.customTarget.setFullDivider(true);
        this.customDue.setFullDivider(true);
        this.userNote.setFullDivider(true);
        this.userNote.write();
        this.billerNote.setFullDivider(true);
        if (getuuidutf8bytes.PlaybackStateCompat.setShowingForActionMode != null) {
            this.successIcon.setImageResource(R.drawable.ic_scheduled_successful);
            CustomTransferAndPayTarget customTransferAndPayTarget = this.customTarget;
            customTransferAndPayTarget.mFavouriteIcon.setVisibility(8);
            customTransferAndPayTarget.mFavouriteName.setVisibility(8);
        } else {
            this.successIcon.getDrawable().mutate().setColorFilter(setLastBaselineToBottomHeight.read(context, R.color.f66422131099798), PorterDuff.Mode.SRC_ATOP);
        }
        if (getuuidutf8bytes.PlaybackStateCompat.setChecked != null) {
            this.customTarget.setAddFavoriteButtonVisible(false);
            this.giftDetails.setVisibility(0);
            this.customFees.mDividerView.setVisibility(0);
            setJailbroken setjailbroken = getuuidutf8bytes.PlaybackStateCompat.setChecked;
            this.giftDetails.setHeader(setjailbroken.MediaSessionCompat$ResultReceiverWrapper);
            CustomPhotoLeftDetails customPhotoLeftDetails = this.giftDetails;
            if (setjailbroken.read != null) {
                str = setjailbroken.read;
            } else {
                str = setjailbroken.IconCompatParcelizer;
            }
            customPhotoLeftDetails.setImageView(str);
            if (!TextUtils.isEmpty(setjailbroken.MediaBrowserCompat$MediaItem)) {
                this.giftDetails.setTitle(setjailbroken.MediaBrowserCompat$MediaItem);
                if (!TextUtils.isEmpty(setjailbroken.MediaBrowserCompat$ItemReceiver)) {
                    this.giftDetails.setSecondText(setjailbroken.MediaBrowserCompat$ItemReceiver);
                }
            } else if (!TextUtils.isEmpty(setjailbroken.MediaBrowserCompat$ItemReceiver)) {
                this.giftDetails.setTitle(setjailbroken.MediaBrowserCompat$ItemReceiver);
            }
            if (!TextUtils.isEmpty(setjailbroken.MediaBrowserCompat$SearchResultReceiver)) {
                this.giftDetails.setThirdText(setjailbroken.MediaBrowserCompat$SearchResultReceiver);
            }
            if (!TextUtils.isEmpty(setjailbroken.RatingCompat)) {
                this.giftDetails.setFourth(setjailbroken.RatingCompat);
            }
            if (setjailbroken.write == null || setjailbroken.write.isEmpty()) {
                CustomPhotoLeftDetails customPhotoLeftDetails2 = this.giftDetails;
                customPhotoLeftDetails2.dividirView.setVisibility(8);
                customPhotoLeftDetails2.dividirFullView.setVisibility(8);
                return;
            }
            CustomPhotoLeftDetails customPhotoLeftDetails3 = this.giftDetails;
            customPhotoLeftDetails3.dividirView.setVisibility(8);
            customPhotoLeftDetails3.dividirFullView.setVisibility(0);
            this.messageDetails.setVisibility(0);
            this.messageDetails.setTitle(setjailbroken.MediaMetadataCompat);
            this.messageDetails.setText(setjailbroken.write);
            this.messageDetails.write();
            this.messageDetails.divider.setVisibility(8);
        } else if ("LOANPAYMENT".equalsIgnoreCase(getuuidutf8bytes.PlaybackStateCompat.MediaDescriptionCompat())) {
            this.customFees.setVisibility(8);
            CustomTransferAndPayItem customTransferAndPayItem = this.customAmount;
            CrashlyticsReport.Session.Application application = getuuidutf8bytes.PlaybackStateCompat.f2965x50fd9e4a;
            customTransferAndPayItem.amountInfo.setVisibility(0);
            customTransferAndPayItem.amountInfo.setValuesAligned(application, true);
            this.customAmount.setText(context.getString(R.string.total_amount));
            this.customAmount.mDividerView.setVisibility(0);
            CustomTransferAndPayItem customTransferAndPayItem2 = this.customAmount;
            if (getuuidutf8bytes.PlaybackStateCompat.f2965x50fd9e4a != null) {
                z = false;
            }
            View view2 = customTransferAndPayItem2.mBottomSpace;
            if (z) {
                i = 0;
            }
            view2.setVisibility(i);
            this.customTarget.setAddFavoriteButtonVisible(false);
        } else if ("E_DONATION_FUNCTION".equalsIgnoreCase(getuuidutf8bytes.PlaybackStateCompat.setOverflowReserved)) {
            if (!getuuidutf8bytes.MediaBrowserCompat$ItemReceiver.booleanValue()) {
                this.customTarget.setAddFavoriteButtonVisible(false);
            }
            if (getuuidutf8bytes.PlaybackStateCompat == null || getuuidutf8bytes.PlaybackStateCompat.MediaBrowserCompat$SearchResultReceiver() == null) {
                this.edonationRemark.setVisibility(8);
                return;
            }
            this.edonationRemark.setVisibility(0);
            this.customFees.mDividerView.setVisibility(0);
            this.userNote.divider.setVisibility(0);
            this.billerNote.divider.setVisibility(0);
            this.edonationRemark.divider.setVisibility(8);
            this.edonationRemark.setTitle(getuuidutf8bytes.PlaybackStateCompat.MediaBrowserCompat$SearchResultReceiver().MediaBrowserCompat$CustomActionResultReceiver);
            this.edonationRemark.setText(getuuidutf8bytes.PlaybackStateCompat.MediaBrowserCompat$SearchResultReceiver().IconCompatParcelizer);
        } else if (getuuidutf8bytes.PlaybackStateCompat != null && "PREPAID".equalsIgnoreCase(getuuidutf8bytes.PlaybackStateCompat.PlaybackStateCompat$CustomAction) && getuuidutf8bytes.PlaybackStateCompat.setItemInvoker) {
            this.customTarget.setAddFavoriteButtonVisible(false);
        } else if ("TRANSFER".equalsIgnoreCase(getuuidutf8bytes.PlaybackStateCompat.MediaDescriptionCompat()) && MediaBrowserCompat$ItemReceiver(getuuidutf8bytes)) {
            CustomTransferAndPayItem customTransferAndPayItem3 = this.customFees;
            if (this.userNote.getVisibility() != 0) {
                z = false;
            }
            View view3 = customTransferAndPayItem3.mDividerView;
            if (!z) {
                i2 = 8;
            }
            view3.setVisibility(i2);
            this.userNote.divider.setVisibility(8);
        } else if ("rtp.payer".equalsIgnoreCase(getuuidutf8bytes.PlaybackStateCompat.MediaDescriptionCompat()) || "rtp.payer.notification".equalsIgnoreCase(getuuidutf8bytes.PlaybackStateCompat.MediaDescriptionCompat()) || "RTP_EBILL_PAYMENT_FUNCTION".equalsIgnoreCase(getuuidutf8bytes.PlaybackStateCompat.MediaDescriptionCompat())) {
            MediaBrowserCompat$CustomActionResultReceiver(R.string.from, context);
        }
    }

    protected static boolean MediaBrowserCompat$ItemReceiver(getUuidUtf8Bytes getuuidutf8bytes) {
        if (getuuidutf8bytes.RatingCompat != null) {
            for (CrashlyticsReport.Session.OperatingSystem.Builder builder : getuuidutf8bytes.RatingCompat.MediaBrowserCompat$ItemReceiver) {
                if (!TextUtils.isEmpty(builder.read)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected static boolean MediaBrowserCompat$CustomActionResultReceiver(getUuidUtf8Bytes getuuidutf8bytes) {
        return (getuuidutf8bytes == null || getuuidutf8bytes.PlaybackStateCompat == null || getuuidutf8bytes.PlaybackStateCompat.setShortcut == null || !"BILLPAYMENT".equals(getuuidutf8bytes.PlaybackStateCompat.MediaDescriptionCompat())) ? false : true;
    }
}
