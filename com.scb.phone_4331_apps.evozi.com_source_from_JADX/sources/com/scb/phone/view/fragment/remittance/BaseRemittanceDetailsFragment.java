package com.scb.phone.view.fragment.remittance;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onGetStartedClick;
import p040o.setImportance;

public class BaseRemittanceDetailsFragment extends BaseFragment {
    private boolean IconCompatParcelizer;
    @BindView
    protected TextView customAmountToGet;
    @BindView
    protected LinearLayout customAmountToGetLayout;
    @BindView
    protected TextView customAmountToSend;
    @BindView
    protected LinearLayout customAmountToSendLayout;
    @BindView
    protected CustomTransferAndPayItem customConversionRate;
    @BindView
    protected TextView customFee;
    @BindView
    protected LinearLayout customFeeLayout;
    @BindView
    protected CustomNoteItem customNote;
    @BindView
    protected CustomNoteItem customPersonalDetail;
    @BindView
    protected CustomNoteItem customRecipientAddress;
    @BindView
    protected CustomNoteItem customRecipientContacts;
    @BindView
    protected CustomTransferAndPaySource customSource;
    @BindView
    protected CustomTransferAndPayTarget customTarget;
    @BindView
    protected CustomNoteItem customTransactionDetails;
    @BindView
    protected ImageView remittanceLogo;
    @BindView
    protected View separatorAmountToGet;
    @BindView
    protected View separatorAmountToSend;

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    public final CustomTransferAndPaySource write() {
        CustomTransferAndPaySource customTransferAndPaySource = this.customSource;
        if (customTransferAndPaySource == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customSource");
        }
        return customTransferAndPaySource;
    }

    /* access modifiers changed from: protected */
    public final CustomTransferAndPayTarget MediaBrowserCompat$CustomActionResultReceiver() {
        CustomTransferAndPayTarget customTransferAndPayTarget = this.customTarget;
        if (customTransferAndPayTarget == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customTarget");
        }
        return customTransferAndPayTarget;
    }

    /* access modifiers changed from: protected */
    public final CustomNoteItem IconCompatParcelizer() {
        CustomNoteItem customNoteItem = this.customNote;
        if (customNoteItem == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customNote");
        }
        return customNoteItem;
    }

    /* access modifiers changed from: protected */
    public final void RatingCompat() {
        this.IconCompatParcelizer = true;
    }

