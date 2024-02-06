package com.scb.phone.view.custom.investment.scbs.open;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.NativeSessionFileGzipper;

public class PersonalInfoItemCustomView extends RelativeLayout {
    @BindView
    TextView label;
    @BindView
    View separator;
    @BindView
    TextView value;

    public PersonalInfoItemCustomView(Context context) {
        this(context, (AttributeSet) null);
    }

    public PersonalInfoItemCustomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PersonalInfoItemCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84292131493655, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setDisplay(NativeSessionFileGzipper nativeSessionFileGzipper) {
        this.label.setText((CharSequence) null);
        this.value.setText((CharSequence) null);
        this.separator.setVisibility(nativeSessionFileGzipper.IconCompatParcelizer ? 0 : 8);
    }
}
