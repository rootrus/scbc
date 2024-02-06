package p040o;

import android.database.DataSetObserver;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.Map;
import net.sqlcipher.CursorWindow;
import net.sqlcipher.database.DatabaseObjectNotClosedException;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteDebug;
import net.sqlcipher.database.SQLiteQuery;

/* renamed from: o.onForgotPinClick */
public final class onForgotPinClick extends TouchPointWifiSettingsActivity {
    private PartnerAuthorizationActivity AlertController$RecycleListView;
    private Throwable Keep;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    SQLiteQuery f5553x50fd9e4a;
    int MediaDescriptionCompat;
    int MediaMetadataCompat = -1;
    private String[] MediaSessionCompat$QueueItem;
    protected onForgotPinClick$MediaBrowserCompat$CustomActionResultReceiver MediaSessionCompat$ResultReceiverWrapper;
    private Map<String, Integer> MediaSessionCompat$Token;
    boolean ParcelableVolumeInfo;
    private int PlaybackStateCompat = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private String PlaybackStateCompat$CustomAction;
    int RatingCompat = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private SQLiteDatabase setHasDecor;

    /* renamed from: o.onForgotPinClick$IconCompatParcelizer */
    final class IconCompatParcelizer implements Runnable {
        private final int read;

        IconCompatParcelizer(int i) {
            this.read = i;
        }

        private void read() {
            if (onForgotPinClick.this.MediaSessionCompat$ResultReceiverWrapper != null) {
                onForgotPinClick.this.MediaSessionCompat$ResultReceiverWrapper.sendEmptyMessage(1);
                onForgotPinClick.this.ParcelableVolumeInfo = false;
                return;
            }
            onForgotPinClick.this.ParcelableVolumeInfo = true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r5.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = r2;
            read();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                o.onForgotPinClick r0 = p040o.onForgotPinClick.this
                net.sqlcipher.CursorWindow r0 = r0.MediaBrowserCompat$SearchResultReceiver
                int r1 = android.os.Process.myTid()
                r2 = 10
                android.os.Process.setThreadPriority(r1, r2)
            L_0x000d:
                r1 = 0
                r1.lock()
                o.onForgotPinClick r2 = p040o.onForgotPinClick.this
                int r2 = r2.MediaDescriptionCompat
                int r3 = r5.read
                if (r2 == r3) goto L_0x001d
                r1.unlock()
                return
            L_0x001d:
                o.onForgotPinClick r2 = p040o.onForgotPinClick.this     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                net.sqlcipher.database.SQLiteQuery r2 = r2.f5553x50fd9e4a     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                o.onForgotPinClick r3 = p040o.onForgotPinClick.this     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                int r3 = r3.RatingCompat     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                o.onForgotPinClick r4 = p040o.onForgotPinClick.this     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                int r4 = r4.MediaMetadataCompat     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                int r2 = r2.IconCompatParcelizer(r0, r3, r4)     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                if (r2 == 0) goto L_0x0051
                r3 = -1
                if (r2 != r3) goto L_0x0044
                o.onForgotPinClick r2 = p040o.onForgotPinClick.this     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                o.onForgotPinClick r3 = p040o.onForgotPinClick.this     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                int r3 = r3.RatingCompat     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                int r4 = r2.MediaMetadataCompat     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                int r4 = r4 + r3
                r2.MediaMetadataCompat = r4     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                r5.read()     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                r1.unlock()
                goto L_0x000d
            L_0x0044:
                o.onForgotPinClick r0 = p040o.onForgotPinClick.this     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                r0.MediaMetadataCompat = r2     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                r5.read()     // Catch:{ Exception -> 0x0051, all -> 0x004c }
                goto L_0x0051
            L_0x004c:
                r0 = move-exception
                r1.unlock()
                throw r0
            L_0x0051:
                r1.unlock()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.onForgotPinClick.IconCompatParcelizer.run():void");
        }
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        if (!(Integer.MAX_VALUE == this.RatingCompat && Integer.MAX_VALUE == this.PlaybackStateCompat) && this.MediaSessionCompat$ResultReceiverWrapper == null) {
            this.MediaSessionCompat$ResultReceiverWrapper = new onForgotPinClick$MediaBrowserCompat$CustomActionResultReceiver(this);
            if (this.ParcelableVolumeInfo) {
                this.write.notifyChanged();
                this.ParcelableVolumeInfo = false;
            }
        }
    }

    public onForgotPinClick(SQLiteDatabase sQLiteDatabase, PartnerAuthorizationActivity partnerAuthorizationActivity, String str, SQLiteQuery sQLiteQuery) {
        this.MediaDescriptionCompat = 0;
        this.ParcelableVolumeInfo = false;
        this.Keep = new DatabaseObjectNotClosedException().fillInStackTrace();
        this.setHasDecor = sQLiteDatabase;
        this.AlertController$RecycleListView = partnerAuthorizationActivity;
        this.PlaybackStateCompat$CustomAction = str;
        this.MediaSessionCompat$Token = null;
        this.f5553x50fd9e4a = sQLiteQuery;
        try {
            sQLiteDatabase.RatingCompat();
            int MediaDescriptionCompat2 = this.f5553x50fd9e4a.MediaDescriptionCompat();
            this.MediaSessionCompat$QueueItem = new String[MediaDescriptionCompat2];
            for (int i = 0; i < MediaDescriptionCompat2; i++) {
                String read = this.f5553x50fd9e4a.read(i);
                this.MediaSessionCompat$QueueItem[i] = read;
                if ("_id".equals(read)) {
                    this.IconCompatParcelizer = i;
                }
            }
        } finally {
            sQLiteDatabase.MediaSessionCompat$ResultReceiverWrapper();
        }
    }

