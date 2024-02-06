package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import com.scb.phone.domain.errors.RetrofitException;
import p040o.access$2300;

/* renamed from: o.RegularImmutableBiMap */
public class RegularImmutableBiMap extends constrainedListMultimap {
    @HmlPinActivity
    public RegularImmutableBiMap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: o.snapshotForTest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: o.snapshotForTest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: o.snapshotForTest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: o.snapshotForTest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: o.snapshotForTest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: o.snapshotForTest} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v5, types: [o.snapshotForTest] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.access$2200 MediaBrowserCompat$ItemReceiver(java.lang.Throwable r6, p040o.access$2300.write r7) {
        /*
            r5 = this;
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource
            android.content.res.Resources r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r1.getString(r0)
            boolean r1 = r6 instanceof com.scb.phone.domain.errors.RetrofitException
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L_0x00d8
            com.scb.phone.domain.errors.RetrofitException r6 = (com.scb.phone.domain.errors.RetrofitException) r6
            int[] r0 = p040o.RegularImmutableBiMap.C37525.write
            com.scb.phone.domain.errors.RetrofitException$read r1 = r6.write
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x00ca;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00a8;
                case 4: goto L_0x007c;
                case 5: goto L_0x007c;
                case 6: goto L_0x0073;
                case 7: goto L_0x0050;
                case 8: goto L_0x0030;
                case 9: goto L_0x0028;
                case 10: goto L_0x0028;
                case 11: goto L_0x0028;
                default: goto L_0x001e;
            }
        L_0x001e:
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource
            android.content.res.Resources r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00d2
        L_0x0028:
            o.ILocationSourceDelegate r0 = r6.IconCompatParcelizer     // Catch:{ Exception -> 0x00c8 }
            o.ILocationSourceDelegate$zza r0 = r0.write     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r0 = r0.read     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00d2
        L_0x0030:
            o.access$2300$write r7 = p040o.access$2300.write.NAVIGATE_BACK
            o.ILocationSourceDelegate r0 = r6.IconCompatParcelizer     // Catch:{ Exception -> 0x003a }
            o.ILocationSourceDelegate$zza r0 = r0.write     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = r0.write     // Catch:{ Exception -> 0x003a }
            r3 = r0
            goto L_0x003e
        L_0x003a:
            r0 = move-exception
            p040o.onCheckBoxClick.IconCompatParcelizer(r0)
        L_0x003e:
            o.ILocationSourceDelegate r0 = r6.IconCompatParcelizer     // Catch:{ Exception -> 0x0046 }
            o.ILocationSourceDelegate$zza r0 = r0.write     // Catch:{ Exception -> 0x0046 }
            java.lang.String r0 = r0.read     // Catch:{ Exception -> 0x0046 }
            goto L_0x00d2
        L_0x0046:
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource
            android.content.res.Resources r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00d2
        L_0x0050:
            o.access$2300$write r7 = p040o.access$2300.write.WIPE_CONFIG
            o.ILocationSourceDelegate r0 = r6.IconCompatParcelizer     // Catch:{ Exception -> 0x005a }
            o.ILocationSourceDelegate$zza r0 = r0.write     // Catch:{ Exception -> 0x005a }
            java.lang.String r0 = r0.write     // Catch:{ Exception -> 0x005a }
            r3 = r0
            goto L_0x005e
        L_0x005a:
            r0 = move-exception
            p040o.onCheckBoxClick.IconCompatParcelizer(r0)
        L_0x005e:
            o.ILocationSourceDelegate r0 = r6.IconCompatParcelizer     // Catch:{ Exception -> 0x0066 }
            o.ILocationSourceDelegate$zza r0 = r0.write     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = r0.read     // Catch:{ Exception -> 0x0066 }
            goto L_0x00d2
        L_0x0066:
            r0 = move-exception
            p040o.onCheckBoxClick.IconCompatParcelizer(r0)
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.session_expired
            android.content.res.Resources r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00d2
        L_0x0073:
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource
            android.content.res.Resources r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00d2
        L_0x007c:
            o.snapshotForTest r0 = r6.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0097
            java.lang.String r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x0097
            java.lang.String r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = "login/preloadandresumecheck"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x0097
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_connection
            android.content.res.Resources r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00d2
        L_0x0097:
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_generic_header
            android.content.res.Resources r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r3 = r1.getString(r0)
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_generic
            android.content.res.Resources r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00d2
        L_0x00a8:
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_connection
            android.content.res.Resources r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r1.getString(r0)
            goto L_0x00d2
        L_0x00b1:
            o.ILocationSourceDelegate r0 = r6.IconCompatParcelizer     // Catch:{ Exception -> 0x00b9 }
            o.ILocationSourceDelegate$zza r0 = r0.write     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = r0.write     // Catch:{ Exception -> 0x00b9 }
            r3 = r0
            goto L_0x00bd
        L_0x00b9:
            r0 = move-exception
            p040o.onCheckBoxClick.IconCompatParcelizer(r0)
        L_0x00bd:
            o.ILocationSourceDelegate r0 = r6.IconCompatParcelizer     // Catch:{ Exception -> 0x00c4 }
            o.ILocationSourceDelegate$zza r0 = r0.write     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r0 = r0.read     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00d2
        L_0x00c4:
            r0 = move-exception
            p040o.onCheckBoxClick.IconCompatParcelizer(r0)
        L_0x00c8:
            r0 = r2
            goto L_0x00d2
        L_0x00ca:
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource
            android.content.res.Resources r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r1.getString(r0)
        L_0x00d2:
            o.snapshotForTest r6 = r6.MediaBrowserCompat$ItemReceiver
            r4 = r3
            r3 = r6
            r6 = r4
            goto L_0x00d9
        L_0x00d8:
            r6 = r3
        L_0x00d9:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00e0
            r2 = r0
        L_0x00e0:
            o.access$2200 r6 = r5.read(r6, r2, r7)
            if (r3 != 0) goto L_0x00eb
            o.snapshotForTest r3 = new o.snapshotForTest
            r3.<init>()
        L_0x00eb:
            r6.read = r3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.RegularImmutableBiMap.MediaBrowserCompat$ItemReceiver(java.lang.Throwable, o.access$2300$write):o.access$2200");
    }

    /* renamed from: o.RegularImmutableBiMap$5 */
    static /* synthetic */ class C37525 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.scb.phone.domain.errors.RetrofitException$read[] r0 = com.scb.phone.domain.errors.RetrofitException.read.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                com.scb.phone.domain.errors.RetrofitException$read r1 = com.scb.phone.domain.errors.RetrofitException.read.HTTP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                com.scb.phone.domain.errors.RetrofitException$read r1 = com.scb.phone.domain.errors.RetrofitException.read.API_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.scb.phone.domain.errors.RetrofitException$read r1 = com.scb.phone.domain.errors.RetrofitException.read.NETWORK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.scb.phone.domain.errors.RetrofitException$read r1 = com.scb.phone.domain.errors.RetrofitException.read.SERVER_ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x003e }
                com.scb.phone.domain.errors.RetrofitException$read r1 = com.scb.phone.domain.errors.RetrofitException.read.TIME_OUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.scb.phone.domain.errors.RetrofitException$read r1 = com.scb.phone.domain.errors.RetrofitException.read.UNEXPECTED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.scb.phone.domain.errors.RetrofitException$read r1 = com.scb.phone.domain.errors.RetrofitException.read.SESSION_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.scb.phone.domain.errors.RetrofitException$read r1 = com.scb.phone.domain.errors.RetrofitException.read.TRANSACTION_TOKEN_INVALID     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x006c }
                com.scb.phone.domain.errors.RetrofitException$read r1 = com.scb.phone.domain.errors.RetrofitException.read.OTP_FAILED     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.scb.phone.domain.errors.RetrofitException$read r1 = com.scb.phone.domain.errors.RetrofitException.read.OTP_REACH_MAX_LIMIT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.scb.phone.domain.errors.RetrofitException$read r1 = com.scb.phone.domain.errors.RetrofitException.read.OTP_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.RegularImmutableBiMap.C37525.<clinit>():void");
        }
    }

    public final access$2200 MediaBrowserCompat$CustomActionResultReceiver(Throwable th, access$2300.write write) {
        String str;
        String str2;
        if (th instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) th;
            int i = C37525.write[retrofitException.write.ordinal()];
            boolean z = true;
            String str3 = "";
            if (i == 1 || i == 3) {
                try {
                    str = retrofitException.IconCompatParcelizer.write.IconCompatParcelizer;
                } catch (NullPointerException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(retrofitException.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                    str = sb.toString();
                }
                String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.error_connection);
                if (str == null || str.length() != 3 || !str.startsWith("5")) {
                    z = false;
                }
                if (z) {
                    str3 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_header);
                    string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.error_generic);
                }
                access$2200 read = read(str3, string, write);
                read.read = retrofitException.MediaBrowserCompat$ItemReceiver;
                return read;
            } else if (i == 10) {
                try {
                    str2 = retrofitException.IconCompatParcelizer.write.write;
                } catch (NullPointerException e) {
                    onCheckBoxClick.IconCompatParcelizer(e);
                    str2 = str3;
                }
                try {
                    str3 = retrofitException.IconCompatParcelizer.write.read;
                } catch (Exception e2) {
                    onCheckBoxClick.IconCompatParcelizer(e2);
                }
                access$2200 read2 = read(str2, str3, write);
                read2.read = retrofitException.MediaBrowserCompat$ItemReceiver;
                return read2;
            }
        }
        return MediaBrowserCompat$ItemReceiver(th, write);
    }

    public access$2200 read(String str, String str2, access$2300.write write) {
        if (TextUtils.isEmpty(str)) {
            str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.common_error);
        }
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2737ok);
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = string;
        access_2300.read = write;
        access_2300.write = null;
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = str;
        access_2200.IconCompatParcelizer = str2;
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        return access_2200;
    }

    public final access$2200 write(String str, String str2, String str3, Runnable runnable) {
        if (TextUtils.isEmpty(str2)) {
            str2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.common_error);
        }
        if (str != null) {
            str2 = str2.concat(str);
        }
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2737ok);
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = string;
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.MediaBrowserCompat$CustomActionResultReceiver = runnable;
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = str2;
        access_2200.IconCompatParcelizer = str3;
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        return access_2200;
    }

    public final access$2200 MediaBrowserCompat$ItemReceiver(int i, int i2, Runnable runnable) {
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2737ok);
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.MediaBrowserCompat$CustomActionResultReceiver = runnable;
        access$2200 access_2200 = new access$2200();
        access_2200.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(i2);
        access_2200.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.getString(i);
        access_2200.write = access_2300;
        return access_2200;
    }

    public final access$2200 MediaBrowserCompat$ItemReceiver(String str, String str2, int i, int i2, Runnable runnable, Runnable runnable2) {
        if (TextUtils.isEmpty(str)) {
            str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.common_error);
        }
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.getString(i);
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.MediaBrowserCompat$CustomActionResultReceiver = runnable;
        access$2300 access_23002 = new access$2300();
        access_23002.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.getString(i2);
        access_23002.read = access$2300.write.CUSTOM;
        access_23002.MediaBrowserCompat$CustomActionResultReceiver = runnable2;
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = str;
        access_2200.IconCompatParcelizer = str2;
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        access_2200.write = access_23002;
        return access_2200;
    }

    public final access$2200 IconCompatParcelizer(int i, int i2) {
        return read(this.MediaBrowserCompat$CustomActionResultReceiver.getString(i), this.MediaBrowserCompat$CustomActionResultReceiver.getString(i2), access$2300.write.JUST_DISMISS);
    }

    public final access$2200 MediaBrowserCompat$ItemReceiver(Throwable th, Runnable runnable) {
        access$2200 MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
        access$2300 access_2300 = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.MediaBrowserCompat$CustomActionResultReceiver = runnable;
        if (th instanceof RetrofitException) {
            MediaBrowserCompat$ItemReceiver.read = ((RetrofitException) th).MediaBrowserCompat$ItemReceiver;
        }
        return MediaBrowserCompat$ItemReceiver;
    }
}
