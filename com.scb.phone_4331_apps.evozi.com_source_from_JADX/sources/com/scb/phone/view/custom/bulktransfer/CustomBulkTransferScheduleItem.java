package com.scb.phone.view.custom.bulktransfer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayInfo;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CustomBulkTransferScheduleItem extends CustomTransferAndPayInfo {
    @BindView
    View divider;
    @BindView
    ImageTextView mSourceNameTextView;
    @BindView
    TextView mSourceTextView;
    @BindView
    FrameLayout sourceInfoLayout;
    private boolean write;

    public CustomBulkTransferScheduleItem(Context context, AttributeSet attributeSet) {
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
        FragmentBuilder_BindDepositSelectorFragment.read(getContext(), (int) R.drawable.bankicon_place_holder, this.mSourceNameTextView, str, getResources().getDimensionPixelOffset(R.dimen.f74412131165877), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
    }

    public void setText(String str) {
        this.mSourceTextView.setText(str);
    }

    public void setSourceName(String str) {
        this.mSourceNameTextView.setText(str);
    }
}
