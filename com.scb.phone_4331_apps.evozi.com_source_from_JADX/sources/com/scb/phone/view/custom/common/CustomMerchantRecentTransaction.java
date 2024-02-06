package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CustomMerchantRecentTransaction extends RelativeLayout {
    private String IconCompatParcelizer = "D";
    @BindView
    public View borderView;
    @BindView
    TextView dateTextView;
    @BindView
    TextView valueTextView;
    private String write = "C";

    public CustomMerchantRecentTransaction(Context context) {
        super(context);
        MediaBrowserCompat$ItemReceiver(context, (AttributeSet) null);
    }

    public CustomMerchantRecentTransaction(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MediaBrowserCompat$ItemReceiver(context, attributeSet);
    }

    public CustomMerchantRecentTransaction(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MediaBrowserCompat$ItemReceiver(context, attributeSet);
    }

    private void MediaBrowserCompat$ItemReceiver(Context context, AttributeSet attributeSet) {
        String str;
        boolean z;
        LayoutInflater.from(getContext()).inflate(R.layout.f84222131493648, this, true);
        ButterKnife.IconCompatParcelizer(this);
        int read = setLastBaselineToBottomHeight.read(context, R.color.f66422131099798);
        String str2 = null;
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.RecentTransactionLayout, 0, 0);
            str2 = obtainStyledAttributes.getString(0);
            String string = obtainStyledAttributes.getString(2);
            int color = obtainStyledAttributes.getColor(3, setLastBaselineToBottomHeight.read(context, R.color.f66422131099798));
            z = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            String str3 = string;
            read = color;
            str = str3;
        } else {
            str = null;
            z = false;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.dateTextView.setText(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.valueTextView.setText(str);
        }
        this.valueTextView.setTextColor(read);
        View view = this.borderView;
        if (view != null) {
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    public void setRecentTransactionDisplay(AutoCrashlyticsReportEncoder autoCrashlyticsReportEncoder) {
        String str;
        this.dateTextView.setText(autoCrashlyticsReportEncoder.MediaMetadataCompat);
        if (this.write.equalsIgnoreCase(autoCrashlyticsReportEncoder.MediaBrowserCompat$ItemReceiver)) {
            this.valueTextView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66422131099798));
            str = String.format(getContext().getString(R.string.credit_value), new Object[]{autoCrashlyticsReportEncoder.write});
        } else if (this.IconCompatParcelizer.equalsIgnoreCase(autoCrashlyticsReportEncoder.MediaBrowserCompat$ItemReceiver)) {
            this.valueTextView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f67152131099871));
            str = String.format(getContext().getString(R.string.debit_value), new Object[]{autoCrashlyticsReportEncoder.write});
        } else {
            str = autoCrashlyticsReportEncoder.write;
        }
        this.valueTextView.setText(str);
    }
}
