package com.kofax.mobile.sdk.p023k;

import android.graphics.Point;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.mobile.sdk._internal.capture.C7894b;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: com.kofax.mobile.sdk.k.a */
public class C8408a implements C7894b {

    /* renamed from: EW */
    private final BoundingTetragon f4941EW;

    /* renamed from: EX */
    private Point f4942EX;

    /* renamed from: EY */
    private BoundingTetragon f4943EY;
    private final int _height;
    private final int _width;

    /* renamed from: jN */
    private final int f4944jN;

    public C8408a(BoundingTetragon boundingTetragon, int i, int i2, int i3) {
        if (i3 % 90 == 0) {
            this.f4941EW = boundingTetragon;
            this.f4944jN = i3;
            this._width = i;
            this._height = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public int getWidth() {
        if (this.f4942EX == null) {
            this.f4942EX = m4916kI();
        }
        return this.f4942EX.x;
    }

    public int getHeight() {
        if (this.f4942EX == null) {
            this.f4942EX = m4916kI();
        }
        return this.f4942EX.y;
    }

    /* renamed from: bs */
    public BoundingTetragon mo54224bs() {
        if (this.f4943EY == null) {
            this.f4943EY = m4915kH();
        }
        return this.f4943EY;
    }

    /* renamed from: kH */
    private BoundingTetragon m4915kH() {
        BoundingTetragon boundingTetragon = this.f4941EW;
        if (this.f4944jN == 0 || boundingTetragon == null) {
            return boundingTetragon;
        }
        BoundingTetragon clone = boundingTetragon.clone();
        clone.rotate(this._width, this._height, m4917l(this.f4944jN));
        return clone;
    }

    /* renamed from: kI */
    private Point m4916kI() {
        return m4914b(this._width, this._height, this.f4944jN);
    }

    /* renamed from: b */
    private static Point m4914b(int i, int i2, int i3) {
        if (!(i3 % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0)) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        return new Point(i, i2);
    }

    /* renamed from: l */
    private static BoundingTetragon.Rotation m4917l(int i) {
        if (i == 90) {
            return BoundingTetragon.Rotation.RIGHT;
        }
        if (i == 180) {
            return BoundingTetragon.Rotation.FLIP;
        }
        if (i == 270) {
            return BoundingTetragon.Rotation.LEFT;
        }
        throw new IllegalArgumentException();
    }
}
