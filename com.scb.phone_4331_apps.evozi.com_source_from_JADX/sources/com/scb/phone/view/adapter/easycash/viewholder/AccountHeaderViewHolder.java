package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import p040o.onGetStartedClick;

public class AccountHeaderViewHolder extends RecyclerView.setContentView {
    @BindView
    public CustomEasyCashSectionLabel textHeader;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountHeaderViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
    }
}
