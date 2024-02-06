package com.scb.phone.view.custom.mailingaddress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import kotlin.TypeCastException;
import p040o.onGetStartedClick;

public final class BulletThaiTextView extends LinearLayout {
    @BindView
    public TextView tvBullet;
    @BindView
    public TextView tvRemark;

    public final void setTvRemark(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvRemark = textView;
    }

    public final void setTvBullet(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvBullet = textView;
    }

    public BulletThaiTextView(Context context) {
        super(context);
        read();
    }

    public BulletThaiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        read();
    }

    private void read() {
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f81142131493340, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setText(String str) {
        onGetStartedClick.write((Object) str, "text");
        TextView textView = this.tvRemark;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
        }
        textView.setText(str);
    }
}
