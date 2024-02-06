package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import net.p088sf.scuba.smartcards.ISO7816;
import p040o.GroupFavoriteActivity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;

final class JsonUtf8Reader extends JsonReader {
    private static final SCBUniversalWebViewActivity_ViewBinding CLOSING_BLOCK_COMMENT = SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver("*/");
    private static final SCBUniversalWebViewActivity_ViewBinding DOUBLE_QUOTE_OR_SLASH = SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver("\"\\");
    private static final SCBUniversalWebViewActivity_ViewBinding LINEFEED_OR_CARRIAGE_RETURN = SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver("\n\r");
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_BUFFERED_NAME = 15;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 18;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 16;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 17;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private static final SCBUniversalWebViewActivity_ViewBinding SINGLE_QUOTE_OR_SLASH = SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver("'\\");
    private static final SCBUniversalWebViewActivity_ViewBinding UNQUOTED_STRING_TERMINALS = SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver("{}[]:, \n\t\r\f/\\;#=");
    private final SCBUniversalWebViewActivity buffer;
    private int peeked = 0;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private final NsipPartnerPaymentOtpActivity source;

    JsonUtf8Reader(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) {
        if (nsipPartnerPaymentOtpActivity != null) {
            this.source = nsipPartnerPaymentOtpActivity;
            this.buffer = nsipPartnerPaymentOtpActivity.MediaMetadataCompat();
            pushScope(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final void beginArray() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(getPath());
        throw new JsonDataException(sb.toString());
    }

    public final void endArray() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 4) {
            this.stackSize--;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_ARRAY but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(getPath());
        throw new JsonDataException(sb.toString());
    }

    public final void beginObject() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 1) {
            pushScope(3);
            this.peeked = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(getPath());
        throw new JsonDataException(sb.toString());
    }

