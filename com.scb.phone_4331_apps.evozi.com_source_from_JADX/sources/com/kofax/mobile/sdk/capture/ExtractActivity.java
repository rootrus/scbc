package com.kofax.mobile.sdk.capture;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.impl.view.C8205af;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk._internal.view.ICaptureMenuListener;
import com.kofax.mobile.sdk.capture.extraction.Extractor;
import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;
import com.kofax.mobile.sdk.capture.extraction.IExtractorListener;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlPinActivity;

public abstract class ExtractActivity<T extends ExtractorResponse> extends Activity implements IExtractorListener<T> {
    public static final String CERTIFICATE_VALIDATOR_LISTENER = "_com.kofax.mobile.sdk.capture._certificate_validator_listener_";

    /* renamed from: JI */
    private CertificateValidatorListener f4497JI;

    /* renamed from: YA */
    private IParameters f4498YA;
    @HmlPinActivity

    /* renamed from: YK */
    IImageStorage f4499YK;

    /* renamed from: YL */
    private String f4500YL = "";
    @HmlPinActivity

    /* renamed from: Yx */
    C7898e f4501Yx;
    @HmlPinActivity

    /* renamed from: Yy */
    C8234b f4502Yy;
    protected Extractor<T> _extractor;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4498YA = getParameters(bundle);
        this.f4500YL = getIntent().getStringExtra("_com.kofax.mobile.sdk.capture.internal_image_id_");
        this.f4497JI = WorkflowActivity.m4694a(bundle, getIntent());
        m4686a(this.f4498YA);
    }

    /* renamed from: a */
    private void m4686a(IParameters iParameters) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        Bitmap image = this.f4499YK.getImage(this.f4500YL);
        ImageView imageView = new ImageView(this);
        imageView.setImageBitmap(image);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.addView(imageView);
        relativeLayout.addView(new C8205af(this));
        linearLayout.addView(relativeLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        this.f4502Yy.getView().setLayoutParams(layoutParams2);
        linearLayout.addView(this.f4502Yy.getView(), layoutParams2);
        this.f4502Yy.setExitButtonEnabled(iParameters.getLookAndFeelParameters().exitEnabled);
        this.f4502Yy.setListener(new ICaptureMenuListener() {
            public void onForceCaptureButtonClick() {
            }

            public void onGalleryButtonClick() {
            }

            public void onTorchChange(boolean z) {
            }

            public void onExitButtonClick() {
                ExtractActivity.this.finish();
            }
        });
        setContentView(linearLayout);
    }

    public <T extends IParameters> T getParameters(Bundle bundle) {
        return WorkflowActivity.m4695a(bundle, getIntent(), "_com.kofax.mobile.sdk.capture.internal_parameters_");
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        synchronized (this) {
            super.onResume();
            this._extractor.setExtractorListener(this);
            this._extractor.setCertificateValidatorListener(this.f4497JI);
            extract(getImageByBitmapId(this.f4500YL));
        }
    }

    public Image getImageByBitmapId(String str) {
        Image image = new Image(this.f4499YK.getImage(str));
        Image.ImageMimeType x = this.f4501Yx.mo54260x(str);
        if (x == Image.ImageMimeType.MIMETYPE_UNKNOWN) {
            x = Image.ImageMimeType.MIMETYPE_TIFF;
        }
        image.setImageMimeType(x);
        image.setImageDPI(Math.max(this.f4501Yx.mo54261y(str), 96));
        image.setImageOutputColor(this.f4501Yx.mo54262z(str));
        return image;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("_com.kofax.mobile.sdk.capture.internal_parameters_", this.f4498YA);
        bundle.putString("_com.kofax.mobile.sdk.capture.internal_image_id_", this.f4500YL);
        bundle.putSerializable("_com.kofax.mobile.sdk.capture._certificate_validator_listener_", this.f4497JI);
    }

    /* access modifiers changed from: protected */
    public void extract(Image image) {
        this._extractor.extract(image);
    }

    public void onExtractionComplete(T t) {
        Intent intent = new Intent();
        intent.putExtra("_com.kofax.mobile.sdk.capture.internal_extraction_result_", t);
        setResult(-1, intent);
        finish();
    }

    public void setExtract(Extractor extractor) {
        this._extractor = extractor;
    }
}
