package p040o;

import p040o.filterByAuthorizedAccounts;

/* renamed from: o.IParameters */
public interface IParameters extends LookAndFeelParameters_Factory {
    void AppCompatDelegateImpl$ListMenuDecorView();

    void IconCompatParcelizer(listSessionBeginFiles$MediaBrowserCompat$ItemReceiver listsessionbeginfiles_mediabrowsercompat_itemreceiver);

    void IconCompatParcelizer(boolean z);

    void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    void mo37527x50fd9e4a();

    void MediaDescriptionCompat();

    void MediaSessionCompat$QueueItem();

    void MediaSessionCompat$ResultReceiverWrapper();

    void MediaSessionCompat$Token();

    void RatingCompat();

    void read(boolean z);

    void read(boolean z, boolean z2);

    void setContentView();

    void write(String str);

    /* renamed from: o.IParameters$write */
    public static final class write implements getIIdExtractionServerKta {
        public int MediaBrowserCompat$CustomActionResultReceiver() {
            return 1;
        }

        private int write(filterByAuthorizedAccounts.read read, StringBuilder sb, StringBuilder sb2, int i) {
            int length = sb.length();
            sb.delete(length - i, length);
            read.MediaBrowserCompat$SearchResultReceiver--;
            int MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(read.IconCompatParcelizer.charAt(read.MediaBrowserCompat$SearchResultReceiver), sb2);
            read.MediaMetadataCompat = null;
            return MediaBrowserCompat$CustomActionResultReceiver;
        }

