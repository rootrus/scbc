package com.scb.phone.view.activity.prepaid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class PointTabHolder {
    public View MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    LinearLayout layoutPointValue;
    @BindView
    TextView tvPointLabel;
    @BindView
    TextView tvPointValue;
    @BindView
    TextView tvRemark;
    @BindView
    TextView tvUnable;
    @BindView
    TextView tvYouHave;

    public PointTabHolder(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f92262131494453, viewGroup, false);
        this.MediaBrowserCompat$CustomActionResultReceiver = inflate;
        ButterKnife.IconCompatParcelizer(this, inflate);
    }
}
