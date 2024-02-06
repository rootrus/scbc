package p040o;

import android.util.Base64;
import com.scb.phone.domain.errors.RetrofitException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.removeIfFromRandomAccessList */
public class removeIfFromRandomAccessList {
    private removeIfFromRandomAccessList() {
    }

    public static long MediaBrowserCompat$ItemReceiver() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public static String read(double d) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(',');
        return new DecimalFormat("0.00", decimalFormatSymbols).format(d);
    }

    public static double IconCompatParcelizer(String str) {
        try {
            return Double.parseDouble(str.replace(",", ""));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return str.length() == 10;
    }

    public static boolean MediaBrowserCompat$ItemReceiver(String str) {
        return str.length() == 13;
    }

    public static String read(String str, String str2, String str3) {
        String replaceAll;
        synchronized (removeIfFromRandomAccessList.class) {
            String replaceAll2 = str.replaceAll(str2, "");
            char[] charArray = str3.toCharArray();
            char[] charArray2 = replaceAll2.toCharArray();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= charArray.length) {
                    break;
                } else if (i2 >= charArray2.length) {
                    break;
                } else {
                    if (charArray[i] != 'X') {
                        sb.append(charArray[i]);
                    } else {
                        sb.append(charArray2[i2]);
                        i2++;
                    }
                    i++;
                }
            }
            replaceAll = sb.toString().replaceAll("X", "");
        }
        return replaceAll;
    }

    public static boolean IconCompatParcelizer(Throwable th, RetrofitException.read... readArr) {
        return (th instanceof RetrofitException) && Arrays.asList(readArr).contains(((RetrofitException) th).write);
    }

    public static boolean MediaBrowserCompat$ItemReceiver(Throwable th, String... strArr) {
        ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
        return (th instanceof RetrofitException) && iLocationSourceDelegate != null && iLocationSourceDelegate.write != null && Arrays.asList(strArr).contains(iLocationSourceDelegate.write.IconCompatParcelizer);
    }

    public static OffsetDateTime write(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(simpleDateFormat.parse(str2));
        } catch (ParseException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
        return OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(instance), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok"));
    }

    public static String IconCompatParcelizer(String str, PlaceBuffer placeBuffer) {
        C1189xa6547b7b fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaSessionCompat$ResultReceiverWrapper = new C1189xa6547b7b();
        try {
            String str2 = placeBuffer.write;
            if (str2 == null) {
                str2 = "";
            }
            return fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaSessionCompat$ResultReceiverWrapper.write(AlertController$RecycleListView.read(str2), placeBuffer.read, str, placeBuffer.MediaBrowserCompat$MediaItem, placeBuffer.MediaBrowserCompat$SearchResultReceiver);
        } catch (Exception e) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Cannot encryptAtmCardPin PIN", e);
            return "";
        }
    }

    public static String MediaBrowserCompat$ItemReceiver(String str, String str2) {
        return read(str.getBytes(), str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String read(java.io.File r8, java.lang.String r9, java.lang.Boolean r10) {
        /*
            java.lang.String r0 = ""
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0047 }
            r1.<init>(r8)     // Catch:{ IOException -> 0x0047 }
            long r2 = r8.length()     // Catch:{ all -> 0x003b }
            int r2 = (int) r2     // Catch:{ all -> 0x003b }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x003b }
            int r3 = r1.read(r2)     // Catch:{ all -> 0x003b }
            long r4 = r8.length()     // Catch:{ all -> 0x003b }
            long r6 = (long) r3
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x001f
            r1.close()     // Catch:{ IOException -> 0x0047 }
            return r0
        L_0x001f:
            r1.close()     // Catch:{ IOException -> 0x0047 }
            boolean r8 = r10.booleanValue()
            if (r8 == 0) goto L_0x0036
            r8 = 2
            java.lang.String r8 = android.util.Base64.encodeToString(r2, r8)
            byte[] r8 = r8.getBytes()
            java.lang.String r8 = read(r8, r9)
            return r8
        L_0x0036:
            java.lang.String r8 = read(r2, r9)
            return r8
        L_0x003b:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x003d }
        L_0x003d:
            r9 = move-exception
            r1.close()     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r10 = move-exception
            r8.addSuppressed(r10)     // Catch:{ IOException -> 0x0047 }
        L_0x0046:
            throw r9     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.removeIfFromRandomAccessList.read(java.io.File, java.lang.String, java.lang.Boolean):java.lang.String");
    }

    private static String read(byte[] bArr, String str) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(str.getBytes(), "HmacSHA256"));
            return Base64.encodeToString(instance.doFinal(bArr), 2);
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static boolean write(String str) {
        if (str != null) {
            if ((str.length() == 10) && str.startsWith("0")) {
                return true;
            }
        }
        return false;
    }

    public static boolean read(String str) {
        if (str.length() == 13) {
            return true;
        }
        return str.length() == 10;
    }
}
