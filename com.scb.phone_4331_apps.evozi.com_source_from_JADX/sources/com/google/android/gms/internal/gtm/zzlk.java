package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzlk extends zzhb {
    /* access modifiers changed from: protected */
    public final zzoa<?> zza(zzfl zzfl, zzoa<?>... zzoaArr) {
        String str;
        boolean z = true;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaArr.length > 0);
        zzoh zzoh = zzoaArr[0];
        zzog zzog = zzoaArr.length > 1 ? zzoaArr[1] : zzog.zzaum;
        int i = 2;
        if (zzoaArr.length <= 2 || zzoaArr[2] == zzog.zzaum) {
            str = "";
        } else {
            str = zzha.zzd(zzoaArr[2]);
        }
        String zzd = (zzoaArr.length <= 3 || zzoaArr[3] == zzog.zzaum) ? "=" : zzha.zzd(zzoaArr[3]);
        HashSet hashSet = null;
        if (zzog != zzog.zzaum) {
            Preconditions.checkArgument(zzog instanceof zzom);
            if (ImagesContract.URL.equals(zzog.value())) {
                i = 1;
            } else if (!"backslash".equals(zzog.value())) {
                return new zzom("");
            } else {
                hashSet = new HashSet();
                zza((Set<Character>) hashSet, str);
                zza((Set<Character>) hashSet, zzd);
                hashSet.remove('\\');
            }
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        if (zzoh instanceof zzoh) {
            for (zzoa zzoa : (List) zzoh.value()) {
                if (!z) {
                    sb.append(str);
                }
                zzb(sb, zzha.zzd(zzoa), i, hashSet);
                z = false;
            }
        } else if (zzoh instanceof zzok) {
            Map map = (Map) ((zzok) zzoh).value();
            for (String str2 : map.keySet()) {
                if (!z) {
                    sb.append(str);
                }
                String zzd2 = zzha.zzd((zzoa) map.get(str2));
                zzb(sb, str2, i, hashSet);
                sb.append(zzd);
                zzb(sb, zzd2, i, hashSet);
                z = false;
            }
        } else {
            zzb(sb, zzha.zzd(zzoh), i, hashSet);
        }
        return new zzom(sb.toString());
    }

    private static void zza(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    private static void zzb(StringBuilder sb, String str, int i, Set<Character> set) {
        sb.append(zzb(str, i, set));
    }

    private static String zzb(String str, int i, Set<Character> set) {
        if (i == 1) {
            try {
                return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        } else if (i != 2) {
            return str;
        } else {
            String replace = str.replace("\\", "\\\\");
            for (Character ch : set) {
                String ch2 = ch.toString();
                String valueOf = String.valueOf(ch2);
                replace = replace.replace(ch2, valueOf.length() != 0 ? "\\".concat(valueOf) : new String("\\"));
            }
            return replace;
        }
    }
}
