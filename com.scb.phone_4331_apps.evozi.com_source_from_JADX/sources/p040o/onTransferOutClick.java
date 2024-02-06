package p040o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.onTransferOutClick */
public final class onTransferOutClick implements Serializable {
    private static final ConcurrentMap<onTransferOutClick$MediaBrowserCompat$MediaItem, String> IconCompatParcelizer = new ConcurrentHashMap(7);
    public final TimeZone MediaBrowserCompat$CustomActionResultReceiver;
    public final Locale MediaBrowserCompat$ItemReceiver;
    private transient onTransferOutClick$MediaBrowserCompat$SearchResultReceiver[] RatingCompat;
    public transient int read;
    final String write;

    /* renamed from: o.onTransferOutClick$IconCompatParcelizer */
    interface IconCompatParcelizer extends onTransferOutClick$MediaBrowserCompat$SearchResultReceiver {
        void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException;
    }

    protected onTransferOutClick(String str, TimeZone timeZone, Locale locale) {
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = timeZone;
        this.MediaBrowserCompat$ItemReceiver = locale;
        read();
    }

    private static String MediaBrowserCompat$CustomActionResultReceiver(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i2;
            }
        } else {
            sb.append('\'');
            boolean z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 == '\'') {
                    int i3 = i + 1;
                    if (i3 >= length || str.charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        sb.append(charAt2);
                        i = i3;
                    }
                } else if (z || ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < 'a' || charAt2 > 'z'))) {
                    sb.append(charAt2);
                }
                i++;
            }
            i--;
        }
        iArr[0] = i;
        return sb.toString();
    }

    private static IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        if (i2 == 1) {
            return new PlaybackStateCompat(i);
        }
        if (i2 != 2) {
            return new onTransferOutClick$MediaBrowserCompat$ItemReceiver(i, i2);
        }
        return new ParcelableVolumeInfo(i);
    }

    public final <B extends Appendable> B write(Calendar calendar, B b) {
        try {
            for (onTransferOutClick$MediaBrowserCompat$SearchResultReceiver read2 : this.RatingCompat) {
                read2.read(b, calendar);
            }
        } catch (IOException e) {
            PrepaidConfirmPinActivity.read(e);
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof onTransferOutClick)) {
            return false;
        }
        onTransferOutClick ontransferoutclick = (onTransferOutClick) obj;
        if (!this.write.equals(ontransferoutclick.write) || !this.MediaBrowserCompat$CustomActionResultReceiver.equals(ontransferoutclick.MediaBrowserCompat$CustomActionResultReceiver) || !this.MediaBrowserCompat$ItemReceiver.equals(ontransferoutclick.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.write.hashCode() + ((this.MediaBrowserCompat$CustomActionResultReceiver.hashCode() + (this.MediaBrowserCompat$ItemReceiver.hashCode() * 13)) * 13);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FastDatePrinter[");
        sb.append(this.write);
        sb.append(",");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(",");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.getID());
        sb.append("]");
        return sb.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        read();
    }

    /* renamed from: o.onTransferOutClick$read */
    static class read implements onTransferOutClick$MediaBrowserCompat$SearchResultReceiver {
        private final char read;

        public final int read() {
            return 1;
        }

        read(char c) {
            this.read = c;
        }

        public final void read(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.read);
        }
    }

    /* renamed from: o.onTransferOutClick$RatingCompat */
    static class RatingCompat implements onTransferOutClick$MediaBrowserCompat$SearchResultReceiver {
        private final String MediaBrowserCompat$ItemReceiver;

        RatingCompat(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final int read() {
            return this.MediaBrowserCompat$ItemReceiver.length();
        }

        public final void read(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.onTransferOutClick$MediaMetadataCompat */
    static class MediaMetadataCompat implements onTransferOutClick$MediaBrowserCompat$SearchResultReceiver {
        private final String[] read;
        private final int write;

        MediaMetadataCompat(int i, String[] strArr) {
            this.write = i;
            this.read = strArr;
        }

        public final int read() {
            int length = this.read.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.read[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        public final void read(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.read[calendar.get(this.write)]);
        }
    }

    /* renamed from: o.onTransferOutClick$PlaybackStateCompat */
    static class PlaybackStateCompat implements IconCompatParcelizer {
        private final int IconCompatParcelizer;

        public final int read() {
            return 4;
        }

        PlaybackStateCompat(int i) {
            this.IconCompatParcelizer = i;
        }

        public final void read(Appendable appendable, Calendar calendar) throws IOException {
            MediaBrowserCompat$CustomActionResultReceiver(appendable, calendar.get(this.IconCompatParcelizer));
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else if (i < 100) {
                onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
            } else {
                onTransferOutClick.write(appendable, i, 1);
            }
        }
    }

    /* renamed from: o.onTransferOutClick$setHasDecor */
    static class setHasDecor implements IconCompatParcelizer {
        static final setHasDecor read = new setHasDecor();

        public final int read() {
            return 2;
        }

        setHasDecor() {
        }

        public final void read(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(2) + 1;
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else {
                onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else {
                onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
            }
        }
    }

    /* renamed from: o.onTransferOutClick$ParcelableVolumeInfo */
    static class ParcelableVolumeInfo implements IconCompatParcelizer {
        private final int MediaBrowserCompat$ItemReceiver;

        public final int read() {
            return 2;
        }

        ParcelableVolumeInfo(int i) {
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final void read(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(this.MediaBrowserCompat$ItemReceiver);
            if (i < 100) {
                onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
            } else {
                onTransferOutClick.write(appendable, i, 2);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException {
            if (i < 100) {
                onTransferOutClick.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
            } else {
                onTransferOutClick.write(appendable, i, 2);
            }
        }
    }

    /* renamed from: o.onTransferOutClick$write */
    static class write implements IconCompatParcelizer {
        private final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

        write(IconCompatParcelizer iconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        }

        public final int read() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.read();
        }

        public final void read(Appendable appendable, Calendar calendar) throws IOException {
            int i = 7;
            int i2 = calendar.get(7);
            IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i2 != 1) {
                i = i2 - 1;
            }
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
        }
    }

    /* renamed from: o.onTransferOutClick$Keep */
    static class Keep implements IconCompatParcelizer {
        private final IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

        Keep(IconCompatParcelizer iconCompatParcelizer) {
            this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        }

        public final int read() {
            return this.MediaBrowserCompat$ItemReceiver.read();
        }

        public final void read(Appendable appendable, Calendar calendar) throws IOException {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(appendable, calendar.getWeekYear());
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(appendable, i);
        }
    }

    static String IconCompatParcelizer(TimeZone timeZone, boolean z, int i, Locale locale) {
        onTransferOutClick$MediaBrowserCompat$MediaItem ontransferoutclick_mediabrowsercompat_mediaitem = new onTransferOutClick$MediaBrowserCompat$MediaItem(timeZone, z, i, locale);
        String str = (String) IconCompatParcelizer.get(ontransferoutclick_mediabrowsercompat_mediaitem);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i, locale);
        String putIfAbsent = IconCompatParcelizer.putIfAbsent(ontransferoutclick_mediabrowsercompat_mediaitem, displayName);
        return putIfAbsent != null ? putIfAbsent : displayName;
    }

    /* renamed from: o.onTransferOutClick$MediaDescriptionCompat */
    static class MediaDescriptionCompat implements onTransferOutClick$MediaBrowserCompat$SearchResultReceiver {
        private final int IconCompatParcelizer;
        private final Locale MediaBrowserCompat$CustomActionResultReceiver;
        private final String read;
        private final String write;

        MediaDescriptionCompat(TimeZone timeZone, Locale locale, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = locale;
            this.IconCompatParcelizer = i;
            this.write = onTransferOutClick.IconCompatParcelizer(timeZone, false, i, locale);
            this.read = onTransferOutClick.IconCompatParcelizer(timeZone, true, i, locale);
        }

        public final int read() {
            return Math.max(this.write.length(), this.read.length());
        }

        public final void read(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) == 0) {
                appendable.append(onTransferOutClick.IconCompatParcelizer(timeZone, false, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver));
            } else {
                appendable.append(onTransferOutClick.IconCompatParcelizer(timeZone, true, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver));
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Appendable appendable, int i) throws IOException {
        appendable.append((char) ((i / 10) + 48));
        appendable.append((char) ((i % 10) + 48));
    }

    static /* synthetic */ void write(Appendable appendable, int i, int i2) throws IOException {
        if (i < 10000) {
            int i3 = i < 1000 ? i < 100 ? i < 10 ? 1 : 2 : 3 : 4;
            for (int i4 = i2 - i3; i4 > 0; i4--) {
                appendable.append('0');
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            appendable.append((char) ((i / 1000) + 48));
                            i %= 1000;
                        } else {
                            return;
                        }
                    }
                    if (i >= 100) {
                        appendable.append((char) ((i / 100) + 48));
                        i %= 100;
                    } else {
                        appendable.append('0');
                    }
                }
                if (i >= 10) {
                    appendable.append((char) ((i / 10) + 48));
                    i %= 10;
                } else {
                    appendable.append('0');
                }
            }
            appendable.append((char) (i + 48));
            return;
        }
        char[] cArr = new char[10];
        int i5 = 0;
        while (i != 0) {
            cArr[i5] = (char) ((i % 10) + 48);
            i /= 10;
            i5++;
        }
        while (i5 < i2) {
            appendable.append('0');
            i2--;
        }
        while (true) {
            i5--;
            if (i5 >= 0) {
                appendable.append(cArr[i5]);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a7, code lost:
        r12 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dd, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00de, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        r12 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a5 A[LOOP:1: B:78:0x01a1->B:80:0x01a5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void read() {
        /*
            r17 = this;
            r0 = r17
            java.text.DateFormatSymbols r1 = new java.text.DateFormatSymbols
            java.util.Locale r2 = r0.MediaBrowserCompat$ItemReceiver
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String[] r3 = r1.getEras()
            java.lang.String[] r4 = r1.getMonths()
            java.lang.String[] r5 = r1.getShortMonths()
            java.lang.String[] r6 = r1.getWeekdays()
            java.lang.String[] r7 = r1.getShortWeekdays()
            java.lang.String[] r1 = r1.getAmPmStrings()
            java.lang.String r8 = r0.write
            int r8 = r8.length()
            r9 = 1
            int[] r10 = new int[r9]
            r11 = 0
            r12 = r11
        L_0x0031:
            if (r12 >= r8) goto L_0x0190
            r10[r11] = r12
            java.lang.String r12 = r0.write
            java.lang.String r12 = MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r12, (int[]) r10)
            r13 = r10[r11]
            int r14 = r12.length()
            if (r14 == 0) goto L_0x0190
            char r15 = r12.charAt(r11)
            r11 = 121(0x79, float:1.7E-43)
            if (r15 == r11) goto L_0x0166
            r11 = 122(0x7a, float:1.71E-43)
            if (r15 == r11) goto L_0x0147
            r11 = 3
            r9 = 10
            switch(r15) {
                case 39: goto L_0x00e1;
                case 75: goto L_0x00d9;
                case 77: goto L_0x00be;
                case 83: goto L_0x00b7;
                case 97: goto L_0x00af;
                case 100: goto L_0x00a9;
                case 104: goto L_0x009e;
                case 107: goto L_0x0092;
                case 109: goto L_0x008b;
                case 115: goto L_0x0084;
                case 117: goto L_0x0079;
                case 119: goto L_0x0073;
                default: goto L_0x0055;
            }
        L_0x0055:
            r9 = 0
            switch(r15) {
                case 68: goto L_0x0127;
                case 69: goto L_0x011a;
                case 70: goto L_0x0113;
                case 71: goto L_0x010c;
                case 72: goto L_0x0105;
                default: goto L_0x0059;
            }
        L_0x0059:
            switch(r15) {
                case 87: goto L_0x0141;
                case 88: goto L_0x013c;
                case 89: goto L_0x0166;
                case 90: goto L_0x012d;
                default: goto L_0x005c;
            }
        L_0x005c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal pattern component: "
            r1.append(r2)
            r1.append(r12)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0073:
            o.onTransferOutClick$IconCompatParcelizer r9 = MediaBrowserCompat$CustomActionResultReceiver((int) r11, (int) r14)
            goto L_0x00dd
        L_0x0079:
            o.onTransferOutClick$write r9 = new o.onTransferOutClick$write
            r11 = 7
            o.onTransferOutClick$IconCompatParcelizer r11 = MediaBrowserCompat$CustomActionResultReceiver((int) r11, (int) r14)
            r9.<init>(r11)
            goto L_0x00dd
        L_0x0084:
            r9 = 13
            o.onTransferOutClick$IconCompatParcelizer r9 = MediaBrowserCompat$CustomActionResultReceiver((int) r9, (int) r14)
            goto L_0x00dd
        L_0x008b:
            r9 = 12
            o.onTransferOutClick$IconCompatParcelizer r9 = MediaBrowserCompat$CustomActionResultReceiver((int) r9, (int) r14)
            goto L_0x00dd
        L_0x0092:
            o.onTransferOutClick$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver r9 = new o.onTransferOutClick$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
            r11 = 11
            o.onTransferOutClick$IconCompatParcelizer r11 = MediaBrowserCompat$CustomActionResultReceiver((int) r11, (int) r14)
            r9.<init>(r11)
            goto L_0x00dd
        L_0x009e:
            o.onTransferOutClick$MediaSessionCompat$QueueItem r11 = new o.onTransferOutClick$MediaSessionCompat$QueueItem
            o.onTransferOutClick$IconCompatParcelizer r9 = MediaBrowserCompat$CustomActionResultReceiver((int) r9, (int) r14)
            r11.<init>(r9)
        L_0x00a7:
            r12 = r11
            goto L_0x00de
        L_0x00a9:
            r9 = 5
            o.onTransferOutClick$IconCompatParcelizer r9 = MediaBrowserCompat$CustomActionResultReceiver((int) r9, (int) r14)
            goto L_0x00dd
        L_0x00af:
            o.onTransferOutClick$MediaMetadataCompat r9 = new o.onTransferOutClick$MediaMetadataCompat
            r11 = 9
            r9.<init>(r11, r1)
            goto L_0x00dd
        L_0x00b7:
            r9 = 14
            o.onTransferOutClick$IconCompatParcelizer r9 = MediaBrowserCompat$CustomActionResultReceiver((int) r9, (int) r14)
            goto L_0x00dd
        L_0x00be:
            r9 = 4
            if (r14 < r9) goto L_0x00c8
            o.onTransferOutClick$MediaMetadataCompat r9 = new o.onTransferOutClick$MediaMetadataCompat
            r12 = 2
            r9.<init>(r12, r4)
            goto L_0x00dd
        L_0x00c8:
            r12 = 2
            if (r14 != r11) goto L_0x00d1
            o.onTransferOutClick$MediaMetadataCompat r9 = new o.onTransferOutClick$MediaMetadataCompat
            r9.<init>(r12, r5)
            goto L_0x00dd
        L_0x00d1:
            if (r14 != r12) goto L_0x00d6
            o.onTransferOutClick$MediaSessionCompat$Token r9 = p040o.onTransferOutClick$MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver
            goto L_0x00dd
        L_0x00d6:
            o.onTransferOutClick$setHasDecor r9 = p040o.onTransferOutClick.setHasDecor.read
            goto L_0x00dd
        L_0x00d9:
            o.onTransferOutClick$IconCompatParcelizer r9 = MediaBrowserCompat$CustomActionResultReceiver((int) r9, (int) r14)
        L_0x00dd:
            r12 = r9
        L_0x00de:
            r9 = 0
            goto L_0x0164
        L_0x00e1:
            r9 = 1
            java.lang.String r11 = r12.substring(r9)
            int r12 = r11.length()
            if (r12 != r9) goto L_0x00f7
            o.onTransferOutClick$read r9 = new o.onTransferOutClick$read
            r12 = 0
            char r11 = r11.charAt(r12)
            r9.<init>(r11)
            goto L_0x00fd
        L_0x00f7:
            r12 = 0
            o.onTransferOutClick$RatingCompat r9 = new o.onTransferOutClick$RatingCompat
            r9.<init>(r11)
        L_0x00fd:
            r11 = 1
            r16 = r12
            r12 = r9
            r9 = r16
            goto L_0x0184
        L_0x0105:
            r11 = 11
            o.onTransferOutClick$IconCompatParcelizer r11 = MediaBrowserCompat$CustomActionResultReceiver((int) r11, (int) r14)
            goto L_0x0111
        L_0x010c:
            o.onTransferOutClick$MediaMetadataCompat r11 = new o.onTransferOutClick$MediaMetadataCompat
            r11.<init>(r9, r3)
        L_0x0111:
            r12 = r11
            goto L_0x0164
        L_0x0113:
            r9 = 8
            o.onTransferOutClick$IconCompatParcelizer r9 = MediaBrowserCompat$CustomActionResultReceiver((int) r9, (int) r14)
            goto L_0x00dd
        L_0x011a:
            r9 = 4
            if (r14 >= r9) goto L_0x011f
            r9 = r7
            goto L_0x0120
        L_0x011f:
            r9 = r6
        L_0x0120:
            o.onTransferOutClick$MediaMetadataCompat r11 = new o.onTransferOutClick$MediaMetadataCompat
            r12 = 7
            r11.<init>(r12, r9)
            goto L_0x00a7
        L_0x0127:
            r9 = 6
            o.onTransferOutClick$IconCompatParcelizer r9 = MediaBrowserCompat$CustomActionResultReceiver((int) r9, (int) r14)
            goto L_0x00dd
        L_0x012d:
            r9 = 1
            if (r14 != r9) goto L_0x0133
            o.onTransferOutClick$MediaSessionCompat$ResultReceiverWrapper r9 = p040o.onTransferOutClick$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x00dd
        L_0x0133:
            r9 = 2
            if (r14 != r9) goto L_0x0139
            o.onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver r9 = p040o.onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x00dd
        L_0x0139:
            o.onTransferOutClick$MediaSessionCompat$ResultReceiverWrapper r9 = p040o.onTransferOutClick$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver
            goto L_0x00dd
        L_0x013c:
            o.onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver r9 = p040o.onTransferOutClick$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(r14)
            goto L_0x00dd
        L_0x0141:
            r9 = 4
            o.onTransferOutClick$IconCompatParcelizer r9 = MediaBrowserCompat$CustomActionResultReceiver((int) r9, (int) r14)
            goto L_0x00dd
        L_0x0147:
            r9 = 4
            if (r14 < r9) goto L_0x0158
            o.onTransferOutClick$MediaDescriptionCompat r9 = new o.onTransferOutClick$MediaDescriptionCompat
            java.util.TimeZone r11 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.util.Locale r12 = r0.MediaBrowserCompat$ItemReceiver
            r14 = 1
            r9.<init>(r11, r12, r14)
            r12 = r9
            r11 = r14
            r9 = 0
            goto L_0x0184
        L_0x0158:
            o.onTransferOutClick$MediaDescriptionCompat r9 = new o.onTransferOutClick$MediaDescriptionCompat
            java.util.TimeZone r11 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.util.Locale r12 = r0.MediaBrowserCompat$ItemReceiver
            r14 = 0
            r9.<init>(r11, r12, r14)
            r12 = r9
            r9 = r14
        L_0x0164:
            r11 = 1
            goto L_0x0184
        L_0x0166:
            r9 = 0
            r11 = 2
            if (r14 != r11) goto L_0x016f
            o.onTransferOutClick$AlertController$RecycleListView r11 = p040o.onTransferOutClick$AlertController$RecycleListView.write
            r12 = r11
            r11 = 1
            goto L_0x0178
        L_0x016f:
            r11 = 4
            if (r14 >= r11) goto L_0x0173
            r14 = r11
        L_0x0173:
            r11 = 1
            o.onTransferOutClick$IconCompatParcelizer r12 = MediaBrowserCompat$CustomActionResultReceiver((int) r11, (int) r14)
        L_0x0178:
            r14 = 89
            if (r15 != r14) goto L_0x0184
            o.onTransferOutClick$Keep r14 = new o.onTransferOutClick$Keep
            o.onTransferOutClick$IconCompatParcelizer r12 = (p040o.onTransferOutClick.IconCompatParcelizer) r12
            r14.<init>(r12)
            r12 = r14
        L_0x0184:
            r2.add(r12)
            int r12 = r13 + 1
            r16 = r11
            r11 = r9
            r9 = r16
            goto L_0x0031
        L_0x0190:
            r9 = r11
            int r1 = r2.size()
            o.onTransferOutClick$MediaBrowserCompat$SearchResultReceiver[] r1 = new p040o.onTransferOutClick$MediaBrowserCompat$SearchResultReceiver[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            o.onTransferOutClick$MediaBrowserCompat$SearchResultReceiver[] r1 = (p040o.onTransferOutClick$MediaBrowserCompat$SearchResultReceiver[]) r1
            r0.RatingCompat = r1
            int r1 = r1.length
            r11 = r9
        L_0x01a1:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x01af
            o.onTransferOutClick$MediaBrowserCompat$SearchResultReceiver[] r2 = r0.RatingCompat
            r2 = r2[r1]
            int r2 = r2.read()
            int r11 = r11 + r2
            goto L_0x01a1
        L_0x01af:
            r0.read = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onTransferOutClick.read():void");
    }
}
