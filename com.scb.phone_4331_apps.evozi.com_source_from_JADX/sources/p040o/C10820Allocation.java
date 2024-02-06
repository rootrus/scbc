package p040o;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.Allocation  reason: case insensitive filesystem */
public abstract class C10820Allocation {
    public boolean MediaBrowserCompat$CustomActionResultReceiver = true;

    public abstract long MediaBrowserCompat$ItemReceiver() throws IOException;

    public abstract byte[] MediaBrowserCompat$ItemReceiver(int i, int i2) throws IOException;

    public abstract byte read(int i) throws IOException;

    /* access modifiers changed from: protected */
    public abstract boolean read(int i, int i2) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void write(int i, int i2) throws IOException;

    /* renamed from: o.Allocation$MipmapControl */
    public final class MipmapControl extends createCubemapFromCubeFaces<C11351> {
        public MipmapControl(C11351 r1) {
            super(r1);
        }

        public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
            if (i == 1) {
                return IconCompatParcelizer(1, 2);
            }
            if (i == 2) {
                int[] MediaBrowserCompat$ItemReceiver = ((C11351) this.write).MediaBrowserCompat$ItemReceiver(2);
                if (MediaBrowserCompat$ItemReceiver == null) {
                    return null;
                }
                if (MediaBrowserCompat$ItemReceiver[0] != 0 || MediaBrowserCompat$ItemReceiver[1] == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown (");
                    sb.append(((C11351) this.write).MediaBrowserCompat$SearchResultReceiver(2));
                    sb.append(")");
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ISO ");
                sb2.append(MediaBrowserCompat$ItemReceiver[1]);
                return sb2.toString();
            } else if (i == 13) {
                return MediaDescriptionCompat(13);
            } else {
                if (i == 14) {
                    return MediaDescriptionCompat(14);
                }
                if (i == 18) {
                    return MediaDescriptionCompat(18);
                }
                if (i == 28) {
                    return MediaDescriptionCompat(28);
                }
                if (i == 30) {
                    return write(30, 1, "sRGB", "Adobe RGB");
                }
                if (i == 34) {
                    Integer MediaBrowserCompat$CustomActionResultReceiver = ((C11351) this.write).MediaBrowserCompat$CustomActionResultReceiver(34);
                    if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                        return null;
                    }
                    int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
                    if (intValue == 0) {
                        return "Off";
                    }
                    if (intValue == 1) {
                        return "Light";
                    }
                    if (intValue == 3) {
                        return "Normal";
                    }
                    if (intValue == 5) {
                        return "High";
                    }
                    if (intValue == 7) {
                        return "Extra High";
                    }
                    if (intValue == 65535) {
                        return "Auto";
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unknown (");
                    sb3.append(MediaBrowserCompat$CustomActionResultReceiver);
                    sb3.append(")");
                    return sb3.toString();
                } else if (i == 42) {
                    Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((C11351) this.write).MediaBrowserCompat$CustomActionResultReceiver(42);
                    if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                        return null;
                    }
                    int intValue2 = MediaBrowserCompat$CustomActionResultReceiver2.intValue();
                    if (intValue2 == 0) {
                        return "Off";
                    }
                    if (intValue2 == 1) {
                        return "Low";
                    }
                    if (intValue2 == 3) {
                        return "Normal";
                    }
                    if (intValue2 == 5) {
                        return "High";
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Unknown (");
                    sb4.append(MediaBrowserCompat$CustomActionResultReceiver2);
                    sb4.append(")");
                    return sb4.toString();
                } else if (i == 139) {
                    return MediaDescriptionCompat(CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);
                } else {
                    if (i == 141) {
                        String MediaBrowserCompat$SearchResultReceiver = ((C11351) this.write).MediaBrowserCompat$SearchResultReceiver(141);
                        if (MediaBrowserCompat$SearchResultReceiver == null) {
                            return null;
                        }
                        return MediaBrowserCompat$SearchResultReceiver.startsWith("MODE1") ? "Mode I (sRGB)" : MediaBrowserCompat$SearchResultReceiver;
                    } else if (i == 177) {
                        return MediaBrowserCompat$CustomActionResultReceiver(CipherSuite.TLS_PSK_WITH_NULL_SHA384, "Off", "Minimal", "Low", null, "Normal", null, "High");
                    } else {
                        if (i == 182) {
                            return read();
                        }
                        if (i == 23) {
                            return MediaDescriptionCompat(23);
                        }
                        if (i == 24) {
                            return MediaDescriptionCompat(24);
                        }
                        if (i == 131) {
                            return write(131, new String[]{"AF", "MF"}, "D", "G", "VR");
                        } else if (i == 132) {
                            return write(132);
                        } else {
                            if (i == 146) {
                                return write("%s degrees");
                            }
                            if (i == 147) {
                                return write(CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 1, "Lossy (Type 1)", null, "Uncompressed", null, null, null, "Lossless", "Lossy (Type 2)");
                            }
                            switch (i) {
                                case 134:
                                    copy3DRangeFromUnchecked RatingCompat = ((C11351) this.write).RatingCompat(134);
                                    if (RatingCompat == null) {
                                        return null;
                                    }
                                    if (RatingCompat.intValue() == 1) {
                                        return "No digital zoom";
                                    }
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(RatingCompat.IconCompatParcelizer(true));
                                    sb5.append("x digital zoom");
                                    return sb5.toString();
                                case 135:
                                    return MediaBrowserCompat$CustomActionResultReceiver(135, "Flash Not Used", "Manual Flash", null, "Flash Not Ready", null, null, null, "External Flash", "Fired, Commander Mode", "Fired, TTL Mode");
                                case 136:
                                    int[] MediaBrowserCompat$ItemReceiver2 = ((C11351) this.write).MediaBrowserCompat$ItemReceiver(136);
                                    if (MediaBrowserCompat$ItemReceiver2 == null) {
                                        return null;
                                    }
                                    if (MediaBrowserCompat$ItemReceiver2.length == 4 && MediaBrowserCompat$ItemReceiver2[0] == 0 && MediaBrowserCompat$ItemReceiver2[2] == 0 && MediaBrowserCompat$ItemReceiver2[3] == 0) {
                                        int i2 = MediaBrowserCompat$ItemReceiver2[1];
                                        if (i2 == 0) {
                                            return "Centre";
                                        }
                                        if (i2 == 1) {
                                            return "Top";
                                        }
                                        if (i2 == 2) {
                                            return "Bottom";
                                        }
                                        if (i2 == 3) {
                                            return "Left";
                                        }
                                        if (i2 == 4) {
                                            return "Right";
                                        }
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append("Unknown (");
                                        sb6.append(MediaBrowserCompat$ItemReceiver2[1]);
                                        sb6.append(")");
                                        return sb6.toString();
                                    }
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append("Unknown (");
                                    sb7.append(((C11351) this.write).MediaBrowserCompat$SearchResultReceiver(136));
                                    sb7.append(")");
                                    return sb7.toString();
                                case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /*137*/:
                                    return write(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, new String[]{"Single Frame", "Continuous"}, "Delay", null, "PC Control", "Exposure Bracketing", "Auto ISO", "White-Balance Bracketing", "IR Control");
                                default:
                                    return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                            }
                        }
                    }
                }
            }
        }

        private String MediaDescriptionCompat(int i) {
            int[] MediaBrowserCompat$ItemReceiver = ((C11351) this.write).MediaBrowserCompat$ItemReceiver(i);
            if (MediaBrowserCompat$ItemReceiver == null || MediaBrowserCompat$ItemReceiver.length < 2 || MediaBrowserCompat$ItemReceiver.length < 3 || MediaBrowserCompat$ItemReceiver[2] == 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(new DecimalFormat("0.##").format(((double) (MediaBrowserCompat$ItemReceiver[0] * MediaBrowserCompat$ItemReceiver[1])) / ((double) MediaBrowserCompat$ItemReceiver[2])));
            sb.append(" EV");
            return sb.toString();
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(int i) throws IOException {
        int i2 = i / 8;
        write(i2, 1);
        if (((read(i2) >> (i % 8)) & 1) != 1) {
            return false;
        }
        return true;
    }

    public final short MediaSessionCompat$QueueItem(int i) throws IOException {
        write(i, 1);
        return (short) (read(i) & 255);
    }

    public final byte RatingCompat(int i) throws IOException {
        write(i, 1);
        return read(i);
    }

    public final int MediaSessionCompat$ResultReceiverWrapper(int i) throws IOException {
        byte b;
        byte b2;
        write(i, 2);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            b2 = (read(i) << 8) & 65280;
            b = read(i + 1);
        } else {
            b2 = (read(i + 1) << 8) & 65280;
            b = read(i);
        }
        return (b & 255) | b2;
    }

    public final short IconCompatParcelizer(int i) throws IOException {
        byte b;
        short s;
        write(i, 2);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            s = (((short) read(i)) << 8) & -256;
            b = read(i + 1);
        } else {
            s = (((short) read(i + 1)) << 8) & -256;
            b = read(i);
        }
        return (short) ((((short) b) & 255) | s);
    }

    public final int MediaBrowserCompat$SearchResultReceiver(int i) throws IOException {
        byte b;
        byte b2;
        write(i, 3);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            b2 = ((read(i) << 16) & 16711680) | (65280 & (read(i + 1) << 8));
            b = read(i + 2);
        } else {
            b2 = ((read(i + 2) << 16) & 16711680) | (65280 & (read(i + 1) << 8));
            b = read(i);
        }
        return (b & 255) | b2;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final long mo15721x50fd9e4a(int i) throws IOException {
        long j;
        byte b;
        int i2 = i;
        write(i2, 4);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            long read = (long) read(i);
            long j2 = (read << 24) & 4278190080L;
            j = j2 | ((((long) read(i2 + 1)) << 16) & 16711680) | ((((long) read(i2 + 2)) << 8) & 65280);
            b = read(i2 + 3);
        } else {
            long read2 = (long) read(i2 + 3);
            long j3 = (read2 << 24) & 4278190080L;
            j = j3 | ((((long) read(i2 + 2)) << 16) & 16711680) | ((((long) read(i2 + 1)) << 8) & 65280);
            b = read(i);
        }
        return (((long) b) & 255) | j;
    }

    public final int MediaBrowserCompat$MediaItem(int i) throws IOException {
        byte b;
        byte b2;
        write(i, 4);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            b2 = ((read(i) << Ascii.CAN) & -16777216) | (16711680 & (read(i + 1) << 16)) | (65280 & (read(i + 2) << 8));
            b = read(i + 3);
        } else {
            b2 = ((read(i + 3) << Ascii.CAN) & -16777216) | (16711680 & (read(i + 2) << 16)) | (65280 & (read(i + 1) << 8));
            b = read(i);
        }
        return (b & 255) | b2;
    }

    public final long MediaDescriptionCompat(int i) throws IOException {
        long j;
        byte b;
        int i2 = i;
        write(i2, 8);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            j = ((((long) read(i)) << 56) & -72057594037927936L) | ((((long) read(i2 + 1)) << 48) & 71776119061217280L) | ((((long) read(i2 + 2)) << 40) & 280375465082880L) | ((((long) read(i2 + 3)) << 32) & 1095216660480L) | ((((long) read(i2 + 4)) << 24) & 4278190080L) | ((((long) read(i2 + 5)) << 16) & 16711680) | ((((long) read(i2 + 6)) << 8) & 65280);
            b = read(i2 + 7);
        } else {
            j = ((((long) read(i2 + 7)) << 56) & -72057594037927936L) | ((((long) read(i2 + 6)) << 48) & 71776119061217280L) | ((((long) read(i2 + 5)) << 40) & 280375465082880L) | ((((long) read(i2 + 4)) << 32) & 1095216660480L) | ((((long) read(i2 + 3)) << 24) & 4278190080L) | ((((long) read(i2 + 2)) << 16) & 16711680) | ((((long) read(i2 + 1)) << 8) & 65280);
            b = read(i);
        }
        return j | (((long) b) & 255);
    }

