package com.kofax.kmc.ken.engines.data;

import android.graphics.Rect;
import com.kofax.BuildConfig;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import p040o.ModifyQuickTopUpReviewActivity;

public class BoundingRect {
    /* access modifiers changed from: private */
    public Rect rect;

    public BoundingRect() {
        Rect rect2 = new Rect();
        this.rect = rect2;
        rect2.setEmpty();
    }

    public BoundingRect(BoundingRect boundingRect) {
        Rect rect2 = new Rect();
        this.rect = rect2;
        rect2.set(boundingRect.rect);
    }

    public BoundingRect(int i, int i2, int i3, int i4) {
        this.rect = new Rect();
        set(i, i2, i3, i4);
    }

    public int getRectBottom() {
        return this.rect.bottom;
    }

    public void setRectBottom(int i) {
        this.rect.bottom = i;
    }

    public int getRectLeft() {
        return this.rect.left;
    }

    public void setRectLeft(int i) {
        this.rect.left = i;
    }

    public int getRectRight() {
        return this.rect.right;
    }

    public void setRectRight(int i) {
        this.rect.right = i;
    }

    public int getRectTop() {
        return this.rect.top;
    }

    public void setRectTop(int i) {
        this.rect.top = i;
    }

    public int height() {
        return this.rect.height();
    }

    public void set(int i, int i2, int i3, int i4) {
        setRectRight(i3);
        setRectLeft(i);
        setRectBottom(i4);
        setRectTop(i2);
    }

    public void set(BoundingRect boundingRect) {
        this.rect.set(boundingRect.rect);
    }

    public void setEmpty() {
        this.rect.setEmpty();
    }

    public String toString() {
        return this.rect.toString();
    }

    public int width() {
        return this.rect.width();
    }

    public class FriendBR {
        public FriendBR(String str) throws KmcException {
            if (!ModifyQuickTopUpReviewActivity.IconCompatParcelizer((CharSequence) str, (CharSequence) BuildConfig.APPLICATION_ID)) {
                throw new KmcException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
            }
        }

        public boolean isValid() {
            return BoundingRect.this.rect.left <= BoundingRect.this.rect.right && BoundingRect.this.rect.top <= BoundingRect.this.rect.bottom;
        }
    }
}
