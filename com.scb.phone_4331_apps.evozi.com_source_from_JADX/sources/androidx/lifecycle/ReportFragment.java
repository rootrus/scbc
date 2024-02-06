package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import p040o.entryRemoved;
import p040o.get;
import p040o.hitCount;
import p040o.maxSize;

public class ReportFragment extends Fragment {

    public interface write {
        boolean MediaBrowserCompat$CustomActionResultReceiver();
    }

    public static void MediaBrowserCompat$ItemReceiver(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        MediaBrowserCompat$CustomActionResultReceiver(entryRemoved.write.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        MediaBrowserCompat$CustomActionResultReceiver(entryRemoved.write.ON_START);
    }

    public void onResume() {
        super.onResume();
        MediaBrowserCompat$CustomActionResultReceiver(entryRemoved.write.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        MediaBrowserCompat$CustomActionResultReceiver(entryRemoved.write.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        MediaBrowserCompat$CustomActionResultReceiver(entryRemoved.write.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        MediaBrowserCompat$CustomActionResultReceiver(entryRemoved.write.ON_DESTROY);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(entryRemoved.write write2) {
        Activity activity = getActivity();
        if (activity instanceof hitCount) {
            ((hitCount) activity).read().write(get.MediaBrowserCompat$CustomActionResultReceiver(write2));
        } else if (activity instanceof maxSize) {
            entryRemoved lifecycle = ((maxSize) activity).getLifecycle();
            if (lifecycle instanceof get) {
                ((get) lifecycle).write(get.MediaBrowserCompat$CustomActionResultReceiver(write2));
            }
        }
    }
}
