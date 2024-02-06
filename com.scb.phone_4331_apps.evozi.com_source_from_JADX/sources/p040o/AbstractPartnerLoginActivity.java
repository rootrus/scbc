package p040o;

import android.database.CursorWindow;
import net.sqlcipher.database.SQLiteProgram;

/* renamed from: o.AbstractPartnerLoginActivity */
public final class AbstractPartnerLoginActivity {
    static {
        new String[]{"count(*)"};
    }

    public static void MediaBrowserCompat$ItemReceiver(SQLiteProgram sQLiteProgram, int i, Object obj) {
        if (obj == null) {
            sQLiteProgram.write(i);
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            sQLiteProgram.write(i, ((Number) obj).doubleValue());
        } else if (obj instanceof Number) {
            sQLiteProgram.read(i, ((Number) obj).longValue());
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                sQLiteProgram.read(i, 1);
            } else {
                sQLiteProgram.read(i, 0);
            }
        } else if (obj instanceof byte[]) {
            sQLiteProgram.write(i, (byte[]) obj);
        } else {
            sQLiteProgram.MediaBrowserCompat$ItemReceiver(i, obj.toString());
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(TouchPointTermsAndConditionsActivity touchPointTermsAndConditionsActivity, int i, CursorWindow cursorWindow) {
        boolean z;
        if (i >= 0 && i < touchPointTermsAndConditionsActivity.getCount()) {
            int position = touchPointTermsAndConditionsActivity.getPosition();
            int columnCount = touchPointTermsAndConditionsActivity.getColumnCount();
            cursorWindow.clear();
            cursorWindow.setStartPosition(i);
            cursorWindow.setNumColumns(columnCount);
            if (touchPointTermsAndConditionsActivity.moveToPosition(i)) {
                while (cursorWindow.allocRow()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= columnCount) {
                            break;
                        }
                        int type = touchPointTermsAndConditionsActivity.getType(i2);
                        if (type == 0) {
                            z = cursorWindow.putNull(i, i2);
                        } else if (type == 1) {
                            z = cursorWindow.putLong(touchPointTermsAndConditionsActivity.getLong(i2), i, i2);
                        } else if (type == 2) {
                            z = cursorWindow.putDouble(touchPointTermsAndConditionsActivity.getDouble(i2), i, i2);
                        } else if (type != 4) {
                            String string = touchPointTermsAndConditionsActivity.getString(i2);
                            z = string != null ? cursorWindow.putString(string, i, i2) : cursorWindow.putNull(i, i2);
                        } else {
                            byte[] blob = touchPointTermsAndConditionsActivity.getBlob(i2);
                            z = blob != null ? cursorWindow.putBlob(blob, i, i2) : cursorWindow.putNull(i, i2);
                        }
                        if (!z) {
                            cursorWindow.freeLastRow();
                            break;
                        }
                        i2++;
                    }
                    i++;
                    if (!touchPointTermsAndConditionsActivity.moveToNext()) {
                        break;
                    }
                }
            }
            touchPointTermsAndConditionsActivity.moveToPosition(position);
        }
    }
}
