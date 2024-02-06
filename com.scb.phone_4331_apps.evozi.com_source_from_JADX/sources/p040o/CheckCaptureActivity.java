package p040o;

import android.content.res.Resources;
import android.os.Build;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.CheckCaptureActivity */
public final class CheckCaptureActivity implements getIIdDeserializerOnDevice {
    public static String read(Resources resources, String str, OffsetDateTime offsetDateTime) {
        Locale locale;
        if (offsetDateTime == null) {
            return null;
        }
        GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder withZone = GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ofPattern(str).withZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok"));
        if (Build.VERSION.SDK_INT >= 24) {
            locale = resources.getConfiguration().getLocales().get(0);
        } else {
            locale = resources.getConfiguration().locale;
        }
        return offsetDateTime.format(withZone.withLocale(locale).withChronology(read(resources)));
    }

    public static Date IconCompatParcelizer(OffsetDateTime offsetDateTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(offsetDateTime.getYear());
            sb.append("-");
            sb.append(offsetDateTime.getMonthValue());
            sb.append("-");
            sb.append(offsetDateTime.getDayOfMonth());
            return simpleDateFormat.parse(sb.toString());
        } catch (ParseException unused) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Date is null", new Object[0]);
            return null;
        }
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException unused) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Date is null", new Object[0]);
            date = null;
        }
        return date != null ? simpleDateFormat2.format(date).concat(".000+07:00") : "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String MediaBrowserCompat$ItemReceiver(java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r6)
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            r6.<init>(r7)
            r7 = 0
            java.util.Date r5 = r0.parse(r5)     // Catch:{ ParseException -> 0x0036 }
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ ParseException -> 0x0037 }
            r1 = 1
            int r0 = r0.get(r1)     // Catch:{ ParseException -> 0x0037 }
            java.util.Calendar r2 = java.util.Calendar.getInstance()     // Catch:{ ParseException -> 0x0037 }
            r2.setTime(r5)     // Catch:{ ParseException -> 0x0037 }
            int r3 = r2.get(r1)     // Catch:{ ParseException -> 0x0037 }
            int r3 = r3 + -543
            int r4 = r3 + 100
            if (r4 < r0) goto L_0x002b
            r0 = r1
            goto L_0x002c
        L_0x002b:
            r0 = r7
        L_0x002c:
            if (r0 == 0) goto L_0x003e
            r2.set(r1, r3)     // Catch:{ ParseException -> 0x0037 }
            java.util.Date r5 = r2.getTime()     // Catch:{ ParseException -> 0x0037 }
            goto L_0x003e
        L_0x0036:
            r5 = 0
        L_0x0037:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r0 = "Date is null"
            p040o.onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(r0, r7)
        L_0x003e:
            if (r5 == 0) goto L_0x004d
            java.lang.String r5 = r6.format(r5)
            if (r8 == 0) goto L_0x004f
            java.lang.String r6 = ".000+07:00"
            java.lang.String r5 = r5.concat(r6)
            goto L_0x004f
        L_0x004d:
            java.lang.String r5 = ""
        L_0x004f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public static String MediaBrowserCompat$ItemReceiver(Resources resources, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(simpleDateFormat.parse(str));
        } catch (ParseException unused) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Date is null", new Object[0]);
        }
        return instance != null ? read(resources, "dd MMM yyyy", OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(instance), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok"))) : "";
    }

    public static Boolean MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        boolean z = false;
        try {
            simpleDateFormat.setLenient(false);
            date = simpleDateFormat.parse(str);
        } catch (ParseException unused) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Date is null", new Object[0]);
            date = null;
        }
        if (date != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static Date IconCompatParcelizer(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            simpleDateFormat.setLenient(false);
            return simpleDateFormat.parse(str);
        } catch (ParseException unused) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Date is null", new Object[0]);
            return null;
        } catch (IllegalArgumentException unused2) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Illegal argument when parsing Date", new Object[0]);
            return null;
        }
    }

    public static OffsetDateTime write(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(simpleDateFormat.parse(str2));
        } catch (ParseException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Date is null", new Object[0]);
        }
        return OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(instance), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok"));
    }

    public static OffsetDateTime MediaBrowserCompat$ItemReceiver(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(simpleDateFormat.parse(str2));
        } catch (ParseException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Date is null", new Object[0]);
        }
        return OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(instance), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of(TimeZone.getDefault().getID()));
    }

    public static String IconCompatParcelizer(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return new SimpleDateFormat("yyyy-MM-dd").format(simpleDateFormat.parse(str));
        } catch (ParseException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            return "";
        }
    }

    public static String read(String str, String str2) {
        if (str == null) {
            return "";
        }
        String[] split = str.split(str2);
        if (split.length != 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        sb.append(split[0]);
        sb.append(str2);
        sb.append(split[1]);
        sb.append(str2);
        int parseInt = Integer.parseInt(split[2]);
        int i = parseInt - 543;
        if (i + 100 >= Calendar.getInstance().get(1)) {
            z = true;
        }
        if (z) {
            parseInt = i;
        }
        sb.append(parseInt);
        return sb.toString();
    }

    private static C7022x6c0e8d61 read(Resources resources) {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = resources.getConfiguration().getLocales().get(0);
        } else {
            locale = resources.getConfiguration().locale;
        }
        if (locale.equals(new Locale("th"))) {
            return ScheduleListAdapter$ScheduleListWithHeaderViewHolder.INSTANCE;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.rsnScriptSetVarI write(java.lang.String r8, p040o.rsnIncAllocationCreateTyped r9, int r10, int r11, java.util.Map<p040o.rsnIncObjDestroy, ?> r12) {
        /*
            r7 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            r1 = 33
            r2 = 0
            if (r12 == 0) goto L_0x004a
            o.rsnIncObjDestroy r3 = p040o.rsnIncObjDestroy.CHARACTER_SET
            boolean r3 = r12.containsKey(r3)
            if (r3 == 0) goto L_0x001d
            o.rsnIncObjDestroy r0 = p040o.rsnIncObjDestroy.CHARACTER_SET
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
        L_0x001d:
            o.rsnIncObjDestroy r3 = p040o.rsnIncObjDestroy.ERROR_CORRECTION
            boolean r3 = r12.containsKey(r3)
            if (r3 == 0) goto L_0x0033
            o.rsnIncObjDestroy r1 = p040o.rsnIncObjDestroy.ERROR_CORRECTION
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
        L_0x0033:
            o.rsnIncObjDestroy r3 = p040o.rsnIncObjDestroy.AZTEC_LAYERS
            boolean r3 = r12.containsKey(r3)
            if (r3 == 0) goto L_0x004a
            o.rsnIncObjDestroy r3 = p040o.rsnIncObjDestroy.AZTEC_LAYERS
            java.lang.Object r12 = r12.get(r3)
            java.lang.String r12 = r12.toString()
            int r12 = java.lang.Integer.parseInt(r12)
            goto L_0x004b
        L_0x004a:
            r12 = r2
        L_0x004b:
            o.rsnIncAllocationCreateTyped r3 = p040o.rsnIncAllocationCreateTyped.AZTEC
            if (r9 != r3) goto L_0x009f
            byte[] r8 = r8.getBytes(r0)
            o.getICheckDeserializerRtti r8 = p040o.rsnScriptGroup2Execute.write(r8, r1, r12)
            o.rsnScriptSetVarI r8 = r8.write
            if (r8 == 0) goto L_0x0099
            int r9 = r8.IconCompatParcelizer
            int r12 = r8.write
            int r10 = java.lang.Math.max(r10, r9)
            int r11 = java.lang.Math.max(r11, r12)
            int r0 = r10 / r9
            int r1 = r11 / r12
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r9 * r0
            int r1 = r10 - r1
            int r1 = r1 / 2
            int r3 = r12 * r0
            int r3 = r11 - r3
            int r3 = r3 / 2
            o.rsnScriptSetVarI r4 = new o.rsnScriptSetVarI
            r4.<init>(r10, r11)
            r10 = r2
        L_0x0081:
            if (r10 >= r12) goto L_0x0098
            r5 = r1
            r11 = r2
        L_0x0085:
            if (r11 >= r9) goto L_0x0094
            boolean r6 = r8.MediaBrowserCompat$ItemReceiver(r11, r10)
            if (r6 == 0) goto L_0x0090
            r4.IconCompatParcelizer(r5, r3, r0, r0)
        L_0x0090:
            int r11 = r11 + 1
            int r5 = r5 + r0
            goto L_0x0085
        L_0x0094:
            int r10 = r10 + 1
            int r3 = r3 + r0
            goto L_0x0081
        L_0x0098:
            return r4
        L_0x0099:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x009f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Can only encode AZTEC, but got "
            r8.<init>(r10)
            r8.append(r9)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.CheckCaptureActivity.write(java.lang.String, o.rsnIncAllocationCreateTyped, int, int, java.util.Map):o.rsnScriptSetVarI");
    }
}
