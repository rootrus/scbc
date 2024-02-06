package okhttp3.internal.http2;

import com.google.android.gms.location.places.Place;
import com.google.common.base.Ascii;
import java.util.Arrays;
import okhttp3.internal.Util;
import org.bouncycastle.asn1.eac.EACTags;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

public final class Huffman {
    private static final int[] CODES = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, Place.TYPE_POSTAL_CODE_PREFIX, Place.TYPE_POSTAL_TOWN, 4090, 8185, 21, 248, 2042, Place.TYPE_PREMISE, Place.TYPE_ROOM, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, Place.TYPE_ROUTE, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, EACTags.SECURITY_ENVIRONMENT_TEMPLATE, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final byte[] CODE_BIT_COUNTS = {13, Ascii.ETB, 28, 28, 28, 28, 28, 28, 28, Ascii.CAN, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, Ascii.DC4, Ascii.SYN, Ascii.DC4, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.CAN, Ascii.CAN, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.SYN, Ascii.NAK, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.CAN, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SUB, Ascii.SUB, Ascii.DC4, 19, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.f3248EM, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.CAN, Ascii.f3248EM, 19, Ascii.NAK, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.ESC, Ascii.CAN, Ascii.NAK, Ascii.NAK, Ascii.SUB, Ascii.SUB, 28, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.DC4, Ascii.CAN, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.f3248EM, Ascii.f3248EM, Ascii.CAN, Ascii.CAN, Ascii.SUB, Ascii.ETB, Ascii.SUB, Ascii.ESC, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, 28, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.SUB};
    public static final Huffman INSTANCE;
    private static final Node root = new Node();

    static {
        Huffman huffman = new Huffman();
        INSTANCE = huffman;
        int length = CODE_BIT_COUNTS.length;
        for (int i = 0; i < length; i++) {
            huffman.addCode(i, CODES[i], CODE_BIT_COUNTS[i]);
        }
    }

    private Huffman() {
    }

    public final void decode(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, long j, NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) {
        onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
        onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "sink");
        Node node = root;
        int i = 0;
        int i2 = 0;
        for (long j2 = 0; j2 < j; j2++) {
            i2 = (i2 << 8) | Util.and(nsipPartnerPaymentOtpActivity.MediaBrowserCompat$SearchResultReceiver(), 255);
            i += 8;
            while (i >= 8) {
                int i3 = i - 8;
                Node[] children = node.getChildren();
                if (children == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                node = children[(i2 >>> i3) & 255];
                if (node == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                if (node.getChildren() == null) {
                    nsipPartnerPaymentReviewActivity.MediaBrowserCompat$ItemReceiver(node.getSymbol());
                    i -= node.getTerminalBitCount();
                    node = root;
                } else {
                    i = i3;
                }
            }
        }
        while (i > 0) {
            Node[] children2 = node.getChildren();
            if (children2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            Node node2 = children2[(i2 << (8 - i)) & 255];
            if (node2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (node2.getChildren() == null && node2.getTerminalBitCount() <= i) {
                nsipPartnerPaymentReviewActivity.MediaBrowserCompat$ItemReceiver(node2.getSymbol());
                i -= node2.getTerminalBitCount();
                node = root;
            } else {
                return;
            }
        }
    }

    private final void addCode(int i, int i2, int i3) {
        Node node = new Node(i, i3);
        Node node2 = root;
        while (i3 > 8) {
            i3 -= 8;
            int i4 = (i2 >>> i3) & 255;
            Node[] children = node2.getChildren();
            if (children == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            Node node3 = children[i4];
            if (node3 == null) {
                node3 = new Node();
                children[i4] = node3;
            }
            node2 = node3;
        }
        int i5 = 8 - i3;
        int i6 = (i2 << i5) & 255;
        Node[] children2 = node2.getChildren();
        if (children2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        onGetStartedClick.write((Object) children2, "$this$fill");
        Arrays.fill(children2, i6, (1 << i5) + i6, node);
    }

    static final class Node {
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public final Node[] getChildren() {
            return this.children;
        }

        public final int getSymbol() {
            return this.symbol;
        }

        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }

        public Node() {
            this.children = new Node[256];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        public Node(int i, int i2) {
            this.children = null;
            this.symbol = i;
            int i3 = i2 & 7;
            this.terminalBitCount = i3 == 0 ? 8 : i3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void encode(p040o.SCBUniversalWebViewActivity_ViewBinding r10, p040o.NsipPartnerPaymentReviewActivity r11) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.lang.String r0 = "sink"
            p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r0)
            int r0 = r10.write()
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = r1
        L_0x0013:
            r5 = 8
            if (r1 >= r0) goto L_0x003b
            byte r6 = r10.IconCompatParcelizer((int) r1)
            r7 = 255(0xff, float:3.57E-43)
            int r6 = okhttp3.internal.Util.and((byte) r6, (int) r7)
            int[] r7 = CODES
            r7 = r7[r6]
            byte[] r8 = CODE_BIT_COUNTS
            byte r6 = r8[r6]
            long r3 = r3 << r6
            long r7 = (long) r7
            long r3 = r3 | r7
            int r2 = r2 + r6
        L_0x002d:
            if (r2 < r5) goto L_0x0038
            int r2 = r2 + -8
            long r6 = r3 >> r2
            int r6 = (int) r6
            r11.MediaBrowserCompat$ItemReceiver(r6)
            goto L_0x002d
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0013
        L_0x003b:
            if (r2 <= 0) goto L_0x0049
            int r5 = r5 - r2
            long r0 = r3 << r5
            r3 = 255(0xff, double:1.26E-321)
            long r2 = r3 >>> r2
            long r0 = r0 | r2
            int r10 = (int) r0
            r11.MediaBrowserCompat$ItemReceiver(r10)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Huffman.encode(o.SCBUniversalWebViewActivity_ViewBinding, o.NsipPartnerPaymentReviewActivity):void");
    }

    public final int encodedLength(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
        int write = sCBUniversalWebViewActivity_ViewBinding.write();
        long j = 0;
        for (int i = 0; i < write; i++) {
            j += (long) CODE_BIT_COUNTS[Util.and(sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(i), 255)];
        }
        return (int) ((j + 7) >> 3);
    }
}
