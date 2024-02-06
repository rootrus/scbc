package com.google.android.gms.internal.firebase_ml;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

public final class zzfk {
    private final int statusCode;
    private final zzfg zztm;
    private int zzuk;
    private boolean zzul;
    private InputStream zzux;
    private final String zzuy;
    private final String zzuz;
    private zzfq zzva;
    private final String zzvb;
    private final zzfh zzvc;
    private boolean zzvd;

    zzfk(zzfh zzfh, zzfq zzfq) throws IOException {
        StringBuilder sb;
        this.zzvc = zzfh;
        this.zzuk = zzfh.zzfc();
        this.zzul = zzfh.zzfd();
        this.zzva = zzfq;
        this.zzuy = zzfq.getContentEncoding();
        int statusCode2 = zzfq.getStatusCode();
        boolean z = false;
        this.statusCode = statusCode2 < 0 ? 0 : statusCode2;
        String reasonPhrase = zzfq.getReasonPhrase();
        this.zzvb = reasonPhrase;
        Logger logger = zzfo.zzve;
        if (this.zzul && logger.isLoggable(Level.CONFIG)) {
            z = true;
        }
        zzfg zzfg = null;
        if (z) {
            sb = new StringBuilder();
            sb.append("-------------- RESPONSE --------------");
            sb.append(zzhz.zzaae);
            String zzfp = zzfq.zzfp();
            if (zzfp != null) {
                sb.append(zzfp);
            } else {
                sb.append(this.statusCode);
                if (reasonPhrase != null) {
                    sb.append(' ');
                    sb.append(reasonPhrase);
                }
            }
            sb.append(zzhz.zzaae);
        } else {
            sb = null;
        }
        zzfh.zzff().zza(zzfq, z ? sb : null);
        String contentType = zzfq.getContentType();
        contentType = contentType == null ? zzfh.zzff().getContentType() : contentType;
        this.zzuz = contentType;
        this.zztm = contentType != null ? new zzfg(contentType) : zzfg;
        if (z) {
            logger.logp(Level.CONFIG, "o.nTypeGetNativeData", "<init>", sb.toString());
        }
    }

    public final String getContentType() {
        return this.zzuz;
    }

    public final zzfe zzfe() {
        return this.zzvc.zzff();
    }

    public final boolean zzfk() {
        int i = this.statusCode;
        return i >= 200 && i < 300;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.zzvb;
    }

    public final InputStream getContent() throws IOException {
        if (!this.zzvd) {
            zzhq content = this.zzva.getContent();
            if (content != null) {
                try {
                    String str = this.zzuy;
                    if (str != null && str.contains("gzip")) {
                        content = new GZIPInputStream(content);
                    }
                    Logger logger = zzfo.zzve;
                    if (this.zzul && logger.isLoggable(Level.CONFIG)) {
                        content = new zzhq(content, logger, Level.CONFIG, this.zzuk);
                    }
                    this.zzux = content;
                } catch (EOFException unused) {
                    content.close();
                } catch (Throwable th) {
                    content.close();
                    throw th;
                }
            }
            this.zzvd = true;
        }
        return this.zzux;
    }

    public final void ignore() throws IOException {
        InputStream content = getContent();
        if (content != null) {
            content.close();
        }
    }

    public final void disconnect() throws IOException {
        ignore();
        this.zzva.disconnect();
    }

    public final <T> T zza(Class<T> cls) throws IOException {
        int i = this.statusCode;
        boolean z = true;
        if (this.zzvc.getRequestMethod().equals("HEAD") || i / 100 == 1 || i == 204 || i == 304) {
            ignore();
            z = false;
        }
        if (!z) {
            return null;
        }
        return this.zzvc.zzfh().zza(getContent(), zzfm(), cls);
    }

    /* JADX INFO: finally extract failed */
    public final String zzfl() throws IOException {
        InputStream content = getContent();
        if (content == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            zzhb.copy(content, byteArrayOutputStream);
            content.close();
            return byteArrayOutputStream.toString(zzfm().name());
        } catch (Throwable th) {
            content.close();
            throw th;
        }
    }

    private final Charset zzfm() {
        zzfg zzfg = this.zztm;
        return (zzfg == null || zzfg.zzey() == null) ? zzhc.ISO_8859_1 : this.zztm.zzey();
    }
}
