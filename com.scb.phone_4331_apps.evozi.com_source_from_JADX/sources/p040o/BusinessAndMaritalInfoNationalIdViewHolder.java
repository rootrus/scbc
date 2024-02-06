package p040o;

import java.util.Vector;

/* renamed from: o.BusinessAndMaritalInfoNationalIdViewHolder */
public class BusinessAndMaritalInfoNationalIdViewHolder implements BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding {
    Vector write = new Vector();

    public final void read(int i, BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder) {
        BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder2 = (BusinessAndMaritalInfoSpouseSelectorViewHolder) this.write.elementAt(i);
        businessAndMaritalInfoSpouseSelectorViewHolder.MediaSessionCompat$QueueItem = businessAndMaritalInfoSpouseSelectorViewHolder2.MediaSessionCompat$QueueItem;
        businessAndMaritalInfoSpouseSelectorViewHolder.f5808x50fd9e4a = businessAndMaritalInfoSpouseSelectorViewHolder2.f5808x50fd9e4a;
        businessAndMaritalInfoSpouseSelectorViewHolder.RatingCompat = businessAndMaritalInfoSpouseSelectorViewHolder2.RatingCompat;
        businessAndMaritalInfoSpouseSelectorViewHolder.ParcelableVolumeInfo = businessAndMaritalInfoSpouseSelectorViewHolder2.ParcelableVolumeInfo;
        businessAndMaritalInfoSpouseSelectorViewHolder.MediaDescriptionCompat = businessAndMaritalInfoSpouseSelectorViewHolder2.MediaDescriptionCompat;
        businessAndMaritalInfoSpouseSelectorViewHolder.MediaSessionCompat$ResultReceiverWrapper = businessAndMaritalInfoSpouseSelectorViewHolder2.IconCompatParcelizer();
    }

    private Integer MediaBrowserCompat$ItemReceiver(String str) {
        for (int i = 0; i < this.write.size(); i++) {
            if (str.equals(((BusinessAndMaritalInfoSpouseSelectorViewHolder) this.write.elementAt(i)).MediaSessionCompat$QueueItem)) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    public final int aX_() {
        return this.write.size();
    }

    public final void MediaBrowserCompat$ItemReceiver(BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder) {
        this.write.addElement(businessAndMaritalInfoSpouseSelectorViewHolder);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, Object obj) {
        BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder = new BusinessAndMaritalInfoSpouseSelectorViewHolder();
        businessAndMaritalInfoSpouseSelectorViewHolder.MediaSessionCompat$QueueItem = str;
        businessAndMaritalInfoSpouseSelectorViewHolder.f5808x50fd9e4a = null;
        businessAndMaritalInfoSpouseSelectorViewHolder.ParcelableVolumeInfo = obj == null ? ETBProductDetailAdapter$ETBProductDetailViewHolder.MediaBrowserCompat$ItemReceiver : obj.getClass();
        businessAndMaritalInfoSpouseSelectorViewHolder.MediaSessionCompat$ResultReceiverWrapper = obj;
        this.write.addElement(businessAndMaritalInfoSpouseSelectorViewHolder);
    }

    /* access modifiers changed from: protected */
    public final boolean write(BusinessAndMaritalInfoNationalIdViewHolder businessAndMaritalInfoNationalIdViewHolder) {
        Object obj;
        int size = this.write.size();
        if (size != businessAndMaritalInfoNationalIdViewHolder.write.size()) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= size) {
                return true;
            }
            BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder = (BusinessAndMaritalInfoSpouseSelectorViewHolder) this.write.elementAt(i);
            Object IconCompatParcelizer = businessAndMaritalInfoSpouseSelectorViewHolder.IconCompatParcelizer();
            if (businessAndMaritalInfoNationalIdViewHolder.MediaBrowserCompat$ItemReceiver(businessAndMaritalInfoSpouseSelectorViewHolder.MediaSessionCompat$QueueItem) == null) {
                z = false;
            }
            if (!z) {
                return false;
            }
            Integer MediaBrowserCompat$ItemReceiver = businessAndMaritalInfoNationalIdViewHolder.MediaBrowserCompat$ItemReceiver(businessAndMaritalInfoSpouseSelectorViewHolder.MediaSessionCompat$QueueItem);
            if (MediaBrowserCompat$ItemReceiver != null) {
                obj = ((BusinessAndMaritalInfoSpouseSelectorViewHolder) businessAndMaritalInfoNationalIdViewHolder.write.elementAt(MediaBrowserCompat$ItemReceiver.intValue())).IconCompatParcelizer();
            } else {
                obj = null;
            }
            if (!IconCompatParcelizer.equals(obj)) {
                return false;
            }
            i++;
        }
    }
}
