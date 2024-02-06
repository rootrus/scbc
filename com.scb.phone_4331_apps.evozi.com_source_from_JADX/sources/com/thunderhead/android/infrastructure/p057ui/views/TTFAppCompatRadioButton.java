package com.thunderhead.android.infrastructure.p057ui.views;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatRadioButton;
import java.util.Locale;
import p040o.CropDocumentActivity_ViewBinding;
import p040o.setLastBaselineToBottomHeight;

/* renamed from: com.thunderhead.android.infrastructure.ui.views.TTFAppCompatRadioButton */
public final class TTFAppCompatRadioButton extends AppCompatRadioButton implements View.OnLayoutChangeListener {
    public FontIconDrawableTextView IconCompatParcelizer;

    public TTFAppCompatRadioButton(Context context) {
        super(context);
        FontIconDrawableTextView fontIconDrawableTextView = new FontIconDrawableTextView(this);
        this.IconCompatParcelizer = fontIconDrawableTextView;
        fontIconDrawableTextView.read(context);
    }

    public TTFAppCompatRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FontIconDrawableTextView fontIconDrawableTextView = new FontIconDrawableTextView(this);
        this.IconCompatParcelizer = fontIconDrawableTextView;
        fontIconDrawableTextView.MediaBrowserCompat$CustomActionResultReceiver(context, attributeSet).read(context);
    }

    public TTFAppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FontIconDrawableTextView fontIconDrawableTextView = new FontIconDrawableTextView(this);
        this.IconCompatParcelizer = fontIconDrawableTextView;
        fontIconDrawableTextView.MediaBrowserCompat$CustomActionResultReceiver(context, attributeSet).read(context);
    }

    public final void setFontIcon(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i) {
        FontIconDrawableTextView fontIconDrawableTextView = this.IconCompatParcelizer;
        fontIconDrawableTextView.read(cropDocumentActivity_ViewBinding, getResources().getString(i), cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.LEFT ? fontIconDrawableTextView.MediaBrowserCompat$CustomActionResultReceiver : fontIconDrawableTextView.IconCompatParcelizer);
    }

    public final void setFontIcon(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i, float f) {
        this.IconCompatParcelizer.read(cropDocumentActivity_ViewBinding, getResources().getString(i), f);
    }

    public final void setColor(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i) {
        this.IconCompatParcelizer.read(cropDocumentActivity_ViewBinding, setLastBaselineToBottomHeight.read(getContext(), i));
    }

    public final void setFontIcon(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i, int i2) {
        setFontIcon(cropDocumentActivity_ViewBinding, i);
        setColor(cropDocumentActivity_ViewBinding, i2);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String charSequence = getText().toString();
        int indexOf = charSequence.indexOf(10);
        if (indexOf < 0) {
            indexOf = charSequence.length();
        }
        String substring = charSequence.substring(0, indexOf);
        float measureText = getPaint().measureText(substring);
        float width = (float) ((getWidth() - this.IconCompatParcelizer.read(CropDocumentActivity_ViewBinding.LEFT)) - this.IconCompatParcelizer.read(CropDocumentActivity_ViewBinding.RIGHT));
        if (measureText >= width) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
            int floor = (int) StrictMath.floor((double) (((float) substring.length()) * (width / measureText)));
            int i9 = (floor - 1) - 1;
            setText(spannableStringBuilder.replace(i9, indexOf, String.format(Locale.getDefault(), "%s", new Object[]{"…"})));
        }
    }
}
