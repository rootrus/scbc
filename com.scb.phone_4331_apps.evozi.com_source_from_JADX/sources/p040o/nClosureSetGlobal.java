package p040o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment;

/* renamed from: o.nClosureSetGlobal */
public class nClosureSetGlobal {
    public final AppCompatCheckBox<String, FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read> write = new AppCompatCheckBox<>();

    public static nClosureSetGlobal read(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return MediaBrowserCompat$ItemReceiver(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return MediaBrowserCompat$ItemReceiver(arrayList);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Log.w("MotionSpec", sb.toString(), e);
            return null;
        }
    }

    private static nClosureSetGlobal MediaBrowserCompat$ItemReceiver(List<Animator> list) {
        nClosureSetGlobal nclosuresetglobal = new nClosureSetGlobal();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            IconCompatParcelizer(nclosuresetglobal, list.get(i));
        }
        return nclosuresetglobal;
    }

    private static void IconCompatParcelizer(nClosureSetGlobal nclosuresetglobal, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = zzlz.read;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = zzlz.MediaBrowserCompat$ItemReceiver;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = zzlz.MediaBrowserCompat$CustomActionResultReceiver;
            }
            FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read read = new FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read(startDelay, duration, interpolator);
            read.IconCompatParcelizer = objectAnimator.getRepeatCount();
            read.MediaBrowserCompat$ItemReceiver = objectAnimator.getRepeatMode();
            nclosuresetglobal.write.put(propertyName, read);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.write.equals(((nClosureSetGlobal) obj).write);
    }

    public int hashCode() {
        return this.write.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.write);
        sb.append("}\n");
        return sb.toString();
    }

    public final FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.read write(String str) {
        if (this.write.get(str) != null) {
            return this.write.get(str);
        }
        throw new IllegalArgumentException();
    }
}
