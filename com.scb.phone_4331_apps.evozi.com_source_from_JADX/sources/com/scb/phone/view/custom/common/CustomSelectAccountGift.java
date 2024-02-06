package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindCloseAccountDetailsFragment;
import p040o.submitInvestmentExperience;

public class CustomSelectAccountGift extends LinearLayout {
    @BindView
    RelativeLayout mSelectAccountButton;

    public CustomSelectAccountGift(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84702131493697, this, true);
        setOrientation(0);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setOnSelectAccountGiftListener(FragmentBuilder_BindCloseAccountDetailsFragment fragmentBuilder_BindCloseAccountDetailsFragment) {
        setOnClickListener(new submitInvestmentExperience(fragmentBuilder_BindCloseAccountDetailsFragment));
    }
}
