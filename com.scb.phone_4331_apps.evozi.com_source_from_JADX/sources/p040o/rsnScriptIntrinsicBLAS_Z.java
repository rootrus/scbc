package p040o;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: o.rsnScriptIntrinsicBLAS_Z */
public final class rsnScriptIntrinsicBLAS_Z {
    private static final String write = rsnScriptIntrinsicBLAS_Z.class.getSimpleName();

    static {
        Pattern.compile(",");
    }

    private rsnScriptIntrinsicBLAS_Z() {
    }

    public static Map<rsnIncContextCreate, Object> read(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(rsnIncContextCreate.class);
        for (rsnIncContextCreate rsninccontextcreate : rsnIncContextCreate.values()) {
            if (!(rsninccontextcreate == rsnIncContextCreate.CHARACTER_SET || rsninccontextcreate == rsnIncContextCreate.NEED_RESULT_POINT_CALLBACK || rsninccontextcreate == rsnIncContextCreate.POSSIBLE_FORMATS)) {
                String name = rsninccontextcreate.name();
                if (extras.containsKey(name)) {
                    if (rsninccontextcreate.valueType.equals(Void.class)) {
                        enumMap.put(rsninccontextcreate, Boolean.TRUE);
                    } else {
                        Object obj = extras.get(name);
                        if (rsninccontextcreate.valueType.isInstance(obj)) {
                            enumMap.put(rsninccontextcreate, obj);
                        } else {
                            String str = write;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring hint ");
                            sb.append(rsninccontextcreate);
                            sb.append(" because it is not assignable from ");
                            sb.append(obj);
                            Log.w(str, sb.toString());
                        }
                    }
                }
            }
        }
        String str2 = write;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hints from the Intent: ");
        sb2.append(enumMap);
        Log.i(str2, sb2.toString());
        return enumMap;
    }
}
