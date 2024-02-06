package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzhm;
import com.thunderhead.connectivity.transport.ServiceConstants;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzfe extends zzhm {
    @zzho("Accept")
    private List<String> accept;
    @zzho("Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    @zzho("Age")
    private List<Long> age;
    @zzho("WWW-Authenticate")
    private List<String> authenticate;
    @zzho("Authorization")
    private List<String> authorization;
    @zzho("Cache-Control")
    private List<String> cacheControl;
    @zzho("Content-Encoding")
    private List<String> contentEncoding;
    @zzho("Content-Length")
    private List<Long> contentLength;
    @zzho("Content-MD5")
    private List<String> contentMD5;
    @zzho("Content-Range")
    private List<String> contentRange;
    @zzho("Content-Type")
    private List<String> contentType;
    @zzho("Cookie")
    private List<String> cookie;
    @zzho("Date")
    private List<String> date;
    @zzho("ETag")
    private List<String> etag;
    @zzho("Expires")
    private List<String> expires;
    @zzho("If-Match")
    private List<String> ifMatch;
    @zzho("If-Modified-Since")
    private List<String> ifModifiedSince;
    @zzho("If-None-Match")
    private List<String> ifNoneMatch;
    @zzho("If-Range")
    private List<String> ifRange;
    @zzho("If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @zzho("Last-Modified")
    private List<String> lastModified;
    @zzho("Location")
    private List<String> location;
    @zzho("MIME-Version")
    private List<String> mimeVersion;
    @zzho("Range")
    private List<String> range;
    @zzho("Retry-After")
    private List<String> retryAfter;
    @zzho("User-Agent")
    private List<String> userAgent;

    public zzfe() {
        super(EnumSet.of(zzhm.zzc.IGNORE_CASE));
    }

    public final zzfe zzy(String str) {
        this.authorization = zza((Object) null);
        return this;
    }

    public final String getContentType() {
        return (String) zza(this.contentType);
    }

    public final zzfe zzz(String str) {
        this.ifModifiedSince = zza((Object) null);
        return this;
    }

    public final zzfe zzaa(String str) {
        this.ifMatch = zza((Object) null);
        return this;
    }

    public final zzfe zzab(String str) {
        this.ifNoneMatch = zza((Object) null);
        return this;
    }

    public final zzfe zzac(String str) {
        this.ifUnmodifiedSince = zza((Object) null);
        return this;
    }

    public final zzfe zzad(String str) {
        this.ifRange = zza((Object) null);
        return this;
    }

    public final String getLocation() {
        return (String) zza(this.location);
    }

    public final String zzex() {
        return (String) zza(this.userAgent);
    }

    public final zzfe zzae(String str) {
        this.userAgent = zza(str);
        return this;
    }

    private static void zza(Logger logger, StringBuilder sb, StringBuilder sb2, zzfp zzfp, String str, Object obj, Writer writer) throws IOException {
        if (obj != null && !zzhf.isNull(obj)) {
            String name = obj instanceof Enum ? zzhl.zza((Enum<?>) (Enum) obj).getName() : obj.toString();
            String str2 = (("Authorization".equalsIgnoreCase(str) || ServiceConstants.HEADER_COOKIE.equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) ? "<Not Logged>" : name;
            if (sb != null) {
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                sb.append(zzhz.zzaae);
            }
            if (sb2 != null) {
                sb2.append(" -H '");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str2);
                sb2.append("'");
            }
            if (zzfp != null) {
                zzfp.addHeader(str, name);
            }
            if (writer != null) {
                writer.write(str);
                writer.write(": ");
                writer.write(name);
                writer.write("\r\n");
            }
        }
    }

    static void zza(zzfe zzfe, StringBuilder sb, StringBuilder sb2, Logger logger, zzfp zzfp) throws IOException {
        HashSet hashSet = new HashSet();
        for (Map.Entry next : zzfe.entrySet()) {
            String str = (String) next.getKey();
            Object[] objArr = {str};
            if (hashSet.add(str)) {
                Object value = next.getValue();
                if (value != null) {
                    zzhl zzao = zzfe.zzhi().zzao(str);
                    if (zzao != null) {
                        str = zzao.getName();
                    }
                    String str2 = str;
                    Class<?> cls = value.getClass();
                    if ((value instanceof Iterable) || cls.isArray()) {
                        for (Object zza : zzia.zzi(value)) {
                            zza(logger, sb, sb2, zzfp, str2, zza, (Writer) null);
                        }
                    } else {
                        zza(logger, sb, sb2, zzfp, str2, value, (Writer) null);
                    }
                }
            } else {
                throw new IllegalArgumentException(zzla.zzb("multiple headers of the same name (headers are case insensitive): %s", objArr));
            }
        }
    }

    public final void zza(zzfq zzfq, StringBuilder sb) throws IOException {
        clear();
        zzff zzff = new zzff(this, sb);
        int zzfq2 = zzfq.zzfq();
        for (int i = 0; i < zzfq2; i++) {
            String zzab = zzfq.zzab(i);
            String zzac = zzfq.zzac(i);
            List<Type> list = zzff.zzty;
            zzhd zzhd = zzff.zztx;
            zzgy zzgy = zzff.zztv;
            StringBuilder sb2 = zzff.zztw;
            if (sb2 != null) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(zzab).length() + 2 + String.valueOf(zzac).length());
                sb3.append(zzab);
                sb3.append(": ");
                sb3.append(zzac);
                sb2.append(sb3.toString());
                sb2.append(zzhz.zzaae);
            }
            zzhl zzao = zzhd.zzao(zzab);
            if (zzao != null) {
                Type zza = zzhf.zza(list, zzao.getGenericType());
                if (zzia.zzc(zza)) {
                    Class<?> zzb = zzia.zzb(list, zzia.zzd(zza));
                    zzgy.zza(zzao.zzhf(), zzb, zza(zzb, list, zzac));
                } else if (zzia.zza(zzia.zzb(list, zza), (Class<?>) Iterable.class)) {
                    Collection<Object> collection = (Collection) zzao.zzh(this);
                    if (collection == null) {
                        collection = zzhf.zzb(zza);
                        zzao.zzb(this, collection);
                    }
                    collection.add(zza(zza == Object.class ? null : zzia.zze(zza), list, zzac));
                } else {
                    zzao.zzb(this, zza(zza, list, zzac));
                }
            } else {
                ArrayList arrayList = (ArrayList) get(zzab);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    zzb(zzab, arrayList);
                }
                arrayList.add(zzac);
            }
        }
        zzff.zztv.zzha();
    }

    private static <T> T zza(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    private static <T> List<T> zza(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    private static Object zza(Type type, List<Type> list, String str) {
        return zzhf.zza(zzhf.zza(list, type), str);
    }

    public final /* synthetic */ zzhm zzeh() {
        return (zzfe) clone();
    }

    public final /* synthetic */ zzhm zzb(String str, Object obj) {
        return (zzfe) super.zzb(str, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzfe) super.clone();
    }
}
