package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CustomTransferAndPaySource extends CustomTransferAndPayInfo {
    @BindView
    View divider;
    @BindView
    TextView mAccountBalance;
    @BindView
    public TextView mAccountNumberTextView;
    @BindView
    public LinearLayout mSourceLinearLayout;
    @BindView
    ImageTextView mSourceNameTextView;
    @BindView
    TextView mSourceTextView;
    @BindView
    FrameLayout sourceInfoLayout;
    private boolean write;

    public CustomTransferAndPaySource(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomTransferAndPaySource(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomTransferAndPaySource, 0, 0);
        this.write = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f85072131493734, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.divider.setVisibility(!this.write ? 8 : i);
    }

    public void setAvatar(String str) {
        setAvatar(str, R.drawable.bankicon_place_holder);
    }

    public void setAvatar(String str, int i) {
        FragmentBuilder_BindDepositSelectorFragment.read(getContext(), i, this.mSourceNameTextView, str, getResources().getDimensionPixelOffset(R.dimen.f74412131165877), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
    }

    public void setText(String str) {
        this.mSourceTextView.setText(str);
    }

    public void setSourceName(String str) {
        this.mSourceNameTextView.setText(str);
    }

    public void setSourceNameGrayColor(Context context) {
        this.mSourceNameTextView.setTextColor(-6975079);
    }

    public void setAccountNumber(String str) {
        this.mAccountNumberTextView.setText(str);
    }

    public void setAccountBalance(String str) {
        this.mAccountBalance.setVisibility(0);
        this.mAccountBalance.setText(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ImageTextView imageTextView = this.mSourceNameTextView;
        imageTextView.MediaBrowserCompat$ItemReceiver = null;
        CharSequence text = imageTextView.getText();
        if (text != null) {
            imageTextView.setText(text.toString().replace("[scbImage]", ""));
        }
    }

    public void setRightSpace(int i) {
        this.mSourceNameTextView.setPadding(0, 0, i, 0);
    }

    public void setDivider(boolean z) {
        this.write = z;
        this.divider.setVisibility(z ? 0 : 8);
    }

    public void setDividerLeftPadding(int i) {
        this.divider.setPadding(i, 0, 0, 0);
    }
}
