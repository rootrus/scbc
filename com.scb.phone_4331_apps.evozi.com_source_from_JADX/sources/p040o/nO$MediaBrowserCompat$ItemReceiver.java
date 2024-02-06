package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nO$MediaBrowserCompat$ItemReceiver */
final class nO$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<loadAllVariantsForProject> {
    private /* synthetic */ String IconCompatParcelizer;

    nO$MediaBrowserCompat$ItemReceiver(String str) {
        this.IconCompatParcelizer = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        loadAllVariantsForProject loadallvariantsforproject = (loadAllVariantsForProject) obj;
        String str = this.IconCompatParcelizer;
        if (str == null || !(!GoodToKnowActivity.read(str))) {
            loadallvariantsforproject.IconCompatParcelizer(false);
            return;
        }
        loadallvariantsforproject.IconCompatParcelizer(this.IconCompatParcelizer);
        loadallvariantsforproject.IconCompatParcelizer(true);
    }
}
