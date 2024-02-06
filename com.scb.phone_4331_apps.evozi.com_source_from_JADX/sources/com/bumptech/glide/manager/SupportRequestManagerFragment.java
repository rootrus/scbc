package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import java.util.HashSet;
import java.util.Set;
import p040o.ComponentActivity;
import p040o.ICheckDeserializer;
import p040o.hashCode;
import p040o.isLoadInBackgroundCanceled;
import p040o.setTitleMarginStart;

public class SupportRequestManagerFragment extends Fragment {
    public final ICheckDeserializer IconCompatParcelizer;
    public final ComponentActivity MediaBrowserCompat$CustomActionResultReceiver;
    public hashCode MediaBrowserCompat$ItemReceiver;
    private SupportRequestManagerFragment RatingCompat;
    public Fragment read;
    private final Set<SupportRequestManagerFragment> write;

    public SupportRequestManagerFragment() {
        this(new ComponentActivity());
    }

    private SupportRequestManagerFragment(ComponentActivity componentActivity) {
        this.IconCompatParcelizer = new write();
        this.write = new HashSet();
        this.MediaBrowserCompat$CustomActionResultReceiver = componentActivity;
    }

    public static setTitleMarginStart IconCompatParcelizer(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        setTitleMarginStart fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            try {
                read(getContext(), fragmentManager);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public void onDetach() {
        super.onDetach();
        this.read = null;
        SupportRequestManagerFragment supportRequestManagerFragment = this.RatingCompat;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.write.remove(this);
            this.RatingCompat = null;
        }
    }

    public void onStart() {
        super.onStart();
        this.MediaBrowserCompat$CustomActionResultReceiver.read();
    }

    public void onStop() {
        super.onStop();
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$CustomActionResultReceiver.write();
        SupportRequestManagerFragment supportRequestManagerFragment = this.RatingCompat;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.write.remove(this);
            this.RatingCompat = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
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
            sb.append(SupportRequestManagerFragment.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public final void read(Context context, setTitleMarginStart settitlemarginstart) {
        SupportRequestManagerFragment supportRequestManagerFragment = this.RatingCompat;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.write.remove(this);
            this.RatingCompat = null;
        }
        SupportRequestManagerFragment read2 = Glide.IconCompatParcelizer(context).RatingCompat.read(settitlemarginstart, (Fragment) null, isLoadInBackgroundCanceled.IconCompatParcelizer(context));
        this.RatingCompat = read2;
        if (!equals(read2)) {
            this.RatingCompat.write.add(this);
        }
    }
}
