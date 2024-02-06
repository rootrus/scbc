package com.google.android.gms.internal.firebase_ml;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;

public final class zzgn extends zzge {
    public static zzgn zzgx() {
        return zzgo.zzwz;
    }

    public final zzgi zza(InputStream inputStream) {
        return zza((Reader) new InputStreamReader(inputStream, zzhc.UTF_8));
    }

    public final zzgi zza(InputStream inputStream, Charset charset) {
        if (charset == null) {
            return zza(inputStream);
        }
        return zza((Reader) new InputStreamReader(inputStream, charset));
    }

    public final zzgi zzam(String str) {
        return zza((Reader) new StringReader(str));
    }

    private final zzgi zza(Reader reader) {
        return new zzgq(this, new zzqn(reader));
    }

    public final zzgf zza(OutputStream outputStream, Charset charset) {
        return new zzgp(this, new zzqq(new OutputStreamWriter(outputStream, charset)));
    }
}
