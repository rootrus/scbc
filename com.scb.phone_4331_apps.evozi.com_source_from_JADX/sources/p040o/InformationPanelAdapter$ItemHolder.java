package p040o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.xmlpull.p042v1.XmlSerializer;

/* renamed from: o.InformationPanelAdapter$ItemHolder */
public final class InformationPanelAdapter$ItemHolder implements XmlSerializer {
    private boolean[] IconCompatParcelizer = new boolean[4];
    private String[] MediaBrowserCompat$CustomActionResultReceiver = new String[12];
    private int MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private int[] MediaBrowserCompat$SearchResultReceiver = new int[4];
    private Writer MediaDescriptionCompat;
    private String[] MediaMetadataCompat = new String[8];
    private boolean RatingCompat;
    private String read;
    private int write;

    private final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) throws IOException {
        if (this.RatingCompat) {
            int i = this.write + 1;
            this.write = i;
            this.RatingCompat = false;
            boolean[] zArr = this.IconCompatParcelizer;
            if (zArr.length <= i) {
                boolean[] zArr2 = new boolean[(i + 4)];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                this.IconCompatParcelizer = zArr2;
            }
            boolean[] zArr3 = this.IconCompatParcelizer;
            int i2 = this.write;
            int i3 = i2 - 1;
            zArr3[i2] = zArr3[i3];
            int i4 = this.MediaBrowserCompat$SearchResultReceiver[i3];
            while (true) {
                int[] iArr = this.MediaBrowserCompat$SearchResultReceiver;
                int i5 = this.write;
                if (i4 < iArr[i5]) {
                    this.MediaDescriptionCompat.write(32);
                    this.MediaDescriptionCompat.write("xmlns");
                    int i6 = i4 << 1;
                    if (!"".equals(this.MediaMetadataCompat[i6])) {
                        this.MediaDescriptionCompat.write(58);
                        this.MediaDescriptionCompat.write(this.MediaMetadataCompat[i6]);
                    } else if ("".equals(getNamespace()) && !"".equals(this.MediaMetadataCompat[i6 + 1])) {
                        throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                    }
                    this.MediaDescriptionCompat.write("=\"");
                    MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat[i6 + 1], 34);
                    this.MediaDescriptionCompat.write(34);
                    i4++;
                } else {
                    int i7 = i5 + 1;
                    if (iArr.length <= i7) {
                        int[] iArr2 = new int[(i5 + 8)];
                        System.arraycopy(iArr, 0, iArr2, 0, i7);
                        this.MediaBrowserCompat$SearchResultReceiver = iArr2;
                    }
                    int[] iArr3 = this.MediaBrowserCompat$SearchResultReceiver;
                    int i8 = this.write;
                    iArr3[i8 + 1] = iArr3[i8];
                    this.MediaDescriptionCompat.write(z ? " />" : ">");
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r1 != '\'') goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$ItemReceiver(java.lang.String r6, int r7) throws java.io.IOException {
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
            java.io.Writer r1 = r5.MediaDescriptionCompat
            java.lang.String r2 = "&amp;"
            r1.write(r2)
            goto L_0x00a8
        L_0x0037:
            java.io.Writer r1 = r5.MediaDescriptionCompat
            java.lang.String r2 = "&gt;"
            r1.write(r2)
            goto L_0x00a8
        L_0x003f:
            java.io.Writer r1 = r5.MediaDescriptionCompat
            java.lang.String r2 = "&lt;"
            r1.write(r2)
            goto L_0x00a8
        L_0x0047:
            if (r1 != r7) goto L_0x0056
            java.io.Writer r3 = r5.MediaDescriptionCompat
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
            java.io.Writer r2 = r5.MediaDescriptionCompat
            r2.write(r1)
            goto L_0x00a8
        L_0x006c:
            java.io.Writer r2 = r5.MediaDescriptionCompat
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
            java.io.Writer r2 = r5.MediaDescriptionCompat
            r2.write(r1)
            goto L_0x00a8
        L_0x008f:
            java.io.Writer r2 = r5.MediaDescriptionCompat
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
        throw new UnsupportedOperationException("Method not decompiled: p040o.InformationPanelAdapter$ItemHolder.MediaBrowserCompat$ItemReceiver(java.lang.String, int):void");
    }

    public final void docdecl(String str) throws IOException {
        this.MediaDescriptionCompat.write("<!DOCTYPE");
        this.MediaDescriptionCompat.write(str);
        this.MediaDescriptionCompat.write(">");
    }

    public final void endDocument() throws IOException {
        while (true) {
            int i = this.write;
            if (i > 0) {
                String[] strArr = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i2 = i * 3;
                endTag(strArr[i2 - 3], strArr[i2 - 1]);
            } else {
                flush();
                return;
            }
        }
    }

    public final void entityRef(String str) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaDescriptionCompat.write(38);
        this.MediaDescriptionCompat.write(str);
        this.MediaDescriptionCompat.write(59);
    }

    public final boolean getFeature(String str) {
        if ("http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            return this.IconCompatParcelizer[this.write];
        }
        return false;
    }

    public final String getPrefix(String str, boolean z) {
        try {
            return MediaBrowserCompat$CustomActionResultReceiver(str, false, z);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    private final String MediaBrowserCompat$CustomActionResultReceiver(String str, boolean z, boolean z2) throws IOException {
        int i = this.MediaBrowserCompat$SearchResultReceiver[this.write + 1] << 1;
        while (true) {
            i -= 2;
            String str2 = "";
            String str3 = null;
            if (i >= 0) {
                if (this.MediaMetadataCompat[i + 1].equals(str) && (z || !this.MediaMetadataCompat[i].equals(str2))) {
                    String str4 = this.MediaMetadataCompat[i];
                    int i2 = i + 2;
                    while (true) {
                        if (i2 < (this.MediaBrowserCompat$SearchResultReceiver[this.write + 1] << 1)) {
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
                        int i3 = this.MediaBrowserCompat$ItemReceiver;
                        this.MediaBrowserCompat$ItemReceiver = i3 + 1;
                        sb.append(i3);
                        String obj = sb.toString();
                        int i4 = (this.MediaBrowserCompat$SearchResultReceiver[this.write + 1] << 1) - 2;
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
                    boolean z3 = this.RatingCompat;
                    this.RatingCompat = false;
                    setPrefix(str2, str);
                    this.RatingCompat = z3;
                }
                boolean z32 = this.RatingCompat;
                this.RatingCompat = false;
                setPrefix(str2, str);
                this.RatingCompat = z32;
                return str2;
            }
        }
    }

    public final Object getProperty(String str) {
        throw new RuntimeException("Unsupported property");
    }

    public final void ignorableWhitespace(String str) throws IOException {
        text(str);
    }

    public final void setFeature(String str, boolean z) {
        if ("http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            this.IconCompatParcelizer[this.write] = z;
            return;
        }
        throw new RuntimeException("Unsupported Feature");
    }

    public final void setProperty(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported Property:");
        sb.append(obj);
        throw new RuntimeException(sb.toString());
    }

    public final void setPrefix(String str, String str2) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (!str.equals(MediaBrowserCompat$CustomActionResultReceiver(str2, true, false))) {
            int[] iArr = this.MediaBrowserCompat$SearchResultReceiver;
            int i = this.write + 1;
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

    public final void setOutput(Writer writer) {
        this.MediaDescriptionCompat = writer;
        int[] iArr = this.MediaBrowserCompat$SearchResultReceiver;
        iArr[0] = 2;
        iArr[1] = 2;
        String[] strArr = this.MediaMetadataCompat;
        strArr[0] = "";
        strArr[1] = "";
        strArr[2] = "xml";
        strArr[3] = "http://www.w3.org/XML/1998/namespace";
        this.RatingCompat = false;
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.write = 0;
        this.MediaBrowserCompat$MediaItem = false;
    }

    public final void setOutput(OutputStream outputStream, String str) throws IOException {
        OutputStreamWriter outputStreamWriter;
        if (outputStream != null) {
            if (str != null) {
                outputStreamWriter = new OutputStreamWriter(outputStream, str);
            }
            setOutput(outputStreamWriter);
            this.read = str;
            if (str != null && str.toLowerCase().startsWith("utf")) {
                this.MediaBrowserCompat$MediaItem = true;
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void startDocument(String str, Boolean bool) throws IOException {
        this.MediaDescriptionCompat.write("<?xml version='1.0' ");
        if (str != null) {
            this.read = str;
            if (str.toLowerCase().startsWith("utf")) {
                this.MediaBrowserCompat$MediaItem = true;
            }
        }
        if (this.read != null) {
            this.MediaDescriptionCompat.write("encoding='");
            this.MediaDescriptionCompat.write(this.read);
            this.MediaDescriptionCompat.write("' ");
        }
        if (bool != null) {
            this.MediaDescriptionCompat.write("standalone='");
            this.MediaDescriptionCompat.write(bool.booleanValue() ? "yes" : "no");
            this.MediaDescriptionCompat.write("' ");
        }
        this.MediaDescriptionCompat.write("?>");
    }

    public final XmlSerializer startTag(String str, String str2) throws IOException {
        String str3;
        MediaBrowserCompat$CustomActionResultReceiver(false);
        if (this.IconCompatParcelizer[this.write]) {
            this.MediaDescriptionCompat.write("\r\n");
            for (int i = 0; i < this.write; i++) {
                this.MediaDescriptionCompat.write("  ");
            }
        }
        int i2 = this.write * 3;
        String[] strArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (strArr.length < i2 + 3) {
            String[] strArr2 = new String[(strArr.length + 12)];
            System.arraycopy(strArr, 0, strArr2, 0, i2);
            this.MediaBrowserCompat$CustomActionResultReceiver = strArr2;
        }
        if (str == null) {
            str3 = "";
        } else {
            str3 = MediaBrowserCompat$CustomActionResultReceiver(str, true, true);
        }
        if ("".equals(str)) {
            int i3 = this.MediaBrowserCompat$SearchResultReceiver[this.write];
            while (i3 < this.MediaBrowserCompat$SearchResultReceiver[this.write + 1]) {
                int i4 = i3 << 1;
                if (!"".equals(this.MediaMetadataCompat[i4]) || "".equals(this.MediaMetadataCompat[i4 + 1])) {
                    i3++;
                } else {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }
        }
        String[] strArr3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i5 = i2 + 1;
        strArr3[i2] = str;
        strArr3[i5] = str3;
        strArr3[i5 + 1] = str2;
        this.MediaDescriptionCompat.write(60);
        if (!"".equals(str3)) {
            this.MediaDescriptionCompat.write(str3);
            this.MediaDescriptionCompat.write(58);
        }
        this.MediaDescriptionCompat.write(str2);
        this.RatingCompat = true;
        return this;
    }

    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        String str4;
        if (this.RatingCompat) {
            if (str == null) {
                str = "";
            }
            if ("".equals(str)) {
                str4 = "";
            } else {
                str4 = MediaBrowserCompat$CustomActionResultReceiver(str, false, true);
            }
            this.MediaDescriptionCompat.write(32);
            if (!"".equals(str4)) {
                this.MediaDescriptionCompat.write(str4);
                this.MediaDescriptionCompat.write(58);
            }
            this.MediaDescriptionCompat.write(str2);
            this.MediaDescriptionCompat.write(61);
            int i = 34;
            if (str3.indexOf(34) != -1) {
                i = 39;
            }
            this.MediaDescriptionCompat.write(i);
            MediaBrowserCompat$ItemReceiver(str3, i);
            this.MediaDescriptionCompat.write(i);
            return this;
        }
        throw new IllegalStateException("illegal position for attribute");
    }

    public final void flush() throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaDescriptionCompat.flush();
    }

    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (!this.RatingCompat) {
            this.write--;
        }
        if ((str != null || this.MediaBrowserCompat$CustomActionResultReceiver[this.write * 3] == null) && ((str == null || str.equals(this.MediaBrowserCompat$CustomActionResultReceiver[this.write * 3])) && this.MediaBrowserCompat$CustomActionResultReceiver[(this.write * 3) + 2].equals(str2))) {
            if (this.RatingCompat) {
                MediaBrowserCompat$CustomActionResultReceiver(true);
                this.write--;
            } else {
                if (this.IconCompatParcelizer[this.write + 1]) {
                    this.MediaDescriptionCompat.write("\r\n");
                    for (int i = 0; i < this.write; i++) {
                        this.MediaDescriptionCompat.write("  ");
                    }
                }
                this.MediaDescriptionCompat.write("</");
                String str3 = this.MediaBrowserCompat$CustomActionResultReceiver[(this.write * 3) + 1];
                if (!"".equals(str3)) {
                    this.MediaDescriptionCompat.write(str3);
                    this.MediaDescriptionCompat.write(58);
                }
                this.MediaDescriptionCompat.write(str2);
                this.MediaDescriptionCompat.write(62);
            }
            int[] iArr = this.MediaBrowserCompat$SearchResultReceiver;
            int i2 = this.write;
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

    public final String getNamespace() {
        if (getDepth() == 0) {
            return null;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver[(getDepth() * 3) - 3];
    }

    public final String getName() {
        if (getDepth() == 0) {
            return null;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver[(getDepth() * 3) - 1];
    }

    public final int getDepth() {
        return this.RatingCompat ? this.write + 1 : this.write;
    }

    public final XmlSerializer text(String str) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.IconCompatParcelizer[this.write] = false;
        MediaBrowserCompat$ItemReceiver(str, -1);
        return this;
    }

    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        text(new String(cArr, i, i2));
        return this;
    }

    public final void cdsect(String str) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaDescriptionCompat.write("<![CDATA[");
        this.MediaDescriptionCompat.write(str);
        this.MediaDescriptionCompat.write("]]>");
    }

    public final void comment(String str) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaDescriptionCompat.write("<!--");
        this.MediaDescriptionCompat.write(str);
        this.MediaDescriptionCompat.write("-->");
    }

    public final void processingInstruction(String str) throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaDescriptionCompat.write("<?");
        this.MediaDescriptionCompat.write(str);
        this.MediaDescriptionCompat.write("?>");
    }
}
