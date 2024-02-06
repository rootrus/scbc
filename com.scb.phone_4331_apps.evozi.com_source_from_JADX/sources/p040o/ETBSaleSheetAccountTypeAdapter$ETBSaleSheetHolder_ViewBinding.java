package p040o;

import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Hashtable;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: o.ETBSaleSheetAccountTypeAdapter$ETBSaleSheetHolder_ViewBinding */
public final class ETBSaleSheetAccountTypeAdapter$ETBSaleSheetHolder_ViewBinding implements XmlPullParser {
    private boolean ActionMenuItemView;
    private String AlertController$RecycleListView;
    private Reader AppCompatActivity;
    private char[] AppCompatDelegateImpl$ListMenuDecorView;
    private int AppCompatDialogFragment;
    private int AppCompatViewInflater;
    private boolean IconCompatParcelizer;
    private int Keep;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private String[] MediaBrowserCompat$ItemReceiver;
    private Hashtable MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f5809x50fd9e4a;
    private String MediaDescriptionCompat;
    private String[] MediaMetadataCompat = new String[16];
    private Object MediaSessionCompat$QueueItem;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private int[] MediaSessionCompat$Token = new int[4];
    private int ParcelableVolumeInfo;
    private String[] PlaybackStateCompat = new String[8];
    private boolean PlaybackStateCompat$CustomAction;
    private String RatingCompat;
    private int read;
    private boolean setBackgroundResource;
    private char[] setCheckable;
    private Boolean setChecked;
    private int setContentView;
    private int setExpandedFormat;
    private int[] setHasDecor;
    private boolean setIcon;
    private boolean setPopupCallback;
    private String setShortcut;
    private int write;

    public final String getAttributeType(int i) {
        return "CDATA";
    }

    public final boolean isAttributeDefault(int i) {
        return false;
    }

    public ETBSaleSheetAccountTypeAdapter$ETBSaleSheetHolder_ViewBinding() {
        int i = 128;
        this.setCheckable = new char[128];
        this.MediaBrowserCompat$ItemReceiver = new String[16];
        this.setHasDecor = new int[2];
        this.AppCompatDelegateImpl$ListMenuDecorView = new char[(Runtime.getRuntime().freeMemory() >= 1048576 ? 8192 : i)];
    }

    private static boolean MediaBrowserCompat$ItemReceiver(String str, boolean z, String str2) {
        if (!str.startsWith("http://xmlpull.org/v1/doc/")) {
            return false;
        }
        if (z) {
            return str.substring(42).equals(str2);
        }
        return str.substring(40).equals(str2);
    }

    private final boolean write() throws XmlPullParserException {
        int i;
        String str;
        int i2 = 0;
        boolean z = false;
        while (true) {
            i = this.write << 2;
            if (i2 >= i) {
                break;
            }
            String str2 = this.MediaBrowserCompat$ItemReceiver[i2 + 2];
            int indexOf = str2.indexOf(58);
            if (indexOf != -1) {
                String substring = str2.substring(0, indexOf);
                str = str2.substring(indexOf + 1);
                str2 = substring;
            } else if (str2.equals("xmlns")) {
                str = null;
            } else {
                i2 += 4;
            }
            if (!str2.equals("xmlns")) {
                z = true;
            } else {
                int[] iArr = this.MediaSessionCompat$Token;
                int i3 = this.read;
                int i4 = iArr[i3];
                iArr[i3] = i4 + 1;
                int i5 = i4 << 1;
                String[] strArr = this.PlaybackStateCompat;
                int i6 = i5 + 2;
                if (strArr.length < i6) {
                    String[] strArr2 = new String[(i6 + 16)];
                    System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                    strArr = strArr2;
                }
                this.PlaybackStateCompat = strArr;
                strArr[i5] = str;
                String[] strArr3 = this.MediaBrowserCompat$ItemReceiver;
                int i7 = i2 + 3;
                strArr[i5 + 1] = strArr3[i7];
                if (str != null && strArr3[i7].equals("")) {
                    write("illegal empty namespace");
                }
                String[] strArr4 = this.MediaBrowserCompat$ItemReceiver;
                int i8 = this.write - 1;
                this.write = i8;
                System.arraycopy(strArr4, i2 + 4, strArr4, i2, (i8 << 2) - i2);
                i2 -= 4;
            }
            i2 += 4;
        }
        if (z) {
            int i9 = i - 4;
            while (i9 >= 0) {
                int i10 = i9 + 2;
                String str3 = this.MediaBrowserCompat$ItemReceiver[i10];
                int indexOf2 = str3.indexOf(58);
                if (indexOf2 != 0 || this.setBackgroundResource) {
                    if (indexOf2 != -1) {
                        String substring2 = str3.substring(0, indexOf2);
                        String substring3 = str3.substring(indexOf2 + 1);
                        String namespace = getNamespace(substring2);
                        if (namespace != null || this.setBackgroundResource) {
                            String[] strArr5 = this.MediaBrowserCompat$ItemReceiver;
                            strArr5[i9] = namespace;
                            strArr5[i9 + 1] = substring2;
                            strArr5[i10] = substring3;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Undefined Prefix: ");
                            sb.append(substring2);
                            sb.append(" in ");
                            sb.append(this);
                            throw new RuntimeException(sb.toString());
                        }
                    }
                    i9 -= 4;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("illegal attribute name: ");
                    sb2.append(str3);
                    sb2.append(" at ");
                    sb2.append(this);
                    throw new RuntimeException(sb2.toString());
                }
            }
        }
        int indexOf3 = this.f5809x50fd9e4a.indexOf(58);
        if (indexOf3 == 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("illegal tag name: ");
            sb3.append(this.f5809x50fd9e4a);
            write(sb3.toString());
        }
        if (indexOf3 != -1) {
            this.AlertController$RecycleListView = this.f5809x50fd9e4a.substring(0, indexOf3);
            this.f5809x50fd9e4a = this.f5809x50fd9e4a.substring(indexOf3 + 1);
        }
        String namespace2 = getNamespace(this.AlertController$RecycleListView);
        this.MediaSessionCompat$ResultReceiverWrapper = namespace2;
        if (namespace2 == null) {
            if (this.AlertController$RecycleListView != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("undefined prefix: ");
                sb4.append(this.AlertController$RecycleListView);
                write(sb4.toString());
            }
            this.MediaSessionCompat$ResultReceiverWrapper = "";
        }
        return z;
    }

