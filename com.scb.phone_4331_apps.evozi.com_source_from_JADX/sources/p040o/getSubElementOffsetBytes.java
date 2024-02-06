package p040o;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040o.C10821Element;

/* renamed from: o.getSubElementOffsetBytes */
public final class getSubElementOffsetBytes {
    public final List<createFromBitmapResource> IconCompatParcelizer = new ArrayList();

    /* renamed from: o.getSubElementOffsetBytes$read */
    public interface read {
        String IconCompatParcelizer(String str);

        void read(String str);

        void write(String str);

        String[] write();
    }

    public static void IconCompatParcelizer(Context context, String str, String str2) {
        C10821Element.Builder builder = new C10821Element.Builder();
        if (context != null) {
            if (!(str == null || str.length() == 0)) {
                builder.MediaBrowserCompat$CustomActionResultReceiver(context, str, str2);
                return;
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }

    public final <T extends createFromBitmapResource> T write(Class<T> cls) {
        Iterator<createFromBitmapResource> it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            T t = (createFromBitmapResource) it.next();
            if (cls.isAssignableFrom(t.getClass())) {
                return t;
            }
        }
        return null;
    }

    public final String toString() {
        int size = this.IconCompatParcelizer.size();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(size);
        objArr[1] = size == 1 ? "directory" : "directories";
        return String.format("Metadata (%d %s)", objArr);
    }
}
