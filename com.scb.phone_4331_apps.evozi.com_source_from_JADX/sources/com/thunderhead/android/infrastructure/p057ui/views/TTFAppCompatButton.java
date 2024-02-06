package com.thunderhead.android.infrastructure.p057ui.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import p040o.CropDocumentActivity_ViewBinding;
import p040o.setLastBaselineToBottomHeight;

/* renamed from: com.thunderhead.android.infrastructure.ui.views.TTFAppCompatButton */
public final class TTFAppCompatButton extends AppCompatButton {
    private FontIconDrawableTextView IconCompatParcelizer;

    public TTFAppCompatButton(Context context) {
        super(context);
        FontIconDrawableTextView fontIconDrawableTextView = new FontIconDrawableTextView(this);
        this.IconCompatParcelizer = fontIconDrawableTextView;
        fontIconDrawableTextView.read(context);
    }

    public TTFAppCompatButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FontIconDrawableTextView fontIconDrawableTextView = new FontIconDrawableTextView(this);
        this.IconCompatParcelizer = fontIconDrawableTextView;
        fontIconDrawableTextView.MediaBrowserCompat$CustomActionResultReceiver(context, attributeSet).read(context);
    }

    public TTFAppCompatButton(Context context, AttributeSet attributeSet, int i) {
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
}
