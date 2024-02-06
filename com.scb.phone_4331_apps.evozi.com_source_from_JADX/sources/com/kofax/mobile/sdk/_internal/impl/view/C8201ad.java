package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.impl.event.C7959ap;
import p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.ad */
public class C8201ad extends View {

    /* renamed from: Q */
    private final Paint f4265Q;

    /* renamed from: Vy */
    private int f4266Vy;

    /* renamed from: Vz */
    private int f4267Vz;

    /* renamed from: XA */
    private int f4268XA;

    /* renamed from: XB */
    private int f4269XB;

    /* renamed from: XC */
    private int f4270XC;

    /* renamed from: XD */
    private int f4271XD;

    /* renamed from: Xy */
    private long f4272Xy;

    /* renamed from: Xz */
    private BoundingTetragon f4273Xz;
    @HmlPinActivity
    IBus _bus;
    private int _height;
    private int _width;
    /* access modifiers changed from: private */

    /* renamed from: wO */
    public final Handler f4274wO;

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public void mo54628b(C7959ap apVar) {
        this.f4273Xz = apVar.f3714Je;
        this.f4266Vy = apVar.f3713Jd.getWidth();
        this.f4267Vz = apVar.f3713Jd.getHeight();
        this.f4272Xy = System.currentTimeMillis();
        this.f4274wO.post(new Runnable() {
            public void run() {
                C8201ad.this.invalidate();
            }
        });
    }

    public C8201ad(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public C8201ad(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8201ad(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (FragmentBuilder_BindEasycashReferralSendDfwFragment) null);
    }

    public C8201ad(Context context, AttributeSet attributeSet, int i, FragmentBuilder_BindEasycashReferralSendDfwFragment fragmentBuilder_BindEasycashReferralSendDfwFragment) {
        super(context, attributeSet, i);
        this.f4266Vy = 0;
        this.f4267Vz = 0;
        this.f4268XA = 0;
        this.f4269XB = 0;
        this.f4270XC = 0;
        this.f4271XD = 0;
        this._width = 0;
        this._height = 0;
        if (!isInEditMode()) {
            Paint paint = new Paint();
            this.f4265Q = paint;
            paint.setStrokeWidth(2.0f);
            this.f4265Q.setColor(-16711936);
            this.f4265Q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
            Handler handler = new Handler(context.getMainLooper());
            this.f4274wO = handler;
            handler.post(new Runnable() {
                public void run() {
                    C8201ad.this.invalidate();
                    C8201ad.this.f4274wO.postDelayed(this, 100);
                }
            });
            setWillNotDraw(false);
            return;
        }
        this.f4274wO = null;
        this.f4265Q = null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f4268XA = i2;
        this.f4269XB = i;
        this.f4270XC = i3;
        this.f4271XD = i4;
        this._width = Math.abs(i3 - i);
        this._height = Math.abs(this.f4271XD - this.f4268XA);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bringToFront();
        long currentTimeMillis = System.currentTimeMillis() - this.f4272Xy;
        if (currentTimeMillis <= 1000) {
            float f = 1.0f;
            if (currentTimeMillis > 200) {
                f = ((float) (1000 - currentTimeMillis)) / 1000.0f;
            }
            if (f > BitmapDescriptorFactory.HUE_RED && this.f4273Xz != null) {
                this.f4265Q.setColor(Color.argb((int) (f * 255.0f), 0, 255, 0));
                canvas.save();
                canvas.scale(((float) this._width) / ((float) this.f4266Vy), ((float) this._height) / ((float) this.f4267Vz));
                float f2 = (float) this.f4273Xz.getBottomLeft().x;
                float f3 = (float) this.f4273Xz.getBottomLeft().y;
                float f4 = (float) this.f4273Xz.getTopLeft().x;
                float f5 = (float) this.f4273Xz.getTopLeft().y;
                float f6 = (float) this.f4273Xz.getTopRight().x;
                float f7 = (float) this.f4273Xz.getTopRight().y;
                float f8 = (float) this.f4273Xz.getBottomRight().x;
                float f9 = (float) this.f4273Xz.getBottomRight().y;
                Canvas canvas2 = canvas;
                canvas2.drawLine(f2, f3, f4, f5, this.f4265Q);
                canvas2.drawLine(f4, f5, f6, f7, this.f4265Q);
                canvas2.drawLine(f6, f7, f8, f9, this.f4265Q);
                canvas2.drawLine(f8, f9, f2, f3, this.f4265Q);
                canvas.restore();
            }
        }
    }
}
