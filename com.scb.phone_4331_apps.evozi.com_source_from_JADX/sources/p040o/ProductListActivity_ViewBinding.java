package p040o;

import android.content.Context;
import android.util.Log;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: o.ProductListActivity_ViewBinding */
public final class ProductListActivity_ViewBinding extends PartnerBillPaymentInputActivity {
    public ProductListActivity_ViewBinding(Context context) {
        super(context, "events.db");
    }

    public final void read(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate: ");
        sb.append("create table events( _id integer primary key autoincrement, time integer, title text not null);");
        Log.d("EventsData", sb.toString());
        sQLiteDatabase.MediaBrowserCompat$ItemReceiver("create table events( _id integer primary key autoincrement, time integer, title text not null);");
    }

    public final void IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < i2) {
            String str = null;
            if (i == 1) {
                str = "alter table events add note text;";
            }
            if (i == 2) {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onUpgrade\t: ");
            sb.append(str);
            Log.d("EventsData", sb.toString());
            if (str != null) {
                sQLiteDatabase.MediaBrowserCompat$ItemReceiver(str);
            }
        }
    }
}