    public final boolean onMove(int i, int i2) {
        if (this.MediaBrowserCompat$SearchResultReceiver != null && i2 >= this.MediaBrowserCompat$SearchResultReceiver.getStartPosition() && i2 < this.MediaBrowserCompat$SearchResultReceiver.getStartPosition() + this.MediaBrowserCompat$SearchResultReceiver.getNumRows()) {
            return true;
        }
        IconCompatParcelizer(i2);
        return true;
    }

    public final int getCount() {
        if (this.MediaMetadataCompat == -1) {
            IconCompatParcelizer(0);
        }
        return this.MediaMetadataCompat;
    }

    private void IconCompatParcelizer(int i) {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            this.MediaBrowserCompat$SearchResultReceiver = new CursorWindow();
        } else {
            this.MediaDescriptionCompat++;
            this.MediaBrowserCompat$SearchResultReceiver.clear();
        }
        this.MediaBrowserCompat$SearchResultReceiver.setStartPosition(i);
        int IconCompatParcelizer2 = this.f5553x50fd9e4a.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, this.PlaybackStateCompat, 0);
        this.MediaMetadataCompat = IconCompatParcelizer2;
        if (IconCompatParcelizer2 == -1) {
            this.MediaMetadataCompat = i + this.PlaybackStateCompat;
            new Thread(new IconCompatParcelizer(this.MediaDescriptionCompat), "query thread").start();
        }
    }

    public final int getColumnIndex(String str) {
        if (this.MediaSessionCompat$Token == null) {
            String[] strArr = this.MediaSessionCompat$QueueItem;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], Integer.valueOf(i));
            }
            this.MediaSessionCompat$Token = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            StringBuilder sb = new StringBuilder();
            sb.append("requesting column name with table name -- ");
            sb.append(str);
            Log.e("Cursor", sb.toString(), exc);
            str = str.substring(lastIndexOf + 1);
        }
        Integer num = this.MediaSessionCompat$Token.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final String[] getColumnNames() {
        return this.MediaSessionCompat$QueueItem;
    }

    public final void deactivate() {
        super.deactivate();
        this.MediaDescriptionCompat = 0;
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            this.MediaBrowserCompat$SearchResultReceiver.close();
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
    }

    public final void close() {
        super.close();
        this.MediaDescriptionCompat = 0;
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            this.MediaBrowserCompat$SearchResultReceiver.close();
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
        this.f5553x50fd9e4a.read();
        this.AlertController$RecycleListView.write();
    }

    public final boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.setHasDecor.RatingCompat();
        try {
            if (this.MediaBrowserCompat$SearchResultReceiver != null) {
                this.MediaBrowserCompat$SearchResultReceiver.clear();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
            this.MediaMetadataCompat = -1;
            this.MediaDescriptionCompat++;
            this.f5553x50fd9e4a.MediaBrowserCompat$SearchResultReceiver();
            this.setHasDecor.MediaSessionCompat$ResultReceiverWrapper();
            return super.requery();
        } catch (Throwable th) {
            this.setHasDecor.MediaSessionCompat$ResultReceiverWrapper();
            throw th;
        }
    }

    public final void finalize() {
        try {
            if (this.MediaBrowserCompat$SearchResultReceiver != null) {
                int length = this.f5553x50fd9e4a.MediaBrowserCompat$ItemReceiver.length();
                StringBuilder sb = new StringBuilder();
                sb.append("Finalizing a Cursor that has not been deactivated or closed. database = ");
                sb.append(this.setHasDecor.MediaMetadataCompat);
                sb.append(", table = ");
                sb.append(this.PlaybackStateCompat$CustomAction);
                sb.append(", query = ");
                String str = this.f5553x50fd9e4a.MediaBrowserCompat$ItemReceiver;
                if (length > 100) {
                    length = 100;
                }
                sb.append(str.substring(0, length));
                Log.e("Cursor", sb.toString(), this.Keep);
                close();
                SQLiteDebug.read();
            }
        } finally {
            super.finalize();
        }
    }

    public final void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            this.MediaBrowserCompat$SearchResultReceiver = new CursorWindow();
        } else {
            this.MediaDescriptionCompat++;
            this.MediaBrowserCompat$SearchResultReceiver.clear();
        }
        this.MediaBrowserCompat$SearchResultReceiver.setStartPosition(i);
        int IconCompatParcelizer2 = this.f5553x50fd9e4a.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, this.PlaybackStateCompat, 0);
        this.MediaMetadataCompat = IconCompatParcelizer2;
        if (IconCompatParcelizer2 == -1) {
            this.MediaMetadataCompat = i + this.PlaybackStateCompat;
            new Thread(new IconCompatParcelizer(this.MediaDescriptionCompat), "query thread").start();
        }
    }
}
