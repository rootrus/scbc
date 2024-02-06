package com.google.android.gms.internal.firebase_ml;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class zzfz extends FilterInputStream {
    private long zzwb = 0;
    private final /* synthetic */ zzfy zzwc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfz(zzfy zzfy, InputStream inputStream) {
        super(inputStream);
        this.zzwc = zzfy;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read == -1) {
            zzfw();
        } else {
            this.zzwb += (long) read;
        }
        return read;
    }

    public final int read() throws IOException {
        int read = this.in.read();
        if (read == -1) {
            zzfw();
        } else {
            this.zzwb++;
        }
        return read;
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(j);
        this.zzwb += skip;
        return skip;
    }

    private final void zzfw() throws IOException {
        long contentLength = this.zzwc.getContentLength();
        if (contentLength != -1) {
            long j = this.zzwb;
            if (j != 0 && j < contentLength) {
                StringBuilder sb = new StringBuilder(102);
                sb.append("Connection closed prematurely: bytesRead = ");
                sb.append(j);
                sb.append(", Content-Length = ");
                sb.append(contentLength);
                throw new IOException(sb.toString());
            }
        }
    }
}
