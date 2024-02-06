package p040o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: o.setSubtitle */
public class setSubtitle extends DataSetObservable {
    static final String IconCompatParcelizer = setSubtitle.class.getSimpleName();
    public final Object MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private final List<write> MediaDescriptionCompat;
    private final List<IconCompatParcelizer> MediaMetadataCompat;
    final String read;
    final Context write;

    static {
        new HashMap();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        int size;
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver();
            size = this.MediaMetadataCompat.size();
        }
        return size;
    }

    public final ResolveInfo MediaBrowserCompat$ItemReceiver(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver();
            resolveInfo = this.MediaMetadataCompat.get(i).write;
        }
        return resolveInfo;
    }

    public final int write(ResolveInfo resolveInfo) {
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver();
            List<IconCompatParcelizer> list = this.MediaMetadataCompat;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).write == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public final ResolveInfo write() {
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver();
            if (this.MediaMetadataCompat.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.MediaMetadataCompat.get(0).write;
            return resolveInfo;
        }
    }

    public final void write(int i) {
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver();
            IconCompatParcelizer iconCompatParcelizer = this.MediaMetadataCompat.get(i);
            MediaBrowserCompat$CustomActionResultReceiver(new write(new ComponentName(iconCompatParcelizer.write.activityInfo.packageName, iconCompatParcelizer.write.activityInfo.name), System.currentTimeMillis(), this.MediaMetadataCompat.get(0) != null ? 5.0f : 1.0f));
        }
    }

    public final int read() {
        int size;
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver();
            size = this.MediaDescriptionCompat.size();
        }
        return size;
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(write write2) {
        boolean add = this.MediaDescriptionCompat.add(write2);
        if (add) {
            this.MediaBrowserCompat$SearchResultReceiver = true;
            IconCompatParcelizer();
            if (this.MediaBrowserCompat$MediaItem) {
                if (this.MediaBrowserCompat$SearchResultReceiver) {
                    this.MediaBrowserCompat$SearchResultReceiver = false;
                    if (!TextUtils.isEmpty(this.read)) {
                        new read().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.MediaDescriptionCompat), this.read});
                    }
                }
                notifyChanged();
            } else {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
        }
        return add;
    }

    private void IconCompatParcelizer() {
        int size = this.MediaDescriptionCompat.size();
        if (size > 0) {
            this.MediaBrowserCompat$SearchResultReceiver = true;
            for (int i = 0; i < size; i++) {
                this.MediaDescriptionCompat.remove(0);
            }
        }
    }

    /* renamed from: o.setSubtitle$write */
    public static final class write {
        public final long MediaBrowserCompat$CustomActionResultReceiver;
        public final ComponentName MediaBrowserCompat$ItemReceiver;
        public final float read;

        public write(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public write(ComponentName componentName, long j, float f) {
            this.MediaBrowserCompat$ItemReceiver = componentName;
            this.MediaBrowserCompat$CustomActionResultReceiver = j;
            this.read = f;
        }

        public final int hashCode() {
            ComponentName componentName = this.MediaBrowserCompat$ItemReceiver;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.MediaBrowserCompat$CustomActionResultReceiver;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.read);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            write write = (write) obj;
            ComponentName componentName = this.MediaBrowserCompat$ItemReceiver;
            if (componentName == null) {
                if (write.MediaBrowserCompat$ItemReceiver != null) {
                    return false;
                }
            } else if (!componentName.equals(write.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            return this.MediaBrowserCompat$CustomActionResultReceiver == write.MediaBrowserCompat$CustomActionResultReceiver && Float.floatToIntBits(this.read) == Float.floatToIntBits(write.read);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append("; time:");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.read));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: o.setSubtitle$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Comparable<IconCompatParcelizer> {
        public final ResolveInfo write;

        public final int hashCode() {
            return Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) + 31;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) == Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:");
            sb.append(this.write.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal(0.0d));
            sb.append("]");
            return sb.toString();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) - Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: o.setSubtitle$read */
    final class read extends AsyncTask<Object, Void, Void> {
        read() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
            if (r15 != null) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
            if (r15 == null) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ad, code lost:
            if (r15 == null) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cd, code lost:
            if (r15 != null) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r15.close();
         */
        /* renamed from: IconCompatParcelizer */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                r14 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                java.lang.String r2 = "Error writing historical record file: "
                r3 = 0
                r4 = r15[r3]
                java.util.List r4 = (java.util.List) r4
                r5 = 1
                r15 = r15[r5]
                java.lang.String r15 = (java.lang.String) r15
                r6 = 0
                o.setSubtitle r7 = p040o.setSubtitle.this     // Catch:{ FileNotFoundException -> 0x00de }
                android.content.Context r7 = r7.write     // Catch:{ FileNotFoundException -> 0x00de }
                java.io.FileOutputStream r15 = r7.openFileOutput(r15, r3)     // Catch:{ FileNotFoundException -> 0x00de }
                org.xmlpull.v1.XmlSerializer r7 = android.util.Xml.newSerializer()
                r7.setOutput(r15, r6)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                java.lang.String r8 = "UTF-8"
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                r7.startDocument(r8, r9)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                r7.startTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                int r8 = r4.size()     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                r9 = r3
            L_0x002f:
                if (r9 >= r8) goto L_0x0061
                java.lang.Object r10 = r4.remove(r3)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                o.setSubtitle$write r10 = (p040o.setSubtitle.write) r10     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                r7.startTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                android.content.ComponentName r11 = r10.MediaBrowserCompat$ItemReceiver     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                java.lang.String r11 = r11.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                java.lang.String r12 = "activity"
                r7.attribute(r6, r12, r11)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                java.lang.String r11 = "time"
                long r12 = r10.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                java.lang.String r11 = "weight"
                float r10 = r10.read     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                r7.attribute(r6, r11, r10)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                r7.endTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                int r9 = r9 + 1
                goto L_0x002f
            L_0x0061:
                r7.endTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                r7.endDocument()     // Catch:{ IllegalArgumentException -> 0x00b0, IllegalStateException -> 0x0090, IOException -> 0x0070 }
                o.setSubtitle r0 = p040o.setSubtitle.this
                r0.MediaBrowserCompat$ItemReceiver = r5
                if (r15 == 0) goto L_0x00d3
                goto L_0x00d0
            L_0x006e:
                r0 = move-exception
                goto L_0x00d4
            L_0x0070:
                r0 = move-exception
                java.lang.String r1 = p040o.setSubtitle.IconCompatParcelizer     // Catch:{ all -> 0x006e }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
                r3.<init>()     // Catch:{ all -> 0x006e }
                r3.append(r2)     // Catch:{ all -> 0x006e }
                o.setSubtitle r2 = p040o.setSubtitle.this     // Catch:{ all -> 0x006e }
                java.lang.String r2 = r2.read     // Catch:{ all -> 0x006e }
                r3.append(r2)     // Catch:{ all -> 0x006e }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x006e }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x006e }
                o.setSubtitle r0 = p040o.setSubtitle.this
                r0.MediaBrowserCompat$ItemReceiver = r5
                if (r15 == 0) goto L_0x00d3
                goto L_0x00d0
            L_0x0090:
                r0 = move-exception
                java.lang.String r1 = p040o.setSubtitle.IconCompatParcelizer     // Catch:{ all -> 0x006e }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
                r3.<init>()     // Catch:{ all -> 0x006e }
                r3.append(r2)     // Catch:{ all -> 0x006e }
                o.setSubtitle r2 = p040o.setSubtitle.this     // Catch:{ all -> 0x006e }
                java.lang.String r2 = r2.read     // Catch:{ all -> 0x006e }
                r3.append(r2)     // Catch:{ all -> 0x006e }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x006e }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x006e }
                o.setSubtitle r0 = p040o.setSubtitle.this
                r0.MediaBrowserCompat$ItemReceiver = r5
                if (r15 == 0) goto L_0x00d3
                goto L_0x00d0
            L_0x00b0:
                r0 = move-exception
                java.lang.String r1 = p040o.setSubtitle.IconCompatParcelizer     // Catch:{ all -> 0x006e }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
                r3.<init>()     // Catch:{ all -> 0x006e }
                r3.append(r2)     // Catch:{ all -> 0x006e }
                o.setSubtitle r2 = p040o.setSubtitle.this     // Catch:{ all -> 0x006e }
                java.lang.String r2 = r2.read     // Catch:{ all -> 0x006e }
                r3.append(r2)     // Catch:{ all -> 0x006e }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x006e }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x006e }
                o.setSubtitle r0 = p040o.setSubtitle.this
                r0.MediaBrowserCompat$ItemReceiver = r5
                if (r15 != 0) goto L_0x00d0
                goto L_0x00d3
            L_0x00d0:
                r15.close()     // Catch:{ IOException -> 0x00d3 }
            L_0x00d3:
                return r6
            L_0x00d4:
                o.setSubtitle r1 = p040o.setSubtitle.this
                r1.MediaBrowserCompat$ItemReceiver = r5
                if (r15 == 0) goto L_0x00dd
                r15.close()     // Catch:{ IOException -> 0x00dd }
            L_0x00dd:
                throw r0
            L_0x00de:
                r0 = move-exception
                java.lang.String r1 = p040o.setSubtitle.IconCompatParcelizer
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                r3.append(r15)
                java.lang.String r15 = r3.toString()
                android.util.Log.e(r1, r15, r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setSubtitle.read.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c8, code lost:
        if (r1 != null) goto L_0x00cb;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$ItemReceiver() {
        /*
            r11 = this;
            java.lang.String r0 = "Error reading historical recrod file: "
            boolean r1 = r11.MediaBrowserCompat$ItemReceiver
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00d5
            boolean r1 = r11.MediaBrowserCompat$SearchResultReceiver
            if (r1 == 0) goto L_0x00d5
            java.lang.String r1 = r11.read
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d5
            r11.MediaBrowserCompat$ItemReceiver = r3
            r11.MediaBrowserCompat$MediaItem = r2
            android.content.Context r1 = r11.write     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.String r4 = r11.read     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.io.FileInputStream r1 = r1.openFileInput(r4)     // Catch:{ FileNotFoundException -> 0x00d6 }
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            java.lang.String r5 = "UTF-8"
            r4.setInput(r1, r5)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            r5 = r3
        L_0x002a:
            if (r5 == r2) goto L_0x0034
            r6 = 2
            if (r5 == r6) goto L_0x0034
            int r5 = r4.next()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            goto L_0x002a
        L_0x0034:
            java.lang.String r5 = "historical-records"
            java.lang.String r6 = r4.getName()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            boolean r5 = r5.equals(r6)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            if (r5 == 0) goto L_0x008d
            java.util.List<o.setSubtitle$write> r5 = r11.MediaDescriptionCompat     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            r5.clear()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
        L_0x0045:
            int r6 = r4.next()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            if (r6 != r2) goto L_0x004f
            if (r1 == 0) goto L_0x00d6
            goto L_0x00cb
        L_0x004f:
            r7 = 3
            if (r6 == r7) goto L_0x0045
            r7 = 4
            if (r6 == r7) goto L_0x0045
            java.lang.String r6 = r4.getName()     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            java.lang.String r7 = "historical-record"
            boolean r6 = r7.equals(r6)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            if (r6 == 0) goto L_0x0085
            java.lang.String r6 = "activity"
            r7 = 0
            java.lang.String r6 = r4.getAttributeValue(r7, r6)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            java.lang.String r8 = "time"
            java.lang.String r8 = r4.getAttributeValue(r7, r8)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            java.lang.String r10 = "weight"
            java.lang.String r7 = r4.getAttributeValue(r7, r10)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            o.setSubtitle$write r10 = new o.setSubtitle$write     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            r10.<init>((java.lang.String) r6, (long) r8, (float) r7)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            r5.add(r10)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            goto L_0x0045
        L_0x0085:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            java.lang.String r5 = "Share records file not well-formed."
            r4.<init>(r5)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            throw r4     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
        L_0x008d:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            java.lang.String r5 = "Share records file does not start with historical-records tag."
            r4.<init>(r5)     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
            throw r4     // Catch:{ XmlPullParserException -> 0x00b1, IOException -> 0x0097 }
        L_0x0095:
            r0 = move-exception
            goto L_0x00cf
        L_0x0097:
            r4 = move-exception
            java.lang.String r5 = IconCompatParcelizer     // Catch:{ all -> 0x0095 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0095 }
            r6.<init>()     // Catch:{ all -> 0x0095 }
            r6.append(r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = r11.read     // Catch:{ all -> 0x0095 }
            r6.append(r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0095 }
            android.util.Log.e(r5, r0, r4)     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x00d6
            goto L_0x00cb
        L_0x00b1:
            r4 = move-exception
            java.lang.String r5 = IconCompatParcelizer     // Catch:{ all -> 0x0095 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0095 }
            r6.<init>()     // Catch:{ all -> 0x0095 }
            r6.append(r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = r11.read     // Catch:{ all -> 0x0095 }
            r6.append(r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0095 }
            android.util.Log.e(r5, r0, r4)     // Catch:{ all -> 0x0095 }
            if (r1 != 0) goto L_0x00cb
            goto L_0x00d6
        L_0x00cb:
            r1.close()     // Catch:{  }
            goto L_0x00d6
        L_0x00cf:
            if (r1 == 0) goto L_0x00d4
            r1.close()     // Catch:{ IOException -> 0x00d4 }
        L_0x00d4:
            throw r0
        L_0x00d5:
            r2 = r3
        L_0x00d6:
            r11.IconCompatParcelizer()
            r0 = r2 | 0
            if (r0 == 0) goto L_0x00e0
            r11.notifyChanged()
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setSubtitle.MediaBrowserCompat$ItemReceiver():void");
    }
}
