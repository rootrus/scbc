package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.provider.Settings;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import com.google.zxing.WriterException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p039io.beid.beidk.definitions.LivenessStatus;

/* renamed from: o.getICheckDeserializerRtti */
public final class getICheckDeserializerRtti {
    public rsnScriptSetVarI write;

    public static NumberFormat MediaBrowserCompat$ItemReceiver(NumberFormat numberFormat) {
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.setNegativeSuffix("");
        decimalFormat.setNegativePrefix("-");
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol("");
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return numberFormat;
    }

    public static Double MediaBrowserCompat$ItemReceiver(String str) {
        if (str == null) {
            return Double.valueOf(0.0d);
        }
        String format = String.format("[%s,.\\s]", new Object[]{NumberFormat.getCurrencyInstance().getCurrency().getSymbol()});
        if (str.equalsIgnoreCase(".")) {
            str = "0";
        }
        if (!str.contains(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("00");
            str = sb.toString();
        } else {
            String substring = str.substring(str.indexOf(46) + 1, str.length());
            if (substring.length() == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("00");
                str = sb2.toString();
            } else if (substring.length() == 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("0");
                str = sb3.toString();
            }
        }
        return Double.valueOf(new BigDecimal(str.replaceAll(format, "")).setScale(2, 3).divide(new BigDecimal(100), 3).doubleValue());
    }

    public static String MediaBrowserCompat$ItemReceiver(double d) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        return new DecimalFormat("###,###,###,###,###,##0.00", decimalFormatSymbols).format(d);
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(double d) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        return new DecimalFormat("###,###,###,##0", decimalFormatSymbols).format(d);
    }

