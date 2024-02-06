package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CustomTransferAndPayItem extends RelativeLayout {
    private boolean IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public CustomAmountInfo amountInfo;
    @BindView
    public LinearLayout lineView;
    @BindView
    public View mBottomSpace;
    @BindView
    View mDividerSpaceView;
    @BindView
    public View mDividerView;
    @BindView
    TextView mTitleTextView;
    @BindView
    public View mTopSpace;
    @BindView
    public TextView mValueTextView;
    @BindView
    public ThaiTextView scheduleFeeText;
    @BindView
    TextView tvDateTimeRateChange;

    public CustomTransferAndPayItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomTransferAndPayItem, 0, 0);
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getString(1);
        this.IconCompatParcelizer = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f85062131493733, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.mTitleTextView.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.mDividerView.setVisibility(!this.IconCompatParcelizer ? 8 : i);
    }

    public void setText(String str) {
        this.mTitleTextView.setText(str);
    }

    public void setValue(String str) {
        this.mValueTextView.setText(str);
    }

    public void setFullDivider(boolean z) {
        this.mDividerSpaceView.setVisibility(z ? 8 : 0);
    }

    public void setDescriptionText(String str) {
        this.scheduleFeeText.setText(str);
    }

    public void setDescriptionAlignToLeft() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.scheduleFeeText.getLayoutParams();
        layoutParams.addRule(9);
        this.scheduleFeeText.setLayoutParams(layoutParams);
    }
}
