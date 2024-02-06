package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.view.View;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.ImgReviewEditCntrl;
import com.kofax.mobile.sdk._internal.view.C0771d;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.i */
public class C0749i extends ImgReviewEditCntrl implements C0771d {
    public View getView() {
        return this;
    }

    @HmlPinActivity
    public C0749i(Context context) {
        super(context);
    }

    public void displayImageCapturedEvent(ImageCapturedEvent imageCapturedEvent) {
        if (imageCapturedEvent != null && imageCapturedEvent.getImage() != null) {
            try {
                setImage(imageCapturedEvent.getImage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void clear() {
        clearImage();
    }
}
