package com.kofax.mobile.sdk.capture;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.ImgReviewEditCntrl;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.impl.view.C8205af;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk._internal.view.ICaptureMenuListener;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.processing.IImageProcessor;
import com.kofax.mobile.sdk.capture.processing.IImageProcessorListener;
import p040o.HmlPinActivity;

public class ProcessActivity extends Activity implements IImageProcessorListener {

    /* renamed from: YA */
    private IParameters f4516YA;

    /* renamed from: YL */
    private String f4517YL = "";
    @HmlPinActivity

    /* renamed from: YT */
    IImageProcessor f4518YT;

    /* renamed from: YU */
    private boolean f4519YU;
    @HmlPinActivity

    /* renamed from: Yw */
    IImageStorage f4520Yw;
    @HmlPinActivity

    /* renamed from: Yx */
    C7898e f4521Yx;
    @HmlPinActivity

    /* renamed from: Yy */
    C8234b f4522Yy;
    @HmlPinActivity

    /* renamed from: Yz */
    C7921h f4523Yz;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Injector.getInjector(this).inject(this);
        this.f4516YA = getParameters(bundle);
        this.f4517YL = getIntent().getStringExtra("_com.kofax.mobile.sdk.capture.internal_image_id_");
        m4693a(this.f4516YA);
        this.f4518YT.setParameters(this.f4516YA.getProcessingParameters());
    }

    /* renamed from: a */
    private void m4693a(IParameters iParameters) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        Bitmap image = this.f4520Yw.getImage(this.f4517YL);
        ImgReviewEditCntrl imgReviewEditCntrl = new ImgReviewEditCntrl(this);
        try {
            imgReviewEditCntrl.setImage(new Image(image));
        } catch (KmcException e) {
            C0767k.m1823e(e);
        }
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.addView(imgReviewEditCntrl);
        relativeLayout.addView(new C8205af(this));
        linearLayout.addView(relativeLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        this.f4522Yy.getView().setLayoutParams(layoutParams2);
        linearLayout.addView(this.f4522Yy.getView(), layoutParams2);
        this.f4522Yy.setExitButtonEnabled(iParameters.getLookAndFeelParameters().exitEnabled);
        this.f4522Yy.setListener(new ICaptureMenuListener() {
            public void onForceCaptureButtonClick() {
            }

            public void onGalleryButtonClick() {
            }

            public void onTorchChange(boolean z) {
            }

            public void onExitButtonClick() {
                ProcessActivity.this.finish();
            }
        });
        setContentView(linearLayout);
    }

    public <T extends IParameters> T getParameters(Bundle bundle) {
        return WorkflowActivity.m4695a(bundle, getIntent(), "_com.kofax.mobile.sdk.capture.internal_parameters_");
    }

    public void onBackPressed() {
        synchronized (this) {
            if (this.f4519YU) {
                this.f4518YT.cancel();
            }
            super.onBackPressed();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    protected void onResume() {
        /*
            r3 = this;
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x0030 }
            super.onResume()     // Catch:{ all -> 0x002d }
            com.kofax.mobile.sdk.capture.processing.IImageProcessor r0 = r3.f4518YT     // Catch:{ all -> 0x002d }
            r0.setImageOutListener(r3)     // Catch:{ all -> 0x002d }
            com.kofax.kmc.ken.engines.data.Image r0 = new com.kofax.kmc.ken.engines.data.Image     // Catch:{ all -> 0x002d }
            com.kofax.mobile.sdk.capture.IImageStorage r1 = r3.f4520Yw     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r3.f4517YL     // Catch:{ all -> 0x002d }
            android.graphics.Bitmap r1 = r1.getImage(r2)     // Catch:{ all -> 0x002d }
            r0.<init>(r1)     // Catch:{ all -> 0x002d }
            com.kofax.mobile.sdk._internal.e r1 = r3.f4521Yx     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r3.f4517YL     // Catch:{ all -> 0x002d }
            android.graphics.Rect r1 = r1.mo54255A(r2)     // Catch:{ all -> 0x002d }
            r0.setTargetFrame(r1)     // Catch:{ all -> 0x002d }
            com.kofax.mobile.sdk.capture.processing.IImageProcessor r1 = r3.f4518YT     // Catch:{ all -> 0x002d }
            r1.process((com.kofax.kmc.ken.engines.data.Image) r0)     // Catch:{ all -> 0x002d }
            r0 = 1
            r3.f4519YU = r0     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            monitor-exit(r3)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.capture.ProcessActivity.onResume():void");
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        synchronized (this) {
            super.onPause();
            this.f4518YT.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("_com.kofax.mobile.sdk.capture.internal_parameters_", this.f4516YA);
        bundle.putString("_com.kofax.mobile.sdk.capture.internal_image_id_", this.f4517YL);
    }

    public void onImageProcessed(Image image) {
        synchronized (this) {
            String bf = this.f4523Yz.mo54329bf();
            this.f4520Yw.setImage(image.getImageBitmap(), bf);
            this.f4521Yx.mo54256a(bf, image.getImageDPI().intValue());
            this.f4521Yx.mo54258a(bf, image.getImageMimeType());
            this.f4521Yx.mo54259a(bf, image.getImageOutputColor());
            Intent intent = new Intent();
            intent.putExtra("_com.kofax.mobile.sdk.capture.internal_image_id_", bf);
            setResult(-1, intent);
            this.f4519YU = false;
            finish();
        }
    }
}
