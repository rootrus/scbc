package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.Glide;
import java.util.HashSet;
import java.util.Set;
import p040o.ComponentActivity;
import p040o.ICheckDeserializer;
import p040o.hashCode;
import p040o.isLoadInBackgroundCanceled;

@Deprecated
public class RequestManagerFragment extends Fragment {
    public final ComponentActivity IconCompatParcelizer;
    public hashCode MediaBrowserCompat$CustomActionResultReceiver;
    public final ICheckDeserializer MediaBrowserCompat$ItemReceiver;
    private RequestManagerFragment MediaBrowserCompat$SearchResultReceiver;
    public Fragment read;
    private final Set<RequestManagerFragment> write;

    public RequestManagerFragment() {
        this(new ComponentActivity());
    }

    private RequestManagerFragment(ComponentActivity componentActivity) {
        this.MediaBrowserCompat$ItemReceiver = new write();
        this.write = new HashSet();
        this.IconCompatParcelizer = componentActivity;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            IconCompatParcelizer(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        RequestManagerFragment requestManagerFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (requestManagerFragment != null) {
            requestManagerFragment.write.remove(this);
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
    }

    public void onStart() {
        super.onStart();
        this.IconCompatParcelizer.read();
    }

    public void onStop() {
        super.onStop();
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void onDestroy() {
        super.onDestroy();
        this.IconCompatParcelizer.write();
        RequestManagerFragment requestManagerFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (requestManagerFragment != null) {
            requestManagerFragment.write.remove(this);
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        if (parentFragment == null) {
            parentFragment = this.read;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }

    class write implements ICheckDeserializer {
        write() {
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(RequestManagerFragment.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public void IconCompatParcelizer(Activity activity) {
        RequestManagerFragment requestManagerFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (requestManagerFragment != null) {
            requestManagerFragment.write.remove(this);
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
        RequestManagerFragment read2 = Glide.IconCompatParcelizer((Context) activity).RatingCompat.read(activity.getFragmentManager(), (Fragment) null, isLoadInBackgroundCanceled.IconCompatParcelizer(activity));
        this.MediaBrowserCompat$SearchResultReceiver = read2;
        if (!equals(read2)) {
            this.MediaBrowserCompat$SearchResultReceiver.write.add(this);
        }
    }
}