    public final float MediaMetadataCompat(int i) throws IOException {
        byte b;
        int i2;
        float f;
        write(i, 4);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            f = (float) (((read(i) & 255) << 8) | (read(i + 1) & 255));
            i2 = (read(i + 2) & 255) << 8;
            b = read(i + 3);
        } else {
            f = (float) (((read(i + 3) & 255) << 8) | (read(i + 2) & 255));
            i2 = (read(i + 1) & 255) << 8;
            b = read(i);
        }
        return (float) (((double) f) + (((double) ((b & 255) | i2)) / 65536.0d));
    }

    public final float MediaBrowserCompat$ItemReceiver(int i) throws IOException {
        return Float.intBitsToFloat(MediaBrowserCompat$MediaItem(i));
    }

    public final double write(int i) throws IOException {
        return Double.longBitsToDouble(MediaDescriptionCompat(i));
    }

    public final String MediaBrowserCompat$ItemReceiver(int i, int i2, String str) throws IOException {
        byte[] MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(i, i2);
        try {
            return new String(MediaBrowserCompat$ItemReceiver, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(MediaBrowserCompat$ItemReceiver);
        }
    }

    public final byte[] MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) throws IOException {
        byte[] MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(i, i2);
        int i3 = 0;
        while (i3 < MediaBrowserCompat$ItemReceiver.length && MediaBrowserCompat$ItemReceiver[i3] != 0) {
            i3++;
        }
        if (i3 == i2) {
            return MediaBrowserCompat$ItemReceiver;
        }
        byte[] bArr = new byte[i3];
        if (i3 > 0) {
            System.arraycopy(MediaBrowserCompat$ItemReceiver, 0, bArr, 0, i3);
        }
        return bArr;
    }
}
