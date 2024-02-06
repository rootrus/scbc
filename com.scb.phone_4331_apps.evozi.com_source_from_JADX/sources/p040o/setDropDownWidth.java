package p040o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.setDropDownWidth */
public final class setDropDownWidth implements Iterable<Intent> {
    public final ArrayList<Intent> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
    public final Context write;

    /* renamed from: o.setDropDownWidth$write */
    public interface write {
        /* renamed from: u_ */
        Intent mo47u_();
    }

    private setDropDownWidth(Context context) {
        this.write = context;
    }

    public static setDropDownWidth IconCompatParcelizer(Context context) {
        return new setDropDownWidth(context);
    }

    public final setDropDownWidth MediaBrowserCompat$CustomActionResultReceiver(ComponentName componentName) {
        int size = this.MediaBrowserCompat$ItemReceiver.size();
        try {
            Intent IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(this.write, componentName);
            while (IconCompatParcelizer != null) {
                this.MediaBrowserCompat$ItemReceiver.add(size, IconCompatParcelizer);
                IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(this.write, IconCompatParcelizer.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.MediaBrowserCompat$ItemReceiver.iterator();
    }

    public final void write() {
        if (!this.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            ArrayList<Intent> arrayList = this.MediaBrowserCompat$ItemReceiver;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(this.write, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.write.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
