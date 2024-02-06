package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import com.kofax.kmc.kui.uicontrols.captureanimations.CaptureMessage;
import com.kofax.kmc.kui.uicontrols.captureanimations.ILicenseOverlayView;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import com.manateeworks.kfx.BarcodeScanner;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

public class LicenseCaptureView extends ImageCaptureView {

    /* renamed from: lW */
    private static final double f3518lW = 10.0d;

    /* renamed from: lX */
    private final List<LicenseFoundListener> f3519lX;
    @HmlPinActivity

    /* renamed from: lY */
    ILicenseOverlayView f3520lY;

    /* renamed from: lZ */
    private boolean f3521lZ;

    /* access modifiers changed from: protected */
    public void checkLicense() {
    }

    public LicenseCaptureView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public LicenseCaptureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LicenseCaptureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3519lX = new CopyOnWriteArrayList();
        this.f3521lZ = false;
        if (!isInEditMode()) {
            m3783aD();
            this.f3520lY.init();
            addView(this.f3520lY.getView());
            setViewfinderPaddingPercent(f3518lW);
            this._bus.register(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ai */
    public void mo10553ai() {
        Injector.getInjector(getContext()).injectMembers(this);
    }

    public void addLicenseFoundEventListener(LicenseFoundListener licenseFoundListener) {
        if (!this.f3519lX.contains(licenseFoundListener)) {
            this.f3519lX.add(licenseFoundListener);
        }
    }

    public void removeLicenseFoundEventListener(LicenseFoundListener licenseFoundListener) {
        this.f3519lX.remove(licenseFoundListener);
    }

    public double getViewfinderPaddingPercent() {
        return this.f3520lY.getPaddingPercent();
    }

    public void setViewfinderPaddingPercent(double d) {
        if (d < 0.0d || d > 50.0d) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_PADDING_PERCENTAGE_ARGUMENT);
        }
        this.f3520lY.setPaddingPercent(d);
    }

    public int getOuterViewFinderColor() {
        return this.f3520lY.getOuterOverlayFrameColor();
    }

    public void setOuterViewFinderColor(int i) {
        this.f3520lY.setOuterOverlayFrameColor(i);
    }

    public CaptureMessage getUserInstructionMessage() {
        return this.f3520lY.getUserInstructionMessage();
    }

    public void setUserInstructionMessage(CaptureMessage captureMessage) {
        this.f3520lY.setUserInstructionMessage(captureMessage);
        this.f3520lY.showUserInstructionMessage();
    }

    public void readLicense() {
        this.f3521lZ = true;
    }

    /* renamed from: aD */
    private static void m3783aD() {
        BarcodeScanner.registerCode(1, "Kofax.Android.QR.UDL", "5C44241E3E38A6E3BFBA3FB5949112DA91544173A67BFA58B622123B0C5341BC");
        m3784ak();
        m3785al();
        BarcodeScanner.setLevel(2);
    }

    /* renamed from: ak */
    private static void m3784ak() {
        BarcodeScanner.setScanningRect(1, new Rect(0, 0, 100, 100));
        BarcodeScanner.setActiveCodes(1);
    }

    /* renamed from: al */
    private static void m3785al() {
        BarcodeScanner.setDirection(3);
    }

    /* renamed from: a */
    private static String m3781a(byte[] bArr, int i, int i2) {
        byte[] scanGrayscaleImage = BarcodeScanner.scanGrayscaleImage(bArr, i, i2);
        if (scanGrayscaleImage == null || scanGrayscaleImage.length <= 3) {
            return null;
        }
        if (m3782a(scanGrayscaleImage)) {
            return new String(scanGrayscaleImage);
        }
        return Base64.encodeToString(scanGrayscaleImage, 0);
    }

    /* renamed from: a */
    private static boolean m3782a(byte[] bArr) {
        for (byte b : bArr) {
            if (b < 32 || b >= Byte.MAX_VALUE) {
                return false;
            }
        }
        return true;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public void onPreviewFrame(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        String a;
        if (this.f3521lZ && (a = m3781a(previewImageReadyBusEvent.imageData, previewImageReadyBusEvent.width, previewImageReadyBusEvent.height)) != null && BarcodeScanner.getLastType() == 13) {
            String replace = a.replace("\\", "");
            ErrorInfo mobileSDKLicense = Licensing.setMobileSDKLicense(replace);
            int daysRemaining = Licensing.getDaysRemaining();
            if (mobileSDKLicense != ErrorInfo.KMC_SUCCESS) {
                replace = null;
            }
            this.f3521lZ = false;
            for (LicenseFoundListener licenseFound : this.f3519lX) {
                licenseFound.licenseFound(new LicenseFoundEvent(this, mobileSDKLicense, daysRemaining, replace));
            }
        }
    }
}
