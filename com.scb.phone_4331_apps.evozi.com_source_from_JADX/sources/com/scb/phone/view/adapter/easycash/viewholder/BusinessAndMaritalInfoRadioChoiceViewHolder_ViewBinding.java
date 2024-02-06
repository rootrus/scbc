package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class BusinessAndMaritalInfoRadioChoiceViewHolder_ViewBinding implements Unbinder {
    private BusinessAndMaritalInfoRadioChoiceViewHolder IconCompatParcelizer;

    public BusinessAndMaritalInfoRadioChoiceViewHolder_ViewBinding(BusinessAndMaritalInfoRadioChoiceViewHolder businessAndMaritalInfoRadioChoiceViewHolder, View view) {
        this.IconCompatParcelizer = businessAndMaritalInfoRadioChoiceViewHolder;
        businessAndMaritalInfoRadioChoiceViewHolder.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'tvTitle'", TextView.class);
        businessAndMaritalInfoRadioChoiceViewHolder.radioGroup = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rg_business_marital, "field 'radioGroup'", RadioGroup.class);
        businessAndMaritalInfoRadioChoiceViewHolder.rbFirst = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rb_first, "field 'rbFirst'", RadioButton.class);
        businessAndMaritalInfoRadioChoiceViewHolder.rbSecond = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rb_second, "field 'rbSecond'", RadioButton.class);
        businessAndMaritalInfoRadioChoiceViewHolder.paddingBottom = onStart.IconCompatParcelizer(view, R.id.view_padding_bottom, "field 'paddingBottom'");
    }

    public final void read() {
        BusinessAndMaritalInfoRadioChoiceViewHolder businessAndMaritalInfoRadioChoiceViewHolder = this.IconCompatParcelizer;
        if (businessAndMaritalInfoRadioChoiceViewHolder != null) {
            this.IconCompatParcelizer = null;
            businessAndMaritalInfoRadioChoiceViewHolder.tvTitle = null;
            businessAndMaritalInfoRadioChoiceViewHolder.radioGroup = null;
            businessAndMaritalInfoRadioChoiceViewHolder.rbFirst = null;
            businessAndMaritalInfoRadioChoiceViewHolder.rbSecond = null;
            businessAndMaritalInfoRadioChoiceViewHolder.paddingBottom = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
