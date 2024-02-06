package com.kofax.mobile.sdk._internal.impl;

import android.graphics.Bitmap;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.impl.event.C0676aa;
import com.kofax.mobile.sdk._internal.impl.event.C0677ad;
import com.kofax.mobile.sdk._internal.impl.event.C0678ae;
import com.kofax.mobile.sdk._internal.impl.event.C0684aq;
import com.kofax.mobile.sdk._internal.impl.event.C0690ba;
import com.kofax.mobile.sdk._internal.impl.event.C0697r;
import com.kofax.mobile.sdk._internal.impl.event.C7959ap;
import com.kofax.mobile.sdk._internal.impl.event.C7975o;
import com.kofax.mobile.sdk._internal.impl.event.ImageCapturedBusEvent;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import com.kofax.mobile.sdk._internal.impl.event.UseVideoChangedEvent;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.o */
public class C0732o {
    private final IBus _bus;
    /* access modifiers changed from: private */

    /* renamed from: wA */
    public boolean f1697wA;
    /* access modifiers changed from: private */

    /* renamed from: wv */
    public boolean f1698wv;

    /* renamed from: ww */
    private boolean f1699ww;

    /* renamed from: wx */
    private PreviewImageReadyBusEvent f1700wx;

    /* renamed from: wy */
    private Bitmap f1701wy;

    /* renamed from: wz */
    private boolean f1702wz;

    @HmlPinActivity
    public C0732o(IBus iBus) {
        this._bus = iBus;
        iBus.register(this);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11765a(C0690ba baVar) {
        this.f1702wz = true;
        m1661hU();
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11762a(C0676aa aaVar) {
        this.f1702wz = false;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11764a(C7959ap apVar) {
        if (m1660hT()) {
            m1661hU();
            if (apVar.state == null || !apVar.state.f1690wo) {
                this.f1701wy = apVar.f3713Jd;
            }
            m1662hV();
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11760a(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        if (m1660hT()) {
            m1661hU();
            if (previewImageReadyBusEvent.state == null || !previewImageReadyBusEvent.state.f1690wo) {
                this.f1700wx = previewImageReadyBusEvent;
            }
            m1662hV();
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11763a(C0677ad adVar) {
        synchronized (this) {
            if (adVar.f1612IM) {
                this._bus.post(new C0678ae(new C0505k() {
                    /* renamed from: k */
                    public void mo11197k(boolean z) {
                        synchronized (this) {
                            boolean unused = C0732o.this.f1697wA = true;
                            boolean unused2 = C0732o.this.f1698wv = true;
                        }
                    }
                }));
            } else {
                this.f1698wv = true;
                m1662hV();
            }
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11761a(UseVideoChangedEvent useVideoChangedEvent) {
        this.f1699ww = useVideoChangedEvent.useVideo;
        m1662hV();
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11759a(ImageCapturedBusEvent imageCapturedBusEvent) {
        m1661hU();
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11766a(C0697r rVar) {
        m1661hU();
    }

    /* renamed from: hT */
    private boolean m1660hT() {
        return (this.f1699ww && !this.f1702wz) || this.f1697wA;
    }

    /* renamed from: hU */
    private void m1661hU() {
        this.f1700wx = null;
        this.f1701wy = null;
    }

    /* renamed from: hV */
    private void m1662hV() {
        synchronized (this) {
            if (this.f1698wv) {
                captureImage();
            }
        }
    }

    private void captureImage() {
        synchronized (this) {
            if (this.f1699ww) {
                m1664hX();
            } else {
                m1663hW();
            }
        }
    }

    /* renamed from: hW */
    private void m1663hW() {
        this._bus.post(new C7975o());
        reset();
    }

    /* renamed from: hX */
    private void m1664hX() {
        Bitmap hY = m1665hY();
        if (hY != null) {
            m1659h(hY);
        }
    }

    private void reset() {
        m1661hU();
        this.f1698wv = false;
        this.f1697wA = false;
    }

    /* renamed from: h */
    private void m1659h(Bitmap bitmap) {
        this._bus.post(new ImageCapturedBusEvent(bitmap));
        reset();
    }

    /* renamed from: hY */
    private Bitmap m1665hY() {
        Bitmap bitmap;
        if (this.f1701wy != null) {
            this._bus.post(new C0684aq());
            bitmap = this.f1701wy;
        } else if (this.f1700wx != null) {
            this._bus.post(new C0684aq());
            bitmap = this.f1700wx.getBitmap(true);
        } else {
            bitmap = null;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            return Bitmap.createBitmap(bitmap);
        }
        m1661hU();
        return null;
    }
}
