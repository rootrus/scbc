package com.scb.phone.view.adapter.ccrredemption.product;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class PaginationViewFooterHolder extends RecyclerView.setContentView {
    @BindView
    public ViewGroup inlineLoader;
    @BindView
    public ViewGroup paginationStatusView;
    @BindView
    public ViewGroup tapToRetryView;

    public PaginationViewFooterHolder(View view) {
        super(view);
        ButterKnife.IconCompatParcelizer(this, view);
    }
}
