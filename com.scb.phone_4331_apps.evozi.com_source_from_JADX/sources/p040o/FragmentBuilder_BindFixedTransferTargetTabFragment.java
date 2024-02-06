package p040o;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: o.FragmentBuilder_BindFixedTransferTargetTabFragment */
public final class FragmentBuilder_BindFixedTransferTargetTabFragment extends ContentProvider {
    public static Context MediaBrowserCompat$ItemReceiver;

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final boolean onCreate() {
        MediaBrowserCompat$ItemReceiver = getContext();
        return true;
    }
}