    public final void endObject() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 2) {
            this.stackSize--;
            this.pathNames[this.stackSize] = null;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_OBJECT but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(getPath());
        throw new JsonDataException(sb.toString());
    }

    public final boolean hasNext() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    public final JsonReader.Token peek() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    private int doPeek() throws IOException {
        int i = this.scopes[this.stackSize - 1];
        if (i == 1) {
            this.scopes[this.stackSize - 1] = 2;
        } else if (i == 2) {
            int nextNonWhitespace = nextNonWhitespace(true);
            this.buffer.MediaBrowserCompat$SearchResultReceiver();
            if (nextNonWhitespace != 44) {
                if (nextNonWhitespace == 59) {
                    checkLenient();
                } else if (nextNonWhitespace == 93) {
                    this.peeked = 4;
                    return 4;
                } else {
                    throw syntaxError("Unterminated array");
                }
            }
        } else if (i == 3 || i == 5) {
            this.scopes[this.stackSize - 1] = 4;
            if (i == 5) {
                int nextNonWhitespace2 = nextNonWhitespace(true);
                this.buffer.MediaBrowserCompat$SearchResultReceiver();
                if (nextNonWhitespace2 != 44) {
                    if (nextNonWhitespace2 == 59) {
                        checkLenient();
                    } else if (nextNonWhitespace2 == 125) {
                        this.peeked = 2;
                        return 2;
                    } else {
                        throw syntaxError("Unterminated object");
                    }
                }
            }
            int nextNonWhitespace3 = nextNonWhitespace(true);
            if (nextNonWhitespace3 == 34) {
                this.buffer.MediaBrowserCompat$SearchResultReceiver();
                this.peeked = 13;
                return 13;
            } else if (nextNonWhitespace3 == 39) {
                this.buffer.MediaBrowserCompat$SearchResultReceiver();
                checkLenient();
                this.peeked = 12;
                return 12;
            } else if (nextNonWhitespace3 != 125) {
                checkLenient();
                if (isLiteral((char) nextNonWhitespace3)) {
                    this.peeked = 14;
                    return 14;
                }
                throw syntaxError("Expected name");
            } else if (i != 5) {
                this.buffer.MediaBrowserCompat$SearchResultReceiver();
                this.peeked = 2;
                return 2;
            } else {
                throw syntaxError("Expected name");
            }
        } else if (i == 4) {
            this.scopes[this.stackSize - 1] = 5;
            int nextNonWhitespace4 = nextNonWhitespace(true);
            this.buffer.MediaBrowserCompat$SearchResultReceiver();
            if (nextNonWhitespace4 != 58) {
                if (nextNonWhitespace4 == 61) {
                    checkLenient();
                    if (this.source.MediaBrowserCompat$SearchResultReceiver(1) && this.buffer.read(0) == 62) {
                        this.buffer.MediaBrowserCompat$SearchResultReceiver();
                    }
                } else {
                    throw syntaxError("Expected ':'");
                }
            }
        } else if (i == 6) {
            this.scopes[this.stackSize - 1] = 7;
        } else if (i == 7) {
            if (nextNonWhitespace(false) == -1) {
                this.peeked = 18;
                return 18;
            }
            checkLenient();
        } else if (i == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            this.buffer.MediaBrowserCompat$SearchResultReceiver();
            this.peeked = 9;
            return 9;
        } else if (nextNonWhitespace5 != 39) {
            if (!(nextNonWhitespace5 == 44 || nextNonWhitespace5 == 59)) {
                if (nextNonWhitespace5 == 91) {
                    this.buffer.MediaBrowserCompat$SearchResultReceiver();
                    this.peeked = 3;
                    return 3;
                } else if (nextNonWhitespace5 != 93) {
                    if (nextNonWhitespace5 != 123) {
                        int peekKeyword = peekKeyword();
                        if (peekKeyword != 0) {
                            return peekKeyword;
                        }
                        int peekNumber = peekNumber();
                        if (peekNumber != 0) {
                            return peekNumber;
                        }
                        if (isLiteral(this.buffer.read(0))) {
                            checkLenient();
                            this.peeked = 10;
                            return 10;
                        }
                        throw syntaxError("Expected value");
                    }
                    this.buffer.MediaBrowserCompat$SearchResultReceiver();
                    this.peeked = 1;
                    return 1;
                } else if (i == 1) {
                    this.buffer.MediaBrowserCompat$SearchResultReceiver();
                    this.peeked = 4;
                    return 4;
                }
            }
            if (i == 1 || i == 2) {
                checkLenient();
                this.peeked = 7;
                return 7;
            }
            throw syntaxError("Unexpected value");
        } else {
            checkLenient();
            this.buffer.MediaBrowserCompat$SearchResultReceiver();
            this.peeked = 8;
            return 8;
        }
    }

    private int peekKeyword() throws IOException {
        String str;
        String str2;
        int i;
        byte read = this.buffer.read(0);
        if (read == 116 || read == 84) {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (read == 102 || read == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (read != 110 && read != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.source.MediaBrowserCompat$SearchResultReceiver((long) i3)) {
                return 0;
            }
            byte read2 = this.buffer.read((long) i2);
            if (read2 != str2.charAt(i2) && read2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.source.MediaBrowserCompat$SearchResultReceiver((long) (length + 1)) && isLiteral(this.buffer.read((long) length))) {
            return 0;
        }
        this.buffer.MediaBrowserCompat$MediaItem((long) length);
        this.peeked = i;
        return i;
    }

    private int peekNumber() throws IOException {
        byte read;
        char c;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        int i = 0;
        char c2 = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i + 1;
            if (!this.source.MediaBrowserCompat$SearchResultReceiver((long) i2)) {
                break;
            }
            read = this.buffer.read((long) i);
            if (read == 43) {
                c = 6;
                if (c2 != 5) {
                    return 0;
                }
            } else if (read == 69 || read == 101) {
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i = i2;
                j = 0;
            } else if (read == 45) {
                c = 6;
                if (c2 == 0) {
                    c2 = 1;
                    z2 = true;
                    i = i2;
                    j = 0;
                } else if (c2 != 5) {
                    return 0;
                }
            } else if (read == 46) {
                c = 3;
                if (c2 != 2) {
                    return 0;
                }
            } else if (read >= 48 && read <= 57) {
                if (c2 == 1 || c2 == 0) {
                    j2 = (long) (-(read + ISO7816.INS_WRITE_BINARY));
                    c2 = 2;
                    i = i2;
                    j = 0;
                } else {
                    if (c2 == 2) {
                        if (j2 == j) {
                            return 0;
                        }
                        long j3 = (10 * j2) - ((long) (read + ISO7816.INS_WRITE_BINARY));
                        int i3 = (j2 > MIN_INCOMPLETE_INTEGER ? 1 : (j2 == MIN_INCOMPLETE_INTEGER ? 0 : -1));
                        z = (i3 > 0 || (i3 == 0 && j3 < j2)) & z;
                        j2 = j3;
                    } else if (c2 == 3) {
                        c2 = 4;
                    } else if (c2 == 5 || c2 == 6) {
                        c2 = 7;
                    }
                    i = i2;
                    j = 0;
                }
            }
            c2 = c;
            i = i2;
            j = 0;
        }
        if (isLiteral(read)) {
            return 0;
        }
        if (c2 == 2 && z && ((j2 != Long.MIN_VALUE || z2) && (j2 != 0 || !z2))) {
            if (!z2) {
                j2 = -j2;
            }
            this.peekedLong = j2;
            this.buffer.MediaBrowserCompat$MediaItem((long) i);
            this.peeked = 16;
            return 16;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.peekedNumberLength = i;
            this.peeked = 17;
            return 17;
        }
    }

    private boolean isLiteral(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    public final String nextName() throws IOException {
        String str;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 14) {
            str = nextUnquotedValue();
        } else if (i == 13) {
            str = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 12) {
            str = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == 15) {
            str = this.peekedString;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a name but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new JsonDataException(sb.toString());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = str;
        return str;
    }

    public final int selectName(JsonReader.Options options) throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return findName(this.peekedString, options);
        }
        int read = this.source.read(options.doubleQuoteSuffix);
        if (read != -1) {
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = options.strings[read];
            return read;
        }
        String str = this.pathNames[this.stackSize - 1];
        String nextName = nextName();
        int findName = findName(nextName, options);
        if (findName == -1) {
            this.peeked = 15;
            this.peekedString = nextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return findName;
    }

    public final void skipName() throws IOException {
        if (!this.failOnUnknown) {
            int i = this.peeked;
            if (i == 0) {
                i = doPeek();
            }
            if (i == 14) {
                skipUnquotedValue();
            } else if (i == 13) {
                skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
            } else if (i == 12) {
                skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
            } else if (i != 15) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a name but was ");
                sb.append(peek());
                sb.append(" at path ");
                sb.append(getPath());
                throw new JsonDataException(sb.toString());
            }
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = "null";
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot skip unexpected ");
        sb2.append(peek());
        sb2.append(" at ");
        sb2.append(getPath());
        throw new JsonDataException(sb2.toString());
    }

    private int findName(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.strings[i])) {
                this.peeked = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final String nextString() throws IOException {
        String str;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 10) {
            str = nextUnquotedValue();
        } else if (i == 9) {
            str = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 8) {
            str = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (i == 16) {
            str = Long.toString(this.peekedLong);
        } else if (i == 17) {
            str = this.buffer.IconCompatParcelizer((long) this.peekedNumberLength, GroupFavoriteActivity.IconCompatParcelizer);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a string but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new JsonDataException(sb.toString());
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    private int findString(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.strings[i])) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i2 = this.stackSize - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    public final boolean nextBoolean() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a boolean but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new JsonDataException(sb.toString());
        }
    }

    public final double nextDouble() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 16) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.peekedLong;
        }
        if (i == 17) {
            this.peekedString = this.buffer.IconCompatParcelizer((long) this.peekedNumberLength, GroupFavoriteActivity.IconCompatParcelizer);
        } else if (i == 9) {
            this.peekedString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 8) {
            this.peekedString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a double but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(getPath());
            throw new JsonDataException(sb.toString());
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            if (this.lenient || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("JSON forbids NaN and infinities: ");
            sb2.append(parseDouble);
            sb2.append(" at path ");
            sb2.append(getPath());
            throw new JsonEncodingException(sb2.toString());
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Expected a double but was ");
            sb3.append(this.peekedString);
            sb3.append(" at path ");
            sb3.append(getPath());
            throw new JsonDataException(sb3.toString());
        }
    }

    private String nextQuotedValue(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long read = this.source.read(sCBUniversalWebViewActivity_ViewBinding);
            if (read == -1) {
                throw syntaxError("Unterminated string");
            } else if (this.buffer.read(read) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.buffer.IconCompatParcelizer(read, GroupFavoriteActivity.IconCompatParcelizer));
                this.buffer.MediaBrowserCompat$SearchResultReceiver();
                sb.append(readEscapeCharacter());
            } else if (sb == null) {
                String IconCompatParcelizer = this.buffer.IconCompatParcelizer(read, GroupFavoriteActivity.IconCompatParcelizer);
                this.buffer.MediaBrowserCompat$SearchResultReceiver();
                return IconCompatParcelizer;
            } else {
                sb.append(this.buffer.IconCompatParcelizer(read, GroupFavoriteActivity.IconCompatParcelizer));
                this.buffer.MediaBrowserCompat$SearchResultReceiver();
                return sb.toString();
            }
        }
    }

    private String nextUnquotedValue() throws IOException {
        long read = this.source.read(UNQUOTED_STRING_TERMINALS);
        if (read != -1) {
            return this.buffer.IconCompatParcelizer(read, GroupFavoriteActivity.IconCompatParcelizer);
        }
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.buffer;
        return sCBUniversalWebViewActivity.IconCompatParcelizer(sCBUniversalWebViewActivity.read, GroupFavoriteActivity.IconCompatParcelizer);
    }

    private void skipQuotedValue(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException {
        while (true) {
            long read = this.source.read(sCBUniversalWebViewActivity_ViewBinding);
            if (read == -1) {
                throw syntaxError("Unterminated string");
            } else if (this.buffer.read(read) == 92) {
                this.buffer.MediaBrowserCompat$MediaItem(read + 1);
                readEscapeCharacter();
            } else {
                this.buffer.MediaBrowserCompat$MediaItem(read + 1);
                return;
            }
        }
    }

    private void skipUnquotedValue() throws IOException {
        long read = this.source.read(UNQUOTED_STRING_TERMINALS);
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.buffer;
        if (read == -1) {
            read = sCBUniversalWebViewActivity.read;
        }
        sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(read);
    }

    public final int nextInt() throws IOException {
        String str;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 16) {
            long j = this.peekedLong;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected an int but was ");
            sb.append(this.peekedLong);
            sb.append(" at path ");
            sb.append(getPath());
            throw new JsonDataException(sb.toString());
        }
        if (i == 17) {
            this.peekedString = this.buffer.IconCompatParcelizer((long) this.peekedNumberLength, GroupFavoriteActivity.IconCompatParcelizer);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
            } else {
                str = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            }
            this.peekedString = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected an int but was ");
            sb2.append(peek());
            sb2.append(" at path ");
            sb2.append(getPath());
            throw new JsonDataException(sb2.toString());
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr3 = this.pathIndices;
                int i6 = this.stackSize - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Expected an int but was ");
            sb3.append(this.peekedString);
            sb3.append(" at path ");
            sb3.append(getPath());
            throw new JsonDataException(sb3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Expected an int but was ");
            sb4.append(this.peekedString);
            sb4.append(" at path ");
            sb4.append(getPath());
            throw new JsonDataException(sb4.toString());
        }
    }

    public final void close() throws IOException {
        this.peeked = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.buffer;
        sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(sCBUniversalWebViewActivity.read);
        this.source.close();
    }

    public final void skipValue() throws IOException {
        if (!this.failOnUnknown) {
            int i = 0;
            do {
                int i2 = this.peeked;
                if (i2 == 0) {
                    i2 = doPeek();
                }
                if (i2 == 3) {
                    pushScope(1);
                } else if (i2 == 1) {
                    pushScope(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.stackSize--;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected a value but was ");
                            sb.append(peek());
                            sb.append(" at path ");
                            sb.append(getPath());
                            throw new JsonDataException(sb.toString());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.stackSize--;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected a value but was ");
                            sb2.append(peek());
                            sb2.append(" at path ");
                            sb2.append(getPath());
                            throw new JsonDataException(sb2.toString());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        skipUnquotedValue();
                    } else if (i2 == 9 || i2 == 13) {
                        skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                    } else if (i2 == 8 || i2 == 12) {
                        skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                    } else if (i2 == 17) {
                        this.buffer.MediaBrowserCompat$MediaItem((long) this.peekedNumberLength);
                    } else if (i2 == 18) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Expected a value but was ");
                        sb3.append(peek());
                        sb3.append(" at path ");
                        sb3.append(getPath());
                        throw new JsonDataException(sb3.toString());
                    }
                    this.peeked = 0;
                }
                i++;
                this.peeked = 0;
            } while (i != 0);
            int[] iArr = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr[i3] = iArr[i3] + 1;
            this.pathNames[this.stackSize - 1] = "null";
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Cannot skip unexpected ");
        sb4.append(peek());
        sb4.append(" at ");
        sb4.append(getPath());
        throw new JsonDataException(sb4.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r5.buffer.MediaBrowserCompat$MediaItem((long) (r2 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r0 != 47) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r5.source.MediaBrowserCompat$SearchResultReceiver(2) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        checkLenient();
        r2 = r5.buffer.read(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r2 == 42) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r2 == 47) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        r5.buffer.MediaBrowserCompat$SearchResultReceiver();
        r5.buffer.MediaBrowserCompat$SearchResultReceiver();
        skipToEndOfLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        r5.buffer.MediaBrowserCompat$SearchResultReceiver();
        r5.buffer.MediaBrowserCompat$SearchResultReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (skipToEndOfBlockComment() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        throw syntaxError("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r0 != 35) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        checkLenient();
        skipToEndOfLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int nextNonWhitespace(boolean r6) throws java.io.IOException {
        /*
            r5 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            o.NsipPartnerPaymentOtpActivity r1 = r5.source
            int r2 = r0 + 1
            long r3 = (long) r2
            boolean r1 = r1.MediaBrowserCompat$SearchResultReceiver(r3)
            if (r1 == 0) goto L_0x0080
            o.SCBUniversalWebViewActivity r1 = r5.buffer
            long r3 = (long) r0
            byte r0 = r1.read((long) r3)
            r1 = 10
            if (r0 == r1) goto L_0x007e
            r1 = 32
            if (r0 == r1) goto L_0x007e
            r1 = 13
            if (r0 == r1) goto L_0x007e
            r1 = 9
            if (r0 == r1) goto L_0x007e
            o.SCBUniversalWebViewActivity r1 = r5.buffer
            int r2 = r2 + -1
            long r2 = (long) r2
            r1.MediaBrowserCompat$MediaItem((long) r2)
            r1 = 47
            if (r0 != r1) goto L_0x0072
            o.NsipPartnerPaymentOtpActivity r2 = r5.source
            r3 = 2
            boolean r2 = r2.MediaBrowserCompat$SearchResultReceiver(r3)
            if (r2 != 0) goto L_0x003a
            return r0
        L_0x003a:
            r5.checkLenient()
            o.SCBUniversalWebViewActivity r2 = r5.buffer
            r3 = 1
            byte r2 = r2.read((long) r3)
            r3 = 42
            if (r2 == r3) goto L_0x005a
            if (r2 == r1) goto L_0x004c
            return r0
        L_0x004c:
            o.SCBUniversalWebViewActivity r0 = r5.buffer
            r0.MediaBrowserCompat$SearchResultReceiver()
            o.SCBUniversalWebViewActivity r0 = r5.buffer
            r0.MediaBrowserCompat$SearchResultReceiver()
            r5.skipToEndOfLine()
            goto L_0x0000
        L_0x005a:
            o.SCBUniversalWebViewActivity r0 = r5.buffer
            r0.MediaBrowserCompat$SearchResultReceiver()
            o.SCBUniversalWebViewActivity r0 = r5.buffer
            r0.MediaBrowserCompat$SearchResultReceiver()
            boolean r0 = r5.skipToEndOfBlockComment()
            if (r0 == 0) goto L_0x006b
            goto L_0x0000
        L_0x006b:
            java.lang.String r6 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r6 = r5.syntaxError(r6)
            throw r6
        L_0x0072:
            r1 = 35
            if (r0 != r1) goto L_0x007d
            r5.checkLenient()
            r5.skipToEndOfLine()
            goto L_0x0000
        L_0x007d:
            return r0
        L_0x007e:
            r0 = r2
            goto L_0x0001
        L_0x0080:
            if (r6 != 0) goto L_0x0084
            r6 = -1
            return r6
        L_0x0084:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonUtf8Reader.nextNonWhitespace(boolean):int");
    }

    private void checkLenient() throws IOException {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void skipToEndOfLine() throws IOException {
        long read = this.source.read(LINEFEED_OR_CARRIAGE_RETURN);
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.buffer;
        sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(read != -1 ? read + 1 : sCBUniversalWebViewActivity.read);
    }

    private boolean skipToEndOfBlockComment() throws IOException {
        long write = this.source.write(CLOSING_BLOCK_COMMENT);
        boolean z = write != -1;
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity = this.buffer;
        sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(z ? write + ((long) CLOSING_BLOCK_COMMENT.write()) : sCBUniversalWebViewActivity.read);
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JsonReader(");
        sb.append(this.source);
        sb.append(")");
        return sb.toString();
    }

    private char readEscapeCharacter() throws IOException {
        int i;
        int i2;
        if (this.source.MediaBrowserCompat$SearchResultReceiver(1)) {
            byte MediaBrowserCompat$SearchResultReceiver = this.buffer.MediaBrowserCompat$SearchResultReceiver();
            if (MediaBrowserCompat$SearchResultReceiver == 10 || MediaBrowserCompat$SearchResultReceiver == 34 || MediaBrowserCompat$SearchResultReceiver == 39 || MediaBrowserCompat$SearchResultReceiver == 47 || MediaBrowserCompat$SearchResultReceiver == 92) {
                return (char) MediaBrowserCompat$SearchResultReceiver;
            }
            if (MediaBrowserCompat$SearchResultReceiver == 98) {
                return 8;
            }
            if (MediaBrowserCompat$SearchResultReceiver == 102) {
                return 12;
            }
            if (MediaBrowserCompat$SearchResultReceiver == 110) {
                return 10;
            }
            if (MediaBrowserCompat$SearchResultReceiver == 114) {
                return 13;
            }
            if (MediaBrowserCompat$SearchResultReceiver == 116) {
                return 9;
            }
            if (MediaBrowserCompat$SearchResultReceiver != 117) {
                if (this.lenient) {
                    return (char) MediaBrowserCompat$SearchResultReceiver;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid escape sequence: \\");
                sb.append((char) MediaBrowserCompat$SearchResultReceiver);
                throw syntaxError(sb.toString());
            } else if (this.source.MediaBrowserCompat$SearchResultReceiver(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte read = this.buffer.read((long) i3);
                    char c2 = (char) (c << 4);
                    if (read < 48 || read > 57) {
                        if (read >= 97 && read <= 102) {
                            i2 = read - 97;
                        } else if (read < 65 || read > 70) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("\\u");
                            sb2.append(this.buffer.IconCompatParcelizer(4, GroupFavoriteActivity.IconCompatParcelizer));
                            throw syntaxError(sb2.toString());
                        } else {
                            i2 = read - 65;
                        }
                        i = i2 + 10;
                    } else {
                        i = read + ISO7816.INS_WRITE_BINARY;
                    }
                    c = (char) (c2 + i);
                }
                this.buffer.MediaBrowserCompat$MediaItem(4);
                return c;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unterminated escape sequence at path ");
                sb3.append(getPath());
                throw new EOFException(sb3.toString());
            }
        } else {
            throw syntaxError("Unterminated escape sequence");
        }
    }
}
