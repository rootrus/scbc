package com.scb.phone.view.adapter.creditcardpurchase;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import p040o.onGetStartedClick;

public final class TenureViewHolder extends RecyclerView.setContentView {
    public final View AlertController$RecycleListView;
    @BindView
    public RelativeLayout rlContainer;
    @BindView
    public TextView tvTenure;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TenureViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        this.AlertController$RecycleListView = view;
        ButterKnife.IconCompatParcelizer(this, view);
    }
}