    private final void write(String str) throws XmlPullParserException {
        if (!this.setBackgroundResource) {
            IconCompatParcelizer(str);
        } else if (this.MediaDescriptionCompat == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ERR: ");
            sb.append(str);
            this.MediaDescriptionCompat = sb.toString();
        }
    }

    private final void IconCompatParcelizer(String str) throws XmlPullParserException {
        if (str.length() >= 100) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, 100));
            sb.append("\n");
            str = sb.toString();
        }
        throw new XmlPullParserException(str, this, (Throwable) null);
    }

    private final void read() throws IOException, XmlPullParserException {
        int i;
        String str;
        int i2;
        int i3;
        if (this.AppCompatActivity == null) {
            IconCompatParcelizer("No Input specified");
        }
        if (this.setExpandedFormat == 3) {
            this.read--;
        }
        do {
            this.write = -1;
            if (this.IconCompatParcelizer) {
                this.IconCompatParcelizer = false;
                this.setExpandedFormat = 3;
                return;
            } else if (this.MediaDescriptionCompat != null) {
                for (int i4 = 0; i4 < this.MediaDescriptionCompat.length(); i4++) {
                    MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat.charAt(i4));
                }
                this.MediaDescriptionCompat = null;
                this.setExpandedFormat = 9;
                return;
            } else {
                this.AlertController$RecycleListView = null;
                this.f5809x50fd9e4a = null;
                this.MediaSessionCompat$ResultReceiverWrapper = null;
                int IconCompatParcelizer2 = IconCompatParcelizer();
                this.setExpandedFormat = IconCompatParcelizer2;
                if (IconCompatParcelizer2 != 1) {
                    int i5 = 2;
                    if (IconCompatParcelizer2 == 2) {
                        write(false);
                        return;
                    } else if (IconCompatParcelizer2 == 3) {
                        MediaBrowserCompat$ItemReceiver();
                        MediaBrowserCompat$ItemReceiver();
                        this.f5809x50fd9e4a = MediaDescriptionCompat();
                        MediaBrowserCompat$SearchResultReceiver();
                        MediaBrowserCompat$ItemReceiver('>');
                        int i6 = this.read;
                        int i7 = (i6 - 1) << 2;
                        if (i6 == 0) {
                            write("element stack empty");
                            this.setExpandedFormat = 9;
                            return;
                        } else if (!this.setBackgroundResource) {
                            int i8 = i7 + 3;
                            if (!this.f5809x50fd9e4a.equals(this.MediaMetadataCompat[i8])) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("expected: /");
                                sb.append(this.MediaMetadataCompat[i8]);
                                sb.append(" read: ");
                                sb.append(this.f5809x50fd9e4a);
                                write(sb.toString());
                            }
                            String[] strArr = this.MediaMetadataCompat;
                            this.MediaSessionCompat$ResultReceiverWrapper = strArr[i7];
                            this.AlertController$RecycleListView = strArr[i7 + 1];
                            this.f5809x50fd9e4a = strArr[i7 + 2];
                            return;
                        } else {
                            return;
                        }
                    } else if (IconCompatParcelizer2 == 4) {
                        read(60, !this.ActionMenuItemView);
                        if (this.read == 0 && this.MediaBrowserCompat$SearchResultReceiver) {
                            this.setExpandedFormat = 7;
                            return;
                        }
                        return;
                    } else if (IconCompatParcelizer2 != 6) {
                        boolean z = this.ActionMenuItemView;
                        MediaBrowserCompat$ItemReceiver();
                        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
                        if (MediaBrowserCompat$ItemReceiver2 == 63) {
                            if ((IconCompatParcelizer(0) == 120 || IconCompatParcelizer(0) == 88) && (IconCompatParcelizer(1) == 109 || IconCompatParcelizer(1) == 77)) {
                                if (z) {
                                    MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer(0));
                                    MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer(1));
                                }
                                MediaBrowserCompat$ItemReceiver();
                                MediaBrowserCompat$ItemReceiver();
                                if ((IconCompatParcelizer(0) == 108 || IconCompatParcelizer(0) == 76) && IconCompatParcelizer(1) <= 32) {
                                    if (this.ParcelableVolumeInfo != 1 || this.MediaBrowserCompat$CustomActionResultReceiver > 4) {
                                        write("PI must not start with xml");
                                    }
                                    write(true);
                                    if (this.write <= 0 || !"version".equals(this.MediaBrowserCompat$ItemReceiver[2])) {
                                        write("version expected");
                                    }
                                    String[] strArr2 = this.MediaBrowserCompat$ItemReceiver;
                                    this.setShortcut = strArr2[3];
                                    if (1 >= this.write || !"encoding".equals(strArr2[6])) {
                                        i5 = 1;
                                    } else {
                                        this.RatingCompat = this.MediaBrowserCompat$ItemReceiver[7];
                                    }
                                    if (i5 < this.write) {
                                        int i9 = i5 << 2;
                                        if ("standalone".equals(this.MediaBrowserCompat$ItemReceiver[i9 + 2])) {
                                            String str2 = this.MediaBrowserCompat$ItemReceiver[i9 + 3];
                                            if ("yes".equals(str2)) {
                                                this.setChecked = Boolean.TRUE;
                                            } else if ("no".equals(str2)) {
                                                this.setChecked = Boolean.FALSE;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("illegal standalone value: ");
                                                sb2.append(str2);
                                                write(sb2.toString());
                                            }
                                            i5++;
                                        }
                                    }
                                    if (i5 != this.write) {
                                        write("illegal xmldecl");
                                    }
                                    this.MediaBrowserCompat$SearchResultReceiver = true;
                                    this.AppCompatViewInflater = 0;
                                    i = 998;
                                    this.setExpandedFormat = i;
                                }
                            }
                            str = "";
                            i2 = 8;
                            i3 = 63;
                        } else if (MediaBrowserCompat$ItemReceiver2 != 33) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("illegal: <");
                            sb3.append(MediaBrowserCompat$ItemReceiver2);
                            write(sb3.toString());
                            i = 9;
                            this.setExpandedFormat = i;
                        } else if (IconCompatParcelizer(0) == 45) {
                            str = "--";
                            i3 = 45;
                            i2 = 9;
                        } else if (IconCompatParcelizer(0) == 91) {
                            str = "[CDATA[";
                            i2 = 5;
                            i3 = 93;
                            z = true;
                        } else {
                            i3 = -1;
                            str = "DOCTYPE";
                            i2 = 10;
                        }
                        for (int i10 = 0; i10 < str.length(); i10++) {
                            MediaBrowserCompat$ItemReceiver(str.charAt(i10));
                        }
                        if (i2 == 10) {
                            read(z);
                        } else {
                            int i11 = 0;
                            while (true) {
                                int MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver();
                                if (MediaBrowserCompat$ItemReceiver3 == -1) {
                                    write("Unexpected EOF");
                                    break;
                                }
                                if (z) {
                                    MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver3);
                                }
                                if ((i3 == 63 || MediaBrowserCompat$ItemReceiver3 == i3) && IconCompatParcelizer(0) == i3 && IconCompatParcelizer(1) == 62) {
                                    if (i3 == 45 && i11 == 45 && !this.setBackgroundResource) {
                                        write("illegal comment delimiter: --->");
                                    }
                                    MediaBrowserCompat$ItemReceiver();
                                    MediaBrowserCompat$ItemReceiver();
                                    if (z && i3 != 63) {
                                        this.AppCompatViewInflater--;
                                    }
                                } else {
                                    i11 = MediaBrowserCompat$ItemReceiver3;
                                }
                            }
                            i = 9;
                            this.setExpandedFormat = i;
                        }
                        i = i2;
                        this.setExpandedFormat = i;
                    } else {
                        MediaBrowserCompat$CustomActionResultReceiver();
                        return;
                    }
                } else {
                    return;
                }
            }
        } while (i == 998);
    }

    private final void read(boolean z) throws IOException, XmlPullParserException {
        int i = 1;
        boolean z2 = false;
        while (true) {
            int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver2 != -1) {
                if (MediaBrowserCompat$ItemReceiver2 == 39) {
                    z2 = !z2;
                } else if (MediaBrowserCompat$ItemReceiver2 != 60) {
                    if (MediaBrowserCompat$ItemReceiver2 == 62 && !z2 && i - 1 == 0) {
                        return;
                    }
                } else if (!z2) {
                    i++;
                }
                if (z) {
                    MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
                }
            } else {
                write("Unexpected EOF");
                return;
            }
        }
    }

    private final int IconCompatParcelizer() throws IOException {
        int IconCompatParcelizer2 = IconCompatParcelizer(0);
        if (IconCompatParcelizer2 == -1) {
            return 1;
        }
        if (IconCompatParcelizer2 == 38) {
            return 6;
        }
        if (IconCompatParcelizer2 != 60) {
            return 4;
        }
        int IconCompatParcelizer3 = IconCompatParcelizer(1);
        if (IconCompatParcelizer3 == 33) {
            return 999;
        }
        if (IconCompatParcelizer3 != 47) {
            return IconCompatParcelizer3 != 63 ? 2 : 999;
        }
        return 3;
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.MediaBrowserCompat$SearchResultReceiver &= i <= 32;
        int i2 = this.AppCompatViewInflater;
        char[] cArr = this.setCheckable;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[(((i2 << 2) / 3) + 4)];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.setCheckable = cArr2;
        }
        char[] cArr3 = this.setCheckable;
        int i3 = this.AppCompatViewInflater;
        this.AppCompatViewInflater = i3 + 1;
        cArr3[i3] = (char) i;
    }

    private final void write(boolean z) throws IOException, XmlPullParserException {
        if (!z) {
            MediaBrowserCompat$ItemReceiver();
        }
        this.f5809x50fd9e4a = MediaDescriptionCompat();
        this.write = 0;
        while (true) {
            int IconCompatParcelizer2 = IconCompatParcelizer(0);
            if (IconCompatParcelizer2 > 32 || IconCompatParcelizer2 == -1) {
                int IconCompatParcelizer3 = IconCompatParcelizer(0);
                if (!z) {
                    if (IconCompatParcelizer3 != 47) {
                        if (IconCompatParcelizer3 == 62 && !z) {
                            MediaBrowserCompat$ItemReceiver();
                            break;
                        }
                    } else {
                        this.IconCompatParcelizer = true;
                        MediaBrowserCompat$ItemReceiver();
                        while (true) {
                            int IconCompatParcelizer4 = IconCompatParcelizer(0);
                            if (IconCompatParcelizer4 > 32 || IconCompatParcelizer4 == -1) {
                                MediaBrowserCompat$ItemReceiver('>');
                            } else {
                                MediaBrowserCompat$ItemReceiver();
                            }
                        }
                        MediaBrowserCompat$ItemReceiver('>');
                    }
                } else if (IconCompatParcelizer3 == 63) {
                    MediaBrowserCompat$ItemReceiver();
                    MediaBrowserCompat$ItemReceiver('>');
                    return;
                }
                if (IconCompatParcelizer3 == -1) {
                    write("Unexpected EOF");
                    return;
                }
                String MediaDescriptionCompat2 = MediaDescriptionCompat();
                if (MediaDescriptionCompat2.length() == 0) {
                    write("attr name expected");
                    break;
                }
                int i = this.write;
                this.write = i + 1;
                int i2 = i << 2;
                String[] strArr = this.MediaBrowserCompat$ItemReceiver;
                int i3 = i2 + 4;
                if (strArr.length < i3) {
                    String[] strArr2 = new String[(i3 + 16)];
                    System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                    strArr = strArr2;
                }
                this.MediaBrowserCompat$ItemReceiver = strArr;
                int i4 = i2 + 1;
                strArr[i2] = "";
                int i5 = i4 + 1;
                strArr[i4] = null;
                int i6 = i5 + 1;
                strArr[i5] = MediaDescriptionCompat2;
                while (true) {
                    int IconCompatParcelizer5 = IconCompatParcelizer(0);
                    if (IconCompatParcelizer5 <= 32 && IconCompatParcelizer5 != -1) {
                        MediaBrowserCompat$ItemReceiver();
                    }
                }
                if (IconCompatParcelizer(0) != 61) {
                    if (!this.setBackgroundResource) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Attr.value missing f. ");
                        sb.append(MediaDescriptionCompat2);
                        write(sb.toString());
                    }
                    this.MediaBrowserCompat$ItemReceiver[i6] = MediaDescriptionCompat2;
                } else {
                    MediaBrowserCompat$ItemReceiver('=');
                    MediaBrowserCompat$SearchResultReceiver();
                    int IconCompatParcelizer6 = IconCompatParcelizer(0);
                    if (IconCompatParcelizer6 == 39 || IconCompatParcelizer6 == 34) {
                        MediaBrowserCompat$ItemReceiver();
                    } else {
                        if (!this.setBackgroundResource) {
                            write("attr value delimiter missing!");
                        }
                        IconCompatParcelizer6 = 32;
                    }
                    int i7 = this.AppCompatViewInflater;
                    read(IconCompatParcelizer6, true);
                    this.MediaBrowserCompat$ItemReceiver[i6] = new String(this.setCheckable, i7, this.AppCompatViewInflater - i7);
                    this.AppCompatViewInflater = i7;
                    if (IconCompatParcelizer6 != 32) {
                        MediaBrowserCompat$ItemReceiver();
                    }
                }
            } else {
                MediaBrowserCompat$ItemReceiver();
            }
        }
        int i8 = this.read;
        this.read = i8 + 1;
        int i9 = i8 << 2;
        String[] strArr3 = this.MediaMetadataCompat;
        int i10 = i9 + 4;
        if (strArr3.length < i10) {
            String[] strArr4 = new String[(i10 + 16)];
            System.arraycopy(strArr3, 0, strArr4, 0, strArr3.length);
            strArr3 = strArr4;
        }
        this.MediaMetadataCompat = strArr3;
        strArr3[i9 + 3] = this.f5809x50fd9e4a;
        int i11 = this.read;
        int[] iArr = this.MediaSessionCompat$Token;
        if (i11 >= iArr.length) {
            int[] iArr2 = new int[(i11 + 4)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.MediaSessionCompat$Token = iArr2;
        }
        int[] iArr3 = this.MediaSessionCompat$Token;
        int i12 = this.read;
        iArr3[i12] = iArr3[i12 - 1];
        if (this.PlaybackStateCompat$CustomAction) {
            write();
        } else {
            this.MediaSessionCompat$ResultReceiverWrapper = "";
        }
        String[] strArr5 = this.MediaMetadataCompat;
        strArr5[i9] = this.MediaSessionCompat$ResultReceiverWrapper;
        strArr5[i9 + 1] = this.AlertController$RecycleListView;
        strArr5[i9 + 2] = this.f5809x50fd9e4a;
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver() throws IOException, XmlPullParserException {
        MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver());
        int i = this.AppCompatViewInflater;
        while (true) {
            int IconCompatParcelizer2 = IconCompatParcelizer(0);
            boolean z = true;
            if (IconCompatParcelizer2 == 59) {
                MediaBrowserCompat$ItemReceiver();
                String str = new String(this.setCheckable, i, this.AppCompatViewInflater - i);
                this.AppCompatViewInflater = i - 1;
                if (this.ActionMenuItemView && this.setExpandedFormat == 6) {
                    this.f5809x50fd9e4a = str;
                }
                if (str.charAt(0) == '#') {
                    MediaBrowserCompat$CustomActionResultReceiver(str.charAt(1) == 'x' ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str.substring(1)));
                    return;
                }
                String str2 = (String) this.MediaBrowserCompat$MediaItem.get(str);
                if (str2 != null) {
                    z = false;
                }
                this.setIcon = z;
                if (!z) {
                    for (int i2 = 0; i2 < str2.length(); i2++) {
                        MediaBrowserCompat$CustomActionResultReceiver(str2.charAt(i2));
                    }
                    return;
                } else if (!this.ActionMenuItemView) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unresolved: &");
                    sb.append(str);
                    sb.append(";");
                    write(sb.toString());
                    return;
                } else {
                    return;
                }
            } else if (IconCompatParcelizer2 >= 128 || ((IconCompatParcelizer2 >= 48 && IconCompatParcelizer2 <= 57) || ((IconCompatParcelizer2 >= 97 && IconCompatParcelizer2 <= 122) || ((IconCompatParcelizer2 >= 65 && IconCompatParcelizer2 <= 90) || IconCompatParcelizer2 == 95 || IconCompatParcelizer2 == 45 || IconCompatParcelizer2 == 35)))) {
                MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver());
            } else {
                if (!this.setBackgroundResource) {
                    write("unterminated entity ref");
                }
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("broken entitiy: ");
                int i3 = i - 1;
                sb2.append(new String(this.setCheckable, i3, this.AppCompatViewInflater - i3));
                printStream.println(sb2.toString());
                return;
            }
        }
    }

    private final void read(int i, boolean z) throws IOException, XmlPullParserException {
        int IconCompatParcelizer2 = IconCompatParcelizer(0);
        int i2 = 0;
        while (IconCompatParcelizer2 != -1 && IconCompatParcelizer2 != i) {
            if (i != 32 || (IconCompatParcelizer2 > 32 && IconCompatParcelizer2 != 62)) {
                if (IconCompatParcelizer2 == 38) {
                    if (z) {
                        MediaBrowserCompat$CustomActionResultReceiver();
                    } else {
                        return;
                    }
                } else if (IconCompatParcelizer2 == 10 && this.setExpandedFormat == 2) {
                    MediaBrowserCompat$ItemReceiver();
                    MediaBrowserCompat$CustomActionResultReceiver(32);
                } else {
                    MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver());
                }
                if (IconCompatParcelizer2 == 62 && i2 >= 2 && i != 93) {
                    write("Illegal: ]]>");
                }
                i2 = IconCompatParcelizer2 == 93 ? i2 + 1 : 0;
                IconCompatParcelizer2 = IconCompatParcelizer(0);
            } else {
                return;
            }
        }
    }

    private final void MediaBrowserCompat$ItemReceiver(char c) throws IOException, XmlPullParserException {
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver2 != c) {
            StringBuilder sb = new StringBuilder();
            sb.append("expected: '");
            sb.append(c);
            sb.append("' actual: '");
            sb.append((char) MediaBrowserCompat$ItemReceiver2);
            sb.append("'");
            write(sb.toString());
        }
    }

    private final int MediaBrowserCompat$ItemReceiver() throws IOException {
        int i;
        if (this.Keep == 0) {
            i = IconCompatParcelizer(0);
        } else {
            int[] iArr = this.setHasDecor;
            int i2 = iArr[0];
            iArr[0] = iArr[1];
            i = i2;
        }
        this.Keep--;
        this.MediaBrowserCompat$CustomActionResultReceiver++;
        if (i == 10) {
            this.ParcelableVolumeInfo++;
            this.MediaBrowserCompat$CustomActionResultReceiver = 1;
        }
        return i;
    }

    private final int IconCompatParcelizer(int i) throws IOException {
        int i2;
        char c;
        while (i >= this.Keep) {
            char[] cArr = this.AppCompatDelegateImpl$ListMenuDecorView;
            if (cArr.length <= 1) {
                i2 = this.AppCompatActivity.read();
            } else {
                int i3 = this.AppCompatDialogFragment;
                if (i3 < this.setContentView) {
                    this.AppCompatDialogFragment = i3 + 1;
                    i2 = cArr[i3];
                } else {
                    int read2 = this.AppCompatActivity.read(cArr, 0, cArr.length);
                    this.setContentView = read2;
                    if (read2 <= 0) {
                        c = 65535;
                    } else {
                        c = this.AppCompatDelegateImpl$ListMenuDecorView[0];
                    }
                    this.AppCompatDialogFragment = 1;
                    i2 = c;
                }
            }
            if (i2 == 13) {
                this.setPopupCallback = true;
                int[] iArr = this.setHasDecor;
                int i4 = this.Keep;
                this.Keep = i4 + 1;
                iArr[i4] = 10;
            } else {
                if (i2 != 10) {
                    int[] iArr2 = this.setHasDecor;
                    int i5 = this.Keep;
                    this.Keep = i5 + 1;
                    iArr2[i5] = i2;
                } else if (!this.setPopupCallback) {
                    int[] iArr3 = this.setHasDecor;
                    int i6 = this.Keep;
                    this.Keep = i6 + 1;
                    iArr3[i6] = 10;
                }
                this.setPopupCallback = false;
            }
        }
        return this.setHasDecor[i];
    }

    private final String MediaDescriptionCompat() throws IOException, XmlPullParserException {
        int i = this.AppCompatViewInflater;
        int IconCompatParcelizer2 = IconCompatParcelizer(0);
        if ((IconCompatParcelizer2 < 97 || IconCompatParcelizer2 > 122) && ((IconCompatParcelizer2 < 65 || IconCompatParcelizer2 > 90) && IconCompatParcelizer2 != 95 && IconCompatParcelizer2 != 58 && IconCompatParcelizer2 < 192 && !this.setBackgroundResource)) {
            write("name expected");
        }
        while (true) {
            MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver());
            int IconCompatParcelizer3 = IconCompatParcelizer(0);
            if ((IconCompatParcelizer3 < 97 || IconCompatParcelizer3 > 122) && ((IconCompatParcelizer3 < 65 || IconCompatParcelizer3 > 90) && !((IconCompatParcelizer3 >= 48 && IconCompatParcelizer3 <= 57) || IconCompatParcelizer3 == 95 || IconCompatParcelizer3 == 45 || IconCompatParcelizer3 == 58 || IconCompatParcelizer3 == 46 || IconCompatParcelizer3 >= 183))) {
                String str = new String(this.setCheckable, i, this.AppCompatViewInflater - i);
                this.AppCompatViewInflater = i;
                return str;
            }
        }
    }

    private final void MediaBrowserCompat$SearchResultReceiver() throws IOException {
        while (true) {
            int IconCompatParcelizer2 = IconCompatParcelizer(0);
            if (IconCompatParcelizer2 <= 32 && IconCompatParcelizer2 != -1) {
                MediaBrowserCompat$ItemReceiver();
            } else {
                return;
            }
        }
    }

    public final void setInput(Reader reader) throws XmlPullParserException {
        this.AppCompatActivity = reader;
        this.ParcelableVolumeInfo = 1;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        this.setExpandedFormat = 0;
        this.f5809x50fd9e4a = null;
        this.MediaSessionCompat$ResultReceiverWrapper = null;
        this.IconCompatParcelizer = false;
        this.write = -1;
        this.RatingCompat = null;
        this.setShortcut = null;
        this.setChecked = null;
        if (reader != null) {
            this.AppCompatDialogFragment = 0;
            this.setContentView = 0;
            this.Keep = 0;
            this.read = 0;
            Hashtable hashtable = new Hashtable();
            this.MediaBrowserCompat$MediaItem = hashtable;
            hashtable.put("amp", "&");
            this.MediaBrowserCompat$MediaItem.put("apos", "'");
            this.MediaBrowserCompat$MediaItem.put("gt", ">");
            this.MediaBrowserCompat$MediaItem.put("lt", "<");
            this.MediaBrowserCompat$MediaItem.put("quot", "\"");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r3 = r11.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r3 == -1) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r6 = r10.AppCompatDelegateImpl$ListMenuDecorView;
        r8 = r10.setContentView;
        r10.setContentView = r8 + 1;
        r6[r8] = (char) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r3 != 62) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r3 = new java.lang.String(r10.AppCompatDelegateImpl$ListMenuDecorView, 0, r10.setContentView);
        r6 = r3.indexOf("encoding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r6 == -1) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (r3.charAt(r6) == '\"') goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r3.charAt(r6) == '\'') goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        r5 = r6 + 1;
        r3 = r3.substring(r5, r3.indexOf(r3.charAt(r6), r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        r0 = "UTF-32BE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        r0 = "UTF-32LE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ac, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
        r5 = -65536 & r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (r5 != -16842752) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r10.AppCompatDelegateImpl$ListMenuDecorView[0] = (char) ((r10.AppCompatDelegateImpl$ListMenuDecorView[2] << 8) | r10.AppCompatDelegateImpl$ListMenuDecorView[3]);
        r10.setContentView = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
        r0 = "UTF-16BE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cc, code lost:
        if (r5 != -131072) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r10.AppCompatDelegateImpl$ListMenuDecorView[0] = (char) ((r10.AppCompatDelegateImpl$ListMenuDecorView[3] << 8) | r10.AppCompatDelegateImpl$ListMenuDecorView[2]);
        r10.setContentView = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
        r0 = "UTF-16LE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e8, code lost:
        if ((r2 & -256) != -272908544) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r10.AppCompatDelegateImpl$ListMenuDecorView[0] = r10.AppCompatDelegateImpl$ListMenuDecorView[3];
        r10.setContentView = 1;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f6, code lost:
        r0 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setInput(java.io.InputStream r11, java.lang.String r12) throws org.xmlpull.p042v1.XmlPullParserException {
        /*
            r10 = this;
            r0 = 0
            r10.AppCompatDialogFragment = r0
            r10.setContentView = r0
            if (r11 == 0) goto L_0x0129
            java.lang.String r1 = "UTF-8"
            if (r12 != 0) goto L_0x00fa
            r2 = r0
        L_0x000c:
            int r3 = r10.setContentView     // Catch:{ Exception -> 0x00f8 }
            r4 = 4
            r5 = -1
            if (r3 >= r4) goto L_0x0027
            int r3 = r11.read()     // Catch:{ Exception -> 0x00f8 }
            if (r3 == r5) goto L_0x0027
            int r2 = r2 << 8
            r2 = r2 | r3
            char[] r4 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            int r5 = r10.setContentView     // Catch:{ Exception -> 0x00f8 }
            int r6 = r5 + 1
            r10.setContentView = r6     // Catch:{ Exception -> 0x00f8 }
            char r3 = (char) r3     // Catch:{ Exception -> 0x00f8 }
            r4[r5] = r3     // Catch:{ Exception -> 0x00f8 }
            goto L_0x000c
        L_0x0027:
            int r3 = r10.setContentView     // Catch:{ Exception -> 0x00f8 }
            if (r3 != r4) goto L_0x00fa
            r3 = 63
            r4 = 2
            r6 = 60
            r7 = 1
            switch(r2) {
                case -131072: goto L_0x00a7;
                case 60: goto L_0x009e;
                case 65279: goto L_0x009b;
                case 3932223: goto L_0x0090;
                case 1006632960: goto L_0x0089;
                case 1006649088: goto L_0x007e;
                case 1010792557: goto L_0x0036;
                default: goto L_0x0034;
            }     // Catch:{ Exception -> 0x00f8 }
        L_0x0034:
            goto L_0x00ac
        L_0x0036:
            int r3 = r11.read()     // Catch:{ Exception -> 0x00f8 }
            if (r3 == r5) goto L_0x00ac
            char[] r6 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            int r8 = r10.setContentView     // Catch:{ Exception -> 0x00f8 }
            int r9 = r8 + 1
            r10.setContentView = r9     // Catch:{ Exception -> 0x00f8 }
            char r9 = (char) r3     // Catch:{ Exception -> 0x00f8 }
            r6[r8] = r9     // Catch:{ Exception -> 0x00f8 }
            r6 = 62
            if (r3 != r6) goto L_0x0036
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00f8 }
            char[] r6 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            int r8 = r10.setContentView     // Catch:{ Exception -> 0x00f8 }
            r3.<init>(r6, r0, r8)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = "encoding"
            int r6 = r3.indexOf(r6)     // Catch:{ Exception -> 0x00f8 }
            if (r6 == r5) goto L_0x00ac
        L_0x005c:
            char r5 = r3.charAt(r6)     // Catch:{ Exception -> 0x00f8 }
            r8 = 34
            if (r5 == r8) goto L_0x006f
            char r5 = r3.charAt(r6)     // Catch:{ Exception -> 0x00f8 }
            r8 = 39
            if (r5 == r8) goto L_0x006f
            int r6 = r6 + 1
            goto L_0x005c
        L_0x006f:
            int r5 = r6 + 1
            char r6 = r3.charAt(r6)     // Catch:{ Exception -> 0x00f8 }
            int r6 = r3.indexOf(r6, r5)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r3 = r3.substring(r5, r6)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00ad
        L_0x007e:
            char[] r2 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            r2[r0] = r6     // Catch:{ Exception -> 0x00f8 }
            char[] r0 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            r0[r7] = r3     // Catch:{ Exception -> 0x00f8 }
            r10.setContentView = r4     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00e0
        L_0x0089:
            char[] r2 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            r2[r0] = r6     // Catch:{ Exception -> 0x00f8 }
            r10.setContentView = r7     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00a9
        L_0x0090:
            char[] r2 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            r2[r0] = r6     // Catch:{ Exception -> 0x00f8 }
            char[] r0 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            r0[r7] = r3     // Catch:{ Exception -> 0x00f8 }
            r10.setContentView = r4     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00c7
        L_0x009b:
            r10.setContentView = r0     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00a4
        L_0x009e:
            char[] r2 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            r2[r0] = r6     // Catch:{ Exception -> 0x00f8 }
            r10.setContentView = r7     // Catch:{ Exception -> 0x00f8 }
        L_0x00a4:
            java.lang.String r0 = "UTF-32BE"
            goto L_0x00fb
        L_0x00a7:
            r10.setContentView = r0     // Catch:{ Exception -> 0x00f8 }
        L_0x00a9:
            java.lang.String r0 = "UTF-32LE"
            goto L_0x00fb
        L_0x00ac:
            r3 = r12
        L_0x00ad:
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r2
            r6 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            r8 = 3
            if (r5 != r6) goto L_0x00ca
            char[] r2 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            char[] r3 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            char r3 = r3[r4]     // Catch:{ Exception -> 0x00f8 }
            int r3 = r3 << 8
            char[] r4 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            char r4 = r4[r8]     // Catch:{ Exception -> 0x00f8 }
            r3 = r3 | r4
            char r3 = (char) r3     // Catch:{ Exception -> 0x00f8 }
            r2[r0] = r3     // Catch:{ Exception -> 0x00f8 }
            r10.setContentView = r7     // Catch:{ Exception -> 0x00f8 }
        L_0x00c7:
            java.lang.String r0 = "UTF-16BE"
            goto L_0x00fb
        L_0x00ca:
            r6 = -131072(0xfffffffffffe0000, float:NaN)
            if (r5 != r6) goto L_0x00e3
            char[] r2 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            char[] r3 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            char r3 = r3[r8]     // Catch:{ Exception -> 0x00f8 }
            int r3 = r3 << 8
            char[] r5 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            char r4 = r5[r4]     // Catch:{ Exception -> 0x00f8 }
            r3 = r3 | r4
            char r3 = (char) r3     // Catch:{ Exception -> 0x00f8 }
            r2[r0] = r3     // Catch:{ Exception -> 0x00f8 }
            r10.setContentView = r7     // Catch:{ Exception -> 0x00f8 }
        L_0x00e0:
            java.lang.String r0 = "UTF-16LE"
            goto L_0x00fb
        L_0x00e3:
            r2 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = -272908544(0xffffffffefbbbf00, float:-1.162092E29)
            if (r2 != r4) goto L_0x00f6
            char[] r2 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            char[] r3 = r10.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x00f8 }
            char r3 = r3[r8]     // Catch:{ Exception -> 0x00f8 }
            r2[r0] = r3     // Catch:{ Exception -> 0x00f8 }
            r10.setContentView = r7     // Catch:{ Exception -> 0x00f8 }
            r0 = r1
            goto L_0x00fb
        L_0x00f6:
            r0 = r3
            goto L_0x00fb
        L_0x00f8:
            r11 = move-exception
            goto L_0x010e
        L_0x00fa:
            r0 = r12
        L_0x00fb:
            if (r0 != 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r1 = r0
        L_0x00ff:
            int r0 = r10.setContentView     // Catch:{ Exception -> 0x00f8 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00f8 }
            r2.<init>(r11, r1)     // Catch:{ Exception -> 0x00f8 }
            r10.setInput(r2)     // Catch:{ Exception -> 0x00f8 }
            r10.RatingCompat = r12     // Catch:{ Exception -> 0x00f8 }
            r10.setContentView = r0     // Catch:{ Exception -> 0x00f8 }
            return
        L_0x010e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid stream or encoding: "
            r12.append(r0)
            java.lang.String r0 = r11.toString()
            r12.append(r0)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = r12.toString()
            r0.<init>(r12, r10, r11)
            throw r0
        L_0x0129:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ETBSaleSheetAccountTypeAdapter$ETBSaleSheetHolder_ViewBinding.setInput(java.io.InputStream, java.lang.String):void");
    }

    public final boolean getFeature(String str) {
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            return this.PlaybackStateCompat$CustomAction;
        }
        if (MediaBrowserCompat$ItemReceiver(str, false, "relaxed")) {
            return this.setBackgroundResource;
        }
        return false;
    }

    public final String getInputEncoding() {
        return this.RatingCompat;
    }

    public final void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        Hashtable hashtable = this.MediaBrowserCompat$MediaItem;
        if (hashtable != null) {
            hashtable.put(str, str2);
            return;
        }
        throw new RuntimeException("entity replacement text must be defined after setInput!");
    }

    public final Object getProperty(String str) {
        if (MediaBrowserCompat$ItemReceiver(str, true, "xmldecl-version")) {
            return this.setShortcut;
        }
        if (MediaBrowserCompat$ItemReceiver(str, true, "xmldecl-standalone")) {
            return this.setChecked;
        }
        if (!MediaBrowserCompat$ItemReceiver(str, true, "location")) {
            return null;
        }
        Object obj = this.MediaSessionCompat$QueueItem;
        return obj == null ? this.AppCompatActivity.toString() : obj;
    }

    public final int getNamespaceCount(int i) {
        if (i <= this.read) {
            return this.MediaSessionCompat$Token[i];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String getNamespacePrefix(int i) {
        return this.PlaybackStateCompat[i << 1];
    }

    public final String getNamespaceUri(int i) {
        return this.PlaybackStateCompat[(i << 1) + 1];
    }

    public final String getNamespace(String str) {
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        for (int namespaceCount = (getNamespaceCount(this.read) << 1) - 2; namespaceCount >= 0; namespaceCount -= 2) {
            if (str == null) {
                String[] strArr = this.PlaybackStateCompat;
                if (strArr[namespaceCount] == null) {
                    return strArr[namespaceCount + 1];
                }
            } else if (str.equals(this.PlaybackStateCompat[namespaceCount])) {
                return this.PlaybackStateCompat[namespaceCount + 1];
            }
        }
        return null;
    }

    public final int getDepth() {
        return this.read;
    }

    public final String getPositionDescription() {
        StringBuffer stringBuffer = new StringBuffer(this.setExpandedFormat < TYPES.length ? TYPES[this.setExpandedFormat] : "unknown");
        stringBuffer.append(' ');
        int i = this.setExpandedFormat;
        if (i == 2 || i == 3) {
            if (this.IconCompatParcelizer) {
                stringBuffer.append("(empty) ");
            }
            stringBuffer.append('<');
            if (this.setExpandedFormat == 3) {
                stringBuffer.append('/');
            }
            if (this.AlertController$RecycleListView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("{");
                sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
                sb.append("}");
                sb.append(this.AlertController$RecycleListView);
                sb.append(":");
                stringBuffer.append(sb.toString());
            }
            stringBuffer.append(this.f5809x50fd9e4a);
            int i2 = this.write;
            for (int i3 = 0; i3 < (i2 << 2); i3 += 4) {
                stringBuffer.append(' ');
                int i4 = i3 + 1;
                if (this.MediaBrowserCompat$ItemReceiver[i4] != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("{");
                    sb2.append(this.MediaBrowserCompat$ItemReceiver[i3]);
                    sb2.append("}");
                    sb2.append(this.MediaBrowserCompat$ItemReceiver[i4]);
                    sb2.append(":");
                    stringBuffer.append(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.MediaBrowserCompat$ItemReceiver[i3 + 2]);
                sb3.append("='");
                sb3.append(this.MediaBrowserCompat$ItemReceiver[i3 + 3]);
                sb3.append("'");
                stringBuffer.append(sb3.toString());
            }
            stringBuffer.append('>');
        } else if (i != 7) {
            if (i != 4) {
                stringBuffer.append(getText());
            } else if (this.MediaBrowserCompat$SearchResultReceiver) {
                stringBuffer.append("(whitespace)");
            } else {
                String text = getText();
                if (text.length() > 16) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(text.substring(0, 16));
                    sb4.append("...");
                    text = sb4.toString();
                }
                stringBuffer.append(text);
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("@");
        sb5.append(this.ParcelableVolumeInfo);
        sb5.append(":");
        sb5.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        stringBuffer.append(sb5.toString());
        if (this.MediaSessionCompat$QueueItem != null) {
            stringBuffer.append(" in ");
            stringBuffer.append(this.MediaSessionCompat$QueueItem);
        } else if (this.AppCompatActivity != null) {
            stringBuffer.append(" in ");
            stringBuffer.append(this.AppCompatActivity.toString());
        }
        return stringBuffer.toString();
    }

    public final int getLineNumber() {
        return this.ParcelableVolumeInfo;
    }

    public final int getColumnNumber() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final boolean isWhitespace() throws XmlPullParserException {
        int i = this.setExpandedFormat;
        if (!(i == 4 || i == 7 || i == 5)) {
            IconCompatParcelizer("Wrong event type");
        }
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final String getText() {
        int i = this.setExpandedFormat;
        if (i < 4 || (i == 6 && this.setIcon)) {
            return null;
        }
        return new String(this.setCheckable, 0, this.AppCompatViewInflater);
    }

    public final char[] getTextCharacters(int[] iArr) {
        int i = this.setExpandedFormat;
        if (i < 4) {
            iArr[0] = -1;
            iArr[1] = -1;
            return null;
        } else if (i == 6) {
            iArr[0] = 0;
            iArr[1] = this.f5809x50fd9e4a.length();
            return this.f5809x50fd9e4a.toCharArray();
        } else {
            iArr[0] = 0;
            iArr[1] = this.AppCompatViewInflater;
            return this.setCheckable;
        }
    }

    public final String getNamespace() {
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public final String getName() {
        return this.f5809x50fd9e4a;
    }

    public final String getPrefix() {
        return this.AlertController$RecycleListView;
    }

    public final boolean isEmptyElementTag() throws XmlPullParserException {
        if (this.setExpandedFormat != 2) {
            IconCompatParcelizer("Wrong event type");
        }
        return this.IconCompatParcelizer;
    }

    public final int getAttributeCount() {
        return this.write;
    }

    public final String getAttributeNamespace(int i) {
        if (i < this.write) {
            return this.MediaBrowserCompat$ItemReceiver[i << 2];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String getAttributeName(int i) {
        if (i < this.write) {
            return this.MediaBrowserCompat$ItemReceiver[(i << 2) + 2];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String getAttributePrefix(int i) {
        if (i < this.write) {
            return this.MediaBrowserCompat$ItemReceiver[(i << 2) + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String getAttributeValue(int i) {
        if (i < this.write) {
            return this.MediaBrowserCompat$ItemReceiver[(i << 2) + 3];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String getAttributeValue(String str, String str2) {
        for (int i = (this.write << 2) - 4; i >= 0; i -= 4) {
            if (this.MediaBrowserCompat$ItemReceiver[i + 2].equals(str2) && (str == null || this.MediaBrowserCompat$ItemReceiver[i].equals(str))) {
                return this.MediaBrowserCompat$ItemReceiver[i + 3];
            }
        }
        return null;
    }

    public final int getEventType() throws XmlPullParserException {
        return this.setExpandedFormat;
    }

    public final int next() throws XmlPullParserException, IOException {
        this.AppCompatViewInflater = 0;
        this.MediaBrowserCompat$SearchResultReceiver = true;
        this.ActionMenuItemView = false;
        int i = RegistrationManageDeviceAdapter$DeviceItemViewHolder.MAX_VALUE_OF_ERA;
        while (true) {
            read();
            int i2 = this.setExpandedFormat;
            if (i2 < i) {
                i = i2;
            }
            if (i > 6 || (i >= 4 && IconCompatParcelizer() >= 4)) {
            }
        }
        this.setExpandedFormat = i;
        if (i > 4) {
            this.setExpandedFormat = 4;
        }
        return this.setExpandedFormat;
    }

    public final int nextToken() throws XmlPullParserException, IOException {
        this.MediaBrowserCompat$SearchResultReceiver = true;
        this.AppCompatViewInflater = 0;
        this.ActionMenuItemView = true;
        read();
        return this.setExpandedFormat;
    }

    public final int nextTag() throws XmlPullParserException, IOException {
        next();
        if (this.setExpandedFormat == 4 && this.MediaBrowserCompat$SearchResultReceiver) {
            next();
        }
        int i = this.setExpandedFormat;
        if (!(i == 3 || i == 2)) {
            IconCompatParcelizer("unexpected type");
        }
        return this.setExpandedFormat;
    }

    public final void require(int i, String str, String str2) throws XmlPullParserException, IOException {
        if (i != this.setExpandedFormat || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            StringBuilder sb = new StringBuilder();
            sb.append("expected: ");
            sb.append(TYPES[i]);
            sb.append(" {");
            sb.append(str);
            sb.append("}");
            sb.append(str2);
            IconCompatParcelizer(sb.toString());
        }
    }

    public final String nextText() throws XmlPullParserException, IOException {
        String str;
        if (this.setExpandedFormat != 2) {
            IconCompatParcelizer("precondition: START_TAG");
        }
        next();
        if (this.setExpandedFormat == 4) {
            str = getText();
            next();
        } else {
            str = "";
        }
        if (this.setExpandedFormat != 3) {
            IconCompatParcelizer("END_TAG expected");
        }
        return str;
    }

    public final void setFeature(String str, boolean z) throws XmlPullParserException {
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            this.PlaybackStateCompat$CustomAction = z;
        } else if (MediaBrowserCompat$ItemReceiver(str, false, "relaxed")) {
            this.setBackgroundResource = z;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unsupported feature: ");
            sb.append(str);
            IconCompatParcelizer(sb.toString());
        }
    }

    public final void setProperty(String str, Object obj) throws XmlPullParserException {
        if (MediaBrowserCompat$ItemReceiver(str, true, "location")) {
            this.MediaSessionCompat$QueueItem = obj;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unsupported property: ");
        sb.append(str);
        throw new XmlPullParserException(sb.toString());
    }
}
