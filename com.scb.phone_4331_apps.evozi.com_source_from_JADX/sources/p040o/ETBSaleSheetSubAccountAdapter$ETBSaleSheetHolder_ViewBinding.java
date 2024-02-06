package p040o;

import java.io.IOException;
import java.net.Proxy;

/* renamed from: o.ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding */
public final class ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding extends ETBEligibilityAdapter$EligibilityHolder_ViewBinding {
    private String MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private ETBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding MediaMetadataCompat;
    private int RatingCompat;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding(java.lang.String r3, int r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "https://"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ":"
            r0.append(r1)
            r0.append(r4)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r6)
            r2.MediaDescriptionCompat = r3
            r2.RatingCompat = r4
            r2.MediaBrowserCompat$SearchResultReceiver = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder_ViewBinding.<init>(java.lang.String, int, java.lang.String, int):void");
    }

    public final BusinessAndMaritalInfoInputViewHolder_ViewBinding read() throws IOException {
        ETBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding eTBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding = this.MediaMetadataCompat;
        if (eTBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding != null) {
            return eTBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding;
        }
        ETBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding eTBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding2 = new ETBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding((Proxy) null, this.MediaDescriptionCompat, this.RatingCompat, this.MediaBrowserCompat$SearchResultReceiver, this.read);
        this.MediaMetadataCompat = eTBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding2;
        return eTBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding2;
    }
}
