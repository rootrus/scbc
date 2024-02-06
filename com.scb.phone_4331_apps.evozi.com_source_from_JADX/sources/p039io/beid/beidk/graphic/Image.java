package p039io.beid.beidk.graphic;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/* renamed from: io.beid.beidk.graphic.Image */
public class Image {
    public static ByteArrayInputStream Bitmap2InputStream(Bitmap bitmap, Bitmap.CompressFormat compressFormat, Integer num) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, num.intValue(), byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    public static Bitmap GetScaledBitmap(Bitmap bitmap, Integer num) throws Exception {
        Integer valueOf = Integer.valueOf(bitmap.getWidth());
        Integer valueOf2 = Integer.valueOf(bitmap.getHeight());
        if (valueOf.intValue() > num.intValue() || valueOf2.intValue() > num.intValue()) {
            if (valueOf.intValue() > valueOf2.intValue()) {
                valueOf2 = Integer.valueOf((valueOf2.intValue() * num.intValue()) / valueOf.intValue());
                valueOf = num;
            }
            if (valueOf2.intValue() > valueOf.intValue()) {
                valueOf = Integer.valueOf((valueOf.intValue() * num.intValue()) / valueOf2.intValue());
                return Bitmap.createScaledBitmap(bitmap, valueOf.intValue(), num.intValue(), false);
            }
        }
        num = valueOf2;
        return Bitmap.createScaledBitmap(bitmap, valueOf.intValue(), num.intValue(), false);
    }

    public static Bitmap GetScaledBitmap(String str, Integer num) throws Exception {
        return GetScaledBitmap(BitmapFactory.decodeFile(str), num);
    }
}
