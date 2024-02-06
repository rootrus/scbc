package p040o;

import p040o.proxyGetICheckDeserializerKta;

/* renamed from: o.writeUInt32 */
public abstract class writeUInt32<T extends proxyGetICheckDeserializerKta> extends writeUInt64NoTag<T> {
    public boolean MediaBrowserCompat$ItemReceiver;
    public read read;
    private String write;

    /* renamed from: o.writeUInt32$read */
    public enum read {
        NEW,
        CONFIRM
    }

    public abstract void write(String str);

    public writeUInt32(performActionWithResponse performactionwithresponse, RegularImmutableBiMap regularImmutableBiMap, FileBackedOutputStream fileBackedOutputStream) {
        super(regularImmutableBiMap);
    }

    public final void IconCompatParcelizer(String str) {
        boolean z = true;
        if (this.read == read.NEW) {
            this.write = str;
            setVersion valueOf = setVersion.valueOf(performActionWithResponse.IconCompatParcelizer(str).name());
            header header = new header(valueOf);
            if (this.RatingCompat != null) {
                header.IconCompatParcelizer(this.RatingCompat);
            }
            if (valueOf == setVersion.ERROR) {
                HttpResponse httpResponse = HttpResponse.MediaBrowserCompat$CustomActionResultReceiver;
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    httpResponse.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
            writeRawByte writerawbyte = writeRawByte.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writerawbyte.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (this.read != read.CONFIRM) {
        } else {
            if (!this.write.equalsIgnoreCase(str)) {
                code code = code.MediaBrowserCompat$CustomActionResultReceiver;
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    code.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
            write(this.write);
        }
    }

    static /* synthetic */ void write(proxyGetICheckDeserializerKta proxygeticheckdeserializerkta) {
        proxygeticheckdeserializerkta.IconCompatParcelizer();
        proxygeticheckdeserializerkta.mo13712Q_();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(proxyGetICheckDeserializerKta proxygeticheckdeserializerkta) {
        proxygeticheckdeserializerkta.mo13712Q_();
        proxygeticheckdeserializerkta.MediaMetadataCompat();
    }

    public final void write() {
        this.read = read.NEW;
        HttpRequest httpRequest = HttpRequest.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            httpRequest.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(proxyGetICheckDeserializerKta proxygeticheckdeserializerkta) {
        proxygeticheckdeserializerkta.mo13712Q_();
        proxygeticheckdeserializerkta.IconCompatParcelizer();
        proxygeticheckdeserializerkta.MediaDescriptionCompat();
        proxygeticheckdeserializerkta.MediaBrowserCompat$ItemReceiver(0);
        proxygeticheckdeserializerkta.MediaBrowserCompat$ItemReceiver();
    }

    public void MediaBrowserCompat$ItemReceiver() {
        this.read = read.CONFIRM;
        method method = method.read;
        if (this.RatingCompat != null) {
            method.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void IconCompatParcelizer(proxyGetICheckDeserializerKta proxygeticheckdeserializerkta) {
        proxygeticheckdeserializerkta.MediaBrowserCompat$ItemReceiver();
        proxygeticheckdeserializerkta.mo13712Q_();
        proxygeticheckdeserializerkta.MediaBrowserCompat$CustomActionResultReceiver();
        proxygeticheckdeserializerkta.MediaBrowserCompat$ItemReceiver(4);
    }

    static /* synthetic */ void read(proxyGetICheckDeserializerKta proxygeticheckdeserializerkta) {
        proxygeticheckdeserializerkta.MediaBrowserCompat$ItemReceiver();
        proxygeticheckdeserializerkta.IconCompatParcelizer();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.read == read.CONFIRM) {
            this.read = read.NEW;
            HttpRequest httpRequest = HttpRequest.IconCompatParcelizer;
            if (this.RatingCompat != null) {
                httpRequest.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
        IconCompatParcelizer(str);
    }

    public void IconCompatParcelizer() {
        this.read = read.NEW;
        HttpRequest httpRequest = HttpRequest.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            httpRequest.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
