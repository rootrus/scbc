package androidx.renderscript;

public class Element extends BaseObj {
    int[] mArraySizes;
    String[] mElementNames;
    Element[] mElements;
    DataKind mKind;
    boolean mNormalized;
    int[] mOffsetInBytes;
    int mSize;
    DataType mType;
    int mVectorSize;
    int[] mVisibleElementMap;

    private void updateVisibleSubElements() {
        if (this.mElements != null) {
            int i = 0;
            for (String charAt : this.mElementNames) {
                if (charAt.charAt(0) != '#') {
                    i++;
                }
            }
            this.mVisibleElementMap = new int[i];
            int i2 = 0;
            for (int i3 = 0; i3 < r0; i3++) {
                if (this.mElementNames[i3].charAt(0) != '#') {
                    this.mVisibleElementMap[i2] = i3;
                    i2++;
                }
            }
        }
    }

    public int getBytesSize() {
        return this.mSize;
    }

    public int getVectorSize() {
        return this.mVectorSize;
    }

    public enum DataType {
        NONE(0, 0),
        FLOAT_32(2, 4),
        FLOAT_64(3, 8),
        SIGNED_8(4, 1),
        SIGNED_16(5, 2),
        SIGNED_32(6, 4),
        SIGNED_64(7, 8),
        UNSIGNED_8(8, 1),
        UNSIGNED_16(9, 2),
        UNSIGNED_32(10, 4),
        UNSIGNED_64(11, 8),
        BOOLEAN(12, 1),
        UNSIGNED_5_6_5(13, 2),
        UNSIGNED_5_5_5_1(14, 2),
        UNSIGNED_4_4_4_4(15, 2),
        MATRIX_4X4(16, 64),
        MATRIX_3X3(17, 36),
        MATRIX_2X2(18, 16),
        RS_ELEMENT(1000),
        RS_TYPE(1001),
        RS_ALLOCATION(1002),
        RS_SAMPLER(1003),
        RS_SCRIPT(1004);
        
        int mID;
        int mSize;

        private DataType(int i, int i2) {
            this.mID = i;
            this.mSize = i2;
        }

        private DataType(int i) {
            this.mID = i;
            this.mSize = 4;
            if (RenderScript.sPointerSize == 8) {
                this.mSize = 32;
            }
        }
    }

    public enum DataKind {
        USER(0),
        PIXEL_L(7),
        PIXEL_A(8),
        PIXEL_LA(9),
        PIXEL_RGB(10),
        PIXEL_RGBA(11),
        PIXEL_DEPTH(12),
        PIXEL_YUV(13);
        
        int mID;

        private DataKind(int i) {
            this.mID = i;
        }
    }

    public boolean isComplex() {
        if (this.mElements == null) {
            return false;
        }
        int i = 0;
        while (true) {
            Element[] elementArr = this.mElements;
            if (i >= elementArr.length) {
                return false;
            }
            if (elementArr[i].mElements != null) {
                return true;
            }
            i++;
        }
    }

    public int getSubElementCount() {
        int[] iArr = this.mVisibleElementMap;
        if (iArr == null) {
            return 0;
        }
        return iArr.length;
    }

