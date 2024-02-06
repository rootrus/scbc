package com.google.android.gms.internal.firebase_ml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzhp extends ByteArrayOutputStream {
    private boolean closed;
    private final Logger logger;
    private final int zzaaa;
    private final Level zzaab;
    private int zzzz;

    public zzhp(Logger logger2, Level level, int i) {
        this.logger = (Logger) zzks.checkNotNull(logger2);
        this.zzaab = (Level) zzks.checkNotNull(level);
        zzks.checkArgument(i >= 0);
        this.zzaaa = i;
    }

    public final void write(int i) {
        synchronized (this) {
            zzks.checkArgument(!this.closed);
            this.zzzz++;
            if (this.count < this.zzaaa) {
                super.write(i);
            }
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        synchronized (this) {
            zzks.checkArgument(!this.closed);
            this.zzzz += i2;
            if (this.count < this.zzaaa) {
                int i3 = this.count + i2;
                if (i3 > this.zzaaa) {
                    i2 += this.zzaaa - i3;
                }
                super.write(bArr, i, i2);
            }
        }
    }

    public final void close() throws IOException {
        synchronized (this) {
            if (!this.closed) {
                if (this.zzzz != 0) {
                    StringBuilder sb = new StringBuilder("Total: ");
                    zza(sb, this.zzzz);
                    if (this.count != 0 && this.count < this.zzzz) {
                        sb.append(" (logging first ");
                        zza(sb, this.count);
                        sb.append(")");
                    }
                    this.logger.logp(Level.CONFIG, "o.rsnAllocationIoReceive", "close", sb.toString());
                    if (this.count != 0) {
                        this.logger.logp(this.zzaab, "o.rsnAllocationIoReceive", "close", toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                    }
                }
                this.closed = true;
            }
        }
    }

    private static void zza(StringBuilder sb, int i) {
        if (i == 1) {
            sb.append("1 byte");
            return;
        }
        sb.append(NumberFormat.getInstance().format((long) i));
        sb.append(" bytes");
    }
}
