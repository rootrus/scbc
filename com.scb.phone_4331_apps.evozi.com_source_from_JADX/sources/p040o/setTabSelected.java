package p040o;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040o.MenuPopupWindow$MenuDropDownListView;

/* renamed from: o.setTabSelected */
public class setTabSelected {
    static final Object IconCompatParcelizer = new Object();
    static final setSupportAllCaps<String, Typeface> MediaBrowserCompat$CustomActionResultReceiver = new setSupportAllCaps<>(16);
    private static final MenuPopupWindow$MenuDropDownListView MediaBrowserCompat$ItemReceiver = new MenuPopupWindow$MenuDropDownListView("fonts");
    private static final Comparator<byte[]> read = new Comparator<byte[]>() {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: write */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(byte[] r5, byte[] r6) {
            /*
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x0007
                int r5 = r5.length
                int r6 = r6.length
                goto L_0x0016
            L_0x0007:
                r0 = 0
                r1 = r0
            L_0x0009:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001b
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x0018
                byte r5 = r5[r1]
                byte r6 = r6[r1]
            L_0x0016:
                int r5 = r5 - r6
                return r5
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x0009
            L_0x001b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setTabSelected.C15521.compare(byte[], byte[]):int");
        }
    };
    static final AppCompatCheckBox<String, ArrayList<MenuPopupWindow$MenuDropDownListView.IconCompatParcelizer<setTabSelected$MediaBrowserCompat$ItemReceiver>>> write = new AppCompatCheckBox<>();

    static setTabSelected$MediaBrowserCompat$ItemReceiver write(Context context, setBackgroundDrawable setbackgrounddrawable, int i) {
        try {
            write MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(context, (CancellationSignal) null, setbackgrounddrawable);
            int i2 = -3;
            if (MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver() == 0) {
                Typeface MediaBrowserCompat$ItemReceiver2 = setTextMetricsParamsCompat.MediaBrowserCompat$ItemReceiver(context, (CancellationSignal) null, MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(), i);
                if (MediaBrowserCompat$ItemReceiver2 != null) {
                    i2 = 0;
                }
                return new setTabSelected$MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2, i2);
            }
            if (MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver() == 1) {
                i2 = -2;
            }
            return new setTabSelected$MediaBrowserCompat$ItemReceiver((Typeface) null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new setTabSelected$MediaBrowserCompat$ItemReceiver((Typeface) null, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        r3 = MediaBrowserCompat$ItemReceiver;
        r3.MediaBrowserCompat$ItemReceiver(new p040o.MenuPopupWindow$MenuDropDownListView.C12393(r3, r1, new android.os.Handler(), new p040o.setTabSelected.C15555()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface MediaBrowserCompat$CustomActionResultReceiver(final android.content.Context r2, final p040o.setBackgroundDrawable r3, final p040o.ContentFrameLayout.read r4, final android.os.Handler r5, boolean r6, int r7, final int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.read
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            o.setSupportAllCaps<java.lang.String, android.graphics.Typeface> r1 = MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0025
            r4.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0025:
            return r1
        L_0x0026:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            o.setTabSelected$MediaBrowserCompat$ItemReceiver r2 = write((android.content.Context) r2, (p040o.setBackgroundDrawable) r3, (int) r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.IconCompatParcelizer
            if (r3 != 0) goto L_0x003b
            android.graphics.Typeface r3 = r2.MediaBrowserCompat$ItemReceiver
            r4.IconCompatParcelizer(r3, r5)
            goto L_0x0040
        L_0x003b:
            int r3 = r2.IconCompatParcelizer
            r4.write(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.MediaBrowserCompat$ItemReceiver
            return r2
        L_0x0043:
            o.setTabSelected$3 r1 = new o.setTabSelected$3
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            o.MenuPopupWindow$MenuDropDownListView r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.read(r1, r7)     // Catch:{ InterruptedException -> 0x0055 }
            o.setTabSelected$MediaBrowserCompat$ItemReceiver r3 = (p040o.setTabSelected$MediaBrowserCompat$ItemReceiver) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.MediaBrowserCompat$ItemReceiver     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            o.setTabSelected$2 r3 = new o.setTabSelected$2
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = IconCompatParcelizer
            monitor-enter(r4)
            o.AppCompatCheckBox<java.lang.String, java.util.ArrayList<o.MenuPopupWindow$MenuDropDownListView$IconCompatParcelizer<o.setTabSelected$MediaBrowserCompat$ItemReceiver>>> r5 = write     // Catch:{ all -> 0x009e }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x009e }
            if (r5 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x0077
            o.AppCompatCheckBox<java.lang.String, java.util.ArrayList<o.MenuPopupWindow$MenuDropDownListView$IconCompatParcelizer<o.setTabSelected$MediaBrowserCompat$ItemReceiver>>> r5 = write     // Catch:{ all -> 0x009e }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x009e }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x009e }
            r5.add(r3)     // Catch:{ all -> 0x009e }
        L_0x0077:
            monitor-exit(r4)
            return r2
        L_0x0079:
            if (r3 == 0) goto L_0x0088
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x009e }
            r5.<init>()     // Catch:{ all -> 0x009e }
            r5.add(r3)     // Catch:{ all -> 0x009e }
            o.AppCompatCheckBox<java.lang.String, java.util.ArrayList<o.MenuPopupWindow$MenuDropDownListView$IconCompatParcelizer<o.setTabSelected$MediaBrowserCompat$ItemReceiver>>> r3 = write     // Catch:{ all -> 0x009e }
            r3.put(r0, r5)     // Catch:{ all -> 0x009e }
        L_0x0088:
            monitor-exit(r4)
            o.MenuPopupWindow$MenuDropDownListView r3 = MediaBrowserCompat$ItemReceiver
            o.setTabSelected$5 r4 = new o.setTabSelected$5
            r4.<init>(r0)
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            o.MenuPopupWindow$MenuDropDownListView$3 r6 = new o.MenuPopupWindow$MenuDropDownListView$3
            r6.<init>(r1, r5, r4)
            r3.MediaBrowserCompat$ItemReceiver(r6)
            return r2
        L_0x009e:
            r2 = move-exception
            monitor-exit(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTabSelected.MediaBrowserCompat$CustomActionResultReceiver(android.content.Context, o.setBackgroundDrawable, o.ContentFrameLayout$read, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: o.setTabSelected$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        private final int IconCompatParcelizer;
        private final boolean MediaBrowserCompat$CustomActionResultReceiver;
        private final int MediaBrowserCompat$ItemReceiver;
        private final int read;
        private final Uri write;

        public IconCompatParcelizer(Uri uri, int i, int i2, boolean z, int i3) {
            if (uri != null) {
                this.write = uri;
                this.IconCompatParcelizer = i;
                this.read = i2;
                this.MediaBrowserCompat$CustomActionResultReceiver = z;
                this.MediaBrowserCompat$ItemReceiver = i3;
                return;
            }
            throw null;
        }

        public Uri MediaBrowserCompat$ItemReceiver() {
            return this.write;
        }

        public int write() {
            return this.IconCompatParcelizer;
        }

        public int read() {
            return this.read;
        }

        public boolean IconCompatParcelizer() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public int MediaBrowserCompat$CustomActionResultReceiver() {
            return this.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.setTabSelected$write */
    public static class write {
        private final IconCompatParcelizer[] MediaBrowserCompat$CustomActionResultReceiver;
        private final int write;

        public write(int i, IconCompatParcelizer[] iconCompatParcelizerArr) {
            this.write = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizerArr;
        }

        public int MediaBrowserCompat$ItemReceiver() {
            return this.write;
        }

        public IconCompatParcelizer[] MediaBrowserCompat$CustomActionResultReceiver() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    public static Map<Uri, ByteBuffer> MediaBrowserCompat$CustomActionResultReceiver(Context context, IconCompatParcelizer[] iconCompatParcelizerArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (IconCompatParcelizer iconCompatParcelizer : iconCompatParcelizerArr) {
            if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver() == 0) {
                Uri MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
                if (!hashMap.containsKey(MediaBrowserCompat$ItemReceiver2)) {
                    hashMap.put(MediaBrowserCompat$ItemReceiver2, DialogTitle.write(context, cancellationSignal, MediaBrowserCompat$ItemReceiver2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static write MediaBrowserCompat$CustomActionResultReceiver(Context context, CancellationSignal cancellationSignal, setBackgroundDrawable setbackgrounddrawable) throws PackageManager.NameNotFoundException {
        ProviderInfo write2 = write(context.getPackageManager(), setbackgrounddrawable, context.getResources());
        if (write2 == null) {
            return new write(1, (IconCompatParcelizer[]) null);
        }
        return new write(0, IconCompatParcelizer(context, setbackgrounddrawable, write2.authority, cancellationSignal));
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List<byte[]> IconCompatParcelizer(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    static IconCompatParcelizer[] IconCompatParcelizer(Context context, setBackgroundDrawable setbackgrounddrawable, String str, CancellationSignal cancellationSignal) {
        Cursor cursor;
        Uri uri;
        setBackgroundDrawable setbackgrounddrawable2 = setbackgrounddrawable;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor2 = null;
        try {
            if (Build.VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{setbackgrounddrawable2.MediaMetadataCompat}, (String) null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{setbackgrounddrawable2.MediaMetadataCompat}, (String) null);
            }
            cursor2 = cursor;
            if (cursor2 != null && cursor2.getCount() > 0) {
                int columnIndex = cursor2.getColumnIndex("result_code");
                arrayList = new ArrayList();
                int columnIndex2 = cursor2.getColumnIndex("_id");
                int columnIndex3 = cursor2.getColumnIndex("file_id");
                int columnIndex4 = cursor2.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor2.getColumnIndex("font_weight");
                int columnIndex6 = cursor2.getColumnIndex("font_italic");
                while (cursor2.moveToNext()) {
                    int i = columnIndex != -1 ? cursor2.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor2.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        uri = ContentUris.withAppendedId(build, cursor2.getLong(columnIndex2));
                    } else {
                        uri = ContentUris.withAppendedId(build2, cursor2.getLong(columnIndex3));
                    }
                    arrayList.add(new IconCompatParcelizer(uri, i2, columnIndex5 != -1 ? cursor2.getInt(columnIndex5) : TitleChanger.DEFAULT_ANIMATION_DELAY, columnIndex6 != -1 && cursor2.getInt(columnIndex6) == 1, i));
                }
            }
            return (IconCompatParcelizer[]) arrayList.toArray(new IconCompatParcelizer[0]);
        } finally {
            if (cursor2 != null) {
                cursor2.close();
            }
        }
    }

    private static List<List<byte[]>> MediaBrowserCompat$ItemReceiver(setBackgroundDrawable setbackgrounddrawable, Resources resources) {
        if (setbackgrounddrawable.IconCompatParcelizer != null) {
            return setbackgrounddrawable.IconCompatParcelizer;
        }
        return setFirstBaselineToTopHeight.MediaBrowserCompat$ItemReceiver(resources, setbackgrounddrawable.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static ProviderInfo write(PackageManager packageManager, setBackgroundDrawable setbackgrounddrawable, Resources resources) throws PackageManager.NameNotFoundException {
        String str = setbackgrounddrawable.write;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(str);
            throw new PackageManager.NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(setbackgrounddrawable.MediaBrowserCompat$ItemReceiver)) {
            List<byte[]> IconCompatParcelizer2 = IconCompatParcelizer(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(IconCompatParcelizer2, read);
            List<List<byte[]>> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(setbackgrounddrawable, resources);
            for (int i = 0; i < MediaBrowserCompat$ItemReceiver2.size(); i++) {
                ArrayList arrayList = new ArrayList(MediaBrowserCompat$ItemReceiver2.get(i));
                Collections.sort(arrayList, read);
                if (MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found content provider ");
            sb2.append(str);
            sb2.append(", but package was not ");
            sb2.append(setbackgrounddrawable.MediaBrowserCompat$ItemReceiver);
            throw new PackageManager.NameNotFoundException(sb2.toString());
        }
    }
}
