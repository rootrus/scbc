package com.scb.phone.view.custom.tierpricing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReport.Builder;
import p040o.onGetStartedClick;

public abstract class BaseProductCatalogueView<D extends CrashlyticsReport.Builder> extends FrameLayout {
    public abstract int IconCompatParcelizer();

    public abstract void setDisplay(D d);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseProductCatalogueView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        LayoutInflater.from(getContext()).inflate(IconCompatParcelizer(), this, true);
        ButterKnife.IconCompatParcelizer(this);
    }
}