    public static String IconCompatParcelizer(BigDecimal bigDecimal) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        return new DecimalFormat("###,###,###,###,###,##0.00", decimalFormatSymbols).format(bigDecimal);
    }

    public static String read(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((str == null || str.isEmpty() || Double.parseDouble(str) <= 0.0d) ? "" : "+");
        sb.append(IconCompatParcelizer(ParcelableVolumeInfo(str)));
        return sb.toString();
    }

    public static BigDecimal ParcelableVolumeInfo(String str) {
        String format = String.format("[%s,.\\s]", new Object[]{NumberFormat.getCurrencyInstance().getCurrency().getSymbol()});
        if (str.equalsIgnoreCase(".")) {
            str = "0";
        }
        if (!str.contains(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(LivenessStatus.f5461OK);
            str = sb.toString();
        } else {
            String substring = str.substring(str.indexOf(46) + 1, str.length());
            if (substring.length() == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(LivenessStatus.f5461OK);
                str = sb2.toString();
            } else if (substring.length() == 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("000");
                str = sb3.toString();
            } else if (substring.length() == 2) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append("00");
                str = sb4.toString();
            } else if (substring.length() == 3) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append("0");
                str = sb5.toString();
            }
        }
        return new BigDecimal(str.replaceAll(format, "")).setScale(4, 3).divide(new BigDecimal(10000), 3);
    }

    public static String IconCompatParcelizer(double d) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        return new DecimalFormat("0.0000", decimalFormatSymbols).format(d);
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(BigDecimal bigDecimal) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        return new DecimalFormat("###,###,###,##0.0000", decimalFormatSymbols).format(bigDecimal);
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(String str, boolean z) {
        if (str == null || str.length() != 10) {
            return str;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("xxx-xxx");
            sb.append(str.substring(6, 9));
            sb.append("-");
            sb.append(str.substring(9, 10));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, 3));
        sb2.append("-");
        sb2.append(str.substring(3, 9));
        sb2.append("-");
        sb2.append(str.substring(9, 10));
        return sb2.toString();
    }

    public static String MediaMetadataCompat(String str) {
        return (str == null || str.contains("\n") || str.length() != 16) ? str : str.replaceFirst("\\b([0-9]{4})([0-9]{2})[0-9]{0,9}([0-9]{4})\\b", "$1 $2xx xxxx $3");
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (str.length() == 0) {
            return str;
        }
        String replace = str.replace(" ", "");
        if (replace.length() > 16) {
            replace = replace.substring(0, 16);
        }
        List<String> MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem(replace);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MediaSessionCompat$QueueItem.size(); i++) {
            if (i == MediaSessionCompat$QueueItem.size() - 1) {
                sb.append(MediaSessionCompat$QueueItem.get(i));
            } else {
                sb.append(MediaSessionCompat$QueueItem.get(i));
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private static List<String> MediaSessionCompat$QueueItem(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 4;
            arrayList.add(str.substring(i, Math.min(str.length(), i2)));
            i = i2;
        }
        return arrayList;
    }

    public static String IconCompatParcelizer(String str, String str2) {
        if (str == null || str.length() != 16) {
            return str;
        }
        return str.replaceFirst("\\b([0-9]{4})([0-9]{2})[0-9X]{0,9}[0-9]{0,9}\\b", "$1 $2xx xxxx ".concat(str2 != null ? str2.substring(str2.length() - 4) : str.substring(str.length() - 4)));
    }

    public static String MediaDescriptionCompat(String str) {
        if (str == null || str.length() != 12) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 3));
        sb.append("-");
        sb.append(str.substring(3, 4));
        sb.append("-");
        sb.append(str.substring(4, 11));
        sb.append("-");
        sb.append(str.substring(11, 12));
        return sb.toString();
    }

    public static String IconCompatParcelizer(boolean z, boolean z2, String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length == 13) {
            return write(z, str);
        }
        if (length == 16) {
            return IconCompatParcelizer(z, str, "xxxx xxxx xxxx ");
        }
        switch (length) {
            case 9:
                return write(z, z2, str);
            case 10:
                return MediaBrowserCompat$CustomActionResultReceiver(z, z2, str);
            case 11:
                return MediaBrowserCompat$CustomActionResultReceiver(z, str, "xxxxxxx");
            default:
                return str;
        }
    }

    private static String write(boolean z, boolean z2, String str) {
        if (!z2) {
            return str;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("xx-xxx-");
            sb.append(str.substring(5, 9));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, 2));
        sb2.append("-");
        sb2.append(str.substring(2, 5));
        sb2.append("-");
        sb2.append(str.substring(5, 9));
        return sb2.toString();
    }

    private static String write(boolean z, String str) {
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, 1));
            sb.append("-");
            sb.append(str.substring(1, 5));
            sb.append("-");
            sb.append(str.substring(5, 9));
            sb.append("x-xx-x");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, 1));
        sb2.append("-");
        sb2.append(str.substring(1, 5));
        sb2.append("-");
        sb2.append(str.substring(5, 10));
        sb2.append("-");
        sb2.append(str.substring(10, 12));
        sb2.append("-");
        sb2.append(str.substring(12, 13));
        return sb2.toString();
    }

    private static String MediaBrowserCompat$CustomActionResultReceiver(boolean z, String str, String str2) {
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str.substring(7, 11));
        return sb.toString();
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(boolean z, boolean z2, String str) {
        if (z2) {
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("xxx-xxx-");
                sb.append(str.substring(6, 10));
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, 3));
            sb2.append("-");
            sb2.append(str.substring(3, 6));
            sb2.append("-");
            sb2.append(str.substring(6, 10));
            return sb2.toString();
        } else if (z) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("xxx-xxx");
            sb3.append(str.substring(6, 9));
            sb3.append("-");
            sb3.append(str.substring(9, 10));
            return sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str.substring(0, 3));
            sb4.append("-");
            sb4.append(str.substring(3, 9));
            sb4.append("-");
            sb4.append(str.substring(9, 10));
            return sb4.toString();
        }
    }

    private static String IconCompatParcelizer(boolean z, String str, String str2) {
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str.substring(12, 16));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, 4));
        sb2.append(" ");
        sb2.append(str.substring(4, 8));
        sb2.append(" ");
        sb2.append(str.substring(8, 12));
        sb2.append(" ");
        sb2.append(str.substring(12, 16));
        return sb2.toString();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static String m3099x50fd9e4a(String str) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        if (matcher.find()) {
            do {
                sb.append(matcher.group());
            } while (matcher.find());
        }
        return sb.toString();
    }

    public static String MediaSessionCompat$ResultReceiverWrapper(String str) {
        String MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = m3099x50fd9e4a(str);
        return MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.length() == 10 ? IconCompatParcelizer(false, true, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) : MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    }

    public static int read(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            return 0;
        }
    }

    public static String MediaBrowserCompat$ItemReceiver(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null && !str.isEmpty()) {
                if (i == 0 || sb.toString().isEmpty()) {
                    sb.append(str);
                } else {
                    sb.append("\n");
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static boolean MediaBrowserCompat$MediaItem(String str) {
        if (TextUtils.isEmpty(str) || ".".equalsIgnoreCase(str)) {
            return true;
        }
        String replaceAll = str.replaceAll(",", "");
        if (TextUtils.isEmpty(replaceAll) || Double.parseDouble(replaceAll) == 0.0d) {
            return true;
        }
        return false;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(Editable editable) {
        if (TextUtils.isEmpty(editable) || ".".equalsIgnoreCase(editable.toString())) {
            return true;
        }
        String replaceAll = editable.toString().replaceAll(",", "");
        if (TextUtils.isEmpty(replaceAll) || Double.parseDouble(replaceAll) == 0.0d) {
            return true;
        }
        return false;
    }

    public static String MediaBrowserCompat$ItemReceiver(IGoogleMapDelegate iGoogleMapDelegate) {
        int i = C13363.write[iGoogleMapDelegate.ordinal()];
        if (i == 1) {
            return "OWN";
        }
        if (i == 2) {
            return "3RD";
        }
        if (i != 3) {
            return i != 4 ? "" : "PP";
        }
        return "ORFT";
    }

    public static IGoogleMapDelegate MediaSessionCompat$Token(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1927841485:
                if (str.equals("PP_SCB")) {
                    c = 6;
                    break;
                }
                break;
            case -1527942159:
                if (str.equals("PP_OTHER")) {
                    c = 7;
                    break;
                }
                break;
            case 2560:
                if (str.equals("PP")) {
                    c = 5;
                    break;
                }
                break;
            case 51621:
                if (str.equals("3RD")) {
                    c = 1;
                    break;
                }
                break;
            case 78694:
                if (str.equals("OWN")) {
                    c = 0;
                    break;
                }
                break;
            case 81906:
                if (str.equals("SCB")) {
                    c = 2;
                    break;
                }
                break;
            case 2434545:
                if (str.equals("ORFT")) {
                    c = 3;
                    break;
                }
                break;
            case 75532016:
                if (str.equals("OTHER")) {
                    c = 4;
                    break;
                }
                break;
            case 1988312228:
                if (str.equals("PROMPTPAY")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return IGoogleMapDelegate.OWN;
            case 1:
            case 2:
                return IGoogleMapDelegate.SCB;
            case 3:
            case 4:
                return IGoogleMapDelegate.OTHER;
            case 5:
            case 6:
            case 7:
            case 8:
                return IGoogleMapDelegate.PROMPTPAY;
            default:
                return null;
        }
    }

    /* renamed from: o.getICheckDeserializerRtti$3 */
    public static /* synthetic */ class C13363 {
        public static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                o.animateCameraWithCallback[] r0 = p040o.animateCameraWithCallback.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                r1 = 1
                o.animateCameraWithCallback r2 = p040o.animateCameraWithCallback.CID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.animateCameraWithCallback r3 = p040o.animateCameraWithCallback.MOB     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                o.IGoogleMapDelegate[] r2 = p040o.IGoogleMapDelegate.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                write = r2
                o.IGoogleMapDelegate r3 = p040o.IGoogleMapDelegate.OWN     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = write     // Catch:{ NoSuchFieldError -> 0x0038 }
                o.IGoogleMapDelegate r2 = p040o.IGoogleMapDelegate.SCB     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0043 }
                o.IGoogleMapDelegate r1 = p040o.IGoogleMapDelegate.OTHER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x004e }
                o.IGoogleMapDelegate r1 = p040o.IGoogleMapDelegate.PROMPTPAY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.getICheckDeserializerRtti.C13363.<clinit>():void");
        }
    }

    public static Integer write(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        if (i >= split.length || i >= split2.length) {
            return Integer.valueOf(Integer.signum(split.length - split2.length));
        }
        try {
            return Integer.valueOf(Integer.signum(Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i]))));
        } catch (NumberFormatException unused) {
            return Integer.valueOf(Integer.signum(0));
        }
    }

    public static Uri MediaBrowserCompat$CustomActionResultReceiver(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("android.resource://");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.scb.phone.presentation".replace(".presentation", ""));
        sb.append(sb2.toString());
        sb.append("/");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    public static Bitmap MediaBrowserCompat$ItemReceiver(String str, Bitmap bitmap, double d) {
        EnumMap enumMap = new EnumMap(rsnIncObjDestroy.class);
        enumMap.put(rsnIncObjDestroy.ERROR_CORRECTION, execute.M);
        return write(str, 600, 600, enumMap, bitmap, d);
    }

    public static DebitCardResetOtpActivity<Bitmap> write(String str, int i, int i2, execute execute) {
        EnumMap enumMap = new EnumMap(rsnIncObjDestroy.class);
        enumMap.put(rsnIncObjDestroy.ERROR_CORRECTION, execute);
        return DebitCardResetOtpActivity.fromCallable(new CheckCaptureActivity_MembersInjector(str, i, i2, enumMap)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver());
    }

    public static Bitmap read(String str, int i, int i2, Map<rsnIncObjDestroy, Object> map) {
        try {
            rsnScriptSetVarI write2 = new rsnScriptBindAllocation().write(str, rsnIncAllocationCreateTyped.QR_CODE, i, i2, map);
            int i3 = write2.IconCompatParcelizer;
            int i4 = write2.write;
            int[] iArr = new int[(i3 * i4)];
            for (int i5 = 0; i5 < i4; i5++) {
                for (int i6 = 0; i6 < i3; i6++) {
                    iArr[(i5 * i3) + i6] = write2.MediaBrowserCompat$ItemReceiver(i6, i5) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i, 0, 0, i3, i4);
            return createBitmap;
        } catch (WriterException | IllegalArgumentException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            return null;
        }
    }

    private static Bitmap write(String str, int i, int i2, Map<rsnIncObjDestroy, Object> map, Bitmap bitmap, double d) {
        try {
            rsnScriptSetVarI write2 = new rsnScriptBindAllocation().write(str, rsnIncAllocationCreateTyped.QR_CODE, 600, 600, map);
            int i3 = write2.IconCompatParcelizer;
            int i4 = write2.write;
            int[] iArr = new int[(i3 * i4)];
            for (int i5 = 0; i5 < i4; i5++) {
                for (int i6 = 0; i6 < i3; i6++) {
                    iArr[(i5 * i3) + i6] = write2.MediaBrowserCompat$ItemReceiver(i6, i5) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, 600, 0, 0, i3, i4);
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), createBitmap.getConfig());
            Canvas canvas = new Canvas(createBitmap2);
            canvas.drawBitmap(createBitmap, new Matrix(), (Paint) null);
            Double valueOf = Double.valueOf(Math.sqrt((((d / 100.0d) * 360000.0d) * ((double) bitmap.getHeight())) / ((double) bitmap.getWidth())));
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Double.valueOf((((double) bitmap.getWidth()) / ((double) bitmap.getHeight())) * valueOf.doubleValue()).intValue(), valueOf.intValue(), false);
            canvas.drawBitmap(createScaledBitmap, 300.0f - (((float) createScaledBitmap.getWidth()) / 2.0f), 300.0f - (((float) createScaledBitmap.getHeight()) / 2.0f), (Paint) null);
            return createBitmap2;
        } catch (WriterException | IllegalArgumentException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            return null;
        }
    }

    static /* synthetic */ Bitmap IconCompatParcelizer(String str, int i, int i2, Map map) throws Exception {
        try {
            rsnScriptSetVarI write2 = new rsnScriptBindAllocation().write(str, rsnIncAllocationCreateTyped.QR_CODE, i, i2, map);
            int i3 = write2.IconCompatParcelizer;
            int i4 = write2.write;
            int[] iArr = new int[(i3 * i4)];
            for (int i5 = 0; i5 < i4; i5++) {
                for (int i6 = 0; i6 < i3; i6++) {
                    iArr[(i5 * i3) + i6] = write2.MediaBrowserCompat$ItemReceiver(i6, i5) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i, 0, 0, i3, i4);
            return createBitmap;
        } catch (WriterException | IllegalArgumentException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            throw e;
        }
    }

    public static Bitmap MediaBrowserCompat$CustomActionResultReceiver(String str, int i, int i2, Map<rsnIncObjDestroy, Object> map) {
        try {
            rsnScriptSetVarI write2 = new rsnScriptBindAllocation().write(str, rsnIncAllocationCreateTyped.CODE_128, i, i2, map);
            int i3 = write2.IconCompatParcelizer;
            int i4 = write2.write;
            int[] iArr = new int[(i3 * i4)];
            for (int i5 = 0; i5 < i4; i5++) {
                for (int i6 = 0; i6 < i3; i6++) {
                    iArr[(i5 * i3) + i6] = write2.MediaBrowserCompat$ItemReceiver(i6, i5) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i, 0, 0, i3, i4);
            return createBitmap;
        } catch (WriterException | IllegalArgumentException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            return null;
        }
    }

    public static CharSequence read(int i, List<String> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (i2 < list.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(i2));
            sb.append(i2 < list.size() + -1 ? "\n" : "");
            SpannableString spannableString = new SpannableString(sb.toString());
            spannableString.setSpan(new BulletSpan(i), 0, spannableString.length(), 17);
            spannableStringBuilder.append(spannableString);
            i2++;
        }
        return spannableStringBuilder;
    }

    public static String write(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(0, str.indexOf("_"));
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean IconCompatParcelizer(String str) {
        if (str != null) {
            if ((str.length() == 9 || str.length() == 10) && str.startsWith("0")) {
                return true;
            }
        }
        return false;
    }

    public static Uri write(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.scb.phone.presentation".replace(".presentation", ""));
        String obj = sb.toString();
        if (context != null) {
            obj = context.getPackageName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("android.resource://");
        sb2.append(obj);
        sb2.append("/");
        sb2.append(i);
        return Uri.parse(sb2.toString());
    }

    public static String MediaBrowserCompat$SearchResultReceiver(String str) {
        String[] split = str.replaceAll("[^0-9.]", "").split("\\.");
        boolean z = false;
        if (split.length == 1) {
            return split[0];
        }
        if (split.length <= 1) {
            return str;
        }
        String str2 = split[0];
        String str3 = split[1];
        if (str3.length() > 2) {
            str3 = str3.substring(0, 2);
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(".");
        sb.append(str3);
        return sb.toString();
    }

    public static String RatingCompat(String str) {
        return str == null || str.length() == 0 ? "" : str.replace(",", "");
    }

    public static String read(String str, String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!str.startsWith(str2) && !str.startsWith("android.resource")) {
            return str2.concat(str);
        }
        return str;
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!str.startsWith(str2) && !str.startsWith("http") && !str.startsWith("android.resource")) {
            return str2.concat(str);
        }
        return str;
    }

    public static String MediaBrowserCompat$ItemReceiver(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        if (str == null) {
            str = removeIfFromRandomAccessList.MediaBrowserCompat$CustomActionResultReceiver(str2) ? "MOB" : removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(str2) ? "CID" : "";
        }
        if ("MOB".compareTo(str) == 0) {
            return IconCompatParcelizer(false, true, str2);
        }
        if ("CID".compareTo(str) == 0) {
            return IconCompatParcelizer(false, false, str2);
        }
        return "";
    }
}
