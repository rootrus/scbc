package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setSearchDirection$MediaBrowserCompat$SearchResultReceiver */
public final class setSearchDirection$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<newCheckParameters> {
    private /* synthetic */ String IconCompatParcelizer;
    private /* synthetic */ setSearchDirection read;

    public setSearchDirection$MediaBrowserCompat$SearchResultReceiver(setSearchDirection setsearchdirection, String str) {
        this.read = setsearchdirection;
        this.IconCompatParcelizer = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        newCheckParameters newcheckparameters = (newCheckParameters) obj;
        String str = this.IconCompatParcelizer;
        int hashCode = str.hashCode();
        if (hashCode != 78) {
            if (hashCode == 89 && str.equals("Y")) {
                this.read.IconCompatParcelizer = "Y";
                newcheckparameters.MediaBrowserCompat$MediaItem();
                return;
            }
        } else if (str.equals("N")) {
            this.read.IconCompatParcelizer = "N";
            newcheckparameters.RatingCompat();
            return;
        }
        this.read.IconCompatParcelizer = "N";
        newcheckparameters.write();
    }
}
