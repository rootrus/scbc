package okhttp3.repackaged.internal.framed;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import p039io.beid.beidk.definitions.LivenessStatus;
import p039io.beid.beidk.definitions.SCBHeader;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickBalanceActivity;
import p040o.ModifyQuickTopUpActivity;
import p040o.PinLoginActivity;
import p040o.PinLoginActivity_ViewBinding;
import p040o.onMenuPromptPayClick;

/* renamed from: okhttp3.repackaged.internal.framed.a */
final class C10257a {
    /* access modifiers changed from: private */
    public static final Map<PinLoginActivity_ViewBinding, Integer> NAME_TO_FIRST_INDEX = m6080uD();
    private static final int ako = 15;
    private static final int akp = 31;
    private static final int akq = 63;
    private static final int akr = 127;
    /* access modifiers changed from: private */
    public static final Header[] aks = {new Header(Header.TARGET_AUTHORITY, ""), new Header(Header.TARGET_METHOD, "GET"), new Header(Header.TARGET_METHOD, "POST"), new Header(Header.TARGET_PATH, "/"), new Header(Header.TARGET_PATH, "/index.html"), new Header(Header.TARGET_SCHEME, "http"), new Header(Header.TARGET_SCHEME, "https"), new Header(Header.RESPONSE_STATUS, "200"), new Header(Header.RESPONSE_STATUS, "204"), new Header(Header.RESPONSE_STATUS, "206"), new Header(Header.RESPONSE_STATUS, "304"), new Header(Header.RESPONSE_STATUS, "400"), new Header(Header.RESPONSE_STATUS, "404"), new Header(Header.RESPONSE_STATUS, (String) LivenessStatus.ERROR_UNKNOW), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header((String) SCBHeader.SCB_REQ_HEADER_ACCEPT_LANGUAGE, ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header((String) ServiceConstants.HEADER_SET_COOKIE, ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};

    private C10257a() {
    }

    /* renamed from: okhttp3.repackaged.internal.framed.a$a */
    static final class C10258a {
        private final List<Header> akt = new ArrayList();
        Header[] aku = new Header[8];
        int dynamicTableByteCount = 0;
        int headerCount = 0;
        private int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        int nextHeaderIndex = 7;
        private final PinLoginActivity source;

        C10258a(int i, HowToAddAccountActivity howToAddAccountActivity) {
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i;
            this.source = ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver(howToAddAccountActivity);
        }

        /* access modifiers changed from: package-private */
        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public final void mo58811x(int i) {
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i;
            m6089uG();
        }

        /* renamed from: uG */
        private void m6089uG() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m6090uH();
            } else {
                m6094y(i2 - i);
            }
        }

        /* renamed from: uH */
        private void m6090uH() {
            this.akt.clear();
            Arrays.fill(this.aku, (Object) null);
            this.nextHeaderIndex = this.aku.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        /* renamed from: y */
        private int m6094y(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.aku.length;
                while (true) {
                    length--;
                    if (length < this.nextHeaderIndex || i <= 0) {
                        Header[] headerArr = this.aku;
                        int i3 = this.nextHeaderIndex + 1;
                        System.arraycopy(headerArr, i3, headerArr, i3 + i2, this.headerCount);
                        this.nextHeaderIndex += i2;
                    } else {
                        i -= this.aku[length].hpackSize;
                        this.dynamicTableByteCount -= this.aku[length].hpackSize;
                        this.headerCount--;
                        i2++;
                    }
                }
                Header[] headerArr2 = this.aku;
                int i32 = this.nextHeaderIndex + 1;
                System.arraycopy(headerArr2, i32, headerArr2, i32 + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        /* access modifiers changed from: package-private */
        public final void readHeaders() throws IOException {
            while (!this.source.read()) {
                byte MediaMetadataCompat = this.source.MediaMetadataCompat() & 255;
                if (MediaMetadataCompat == 128) {
                    throw new IOException("index == 0");
                } else if ((MediaMetadataCompat & ISOFileInfo.DATA_BYTES1) == 128) {
                    m6095z(readInt(MediaMetadataCompat, 127) - 1);
                } else if (MediaMetadataCompat == 64) {
                    m6092uJ();
                } else if ((MediaMetadataCompat & 64) == 64) {
                    m6085C(readInt(MediaMetadataCompat, 63) - 1);
                } else if ((MediaMetadataCompat & 32) == 32) {
                    int readInt = readInt(MediaMetadataCompat, 31);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt < 0 || readInt > this.headerTableSizeSetting) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid dynamic table size update ");
                        sb.append(this.maxDynamicTableByteCount);
                        throw new IOException(sb.toString());
                    }
                    m6089uG();
                } else if (MediaMetadataCompat == 16 || MediaMetadataCompat == 0) {
                    m6091uI();
                } else {
                    m6084B(readInt(MediaMetadataCompat, 15) - 1);
                }
            }
        }

        public final List<Header> getAndResetHeaderList() {
            ArrayList arrayList = new ArrayList(this.akt);
            this.akt.clear();
            return arrayList;
        }

        /* renamed from: z */
        private void m6095z(int i) throws IOException {
            if (m6087E(i)) {
                this.akt.add(C10257a.aks[i]);
                return;
            }
            int A = m6083A(i - C10257a.aks.length);
            if (A >= 0) {
                Header[] headerArr = this.aku;
                if (A <= headerArr.length - 1) {
                    this.akt.add(headerArr[A]);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* renamed from: A */
        private int m6083A(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        /* renamed from: B */
        private void m6084B(int i) throws IOException {
            this.akt.add(new Header(m6086D(i), readByteString()));
        }

        /* renamed from: uI */
        private void m6091uI() throws IOException {
            this.akt.add(new Header(C10257a.m6078a(readByteString()), readByteString()));
        }

        /* renamed from: C */
        private void m6085C(int i) throws IOException {
            m6088a(-1, new Header(m6086D(i), readByteString()));
        }

        /* renamed from: uJ */
        private void m6092uJ() throws IOException {
            m6088a(-1, new Header(C10257a.m6078a(readByteString()), readByteString()));
        }

        /* renamed from: D */
        private PinLoginActivity_ViewBinding m6086D(int i) {
            if (m6087E(i)) {
                return C10257a.aks[i].name;
            }
            return this.aku[m6083A(i - C10257a.aks.length)].name;
        }

        /* renamed from: E */
        private boolean m6087E(int i) {
            return i >= 0 && i <= C10257a.aks.length - 1;
        }

        /* renamed from: a */
        private void m6088a(int i, Header header) {
            this.akt.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                i2 -= this.aku[m6083A(i)].hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                m6090uH();
                return;
            }
            int y = m6094y((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount;
                Header[] headerArr = this.aku;
                if (i4 + 1 > headerArr.length) {
                    Header[] headerArr2 = new Header[(headerArr.length << 1)];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.aku.length - 1;
                    this.aku = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.aku[i5] = header;
                this.headerCount++;
            } else {
                this.aku[i + m6083A(i) + y] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        /* renamed from: uK */
        private int m6093uK() throws IOException {
            return this.source.MediaMetadataCompat() & 255;
        }

        /* access modifiers changed from: package-private */
        public final int readInt(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int uK = m6093uK();
                if ((uK & 128) == 0) {
                    return i2 + (uK << i4);
                }
                i2 += (uK & 127) << i4;
                i4 += 7;
            }
        }

        /* access modifiers changed from: package-private */
        public final PinLoginActivity_ViewBinding readByteString() throws IOException {
            int uK = m6093uK();
            boolean z = (uK & 128) == 128;
            int readInt = readInt(uK, 127);
            if (z) {
                return PinLoginActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(C10260b.m6099uO().decode(this.source.read((long) readInt)));
            }
            return this.source.IconCompatParcelizer((long) readInt);
        }
    }

    /* renamed from: uD */
    private static Map<PinLoginActivity_ViewBinding, Integer> m6080uD() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(aks.length);
        int i = 0;
        while (true) {
            Header[] headerArr = aks;
            if (i >= headerArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(headerArr[i].name)) {
                linkedHashMap.put(aks[i].name, Integer.valueOf(i));
            }
            i++;
        }
    }

    /* renamed from: okhttp3.repackaged.internal.framed.a$b */
    static final class C10259b {
        private final onMenuPromptPayClick akv;

        C10259b(onMenuPromptPayClick onmenupromptpayclick) {
            this.akv = onmenupromptpayclick;
        }

        /* access modifiers changed from: package-private */
        public final void writeHeaders(List<Header> list) throws IOException {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                PinLoginActivity_ViewBinding IconCompatParcelizer = list.get(i).name.IconCompatParcelizer();
                Integer num = (Integer) C10257a.NAME_TO_FIRST_INDEX.get(IconCompatParcelizer);
                if (num != null) {
                    writeInt(num.intValue() + 1, 15, 0);
                    mo58812c(list.get(i).value);
                } else {
                    this.akv.MediaBrowserCompat$ItemReceiver(0);
                    mo58812c(IconCompatParcelizer);
                    mo58812c(list.get(i).value);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void writeInt(int i, int i2, int i3) throws IOException {
            if (i < i2) {
                this.akv.MediaBrowserCompat$ItemReceiver(i | i3);
                return;
            }
            this.akv.MediaBrowserCompat$ItemReceiver(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.akv.MediaBrowserCompat$ItemReceiver(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.akv.MediaBrowserCompat$ItemReceiver(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo58812c(PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding) throws IOException {
            writeInt(pinLoginActivity_ViewBinding.write.length, 127, 0);
            onMenuPromptPayClick onmenupromptpayclick = this.akv;
            if (pinLoginActivity_ViewBinding != null) {
                byte[] bArr = pinLoginActivity_ViewBinding.write;
                onmenupromptpayclick.MediaBrowserCompat$CustomActionResultReceiver(bArr, 0, bArr.length);
                return;
            }
            throw new IllegalArgumentException("byteString == null");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static PinLoginActivity_ViewBinding m6078a(PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding) throws IOException {
        int length = pinLoginActivity_ViewBinding.write.length;
        int i = 0;
        while (i < length) {
            byte b = pinLoginActivity_ViewBinding.write[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                String str = pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                if (str == null) {
                    str = new String(pinLoginActivity_ViewBinding.write, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
                    pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = str;
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
        }
        return pinLoginActivity_ViewBinding;
    }
}
