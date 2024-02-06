package com.kofax.mobile.sdk.capture;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.service.ImageService;
import com.kofax.kmc.kui.uicontrols.ImgReviewEditCntrl;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.view.C8236l;
import com.kofax.mobile.sdk._internal.view.IReviewImageMenuListener;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlPinActivity;

public class ImageReviewActivity extends Activity {

    /* renamed from: YP */
    private static final int f4507YP = -16777216;

    /* renamed from: YL */
    private String f4508YL = "";
    @HmlPinActivity

    /* renamed from: YO */
    C8236l f4509YO;
    @HmlPinActivity

    /* renamed from: Yt */
    IImageStorage f4510Yt;

    /* renamed from: com.kofax.mobile.sdk.capture.ImageReviewActivity$a */
    class C8306a extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: YR */
        private final ImgReviewEditCntrl f4513YR;

        public C8306a(ImgReviewEditCntrl imgReviewEditCntrl) {
            this.f4513YR = imgReviewEditCntrl;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Bitmap doInBackground(String... strArr) {
            return ImageService.rotateBitmap(ImageReviewActivity.this.f4510Yt.getImage(strArr[0]), true, false, false);
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            try {
                this.f4513YR.setImage(new Image(bitmap));
            } catch (KmcException e) {
                C0767k.m1823e(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m4691tA();
        Injector.getInjector(this).inject(this);
        this.f4508YL = getIntent().getStringExtra("_com.kofax.mobile.sdk.capture.internal_image_id_");
        m4689a(getParameters(bundle));
    }

    /* renamed from: a */
    private void m4689a(IParameters iParameters) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        ImgReviewEditCntrl imgReviewEditCntrl = new ImgReviewEditCntrl(this);
        imgReviewEditCntrl.setBackgroundColor(f4507YP);
        new C8306a(imgReviewEditCntrl).execute(new String[]{this.f4508YL});
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.addView(imgReviewEditCntrl, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(relativeLayout, new LinearLayout.LayoutParams(-2, -2, 1.0f));
        m4687a(linearLayout);
        setContentView(linearLayout);
    }

    /* renamed from: a */
    private void m4687a(LinearLayout linearLayout) {
        this.f4509YO.setListener(new IReviewImageMenuListener() {
            public void onAcceptButtonClick() {
                ImageReviewActivity.this.m4690s(-1);
            }

            public void onRetakeButtonClick() {
                ImageReviewActivity.this.m4690s(0);
            }
        });
        linearLayout.addView((LinearLayout) this.f4509YO, new LinearLayout.LayoutParams(-1, -2));
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m4690s(int i) {
        setResult(i);
        finish();
    }

    /* renamed from: tA */
    private void m4691tA() {
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(128);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        getWindow().setAttributes(attributes);
    }

    public <T extends IParameters> T getParameters(Bundle bundle) {
        return WorkflowActivity.m4695a(bundle, getIntent(), "_com.kofax.mobile.sdk.capture.internal_parameters_");
    }
}
