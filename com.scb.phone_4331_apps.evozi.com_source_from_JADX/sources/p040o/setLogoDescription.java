package p040o;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: o.setLogoDescription */
final class setLogoDescription extends Filter {
    private setLogoDescription$MediaBrowserCompat$CustomActionResultReceiver write;

    setLogoDescription(setLogoDescription$MediaBrowserCompat$CustomActionResultReceiver setlogodescription_mediabrowsercompat_customactionresultreceiver) {
        this.write = setlogodescription_mediabrowsercompat_customactionresultreceiver;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.write.MediaBrowserCompat$ItemReceiver((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor write2 = this.write.write(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (write2 != null) {
            filterResults.count = write2.getCount();
            filterResults.values = write2;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor read = this.write.read();
        if (filterResults.values != null && filterResults.values != read) {
            this.write.IconCompatParcelizer((Cursor) filterResults.values);
        }
    }
}
