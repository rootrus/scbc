package p040o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.Iterables;
import p040o.RttiJsonBill_MembersInjector;
import p040o.ZHEMM;
import p040o.loadProjectionNormalized;
import p040o.nAllocationRead2D;
import p040o.rsnScriptInvokeV;

@HmlSetNTBPinActivity
/* renamed from: o.nAllocationGetStride */
public final class nAllocationGetStride implements C7507tQ, nAllocationRead2D {
    public static final Float4 write = new Float4("proto");
    private final CreditCardCaptureModule_GetIParametersFactory IconCompatParcelizer;
    public final nAllocationData3D MediaBrowserCompat$CustomActionResultReceiver;
    public final nAllocationIoSend MediaBrowserCompat$ItemReceiver;
    private final CreditCardCaptureModule_GetIParametersFactory read;

    /* renamed from: o.nAllocationGetStride$IconCompatParcelizer */
    public interface IconCompatParcelizer<T> {
        T MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: o.nAllocationGetStride$write */
    public interface write<T, U> {
        U read(T t);
    }

    @HmlPinActivity
    nAllocationGetStride(CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory, CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory2, nAllocationData3D nallocationdata3d, nAllocationIoSend nallocationiosend) {
        this.MediaBrowserCompat$ItemReceiver = nallocationiosend;
        this.read = creditCardCaptureModule_GetIParametersFactory;
        this.IconCompatParcelizer = creditCardCaptureModule_GetIParametersFactory2;
        this.MediaBrowserCompat$CustomActionResultReceiver = nallocationdata3d;
    }

    public final nAllocationIoReceive write(RenderScript renderScript, loadProjectionNormalized loadprojectionnormalized) {
        AlertController$RecycleListView.IconCompatParcelizer("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", renderScript.read(), loadprojectionnormalized.MediaBrowserCompat$CustomActionResultReceiver(), renderScript.write());
        long longValue = ((Long) MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat(this, renderScript, loadprojectionnormalized))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new nAllocationIoReceive(longValue, renderScript, loadprojectionnormalized);
    }

    public static Long MediaBrowserCompat$CustomActionResultReceiver(SQLiteDatabase sQLiteDatabase, RenderScript renderScript) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{renderScript.write(), String.valueOf(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(renderScript.read()))}));
        if (renderScript.MediaBrowserCompat$ItemReceiver() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(renderScript.MediaBrowserCompat$ItemReceiver(), 0));
        }
        return (Long) MediaBrowserCompat$ItemReceiver(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), ZHEMM$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer(Iterable<nAllocationIoReceive> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            sb.append(MediaBrowserCompat$ItemReceiver(iterable));
            MediaBrowserCompat$ItemReceiver(new C6554xc460715d(sb.toString()));
        }
    }

    public final void write(Iterable<nAllocationIoReceive> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM events WHERE _id in ");
            sb.append(MediaBrowserCompat$ItemReceiver(iterable));
            ((SQLiteDatabase) MediaBrowserCompat$ItemReceiver(new Iterables.C35273.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver), ZHEMM.write.MediaBrowserCompat$ItemReceiver)).compileStatement(sb.toString()).execute();
        }
    }

    private static String MediaBrowserCompat$ItemReceiver(Iterable<nAllocationIoReceive> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<nAllocationIoReceive> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().write);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final int read() {
        return ((Integer) MediaBrowserCompat$ItemReceiver(new Iterables$3$MediaBrowserCompat$MediaItem(this.read.MediaBrowserCompat$ItemReceiver() - this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver()))).intValue();
    }

    public final void close() {
        this.MediaBrowserCompat$ItemReceiver.close();
    }

    public static Map<Long, Set<C7269xebfa684e>> write(SQLiteDatabase sQLiteDatabase, List<nAllocationIoReceive> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).write);
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        MediaBrowserCompat$ItemReceiver(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C7039x355e6121(hashMap));
        return hashMap;
    }

    public static List<nAllocationIoReceive> MediaBrowserCompat$CustomActionResultReceiver(List<nAllocationIoReceive> list, Map<Long, Set<C7269xebfa684e>> map) {
        ListIterator<nAllocationIoReceive> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            nAllocationIoReceive next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.write))) {
                loadProjectionNormalized.IconCompatParcelizer MediaDescriptionCompat = next.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
                for (C7269xebfa684e nallocationgetstride_mediabrowsercompat_customactionresultreceiver : map.get(Long.valueOf(next.write))) {
                    MediaDescriptionCompat.write(nallocationgetstride_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, nallocationgetstride_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver);
                }
                listIterator.set(new nAllocationIoReceive(next.write, next.MediaBrowserCompat$ItemReceiver, MediaDescriptionCompat.IconCompatParcelizer()));
            }
        }
        return list;
    }

    public final <T> T MediaBrowserCompat$ItemReceiver(IconCompatParcelizer<T> iconCompatParcelizer, write<Throwable, T> write2) {
        long MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        while (true) {
            try {
                return iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver() >= ((long) this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) + MediaBrowserCompat$ItemReceiver2) {
                    return write2.read(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public static <T> T MediaBrowserCompat$ItemReceiver(Cursor cursor, write<Cursor, T> write2) {
        try {
            return write2.read(cursor);
        } finally {
            cursor.close();
        }
    }

    private <T> T MediaBrowserCompat$ItemReceiver(write<SQLiteDatabase, T> write2) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) MediaBrowserCompat$ItemReceiver(new Iterables.C35273.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver), ZHEMM.write.MediaBrowserCompat$ItemReceiver);
        sQLiteDatabase.beginTransaction();
        try {
            T read2 = write2.read(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return read2;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final long MediaBrowserCompat$ItemReceiver(RenderScript renderScript) {
        return ((Long) MediaBrowserCompat$ItemReceiver(((SQLiteDatabase) MediaBrowserCompat$ItemReceiver(new Iterables.C35273.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver), ZHEMM.write.MediaBrowserCompat$ItemReceiver)).rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{renderScript.write(), String.valueOf(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(renderScript.read()))}), ZHEMM.read.read)).longValue();
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(RenderScript renderScript) {
        return ((Boolean) MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaMetadataCompat(this, renderScript))).booleanValue();
    }

    public final Iterable<RenderScript> IconCompatParcelizer() {
        return (Iterable) MediaBrowserCompat$ItemReceiver(rsnScriptInvokeV.read.read);
    }

    public final Iterable<nAllocationIoReceive> read(RenderScript renderScript) {
        return (Iterable) MediaBrowserCompat$ItemReceiver(new Iterables.C35273.read(this, renderScript));
    }

    public final void write(RenderScript renderScript, long j) {
        MediaBrowserCompat$ItemReceiver(new Iterables.C35273.write(j, renderScript));
    }

    public final <T> T MediaBrowserCompat$CustomActionResultReceiver(nAllocationRead2D.write<T> write2) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) MediaBrowserCompat$ItemReceiver(new Iterables.C35273.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver), ZHEMM.write.MediaBrowserCompat$ItemReceiver);
        MediaBrowserCompat$ItemReceiver(new RttiJsonBill_MembersInjector.read(sQLiteDatabase), DSPR.MediaBrowserCompat$CustomActionResultReceiver);
        try {
            T MediaBrowserCompat$ItemReceiver2 = write2.MediaBrowserCompat$ItemReceiver();
            sQLiteDatabase.setTransactionSuccessful();
            return MediaBrowserCompat$ItemReceiver2;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
