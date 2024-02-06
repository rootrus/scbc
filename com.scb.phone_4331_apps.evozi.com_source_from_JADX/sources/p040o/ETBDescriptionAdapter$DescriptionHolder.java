package p040o;

import java.util.Vector;

/* renamed from: o.ETBDescriptionAdapter$DescriptionHolder */
public class ETBDescriptionAdapter$DescriptionHolder extends BusinessAndMaritalInfoNationalIdViewHolder implements BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding, EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding {
    String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    String MediaBrowserCompat$ItemReceiver;
    Vector read;

    public ETBDescriptionAdapter$DescriptionHolder() {
        this("", "");
    }

    public ETBDescriptionAdapter$DescriptionHolder(String str, String str2) {
        this.read = new Vector();
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[LOOP:0: B:11:0x002c->B:31:0x007d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p040o.ETBDescriptionAdapter$DescriptionHolder
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            o.ETBDescriptionAdapter$DescriptionHolder r8 = (p040o.ETBDescriptionAdapter$DescriptionHolder) r8
            java.lang.String r0 = r7.MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = r8.MediaBrowserCompat$ItemReceiver
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r7.IconCompatParcelizer
            java.lang.String r2 = r8.IconCompatParcelizer
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0085
            java.util.Vector r0 = r7.read
            int r0 = r0.size()
            java.util.Vector r2 = r8.read
            int r2 = r2.size()
            if (r0 == r2) goto L_0x002b
            return r1
        L_0x002b:
            r2 = r1
        L_0x002c:
            if (r2 >= r0) goto L_0x0080
            java.util.Vector r3 = r7.read
            java.lang.Object r3 = r3.elementAt(r2)
            java.util.Vector r4 = r8.read
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x0079
            java.util.Vector r4 = r8.read
            java.lang.Object r4 = r4.elementAt(r2)
            boolean r5 = r3 instanceof p040o.ETBProductDetailAdapter$ETBProductDetailViewHolder
            if (r5 == 0) goto L_0x0068
            boolean r5 = r4 instanceof p040o.ETBProductDetailAdapter$ETBProductDetailViewHolder
            if (r5 == 0) goto L_0x0068
            o.ETBProductDetailAdapter$ETBProductDetailViewHolder r3 = (p040o.ETBProductDetailAdapter$ETBProductDetailViewHolder) r3
            o.ETBProductDetailAdapter$ETBProductDetailViewHolder r4 = (p040o.ETBProductDetailAdapter$ETBProductDetailViewHolder) r4
            java.lang.String r5 = r3.MediaSessionCompat$QueueItem
            java.lang.String r6 = r4.MediaSessionCompat$QueueItem
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0079
            java.lang.Object r3 = r3.IconCompatParcelizer()
            java.lang.Object r4 = r4.IconCompatParcelizer()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0079
            r3 = 1
            goto L_0x007a
        L_0x0068:
            boolean r5 = r3 instanceof p040o.ETBDescriptionAdapter$DescriptionHolder
            if (r5 == 0) goto L_0x0079
            boolean r5 = r4 instanceof p040o.ETBDescriptionAdapter$DescriptionHolder
            if (r5 == 0) goto L_0x0079
            o.ETBDescriptionAdapter$DescriptionHolder r3 = (p040o.ETBDescriptionAdapter$DescriptionHolder) r3
            o.ETBDescriptionAdapter$DescriptionHolder r4 = (p040o.ETBDescriptionAdapter$DescriptionHolder) r4
            boolean r3 = r3.equals(r4)
            goto L_0x007a
        L_0x0079:
            r3 = r1
        L_0x007a:
            if (r3 != 0) goto L_0x007d
            return r1
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x002c
        L_0x0080:
            boolean r8 = r7.write(r8)
            return r8
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ETBDescriptionAdapter$DescriptionHolder.equals(java.lang.Object):boolean");
    }

    public final Object read(int i) {
        Object elementAt = this.read.elementAt(i);
        if (elementAt instanceof ETBProductDetailAdapter$ETBProductDetailViewHolder) {
            return ((ETBProductDetailAdapter$ETBProductDetailViewHolder) elementAt).IconCompatParcelizer();
        }
        return (ETBDescriptionAdapter$DescriptionHolder) elementAt;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public final ETBDescriptionAdapter$DescriptionHolder MediaBrowserCompat$CustomActionResultReceiver() {
        ETBDescriptionAdapter$DescriptionHolder eTBDescriptionAdapter$DescriptionHolder = new ETBDescriptionAdapter$DescriptionHolder(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
        for (int i = 0; i < this.read.size(); i++) {
            Object elementAt = this.read.elementAt(i);
            if (elementAt instanceof ETBProductDetailAdapter$ETBProductDetailViewHolder) {
                eTBDescriptionAdapter$DescriptionHolder.read.addElement((ETBProductDetailAdapter$ETBProductDetailViewHolder) ((ETBProductDetailAdapter$ETBProductDetailViewHolder) this.read.elementAt(i)).clone());
            } else if (elementAt instanceof ETBDescriptionAdapter$DescriptionHolder) {
                eTBDescriptionAdapter$DescriptionHolder.read.addElement(((ETBDescriptionAdapter$DescriptionHolder) elementAt).MediaBrowserCompat$CustomActionResultReceiver());
            }
        }
        for (int i2 = 0; i2 < aX_(); i2++) {
            BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder = new BusinessAndMaritalInfoSpouseSelectorViewHolder();
            read(i2, businessAndMaritalInfoSpouseSelectorViewHolder);
            eTBDescriptionAdapter$DescriptionHolder.MediaBrowserCompat$ItemReceiver(businessAndMaritalInfoSpouseSelectorViewHolder);
        }
        return eTBDescriptionAdapter$DescriptionHolder;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, Object obj) {
        Object elementAt = this.read.elementAt(i);
        if (elementAt instanceof ETBProductDetailAdapter$ETBProductDetailViewHolder) {
            ((ETBProductDetailAdapter$ETBProductDetailViewHolder) elementAt).write(obj);
        }
    }

    public final ETBDescriptionAdapter$DescriptionHolder MediaBrowserCompat$CustomActionResultReceiver(String str, Object obj) {
        ETBProductDetailAdapter$ETBProductDetailViewHolder eTBProductDetailAdapter$ETBProductDetailViewHolder = new ETBProductDetailAdapter$ETBProductDetailViewHolder();
        eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem = str;
        eTBProductDetailAdapter$ETBProductDetailViewHolder.ParcelableVolumeInfo = obj == null ? ETBProductDetailAdapter$ETBProductDetailViewHolder.MediaBrowserCompat$ItemReceiver : obj.getClass();
        eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$ResultReceiverWrapper = obj;
        this.read.addElement(eTBProductDetailAdapter$ETBProductDetailViewHolder);
        return this;
    }

    public final ETBDescriptionAdapter$DescriptionHolder write(String str, String str2, Object obj) {
        ETBProductDetailAdapter$ETBProductDetailViewHolder eTBProductDetailAdapter$ETBProductDetailViewHolder = new ETBProductDetailAdapter$ETBProductDetailViewHolder();
        eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem = str2;
        eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a = str;
        eTBProductDetailAdapter$ETBProductDetailViewHolder.ParcelableVolumeInfo = obj == null ? ETBProductDetailAdapter$ETBProductDetailViewHolder.MediaBrowserCompat$ItemReceiver : obj.getClass();
        eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$ResultReceiverWrapper = obj;
        this.read.addElement(eTBProductDetailAdapter$ETBProductDetailViewHolder);
        return this;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("{");
        StringBuffer stringBuffer = new StringBuffer(sb.toString());
        for (int i = 0; i < this.read.size(); i++) {
            Object elementAt = this.read.elementAt(i);
            if (elementAt instanceof ETBProductDetailAdapter$ETBProductDetailViewHolder) {
                stringBuffer.append(((ETBProductDetailAdapter$ETBProductDetailViewHolder) elementAt).MediaSessionCompat$QueueItem);
                stringBuffer.append("=");
                Object elementAt2 = this.read.elementAt(i);
                if (elementAt2 instanceof ETBProductDetailAdapter$ETBProductDetailViewHolder) {
                    obj = ((ETBProductDetailAdapter$ETBProductDetailViewHolder) elementAt2).IconCompatParcelizer();
                } else {
                    obj = (ETBDescriptionAdapter$DescriptionHolder) elementAt2;
                }
                stringBuffer.append(obj);
                stringBuffer.append("; ");
            } else {
                stringBuffer.append(((ETBDescriptionAdapter$DescriptionHolder) elementAt).toString());
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public final String write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, ETBProductDetailAdapter$ETBProductDetailViewHolder eTBProductDetailAdapter$ETBProductDetailViewHolder) {
        Object elementAt = this.read.elementAt(i);
        if (elementAt instanceof ETBProductDetailAdapter$ETBProductDetailViewHolder) {
            ETBProductDetailAdapter$ETBProductDetailViewHolder eTBProductDetailAdapter$ETBProductDetailViewHolder2 = (ETBProductDetailAdapter$ETBProductDetailViewHolder) elementAt;
            eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem = eTBProductDetailAdapter$ETBProductDetailViewHolder2.MediaSessionCompat$QueueItem;
            eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a = eTBProductDetailAdapter$ETBProductDetailViewHolder2.f5808x50fd9e4a;
            eTBProductDetailAdapter$ETBProductDetailViewHolder.RatingCompat = eTBProductDetailAdapter$ETBProductDetailViewHolder2.RatingCompat;
            eTBProductDetailAdapter$ETBProductDetailViewHolder.ParcelableVolumeInfo = eTBProductDetailAdapter$ETBProductDetailViewHolder2.ParcelableVolumeInfo;
            eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaDescriptionCompat = eTBProductDetailAdapter$ETBProductDetailViewHolder2.MediaDescriptionCompat;
            eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$ResultReceiverWrapper = eTBProductDetailAdapter$ETBProductDetailViewHolder2.MediaSessionCompat$ResultReceiverWrapper;
            eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaMetadataCompat = eTBProductDetailAdapter$ETBProductDetailViewHolder2.MediaMetadataCompat;
            return;
        }
        eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem = null;
        eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a = null;
        eTBProductDetailAdapter$ETBProductDetailViewHolder.RatingCompat = 0;
        eTBProductDetailAdapter$ETBProductDetailViewHolder.ParcelableVolumeInfo = null;
        eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaDescriptionCompat = null;
        eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$ResultReceiverWrapper = elementAt;
        eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaMetadataCompat = false;
    }
}
