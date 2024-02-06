package com.scb.phone.view.custom.tierpricing;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import p040o.onGetStartedClick;
import p040o.withSessionEndFields;

public final class ProductCatalogueTitleView extends BaseProductCatalogueView<withSessionEndFields> {
    @BindView
    public TextView titleColumn;
    @BindView
    public ThaiTextView valueColumn;

    public final int IconCompatParcelizer() {
        return R.layout.f84392131493665;
    }

    public /* synthetic */ ProductCatalogueTitleView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductCatalogueTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void setTitleColumn(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.titleColumn = textView;
    }

    public final void setValueColumn(ThaiTextView thaiTextView) {
        onGetStartedClick.write((Object) thaiTextView, "<set-?>");
        this.valueColumn = thaiTextView;
    }

    public final void setDisplay(withSessionEndFields withsessionendfields) {
        onGetStartedClick.write((Object) withsessionendfields, "display");
        TextView textView = this.titleColumn;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("titleColumn");
        }
        textView.setText(withsessionendfields.read);
        ThaiTextView thaiTextView = this.valueColumn;
        if (thaiTextView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("valueColumn");
        }
        thaiTextView.setText(withsessionendfields.write);
    }
}
