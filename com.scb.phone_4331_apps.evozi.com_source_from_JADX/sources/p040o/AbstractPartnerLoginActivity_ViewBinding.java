package p040o;

import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver;
import net.sqlcipher.database.SQLiteQuery;

/* renamed from: o.AbstractPartnerLoginActivity_ViewBinding */
public final class AbstractPartnerLoginActivity_ViewBinding implements PartnerAuthorizationActivity {
    private String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private TouchPointTermsAndConditionsActivity MediaBrowserCompat$ItemReceiver;
    private SQLiteDatabase write;

    public AbstractPartnerLoginActivity_ViewBinding(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        this.write = sQLiteDatabase;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str;
    }

    public final TouchPointTermsAndConditionsActivity read(SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver, String[] strArr) {
        int i;
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.write, this.IconCompatParcelizer, strArr);
        int i2 = 0;
        if (strArr == null) {
            i = 0;
        } else {
            try {
                i = strArr.length;
            } catch (Throwable th) {
                if (sQLiteQuery != null) {
                    sQLiteQuery.read();
                }
                throw th;
            }
        }
        while (i2 < i) {
            int i3 = i2 + 1;
            sQLiteQuery.MediaBrowserCompat$ItemReceiver(i3, strArr[i2]);
            i2 = i3;
        }
        if (sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$ItemReceiver = new onForgotPinClick(this.write, this, this.MediaBrowserCompat$CustomActionResultReceiver, sQLiteQuery);
        } else {
            this.MediaBrowserCompat$ItemReceiver = sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        }
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final void write() {
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SQLiteDirectCursorDriver: ");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }
}
