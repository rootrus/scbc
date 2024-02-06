package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import com.thunderhead.connectivity.transport.ServiceConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import p039io.beid.beidk.definitions.LivenessStatus;
import p039io.beid.beidk.definitions.SCBHeader;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HowToAddAccountStep2Activity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.onSubmit;

public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<SCBUniversalWebViewActivity_ViewBinding, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE = {new Header(Header.TARGET_AUTHORITY, ""), new Header(Header.TARGET_METHOD, "GET"), new Header(Header.TARGET_METHOD, "POST"), new Header(Header.TARGET_PATH, "/"), new Header(Header.TARGET_PATH, "/index.html"), new Header(Header.TARGET_SCHEME, "http"), new Header(Header.TARGET_SCHEME, "https"), new Header(Header.RESPONSE_STATUS, "200"), new Header(Header.RESPONSE_STATUS, "204"), new Header(Header.RESPONSE_STATUS, "206"), new Header(Header.RESPONSE_STATUS, "304"), new Header(Header.RESPONSE_STATUS, "400"), new Header(Header.RESPONSE_STATUS, "404"), new Header(Header.RESPONSE_STATUS, (String) LivenessStatus.ERROR_UNKNOW), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header((String) SCBHeader.SCB_REQ_HEADER_ACCEPT_LANGUAGE, ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header((String) ServiceConstants.HEADER_SET_COOKIE, ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    public final Map<SCBUniversalWebViewActivity_ViewBinding, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final NsipPartnerPaymentOtpActivity source;

        public Reader(HowToAddAccountStep2Activity howToAddAccountStep2Activity, int i) {
            this(howToAddAccountStep2Activity, i, 0, 4, (NtbDiscoverFundFilterActivity) null);
        }

        public Reader(HowToAddAccountStep2Activity howToAddAccountStep2Activity, int i, int i2) {
            onGetStartedClick.write((Object) howToAddAccountStep2Activity, "source");
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = onSubmit.read(howToAddAccountStep2Activity);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = 7;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Reader(HowToAddAccountStep2Activity howToAddAccountStep2Activity, int i, int i2, int i3, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this(howToAddAccountStep2Activity, i, (i3 & 4) != 0 ? i : i2);
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> MediaBrowserCompat$CustomActionResultReceiver = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(this.headerList);
            this.headerList.clear();
            return MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            int length = headerArr.length;
            onGetStartedClick.write((Object) headerArr, "$this$fill");
            Arrays.fill(headerArr, 0, length, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    if (length < this.nextHeaderIndex || i <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        int i3 = this.nextHeaderIndex + 1;
                        System.arraycopy(headerArr, i3, headerArr, i3 + i2, this.headerCount);
                        this.nextHeaderIndex += i2;
                    } else {
                        Header header = this.dynamicTable[length];
                        if (header == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        i -= header.hpackSize;
                        this.dynamicTableByteCount -= header.hpackSize;
                        this.headerCount--;
                        i2++;
                    }
                }
                Header[] headerArr2 = this.dynamicTable;
                int i32 = this.nextHeaderIndex + 1;
                System.arraycopy(headerArr2, i32, headerArr2, i32 + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        public final void readHeaders() throws IOException {
            while (!this.source.MediaBrowserCompat$CustomActionResultReceiver()) {
                int and = Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255);
                if (and == 128) {
                    throw new IOException("index == 0");
                } else if ((and & 128) == 128) {
                    readIndexedHeader(readInt(and, 127) - 1);
                } else if (and == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((and & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, 63) - 1);
                } else if ((and & 32) == 32) {
                    int readInt = readInt(and, 31);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt < 0 || readInt > this.headerTableSizeSetting) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid dynamic table size update ");
                        sb.append(this.maxDynamicTableByteCount);
                        throw new IOException(sb.toString());
                    }
                    adjustDynamicTableByteCount();
                } else if (and == 16 || and == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                }
            }
        }

        private final void readIndexedHeader(int i) throws IOException {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Collection collection = this.headerList;
                    Header header = headerArr[dynamicTableIndex];
                    if (header == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    collection.add(header);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        private final int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) throws IOException {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final SCBUniversalWebViewActivity_ViewBinding getName(int i) throws IOException {
            if (isStaticHeader(i)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    if (header == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    return header.name;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        private final boolean isStaticHeader(int i) {
            return i >= 0 && i <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i)];
                if (header2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                i2 -= header2.hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount;
                Header[] headerArr = this.dynamicTable;
                if (i4 + 1 > headerArr.length) {
                    Header[] headerArr2 = new Header[(headerArr.length << 1)];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.dynamicTable[i5] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i + dynamicTableIndex(i) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.MediaBrowserCompat$SearchResultReceiver(), 255);
        }

        public final int readInt(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & 127) << i4;
                i4 += 7;
            }
        }

        public final SCBUniversalWebViewActivity_ViewBinding readByteString() throws IOException {
            int readByte = readByte();
            boolean z = (readByte & 128) == 128;
            long readInt = (long) readInt(readByte, 127);
            if (!z) {
                return this.source.MediaBrowserCompat$ItemReceiver(readInt);
            }
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
            Huffman.INSTANCE.decode(this.source, readInt, sCBUniversalWebViewActivity);
            return new SCBUniversalWebViewActivity_ViewBinding(sCBUniversalWebViewActivity.RatingCompat());
        }
    }

    private final Map<SCBUniversalWebViewActivity_ViewBinding, Integer> nameToFirstIndex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(STATIC_HEADER_TABLE.length);
        int length = STATIC_HEADER_TABLE.length;
        for (int i = 0; i < length; i++) {
            if (!linkedHashMap.containsKey(STATIC_HEADER_TABLE[i].name)) {
                linkedHashMap.put(STATIC_HEADER_TABLE[i].name, Integer.valueOf(i));
            }
        }
        Map<SCBUniversalWebViewActivity_ViewBinding, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        onGetStartedClick.IconCompatParcelizer((Object) unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final SCBUniversalWebViewActivity out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i, SCBUniversalWebViewActivity sCBUniversalWebViewActivity) {
            this(i, false, sCBUniversalWebViewActivity, 2, (NtbDiscoverFundFilterActivity) null);
        }

        public Writer(SCBUniversalWebViewActivity sCBUniversalWebViewActivity) {
            this(0, false, sCBUniversalWebViewActivity, 3, (NtbDiscoverFundFilterActivity) null);
        }

        public Writer(int i, boolean z, SCBUniversalWebViewActivity sCBUniversalWebViewActivity) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "out");
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = sCBUniversalWebViewActivity;
            this.smallestHeaderTableSizeSetting = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.maxDynamicTableByteCount = i;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = 7;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Writer(int i, boolean z, SCBUniversalWebViewActivity sCBUniversalWebViewActivity, int i2, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, sCBUniversalWebViewActivity);
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            int length = headerArr.length;
            onGetStartedClick.write((Object) headerArr, "$this$fill");
            Arrays.fill(headerArr, 0, length, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    if (length < this.nextHeaderIndex || i <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        int i3 = this.nextHeaderIndex + 1;
                        System.arraycopy(headerArr, i3, headerArr, i3 + i2, this.headerCount);
                        Header[] headerArr2 = this.dynamicTable;
                        int i4 = this.nextHeaderIndex + 1;
                        Arrays.fill(headerArr2, i4, i4 + i2, (Object) null);
                        this.nextHeaderIndex += i2;
                    } else {
                        Header header = this.dynamicTable[length];
                        if (header == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        i -= header.hpackSize;
                        int i5 = this.dynamicTableByteCount;
                        Header header2 = this.dynamicTable[length];
                        if (header2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        this.dynamicTableByteCount = i5 - header2.hpackSize;
                        this.headerCount--;
                        i2++;
                    }
                }
                Header[] headerArr3 = this.dynamicTable;
                int i32 = this.nextHeaderIndex + 1;
                System.arraycopy(headerArr3, i32, headerArr3, i32 + i2, this.headerCount);
                Header[] headerArr22 = this.dynamicTable;
                int i42 = this.nextHeaderIndex + 1;
                Arrays.fill(headerArr22, i42, i42 + i2, (Object) null);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount;
            Header[] headerArr = this.dynamicTable;
            if (i3 + 1 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length << 1)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r13) throws java.io.IOException {
            /*
                r12 = this;
                java.lang.String r0 = "headerBlock"
                p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
                boolean r0 = r12.emitDynamicTableSizeUpdate
                r1 = 0
                if (r0 == 0) goto L_0x0023
                int r0 = r12.smallestHeaderTableSizeSetting
                int r2 = r12.maxDynamicTableByteCount
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0017
                r12.writeInt(r0, r4, r3)
            L_0x0017:
                r12.emitDynamicTableSizeUpdate = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r12.smallestHeaderTableSizeSetting = r0
                int r0 = r12.maxDynamicTableByteCount
                r12.writeInt(r0, r4, r3)
            L_0x0023:
                int r0 = r13.size()
                r2 = r1
            L_0x0028:
                if (r2 >= r0) goto L_0x0113
                java.lang.Object r3 = r13.get(r2)
                okhttp3.internal.http2.Header r3 = (okhttp3.internal.http2.Header) r3
                o.SCBUniversalWebViewActivity_ViewBinding r4 = r3.name
                o.SCBUniversalWebViewActivity_ViewBinding r4 = r4.IconCompatParcelizer()
                o.SCBUniversalWebViewActivity_ViewBinding r5 = r3.value
                okhttp3.internal.http2.Hpack r6 = okhttp3.internal.http2.Hpack.INSTANCE
                java.util.Map r6 = r6.getNAME_TO_FIRST_INDEX()
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                if (r6 == 0) goto L_0x007a
                int r6 = r6.intValue()
                int r6 = r6 + 1
                r8 = 2
                if (r8 > r6) goto L_0x0078
                r8 = 7
                if (r8 < r6) goto L_0x0078
                okhttp3.internal.http2.Hpack r8 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r8 = r8.getSTATIC_HEADER_TABLE()
                int r9 = r6 + -1
                r8 = r8[r9]
                o.SCBUniversalWebViewActivity_ViewBinding r8 = r8.value
                boolean r8 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r8, (java.lang.Object) r5)
                if (r8 != 0) goto L_0x007b
                okhttp3.internal.http2.Hpack r8 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r8 = r8.getSTATIC_HEADER_TABLE()
                r8 = r8[r6]
                o.SCBUniversalWebViewActivity_ViewBinding r8 = r8.value
                boolean r8 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r8, (java.lang.Object) r5)
                if (r8 == 0) goto L_0x0078
                int r8 = r6 + 1
                goto L_0x007c
            L_0x0078:
                r8 = r7
                goto L_0x007c
            L_0x007a:
                r6 = r7
            L_0x007b:
                r8 = r6
            L_0x007c:
                if (r8 != r7) goto L_0x00c7
                int r9 = r12.nextHeaderIndex
                int r9 = r9 + 1
                okhttp3.internal.http2.Header[] r10 = r12.dynamicTable
                int r10 = r10.length
            L_0x0085:
                if (r9 >= r10) goto L_0x00c7
                okhttp3.internal.http2.Header[] r11 = r12.dynamicTable
                r11 = r11[r9]
                if (r11 != 0) goto L_0x0090
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
            L_0x0090:
                o.SCBUniversalWebViewActivity_ViewBinding r11 = r11.name
                boolean r11 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r11, (java.lang.Object) r4)
                if (r11 == 0) goto L_0x00c4
                okhttp3.internal.http2.Header[] r11 = r12.dynamicTable
                r11 = r11[r9]
                if (r11 != 0) goto L_0x00a1
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
            L_0x00a1:
                o.SCBUniversalWebViewActivity_ViewBinding r11 = r11.value
                boolean r11 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r11, (java.lang.Object) r5)
                if (r11 == 0) goto L_0x00b6
                int r8 = r12.nextHeaderIndex
                okhttp3.internal.http2.Hpack r10 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r10 = r10.getSTATIC_HEADER_TABLE()
                int r10 = r10.length
                int r9 = r9 - r8
                int r8 = r10 + r9
                goto L_0x00c7
            L_0x00b6:
                if (r6 != r7) goto L_0x00c4
                int r6 = r12.nextHeaderIndex
                int r6 = r9 - r6
                okhttp3.internal.http2.Hpack r11 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r11 = r11.getSTATIC_HEADER_TABLE()
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00c4:
                int r9 = r9 + 1
                goto L_0x0085
            L_0x00c7:
                if (r8 == r7) goto L_0x00d1
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r12.writeInt(r8, r3, r4)
                goto L_0x010f
            L_0x00d1:
                r8 = 64
                if (r6 != r7) goto L_0x00e4
                o.SCBUniversalWebViewActivity r6 = r12.out
                r6.MediaBrowserCompat$ItemReceiver((int) r8)
                r12.writeByteString(r4)
                r12.writeByteString(r5)
                r12.insertIntoDynamicTable(r3)
                goto L_0x010f
            L_0x00e4:
                o.SCBUniversalWebViewActivity_ViewBinding r7 = okhttp3.internal.http2.Header.PSEUDO_PREFIX
                java.lang.String r9 = "prefix"
                p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r9)
                boolean r7 = p040o.PinChangeSuccessActivity.read(r4, r7)
                if (r7 == 0) goto L_0x0104
                o.SCBUniversalWebViewActivity_ViewBinding r7 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                boolean r4 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r7, (java.lang.Object) r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x0104
                r3 = 15
                r12.writeInt(r6, r3, r1)
                r12.writeByteString(r5)
                goto L_0x010f
            L_0x0104:
                r4 = 63
                r12.writeInt(r6, r4, r8)
                r12.writeByteString(r5)
                r12.insertIntoDynamicTable(r3)
            L_0x010f:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x0113:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public final void writeInt(int i, int i2, int i3) {
            if (i < i2) {
                this.out.MediaBrowserCompat$ItemReceiver(i | i3);
                return;
            }
            this.out.MediaBrowserCompat$ItemReceiver(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.out.MediaBrowserCompat$ItemReceiver(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.out.MediaBrowserCompat$ItemReceiver(i4);
        }

        public final void writeByteString(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "data");
            if (!this.useCompression || Huffman.INSTANCE.encodedLength(sCBUniversalWebViewActivity_ViewBinding) >= sCBUniversalWebViewActivity_ViewBinding.write()) {
                writeInt(sCBUniversalWebViewActivity_ViewBinding.write(), 127, 0);
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.out;
                onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "byteString");
                sCBUniversalWebViewActivity_ViewBinding.write(sCBUniversalWebViewActivity);
                return;
            }
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = new SCBUniversalWebViewActivity();
            Huffman.INSTANCE.encode(sCBUniversalWebViewActivity_ViewBinding, sCBUniversalWebViewActivity2);
            SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2 = new SCBUniversalWebViewActivity_ViewBinding(sCBUniversalWebViewActivity2.RatingCompat());
            writeInt(sCBUniversalWebViewActivity_ViewBinding2.write(), 127, 128);
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity3 = this.out;
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding2, "byteString");
            sCBUniversalWebViewActivity_ViewBinding2.write(sCBUniversalWebViewActivity3);
        }

        public final void resizeHeaderTable(int i) {
            this.headerTableSizeSetting = i;
            int min = Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 != min) {
                if (min < i2) {
                    this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
                }
                this.emitDynamicTableSizeUpdate = true;
                this.maxDynamicTableByteCount = min;
                adjustDynamicTableByteCount();
            }
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }
    }

    public final SCBUniversalWebViewActivity_ViewBinding checkLowercase(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "name");
        int write = sCBUniversalWebViewActivity_ViewBinding.write();
        int i = 0;
        while (i < write) {
            byte IconCompatParcelizer = sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(i);
            if (65 > IconCompatParcelizer || 90 < IconCompatParcelizer) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(PinChangeSuccessActivity.MediaMetadataCompat(sCBUniversalWebViewActivity_ViewBinding));
                throw new IOException(sb.toString());
            }
        }
        return sCBUniversalWebViewActivity_ViewBinding;
    }
}
