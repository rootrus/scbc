package com.scb.phone.view.adapter.mwpartner;

import android.widget.Filter;
import java.util.ArrayList;

public final class MwPlaceAdapter$MediaBrowserCompat$CustomActionResultReceiver extends Filter {
    private /* synthetic */ MwPlaceAdapter IconCompatParcelizer;

    MwPlaceAdapter$MediaBrowserCompat$CustomActionResultReceiver(MwPlaceAdapter mwPlaceAdapter) {
        this.IconCompatParcelizer = mwPlaceAdapter;
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList read = this.IconCompatParcelizer.RatingCompat;
        if (read != null) {
            read.clear();
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence != null) {
            MwPlaceAdapter mwPlaceAdapter = this.IconCompatParcelizer;
            mwPlaceAdapter.RatingCompat = MwPlaceAdapter.IconCompatParcelizer(mwPlaceAdapter, charSequence);
            ArrayList read2 = this.IconCompatParcelizer.RatingCompat;
            if (read2 != null) {
                filterResults.values = read2;
                filterResults.count = read2.size();
            }
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults == null) {
            MwPlaceAdapter.IconCompatParcelizer(this.IconCompatParcelizer).ActionMenuView();
        } else if (filterResults.count > 0) {
            this.IconCompatParcelizer.IconCompatParcelizer.write();
            MwPlaceAdapter.IconCompatParcelizer(this.IconCompatParcelizer).setWindowTitle();
        } else {
            MwPlaceAdapter.IconCompatParcelizer(this.IconCompatParcelizer).ActionMenuView();
        }
    }
}
