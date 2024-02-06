package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.GoogleMap;

/* renamed from: o.zzvf */
public class zzvf {
    @SerializedName("debitCard")
    public zzrn IconCompatParcelizer;
    @SerializedName("debitCardList")
    public List<zzun> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("depositList")
    public List<zzup> MediaBrowserCompat$ItemReceiver;
    @SerializedName("loanList")
    public List<zzrt> MediaBrowserCompat$MediaItem;
    @SerializedName("smeLoanList")
    public List<zzrt> MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("merchantWalletList")
    public List<zzur> MediaDescriptionCompat;
    @SerializedName("securitiesList")
    public GoogleMap.OnMapClickListener MediaMetadataCompat;
    @SerializedName("prepaidAccountList")
    public List<zzry> RatingCompat;
    @SerializedName("cardList")
    public List<onIndoorLevelActivated> read;
    @SerializedName("clientList")
    public List<zzrr> write;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r0 = r1.write;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r0 = r1.MediaBrowserCompat$SearchResultReceiver;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        r0 = r1.MediaDescriptionCompat;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        r0 = r1.RatingCompat;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.read;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = r1.MediaBrowserCompat$MediaItem;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean write() {
        /*
            r1 = this;
            java.util.List<o.zzup> r0 = r1.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0046
        L_0x000a:
            java.util.List<o.onIndoorLevelActivated> r0 = r1.read
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0046
        L_0x0014:
            java.util.List<o.zzrt> r0 = r1.MediaBrowserCompat$MediaItem
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0046
        L_0x001e:
            java.util.List<o.zzrr> r0 = r1.write
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0046
        L_0x0028:
            java.util.List<o.zzrt> r0 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0046
        L_0x0032:
            java.util.List<o.zzur> r0 = r1.MediaDescriptionCompat
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0046
        L_0x003c:
            java.util.List<o.zzry> r0 = r1.RatingCompat
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0048
        L_0x0046:
            r0 = 1
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.zzvf.write():boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzvf zzvf = (zzvf) obj;
        return new AddNewCurrencyActivity_ViewBinding().read(this.MediaBrowserCompat$ItemReceiver, zzvf.MediaBrowserCompat$ItemReceiver).read(this.read, zzvf.read).read(this.MediaBrowserCompat$MediaItem, zzvf.MediaBrowserCompat$MediaItem).read(this.write, zzvf.write).read(this.MediaBrowserCompat$SearchResultReceiver, zzvf.MediaBrowserCompat$SearchResultReceiver).read(this.MediaDescriptionCompat, zzvf.MediaDescriptionCompat).read(this.RatingCompat, zzvf.RatingCompat).read(this.MediaMetadataCompat, zzvf.MediaMetadataCompat).MediaBrowserCompat$ItemReceiver;
    }

    public int hashCode() {
        return new DetailsTabHolder_ViewBinding((byte) 0).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver(this.read).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem).MediaBrowserCompat$CustomActionResultReceiver(this.write).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver).MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat).MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat).MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat).read;
    }
}
