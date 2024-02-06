package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.parseReport;
import p040o.setLastBaselineToBottomHeight;

public class CustomAmountInfoItem extends RelativeLayout {
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TextView asideValue;
    @BindView
    TextView title;
    @BindView
    TextView value;

    public CustomAmountInfoItem(Context context, parseReport parsereport, boolean z, boolean z2) {
        super(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81072131493333, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        if (z2) {
            this.title.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f65772131099731));
            this.asideValue.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$CustomActionResultReceiver, R.color.f65772131099731));
            this.asideValue.setTextSize(24.0f);
        }
        this.title.setText(parsereport.IconCompatParcelizer);
        if (z) {
            String str = parsereport.MediaBrowserCompat$ItemReceiver;
            TextView textView = this.asideValue;
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        String str2 = parsereport.MediaBrowserCompat$ItemReceiver;
        TextView textView2 = this.value;
        textView2.setText(str2);
        textView2.setVisibility(0);
    }
}