    /* access modifiers changed from: protected */
    public final void write(setImportance setimportance) {
        onGetStartedClick.write((Object) setimportance, "display");
        CustomTransferAndPayItem customTransferAndPayItem = this.customConversionRate;
        if (customTransferAndPayItem == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customConversionRate");
        }
        String str = setimportance.MediaBrowserCompat$ItemReceiver;
        if (!TextUtils.isEmpty(str)) {
            customTransferAndPayItem.setVisibility(0);
            customTransferAndPayItem.setValue(str);
        }
        LinearLayout linearLayout = this.customAmountToSendLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customAmountToSendLayout");
        }
        TextView textView = this.customAmountToSend;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customAmountToSend");
        }
        CharSequence charSequence = setimportance.IconCompatParcelizer;
        if (!TextUtils.isEmpty(charSequence)) {
            linearLayout.setVisibility(0);
            textView.setText(charSequence);
        }
        LinearLayout linearLayout2 = this.customAmountToGetLayout;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customAmountToGetLayout");
        }
        TextView textView2 = this.customAmountToGet;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customAmountToGet");
        }
        CharSequence charSequence2 = setimportance.MediaBrowserCompat$CustomActionResultReceiver;
        if (!TextUtils.isEmpty(charSequence2)) {
            linearLayout2.setVisibility(0);
            textView2.setText(charSequence2);
        }
        LinearLayout linearLayout3 = this.customFeeLayout;
        if (linearLayout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customFeeLayout");
        }
        TextView textView3 = this.customFee;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customFee");
        }
        CharSequence charSequence3 = setimportance.MediaBrowserCompat$MediaItem;
        if (!TextUtils.isEmpty(charSequence3)) {
            linearLayout3.setVisibility(0);
            textView3.setText(charSequence3);
        }
        CustomNoteItem customNoteItem = this.customPersonalDetail;
        if (customNoteItem == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPersonalDetail");
        }
        MediaBrowserCompat$CustomActionResultReceiver(customNoteItem, R.string.remittance_review_recipient_personal_detail, setimportance.MediaSessionCompat$ResultReceiverWrapper, !this.IconCompatParcelizer);
        CustomNoteItem customNoteItem2 = this.customRecipientAddress;
        if (customNoteItem2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customRecipientAddress");
        }
        MediaBrowserCompat$CustomActionResultReceiver(customNoteItem2, R.string.remittance_review_recipient_address, setimportance.MediaSessionCompat$Token, !this.IconCompatParcelizer);
        CustomNoteItem customNoteItem3 = this.customRecipientAddress;
        if (customNoteItem3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customRecipientAddress");
        }
        customNoteItem3.topSpace.setVisibility(this.IconCompatParcelizer ^ true ? 0 : 8);
        CustomNoteItem customNoteItem4 = this.customRecipientContacts;
        if (customNoteItem4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customRecipientContacts");
        }
        MediaBrowserCompat$CustomActionResultReceiver(customNoteItem4, R.string.remittance_review_recipient_contact_details, setimportance.f2945x50fd9e4a, !this.IconCompatParcelizer);
        CustomNoteItem customNoteItem5 = this.customRecipientContacts;
        if (customNoteItem5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customRecipientContacts");
        }
        customNoteItem5.topSpace.setVisibility(8);
        CustomNoteItem customNoteItem6 = this.customTransactionDetails;
        if (customNoteItem6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customTransactionDetails");
        }
        MediaBrowserCompat$CustomActionResultReceiver(customNoteItem6, R.string.remittance_recipient_purpose_input_title, setimportance.setHasDecor, !this.IconCompatParcelizer);
        CustomNoteItem customNoteItem7 = this.customTransactionDetails;
        if (customNoteItem7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customTransactionDetails");
        }
        customNoteItem7.topSpace.setVisibility(this.IconCompatParcelizer ^ true ? 0 : 8);
        CustomNoteItem customNoteItem8 = this.customTransactionDetails;
        if (customNoteItem8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customTransactionDetails");
        }
        customNoteItem8.setFullDivider(this.IconCompatParcelizer);
        CustomNoteItem customNoteItem9 = this.customNote;
        if (customNoteItem9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customNote");
        }
        MediaBrowserCompat$CustomActionResultReceiver(customNoteItem9, R.string.remittance_review_note, setimportance.MediaDescriptionCompat, !this.IconCompatParcelizer);
        if (this.IconCompatParcelizer) {
            CustomNoteItem customNoteItem10 = this.customNote;
            if (customNoteItem10 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customNote");
            }
            customNoteItem10.topSpace.setVisibility(this.IconCompatParcelizer ^ true ? 0 : 8);
            CustomTransferAndPayItem customTransferAndPayItem2 = this.customConversionRate;
            if (customTransferAndPayItem2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customConversionRate");
            }
            customTransferAndPayItem2.mDividerView.setVisibility(8);
            CustomTransferAndPayItem customTransferAndPayItem3 = this.customConversionRate;
            if (customTransferAndPayItem3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customConversionRate");
            }
            customTransferAndPayItem3.mBottomSpace.setVisibility(8);
            View view = this.separatorAmountToSend;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("separatorAmountToSend");
            }
            view.setVisibility(8);
            View view2 = this.separatorAmountToGet;
            if (view2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("separatorAmountToGet");
            }
            view2.setVisibility(8);
            LinearLayout linearLayout4 = this.customAmountToGetLayout;
            if (linearLayout4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customAmountToGetLayout");
            }
            linearLayout4.setPadding(0, 0, 0, 0);
            LinearLayout linearLayout5 = this.customFeeLayout;
            if (linearLayout5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customFeeLayout");
            }
            linearLayout5.setPadding(0, 0, 0, 0);
            CustomNoteItem customNoteItem11 = this.customNote;
            if (customNoteItem11 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customNote");
            }
            customNoteItem11.write();
            CustomNoteItem customNoteItem12 = this.customPersonalDetail;
            if (customNoteItem12 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPersonalDetail");
            }
            customNoteItem12.write();
            CustomNoteItem customNoteItem13 = this.customRecipientAddress;
            if (customNoteItem13 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customRecipientAddress");
            }
            customNoteItem13.write();
            CustomNoteItem customNoteItem14 = this.customRecipientContacts;
            if (customNoteItem14 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customRecipientContacts");
            }
            customNoteItem14.write();
            CustomNoteItem customNoteItem15 = this.customTransactionDetails;
            if (customNoteItem15 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customTransactionDetails");
            }
            customNoteItem15.write();
        }
        if (!TextUtils.isEmpty(setimportance.MediaSessionCompat$QueueItem)) {
            ImageView imageView = this.remittanceLogo;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("remittanceLogo");
            }
            imageView.setVisibility(0);
            if (getContext() != null) {
                ImageView imageView2 = this.remittanceLogo;
                if (imageView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("remittanceLogo");
                }
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$SearchResultReceiver(imageView2, setimportance.MediaSessionCompat$QueueItem);
            }
        }
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(CustomNoteItem customNoteItem, int i, String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            customNoteItem.setVisibility(0);
            customNoteItem.setTitle(getString(i));
            customNoteItem.setText(str);
            View view = customNoteItem.divider;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }
}
