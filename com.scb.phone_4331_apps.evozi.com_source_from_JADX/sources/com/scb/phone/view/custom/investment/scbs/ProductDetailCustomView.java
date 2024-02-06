package com.scb.phone.view.custom.investment.scbs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.getICheckDeserializerRtti;
import p040o.getKeysFileForSession;

public class ProductDetailCustomView extends RelativeLayout {
    @BindView
    TextView label;
    @BindView
    public View separator;
    @BindView
    TextView value;

    public ProductDetailCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ProductDetailCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProductDetailCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84402131493666, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setDisplay(getKeysFileForSession getkeysfileforsession) {
        String replaceAll = getkeysfileforsession.write.replaceAll(" ", "\n");
        String str = getkeysfileforsession.IconCompatParcelizer;
        if ("integer".equalsIgnoreCase(getkeysfileforsession.MediaBrowserCompat$CustomActionResultReceiver)) {
            str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((double) Integer.valueOf(getkeysfileforsession.IconCompatParcelizer).intValue());
        } else if ("decimal".equalsIgnoreCase(getkeysfileforsession.MediaBrowserCompat$CustomActionResultReceiver)) {
            str = getkeysfileforsession.IconCompatParcelizer;
        }
        this.label.setText(replaceAll);
        this.value.setText(str);
    }
}
