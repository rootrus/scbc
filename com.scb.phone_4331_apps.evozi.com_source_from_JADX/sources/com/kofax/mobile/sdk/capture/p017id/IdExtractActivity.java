package com.kofax.mobile.sdk.capture.p017id;

import android.os.Bundle;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.ExtractActivity;
import com.kofax.mobile.sdk.capture.p017id.IdParameters;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdExtractActivity */
public class IdExtractActivity extends ExtractActivity<IdExtractorResponse> {
    private static final String TAG = IdExtractActivity.class.getSimpleName();
    private static final int acy = 300;
    private IdParameters acA;
    @HmlPinActivity
    IdExtractor acz;

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
        IdParameters idParameters = (IdParameters) getParameters(bundle);
        this.acA = idParameters;
        this.acz.setParameters(idParameters);
        setExtract(this.acz);
    }

    public Image getImageByBitmapId(String str) {
        Image imageByBitmapId = super.getImageByBitmapId(str);
        if (imageByBitmapId.getImageDPI().intValue() < acy) {
            imageByBitmapId.setImageDPI(acy);
        }
        return imageByBitmapId;
    }

    public void extract(Image image) {
        if (this.acA == null) {
            C0767k.m1814d(TAG, "assuming it's front side");
            this.acz.extract(image, null);
            return;
        }
        Image tT = m4723tT();
        if (this.acA.side == IdParameters.IdSide.FRONT) {
            this.acz.extract(image, tT);
            return;
        }
        this.acz.extract(tT, image);
    }

    /* renamed from: tT */
    private Image m4723tT() {
        try {
            return getImageByBitmapId(this.acA.reverseSideId.processedImageId);
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
