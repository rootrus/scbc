package com.google.android.gms.internal.firebase_ml;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import org.bouncycastle.asn1.eac.EACTags;

public final class zzfr {
    static final Map<Character, zzfs> zzvi = new HashMap();

    private static Map<String, Object> zzb(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : zzhf.zzf(obj).entrySet()) {
            Object value = next.getValue();
            if (value != null && !zzhf.isNull(value)) {
                linkedHashMap.put((String) next.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    public static String zza(String str, String str2, Object obj, boolean z) {
        Object obj2;
        String str3;
        if (str2.startsWith("/")) {
            zzez zzez = new zzez(str);
            zzez.zzv((String) null);
            String valueOf = String.valueOf(zzez.zzew());
            String valueOf2 = String.valueOf(str2);
            str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf(str2);
            str2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        }
        Map<String, Object> zzb = zzb(obj);
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int indexOf = str2.indexOf(EACTags.SECURITY_ENVIRONMENT_TEMPLATE, i);
            if (indexOf == -1) {
                sb.append(str2.substring(i));
                break;
            }
            sb.append(str2.substring(i, indexOf));
            int indexOf2 = str2.indexOf(125, indexOf + 2);
            String substring = str2.substring(indexOf + 1, indexOf2);
            zzfs zzfs = zzvi.get(Character.valueOf(substring.charAt(0)));
            if (zzfs == null) {
                zzfs = zzfs.SIMPLE;
            }
            ListIterator<String> listIterator = zzku.zza(zzkc.zza(',')).zza((CharSequence) substring).listIterator();
            boolean z2 = true;
            while (listIterator.hasNext()) {
                String next = listIterator.next();
                boolean endsWith = next.endsWith("*");
                int zzfu = listIterator.nextIndex() == 1 ? zzfs.zzfu() : 0;
                int length2 = next.length();
                if (endsWith) {
                    length2--;
                }
                String substring2 = next.substring(zzfu, length2);
                Object remove = zzb.remove(substring2);
                if (remove != null) {
                    if (!z2) {
                        sb.append(zzfs.zzfs());
                    } else {
                        sb.append(zzfs.zzfr());
                        z2 = false;
                    }
                    if (remove instanceof Iterator) {
                        obj2 = zza(substring2, (Iterator<?>) (Iterator) remove, endsWith, zzfs);
                    } else if ((remove instanceof Iterable) || remove.getClass().isArray()) {
                        obj2 = zza(substring2, (Iterator<?>) zzia.zzi(remove).iterator(), endsWith, zzfs);
                    } else if (remove.getClass().isEnum()) {
                        if (zzhl.zza((Enum<?>) (Enum) remove).getName() != null) {
                            if (zzfs.zzft()) {
                                remove = String.format("%s=%s", new Object[]{substring2, remove});
                            }
                            remove = zzie.zzas(remove.toString());
                        }
                        obj2 = remove;
                    } else if (!zzhf.zzg(remove)) {
                        Map<String, Object> zzb2 = zzb(remove);
                        if (zzb2.isEmpty()) {
                            obj2 = "";
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            String str4 = ",";
                            if (endsWith) {
                                str3 = zzfs.zzfs();
                                str4 = "=";
                            } else {
                                if (zzfs.zzft()) {
                                    sb2.append(zzie.zzas(substring2));
                                    sb2.append("=");
                                }
                                str3 = str4;
                            }
                            Iterator<Map.Entry<String, Object>> it = zzb2.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry next2 = it.next();
                                String zzak = zzfs.zzak((String) next2.getKey());
                                String zzak2 = zzfs.zzak(next2.getValue().toString());
                                sb2.append(zzak);
                                sb2.append(str4);
                                sb2.append(zzak2);
                                if (it.hasNext()) {
                                    sb2.append(str3);
                                }
                            }
                            obj2 = sb2.toString();
                        }
                    } else {
                        if (zzfs.zzft()) {
                            remove = String.format("%s=%s", new Object[]{substring2, remove});
                        }
                        if (zzfs.zzfv()) {
                            obj2 = zzie.zzat(remove.toString());
                        } else {
                            obj2 = zzie.zzas(remove.toString());
                        }
                    }
                    sb.append(obj2);
                }
            }
            i = indexOf2 + 1;
        }
        zzez.zza(zzb.entrySet(), sb);
        return sb.toString();
    }

    private static String zza(String str, Iterator<?> it, boolean z, zzfs zzfs) {
        String str2;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = zzfs.zzfs();
        } else {
            if (zzfs.zzft()) {
                sb.append(zzie.zzas(str));
                sb.append("=");
            }
            str2 = ",";
        }
        while (it.hasNext()) {
            if (z && zzfs.zzft()) {
                sb.append(zzie.zzas(str));
                sb.append("=");
            }
            sb.append(zzfs.zzak(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    static {
        zzfs.values();
    }
}
