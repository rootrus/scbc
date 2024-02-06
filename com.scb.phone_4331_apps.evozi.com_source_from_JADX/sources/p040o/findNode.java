package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: o.findNode */
public final class findNode {
    public static TypeAdapter MediaBrowserCompat$ItemReceiver(Gson gson, TypeToken typeToken, Object obj) {
        Type type;
        Type type2 = typeToken.getType();
        if (obj == null || (type2 != Object.class && !(type2 instanceof TypeVariable) && !(type2 instanceof Class))) {
            type = type2;
        } else {
            type = obj.getClass();
        }
        TypeAdapter<?> adapter = gson.getAdapter(TypeToken.get(type));
        if (type2 != type) {
            boolean z = true;
            if (!(!(adapter instanceof addKernel) && !(adapter instanceof ReflectiveTypeAdapterFactory.Adapter))) {
                TypeAdapter adapter2 = gson.getAdapter(typeToken);
                if ((adapter2 instanceof addKernel) || (adapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    z = false;
                }
                if (z) {
                    return adapter2;
                }
            }
        }
        return adapter;
    }

    public static TypeAdapter MediaBrowserCompat$ItemReceiver(Gson gson, Class cls, Object obj) {
        Class cls2;
        if (obj == null || (cls != Object.class && !(cls instanceof Class))) {
            cls2 = cls;
        } else {
            cls2 = obj.getClass();
        }
        TypeAdapter<?> adapter = gson.getAdapter(TypeToken.get((Type) cls2));
        if (cls != cls2) {
            boolean z = true;
            if (!(!(adapter instanceof addKernel) && !(adapter instanceof ReflectiveTypeAdapterFactory.Adapter))) {
                TypeAdapter adapter2 = gson.getAdapter(cls);
                if ((adapter2 instanceof addKernel) || (adapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    z = false;
                }
                if (z) {
                    return adapter2;
                }
            }
        }
        return adapter;
    }
}
