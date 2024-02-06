package example;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver;
import org.bouncycastle.i18n.MessageBundle;
import p040o.ProductListActivity_ViewBinding;
import p040o.TouchPointTermsAndConditionsActivity;
import p040o.onDenyClick;

public class SQLDemoActivity extends Activity {
    private ProductListActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SQLiteDatabase.IconCompatParcelizer(this);
        ProductListActivity_ViewBinding productListActivity_ViewBinding = new ProductListActivity_ViewBinding(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = productListActivity_ViewBinding;
        SQLiteDatabase MediaBrowserCompat$CustomActionResultReceiver2 = productListActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("foo123");
        boolean z = true;
        for (int i = 1; i < 100; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("Hello Android Event: ");
            sb.append(i);
            String obj = sb.toString();
            ContentValues contentValues = new ContentValues();
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put(MessageBundle.TITLE_ENTRY, obj);
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver("events", contentValues);
        }
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$SearchResultReceiver();
        SQLiteDatabase write = this.MediaBrowserCompat$CustomActionResultReceiver.write("foo123");
        if (write.mNativeHandle == 0) {
            z = false;
        }
        if (z) {
            TouchPointTermsAndConditionsActivity MediaBrowserCompat$CustomActionResultReceiver3 = write.MediaBrowserCompat$CustomActionResultReceiver((SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver) null, onDenyClick.IconCompatParcelizer(false, "events", (String[]) null, (String) null, (String) null, (String) null, (String) null, (String) null), (String[]) null, SQLiteDatabase.read("events"));
            startManagingCursor(MediaBrowserCompat$CustomActionResultReceiver3);
            MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver3);
            write.MediaBrowserCompat$SearchResultReceiver();
            return;
        }
        throw new IllegalStateException("database not open");
    }

    public void onDestroy() {
        ProductListActivity_ViewBinding productListActivity_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        synchronized (productListActivity_ViewBinding) {
            if (productListActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver) {
                throw new IllegalStateException("Closed during initialization");
            } else if (productListActivity_ViewBinding.write != null) {
                if (productListActivity_ViewBinding.write.mNativeHandle != 0) {
                    productListActivity_ViewBinding.write.MediaBrowserCompat$SearchResultReceiver();
                    productListActivity_ViewBinding.write = null;
                }
            }
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(Cursor cursor) {
        StringBuilder sb = new StringBuilder("Saved Events:\n\n");
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            String string = cursor.getString(2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j);
            sb2.append(": ");
            sb2.append(j2);
            sb2.append(": ");
            sb2.append(string);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        Log.i("sqldemo", sb.toString());
    }
}
