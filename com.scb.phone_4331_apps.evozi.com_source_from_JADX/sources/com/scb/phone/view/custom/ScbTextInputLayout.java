package com.scb.phone.view.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputLayout;
import p039io.github.inflationx.calligraphy3.CalligraphyTypefaceSpan;

public class ScbTextInputLayout extends TextInputLayout {
    private Context ParcelableVolumeInfo;

    public ScbTextInputLayout(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public ScbTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScbTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ParcelableVolumeInfo = context;
    }

    public void setError(CharSequence charSequence) {
        SpannableString spannableString;
        if (!TextUtils.isEmpty(charSequence)) {
            CalligraphyTypefaceSpan calligraphyTypefaceSpan = new CalligraphyTypefaceSpan(Typeface.createFromAsset(this.ParcelableVolumeInfo.getAssets(), "fonts/db_heavent_regular.ttf"));
            spannableString = new SpannableString(charSequence);
            spannableString.setSpan(calligraphyTypefaceSpan, 0, charSequence.length(), 33);
        } else {
            spannableString = null;
        }
        super.setError(spannableString);
    }
}
