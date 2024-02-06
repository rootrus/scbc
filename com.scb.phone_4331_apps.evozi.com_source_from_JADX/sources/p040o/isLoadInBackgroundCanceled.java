package p040o;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.manager.RequestManagerFragment;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.isLoadInBackgroundCanceled */
public final class isLoadInBackgroundCanceled implements Handler.Callback {
    private static final read read = new read() {
        public final hashCode IconCompatParcelizer(Glide glide, ICheckExtractorListener iCheckExtractorListener, ICheckDeserializer iCheckDeserializer, Context context) {
            return new hashCode(glide, iCheckExtractorListener, iCheckDeserializer, context);
        }
    };
    public final setTextAppearance<View, Fragment> IconCompatParcelizer = new setTextAppearance<>();
    private final read MediaBrowserCompat$CustomActionResultReceiver;
    private volatile hashCode MediaBrowserCompat$ItemReceiver;
    private final Bundle MediaBrowserCompat$MediaItem = new Bundle();
    private Map<FragmentManager, RequestManagerFragment> MediaBrowserCompat$SearchResultReceiver = new HashMap();
    private final Handler MediaDescriptionCompat;
    private Map<setTitleMarginStart, SupportRequestManagerFragment> MediaMetadataCompat = new HashMap();
    public final setTextAppearance<View, android.app.Fragment> write = new setTextAppearance<>();

    /* renamed from: o.isLoadInBackgroundCanceled$read */
    public interface read {
        hashCode IconCompatParcelizer(Glide glide, ICheckExtractorListener iCheckExtractorListener, ICheckDeserializer iCheckDeserializer, Context context);
    }

    public isLoadInBackgroundCanceled(read read2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read2 == null ? read : read2;
        this.MediaDescriptionCompat = new Handler(Looper.getMainLooper(), this);
    }

