package p040o;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: o.setOnSearchClickListener */
public final class setOnSearchClickListener {
    private static Field IconCompatParcelizer;
    private static boolean read;

    private static void IconCompatParcelizer(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!read) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                IconCompatParcelizer = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(LayoutInflater.class.getName());
                sb.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb.toString(), e);
            }
            read = true;
        }
        Field field = IconCompatParcelizer;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb2.toString(), e2);
            }
        }
    }

    public static void write(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                IconCompatParcelizer(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                IconCompatParcelizer(layoutInflater, factory2);
            }
        }
    }
}
