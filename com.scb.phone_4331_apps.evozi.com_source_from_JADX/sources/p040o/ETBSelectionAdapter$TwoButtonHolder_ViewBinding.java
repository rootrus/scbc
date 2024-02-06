package p040o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* renamed from: o.ETBSelectionAdapter$TwoButtonHolder_ViewBinding */
public final class ETBSelectionAdapter$TwoButtonHolder_ViewBinding implements HistoryAdapter$GroupItemViewHolder_ViewBinding {
    private boolean IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private Writer MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private int[] MediaBrowserCompat$SearchResultReceiver = new int[4];
    private boolean[] MediaDescriptionCompat = new boolean[4];
    private String[] MediaMetadataCompat = new String[8];
    private int read;
    private String[] write = new String[12];

    private final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) throws IOException {
        String str;
        if (this.IconCompatParcelizer) {
            int i = this.MediaBrowserCompat$CustomActionResultReceiver + 1;
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.IconCompatParcelizer = false;
            boolean[] zArr = this.MediaDescriptionCompat;
            if (zArr.length <= i) {
                boolean[] zArr2 = new boolean[(i + 4)];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                this.MediaDescriptionCompat = zArr2;
            }
            boolean[] zArr3 = this.MediaDescriptionCompat;
            int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i3 = i2 - 1;
            zArr3[i2] = zArr3[i3];
            int i4 = this.MediaBrowserCompat$SearchResultReceiver[i3];
            while (true) {
                int[] iArr = this.MediaBrowserCompat$SearchResultReceiver;
                int i5 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (i4 < iArr[i5]) {
                    this.MediaBrowserCompat$ItemReceiver.write(32);
                    this.MediaBrowserCompat$ItemReceiver.write("xmlns");
                    int i6 = i4 << 1;
                    if (!"".equals(this.MediaMetadataCompat[i6])) {
                        this.MediaBrowserCompat$ItemReceiver.write(58);
                        this.MediaBrowserCompat$ItemReceiver.write(this.MediaMetadataCompat[i6]);
                    } else {
                        if ((this.IconCompatParcelizer ? this.MediaBrowserCompat$CustomActionResultReceiver + 1 : this.MediaBrowserCompat$CustomActionResultReceiver) == 0) {
                            str = null;
                        } else {
                            str = this.write[((this.IconCompatParcelizer ? this.MediaBrowserCompat$CustomActionResultReceiver + 1 : this.MediaBrowserCompat$CustomActionResultReceiver) * 3) - 3];
                        }
                        if ("".equals(str) && !"".equals(this.MediaMetadataCompat[i6 + 1])) {
                            throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                        }
                    }
                    this.MediaBrowserCompat$ItemReceiver.write("=\"");
                    MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat[i6 + 1], 34);
                    this.MediaBrowserCompat$ItemReceiver.write(34);
                    i4++;
                } else {
                    int i7 = i5 + 1;
                    if (iArr.length <= i7) {
                        int[] iArr2 = new int[(i5 + 8)];
                        System.arraycopy(iArr, 0, iArr2, 0, i7);
                        this.MediaBrowserCompat$SearchResultReceiver = iArr2;
                    }
                    int[] iArr3 = this.MediaBrowserCompat$SearchResultReceiver;
                    int i8 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    iArr3[i8 + 1] = iArr3[i8];
                    this.MediaBrowserCompat$ItemReceiver.write(z ? " />" : ">");
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r1 != '\'') goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$CustomActionResultReceiver(java.lang.String r6, int r7) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.length()
            if (r0 >= r1) goto L_0x00ac
            char r1 = r6.charAt(r0)
            r2 = 9
            java.lang.String r3 = "&#"
            if (r1 == r2) goto L_0x0086
            r2 = 10
            if (r1 == r2) goto L_0x0086
            r2 = 13
            if (r1 == r2) goto L_0x0086
            r2 = 34
            if (r1 == r2) goto L_0x0047
            r4 = 60
            if (r1 == r4) goto L_0x003f
            r4 = 62
            if (r1 == r4) goto L_0x0037
            r4 = 38
            if (r1 == r4) goto L_0x002e
            r4 = 39
            if (r1 == r4) goto L_0x0047
            goto L_0x0056
        L_0x002e:
            java.io.Writer r1 = r5.MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = "&amp;"
            r1.write(r2)
            goto L_0x00a8
        L_0x0037:
            java.io.Writer r1 = r5.MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = "&gt;"
            r1.write(r2)
            goto L_0x00a8
        L_0x003f:
            java.io.Writer r1 = r5.MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = "&lt;"
            r1.write(r2)
            goto L_0x00a8
        L_0x0047:
            if (r1 != r7) goto L_0x0056
            java.io.Writer r3 = r5.MediaBrowserCompat$ItemReceiver
            if (r1 != r2) goto L_0x0050
            java.lang.String r1 = "&quot;"
            goto L_0x0052
        L_0x0050:
            java.lang.String r1 = "&apos;"
        L_0x0052:
            r3.write(r1)
            goto L_0x00a8
        L_0x0056:
            r2 = 32
            if (r1 < r2) goto L_0x006c
            r2 = 64
            if (r1 == r2) goto L_0x006c
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 < r2) goto L_0x0066
            boolean r2 = r5.MediaBrowserCompat$MediaItem
            if (r2 == 0) goto L_0x006c
        L_0x0066:
            java.io.Writer r2 = r5.MediaBrowserCompat$ItemReceiver
            r2.write(r1)
            goto L_0x00a8
        L_0x006c:
            java.io.Writer r2 = r5.MediaBrowserCompat$ItemReceiver
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = ";"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.write(r1)
            goto L_0x00a8
        L_0x0086:
            r2 = -1
            if (r7 != r2) goto L_0x008f
            java.io.Writer r2 = r5.MediaBrowserCompat$ItemReceiver
            r2.write(r1)
            goto L_0x00a8
        L_0x008f:
            java.io.Writer r2 = r5.MediaBrowserCompat$ItemReceiver
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r1)
            r1 = 59
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.write(r1)
        L_0x00a8:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ETBSelectionAdapter$TwoButtonHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(java.lang.String, int):void");
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) throws IOException {
        this.MediaBrowserCompat$ItemReceiver.write("<!DOCTYPE");
        this.MediaBrowserCompat$ItemReceiver.write(str);
        this.MediaBrowserCompat$ItemReceiver.write(">");
    }

    public final void read(String str) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaBrowserCompat$ItemReceiver.write(38);
        this.MediaBrowserCompat$ItemReceiver.write(str);
        this.MediaBrowserCompat$ItemReceiver.write(59);
    }

    public final String write(String str, boolean z) {
        try {
            return IconCompatParcelizer(str, false, z);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    private final String IconCompatParcelizer(String str, boolean z, boolean z2) throws IOException {
        int i = this.MediaBrowserCompat$SearchResultReceiver[this.MediaBrowserCompat$CustomActionResultReceiver + 1] << 1;
        while (true) {
            i -= 2;
            String str2 = "";
            String str3 = null;
            if (i >= 0) {
                if (this.MediaMetadataCompat[i + 1].equals(str) && (z || !this.MediaMetadataCompat[i].equals(str2))) {
                    String str4 = this.MediaMetadataCompat[i];
                    int i2 = i + 2;
                    while (true) {
                        if (i2 < (this.MediaBrowserCompat$SearchResultReceiver[this.MediaBrowserCompat$CustomActionResultReceiver + 1] << 1)) {
                            if (this.MediaMetadataCompat[i2].equals(str4)) {
                                break;
                            }
                            i2++;
                        } else {
                            str3 = str4;
                            break;
                        }
                    }
                    if (str3 != null) {
                        return str3;
                    }
                }
            } else if (!z2) {
                return null;
            } else {
                if (!str2.equals(str)) {
                    do {
                        StringBuilder sb = new StringBuilder();
                        sb.append("n");
                        int i3 = this.read;
                        this.read = i3 + 1;
                        sb.append(i3);
                        String obj = sb.toString();
                        int i4 = (this.MediaBrowserCompat$SearchResultReceiver[this.MediaBrowserCompat$CustomActionResultReceiver + 1] << 1) - 2;
                        while (true) {
                            if (i4 < 0) {
                                str2 = obj;
                                continue;
                                break;
                            } else if (obj.equals(this.MediaMetadataCompat[i4])) {
                                str2 = null;
                                continue;
                                break;
                            } else {
                                i4 -= 2;
                            }
                        }
                    } while (str2 == null);
                } else {
                    boolean z3 = this.IconCompatParcelizer;
                    this.IconCompatParcelizer = false;
                    IconCompatParcelizer(str2, str);
                    this.IconCompatParcelizer = z3;
                }
                boolean z32 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = false;
                IconCompatParcelizer(str2, str);
                this.IconCompatParcelizer = z32;
                return str2;
            }
        }
    }

    public final void IconCompatParcelizer(String str, String str2) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (!str.equals(IconCompatParcelizer(str2, true, false))) {
            int[] iArr = this.MediaBrowserCompat$SearchResultReceiver;
            int i = this.MediaBrowserCompat$CustomActionResultReceiver + 1;
            int i2 = iArr[i];
            iArr[i] = i2 + 1;
            int i3 = i2 << 1;
            String[] strArr = this.MediaMetadataCompat;
            int i4 = i3 + 1;
            if (strArr.length < i4) {
                String[] strArr2 = new String[(strArr.length + 16)];
                System.arraycopy(strArr, 0, strArr2, 0, i3);
                this.MediaMetadataCompat = strArr2;
            }
            String[] strArr3 = this.MediaMetadataCompat;
            strArr3[i3] = str;
            strArr3[i4] = str2;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(OutputStream outputStream, String str) throws IOException {
        OutputStreamWriter outputStreamWriter;
        if (str != null) {
            outputStreamWriter = new OutputStreamWriter(outputStream, str);
        }
        this.MediaBrowserCompat$ItemReceiver = outputStreamWriter;
        int[] iArr = this.MediaBrowserCompat$SearchResultReceiver;
        iArr[0] = 2;
        iArr[1] = 2;
        String[] strArr = this.MediaMetadataCompat;
        strArr[0] = "";
        strArr[1] = "";
        strArr[2] = "xml";
        strArr[3] = "http://www.w3.org/XML/1998/namespace";
        this.IconCompatParcelizer = false;
        this.read = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        this.MediaBrowserCompat$MediaItem = false;
        if (str != null && str.toLowerCase().startsWith("utf")) {
            this.MediaBrowserCompat$MediaItem = true;
        }
    }

    public final HistoryAdapter$GroupItemViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) throws IOException {
        String str3;
        MediaBrowserCompat$CustomActionResultReceiver(false);
        if (this.MediaDescriptionCompat[this.MediaBrowserCompat$CustomActionResultReceiver]) {
            this.MediaBrowserCompat$ItemReceiver.write("\r\n");
            for (int i = 0; i < this.MediaBrowserCompat$CustomActionResultReceiver; i++) {
                this.MediaBrowserCompat$ItemReceiver.write("  ");
            }
        }
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver * 3;
        String[] strArr = this.write;
        if (strArr.length < i2 + 3) {
            String[] strArr2 = new String[(strArr.length + 12)];
            System.arraycopy(strArr, 0, strArr2, 0, i2);
            this.write = strArr2;
        }
        if (str == null) {
            str3 = "";
        } else {
            str3 = IconCompatParcelizer(str, true, true);
        }
        if ("".equals(str)) {
            int i3 = this.MediaBrowserCompat$SearchResultReceiver[this.MediaBrowserCompat$CustomActionResultReceiver];
            while (i3 < this.MediaBrowserCompat$SearchResultReceiver[this.MediaBrowserCompat$CustomActionResultReceiver + 1]) {
                int i4 = i3 << 1;
                if (!"".equals(this.MediaMetadataCompat[i4]) || "".equals(this.MediaMetadataCompat[i4 + 1])) {
                    i3++;
                } else {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }
        }
        String[] strArr3 = this.write;
        int i5 = i2 + 1;
        strArr3[i2] = str;
        strArr3[i5] = str3;
        strArr3[i5 + 1] = str2;
        this.MediaBrowserCompat$ItemReceiver.write(60);
        if (!"".equals(str3)) {
            this.MediaBrowserCompat$ItemReceiver.write(str3);
            this.MediaBrowserCompat$ItemReceiver.write(58);
        }
        this.MediaBrowserCompat$ItemReceiver.write(str2);
        this.IconCompatParcelizer = true;
        return this;
    }

    public final HistoryAdapter$GroupItemViewHolder_ViewBinding read(String str, String str2, String str3) throws IOException {
        String str4;
        if (this.IconCompatParcelizer) {
            if (str == null) {
                str = "";
            }
            if ("".equals(str)) {
                str4 = "";
            } else {
                str4 = IconCompatParcelizer(str, false, true);
            }
            this.MediaBrowserCompat$ItemReceiver.write(32);
            if (!"".equals(str4)) {
                this.MediaBrowserCompat$ItemReceiver.write(str4);
                this.MediaBrowserCompat$ItemReceiver.write(58);
            }
            this.MediaBrowserCompat$ItemReceiver.write(str2);
            this.MediaBrowserCompat$ItemReceiver.write(61);
            int i = 34;
            if (str3.indexOf(34) != -1) {
                i = 39;
            }
            this.MediaBrowserCompat$ItemReceiver.write(i);
            MediaBrowserCompat$CustomActionResultReceiver(str3, i);
            this.MediaBrowserCompat$ItemReceiver.write(i);
            return this;
        }
        throw new IllegalStateException("illegal position for attribute");
    }

    public final void read() throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaBrowserCompat$ItemReceiver.flush();
    }

    public final HistoryAdapter$GroupItemViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver(String str, String str2) throws IOException {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver--;
        }
        if ((str != null || this.write[this.MediaBrowserCompat$CustomActionResultReceiver * 3] == null) && ((str == null || str.equals(this.write[this.MediaBrowserCompat$CustomActionResultReceiver * 3])) && this.write[(this.MediaBrowserCompat$CustomActionResultReceiver * 3) + 2].equals(str2))) {
            if (this.IconCompatParcelizer) {
                MediaBrowserCompat$CustomActionResultReceiver(true);
                this.MediaBrowserCompat$CustomActionResultReceiver--;
            } else {
                if (this.MediaDescriptionCompat[this.MediaBrowserCompat$CustomActionResultReceiver + 1]) {
                    this.MediaBrowserCompat$ItemReceiver.write("\r\n");
                    for (int i = 0; i < this.MediaBrowserCompat$CustomActionResultReceiver; i++) {
                        this.MediaBrowserCompat$ItemReceiver.write("  ");
                    }
                }
                this.MediaBrowserCompat$ItemReceiver.write("</");
                String str3 = this.write[(this.MediaBrowserCompat$CustomActionResultReceiver * 3) + 1];
                if (!"".equals(str3)) {
                    this.MediaBrowserCompat$ItemReceiver.write(str3);
                    this.MediaBrowserCompat$ItemReceiver.write(58);
                }
                this.MediaBrowserCompat$ItemReceiver.write(str2);
                this.MediaBrowserCompat$ItemReceiver.write(62);
            }
            int[] iArr = this.MediaBrowserCompat$SearchResultReceiver;
            int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            iArr[i2 + 1] = iArr[i2];
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("</{");
        sb.append(str);
        sb.append("}");
        sb.append(str2);
        sb.append("> does not match start");
        throw new IllegalArgumentException(sb.toString());
    }

    public final HistoryAdapter$GroupItemViewHolder_ViewBinding MediaBrowserCompat$MediaItem(String str) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaDescriptionCompat[this.MediaBrowserCompat$CustomActionResultReceiver] = false;
        MediaBrowserCompat$CustomActionResultReceiver(str, -1);
        return this;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaBrowserCompat$ItemReceiver.write("<![CDATA[");
        this.MediaBrowserCompat$ItemReceiver.write(str);
        this.MediaBrowserCompat$ItemReceiver.write("]]>");
    }

    public final void IconCompatParcelizer(String str) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaBrowserCompat$ItemReceiver.write("<!--");
        this.MediaBrowserCompat$ItemReceiver.write(str);
        this.MediaBrowserCompat$ItemReceiver.write("-->");
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaBrowserCompat$ItemReceiver.write("<?");
        this.MediaBrowserCompat$ItemReceiver.write(str);
        this.MediaBrowserCompat$ItemReceiver.write("?>");
    }

    public final void write(String str) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaDescriptionCompat[this.MediaBrowserCompat$CustomActionResultReceiver] = false;
        MediaBrowserCompat$CustomActionResultReceiver(str, -1);
    }
}
