package p040o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import p040o.rsnAllocationGenerateMipmaps;

/* renamed from: o.nScriptSetVarVE */
public class nScriptSetVarVE extends rsnAllocationGenerateMipmaps {
    @rsnAllocationIoSend(write = "Accept")
    private List<String> accept;
    @rsnAllocationIoSend(write = "Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    @rsnAllocationIoSend(write = "Age")
    private List<Long> age;
    @rsnAllocationIoSend(write = "WWW-Authenticate")
    private List<String> authenticate;
    @rsnAllocationIoSend(write = "Authorization")
    private List<String> authorization;
    @rsnAllocationIoSend(write = "Cache-Control")
    private List<String> cacheControl;
    @rsnAllocationIoSend(write = "Content-Encoding")
    private List<String> contentEncoding;
    @rsnAllocationIoSend(write = "Content-Length")
    private List<Long> contentLength;
    @rsnAllocationIoSend(write = "Content-MD5")
    private List<String> contentMD5;
    @rsnAllocationIoSend(write = "Content-Range")
    private List<String> contentRange;
    @rsnAllocationIoSend(write = "Content-Type")
    private List<String> contentType;
    @rsnAllocationIoSend(write = "Cookie")
    private List<String> cookie;
    @rsnAllocationIoSend(write = "Date")
    private List<String> date;
    @rsnAllocationIoSend(write = "ETag")
    private List<String> etag;
    @rsnAllocationIoSend(write = "Expires")
    private List<String> expires;
    @rsnAllocationIoSend(write = "If-Match")
    private List<String> ifMatch;
    @rsnAllocationIoSend(write = "If-Modified-Since")
    private List<String> ifModifiedSince;
    @rsnAllocationIoSend(write = "If-None-Match")
    private List<String> ifNoneMatch;
    @rsnAllocationIoSend(write = "If-Range")
    private List<String> ifRange;
    @rsnAllocationIoSend(write = "If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @rsnAllocationIoSend(write = "Last-Modified")
    private List<String> lastModified;
    @rsnAllocationIoSend(write = "Location")
    private List<String> location;
    @rsnAllocationIoSend(write = "MIME-Version")
    private List<String> mimeVersion;
    @rsnAllocationIoSend(write = "Range")
    private List<String> range;
    @rsnAllocationIoSend(write = "Retry-After")
    private List<String> retryAfter;
    @rsnAllocationIoSend(write = "User-Agent")
    private List<String> userAgent;
    @rsnAllocationIoSend(write = "Warning")
    private List<String> warning;

    public nScriptSetVarVE() {
        super(EnumSet.of(rsnAllocationGenerateMipmaps.read.IGNORE_CASE));
    }

    public final nScriptSetVarVE MediaBrowserCompat$CustomActionResultReceiver(String str, Object obj) {
        return (nScriptSetVarVE) super.set(str, obj);
    }

    public /* bridge */ /* synthetic */ rsnAllocationGenerateMipmaps set(String str, Object obj) {
        return (nScriptSetVarVE) super.set(str, obj);
    }
}
