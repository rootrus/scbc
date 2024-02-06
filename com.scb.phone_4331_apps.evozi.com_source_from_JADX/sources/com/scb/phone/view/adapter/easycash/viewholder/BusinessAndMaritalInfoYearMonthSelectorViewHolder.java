package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.custom.CustomExternalSelector;
import p040o.onGetStartedClick;

public final class BusinessAndMaritalInfoYearMonthSelectorViewHolder extends RecyclerView.setContentView {
    @BindView
    public CustomExternalSelector cesSelector;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessAndMaritalInfoYearMonthSelectorViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }
}
