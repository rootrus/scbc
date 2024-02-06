package p040o;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: o.closeTutorial */
public final class closeTutorial {

    /* renamed from: o.closeTutorial$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<T> {
        private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
        private /* synthetic */ SQLiteDatabase write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, FundFactSheetActivity fundFactSheetActivity) {
            super(0);
            this.write = sQLiteDatabase;
            this.IconCompatParcelizer = fundFactSheetActivity;
        }

        public final T invoke() {
            try {
                this.write.beginTransaction();
                T invoke = this.IconCompatParcelizer.invoke(this.write);
                this.write.setTransactionSuccessful();
                return invoke;
            } finally {
                this.write.endTransaction();
            }
        }
    }
}
