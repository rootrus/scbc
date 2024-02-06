package com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_MyQRCoachMarkActivity;

public class EBillAmountFragment extends BaseFragment {
    public EBillAmountFragment$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaMetadataCompat;
    private String RatingCompat;
    @BindView
    TextInputLayout mInputLayout;
    @BindView
    public AmountEditText mTextInputEditText;

    public static EBillAmountFragment write(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_EBILL_MAX_AMOUNT", str);
        bundle.putString("EXTRA_EBILL_MIN_AMOUNT", str2);
        bundle.putString("EXTRA_EBILL_SPECIFY_AMOUNT", str3);
        EBillAmountFragment eBillAmountFragment = new EBillAmountFragment();
        eBillAmountFragment.setArguments(bundle);
        return eBillAmountFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87152131493942, viewGroup, false);
        this.MediaBrowserCompat$CustomActionResultReceiver = getArguments().getString("EXTRA_EBILL_MAX_AMOUNT");
        this.MediaMetadataCompat = getArguments().getString("EXTRA_EBILL_MIN_AMOUNT");
        this.RatingCompat = getArguments().getString("EXTRA_EBILL_SPECIFY_AMOUNT");
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mTextInputEditText.setCustomHint(getString(R.string.transfer_to_account_amount_hint), this.mInputLayout);
        this.mInputLayout.setHintEnabled(false);
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            this.mTextInputEditText.setEnabled(false);
            this.mTextInputEditText.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
        } else if (!this.MediaMetadataCompat.isEmpty()) {
            this.mTextInputEditText.setEnabled(false);
            this.mTextInputEditText.setText(this.MediaMetadataCompat);
        } else if (!this.RatingCompat.isEmpty()) {
            this.mTextInputEditText.setFormattedAmount(this.RatingCompat);
            this.mTextInputEditText.setOnFocusChangeListener(new ActivityBuilder_MyQRCoachMarkActivity(this));
        }
        this.mTextInputEditText.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                EBillAmountFragment$MediaBrowserCompat$ItemReceiver eBillAmountFragment$MediaBrowserCompat$ItemReceiver = EBillAmountFragment.this.IconCompatParcelizer;
                if (eBillAmountFragment$MediaBrowserCompat$ItemReceiver != null) {
                    eBillAmountFragment$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(d);
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                EBillAmountFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        return inflate;
    }
}