        protected static void MediaBrowserCompat$ItemReceiver(filterByAuthorizedAccounts.read read, StringBuilder sb) {
            int charAt = (sb.charAt(0) * 1600) + (sb.charAt(1) * '(') + sb.charAt(2) + 1;
            read.write.append(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
            sb.delete(0, 3);
        }

        public void IconCompatParcelizer(filterByAuthorizedAccounts.read read) {
            StringBuilder sb = new StringBuilder();
            while (true) {
                if (!(read.MediaBrowserCompat$SearchResultReceiver < read.IconCompatParcelizer.length() - read.MediaBrowserCompat$MediaItem)) {
                    break;
                }
                char charAt = read.IconCompatParcelizer.charAt(read.MediaBrowserCompat$SearchResultReceiver);
                read.MediaBrowserCompat$SearchResultReceiver++;
                int MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(charAt, sb);
                int length = read.write.length() + ((sb.length() / 3) << 1);
                read.read(length);
                int i = read.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver - length;
                if (read.MediaBrowserCompat$SearchResultReceiver < read.IconCompatParcelizer.length() - read.MediaBrowserCompat$MediaItem) {
                    if (sb.length() % 3 == 0 && AlertController$RecycleListView.IconCompatParcelizer((CharSequence) read.IconCompatParcelizer, read.MediaBrowserCompat$SearchResultReceiver, MediaBrowserCompat$CustomActionResultReceiver()) != MediaBrowserCompat$CustomActionResultReceiver()) {
                        read.read = 0;
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                        MediaBrowserCompat$CustomActionResultReceiver = write(read, sb, sb2, MediaBrowserCompat$CustomActionResultReceiver);
                    }
                    while (sb.length() % 3 == 1 && ((MediaBrowserCompat$CustomActionResultReceiver <= 3 && i != 1) || MediaBrowserCompat$CustomActionResultReceiver > 3)) {
                        MediaBrowserCompat$CustomActionResultReceiver = write(read, sb, sb2, MediaBrowserCompat$CustomActionResultReceiver);
                    }
                }
            }
            write(read, sb);
        }

        /* access modifiers changed from: protected */
        public int MediaBrowserCompat$CustomActionResultReceiver(char c, StringBuilder sb) {
            if (c == ' ') {
                sb.append(3);
                return 1;
            } else if (c >= '0' && c <= '9') {
                sb.append((char) ((c - '0') + 4));
                return 1;
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char) ((c - 'A') + 14));
                return 1;
            } else if (c >= 0 && c <= 31) {
                sb.append(0);
                sb.append(c);
                return 2;
            } else if (c >= '!' && c <= '/') {
                sb.append(1);
                sb.append((char) (c - '!'));
                return 2;
            } else if (c >= ':' && c <= '@') {
                sb.append(1);
                sb.append((char) ((c - ':') + 15));
                return 2;
            } else if (c >= '[' && c <= '_') {
                sb.append(1);
                sb.append((char) ((c - '[') + 22));
                return 2;
            } else if (c >= '`' && c <= 127) {
                sb.append(2);
                sb.append((char) (c - '`'));
                return 2;
            } else if (c >= 128) {
                sb.append("\u0001\u001e");
                return MediaBrowserCompat$CustomActionResultReceiver((char) (c - 128), sb) + 2;
            } else {
                StringBuilder sb2 = new StringBuilder("Illegal character: ");
                sb2.append(c);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
            if (r4 != false) goto L_0x008b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
            if (r4 != false) goto L_0x008b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void write(p040o.filterByAuthorizedAccounts.read r8, java.lang.StringBuilder r9) {
            /*
                r7 = this;
                int r0 = r9.length()
                r1 = 3
                int r0 = r0 / r1
                int r2 = r9.length()
                int r2 = r2 % r1
                java.lang.StringBuilder r3 = r8.write
                int r3 = r3.length()
                r4 = 1
                int r0 = r0 << r4
                int r3 = r3 + r0
                r8.read(r3)
                o.sendMessage r0 = r8.MediaMetadataCompat
                int r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                int r0 = r0 - r3
                r3 = 254(0xfe, float:3.56E-43)
                r5 = 0
                r6 = 2
                if (r2 != r6) goto L_0x0041
                r9.append(r5)
            L_0x0025:
                int r0 = r9.length()
                if (r0 < r1) goto L_0x002f
                MediaBrowserCompat$ItemReceiver(r8, r9)
                goto L_0x0025
            L_0x002f:
                int r9 = r8.MediaBrowserCompat$SearchResultReceiver
                java.lang.String r0 = r8.IconCompatParcelizer
                int r0 = r0.length()
                int r1 = r8.MediaBrowserCompat$MediaItem
                int r0 = r0 - r1
                if (r9 >= r0) goto L_0x003d
                goto L_0x003e
            L_0x003d:
                r4 = r5
            L_0x003e:
                if (r4 == 0) goto L_0x0090
                goto L_0x008b
            L_0x0041:
                if (r0 != r4) goto L_0x006c
                if (r2 != r4) goto L_0x006c
            L_0x0045:
                int r0 = r9.length()
                if (r0 < r1) goto L_0x004f
                MediaBrowserCompat$ItemReceiver(r8, r9)
                goto L_0x0045
            L_0x004f:
                int r9 = r8.MediaBrowserCompat$SearchResultReceiver
                java.lang.String r0 = r8.IconCompatParcelizer
                int r0 = r0.length()
                int r1 = r8.MediaBrowserCompat$MediaItem
                int r0 = r0 - r1
                if (r9 >= r0) goto L_0x005e
                r9 = r4
                goto L_0x005f
            L_0x005e:
                r9 = r5
            L_0x005f:
                if (r9 == 0) goto L_0x0066
                java.lang.StringBuilder r9 = r8.write
                r9.append(r3)
            L_0x0066:
                int r9 = r8.MediaBrowserCompat$SearchResultReceiver
                int r9 = r9 - r4
                r8.MediaBrowserCompat$SearchResultReceiver = r9
                goto L_0x0090
            L_0x006c:
                if (r2 != 0) goto L_0x0093
            L_0x006e:
                int r2 = r9.length()
                if (r2 < r1) goto L_0x0078
                MediaBrowserCompat$ItemReceiver(r8, r9)
                goto L_0x006e
            L_0x0078:
                if (r0 > 0) goto L_0x008b
                int r9 = r8.MediaBrowserCompat$SearchResultReceiver
                java.lang.String r0 = r8.IconCompatParcelizer
                int r0 = r0.length()
                int r1 = r8.MediaBrowserCompat$MediaItem
                int r0 = r0 - r1
                if (r9 >= r0) goto L_0x0088
                goto L_0x0089
            L_0x0088:
                r4 = r5
            L_0x0089:
                if (r4 == 0) goto L_0x0090
            L_0x008b:
                java.lang.StringBuilder r9 = r8.write
                r9.append(r3)
            L_0x0090:
                r8.read = r5
                return
            L_0x0093:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "Unexpected case. Please report!"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.IParameters.write.write(o.filterByAuthorizedAccounts$read, java.lang.StringBuilder):void");
        }
    }
}
