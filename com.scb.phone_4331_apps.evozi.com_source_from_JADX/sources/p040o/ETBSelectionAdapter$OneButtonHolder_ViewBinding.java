package p040o;

import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Hashtable;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;

/* renamed from: o.ETBSelectionAdapter$OneButtonHolder_ViewBinding */
public final class ETBSelectionAdapter$OneButtonHolder_ViewBinding implements HistoryAdapter$GroupErrorViewHolder_ViewBinding {
    private String ActionMenuItemView;
    private int AlertController$RecycleListView;
    private int AppCompatActivity;
    private String AppCompatDelegateImpl$ListMenuDecorView;
    private int[] AppCompatDialogFragment = new int[4];
    private boolean AppCompatViewInflater;
    private Hashtable IconCompatParcelizer;
    private boolean Keep;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private String[] MediaBrowserCompat$ItemReceiver = new String[16];
    private char[] MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f5810x50fd9e4a;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int[] MediaSessionCompat$QueueItem;
    private String[] MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private boolean ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private boolean PlaybackStateCompat$CustomAction;
    private int RatingCompat;
    private String[] setBackgroundResource = new String[8];
    private String setCheckable;
    private String setChecked;
    private Reader setContentView;
    private int setExpandedFormat;
    private boolean setHasDecor;
    private char[] write;

    public final String IconCompatParcelizer() {
        return "CDATA";
    }

