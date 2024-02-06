package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.mobile.sdk._internal.impl.event.C0687ay;
import com.kofax.mobile.sdk._internal.impl.event.LevelChangedEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.ai */
class C0559ai {

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.ai$a */
    public enum C0560a {
        AutoFocus,
        AutoFocusMove,
        LevelChangedEvent,
        StabilityChangedEvent
    }

    C0559ai() {
    }

    /* renamed from: Z */
    private static List<String> m1126Z(String str) {
        List<String> asList = Arrays.asList(str.split(":"));
        if (asList.size() >= 3) {
            return asList;
        }
        throw new IllegalArgumentException("Wrong event format!");
    }

    /* renamed from: aa */
    public static long m1132aa(String str) {
        return Long.valueOf(m1126Z(str).get(0)).longValue();
    }

    /* renamed from: ab */
    public static C0560a m1133ab(String str) {
        return C0560a.valueOf(m1126Z(str).get(1));
    }

    /* renamed from: a */
    public static String m1127a(long j, C0560a aVar, String... strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(j));
        arrayList.add(String.valueOf(aVar.name()));
        arrayList.addAll(Arrays.asList(strArr));
        return m1131a((List<String>) arrayList, ":");
    }

    /* renamed from: a */
    public static String m1131a(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(str);
            }
            if (list.get(i) != null) {
                sb.append(list.get(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: ac */
    public static boolean m1134ac(String str) {
        return Boolean.valueOf(m1126Z(str).get(2)).booleanValue();
    }

    /* renamed from: a */
    public static String m1130a(long j, boolean z) {
        return m1127a(j, C0560a.AutoFocus, String.valueOf(z));
    }

    /* renamed from: ad */
    public static boolean m1135ad(String str) {
        return Boolean.valueOf(m1126Z(str).get(2)).booleanValue();
    }

    /* renamed from: b */
    public static String m1138b(long j, boolean z) {
        return m1127a(j, C0560a.AutoFocusMove, String.valueOf(z));
    }

    /* renamed from: ae */
    public static LevelChangedEvent m1136ae(String str) {
        List<String> Z = m1126Z(str);
        return new LevelChangedEvent(Float.valueOf(Z.get(3)).floatValue(), Float.valueOf(Z.get(4)).floatValue(), Float.valueOf(Z.get(5)).floatValue(), Float.valueOf(Z.get(6)).floatValue());
    }

    /* renamed from: a */
    public static String m1128a(long j, LevelChangedEvent levelChangedEvent) {
        return m1127a(j, C0560a.LevelChangedEvent, "false", String.valueOf(levelChangedEvent.pitch), String.valueOf(levelChangedEvent.roll), String.valueOf(levelChangedEvent.pitchVelocity), String.valueOf(levelChangedEvent.rollVelocity));
    }

    /* renamed from: af */
    public static C0687ay m1137af(String str) {
        return new C0687ay(Integer.valueOf(m1126Z(str).get(3)).intValue());
    }

    /* renamed from: a */
    public static String m1129a(long j, C0687ay ayVar) {
        return m1127a(j, C0560a.StabilityChangedEvent, "false", String.valueOf(ayVar.stability));
    }
}
