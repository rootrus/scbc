package androidx.appcompat.widget;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

class AppCompatSpinner$MediaBrowserCompat$ItemReceiver implements ListAdapter, SpinnerAdapter {
    private ListAdapter IconCompatParcelizer;
    private SpinnerAdapter MediaBrowserCompat$CustomActionResultReceiver;

    public int getItemViewType(int i) {
        return 0;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public AppCompatSpinner$MediaBrowserCompat$ItemReceiver(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.MediaBrowserCompat$CustomActionResultReceiver = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.IconCompatParcelizer = (ListAdapter) spinnerAdapter;
        }
        if (theme != null && Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    public int getCount() {
        SpinnerAdapter spinnerAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    public Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    public long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (spinnerAdapter == null) {
            return -1;
        }
        return spinnerAdapter.getItemId(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    public boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.IconCompatParcelizer;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public boolean isEnabled(int i) {
        ListAdapter listAdapter = this.IconCompatParcelizer;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }
}
