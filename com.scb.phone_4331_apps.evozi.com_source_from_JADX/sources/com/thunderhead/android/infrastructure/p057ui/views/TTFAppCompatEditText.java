package com.thunderhead.android.infrastructure.p057ui.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import p040o.CropDocumentActivity_ViewBinding;
import p040o.setLastBaselineToBottomHeight;

/* renamed from: com.thunderhead.android.infrastructure.ui.views.TTFAppCompatEditText */
public class TTFAppCompatEditText extends AppCompatEditText {
    private FontIconDrawableTextView write;

    public TTFAppCompatEditText(Context context) {
        super(context);
        FontIconDrawableTextView fontIconDrawableTextView = new FontIconDrawableTextView(this);
        this.write = fontIconDrawableTextView;
        fontIconDrawableTextView.read(context);
    }

    public TTFAppCompatEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FontIconDrawableTextView fontIconDrawableTextView = new FontIconDrawableTextView(this);
        this.write = fontIconDrawableTextView;
        fontIconDrawableTextView.MediaBrowserCompat$CustomActionResultReceiver(context, attributeSet).read(context);
    }

    public TTFAppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FontIconDrawableTextView fontIconDrawableTextView = new FontIconDrawableTextView(this);
        this.write = fontIconDrawableTextView;
        fontIconDrawableTextView.MediaBrowserCompat$CustomActionResultReceiver(context, attributeSet).read(context);
    }

    public void setFontIcon(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i) {
        FontIconDrawableTextView fontIconDrawableTextView = this.write;
        fontIconDrawableTextView.read(cropDocumentActivity_ViewBinding, getResources().getString(i), cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.LEFT ? fontIconDrawableTextView.MediaBrowserCompat$CustomActionResultReceiver : fontIconDrawableTextView.IconCompatParcelizer);
    }

    public void setFontIcon(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i, float f) {
        this.write.read(cropDocumentActivity_ViewBinding, getResources().getString(i), f);
    }

    public void setColor(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i) {
        this.write.read(cropDocumentActivity_ViewBinding, setLastBaselineToBottomHeight.read(getContext(), i));
    }

    public void setFontIcon(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i, int i2) {
        setFontIcon(cropDocumentActivity_ViewBinding, i);
        setColor(cropDocumentActivity_ViewBinding, i2);
    }
}