    private hashCode write(Context context) {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            synchronized (this) {
                if (this.MediaBrowserCompat$ItemReceiver == null) {
                    this.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(Glide.IconCompatParcelizer(context.getApplicationContext()), new superDispatchKeyEvent(), new onDestroyView(), context.getApplicationContext());
                }
            }
        }
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final hashCode read(Context context) {
        while (context != null) {
            if (LinearLayoutManager.MediaBrowserCompat$ItemReceiver() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return write((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return read((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        context = contextWrapper.getBaseContext();
                    }
                }
            }
            return write(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final hashCode write(FragmentActivity fragmentActivity) {
        if (LinearLayoutManager.write()) {
            return read(fragmentActivity.getApplicationContext());
        }
        if (Build.VERSION.SDK_INT < 17 || !fragmentActivity.isDestroyed()) {
            return read(fragmentActivity, fragmentActivity.getSupportFragmentManager(), (Fragment) null, IconCompatParcelizer(fragmentActivity));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final hashCode read(Activity activity) {
        if (LinearLayoutManager.write()) {
            return read(activity.getApplicationContext());
        }
        if (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            return MediaBrowserCompat$ItemReceiver(activity, activity.getFragmentManager(), (android.app.Fragment) null, IconCompatParcelizer(activity));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment next : collection) {
                if (!(next == null || next.getView() == null)) {
                    map.put(next.getView(), next);
                    MediaBrowserCompat$CustomActionResultReceiver(next.getChildFragmentManager().MediaBrowserCompat$CustomActionResultReceiver(), map);
                }
            }
        }
    }

    @Deprecated
    public final void MediaBrowserCompat$ItemReceiver(FragmentManager fragmentManager, setTextAppearance<View, android.app.Fragment> settextappearance) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment next : fragmentManager.getFragments()) {
                if (next.getView() != null) {
                    settextappearance.put(next.getView(), next);
                    MediaBrowserCompat$ItemReceiver(next.getChildFragmentManager(), settextappearance);
                }
            }
            return;
        }
        int i = 0;
        while (true) {
            this.MediaBrowserCompat$MediaItem.putInt("key", i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.MediaBrowserCompat$MediaItem, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    settextappearance.put(fragment.getView(), fragment);
                    if (Build.VERSION.SDK_INT >= 17) {
                        MediaBrowserCompat$ItemReceiver(fragment.getChildFragmentManager(), settextappearance);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static Activity MediaBrowserCompat$ItemReceiver(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public final RequestManagerFragment read(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment == null && (requestManagerFragment = this.MediaBrowserCompat$SearchResultReceiver.get(fragmentManager)) == null) {
            requestManagerFragment = new RequestManagerFragment();
            requestManagerFragment.read = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                requestManagerFragment.IconCompatParcelizer(fragment.getActivity());
            }
            if (z) {
                requestManagerFragment.IconCompatParcelizer.read();
            }
            this.MediaBrowserCompat$SearchResultReceiver.put(fragmentManager, requestManagerFragment);
            fragmentManager.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.MediaDescriptionCompat.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment;
    }

    @Deprecated
    public final hashCode MediaBrowserCompat$ItemReceiver(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        RequestManagerFragment read2 = read(fragmentManager, fragment, z);
        hashCode hashcode = read2.MediaBrowserCompat$CustomActionResultReceiver;
        if (hashcode != null) {
            return hashcode;
        }
        hashCode IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(Glide.IconCompatParcelizer(context), read2.IconCompatParcelizer, read2.MediaBrowserCompat$ItemReceiver, context);
        read2.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        return IconCompatParcelizer2;
    }

    public SupportRequestManagerFragment read(setTitleMarginStart settitlemarginstart, Fragment fragment, boolean z) {
        setTitleMarginStart IconCompatParcelizer2;
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) settitlemarginstart.findFragmentByTag("com.bumptech.glide.manager");
        if (supportRequestManagerFragment == null && (supportRequestManagerFragment = this.MediaMetadataCompat.get(settitlemarginstart)) == null) {
            supportRequestManagerFragment = new SupportRequestManagerFragment();
            supportRequestManagerFragment.read = fragment;
            if (!(fragment == null || fragment.getContext() == null || (IconCompatParcelizer2 = SupportRequestManagerFragment.IconCompatParcelizer(fragment)) == null)) {
                supportRequestManagerFragment.read(fragment.getContext(), IconCompatParcelizer2);
            }
            if (z) {
                supportRequestManagerFragment.MediaBrowserCompat$CustomActionResultReceiver.read();
            }
            this.MediaMetadataCompat.put(settitlemarginstart, supportRequestManagerFragment);
            settitlemarginstart.read().read(supportRequestManagerFragment, "com.bumptech.glide.manager").IconCompatParcelizer();
            this.MediaDescriptionCompat.obtainMessage(2, settitlemarginstart).sendToTarget();
        }
        return supportRequestManagerFragment;
    }

    public final hashCode read(Context context, setTitleMarginStart settitlemarginstart, Fragment fragment, boolean z) {
        SupportRequestManagerFragment read2 = read(settitlemarginstart, fragment, z);
        hashCode hashcode = read2.MediaBrowserCompat$ItemReceiver;
        if (hashcode != null) {
            return hashcode;
        }
        hashCode IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(Glide.IconCompatParcelizer(context), read2.MediaBrowserCompat$CustomActionResultReceiver, read2.IconCompatParcelizer, context);
        read2.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        return IconCompatParcelizer2;
    }

    public final boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = message.what;
        boolean z = true;
        Object obj4 = null;
        if (i == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.MediaBrowserCompat$SearchResultReceiver.remove(obj3);
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj4 == null && Log.isLoggable("RMRetriever", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to remove expected request manager fragment, manager: ");
                sb.append(obj);
                Log.w("RMRetriever", sb.toString());
            }
            return z;
        } else {
            obj3 = (setTitleMarginStart) message.obj;
            obj2 = this.MediaMetadataCompat.remove(obj3);
        }
        Object obj5 = obj3;
        obj4 = obj2;
        obj = obj5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to remove expected request manager fragment, manager: ");
        sb2.append(obj);
        Log.w("RMRetriever", sb2.toString());
        return z;
    }

    public static boolean IconCompatParcelizer(Context context) {
        Activity activity = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else if (context instanceof ContextWrapper) {
            Context context2 = ((ContextWrapper) context).getBaseContext();
            while (true) {
                if (!(context2 instanceof Activity)) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                } else {
                    activity = (Activity) context2;
                    break;
                }
            }
        }
        return activity == null || !activity.isFinishing();
    }
}
