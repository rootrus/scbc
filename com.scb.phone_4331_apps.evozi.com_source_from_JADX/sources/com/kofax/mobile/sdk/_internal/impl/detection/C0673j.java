package com.kofax.mobile.sdk._internal.impl.detection;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.kut.utilities.RectUtil;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.detection.j */
public class C0673j {

    /* renamed from: HG */
    private Bitmap f1602HG;

    /* renamed from: HH */
    private BoundingTetragon f1603HH;

    /* renamed from: HI */
    private boolean f1604HI;

    C0673j(Bitmap bitmap, List<Point> list, boolean z) {
        this.f1602HG = bitmap;
        this.f1603HH = RectUtil.buildBoundingTetragon(list);
        this.f1604HI = z;
    }

    public Bitmap getProcessedImage() {
        return this.f1602HG;
    }

    public BoundingTetragon getBounds() {
        return this.f1603HH;
    }

    /* renamed from: lR */
    public boolean mo11609lR() {
        return this.f1604HI;
    }
}
