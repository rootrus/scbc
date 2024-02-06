package p040o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import p040o.ZHEMM;

/* renamed from: o.nAllocationIoSend */
public final class nAllocationIoSend extends SQLiteOpenHelper {
    private static final read IconCompatParcelizer = ZHEMM.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
    private static final read MediaBrowserCompat$CustomActionResultReceiver = ZHEMM$MediaBrowserCompat$ItemReceiver.read;
    private static final read read = ZHEMM.RatingCompat.read;
    private static final List<read> write = Arrays.asList(new read[]{IconCompatParcelizer, MediaBrowserCompat$CustomActionResultReceiver, read, ZHEMM$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver});
    private boolean MediaBrowserCompat$ItemReceiver = false;
    private final int MediaDescriptionCompat;

    /* renamed from: o.nAllocationIoSend$read */
    public interface read {
        void IconCompatParcelizer(SQLiteDatabase sQLiteDatabase);
    }

    @HmlPinActivity
    nAllocationIoSend(Context context, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "SQLITE_DB_NAME") String str, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.MediaDescriptionCompat = i;
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.MediaBrowserCompat$ItemReceiver = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.MediaDescriptionCompat;
        if (!this.MediaBrowserCompat$ItemReceiver) {
            onConfigure(sQLiteDatabase);
        }
        MediaBrowserCompat$ItemReceiver(sQLiteDatabase, 0, i);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.MediaBrowserCompat$ItemReceiver) {
            onConfigure(sQLiteDatabase);
        }
        MediaBrowserCompat$ItemReceiver(sQLiteDatabase, 0, i2);
    }

    private static void MediaBrowserCompat$ItemReceiver(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= write.size()) {
            while (i < i2) {
                write.get(i).IconCompatParcelizer(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(write.size());
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            onConfigure(sQLiteDatabase);
        }
        MediaBrowserCompat$ItemReceiver(sQLiteDatabase, i, i2);
    }
}