    public ETBSelectionAdapter$OneButtonHolder_ViewBinding() {
        int i = 128;
        this.MediaBrowserCompat$MediaItem = new char[128];
        this.MediaSessionCompat$ResultReceiverWrapper = new String[16];
        this.MediaSessionCompat$QueueItem = new int[2];
        this.write = new char[(Runtime.getRuntime().freeMemory() >= 1048576 ? 8192 : i)];
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(String str) throws XmlPullParserException {
        if (!this.AppCompatViewInflater) {
            read(str);
        } else if (this.AppCompatDelegateImpl$ListMenuDecorView == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ERR: ");
            sb.append(str);
            this.AppCompatDelegateImpl$ListMenuDecorView = sb.toString();
        }
    }

    private final void read(String str) throws XmlPullParserException {
        if (str.length() >= 100) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, 100));
            sb.append("\n");
            str = sb.toString();
        }
        throw new XmlPullParserException(str, this, (Throwable) null);
    }

    private final void AppCompatDelegateImpl$ListMenuDecorView() throws IOException, XmlPullParserException {
        int i;
        String str;
        int i2;
        int i3;
        if (this.setContentView == null) {
            read("No Input specified");
        }
        if (this.setExpandedFormat == 3) {
            this.MediaBrowserCompat$CustomActionResultReceiver--;
        }
        do {
            this.MediaSessionCompat$Token = -1;
            if (this.ParcelableVolumeInfo) {
                this.ParcelableVolumeInfo = false;
                this.setExpandedFormat = 3;
                return;
            }
            i = 9;
            if (this.AppCompatDelegateImpl$ListMenuDecorView != null) {
                for (int i4 = 0; i4 < this.AppCompatDelegateImpl$ListMenuDecorView.length(); i4++) {
                    RatingCompat(this.AppCompatDelegateImpl$ListMenuDecorView.charAt(i4));
                }
                this.AppCompatDelegateImpl$ListMenuDecorView = null;
                this.setExpandedFormat = 9;
                return;
            }
            this.ActionMenuItemView = null;
            this.setChecked = null;
            this.setCheckable = null;
            int AlertController$RecycleListView2 = AlertController$RecycleListView();
            this.setExpandedFormat = AlertController$RecycleListView2;
            if (AlertController$RecycleListView2 != 1) {
                int i5 = 2;
                if (AlertController$RecycleListView2 == 2) {
                    IconCompatParcelizer(false);
                    return;
                } else if (AlertController$RecycleListView2 == 3) {
                    setHasDecor();
                    return;
                } else if (AlertController$RecycleListView2 == 4) {
                    IconCompatParcelizer(60, !this.PlaybackStateCompat$CustomAction);
                    if (this.MediaBrowserCompat$CustomActionResultReceiver == 0 && this.f5810x50fd9e4a) {
                        this.setExpandedFormat = 7;
                        return;
                    }
                    return;
                } else if (AlertController$RecycleListView2 != 6) {
                    boolean z = this.PlaybackStateCompat$CustomAction;
                    Keep();
                    int Keep2 = Keep();
                    if (Keep2 == 63) {
                        if ((MediaMetadataCompat(0) == 120 || MediaMetadataCompat(0) == 88) && (MediaMetadataCompat(1) == 109 || MediaMetadataCompat(1) == 77)) {
                            if (z) {
                                RatingCompat(MediaMetadataCompat(0));
                                RatingCompat(MediaMetadataCompat(1));
                            }
                            Keep();
                            Keep();
                            if ((MediaMetadataCompat(0) == 108 || MediaMetadataCompat(0) == 76) && MediaMetadataCompat(1) <= 32) {
                                if (this.MediaBrowserCompat$SearchResultReceiver != 1 || this.AppCompatActivity > 4) {
                                    MediaBrowserCompat$CustomActionResultReceiver("PI must not start with xml");
                                }
                                IconCompatParcelizer(true);
                                if (this.MediaSessionCompat$Token <= 0 || !"version".equals(this.MediaSessionCompat$ResultReceiverWrapper[2])) {
                                    MediaBrowserCompat$CustomActionResultReceiver("version expected");
                                }
                                String[] strArr = this.MediaSessionCompat$ResultReceiverWrapper;
                                if (1 >= this.MediaSessionCompat$Token || !"encoding".equals(strArr[6])) {
                                    i5 = 1;
                                }
                                if (i5 < this.MediaSessionCompat$Token) {
                                    int i6 = i5 << 2;
                                    if ("standalone".equals(this.MediaSessionCompat$ResultReceiverWrapper[i6 + 2])) {
                                        String str2 = this.MediaSessionCompat$ResultReceiverWrapper[i6 + 3];
                                        if (!"yes".equals(str2) && !"no".equals(str2)) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("illegal standalone value: ");
                                            sb.append(str2);
                                            MediaBrowserCompat$CustomActionResultReceiver(sb.toString());
                                        }
                                        i5++;
                                    }
                                }
                                if (i5 != this.MediaSessionCompat$Token) {
                                    MediaBrowserCompat$CustomActionResultReceiver("illegal xmldecl");
                                }
                                this.f5810x50fd9e4a = true;
                                this.MediaDescriptionCompat = 0;
                                i = 998;
                                this.setExpandedFormat = i;
                            }
                        }
                        str = "";
                        i2 = 8;
                        i3 = 63;
                    } else if (Keep2 != 33) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("illegal: <");
                        sb2.append(Keep2);
                        MediaBrowserCompat$CustomActionResultReceiver(sb2.toString());
                        this.setExpandedFormat = i;
                    } else if (MediaMetadataCompat(0) == 45) {
                        str = "--";
                        i3 = 45;
                        i2 = 9;
                    } else if (MediaMetadataCompat(0) == 91) {
                        str = "[CDATA[";
                        i2 = 5;
                        i3 = 93;
                        z = true;
                    } else {
                        i3 = -1;
                        str = "DOCTYPE";
                        i2 = 10;
                    }
                    for (int i7 = 0; i7 < str.length(); i7++) {
                        IconCompatParcelizer(str.charAt(i7));
                    }
                    if (i2 == 10) {
                        write(z);
                    } else {
                        int i8 = 0;
                        while (true) {
                            int Keep3 = Keep();
                            if (Keep3 == -1) {
                                MediaBrowserCompat$CustomActionResultReceiver("Unexpected EOF");
                                break;
                            }
                            if (z) {
                                RatingCompat(Keep3);
                            }
                            if ((i3 == 63 || Keep3 == i3) && MediaMetadataCompat(0) == i3 && MediaMetadataCompat(1) == 62) {
                                if (i3 == 45 && i8 == 45 && !this.AppCompatViewInflater) {
                                    MediaBrowserCompat$CustomActionResultReceiver("illegal comment delimiter: --->");
                                }
                                Keep();
                                Keep();
                                if (z && i3 != 63) {
                                    this.MediaDescriptionCompat--;
                                }
                            } else {
                                i8 = Keep3;
                            }
                        }
                        this.setExpandedFormat = i;
                    }
                    i = i2;
                    this.setExpandedFormat = i;
                } else {
                    setContentView();
                    return;
                }
            } else {
                return;
            }
        } while (i == 998);
    }

    private final void write(boolean z) throws IOException, XmlPullParserException {
        int i = 1;
        boolean z2 = false;
        while (true) {
            int Keep2 = Keep();
            if (Keep2 != -1) {
                if (Keep2 == 39) {
                    z2 = !z2;
                } else if (Keep2 != 60) {
                    if (Keep2 == 62 && !z2 && i - 1 == 0) {
                        return;
                    }
                } else if (!z2) {
                    i++;
                }
                if (z) {
                    RatingCompat(Keep2);
                }
            } else {
                MediaBrowserCompat$CustomActionResultReceiver("Unexpected EOF");
                return;
            }
        }
    }

    private final void setHasDecor() throws IOException, XmlPullParserException {
        Keep();
        Keep();
        this.setChecked = PlaybackStateCompat();
        while (true) {
            int MediaMetadataCompat2 = MediaMetadataCompat(0);
            if (MediaMetadataCompat2 > 32 || MediaMetadataCompat2 == -1) {
                IconCompatParcelizer('>');
                int i = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i2 = (i - 1) << 2;
            } else {
                Keep();
            }
        }
        IconCompatParcelizer('>');
        int i3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i22 = (i3 - 1) << 2;
        if (i3 == 0) {
            MediaBrowserCompat$CustomActionResultReceiver("element stack empty");
            this.setExpandedFormat = 9;
        } else if (!this.AppCompatViewInflater) {
            int i4 = i22 + 3;
            if (!this.setChecked.equals(this.MediaBrowserCompat$ItemReceiver[i4])) {
                StringBuilder sb = new StringBuilder();
                sb.append("expected: /");
                sb.append(this.MediaBrowserCompat$ItemReceiver[i4]);
                sb.append(" read: ");
                sb.append(this.setChecked);
                MediaBrowserCompat$CustomActionResultReceiver(sb.toString());
            }
            String[] strArr = this.MediaBrowserCompat$ItemReceiver;
            this.setCheckable = strArr[i22];
            this.ActionMenuItemView = strArr[i22 + 1];
            this.setChecked = strArr[i22 + 2];
        }
    }

    private final int AlertController$RecycleListView() throws IOException {
        int MediaMetadataCompat2 = MediaMetadataCompat(0);
        if (MediaMetadataCompat2 == -1) {
            return 1;
        }
        if (MediaMetadataCompat2 == 38) {
            return 6;
        }
        if (MediaMetadataCompat2 != 60) {
            return 4;
        }
        int MediaMetadataCompat3 = MediaMetadataCompat(1);
        if (MediaMetadataCompat3 == 33) {
            return 999;
        }
        if (MediaMetadataCompat3 != 47) {
            return MediaMetadataCompat3 != 63 ? 2 : 999;
        }
        return 3;
    }

    private final void RatingCompat(int i) {
        this.f5810x50fd9e4a &= i <= 32;
        int i2 = this.MediaDescriptionCompat;
        char[] cArr = this.MediaBrowserCompat$MediaItem;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[(((i2 << 2) / 3) + 4)];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.MediaBrowserCompat$MediaItem = cArr2;
        }
        char[] cArr3 = this.MediaBrowserCompat$MediaItem;
        int i3 = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = i3 + 1;
        cArr3[i3] = (char) i;
    }

    private final void IconCompatParcelizer(boolean z) throws IOException, XmlPullParserException {
        int i;
        String str;
        if (!z) {
            Keep();
        }
        this.setChecked = PlaybackStateCompat();
        this.MediaSessionCompat$Token = 0;
        while (true) {
            int MediaMetadataCompat2 = MediaMetadataCompat(0);
            if (MediaMetadataCompat2 > 32 || MediaMetadataCompat2 == -1) {
                int MediaMetadataCompat3 = MediaMetadataCompat(0);
                if (!z) {
                    if (MediaMetadataCompat3 != 47) {
                        if (MediaMetadataCompat3 == 62 && !z) {
                            Keep();
                            break;
                        }
                    } else {
                        this.ParcelableVolumeInfo = true;
                        Keep();
                        while (true) {
                            int MediaMetadataCompat4 = MediaMetadataCompat(0);
                            if (MediaMetadataCompat4 > 32 || MediaMetadataCompat4 == -1) {
                                IconCompatParcelizer('>');
                            } else {
                                Keep();
                            }
                        }
                        IconCompatParcelizer('>');
                    }
                } else if (MediaMetadataCompat3 == 63) {
                    Keep();
                    IconCompatParcelizer('>');
                    return;
                }
                if (MediaMetadataCompat3 == -1) {
                    MediaBrowserCompat$CustomActionResultReceiver("Unexpected EOF");
                    return;
                }
                String PlaybackStateCompat2 = PlaybackStateCompat();
                if (PlaybackStateCompat2.length() == 0) {
                    MediaBrowserCompat$CustomActionResultReceiver("attr name expected");
                    break;
                }
                int i2 = this.MediaSessionCompat$Token;
                this.MediaSessionCompat$Token = i2 + 1;
                int i3 = i2 << 2;
                String[] strArr = this.MediaSessionCompat$ResultReceiverWrapper;
                int i4 = i3 + 4;
                if (strArr.length < i4) {
                    String[] strArr2 = new String[(i4 + 16)];
                    System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                    strArr = strArr2;
                }
                this.MediaSessionCompat$ResultReceiverWrapper = strArr;
                int i5 = i3 + 1;
                strArr[i3] = "";
                int i6 = i5 + 1;
                strArr[i5] = null;
                int i7 = i6 + 1;
                strArr[i6] = PlaybackStateCompat2;
                while (true) {
                    int MediaMetadataCompat5 = MediaMetadataCompat(0);
                    if (MediaMetadataCompat5 <= 32 && MediaMetadataCompat5 != -1) {
                        Keep();
                    }
                }
                if (MediaMetadataCompat(0) != 61) {
                    if (!this.AppCompatViewInflater) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Attr.value missing f. ");
                        sb.append(PlaybackStateCompat2);
                        MediaBrowserCompat$CustomActionResultReceiver(sb.toString());
                    }
                    this.MediaSessionCompat$ResultReceiverWrapper[i7] = PlaybackStateCompat2;
                } else {
                    IconCompatParcelizer('=');
                    PlaybackStateCompat$CustomAction();
                    int MediaMetadataCompat6 = MediaMetadataCompat(0);
                    if (MediaMetadataCompat6 == 39 || MediaMetadataCompat6 == 34) {
                        Keep();
                    } else {
                        if (!this.AppCompatViewInflater) {
                            MediaBrowserCompat$CustomActionResultReceiver("attr value delimiter missing!");
                        }
                        MediaMetadataCompat6 = 32;
                    }
                    int i8 = this.MediaDescriptionCompat;
                    IconCompatParcelizer(MediaMetadataCompat6, true);
                    this.MediaSessionCompat$ResultReceiverWrapper[i7] = new String(this.MediaBrowserCompat$MediaItem, i8, this.MediaDescriptionCompat - i8);
                    this.MediaDescriptionCompat = i8;
                    if (MediaMetadataCompat6 != 32) {
                        Keep();
                    }
                }
            } else {
                Keep();
            }
        }
        int i9 = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = i9 + 1;
        int i10 = i9 << 2;
        String[] strArr3 = this.MediaBrowserCompat$ItemReceiver;
        int i11 = i10 + 4;
        if (strArr3.length < i11) {
            String[] strArr4 = new String[(i11 + 16)];
            System.arraycopy(strArr3, 0, strArr4, 0, strArr3.length);
            strArr3 = strArr4;
        }
        this.MediaBrowserCompat$ItemReceiver = strArr3;
        strArr3[i10 + 3] = this.setChecked;
        int i12 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int[] iArr = this.AppCompatDialogFragment;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[(i12 + 4)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.AppCompatDialogFragment = iArr2;
        }
        int[] iArr3 = this.AppCompatDialogFragment;
        int i13 = this.MediaBrowserCompat$CustomActionResultReceiver;
        iArr3[i13] = iArr3[i13 - 1];
        if (this.Keep) {
            int i14 = 0;
            boolean z2 = false;
            while (true) {
                i = this.MediaSessionCompat$Token << 2;
                if (i14 >= i) {
                    break;
                }
                String str2 = this.MediaSessionCompat$ResultReceiverWrapper[i14 + 2];
                int indexOf = str2.indexOf(58);
                if (indexOf != -1) {
                    String substring = str2.substring(0, indexOf);
                    str = str2.substring(indexOf + 1);
                    str2 = substring;
                } else if (str2.equals("xmlns")) {
                    str = null;
                } else {
                    i14 += 4;
                }
                if (!str2.equals("xmlns")) {
                    z2 = true;
                } else {
                    int[] iArr4 = this.AppCompatDialogFragment;
                    int i15 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    int i16 = iArr4[i15];
                    iArr4[i15] = i16 + 1;
                    int i17 = i16 << 1;
                    String[] strArr5 = this.setBackgroundResource;
                    int i18 = i17 + 2;
                    if (strArr5.length < i18) {
                        String[] strArr6 = new String[(i18 + 16)];
                        System.arraycopy(strArr5, 0, strArr6, 0, strArr5.length);
                        strArr5 = strArr6;
                    }
                    this.setBackgroundResource = strArr5;
                    strArr5[i17] = str;
                    String[] strArr7 = this.MediaSessionCompat$ResultReceiverWrapper;
                    int i19 = i14 + 3;
                    strArr5[i17 + 1] = strArr7[i19];
                    if (str != null && strArr7[i19].equals("")) {
                        MediaBrowserCompat$CustomActionResultReceiver("illegal empty namespace");
                    }
                    String[] strArr8 = this.MediaSessionCompat$ResultReceiverWrapper;
                    int i20 = this.MediaSessionCompat$Token - 1;
                    this.MediaSessionCompat$Token = i20;
                    System.arraycopy(strArr8, i14 + 4, strArr8, i14, (i20 << 2) - i14);
                    i14 -= 4;
                }
                i14 += 4;
            }
            if (z2) {
                int i21 = i - 4;
                while (i21 >= 0) {
                    int i22 = i21 + 2;
                    String str3 = this.MediaSessionCompat$ResultReceiverWrapper[i22];
                    int indexOf2 = str3.indexOf(58);
                    if (indexOf2 != 0 || this.AppCompatViewInflater) {
                        if (indexOf2 != -1) {
                            String substring2 = str3.substring(0, indexOf2);
                            String substring3 = str3.substring(indexOf2 + 1);
                            String IconCompatParcelizer2 = IconCompatParcelizer(substring2);
                            if (IconCompatParcelizer2 != null || this.AppCompatViewInflater) {
                                String[] strArr9 = this.MediaSessionCompat$ResultReceiverWrapper;
                                strArr9[i21] = IconCompatParcelizer2;
                                strArr9[i21 + 1] = substring2;
                                strArr9[i22] = substring3;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Undefined Prefix: ");
                                sb2.append(substring2);
                                sb2.append(" in ");
                                sb2.append(this);
                                throw new RuntimeException(sb2.toString());
                            }
                        }
                        i21 -= 4;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("illegal attribute name: ");
                        sb3.append(str3);
                        sb3.append(" at ");
                        sb3.append(this);
                        throw new RuntimeException(sb3.toString());
                    }
                }
            }
            int indexOf3 = this.setChecked.indexOf(58);
            if (indexOf3 == 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("illegal tag name: ");
                sb4.append(this.setChecked);
                MediaBrowserCompat$CustomActionResultReceiver(sb4.toString());
            }
            if (indexOf3 != -1) {
                this.ActionMenuItemView = this.setChecked.substring(0, indexOf3);
                this.setChecked = this.setChecked.substring(indexOf3 + 1);
            }
            String IconCompatParcelizer3 = IconCompatParcelizer(this.ActionMenuItemView);
            this.setCheckable = IconCompatParcelizer3;
            if (IconCompatParcelizer3 == null) {
                if (this.ActionMenuItemView != null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("undefined prefix: ");
                    sb5.append(this.ActionMenuItemView);
                    MediaBrowserCompat$CustomActionResultReceiver(sb5.toString());
                }
                this.setCheckable = "";
            }
        } else {
            this.setCheckable = "";
        }
        String[] strArr10 = this.MediaBrowserCompat$ItemReceiver;
        strArr10[i10] = this.setCheckable;
        strArr10[i10 + 1] = this.ActionMenuItemView;
        strArr10[i10 + 2] = this.setChecked;
    }

    private final void setContentView() throws IOException, XmlPullParserException {
        RatingCompat(Keep());
        int i = this.MediaDescriptionCompat;
        while (true) {
            int MediaMetadataCompat2 = MediaMetadataCompat(0);
            boolean z = true;
            if (MediaMetadataCompat2 == 59) {
                Keep();
                String str = new String(this.MediaBrowserCompat$MediaItem, i, this.MediaDescriptionCompat - i);
                this.MediaDescriptionCompat = i - 1;
                if (this.PlaybackStateCompat$CustomAction && this.setExpandedFormat == 6) {
                    this.setChecked = str;
                }
                if (str.charAt(0) == '#') {
                    RatingCompat(str.charAt(1) == 'x' ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str.substring(1)));
                    return;
                }
                String str2 = (String) this.IconCompatParcelizer.get(str);
                if (str2 != null) {
                    z = false;
                }
                this.setHasDecor = z;
                if (!z) {
                    for (int i2 = 0; i2 < str2.length(); i2++) {
                        RatingCompat(str2.charAt(i2));
                    }
                    return;
                } else if (!this.PlaybackStateCompat$CustomAction) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unresolved: &");
                    sb.append(str);
                    sb.append(";");
                    MediaBrowserCompat$CustomActionResultReceiver(sb.toString());
                    return;
                } else {
                    return;
                }
            } else if (MediaMetadataCompat2 >= 128 || ((MediaMetadataCompat2 >= 48 && MediaMetadataCompat2 <= 57) || ((MediaMetadataCompat2 >= 97 && MediaMetadataCompat2 <= 122) || ((MediaMetadataCompat2 >= 65 && MediaMetadataCompat2 <= 90) || MediaMetadataCompat2 == 95 || MediaMetadataCompat2 == 45 || MediaMetadataCompat2 == 35)))) {
                RatingCompat(Keep());
            } else {
                if (!this.AppCompatViewInflater) {
                    MediaBrowserCompat$CustomActionResultReceiver("unterminated entity ref");
                }
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("broken entitiy: ");
                int i3 = i - 1;
                sb2.append(new String(this.MediaBrowserCompat$MediaItem, i3, this.MediaDescriptionCompat - i3));
                printStream.println(sb2.toString());
                return;
            }
        }
    }

    private final void IconCompatParcelizer(int i, boolean z) throws IOException, XmlPullParserException {
        int MediaMetadataCompat2 = MediaMetadataCompat(0);
        int i2 = 0;
        while (MediaMetadataCompat2 != -1 && MediaMetadataCompat2 != i) {
            if (i != 32 || (MediaMetadataCompat2 > 32 && MediaMetadataCompat2 != 62)) {
                if (MediaMetadataCompat2 == 38) {
                    if (z) {
                        setContentView();
                    } else {
                        return;
                    }
                } else if (MediaMetadataCompat2 == 10 && this.setExpandedFormat == 2) {
                    Keep();
                    RatingCompat(32);
                } else {
                    RatingCompat(Keep());
                }
                if (MediaMetadataCompat2 == 62 && i2 >= 2 && i != 93) {
                    MediaBrowserCompat$CustomActionResultReceiver("Illegal: ]]>");
                }
                i2 = MediaMetadataCompat2 == 93 ? i2 + 1 : 0;
                MediaMetadataCompat2 = MediaMetadataCompat(0);
            } else {
                return;
            }
        }
    }

    private final void IconCompatParcelizer(char c) throws IOException, XmlPullParserException {
        int Keep2 = Keep();
        if (Keep2 != c) {
            StringBuilder sb = new StringBuilder();
            sb.append("expected: '");
            sb.append(c);
            sb.append("' actual: '");
            sb.append((char) Keep2);
            sb.append("'");
            MediaBrowserCompat$CustomActionResultReceiver(sb.toString());
        }
    }

    private final int Keep() throws IOException {
        int i;
        if (this.AlertController$RecycleListView == 0) {
            i = MediaMetadataCompat(0);
        } else {
            int[] iArr = this.MediaSessionCompat$QueueItem;
            int i2 = iArr[0];
            iArr[0] = iArr[1];
            i = i2;
        }
        this.AlertController$RecycleListView--;
        this.AppCompatActivity++;
        if (i == 10) {
            this.MediaBrowserCompat$SearchResultReceiver++;
            this.AppCompatActivity = 1;
        }
        return i;
    }

    private final int MediaMetadataCompat(int i) throws IOException {
        int i2;
        char c;
        while (i >= this.AlertController$RecycleListView) {
            char[] cArr = this.write;
            if (cArr.length <= 1) {
                i2 = this.setContentView.read();
            } else {
                int i3 = this.RatingCompat;
                if (i3 < this.MediaMetadataCompat) {
                    this.RatingCompat = i3 + 1;
                    i2 = cArr[i3];
                } else {
                    int read = this.setContentView.read(cArr, 0, cArr.length);
                    this.MediaMetadataCompat = read;
                    if (read <= 0) {
                        c = 65535;
                    } else {
                        c = this.write[0];
                    }
                    this.RatingCompat = 1;
                    i2 = c;
                }
            }
            if (i2 == 13) {
                this.PlaybackStateCompat = true;
                int[] iArr = this.MediaSessionCompat$QueueItem;
                int i4 = this.AlertController$RecycleListView;
                this.AlertController$RecycleListView = i4 + 1;
                iArr[i4] = 10;
            } else {
                if (i2 != 10) {
                    int[] iArr2 = this.MediaSessionCompat$QueueItem;
                    int i5 = this.AlertController$RecycleListView;
                    this.AlertController$RecycleListView = i5 + 1;
                    iArr2[i5] = i2;
                } else if (!this.PlaybackStateCompat) {
                    int[] iArr3 = this.MediaSessionCompat$QueueItem;
                    int i6 = this.AlertController$RecycleListView;
                    this.AlertController$RecycleListView = i6 + 1;
                    iArr3[i6] = 10;
                }
                this.PlaybackStateCompat = false;
            }
        }
        return this.MediaSessionCompat$QueueItem[i];
    }

    private final String PlaybackStateCompat() throws IOException, XmlPullParserException {
        int i = this.MediaDescriptionCompat;
        int MediaMetadataCompat2 = MediaMetadataCompat(0);
        if ((MediaMetadataCompat2 < 97 || MediaMetadataCompat2 > 122) && ((MediaMetadataCompat2 < 65 || MediaMetadataCompat2 > 90) && MediaMetadataCompat2 != 95 && MediaMetadataCompat2 != 58 && MediaMetadataCompat2 < 192 && !this.AppCompatViewInflater)) {
            MediaBrowserCompat$CustomActionResultReceiver("name expected");
        }
        while (true) {
            RatingCompat(Keep());
            int MediaMetadataCompat3 = MediaMetadataCompat(0);
            if ((MediaMetadataCompat3 < 97 || MediaMetadataCompat3 > 122) && ((MediaMetadataCompat3 < 65 || MediaMetadataCompat3 > 90) && !((MediaMetadataCompat3 >= 48 && MediaMetadataCompat3 <= 57) || MediaMetadataCompat3 == 95 || MediaMetadataCompat3 == 45 || MediaMetadataCompat3 == 58 || MediaMetadataCompat3 == 46 || MediaMetadataCompat3 >= 183))) {
                String str = new String(this.MediaBrowserCompat$MediaItem, i, this.MediaDescriptionCompat - i);
                this.MediaDescriptionCompat = i;
                return str;
            }
        }
    }

    private final void PlaybackStateCompat$CustomAction() throws IOException {
        while (true) {
            int MediaMetadataCompat2 = MediaMetadataCompat(0);
            if (MediaMetadataCompat2 <= 32 && MediaMetadataCompat2 != -1) {
                Keep();
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = r12.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r2 == -1) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r8 = r11.write;
        r9 = r11.MediaMetadataCompat;
        r11.MediaMetadataCompat = r9 + 1;
        r8[r9] = (char) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r2 != 62) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r2 = new java.lang.String(r11.write, 0, r11.MediaMetadataCompat);
        r8 = r2.indexOf("encoding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r8 == -1) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r2.charAt(r8) == '\"') goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r2.charAt(r8) == '\'') goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        r9 = r8 + 1;
        r2 = r2.substring(r9, r2.indexOf(r2.charAt(r8), r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        r1 = "UTF-32BE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a8, code lost:
        r1 = "UTF-32LE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ac, code lost:
        r8 = -65536 & r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        if (r8 != -16842752) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r11.write[0] = (char) ((r11.write[2] << 8) | r11.write[3]);
        r11.MediaMetadataCompat = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c6, code lost:
        r1 = "UTF-16BE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cb, code lost:
        if (r8 != -131072) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r11.write[0] = (char) ((r11.write[3] << 8) | r11.write[2]);
        r11.MediaMetadataCompat = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00df, code lost:
        r1 = "UTF-16LE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e7, code lost:
        if ((r1 & -256) != -272908544) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11.write[0] = r11.write[3];
        r11.MediaMetadataCompat = 1;
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f5, code lost:
        r1 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(java.io.InputStream r12) throws org.xmlpull.repackaged.p103v1.XmlPullParserException {
        /*
            r11 = this;
            r0 = 0
            r11.RatingCompat = r0
            r11.MediaMetadataCompat = r0
            if (r12 == 0) goto L_0x016c
            r1 = r0
        L_0x0008:
            int r2 = r11.MediaMetadataCompat     // Catch:{ Exception -> 0x0150 }
            r3 = 4
            r4 = -1
            if (r2 >= r3) goto L_0x0023
            int r2 = r12.read()     // Catch:{ Exception -> 0x0150 }
            if (r2 == r4) goto L_0x0023
            int r1 = r1 << 8
            r1 = r1 | r2
            char[] r3 = r11.write     // Catch:{ Exception -> 0x0150 }
            int r4 = r11.MediaMetadataCompat     // Catch:{ Exception -> 0x0150 }
            int r5 = r4 + 1
            r11.MediaMetadataCompat = r5     // Catch:{ Exception -> 0x0150 }
            char r2 = (char) r2     // Catch:{ Exception -> 0x0150 }
            r3[r4] = r2     // Catch:{ Exception -> 0x0150 }
            goto L_0x0008
        L_0x0023:
            int r2 = r11.MediaMetadataCompat     // Catch:{ Exception -> 0x0150 }
            java.lang.String r5 = "UTF-8"
            r6 = 0
            r7 = 1
            if (r2 != r3) goto L_0x00f7
            r2 = 63
            r3 = 2
            r8 = 60
            switch(r1) {
                case -131072: goto L_0x00a6;
                case 60: goto L_0x009d;
                case 65279: goto L_0x009a;
                case 3932223: goto L_0x008f;
                case 1006632960: goto L_0x0088;
                case 1006649088: goto L_0x007d;
                case 1010792557: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x00ab
        L_0x0035:
            int r2 = r12.read()     // Catch:{ Exception -> 0x0150 }
            if (r2 == r4) goto L_0x00ab
            char[] r8 = r11.write     // Catch:{ Exception -> 0x0150 }
            int r9 = r11.MediaMetadataCompat     // Catch:{ Exception -> 0x0150 }
            int r10 = r9 + 1
            r11.MediaMetadataCompat = r10     // Catch:{ Exception -> 0x0150 }
            char r10 = (char) r2     // Catch:{ Exception -> 0x0150 }
            r8[r9] = r10     // Catch:{ Exception -> 0x0150 }
            r8 = 62
            if (r2 != r8) goto L_0x0035
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0150 }
            char[] r8 = r11.write     // Catch:{ Exception -> 0x0150 }
            int r9 = r11.MediaMetadataCompat     // Catch:{ Exception -> 0x0150 }
            r2.<init>(r8, r0, r9)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r8 = "encoding"
            int r8 = r2.indexOf(r8)     // Catch:{ Exception -> 0x0150 }
            if (r8 == r4) goto L_0x00ab
        L_0x005b:
            char r9 = r2.charAt(r8)     // Catch:{ Exception -> 0x0150 }
            r10 = 34
            if (r9 == r10) goto L_0x006e
            char r9 = r2.charAt(r8)     // Catch:{ Exception -> 0x0150 }
            r10 = 39
            if (r9 == r10) goto L_0x006e
            int r8 = r8 + 1
            goto L_0x005b
        L_0x006e:
            int r9 = r8 + 1
            char r8 = r2.charAt(r8)     // Catch:{ Exception -> 0x0150 }
            int r8 = r2.indexOf(r8, r9)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r2 = r2.substring(r9, r8)     // Catch:{ Exception -> 0x0150 }
            goto L_0x00ac
        L_0x007d:
            char[] r1 = r11.write     // Catch:{ Exception -> 0x0150 }
            r1[r0] = r8     // Catch:{ Exception -> 0x0150 }
            char[] r1 = r11.write     // Catch:{ Exception -> 0x0150 }
            r1[r7] = r2     // Catch:{ Exception -> 0x0150 }
            r11.MediaMetadataCompat = r3     // Catch:{ Exception -> 0x0150 }
            goto L_0x00df
        L_0x0088:
            char[] r1 = r11.write     // Catch:{ Exception -> 0x0150 }
            r1[r0] = r8     // Catch:{ Exception -> 0x0150 }
            r11.MediaMetadataCompat = r7     // Catch:{ Exception -> 0x0150 }
            goto L_0x00a8
        L_0x008f:
            char[] r1 = r11.write     // Catch:{ Exception -> 0x0150 }
            r1[r0] = r8     // Catch:{ Exception -> 0x0150 }
            char[] r1 = r11.write     // Catch:{ Exception -> 0x0150 }
            r1[r7] = r2     // Catch:{ Exception -> 0x0150 }
            r11.MediaMetadataCompat = r3     // Catch:{ Exception -> 0x0150 }
            goto L_0x00c6
        L_0x009a:
            r11.MediaMetadataCompat = r0     // Catch:{ Exception -> 0x0150 }
            goto L_0x00a3
        L_0x009d:
            char[] r1 = r11.write     // Catch:{ Exception -> 0x0150 }
            r1[r0] = r8     // Catch:{ Exception -> 0x0150 }
            r11.MediaMetadataCompat = r7     // Catch:{ Exception -> 0x0150 }
        L_0x00a3:
            java.lang.String r1 = "UTF-32BE"
            goto L_0x00f8
        L_0x00a6:
            r11.MediaMetadataCompat = r0     // Catch:{ Exception -> 0x0150 }
        L_0x00a8:
            java.lang.String r1 = "UTF-32LE"
            goto L_0x00f8
        L_0x00ab:
            r2 = r6
        L_0x00ac:
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r1
            r9 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            r10 = 3
            if (r8 != r9) goto L_0x00c9
            char[] r1 = r11.write     // Catch:{ Exception -> 0x0150 }
            char[] r2 = r11.write     // Catch:{ Exception -> 0x0150 }
            char r2 = r2[r3]     // Catch:{ Exception -> 0x0150 }
            int r2 = r2 << 8
            char[] r3 = r11.write     // Catch:{ Exception -> 0x0150 }
            char r3 = r3[r10]     // Catch:{ Exception -> 0x0150 }
            r2 = r2 | r3
            char r2 = (char) r2     // Catch:{ Exception -> 0x0150 }
            r1[r0] = r2     // Catch:{ Exception -> 0x0150 }
            r11.MediaMetadataCompat = r7     // Catch:{ Exception -> 0x0150 }
        L_0x00c6:
            java.lang.String r1 = "UTF-16BE"
            goto L_0x00f8
        L_0x00c9:
            r9 = -131072(0xfffffffffffe0000, float:NaN)
            if (r8 != r9) goto L_0x00e2
            char[] r1 = r11.write     // Catch:{ Exception -> 0x0150 }
            char[] r2 = r11.write     // Catch:{ Exception -> 0x0150 }
            char r2 = r2[r10]     // Catch:{ Exception -> 0x0150 }
            int r2 = r2 << 8
            char[] r8 = r11.write     // Catch:{ Exception -> 0x0150 }
            char r3 = r8[r3]     // Catch:{ Exception -> 0x0150 }
            r2 = r2 | r3
            char r2 = (char) r2     // Catch:{ Exception -> 0x0150 }
            r1[r0] = r2     // Catch:{ Exception -> 0x0150 }
            r11.MediaMetadataCompat = r7     // Catch:{ Exception -> 0x0150 }
        L_0x00df:
            java.lang.String r1 = "UTF-16LE"
            goto L_0x00f8
        L_0x00e2:
            r1 = r1 & -256(0xffffffffffffff00, float:NaN)
            r3 = -272908544(0xffffffffefbbbf00, float:-1.162092E29)
            if (r1 != r3) goto L_0x00f5
            char[] r1 = r11.write     // Catch:{ Exception -> 0x0150 }
            char[] r2 = r11.write     // Catch:{ Exception -> 0x0150 }
            char r2 = r2[r10]     // Catch:{ Exception -> 0x0150 }
            r1[r0] = r2     // Catch:{ Exception -> 0x0150 }
            r11.MediaMetadataCompat = r7     // Catch:{ Exception -> 0x0150 }
            r1 = r5
            goto L_0x00f8
        L_0x00f5:
            r1 = r2
            goto L_0x00f8
        L_0x00f7:
            r1 = r6
        L_0x00f8:
            if (r1 != 0) goto L_0x00fb
            goto L_0x00fc
        L_0x00fb:
            r5 = r1
        L_0x00fc:
            int r1 = r11.MediaMetadataCompat     // Catch:{ Exception -> 0x0150 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0150 }
            r2.<init>(r12, r5)     // Catch:{ Exception -> 0x0150 }
            r11.setContentView = r2     // Catch:{ Exception -> 0x0150 }
            r11.MediaBrowserCompat$SearchResultReceiver = r7     // Catch:{ Exception -> 0x0150 }
            r11.AppCompatActivity = r0     // Catch:{ Exception -> 0x0150 }
            r11.setExpandedFormat = r0     // Catch:{ Exception -> 0x0150 }
            r11.setChecked = r6     // Catch:{ Exception -> 0x0150 }
            r11.setCheckable = r6     // Catch:{ Exception -> 0x0150 }
            r11.ParcelableVolumeInfo = r0     // Catch:{ Exception -> 0x0150 }
            r11.MediaSessionCompat$Token = r4     // Catch:{ Exception -> 0x0150 }
            r11.RatingCompat = r0     // Catch:{ Exception -> 0x0150 }
            r11.MediaMetadataCompat = r0     // Catch:{ Exception -> 0x0150 }
            r11.AlertController$RecycleListView = r0     // Catch:{ Exception -> 0x0150 }
            r11.MediaBrowserCompat$CustomActionResultReceiver = r0     // Catch:{ Exception -> 0x0150 }
            java.util.Hashtable r12 = new java.util.Hashtable     // Catch:{ Exception -> 0x0150 }
            r12.<init>()     // Catch:{ Exception -> 0x0150 }
            r11.IconCompatParcelizer = r12     // Catch:{ Exception -> 0x0150 }
            java.lang.String r0 = "amp"
            java.lang.String r2 = "&"
            r12.put(r0, r2)     // Catch:{ Exception -> 0x0150 }
            java.util.Hashtable r12 = r11.IconCompatParcelizer     // Catch:{ Exception -> 0x0150 }
            java.lang.String r0 = "apos"
            java.lang.String r2 = "'"
            r12.put(r0, r2)     // Catch:{ Exception -> 0x0150 }
            java.util.Hashtable r12 = r11.IconCompatParcelizer     // Catch:{ Exception -> 0x0150 }
            java.lang.String r0 = "gt"
            java.lang.String r2 = ">"
            r12.put(r0, r2)     // Catch:{ Exception -> 0x0150 }
            java.util.Hashtable r12 = r11.IconCompatParcelizer     // Catch:{ Exception -> 0x0150 }
            java.lang.String r0 = "lt"
            java.lang.String r2 = "<"
            r12.put(r0, r2)     // Catch:{ Exception -> 0x0150 }
            java.util.Hashtable r12 = r11.IconCompatParcelizer     // Catch:{ Exception -> 0x0150 }
            java.lang.String r0 = "quot"
            java.lang.String r2 = "\""
            r12.put(r0, r2)     // Catch:{ Exception -> 0x0150 }
            r11.MediaMetadataCompat = r1     // Catch:{ Exception -> 0x0150 }
            return
        L_0x0150:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid stream or encoding: "
            r0.append(r1)
            java.lang.String r1 = r12.toString()
            r0.append(r1)
            org.xmlpull.repackaged.v1.XmlPullParserException r1 = new org.xmlpull.repackaged.v1.XmlPullParserException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0, r11, r12)
            throw r1
        L_0x016c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ETBSelectionAdapter$OneButtonHolder_ViewBinding.read(java.io.InputStream):void");
    }

    public final int MediaBrowserCompat$ItemReceiver(int i) {
        if (i <= this.MediaBrowserCompat$CustomActionResultReceiver) {
            return this.AppCompatDialogFragment[i];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String IconCompatParcelizer(int i) {
        return this.setBackgroundResource[i << 1];
    }

    public final String MediaDescriptionCompat(int i) {
        return this.setBackgroundResource[(i << 1) + 1];
    }

    public final String IconCompatParcelizer(String str) {
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i <= i) {
            for (int i2 = (this.AppCompatDialogFragment[i] << 1) - 2; i2 >= 0; i2 -= 2) {
                if (str == null) {
                    String[] strArr = this.setBackgroundResource;
                    if (strArr[i2] == null) {
                        return strArr[i2 + 1];
                    }
                } else if (str.equals(this.setBackgroundResource[i2])) {
                    return this.setBackgroundResource[i2 + 1];
                }
            }
            return null;
        }
        throw new IndexOutOfBoundsException();
    }

    public final int read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String MediaBrowserCompat$SearchResultReceiver() {
        StringBuffer stringBuffer = new StringBuffer(this.setExpandedFormat < read.length ? read[this.setExpandedFormat] : "unknown");
        stringBuffer.append(' ');
        int i = this.setExpandedFormat;
        if (i == 2 || i == 3) {
            if (this.ParcelableVolumeInfo) {
                stringBuffer.append("(empty) ");
            }
            stringBuffer.append('<');
            if (this.setExpandedFormat == 3) {
                stringBuffer.append('/');
            }
            if (this.ActionMenuItemView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("{");
                sb.append(this.setCheckable);
                sb.append("}");
                sb.append(this.ActionMenuItemView);
                sb.append(":");
                stringBuffer.append(sb.toString());
            }
            stringBuffer.append(this.setChecked);
            int i2 = this.MediaSessionCompat$Token;
            for (int i3 = 0; i3 < (i2 << 2); i3 += 4) {
                stringBuffer.append(' ');
                int i4 = i3 + 1;
                if (this.MediaSessionCompat$ResultReceiverWrapper[i4] != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("{");
                    sb2.append(this.MediaSessionCompat$ResultReceiverWrapper[i3]);
                    sb2.append("}");
                    sb2.append(this.MediaSessionCompat$ResultReceiverWrapper[i4]);
                    sb2.append(":");
                    stringBuffer.append(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.MediaSessionCompat$ResultReceiverWrapper[i3 + 2]);
                sb3.append("='");
                sb3.append(this.MediaSessionCompat$ResultReceiverWrapper[i3 + 3]);
                sb3.append("'");
                stringBuffer.append(sb3.toString());
            }
            stringBuffer.append('>');
        } else if (i != 7) {
            if (i != 4) {
                stringBuffer.append(RatingCompat());
            } else if (this.f5810x50fd9e4a) {
                stringBuffer.append("(whitespace)");
            } else {
                String RatingCompat2 = RatingCompat();
                if (RatingCompat2.length() > 16) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(RatingCompat2.substring(0, 16));
                    sb4.append("...");
                    RatingCompat2 = sb4.toString();
                }
                stringBuffer.append(RatingCompat2);
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("@");
        sb5.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb5.append(":");
        sb5.append(this.AppCompatActivity);
        stringBuffer.append(sb5.toString());
        if (this.setContentView != null) {
            stringBuffer.append(" in ");
            stringBuffer.append(this.setContentView.toString());
        }
        return stringBuffer.toString();
    }

    public final int MediaMetadataCompat() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.AppCompatActivity;
    }

    public final String RatingCompat() {
        int i = this.setExpandedFormat;
        if (i < 4 || (i == 6 && this.setHasDecor)) {
            return null;
        }
        return new String(this.MediaBrowserCompat$MediaItem, 0, this.MediaDescriptionCompat);
    }

    public final String MediaBrowserCompat$MediaItem() {
        return this.setCheckable;
    }

    public final String MediaDescriptionCompat() {
        return this.setChecked;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo60423x50fd9e4a() throws XmlPullParserException {
        if (this.setExpandedFormat != 2) {
            read("Wrong event type");
        }
        return this.ParcelableVolumeInfo;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaSessionCompat$Token;
    }

    public final String write(int i) {
        if (i < this.MediaSessionCompat$Token) {
            return this.MediaSessionCompat$ResultReceiverWrapper[i << 2];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String read(int i) {
        if (i < this.MediaSessionCompat$Token) {
            return this.MediaSessionCompat$ResultReceiverWrapper[(i << 2) + 2];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i < this.MediaSessionCompat$Token) {
            return this.MediaSessionCompat$ResultReceiverWrapper[(i << 2) + 3];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String MediaBrowserCompat$ItemReceiver(String str, String str2) {
        for (int i = (this.MediaSessionCompat$Token << 2) - 4; i >= 0; i -= 4) {
            if (this.MediaSessionCompat$ResultReceiverWrapper[i + 2].equals(str2) && (str == null || this.MediaSessionCompat$ResultReceiverWrapper[i].equals(str))) {
                return this.MediaSessionCompat$ResultReceiverWrapper[i + 3];
            }
        }
        return null;
    }

    public final int write() throws XmlPullParserException {
        return this.setExpandedFormat;
    }

    public final int ParcelableVolumeInfo() throws XmlPullParserException, IOException {
        this.MediaDescriptionCompat = 0;
        this.f5810x50fd9e4a = true;
        this.PlaybackStateCompat$CustomAction = false;
        int i = RegistrationManageDeviceAdapter$DeviceItemViewHolder.MAX_VALUE_OF_ERA;
        while (true) {
            AppCompatDelegateImpl$ListMenuDecorView();
            int i2 = this.setExpandedFormat;
            if (i2 < i) {
                i = i2;
            }
            if (i > 6 || (i >= 4 && AlertController$RecycleListView() >= 4)) {
            }
        }
        this.setExpandedFormat = i;
        if (i > 4) {
            this.setExpandedFormat = 4;
        }
        return this.setExpandedFormat;
    }

    public final int MediaSessionCompat$Token() throws XmlPullParserException, IOException {
        this.f5810x50fd9e4a = true;
        this.MediaDescriptionCompat = 0;
        this.PlaybackStateCompat$CustomAction = true;
        AppCompatDelegateImpl$ListMenuDecorView();
        return this.setExpandedFormat;
    }

    public final int MediaSessionCompat$QueueItem() throws XmlPullParserException, IOException {
        ParcelableVolumeInfo();
        if (this.setExpandedFormat == 4 && this.f5810x50fd9e4a) {
            ParcelableVolumeInfo();
        }
        int i = this.setExpandedFormat;
        if (!(i == 3 || i == 2)) {
            read("unexpected type");
        }
        return this.setExpandedFormat;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, String str, String str2) throws XmlPullParserException, IOException {
        if (i != this.setExpandedFormat || ((str != null && !str.equals(this.setCheckable)) || (str2 != null && !str2.equals(this.setChecked)))) {
            StringBuilder sb = new StringBuilder();
            sb.append("expected: ");
            sb.append(read[i]);
            sb.append(" {");
            sb.append(str);
            sb.append("}");
            sb.append(str2);
            read(sb.toString());
        }
    }

    public final String MediaSessionCompat$ResultReceiverWrapper() throws XmlPullParserException, IOException {
        String str;
        if (this.setExpandedFormat != 2) {
            read("precondition: START_TAG");
        }
        ParcelableVolumeInfo();
        if (this.setExpandedFormat == 4) {
            str = RatingCompat();
            ParcelableVolumeInfo();
        } else {
            str = "";
        }
        if (this.setExpandedFormat != 3) {
            read("END_TAG expected");
        }
        return str;
    }

    public final void write(String str) throws XmlPullParserException {
        boolean z;
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            this.Keep = true;
            return;
        }
        if (!str.startsWith("http://xmlpull.org/v1/doc/")) {
            z = false;
        } else {
            z = str.substring(40).equals("relaxed");
        }
        if (z) {
            this.AppCompatViewInflater = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unsupported feature: ");
        sb.append(str);
        read(sb.toString());
    }
}