    public Element getSubElement(int i) {
        int[] iArr = this.mVisibleElementMap;
        if (iArr == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        } else if (i >= 0 && i < iArr.length) {
            return this.mElements[iArr[i]];
        } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
        }
    }

    public String getSubElementName(int i) {
        int[] iArr = this.mVisibleElementMap;
        if (iArr == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        } else if (i >= 0 && i < iArr.length) {
            return this.mElementNames[iArr[i]];
        } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
        }
    }

    public int getSubElementArraySize(int i) {
        int[] iArr = this.mVisibleElementMap;
        if (iArr == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        } else if (i >= 0 && i < iArr.length) {
            return this.mArraySizes[iArr[i]];
        } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
        }
    }

    public int getSubElementOffsetBytes(int i) {
        int[] iArr = this.mVisibleElementMap;
        if (iArr == null) {
            throw new RSIllegalArgumentException("Element contains no sub-elements");
        } else if (i >= 0 && i < iArr.length) {
            return this.mOffsetInBytes[iArr[i]];
        } else {
            throw new RSIllegalArgumentException("Illegal sub-element index");
        }
    }

    public DataType getDataType() {
        return this.mType;
    }

    public DataKind getDataKind() {
        return this.mKind;
    }

    public static Element BOOLEAN(RenderScript renderScript) {
        if (renderScript.mElement_BOOLEAN == null) {
            renderScript.mElement_BOOLEAN = createUser(renderScript, DataType.BOOLEAN);
        }
        return renderScript.mElement_BOOLEAN;
    }

    /* renamed from: U8 */
    public static Element m31U8(RenderScript renderScript) {
        if (renderScript.mElement_U8 == null) {
            renderScript.mElement_U8 = createUser(renderScript, DataType.UNSIGNED_8);
        }
        return renderScript.mElement_U8;
    }

    /* renamed from: I8 */
    public static Element m30I8(RenderScript renderScript) {
        if (renderScript.mElement_I8 == null) {
            renderScript.mElement_I8 = createUser(renderScript, DataType.SIGNED_8);
        }
        return renderScript.mElement_I8;
    }

    public static Element U16(RenderScript renderScript) {
        if (renderScript.mElement_U16 == null) {
            renderScript.mElement_U16 = createUser(renderScript, DataType.UNSIGNED_16);
        }
        return renderScript.mElement_U16;
    }

    public static Element I16(RenderScript renderScript) {
        if (renderScript.mElement_I16 == null) {
            renderScript.mElement_I16 = createUser(renderScript, DataType.SIGNED_16);
        }
        return renderScript.mElement_I16;
    }

    public static Element U32(RenderScript renderScript) {
        if (renderScript.mElement_U32 == null) {
            renderScript.mElement_U32 = createUser(renderScript, DataType.UNSIGNED_32);
        }
        return renderScript.mElement_U32;
    }

    public static Element I32(RenderScript renderScript) {
        if (renderScript.mElement_I32 == null) {
            renderScript.mElement_I32 = createUser(renderScript, DataType.SIGNED_32);
        }
        return renderScript.mElement_I32;
    }

    public static Element U64(RenderScript renderScript) {
        if (renderScript.mElement_U64 == null) {
            renderScript.mElement_U64 = createUser(renderScript, DataType.UNSIGNED_64);
        }
        return renderScript.mElement_U64;
    }

    public static Element I64(RenderScript renderScript) {
        if (renderScript.mElement_I64 == null) {
            renderScript.mElement_I64 = createUser(renderScript, DataType.SIGNED_64);
        }
        return renderScript.mElement_I64;
    }

    public static Element F32(RenderScript renderScript) {
        if (renderScript.mElement_F32 == null) {
            renderScript.mElement_F32 = createUser(renderScript, DataType.FLOAT_32);
        }
        return renderScript.mElement_F32;
    }

    public static Element F64(RenderScript renderScript) {
        if (renderScript.mElement_F64 == null) {
            renderScript.mElement_F64 = createUser(renderScript, DataType.FLOAT_64);
        }
        return renderScript.mElement_F64;
    }

    public static Element ELEMENT(RenderScript renderScript) {
        if (renderScript.mElement_ELEMENT == null) {
            renderScript.mElement_ELEMENT = createUser(renderScript, DataType.RS_ELEMENT);
        }
        return renderScript.mElement_ELEMENT;
    }

    public static Element TYPE(RenderScript renderScript) {
        if (renderScript.mElement_TYPE == null) {
            renderScript.mElement_TYPE = createUser(renderScript, DataType.RS_TYPE);
        }
        return renderScript.mElement_TYPE;
    }

    public static Element ALLOCATION(RenderScript renderScript) {
        if (renderScript.mElement_ALLOCATION == null) {
            renderScript.mElement_ALLOCATION = createUser(renderScript, DataType.RS_ALLOCATION);
        }
        return renderScript.mElement_ALLOCATION;
    }

    public static Element SAMPLER(RenderScript renderScript) {
        if (renderScript.mElement_SAMPLER == null) {
            renderScript.mElement_SAMPLER = createUser(renderScript, DataType.RS_SAMPLER);
        }
        return renderScript.mElement_SAMPLER;
    }

    public static Element SCRIPT(RenderScript renderScript) {
        if (renderScript.mElement_SCRIPT == null) {
            renderScript.mElement_SCRIPT = createUser(renderScript, DataType.RS_SCRIPT);
        }
        return renderScript.mElement_SCRIPT;
    }

    public static Element A_8(RenderScript renderScript) {
        if (renderScript.mElement_A_8 == null) {
            renderScript.mElement_A_8 = createPixel(renderScript, DataType.UNSIGNED_8, DataKind.PIXEL_A);
        }
        return renderScript.mElement_A_8;
    }

    public static Element RGB_565(RenderScript renderScript) {
        if (renderScript.mElement_RGB_565 == null) {
            renderScript.mElement_RGB_565 = createPixel(renderScript, DataType.UNSIGNED_5_6_5, DataKind.PIXEL_RGB);
        }
        return renderScript.mElement_RGB_565;
    }

    public static Element RGB_888(RenderScript renderScript) {
        if (renderScript.mElement_RGB_888 == null) {
            renderScript.mElement_RGB_888 = createPixel(renderScript, DataType.UNSIGNED_8, DataKind.PIXEL_RGB);
        }
        return renderScript.mElement_RGB_888;
    }

    public static Element RGBA_5551(RenderScript renderScript) {
        if (renderScript.mElement_RGBA_5551 == null) {
            renderScript.mElement_RGBA_5551 = createPixel(renderScript, DataType.UNSIGNED_5_5_5_1, DataKind.PIXEL_RGBA);
        }
        return renderScript.mElement_RGBA_5551;
    }

    public static Element RGBA_4444(RenderScript renderScript) {
        if (renderScript.mElement_RGBA_4444 == null) {
            renderScript.mElement_RGBA_4444 = createPixel(renderScript, DataType.UNSIGNED_4_4_4_4, DataKind.PIXEL_RGBA);
        }
        return renderScript.mElement_RGBA_4444;
    }

    public static Element RGBA_8888(RenderScript renderScript) {
        if (renderScript.mElement_RGBA_8888 == null) {
            renderScript.mElement_RGBA_8888 = createPixel(renderScript, DataType.UNSIGNED_8, DataKind.PIXEL_RGBA);
        }
        return renderScript.mElement_RGBA_8888;
    }

    public static Element F32_2(RenderScript renderScript) {
        if (renderScript.mElement_FLOAT_2 == null) {
            renderScript.mElement_FLOAT_2 = createVector(renderScript, DataType.FLOAT_32, 2);
        }
        return renderScript.mElement_FLOAT_2;
    }

    public static Element F32_3(RenderScript renderScript) {
        if (renderScript.mElement_FLOAT_3 == null) {
            renderScript.mElement_FLOAT_3 = createVector(renderScript, DataType.FLOAT_32, 3);
        }
        return renderScript.mElement_FLOAT_3;
    }

    public static Element F32_4(RenderScript renderScript) {
        if (renderScript.mElement_FLOAT_4 == null) {
            renderScript.mElement_FLOAT_4 = createVector(renderScript, DataType.FLOAT_32, 4);
        }
        return renderScript.mElement_FLOAT_4;
    }

    public static Element F64_2(RenderScript renderScript) {
        if (renderScript.mElement_DOUBLE_2 == null) {
            renderScript.mElement_DOUBLE_2 = createVector(renderScript, DataType.FLOAT_64, 2);
        }
        return renderScript.mElement_DOUBLE_2;
    }

    public static Element F64_3(RenderScript renderScript) {
        if (renderScript.mElement_DOUBLE_3 == null) {
            renderScript.mElement_DOUBLE_3 = createVector(renderScript, DataType.FLOAT_64, 3);
        }
        return renderScript.mElement_DOUBLE_3;
    }

    public static Element F64_4(RenderScript renderScript) {
        if (renderScript.mElement_DOUBLE_4 == null) {
            renderScript.mElement_DOUBLE_4 = createVector(renderScript, DataType.FLOAT_64, 4);
        }
        return renderScript.mElement_DOUBLE_4;
    }

    public static Element U8_2(RenderScript renderScript) {
        if (renderScript.mElement_UCHAR_2 == null) {
            renderScript.mElement_UCHAR_2 = createVector(renderScript, DataType.UNSIGNED_8, 2);
        }
        return renderScript.mElement_UCHAR_2;
    }

    public static Element U8_3(RenderScript renderScript) {
        if (renderScript.mElement_UCHAR_3 == null) {
            renderScript.mElement_UCHAR_3 = createVector(renderScript, DataType.UNSIGNED_8, 3);
        }
        return renderScript.mElement_UCHAR_3;
    }

    public static Element U8_4(RenderScript renderScript) {
        if (renderScript.mElement_UCHAR_4 == null) {
            renderScript.mElement_UCHAR_4 = createVector(renderScript, DataType.UNSIGNED_8, 4);
        }
        return renderScript.mElement_UCHAR_4;
    }

    public static Element I8_2(RenderScript renderScript) {
        if (renderScript.mElement_CHAR_2 == null) {
            renderScript.mElement_CHAR_2 = createVector(renderScript, DataType.SIGNED_8, 2);
        }
        return renderScript.mElement_CHAR_2;
    }

    public static Element I8_3(RenderScript renderScript) {
        if (renderScript.mElement_CHAR_3 == null) {
            renderScript.mElement_CHAR_3 = createVector(renderScript, DataType.SIGNED_8, 3);
        }
        return renderScript.mElement_CHAR_3;
    }

    public static Element I8_4(RenderScript renderScript) {
        if (renderScript.mElement_CHAR_4 == null) {
            renderScript.mElement_CHAR_4 = createVector(renderScript, DataType.SIGNED_8, 4);
        }
        return renderScript.mElement_CHAR_4;
    }

    public static Element U16_2(RenderScript renderScript) {
        if (renderScript.mElement_USHORT_2 == null) {
            renderScript.mElement_USHORT_2 = createVector(renderScript, DataType.UNSIGNED_16, 2);
        }
        return renderScript.mElement_USHORT_2;
    }

    public static Element U16_3(RenderScript renderScript) {
        if (renderScript.mElement_USHORT_3 == null) {
            renderScript.mElement_USHORT_3 = createVector(renderScript, DataType.UNSIGNED_16, 3);
        }
        return renderScript.mElement_USHORT_3;
    }

    public static Element U16_4(RenderScript renderScript) {
        if (renderScript.mElement_USHORT_4 == null) {
            renderScript.mElement_USHORT_4 = createVector(renderScript, DataType.UNSIGNED_16, 4);
        }
        return renderScript.mElement_USHORT_4;
    }

    public static Element I16_2(RenderScript renderScript) {
        if (renderScript.mElement_SHORT_2 == null) {
            renderScript.mElement_SHORT_2 = createVector(renderScript, DataType.SIGNED_16, 2);
        }
        return renderScript.mElement_SHORT_2;
    }

    public static Element I16_3(RenderScript renderScript) {
        if (renderScript.mElement_SHORT_3 == null) {
            renderScript.mElement_SHORT_3 = createVector(renderScript, DataType.SIGNED_16, 3);
        }
        return renderScript.mElement_SHORT_3;
    }

    public static Element I16_4(RenderScript renderScript) {
        if (renderScript.mElement_SHORT_4 == null) {
            renderScript.mElement_SHORT_4 = createVector(renderScript, DataType.SIGNED_16, 4);
        }
        return renderScript.mElement_SHORT_4;
    }

    public static Element U32_2(RenderScript renderScript) {
        if (renderScript.mElement_UINT_2 == null) {
            renderScript.mElement_UINT_2 = createVector(renderScript, DataType.UNSIGNED_32, 2);
        }
        return renderScript.mElement_UINT_2;
    }

    public static Element U32_3(RenderScript renderScript) {
        if (renderScript.mElement_UINT_3 == null) {
            renderScript.mElement_UINT_3 = createVector(renderScript, DataType.UNSIGNED_32, 3);
        }
        return renderScript.mElement_UINT_3;
    }

    public static Element U32_4(RenderScript renderScript) {
        if (renderScript.mElement_UINT_4 == null) {
            renderScript.mElement_UINT_4 = createVector(renderScript, DataType.UNSIGNED_32, 4);
        }
        return renderScript.mElement_UINT_4;
    }

    public static Element I32_2(RenderScript renderScript) {
        if (renderScript.mElement_INT_2 == null) {
            renderScript.mElement_INT_2 = createVector(renderScript, DataType.SIGNED_32, 2);
        }
        return renderScript.mElement_INT_2;
    }

    public static Element I32_3(RenderScript renderScript) {
        if (renderScript.mElement_INT_3 == null) {
            renderScript.mElement_INT_3 = createVector(renderScript, DataType.SIGNED_32, 3);
        }
        return renderScript.mElement_INT_3;
    }

    public static Element I32_4(RenderScript renderScript) {
        if (renderScript.mElement_INT_4 == null) {
            renderScript.mElement_INT_4 = createVector(renderScript, DataType.SIGNED_32, 4);
        }
        return renderScript.mElement_INT_4;
    }

    public static Element U64_2(RenderScript renderScript) {
        if (renderScript.mElement_ULONG_2 == null) {
            renderScript.mElement_ULONG_2 = createVector(renderScript, DataType.UNSIGNED_64, 2);
        }
        return renderScript.mElement_ULONG_2;
    }

    public static Element U64_3(RenderScript renderScript) {
        if (renderScript.mElement_ULONG_3 == null) {
            renderScript.mElement_ULONG_3 = createVector(renderScript, DataType.UNSIGNED_64, 3);
        }
        return renderScript.mElement_ULONG_3;
    }

    public static Element U64_4(RenderScript renderScript) {
        if (renderScript.mElement_ULONG_4 == null) {
            renderScript.mElement_ULONG_4 = createVector(renderScript, DataType.UNSIGNED_64, 4);
        }
        return renderScript.mElement_ULONG_4;
    }

    public static Element I64_2(RenderScript renderScript) {
        if (renderScript.mElement_LONG_2 == null) {
            renderScript.mElement_LONG_2 = createVector(renderScript, DataType.SIGNED_64, 2);
        }
        return renderScript.mElement_LONG_2;
    }

    public static Element I64_3(RenderScript renderScript) {
        if (renderScript.mElement_LONG_3 == null) {
            renderScript.mElement_LONG_3 = createVector(renderScript, DataType.SIGNED_64, 3);
        }
        return renderScript.mElement_LONG_3;
    }

    public static Element I64_4(RenderScript renderScript) {
        if (renderScript.mElement_LONG_4 == null) {
            renderScript.mElement_LONG_4 = createVector(renderScript, DataType.SIGNED_64, 4);
        }
        return renderScript.mElement_LONG_4;
    }

    public static Element MATRIX_4X4(RenderScript renderScript) {
        if (renderScript.mElement_MATRIX_4X4 == null) {
            renderScript.mElement_MATRIX_4X4 = createUser(renderScript, DataType.MATRIX_4X4);
        }
        return renderScript.mElement_MATRIX_4X4;
    }

    public static Element MATRIX_3X3(RenderScript renderScript) {
        if (renderScript.mElement_MATRIX_3X3 == null) {
            renderScript.mElement_MATRIX_3X3 = createUser(renderScript, DataType.MATRIX_3X3);
        }
        return renderScript.mElement_MATRIX_3X3;
    }

    public static Element MATRIX_2X2(RenderScript renderScript) {
        if (renderScript.mElement_MATRIX_2X2 == null) {
            renderScript.mElement_MATRIX_2X2 = createUser(renderScript, DataType.MATRIX_2X2);
        }
        return renderScript.mElement_MATRIX_2X2;
    }

    Element(long j, RenderScript renderScript, Element[] elementArr, String[] strArr, int[] iArr) {
        super(j, renderScript);
        int i = 0;
        this.mSize = 0;
        this.mVectorSize = 1;
        this.mElements = elementArr;
        this.mElementNames = strArr;
        this.mArraySizes = iArr;
        this.mType = DataType.NONE;
        this.mKind = DataKind.USER;
        this.mOffsetInBytes = new int[this.mElements.length];
        while (true) {
            Element[] elementArr2 = this.mElements;
            if (i < elementArr2.length) {
                int[] iArr2 = this.mOffsetInBytes;
                int i2 = this.mSize;
                iArr2[i] = i2;
                this.mSize = i2 + (elementArr2[i].mSize * this.mArraySizes[i]);
                i++;
            } else {
                updateVisibleSubElements();
                return;
            }
        }
    }

    Element(long j, RenderScript renderScript, DataType dataType, DataKind dataKind, boolean z, int i) {
        super(j, renderScript);
        if (dataType == DataType.UNSIGNED_5_6_5 || dataType == DataType.UNSIGNED_4_4_4_4 || dataType == DataType.UNSIGNED_5_5_5_1) {
            this.mSize = dataType.mSize;
        } else if (i == 3) {
            this.mSize = dataType.mSize << 2;
        } else {
            this.mSize = dataType.mSize * i;
        }
        this.mType = dataType;
        this.mKind = dataKind;
        this.mNormalized = z;
        this.mVectorSize = i;
    }

    Element(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public long getDummyElement(RenderScript renderScript) {
        return renderScript.nIncElementCreate((long) this.mType.mID, this.mKind.mID, this.mNormalized, this.mVectorSize);
    }

    static Element createUser(RenderScript renderScript, DataType dataType) {
        DataKind dataKind = DataKind.USER;
        return new Element(renderScript.nElementCreate((long) dataType.mID, dataKind.mID, false, 1), renderScript, dataType, dataKind, false, 1);
    }

    public static Element createVector(RenderScript renderScript, DataType dataType, int i) {
        if (i < 2 || i > 4) {
            throw new RSIllegalArgumentException("Vector size out of range 2-4.");
        }
        switch (C00721.$SwitchMap$androidx$renderscript$Element$DataType[dataType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                DataKind dataKind = DataKind.USER;
                return new Element(renderScript.nElementCreate((long) dataType.mID, dataKind.mID, false, i), renderScript, dataType, dataKind, false, i);
            default:
                throw new RSIllegalArgumentException("Cannot create vector of non-primitive type.");
        }
    }

    public static Element createPixel(RenderScript renderScript, DataType dataType, DataKind dataKind) {
        int i;
        if (dataKind != DataKind.PIXEL_L && dataKind != DataKind.PIXEL_A && dataKind != DataKind.PIXEL_LA && dataKind != DataKind.PIXEL_RGB && dataKind != DataKind.PIXEL_RGBA && dataKind != DataKind.PIXEL_DEPTH && dataKind != DataKind.PIXEL_YUV) {
            throw new RSIllegalArgumentException("Unsupported DataKind");
        } else if (dataType != DataType.UNSIGNED_8 && dataType != DataType.UNSIGNED_16 && dataType != DataType.UNSIGNED_5_6_5 && dataType != DataType.UNSIGNED_4_4_4_4 && dataType != DataType.UNSIGNED_5_5_5_1) {
            throw new RSIllegalArgumentException("Unsupported DataType");
        } else if (dataType == DataType.UNSIGNED_5_6_5 && dataKind != DataKind.PIXEL_RGB) {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        } else if (dataType == DataType.UNSIGNED_5_5_5_1 && dataKind != DataKind.PIXEL_RGBA) {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        } else if (dataType == DataType.UNSIGNED_4_4_4_4 && dataKind != DataKind.PIXEL_RGBA) {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        } else if (dataType != DataType.UNSIGNED_16 || dataKind == DataKind.PIXEL_DEPTH) {
            int i2 = C00721.$SwitchMap$androidx$renderscript$Element$DataKind[dataKind.ordinal()];
            int i3 = 2;
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 3;
                } else if (i2 != 3) {
                    i = 1;
                    return new Element(renderScript.nElementCreate((long) dataType.mID, dataKind.mID, true, i), renderScript, dataType, dataKind, true, i);
                } else {
                    i3 = 4;
                }
            }
            i = i3;
            return new Element(renderScript.nElementCreate((long) dataType.mID, dataKind.mID, true, i), renderScript, dataType, dataKind, true, i);
        } else {
            throw new RSIllegalArgumentException("Bad kind and type combo");
        }
    }

    /* renamed from: androidx.renderscript.Element$1 */
    static /* synthetic */ class C00721 {
        static final /* synthetic */ int[] $SwitchMap$androidx$renderscript$Element$DataKind;
        static final /* synthetic */ int[] $SwitchMap$androidx$renderscript$Element$DataType;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009d */
        static {
            /*
                androidx.renderscript.Element$DataKind[] r0 = androidx.renderscript.Element.DataKind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$renderscript$Element$DataKind = r0
                r1 = 1
                androidx.renderscript.Element$DataKind r2 = androidx.renderscript.Element.DataKind.PIXEL_LA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$androidx$renderscript$Element$DataKind     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.renderscript.Element$DataKind r3 = androidx.renderscript.Element.DataKind.PIXEL_RGB     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$androidx$renderscript$Element$DataKind     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.renderscript.Element$DataKind r4 = androidx.renderscript.Element.DataKind.PIXEL_RGBA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.renderscript.Element$DataType[] r3 = androidx.renderscript.Element.DataType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$androidx$renderscript$Element$DataType = r3
                androidx.renderscript.Element$DataType r4 = androidx.renderscript.Element.DataType.FLOAT_32     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = $SwitchMap$androidx$renderscript$Element$DataType     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.renderscript.Element$DataType r3 = androidx.renderscript.Element.DataType.FLOAT_64     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$androidx$renderscript$Element$DataType     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.renderscript.Element$DataType r1 = androidx.renderscript.Element.DataType.SIGNED_8     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = $SwitchMap$androidx$renderscript$Element$DataType     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.renderscript.Element$DataType r1 = androidx.renderscript.Element.DataType.SIGNED_16     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = $SwitchMap$androidx$renderscript$Element$DataType     // Catch:{ NoSuchFieldError -> 0x0063 }
                androidx.renderscript.Element$DataType r1 = androidx.renderscript.Element.DataType.SIGNED_32     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = $SwitchMap$androidx$renderscript$Element$DataType     // Catch:{ NoSuchFieldError -> 0x006e }
                androidx.renderscript.Element$DataType r1 = androidx.renderscript.Element.DataType.SIGNED_64     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$androidx$renderscript$Element$DataType     // Catch:{ NoSuchFieldError -> 0x0079 }
                androidx.renderscript.Element$DataType r1 = androidx.renderscript.Element.DataType.UNSIGNED_8     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = $SwitchMap$androidx$renderscript$Element$DataType     // Catch:{ NoSuchFieldError -> 0x0085 }
                androidx.renderscript.Element$DataType r1 = androidx.renderscript.Element.DataType.UNSIGNED_16     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = $SwitchMap$androidx$renderscript$Element$DataType     // Catch:{ NoSuchFieldError -> 0x0091 }
                androidx.renderscript.Element$DataType r1 = androidx.renderscript.Element.DataType.UNSIGNED_32     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                int[] r0 = $SwitchMap$androidx$renderscript$Element$DataType     // Catch:{ NoSuchFieldError -> 0x009d }
                androidx.renderscript.Element$DataType r1 = androidx.renderscript.Element.DataType.UNSIGNED_64     // Catch:{ NoSuchFieldError -> 0x009d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r0 = $SwitchMap$androidx$renderscript$Element$DataType     // Catch:{ NoSuchFieldError -> 0x00a9 }
                androidx.renderscript.Element$DataType r1 = androidx.renderscript.Element.DataType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.renderscript.Element.C00721.<clinit>():void");
        }
    }

    public boolean isCompatible(Element element) {
        if (equals(element)) {
            return true;
        }
        if (this.mSize == element.mSize && this.mType != DataType.NONE && this.mType == element.mType && this.mVectorSize == element.mVectorSize) {
            return true;
        }
        return false;
    }

    public static class Builder {
        int[] mArraySizes = new int[8];
        int mCount = 0;
        String[] mElementNames = new String[8];
        Element[] mElements = new Element[8];
        RenderScript mRS;
        int mSkipPadding;

        public Builder(RenderScript renderScript) {
            this.mRS = renderScript;
        }

        public Builder add(Element element, String str, int i) {
            if (i <= 0) {
                throw new RSIllegalArgumentException("Array size cannot be less than 1.");
            } else if (this.mSkipPadding == 0 || !str.startsWith("#padding_")) {
                if (element.mVectorSize == 3) {
                    this.mSkipPadding = 1;
                } else {
                    this.mSkipPadding = 0;
                }
                int i2 = this.mCount;
                Element[] elementArr = this.mElements;
                if (i2 == elementArr.length) {
                    int i3 = i2 + 8;
                    Element[] elementArr2 = new Element[i3];
                    String[] strArr = new String[i3];
                    int[] iArr = new int[i3];
                    System.arraycopy(elementArr, 0, elementArr2, 0, i2);
                    System.arraycopy(this.mElementNames, 0, strArr, 0, this.mCount);
                    System.arraycopy(this.mArraySizes, 0, iArr, 0, this.mCount);
                    this.mElements = elementArr2;
                    this.mElementNames = strArr;
                    this.mArraySizes = iArr;
                }
                Element[] elementArr3 = this.mElements;
                int i4 = this.mCount;
                elementArr3[i4] = element;
                this.mElementNames[i4] = str;
                this.mArraySizes[i4] = i;
                this.mCount = i4 + 1;
                return this;
            } else {
                this.mSkipPadding = 0;
                return this;
            }
        }

        public Builder add(Element element, String str) {
            return add(element, str, 1);
        }

        public Element create() {
            this.mRS.validate();
            int i = this.mCount;
            Element[] elementArr = new Element[i];
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            System.arraycopy(this.mElements, 0, elementArr, 0, i);
            System.arraycopy(this.mElementNames, 0, strArr, 0, this.mCount);
            System.arraycopy(this.mArraySizes, 0, iArr, 0, this.mCount);
            long[] jArr = new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr[i2] = elementArr[i2].getID(this.mRS);
            }
            return new Element(this.mRS.nElementCreate2(jArr, strArr, iArr), this.mRS, elementArr, strArr, iArr);
        }
    }
}
