package okhttp3;

import java.io.File;

public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ File $this_asRequestBody;

    RequestBody$Companion$asRequestBody$1(File file, MediaType mediaType) {
        this.$this_asRequestBody = file;
        this.$contentType = mediaType;
    }

    public final MediaType contentType() {
        return this.$contentType;
    }

    public final long contentLength() {
        return this.$this_asRequestBody.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeTo(p040o.NsipPartnerPaymentReviewActivity r3) {
        /*
            r2 = this;
            java.lang.String r0 = "sink"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            java.io.File r0 = r2.$this_asRequestBody
            o.HowToAddAccountStep2Activity r0 = p040o.onSubmit.IconCompatParcelizer((java.io.File) r0)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            o.HowToAddAccountStep2Activity r1 = (p040o.HowToAddAccountStep2Activity) r1     // Catch:{ all -> 0x0018 }
            r3.MediaBrowserCompat$CustomActionResultReceiver((p040o.HowToAddAccountStep2Activity) r1)     // Catch:{ all -> 0x0018 }
            r3 = 0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r3)
            return
        L_0x0018:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001a }
        L_0x001a:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody$Companion$asRequestBody$1.writeTo(o.NsipPartnerPaymentReviewActivity):void");
    }
}
