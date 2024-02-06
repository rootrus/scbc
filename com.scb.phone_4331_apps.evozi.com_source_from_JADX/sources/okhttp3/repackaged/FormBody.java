package okhttp3.repackaged;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.repackaged.internal.Util;
import p040o.onLoginButtonClick;
import p040o.onMenuPromptPayClick;

public final class FormBody extends RequestBody {
    private static final MediaType ahB = MediaType.parse("application/x-www-form-urlencoded");
    private final List<String> ahC;
    private final List<String> ahD;

    private FormBody(List<String> list, List<String> list2) {
        this.ahC = Util.immutableList(list);
        this.ahD = Util.immutableList(list2);
    }

    public final int size() {
        return this.ahC.size();
    }

    public final String encodedName(int i) {
        return this.ahC.get(i);
    }

    public final String name(int i) {
        return HttpUrl.percentDecode(encodedName(i), true);
    }

    public final String encodedValue(int i) {
        return this.ahD.get(i);
    }

    public final String value(int i) {
        return HttpUrl.percentDecode(encodedValue(i), true);
    }

    public final MediaType contentType() {
        return ahB;
    }

    public final long contentLength() {
        return m5832a((onLoginButtonClick) null, true);
    }

    public final void writeTo(onLoginButtonClick onloginbuttonclick) throws IOException {
        m5832a(onloginbuttonclick, false);
    }

    /* renamed from: a */
    private long m5832a(onLoginButtonClick onloginbuttonclick, boolean z) {
        onMenuPromptPayClick onmenupromptpayclick;
        if (z) {
            onmenupromptpayclick = new onMenuPromptPayClick();
        } else {
            onmenupromptpayclick = onloginbuttonclick.MediaBrowserCompat$ItemReceiver();
        }
        int size = this.ahC.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                onmenupromptpayclick.MediaBrowserCompat$ItemReceiver(38);
            }
            String str = this.ahC.get(i);
            onmenupromptpayclick.read(str, 0, str.length());
            onmenupromptpayclick.MediaBrowserCompat$ItemReceiver(61);
            String str2 = this.ahD.get(i);
            onmenupromptpayclick.read(str2, 0, str2.length());
        }
        if (!z) {
            return 0;
        }
        long j = onmenupromptpayclick.IconCompatParcelizer;
        try {
            onmenupromptpayclick.MediaMetadataCompat(onmenupromptpayclick.IconCompatParcelizer);
            return j;
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public static final class Builder {
        private final List<String> ahE = new ArrayList();
        private final List<String> ahF = new ArrayList();

        public final Builder add(String str, String str2) {
            this.ahE.add(HttpUrl.canonicalize(str, HttpUrl.FORM_ENCODE_SET, false, false, true, true));
            this.ahF.add(HttpUrl.canonicalize(str2, HttpUrl.FORM_ENCODE_SET, false, false, true, true));
            return this;
        }

        public final Builder addEncoded(String str, String str2) {
            this.ahE.add(HttpUrl.canonicalize(str, HttpUrl.FORM_ENCODE_SET, true, false, true, true));
            this.ahF.add(HttpUrl.canonicalize(str2, HttpUrl.FORM_ENCODE_SET, true, false, true, true));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.ahE, this.ahF);
        }
    }
}
