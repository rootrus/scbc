package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getQueryParamsFor$MediaBrowserCompat$SearchResultReceiver */
final class getQueryParamsFor$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getSignature> {
    private /* synthetic */ getQueryParamsFor write;

    getQueryParamsFor$MediaBrowserCompat$SearchResultReceiver(getQueryParamsFor getqueryparamsfor) {
        this.write = getqueryparamsfor;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getSignature getsignature = (getSignature) obj;
        getsignature.write(getQueryParamsFor.write(this.write), getQueryParamsFor.MediaBrowserCompat$CustomActionResultReceiver(this.write));
        getsignature.IconCompatParcelizer(getQueryParamsFor.write(this.write).MediaBrowserCompat$ItemReceiver);
    }
}
