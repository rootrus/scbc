package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.trackSingleFaceJni */
public final class trackSingleFaceJni {
    public static boolean MediaBrowserCompat$CustomActionResultReceiver(String str) {
        boolean z = true;
        if (!(!(str == null || str.length() == 0)) || str.length() != 10) {
            return false;
        }
        String MediaBrowserCompat$CustomActionResultReceiver = getOnlyElement.MediaBrowserCompat$CustomActionResultReceiver(getOnlyElement.read(str, "/"));
        boolean z2 = MediaBrowserCompat$CustomActionResultReceiver != null && !MediaBrowserCompat$CustomActionResultReceiver.isEmpty();
        if (!z2) {
            return z2;
        }
        OffsetDateTime write = removeIfFromRandomAccessList.write("dd/MM/yyyy", MediaBrowserCompat$CustomActionResultReceiver);
        if ((write.getYear() > 0 ? PrepaidTransactionAdapter$ParentViewHolder_ViewBinding.between(write.toLocalDate(), OffsetDateTime.now().toLocalDate()).getYears() : 0) <= 0) {
            z = false;
        }
        return z;
    }
}
