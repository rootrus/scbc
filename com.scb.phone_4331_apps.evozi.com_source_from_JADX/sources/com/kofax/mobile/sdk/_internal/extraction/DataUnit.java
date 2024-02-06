package com.kofax.mobile.sdk._internal.extraction;

import com.kofax.kmc.ken.engines.data.Image;
import java.util.ArrayList;

public class DataUnit {
    public final Image[] images;
    public C7905h returnData;
    public boolean success;

    public DataUnit(Image... imageArr) {
        if (imageArr.length != 0) {
            if (!m3844a(imageArr)) {
                this.images = imageArr;
                return;
            }
            throw new IllegalArgumentException("images should contain at least one image");
        }
        throw new IllegalArgumentException("images cannot be null or empty");
    }

    public Image[] getNotNullImages() {
        ArrayList arrayList = new ArrayList(this.images.length);
        for (Image image : this.images) {
            if (image != null) {
                arrayList.add(image);
            }
        }
        return (Image[]) arrayList.toArray(new Image[arrayList.size()]);
    }

    /* renamed from: a */
    private boolean m3844a(Object... objArr) {
        for (Object obj : objArr) {
            if (obj != null) {
                return false;
            }
        }
        return true;
    }
}
