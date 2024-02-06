package okhttp3.internal.http;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Protocol;
import okhttp3.Response;
import p040o.GoodToKnowActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class StatusLine {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    public StatusLine(Protocol protocol2, int i, String str) {
        onGetStartedClick.write((Object) protocol2, "protocol");
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        this.protocol = protocol2;
        this.code = i;
        this.message = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String obj = sb.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder().apply(builderAction).toString()");
        return obj;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final StatusLine get(Response response) {
            onGetStartedClick.write((Object) response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String str) throws IOException {
            Protocol protocol;
            String str2;
            onGetStartedClick.write((Object) str, "statusLine");
            int i = 9;
            if (GoodToKnowActivity.read(str, "HTTP/1.", false)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected status line: ");
                    sb.append(str);
                    throw new ProtocolException(sb.toString());
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unexpected status line: ");
                    sb2.append(str);
                    throw new ProtocolException(sb2.toString());
                }
            } else if (GoodToKnowActivity.read(str, "ICY ", false)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unexpected status line: ");
                sb3.append(str);
                throw new ProtocolException(sb3.toString());
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        onGetStartedClick.IconCompatParcelizer((Object) str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Unexpected status line: ");
                        sb4.append(str);
                        throw new ProtocolException(sb4.toString());
                    }
                    return new StatusLine(protocol, parseInt, str2);
                } catch (NumberFormatException unused) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Unexpected status line: ");
                    sb5.append(str);
                    throw new ProtocolException(sb5.toString());
                }
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Unexpected status line: ");
                sb6.append(str);
                throw new ProtocolException(sb6.toString());
            }
        }
    }
}
