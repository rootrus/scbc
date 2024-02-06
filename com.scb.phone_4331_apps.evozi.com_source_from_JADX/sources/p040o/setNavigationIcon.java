package p040o;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: o.setNavigationIcon */
public abstract class setNavigationIcon extends BaseAdapter implements Filterable, setLogoDescription$MediaBrowserCompat$CustomActionResultReceiver {
    protected boolean IconCompatParcelizer = false;
    public Context MediaBrowserCompat$CustomActionResultReceiver;
    public Cursor MediaBrowserCompat$ItemReceiver = null;
    private setLogoDescription MediaBrowserCompat$MediaItem;
    private DataSetObserver MediaBrowserCompat$SearchResultReceiver;
    private int MediaMetadataCompat;
    private boolean read = true;
    private read write;

    public abstract void MediaBrowserCompat$ItemReceiver(View view, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    public abstract View write(Context context, Cursor cursor, ViewGroup viewGroup);

    public setNavigationIcon(Context context, Cursor cursor, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.MediaMetadataCompat = -1;
        this.write = new read();
        this.MediaBrowserCompat$SearchResultReceiver = new write();
    }

    public final Cursor read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.IconCompatParcelizer || (cursor = this.MediaBrowserCompat$ItemReceiver) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.IconCompatParcelizer || (cursor = this.MediaBrowserCompat$ItemReceiver) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.IconCompatParcelizer || (cursor = this.MediaBrowserCompat$ItemReceiver) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.MediaBrowserCompat$ItemReceiver.getLong(this.MediaMetadataCompat);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.IconCompatParcelizer) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.MediaBrowserCompat$ItemReceiver.moveToPosition(i)) {
            if (view == null) {
                view = write(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, viewGroup);
            }
            MediaBrowserCompat$ItemReceiver(view, this.MediaBrowserCompat$ItemReceiver);
            return view;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.IconCompatParcelizer) {
            return null;
        }
        this.MediaBrowserCompat$ItemReceiver.moveToPosition(i);
        if (view == null) {
            view = read(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, viewGroup);
        }
        MediaBrowserCompat$ItemReceiver(view, this.MediaBrowserCompat$ItemReceiver);
        return view;
    }

    public View read(Context context, Cursor cursor, ViewGroup viewGroup) {
        return write(context, cursor, viewGroup);
    }

    public CharSequence MediaBrowserCompat$ItemReceiver(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor write(CharSequence charSequence) {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public Filter getFilter() {
        if (this.MediaBrowserCompat$MediaItem == null) {
            this.MediaBrowserCompat$MediaItem = new setLogoDescription(this);
        }
        return this.MediaBrowserCompat$MediaItem;
    }

    /* access modifiers changed from: protected */
    public final void write() {
        Cursor cursor;
        if (this.read && (cursor = this.MediaBrowserCompat$ItemReceiver) != null && !cursor.isClosed()) {
            this.IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.requery();
        }
    }

    /* renamed from: o.setNavigationIcon$read */
    class read extends ContentObserver {
        public final boolean deliverSelfNotifications() {
            return true;
        }

        read() {
            super(new Handler());
        }

        public final void onChange(boolean z) {
            setNavigationIcon.this.write();
        }
    }

    /* renamed from: o.setNavigationIcon$write */
    class write extends DataSetObserver {
        write() {
        }

        public final void onChanged() {
            setNavigationIcon.this.IconCompatParcelizer = true;
            setNavigationIcon.this.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            setNavigationIcon.this.IconCompatParcelizer = false;
            setNavigationIcon.this.notifyDataSetInvalidated();
        }
    }

    public void IconCompatParcelizer(Cursor cursor) {
        Cursor cursor2 = this.MediaBrowserCompat$ItemReceiver;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                read read2 = this.write;
                if (read2 != null) {
                    cursor2.unregisterContentObserver(read2);
                }
                DataSetObserver dataSetObserver = this.MediaBrowserCompat$SearchResultReceiver;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.MediaBrowserCompat$ItemReceiver = cursor;
            if (cursor != null) {
                read read3 = this.write;
                if (read3 != null) {
                    cursor.registerContentObserver(read3);
                }
                DataSetObserver dataSetObserver2 = this.MediaBrowserCompat$SearchResultReceiver;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.MediaMetadataCompat = cursor.getColumnIndexOrThrow("_id");
                this.IconCompatParcelizer = true;
                notifyDataSetChanged();
            } else {
                this.MediaMetadataCompat = -1;
                this.IconCompatParcelizer = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }
}
