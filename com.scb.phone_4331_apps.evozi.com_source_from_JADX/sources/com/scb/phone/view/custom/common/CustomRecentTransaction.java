package com.scb.phone.view.custom.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.Futures;
import p040o.setLastBaselineToBottomHeight;

public class CustomRecentTransaction extends RelativeLayout {
    @BindView
    public View borderView;
    @BindView
    TextView dateTextView;
    @BindView
    TextView valueTextView;

    public CustomRecentTransaction(Context context) {
        super(context);
    }

    public CustomRecentTransaction(Context context, Futures.C34072 r5) {
        super(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84602131493686, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.dateTextView.setText(r5.MediaBrowserCompat$CustomActionResultReceiver);
        this.valueTextView.setText(r5.read);
        if (r5.IconCompatParcelizer == 0) {
            r5.IconCompatParcelizer = 17170445;
        }
        this.valueTextView.setTextColor(setLastBaselineToBottomHeight.read(context, r5.IconCompatParcelizer));
    }
}
