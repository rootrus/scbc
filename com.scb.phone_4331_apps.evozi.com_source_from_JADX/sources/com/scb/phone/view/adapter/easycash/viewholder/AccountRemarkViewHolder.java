package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import p040o.onGetStartedClick;

public class AccountRemarkViewHolder extends RecyclerView.setContentView {
    @BindView
    public TextView remark;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountRemarkViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }
}