package com.scb.phone.view.custom.investment.scbs.open;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;

public class OnboardingInputAddressItemCustomView extends LinearLayout {
    @BindView
    public EditText inputAddressEditText;
    @BindView
    TextView titleTextView;

    public OnboardingInputAddressItemCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f83502131493576, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setTitle(int i) {
        this.titleTextView.setText(getContext().getString(i));
    }

    public void setTextHint(int i) {
        this.inputAddressEditText.setHint(getContext().getString(i));
    }

    public void setText(String str) {
        this.inputAddressEditText.append(str);
    }

    public void setTextInputLimit(int i) {
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(i);
        this.inputAddressEditText.setFilters(new InputFilter[]{lengthFilter});
    }

    public void setTitleWithMandatory(int i) {
        String string = getContext().getString(i);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("*");
        String obj = sb.toString();
        getResources();
        SpannableString spannableString = new SpannableString(obj);
        spannableString.setSpan(new ForegroundColorSpan(-1024159), obj.length() - 1, obj.length(), 0);
        this.titleTextView.setText(spannableString);
    }
}
