package com.google.android.gms.internal.firebase_ml;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

public final class zzft extends zzev {
    private Object data;

    public zzft(Object obj) {
        super(zzfu.MEDIA_TYPE);
        this.data = zzks.checkNotNull(obj);
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, zzeu()));
        boolean z = true;
        for (Map.Entry next : zzhf.zzf(this.data).entrySet()) {
            Object value = next.getValue();
            if (value != null) {
                String zzaq = zzie.zzaq((String) next.getKey());
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object zza : zzia.zzi(value)) {
                        z = zza(z, bufferedWriter, zzaq, zza);
                    }
                } else {
                    z = zza(z, bufferedWriter, zzaq, value);
                }
            }
        }
        bufferedWriter.flush();
    }

    private static boolean zza(boolean z, Writer writer, String str, Object obj) throws IOException {
        if (obj != null && !zzhf.isNull(obj)) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            String zzaq = zzie.zzaq(obj instanceof Enum ? zzhl.zza((Enum<?>) (Enum) obj).getName() : obj.toString());
            if (zzaq.length() != 0) {
                writer.write("=");
                writer.write(zzaq);
            }
        }
        return z;
    }
}
