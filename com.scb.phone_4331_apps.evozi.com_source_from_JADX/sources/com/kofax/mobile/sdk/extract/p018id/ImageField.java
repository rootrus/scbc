package com.kofax.mobile.sdk.extract.p018id;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk.capture.model.Field;
import com.kofax.mobile.sdk.capture.model.FieldLocation;
import java.io.Serializable;

/* renamed from: com.kofax.mobile.sdk.extract.id.ImageField */
public class ImageField extends Field<Image> implements Serializable {
    public ImageField(String str, Image image, double d, FieldLocation fieldLocation) {
        super(str, image, d, fieldLocation);
    }

    public double getConfidence() {
        return super.getConfidence();
    }

    public static ImageField fromDataField(DataField dataField, Bitmap bitmap) {
        if (bitmap == null || dataField.getLocation().isUndefined()) {
            return null;
        }
        return new ImageField(dataField.getName(), m4781a(dataField.getLocation(), bitmap), dataField.getConfidence(), dataField.getLocation());
    }

    /* renamed from: a */
    private static Image m4781a(FieldLocation fieldLocation, Bitmap bitmap) {
        return new Image(Bitmap.createBitmap(bitmap, (int) fieldLocation.origin.f4794x, (int) fieldLocation.origin.f4795y, (int) fieldLocation.size.width, (int) fieldLocation.size.height));
    }
}
