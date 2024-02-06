package com.thunderhead.android.infrastructure.p057ui.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p040o.CropDocumentActivity_ViewBinding;
import p040o.setLastBaselineToBottomHeight;

/* renamed from: com.thunderhead.android.infrastructure.ui.views.TTFAppCompatTextView */
public class TTFAppCompatTextView extends AppCompatTextView {
    private FontIconDrawableTextView MediaBrowserCompat$CustomActionResultReceiver;

    public TTFAppCompatTextView(Context context) {
        super(context);
        FontIconDrawableTextView fontIconDrawableTextView = new FontIconDrawableTextView(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = fontIconDrawableTextView;
        fontIconDrawableTextView.read(context);
    }

    public TTFAppCompatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FontIconDrawableTextView fontIconDrawableTextView = new FontIconDrawableTextView(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = fontIconDrawableTextView;
        fontIconDrawableTextView.MediaBrowserCompat$CustomActionResultReceiver(context, attributeSet).read(context);
    }

    public TTFAppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FontIconDrawableTextView fontIconDrawableTextView = new FontIconDrawableTextView(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = fontIconDrawableTextView;
        fontIconDrawableTextView.MediaBrowserCompat$CustomActionResultReceiver(context, attributeSet).read(context);
    }

    public void setFontIcon(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i) {
        FontIconDrawableTextView fontIconDrawableTextView = this.MediaBrowserCompat$CustomActionResultReceiver;
        fontIconDrawableTextView.read(cropDocumentActivity_ViewBinding, getResources().getString(i), cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.LEFT ? fontIconDrawableTextView.MediaBrowserCompat$CustomActionResultReceiver : fontIconDrawableTextView.IconCompatParcelizer);
    }

    public void setFontIcon(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i, float f) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(cropDocumentActivity_ViewBinding, getResources().getString(i), f);
    }

    public void setColor(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(cropDocumentActivity_ViewBinding, setLastBaselineToBottomHeight.read(getContext(), i));
    }

    public void setFontIcon(CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding, int i, int i2) {
        setFontIcon(cropDocumentActivity_ViewBinding, i);
        setColor(cropDocumentActivity_ViewBinding, i2);
    }
}
