package com.kofax.mobile.sdk.capture.check;

import android.os.Bundle;
import com.kofax.kmc.ken.engines.data.CheckSide;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.ExtractActivity;
import p040o.HmlPinActivity;

public class CheckExtractActivity extends ExtractActivity<CheckExtractorResponse> {
    @HmlPinActivity
    CheckExtractor aao;
    private CheckParameters aap;

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
        CheckParameters checkParameters = (CheckParameters) getParameters(bundle);
        this.aap = checkParameters;
        this.aao.setParameters(checkParameters);
        setExtract(this.aao);
    }

    public void extract(Image image) {
        CheckParameters checkParameters = this.aap;
        if (checkParameters == null || checkParameters.reverseSideCheck == null) {
            this.aao.extract(image);
        } else if (CheckSide.FRONT.equals(this.aap.side)) {
            this.aao.extract(image, getImageByBitmapId(this.aap.reverseSideCheck.processedImageId));
        } else {
            this.aao.extract(getImageByBitmapId(this.aap.reverseSideCheck.processedImageId), image);
        }
    }
}
