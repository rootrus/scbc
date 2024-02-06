package p040o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$MediaBrowserCompat$ItemReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p040o.setTitleMarginStart;

/* renamed from: o.setLayoutResource */
public final class setLayoutResource extends setTitleMarginStart implements LayoutInflater.Factory2 {
    static boolean IconCompatParcelizer = false;
    private static Interpolator MediaSessionCompat$Token = new DecelerateInterpolator(1.5f);
    private static Interpolator ParcelableVolumeInfo = new DecelerateInterpolator(2.5f);
    private static Field PlaybackStateCompat$CustomAction;
    private ArrayList<RatingCompat> ActionMenuItemView;
    private ArrayList<setTitleMarginStart.IconCompatParcelizer> AlertController$RecycleListView;
    private boolean AppCompatActivity;
    private final CopyOnWriteArrayList<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> AppCompatDelegateImpl$ListMenuDecorView = new CopyOnWriteArrayList<>();
    private boolean AppCompatDialogFragment;
    private ArrayList<MediaMetadataCompat> AppCompatViewInflater;
    private ArrayList<Integer> Keep;
    ArrayList<setTitleMarginEnd> MediaBrowserCompat$CustomActionResultReceiver;
    final ArrayList<Fragment> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
    public Fragment MediaBrowserCompat$MediaItem;
    Fragment MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f2634x50fd9e4a;
    public setTitleMarginTop MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public setLayoutInflater MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    private ArrayList<setTitleMarginEnd> PlaybackStateCompat;
    public boolean RatingCompat;
    public SparseArray<Fragment> mActive;
    public ViewStubCompat read;
    private int setBackgroundResource = 0;
    private SparseArray<Parcelable> setCheckable = null;
    private ArrayList<Fragment> setChecked;
    private Runnable setContentView = new Runnable() {
        public final void run() {
            setLayoutResource.this.PlaybackStateCompat$CustomAction();
        }
    };
    private Bundle setExpandedFormat = null;
    private ArrayList<Fragment> setHasDecor;
    private ArrayList<Boolean> setIcon;
    private ArrayList<setTitleMarginEnd> setShortcut;
    int write = 0;

    /* renamed from: o.setLayoutResource$MediaDescriptionCompat */
    static class MediaDescriptionCompat {
        public static final int[] IconCompatParcelizer = {16842755, 16842960, 16842961};
    }

    /* renamed from: o.setLayoutResource$MediaMetadataCompat */
    interface MediaMetadataCompat {
        boolean MediaBrowserCompat$ItemReceiver(ArrayList<setTitleMarginEnd> arrayList, ArrayList<Boolean> arrayList2);
    }

    public static int IconCompatParcelizer(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public final LayoutInflater.Factory2 setHasDecor() {
        return this;
    }

    private static boolean IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer.IconCompatParcelizer instanceof AlphaAnimation) {
            return true;
        }
        if (!(iconCompatParcelizer.IconCompatParcelizer instanceof AnimationSet)) {
            return IconCompatParcelizer(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        }
        List<Animation> animations = ((AnimationSet) iconCompatParcelizer.IconCompatParcelizer).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    private static boolean IconCompatParcelizer(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (IconCompatParcelizer(childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean MediaBrowserCompat$ItemReceiver(View view, IconCompatParcelizer iconCompatParcelizer) {
        if (view == null || iconCompatParcelizer == null || Build.VERSION.SDK_INT < 19 || view.getLayerType() != 0 || !SwitchCompat.setChecked(view) || !IconCompatParcelizer(iconCompatParcelizer)) {
            return false;
        }
        return true;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new SearchView("FragmentManager"));
        setTitleMarginTop settitlemargintop = this.MediaDescriptionCompat;
        if (settitlemargintop != null) {
            try {
                settitlemargintop.IconCompatParcelizer("  ", printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                read("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public final CardView read() {
        return new setTitleMarginEnd(this);
    }

    public final boolean IconCompatParcelizer() {
        boolean PlaybackStateCompat$CustomAction2 = PlaybackStateCompat$CustomAction();
        AppCompatDialogFragment();
        return PlaybackStateCompat$CustomAction2;
    }

    public final void RatingCompat() {
        MediaBrowserCompat$ItemReceiver((MediaMetadataCompat) new setLayoutResource$MediaBrowserCompat$MediaItem(this, -1, 0), false);
    }

    public final boolean MediaMetadataCompat() {
        AppCompatActivity();
        return setChecked();
    }

    public final void write(int i) {
        if (i >= 0) {
            MediaBrowserCompat$ItemReceiver((MediaMetadataCompat) new setLayoutResource$MediaBrowserCompat$MediaItem(this, i, 1), false);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private boolean setChecked() {
        setTitleMarginStart peekChildFragmentManager;
        PlaybackStateCompat$CustomAction();
        MediaBrowserCompat$CustomActionResultReceiver(true);
        Fragment fragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (fragment != null && (peekChildFragmentManager = fragment.peekChildFragmentManager()) != null && peekChildFragmentManager.MediaMetadataCompat()) {
            return true;
        }
        boolean MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(this.setShortcut, this.setIcon, (String) null, -1, 0);
        if (MediaBrowserCompat$CustomActionResultReceiver2) {
            this.RatingCompat = true;
            try {
                MediaBrowserCompat$CustomActionResultReceiver(this.setShortcut, this.setIcon);
            } finally {
                this.RatingCompat = false;
                this.setIcon.clear();
                this.setShortcut.clear();
            }
        }
        if (this.AppCompatActivity) {
            this.AppCompatActivity = false;
            ActionMenuItemView();
        }
        AppCompatDelegateImpl$ListMenuDecorView();
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    public final int write() {
        ArrayList<setTitleMarginEnd> arrayList = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final setTitleMarginStart.write MediaBrowserCompat$ItemReceiver(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.get(i);
    }

    public final void MediaBrowserCompat$ItemReceiver(setTitleMarginStart.IconCompatParcelizer iconCompatParcelizer) {
        if (this.AlertController$RecycleListView == null) {
            this.AlertController$RecycleListView = new ArrayList<>();
        }
        this.AlertController$RecycleListView.add(iconCompatParcelizer);
    }

    public final void read(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            MediaBrowserCompat$CustomActionResultReceiver((RuntimeException) new IllegalStateException(sb.toString()));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    public final Fragment write(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        Fragment fragment = this.mActive.get(i);
        if (fragment == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": index ");
            sb.append(i);
            MediaBrowserCompat$CustomActionResultReceiver((RuntimeException) new IllegalStateException(sb.toString()));
        }
        return fragment;
    }

    public final List<Fragment> MediaBrowserCompat$CustomActionResultReceiver() {
        List<Fragment> list;
        if (this.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.MediaBrowserCompat$ItemReceiver) {
            list = (List) this.MediaBrowserCompat$ItemReceiver.clone();
        }
        return list;
    }

    public final Fragment.IconCompatParcelizer write(Fragment fragment) {
        Bundle ParcelableVolumeInfo2;
        if (fragment.mIndex < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            MediaBrowserCompat$CustomActionResultReceiver((RuntimeException) new IllegalStateException(sb.toString()));
        }
        if (fragment.mState <= 0 || (ParcelableVolumeInfo2 = ParcelableVolumeInfo(fragment)) == null) {
            return null;
        }
        return new Fragment.IconCompatParcelizer(ParcelableVolumeInfo2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.MediaBrowserCompat$MediaItem;
        if (fragment != null) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Object) fragment, sb);
        } else {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void read(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String obj = sb.toString();
        SparseArray<Fragment> sparseArray = this.mActive;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size5; i++) {
                Fragment valueAt = this.mActive.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.dump(obj, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.MediaBrowserCompat$ItemReceiver.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size6; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.MediaBrowserCompat$ItemReceiver.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.setHasDecor;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.setHasDecor.get(i3).toString());
            }
        }
        ArrayList<setTitleMarginEnd> arrayList2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                setTitleMarginEnd settitlemarginend = this.MediaBrowserCompat$CustomActionResultReceiver.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(settitlemarginend.toString());
                settitlemarginend.MediaBrowserCompat$ItemReceiver(obj, printWriter);
            }
        }
        synchronized (this) {
            if (this.PlaybackStateCompat != null && (size2 = this.PlaybackStateCompat.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.PlaybackStateCompat.get(i5));
                }
            }
            if (this.Keep != null && this.Keep.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.Keep.toArray()));
            }
        }
        ArrayList<MediaMetadataCompat> arrayList3 = this.AppCompatViewInflater;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(this.AppCompatViewInflater.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.MediaDescriptionCompat);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.read);
        if (this.MediaBrowserCompat$MediaItem != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.MediaBrowserCompat$MediaItem);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.write);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2634x50fd9e4a);
        printWriter.print(" mStopped=");
        printWriter.print(this.MediaSessionCompat$ResultReceiverWrapper);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.MediaMetadataCompat);
        if (this.AppCompatDialogFragment) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.AppCompatDialogFragment);
        }
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    private static IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(ParcelableVolumeInfo);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(MediaSessionCompat$Token);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new IconCompatParcelizer((Animation) animationSet);
    }

    private static IconCompatParcelizer write(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(MediaSessionCompat$Token);
        alphaAnimation.setDuration(220);
        return new IconCompatParcelizer((Animation) alphaAnimation);
    }

    private IconCompatParcelizer read(Fragment fragment, int i, boolean z, int i2) {
        int nextAnim = fragment.getNextAnim();
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, nextAnim);
        if (onCreateAnimation != null) {
            return new IconCompatParcelizer(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i, z, nextAnim);
        if (onCreateAnimator != null) {
            return new IconCompatParcelizer(onCreateAnimator);
        }
        char c = 1;
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.MediaDescriptionCompat.IconCompatParcelizer.getResources().getResourceTypeName(nextAnim));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.MediaDescriptionCompat.IconCompatParcelizer, nextAnim);
                    if (loadAnimation != null) {
                        return new IconCompatParcelizer(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.MediaDescriptionCompat.IconCompatParcelizer, nextAnim);
                    if (loadAnimator != null) {
                        return new IconCompatParcelizer(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.MediaDescriptionCompat.IconCompatParcelizer, nextAnim);
                        if (loadAnimation2 != null) {
                            return new IconCompatParcelizer(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        if (i != 4097) {
            c = i != 4099 ? i != 8194 ? 65535 : z ? (char) 3 : 4 : z ? (char) 5 : 6;
        } else if (!z) {
            c = 2;
        }
        if (c < 0) {
            return null;
        }
        switch (c) {
            case 1:
                return MediaBrowserCompat$CustomActionResultReceiver(1.125f, 1.0f, (float) BitmapDescriptorFactory.HUE_RED, 1.0f);
            case 2:
                return MediaBrowserCompat$CustomActionResultReceiver(1.0f, 0.975f, 1.0f, (float) BitmapDescriptorFactory.HUE_RED);
            case 3:
                return MediaBrowserCompat$CustomActionResultReceiver(0.975f, 1.0f, (float) BitmapDescriptorFactory.HUE_RED, 1.0f);
            case 4:
                return MediaBrowserCompat$CustomActionResultReceiver(1.0f, 1.075f, 1.0f, (float) BitmapDescriptorFactory.HUE_RED);
            case 5:
                return write((float) BitmapDescriptorFactory.HUE_RED, 1.0f);
            case 6:
                return write(1.0f, (float) BitmapDescriptorFactory.HUE_RED);
            default:
                if (i2 == 0 && this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver()) {
                    this.MediaDescriptionCompat.write();
                }
                return null;
        }
    }

    public final void MediaBrowserCompat$MediaItem(Fragment fragment) {
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.RatingCompat) {
            this.AppCompatActivity = true;
            return;
        }
        fragment.mDeferStart = false;
        IconCompatParcelizer(fragment, this.write, 0, 0, false);
    }

    private static void IconCompatParcelizer(View view, IconCompatParcelizer iconCompatParcelizer) {
        if (view != null && iconCompatParcelizer != null && MediaBrowserCompat$ItemReceiver(view, iconCompatParcelizer)) {
            if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver != null) {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.addListener(new setLayoutResource$MediaBrowserCompat$ItemReceiver(view));
                return;
            }
            Animation.AnimationListener write2 = write(iconCompatParcelizer.IconCompatParcelizer);
            view.setLayerType(2, (Paint) null);
            iconCompatParcelizer.IconCompatParcelizer.setAnimationListener(new setLayoutResource$MediaBrowserCompat$CustomActionResultReceiver(view, write2));
        }
    }

    private static Animation.AnimationListener write(Animation animation) {
        try {
            if (PlaybackStateCompat$CustomAction == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                PlaybackStateCompat$CustomAction = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) PlaybackStateCompat$CustomAction.get(animation);
        } catch (NoSuchFieldException e) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        }
    }

    public final boolean read(int i) {
        return this.write > 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: boolean} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0070, code lost:
        if (r0 != 3) goto L_0x0377;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(androidx.fragment.app.Fragment r16, int r17, int r18, int r19, boolean r20) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            boolean r0 = r7.mAdded
            r8 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r7.mDetached
            if (r0 == 0) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            r0 = r17
            goto L_0x0015
        L_0x0010:
            r0 = r17
            if (r0 <= r8) goto L_0x0015
            r0 = r8
        L_0x0015:
            boolean r1 = r7.mRemoving
            if (r1 == 0) goto L_0x002b
            int r1 = r7.mState
            if (r0 <= r1) goto L_0x002b
            int r0 = r7.mState
            if (r0 != 0) goto L_0x0029
            boolean r0 = r16.isInBackStack()
            if (r0 == 0) goto L_0x0029
            r0 = r8
            goto L_0x002b
        L_0x0029:
            int r0 = r7.mState
        L_0x002b:
            boolean r1 = r7.mDeferStart
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0039
            int r1 = r7.mState
            if (r1 >= r9) goto L_0x0039
            if (r0 <= r10) goto L_0x0039
            r11 = r10
            goto L_0x003a
        L_0x0039:
            r11 = r0
        L_0x003a:
            int r0 = r7.mState
            r12 = 0
            r13 = 0
            if (r0 > r11) goto L_0x0283
            boolean r0 = r7.mFromLayout
            if (r0 == 0) goto L_0x0049
            boolean r0 = r7.mInLayout
            if (r0 != 0) goto L_0x0049
            return
        L_0x0049:
            android.view.View r0 = r16.getAnimatingAway()
            if (r0 != 0) goto L_0x0055
            android.animation.Animator r0 = r16.getAnimator()
            if (r0 == 0) goto L_0x0068
        L_0x0055:
            r7.setAnimatingAway(r12)
            r7.setAnimator(r12)
            int r2 = r16.getStateAfterAnimating()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r15
            r1 = r16
            r0.IconCompatParcelizer((androidx.fragment.app.Fragment) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x0068:
            int r0 = r7.mState
            if (r0 == 0) goto L_0x0074
            if (r0 == r8) goto L_0x018b
            if (r0 == r10) goto L_0x026c
            if (r0 == r9) goto L_0x0274
            goto L_0x0377
        L_0x0074:
            if (r11 <= 0) goto L_0x018b
            android.os.Bundle r0 = r7.mSavedFragmentState
            if (r0 == 0) goto L_0x00cb
            android.os.Bundle r0 = r7.mSavedFragmentState
            o.setTitleMarginTop r1 = r6.MediaDescriptionCompat
            android.content.Context r1 = r1.IconCompatParcelizer
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.mSavedViewState = r0
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            androidx.fragment.app.Fragment r0 = r15.write(r0, r1)
            r7.mTarget = r0
            androidx.fragment.app.Fragment r0 = r7.mTarget
            if (r0 == 0) goto L_0x00a9
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.mTargetRequestCode = r0
        L_0x00a9:
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            if (r0 == 0) goto L_0x00b8
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            boolean r0 = r0.booleanValue()
            r7.mUserVisibleHint = r0
            r7.mSavedUserVisibleHint = r12
            goto L_0x00c2
        L_0x00b8:
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.mUserVisibleHint = r0
        L_0x00c2:
            boolean r0 = r7.mUserVisibleHint
            if (r0 != 0) goto L_0x00cb
            r7.mDeferStart = r8
            if (r11 <= r10) goto L_0x00cb
            r11 = r10
        L_0x00cb:
            o.setTitleMarginTop r0 = r6.MediaDescriptionCompat
            r7.mHost = r0
            androidx.fragment.app.Fragment r0 = r6.MediaBrowserCompat$MediaItem
            r7.mParentFragment = r0
            androidx.fragment.app.Fragment r0 = r6.MediaBrowserCompat$MediaItem
            if (r0 == 0) goto L_0x00da
            o.setLayoutResource r0 = r0.mChildFragmentManager
            goto L_0x00de
        L_0x00da:
            o.setTitleMarginTop r0 = r6.MediaDescriptionCompat
            o.setLayoutResource r0 = r0.write
        L_0x00de:
            r7.mFragmentManager = r0
            androidx.fragment.app.Fragment r0 = r7.mTarget
            java.lang.String r14 = "Fragment "
            if (r0 == 0) goto L_0x0129
            android.util.SparseArray<androidx.fragment.app.Fragment> r0 = r6.mActive
            androidx.fragment.app.Fragment r1 = r7.mTarget
            int r1 = r1.mIndex
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r1 = r7.mTarget
            if (r0 != r1) goto L_0x0105
            androidx.fragment.app.Fragment r0 = r7.mTarget
            int r0 = r0.mState
            if (r0 > 0) goto L_0x0129
            androidx.fragment.app.Fragment r1 = r7.mTarget
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r15
            r0.IconCompatParcelizer((androidx.fragment.app.Fragment) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
            goto L_0x0129
        L_0x0105:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r7)
            java.lang.String r1 = " declared target fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r7.mTarget
            r0.append(r1)
            java.lang.String r1 = " that does not belong to this FragmentManager!"
            r0.append(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0129:
            o.setTitleMarginTop r0 = r6.MediaDescriptionCompat
            android.content.Context r0 = r0.IconCompatParcelizer
            r15.MediaBrowserCompat$CustomActionResultReceiver((androidx.fragment.app.Fragment) r7, (android.content.Context) r0, (boolean) r13)
            r7.mCalled = r13
            o.setTitleMarginTop r0 = r6.MediaDescriptionCompat
            android.content.Context r0 = r0.IconCompatParcelizer
            r7.onAttach((android.content.Context) r0)
            boolean r0 = r7.mCalled
            if (r0 == 0) goto L_0x0171
            androidx.fragment.app.Fragment r0 = r7.mParentFragment
            if (r0 != 0) goto L_0x0147
            o.setTitleMarginTop r0 = r6.MediaDescriptionCompat
            r0.write(r7)
            goto L_0x014c
        L_0x0147:
            androidx.fragment.app.Fragment r0 = r7.mParentFragment
            r0.onAttachFragment(r7)
        L_0x014c:
            o.setTitleMarginTop r0 = r6.MediaDescriptionCompat
            android.content.Context r0 = r0.IconCompatParcelizer
            r15.IconCompatParcelizer((androidx.fragment.app.Fragment) r7, (android.content.Context) r0, (boolean) r13)
            boolean r0 = r7.mIsCreated
            if (r0 != 0) goto L_0x0167
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.MediaBrowserCompat$ItemReceiver(r7, r0, r13)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.performCreate(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.MediaBrowserCompat$CustomActionResultReceiver((androidx.fragment.app.Fragment) r7, (android.os.Bundle) r0, (boolean) r13)
            goto L_0x016e
        L_0x0167:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.restoreChildFragmentState(r0)
            r7.mState = r8
        L_0x016e:
            r7.mRetaining = r13
            goto L_0x018b
        L_0x0171:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r7)
            java.lang.String r1 = " did not call through to super.onAttach()"
            r0.append(r1)
            o.setRadius r1 = new o.setRadius
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x018b:
            r15.MediaSessionCompat$QueueItem(r16)
            if (r11 <= r8) goto L_0x026c
            boolean r0 = r7.mFromLayout
            if (r0 != 0) goto L_0x0257
            int r0 = r7.mContainerId
            if (r0 == 0) goto L_0x0209
            int r0 = r7.mContainerId
            r1 = -1
            if (r0 != r1) goto L_0x01bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot create fragment "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " for a container view with no id"
            r0.append(r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            r15.MediaBrowserCompat$CustomActionResultReceiver((java.lang.RuntimeException) r1)
        L_0x01bb:
            o.ViewStubCompat r0 = r6.read
            int r1 = r7.mContainerId
            android.view.View r0 = r0.read(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x020a
            boolean r1 = r7.mRestored
            if (r1 != 0) goto L_0x020a
            android.content.res.Resources r1 = r16.getResources()     // Catch:{ NotFoundException -> 0x01d6 }
            int r2 = r7.mContainerId     // Catch:{ NotFoundException -> 0x01d6 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01d6 }
            goto L_0x01d9
        L_0x01d6:
            java.lang.String r1 = "unknown"
        L_0x01d9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            int r3 = r7.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ") for fragment "
            r2.append(r1)
            r2.append(r7)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r15.MediaBrowserCompat$CustomActionResultReceiver((java.lang.RuntimeException) r1)
            goto L_0x020a
        L_0x0209:
            r0 = r12
        L_0x020a:
            r7.mContainer = r0
            android.os.Bundle r1 = r7.mSavedFragmentState
            android.view.LayoutInflater r1 = r7.performGetLayoutInflater(r1)
            android.os.Bundle r2 = r7.mSavedFragmentState
            r7.performCreateView(r1, r0, r2)
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x0255
            android.view.View r1 = r7.mView
            r7.mInnerView = r1
            android.view.View r1 = r7.mView
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x022b
            android.view.View r1 = r7.mView
            r0.addView(r1)
        L_0x022b:
            boolean r0 = r7.mHidden
            if (r0 == 0) goto L_0x0236
            android.view.View r0 = r7.mView
            r1 = 8
            r0.setVisibility(r1)
        L_0x0236:
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r7.onViewCreated(r0, r1)
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r15.read((androidx.fragment.app.Fragment) r7, (android.view.View) r0, (android.os.Bundle) r1, (boolean) r13)
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0251
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x0251
            goto L_0x0252
        L_0x0251:
            r8 = r13
        L_0x0252:
            r7.mIsNewlyAdded = r8
            goto L_0x0257
        L_0x0255:
            r7.mInnerView = r12
        L_0x0257:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.performActivityCreated(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.write(r7, r0, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x026a
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.restoreViewState(r0)
        L_0x026a:
            r7.mSavedFragmentState = r12
        L_0x026c:
            if (r11 <= r10) goto L_0x0274
            r16.performStart()
            r15.MediaBrowserCompat$SearchResultReceiver(r7, r13)
        L_0x0274:
            r8 = r11
            if (r8 <= r9) goto L_0x0378
            r16.performResume()
            r15.MediaBrowserCompat$ItemReceiver((androidx.fragment.app.Fragment) r7, (boolean) r13)
            r7.mSavedFragmentState = r12
            r7.mSavedViewState = r12
            goto L_0x0378
        L_0x0283:
            int r0 = r7.mState
            if (r0 <= r11) goto L_0x0377
            int r0 = r7.mState
            if (r0 == r8) goto L_0x0311
            if (r0 == r10) goto L_0x02a4
            if (r0 == r9) goto L_0x029c
            r1 = 4
            if (r0 == r1) goto L_0x0294
            goto L_0x0377
        L_0x0294:
            if (r11 >= r1) goto L_0x029c
            r16.performPause()
            r15.read((androidx.fragment.app.Fragment) r7, (boolean) r13)
        L_0x029c:
            if (r11 >= r9) goto L_0x02a4
            r16.performStop()
            r15.MediaDescriptionCompat(r7, r13)
        L_0x02a4:
            if (r11 >= r10) goto L_0x0311
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x02b9
            o.setTitleMarginTop r0 = r6.MediaDescriptionCompat
            boolean r0 = r0.MediaMetadataCompat()
            if (r0 == 0) goto L_0x02b9
            android.util.SparseArray<android.os.Parcelable> r0 = r7.mSavedViewState
            if (r0 != 0) goto L_0x02b9
            r15.m3116x50fd9e4a(r16)
        L_0x02b9:
            r16.performDestroyView()
            r15.MediaBrowserCompat$MediaItem(r7, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x0302
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x0302
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.endViewTransition(r1)
            android.view.View r0 = r7.mView
            r0.clearAnimation()
            int r0 = r6.write
            r1 = 0
            if (r0 <= 0) goto L_0x02f3
            boolean r0 = r6.MediaMetadataCompat
            if (r0 != 0) goto L_0x02f3
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02f3
            float r0 = r7.mPostponedAlpha
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02f3
            r0 = r18
            r2 = r19
            o.setLayoutResource$IconCompatParcelizer r0 = r15.read((androidx.fragment.app.Fragment) r7, (int) r0, (boolean) r13, (int) r2)
            goto L_0x02f4
        L_0x02f3:
            r0 = r12
        L_0x02f4:
            r7.mPostponedAlpha = r1
            if (r0 == 0) goto L_0x02fb
            r15.MediaBrowserCompat$CustomActionResultReceiver((androidx.fragment.app.Fragment) r7, (p040o.setLayoutResource.IconCompatParcelizer) r0, (int) r11)
        L_0x02fb:
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.removeView(r1)
        L_0x0302:
            r7.mContainer = r12
            r7.mView = r12
            r7.mViewLifecycleOwner = r12
            o.remove<o.maxSize> r0 = r7.mViewLifecycleOwnerLiveData
            r0.MediaBrowserCompat$CustomActionResultReceiver(r12)
            r7.mInnerView = r12
            r7.mInLayout = r13
        L_0x0311:
            if (r11 > 0) goto L_0x0377
            boolean r0 = r6.MediaMetadataCompat
            if (r0 == 0) goto L_0x0338
            android.view.View r0 = r16.getAnimatingAway()
            if (r0 == 0) goto L_0x0328
            android.view.View r0 = r16.getAnimatingAway()
            r7.setAnimatingAway(r12)
            r0.clearAnimation()
            goto L_0x0338
        L_0x0328:
            android.animation.Animator r0 = r16.getAnimator()
            if (r0 == 0) goto L_0x0338
            android.animation.Animator r0 = r16.getAnimator()
            r7.setAnimator(r12)
            r0.cancel()
        L_0x0338:
            android.view.View r0 = r16.getAnimatingAway()
            if (r0 != 0) goto L_0x0373
            android.animation.Animator r0 = r16.getAnimator()
            if (r0 != 0) goto L_0x0373
            boolean r0 = r7.mRetaining
            if (r0 != 0) goto L_0x034f
            r16.performDestroy()
            r15.MediaBrowserCompat$CustomActionResultReceiver((androidx.fragment.app.Fragment) r7, (boolean) r13)
            goto L_0x0351
        L_0x034f:
            r7.mState = r13
        L_0x0351:
            r16.performDetach()
            r15.IconCompatParcelizer((androidx.fragment.app.Fragment) r7, (boolean) r13)
            if (r20 != 0) goto L_0x0377
            boolean r0 = r7.mRetaining
            if (r0 != 0) goto L_0x036c
            int r0 = r7.mIndex
            if (r0 < 0) goto L_0x0377
            android.util.SparseArray<androidx.fragment.app.Fragment> r0 = r6.mActive
            int r1 = r7.mIndex
            r0.put(r1, r12)
            r16.initState()
            goto L_0x0377
        L_0x036c:
            r7.mHost = r12
            r7.mParentFragment = r12
            r7.mFragmentManager = r12
            goto L_0x0377
        L_0x0373:
            r7.setStateAfterAnimating(r11)
            goto L_0x0378
        L_0x0377:
            r8 = r11
        L_0x0378:
            int r0 = r7.mState
            if (r0 == r8) goto L_0x03ab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; "
            r0.append(r1)
            java.lang.String r1 = "expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.w(r1, r0)
            r7.mState = r8
        L_0x03ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setLayoutResource.IconCompatParcelizer(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(final Fragment fragment, IconCompatParcelizer iconCompatParcelizer, int i) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        if (iconCompatParcelizer.IconCompatParcelizer != null) {
            read read2 = new read(iconCompatParcelizer.IconCompatParcelizer, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            read2.setAnimationListener(new Runnable(write((Animation) read2)) {
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(this);
                }

                public final void run() {
                    if (fragment.getAnimatingAway() != null) {
                        fragment.setAnimatingAway((View) null);
                        setLayoutResource setlayoutresource = setLayoutResource.this;
                        Fragment fragment = fragment;
                        setlayoutresource.IconCompatParcelizer(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                    }
                }
            });
            IconCompatParcelizer(view, iconCompatParcelizer);
            fragment.mView.startAnimation(read2);
            return;
        }
        Animator animator = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        fragment.setAnimator(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        animator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                Animator animator2 = fragment.getAnimator();
                fragment.setAnimator((Animator) null);
                if (animator2 != null && viewGroup.indexOfChild(view) < 0) {
                    setLayoutResource setlayoutresource = setLayoutResource.this;
                    Fragment fragment = fragment;
                    setlayoutresource.IconCompatParcelizer(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        });
        animator.setTarget(fragment.mView);
        IconCompatParcelizer(fragment.mView, iconCompatParcelizer);
        animator.start();
    }

    private void MediaSessionCompat$QueueItem(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), (ViewGroup) null, fragment.mSavedFragmentState);
            if (fragment.mView != null) {
                fragment.mInnerView = fragment.mView;
                fragment.mView.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                read(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    private void MediaSessionCompat$ResultReceiverWrapper(final Fragment fragment) {
        if (fragment.mView != null) {
            IconCompatParcelizer read2 = read(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (read2 == null || read2.MediaBrowserCompat$CustomActionResultReceiver == null) {
                if (read2 != null) {
                    IconCompatParcelizer(fragment.mView, read2);
                    fragment.mView.startAnimation(read2.IconCompatParcelizer);
                    read2.IconCompatParcelizer.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                read2.MediaBrowserCompat$CustomActionResultReceiver.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = fragment.mContainer;
                    final View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    read2.MediaBrowserCompat$CustomActionResultReceiver.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.mView != null) {
                                fragment.mView.setVisibility(8);
                            }
                        }
                    });
                }
                IconCompatParcelizer(fragment.mView, read2);
                read2.MediaBrowserCompat$CustomActionResultReceiver.start();
            }
        }
        if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
            this.AppCompatDialogFragment = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = r0.mView;
        r1 = r11.mContainer;
        r0 = r1.indexOfChild(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaMetadataCompat(androidx.fragment.app.Fragment r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r10.write
            boolean r1 = r11.mRemoving
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            boolean r1 = r11.isInBackStack()
            if (r1 == 0) goto L_0x0016
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x001a
        L_0x0016:
            int r0 = java.lang.Math.min(r0, r3)
        L_0x001a:
            r6 = r0
            int r7 = r11.getNextTransition()
            int r8 = r11.getNextTransitionStyle()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.IconCompatParcelizer((androidx.fragment.app.Fragment) r5, (int) r6, (int) r7, (int) r8, (boolean) r9)
            android.view.View r0 = r11.mView
            if (r0 == 0) goto L_0x0090
            androidx.fragment.app.Fragment r0 = r10.MediaSessionCompat$Token(r11)
            if (r0 == 0) goto L_0x004b
            android.view.View r0 = r0.mView
            android.view.ViewGroup r1 = r11.mContainer
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.mView
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L_0x004b
            r1.removeViewAt(r4)
            android.view.View r4 = r11.mView
            r1.addView(r4, r0)
        L_0x004b:
            boolean r0 = r11.mIsNewlyAdded
            if (r0 == 0) goto L_0x0090
            android.view.ViewGroup r0 = r11.mContainer
            if (r0 == 0) goto L_0x0090
            float r0 = r11.mPostponedAlpha
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            android.view.View r0 = r11.mView
            float r4 = r11.mPostponedAlpha
            r0.setAlpha(r4)
        L_0x0061:
            r11.mPostponedAlpha = r1
            r11.mIsNewlyAdded = r3
            int r0 = r11.getNextTransition()
            int r1 = r11.getNextTransitionStyle()
            o.setLayoutResource$IconCompatParcelizer r0 = r10.read((androidx.fragment.app.Fragment) r11, (int) r0, (boolean) r2, (int) r1)
            if (r0 == 0) goto L_0x0090
            android.view.View r1 = r11.mView
            IconCompatParcelizer((android.view.View) r1, (p040o.setLayoutResource.IconCompatParcelizer) r0)
            android.view.animation.Animation r1 = r0.IconCompatParcelizer
            if (r1 == 0) goto L_0x0084
            android.view.View r1 = r11.mView
            android.view.animation.Animation r0 = r0.IconCompatParcelizer
            r1.startAnimation(r0)
            goto L_0x0090
        L_0x0084:
            android.animation.Animator r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            android.view.View r2 = r11.mView
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r0.start()
        L_0x0090:
            boolean r0 = r11.mHiddenChanged
            if (r0 == 0) goto L_0x0097
            r10.MediaSessionCompat$ResultReceiverWrapper(r11)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setLayoutResource.MediaMetadataCompat(androidx.fragment.app.Fragment):void");
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, boolean z) {
        setTitleMarginTop settitlemargintop;
        if (this.MediaDescriptionCompat == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.write) {
            this.write = i;
            if (this.mActive != null) {
                int size = this.MediaBrowserCompat$ItemReceiver.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MediaMetadataCompat(this.MediaBrowserCompat$ItemReceiver.get(i2));
                }
                int size2 = this.mActive.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Fragment valueAt = this.mActive.valueAt(i3);
                    if (valueAt != null && ((valueAt.mRemoving || valueAt.mDetached) && !valueAt.mIsNewlyAdded)) {
                        MediaMetadataCompat(valueAt);
                    }
                }
                ActionMenuItemView();
                if (this.AppCompatDialogFragment && (settitlemargintop = this.MediaDescriptionCompat) != null && this.write == 4) {
                    settitlemargintop.MediaBrowserCompat$MediaItem();
                    this.AppCompatDialogFragment = false;
                }
            }
        }
    }

    private void ActionMenuItemView() {
        if (this.mActive != null) {
            for (int i = 0; i < this.mActive.size(); i++) {
                Fragment valueAt = this.mActive.valueAt(i);
                if (valueAt != null) {
                    MediaBrowserCompat$MediaItem(valueAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(Fragment fragment) {
        if (fragment.mIndex < 0) {
            int i = this.setBackgroundResource;
            this.setBackgroundResource = i + 1;
            fragment.setIndex(i, this.MediaBrowserCompat$MediaItem);
            if (this.mActive == null) {
                this.mActive = new SparseArray<>();
            }
            this.mActive.put(fragment.mIndex, fragment);
        }
    }

    public final void write(Fragment fragment, boolean z) {
        IconCompatParcelizer(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.MediaBrowserCompat$ItemReceiver.contains(fragment)) {
            synchronized (this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.AppCompatDialogFragment = true;
            }
            if (z) {
                IconCompatParcelizer(fragment, this.write, 0, 0, false);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }

    public final void MediaDescriptionCompat(Fragment fragment) {
        boolean isInBackStack = fragment.isInBackStack();
        if (!fragment.mDetached || (!isInBackStack)) {
            synchronized (this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.AppCompatDialogFragment = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Fragment fragment) {
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    public static void RatingCompat(Fragment fragment) {
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void read(Fragment fragment) {
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                synchronized (this.MediaBrowserCompat$ItemReceiver) {
                    this.MediaBrowserCompat$ItemReceiver.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.AppCompatDialogFragment = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Fragment fragment) {
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.MediaBrowserCompat$ItemReceiver.contains(fragment)) {
                synchronized (this.MediaBrowserCompat$ItemReceiver) {
                    this.MediaBrowserCompat$ItemReceiver.add(fragment);
                }
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.AppCompatDialogFragment = true;
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment already added: ");
            sb.append(fragment);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final Fragment findFragmentById(int i) {
        for (int size = this.MediaBrowserCompat$ItemReceiver.size() - 1; size >= 0; size--) {
            Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        SparseArray<Fragment> sparseArray = this.mActive;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.mActive.valueAt(size2);
            if (valueAt != null && valueAt.mFragmentId == i) {
                return valueAt;
            }
        }
        return null;
    }

    public final Fragment findFragmentByTag(String str) {
        if (str != null) {
            for (int size = this.MediaBrowserCompat$ItemReceiver.size() - 1; size >= 0; size--) {
                Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        SparseArray<Fragment> sparseArray = this.mActive;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.mActive.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.mTag)) {
                return valueAt;
            }
        }
        return null;
    }

    public final Fragment MediaBrowserCompat$CustomActionResultReceiver(String str) {
        Fragment findFragmentByWho;
        SparseArray<Fragment> sparseArray = this.mActive;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            Fragment valueAt = this.mActive.valueAt(size);
            if (valueAt != null && (findFragmentByWho = valueAt.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.f2634x50fd9e4a || this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public final void MediaBrowserCompat$ItemReceiver(MediaMetadataCompat mediaMetadataCompat, boolean z) {
        if (!z) {
            AppCompatActivity();
        }
        synchronized (this) {
            if (!this.MediaMetadataCompat) {
                if (this.MediaDescriptionCompat != null) {
                    if (this.AppCompatViewInflater == null) {
                        this.AppCompatViewInflater = new ArrayList<>();
                    }
                    this.AppCompatViewInflater.add(mediaMetadataCompat);
                    setBackgroundResource();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setBackgroundResource() {
        synchronized (this) {
            boolean z = true;
            boolean z2 = this.ActionMenuItemView != null && !this.ActionMenuItemView.isEmpty();
            if (this.AppCompatViewInflater == null || this.AppCompatViewInflater.size() != 1) {
                z = false;
            }
            if (z2 || z) {
                this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacks(this.setContentView);
                this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.post(this.setContentView);
            }
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(setTitleMarginEnd settitlemarginend) {
        synchronized (this) {
            if (this.Keep != null) {
                if (this.Keep.size() > 0) {
                    int intValue = this.Keep.remove(this.Keep.size() - 1).intValue();
                    this.PlaybackStateCompat.set(intValue, settitlemarginend);
                    return intValue;
                }
            }
            if (this.PlaybackStateCompat == null) {
                this.PlaybackStateCompat = new ArrayList<>();
            }
            int size = this.PlaybackStateCompat.size();
            this.PlaybackStateCompat.add(settitlemarginend);
            return size;
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i, setTitleMarginEnd settitlemarginend) {
        synchronized (this) {
            if (this.PlaybackStateCompat == null) {
                this.PlaybackStateCompat = new ArrayList<>();
            }
            int size = this.PlaybackStateCompat.size();
            if (i < size) {
                this.PlaybackStateCompat.set(i, settitlemarginend);
            } else {
                while (size < i) {
                    this.PlaybackStateCompat.add((Object) null);
                    if (this.Keep == null) {
                        this.Keep = new ArrayList<>();
                    }
                    this.Keep.add(Integer.valueOf(size));
                    size++;
                }
                this.PlaybackStateCompat.add(settitlemarginend);
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (this.RatingCompat) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.MediaDescriptionCompat == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.getLooper()) {
            if (!z) {
                AppCompatActivity();
            }
            if (this.setShortcut == null) {
                this.setShortcut = new ArrayList<>();
                this.setIcon = new ArrayList<>();
            }
            this.RatingCompat = true;
            try {
                MediaBrowserCompat$ItemReceiver((ArrayList<setTitleMarginEnd>) null, (ArrayList<Boolean>) null);
            } finally {
                this.RatingCompat = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public final void read(MediaMetadataCompat mediaMetadataCompat, boolean z) {
        if (!z || (this.MediaDescriptionCompat != null && !this.MediaMetadataCompat)) {
            MediaBrowserCompat$CustomActionResultReceiver(z);
            if (mediaMetadataCompat.MediaBrowserCompat$ItemReceiver(this.setShortcut, this.setIcon)) {
                this.RatingCompat = true;
                try {
                    MediaBrowserCompat$CustomActionResultReceiver(this.setShortcut, this.setIcon);
                } finally {
                    this.RatingCompat = false;
                    this.setIcon.clear();
                    this.setShortcut.clear();
                }
            }
            if (this.AppCompatActivity) {
                this.AppCompatActivity = false;
                ActionMenuItemView();
            }
            AppCompatDelegateImpl$ListMenuDecorView();
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean PlaybackStateCompat$CustomAction() {
        MediaBrowserCompat$CustomActionResultReceiver(true);
        boolean z = false;
        while (IconCompatParcelizer(this.setShortcut, this.setIcon)) {
            this.RatingCompat = true;
            try {
                MediaBrowserCompat$CustomActionResultReceiver(this.setShortcut, this.setIcon);
                this.RatingCompat = false;
                this.setIcon.clear();
                this.setShortcut.clear();
                z = true;
            } catch (Throwable th) {
                this.RatingCompat = false;
                this.setIcon.clear();
                this.setShortcut.clear();
                throw th;
            }
        }
        if (this.AppCompatActivity) {
            this.AppCompatActivity = false;
            ActionMenuItemView();
        }
        AppCompatDelegateImpl$ListMenuDecorView();
        return z;
    }

    private void MediaBrowserCompat$ItemReceiver(ArrayList<setTitleMarginEnd> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<RatingCompat> arrayList3 = this.ActionMenuItemView;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            RatingCompat ratingCompat = this.ActionMenuItemView.get(i);
            if (arrayList == null || ratingCompat.write || (indexOf2 = arrayList.indexOf(ratingCompat.MediaBrowserCompat$ItemReceiver)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if ((ratingCompat.MediaBrowserCompat$CustomActionResultReceiver == 0) || (arrayList != null && ratingCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(arrayList, 0, arrayList.size()))) {
                    this.ActionMenuItemView.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || ratingCompat.write || (indexOf = arrayList.indexOf(ratingCompat.MediaBrowserCompat$ItemReceiver)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        ratingCompat.MediaBrowserCompat$ItemReceiver();
                    } else {
                        ratingCompat.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.read(ratingCompat.MediaBrowserCompat$ItemReceiver, ratingCompat.write, false, false);
                    }
                }
            } else {
                ratingCompat.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.read(ratingCompat.MediaBrowserCompat$ItemReceiver, ratingCompat.write, false, false);
            }
            i++;
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(ArrayList<setTitleMarginEnd> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            MediaBrowserCompat$ItemReceiver(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).MediaSessionCompat$QueueItem) {
                    if (i2 != i) {
                        MediaBrowserCompat$ItemReceiver(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).MediaSessionCompat$QueueItem) {
                            i2++;
                        }
                    }
                    MediaBrowserCompat$ItemReceiver(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                MediaBrowserCompat$ItemReceiver(arrayList, arrayList2, i2, size);
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(ArrayList<setTitleMarginEnd> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<setTitleMarginEnd> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = arrayList3.get(i4).MediaSessionCompat$QueueItem;
        ArrayList<Fragment> arrayList5 = this.setChecked;
        if (arrayList5 == null) {
            this.setChecked = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.setChecked.addAll(this.MediaBrowserCompat$ItemReceiver);
        Fragment fragment = this.MediaBrowserCompat$SearchResultReceiver;
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            setTitleMarginEnd settitlemarginend = arrayList3.get(i6);
            if (!arrayList4.get(i6).booleanValue()) {
                fragment = settitlemarginend.MediaBrowserCompat$ItemReceiver(this.setChecked, fragment);
            } else {
                fragment = settitlemarginend.write(this.setChecked, fragment);
            }
            z2 = z2 || settitlemarginend.IconCompatParcelizer;
        }
        this.setChecked.clear();
        if (!z) {
            setCardBackgroundColor.IconCompatParcelizer(this, arrayList, arrayList2, i, i2, false);
        }
        MediaBrowserCompat$CustomActionResultReceiver(arrayList, arrayList2, i, i2);
        if (z) {
            setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration = new setAutoSizeTextTypeUniformWithConfiguration();
            IconCompatParcelizer((setAutoSizeTextTypeUniformWithConfiguration<Fragment>) setautosizetexttypeuniformwithconfiguration);
            int IconCompatParcelizer2 = IconCompatParcelizer(arrayList, arrayList2, i, i2, (setAutoSizeTextTypeUniformWithConfiguration<Fragment>) setautosizetexttypeuniformwithconfiguration);
            read((setAutoSizeTextTypeUniformWithConfiguration<Fragment>) setautosizetexttypeuniformwithconfiguration);
            i3 = IconCompatParcelizer2;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            setCardBackgroundColor.IconCompatParcelizer(this, arrayList, arrayList2, i, i3, true);
            MediaBrowserCompat$ItemReceiver(this.write, true);
        }
        while (i4 < i5) {
            setTitleMarginEnd settitlemarginend2 = arrayList3.get(i4);
            if (arrayList4.get(i4).booleanValue() && settitlemarginend2.MediaDescriptionCompat >= 0) {
                int i7 = settitlemarginend2.MediaDescriptionCompat;
                synchronized (this) {
                    this.PlaybackStateCompat.set(i7, (Object) null);
                    if (this.Keep == null) {
                        this.Keep = new ArrayList<>();
                    }
                    this.Keep.add(Integer.valueOf(i7));
                }
                settitlemarginend2.MediaDescriptionCompat = -1;
            }
            i4++;
        }
        if (z2) {
            setExpandedFormat();
        }
    }

    private static void read(setAutoSizeTextTypeUniformWithConfiguration<Fragment> setautosizetexttypeuniformwithconfiguration) {
        int size = setautosizetexttypeuniformwithconfiguration.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) setautosizetexttypeuniformwithconfiguration.MediaBrowserCompat$ItemReceiver[i];
            if (!fragment.mAdded) {
                View view = fragment.getView();
                fragment.mPostponedAlpha = view.getAlpha();
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    private int IconCompatParcelizer(ArrayList<setTitleMarginEnd> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, setAutoSizeTextTypeUniformWithConfiguration<Fragment> setautosizetexttypeuniformwithconfiguration) {
        boolean z;
        boolean z2;
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            setTitleMarginEnd settitlemarginend = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            int i5 = 0;
            while (true) {
                z = true;
                if (i5 >= settitlemarginend.ParcelableVolumeInfo.size()) {
                    z2 = false;
                    break;
                } else if (setTitleMarginEnd.MediaBrowserCompat$CustomActionResultReceiver(settitlemarginend.ParcelableVolumeInfo.get(i5))) {
                    z2 = true;
                    break;
                } else {
                    i5++;
                }
            }
            if (!z2 || settitlemarginend.MediaBrowserCompat$CustomActionResultReceiver(arrayList, i4 + 1, i2)) {
                z = false;
            }
            if (z) {
                if (this.ActionMenuItemView == null) {
                    this.ActionMenuItemView = new ArrayList<>();
                }
                RatingCompat ratingCompat = new RatingCompat(settitlemarginend, booleanValue);
                this.ActionMenuItemView.add(ratingCompat);
                settitlemarginend.write((Fragment$MediaBrowserCompat$ItemReceiver) ratingCompat);
                if (booleanValue) {
                    settitlemarginend.read();
                } else {
                    settitlemarginend.MediaBrowserCompat$CustomActionResultReceiver(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, settitlemarginend);
                }
                IconCompatParcelizer(setautosizetexttypeuniformwithconfiguration);
            }
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    public final void read(setTitleMarginEnd settitlemarginend, boolean z, boolean z2, boolean z3) {
        if (z) {
            settitlemarginend.MediaBrowserCompat$CustomActionResultReceiver(z3);
        } else {
            settitlemarginend.read();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(settitlemarginend);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            setCardBackgroundColor.IconCompatParcelizer(this, (ArrayList<setTitleMarginEnd>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            MediaBrowserCompat$ItemReceiver(this.write, true);
        }
        SparseArray<Fragment> sparseArray = this.mActive;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                Fragment valueAt = this.mActive.valueAt(i);
                if (valueAt != null && valueAt.mView != null && valueAt.mIsNewlyAdded && settitlemarginend.read(valueAt.mContainerId)) {
                    if (valueAt.mPostponedAlpha > BitmapDescriptorFactory.HUE_RED) {
                        valueAt.mView.setAlpha(valueAt.mPostponedAlpha);
                    }
                    if (z3) {
                        valueAt.mPostponedAlpha = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        valueAt.mPostponedAlpha = -1.0f;
                        valueAt.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    private Fragment MediaSessionCompat$Token(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.MediaBrowserCompat$ItemReceiver.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
            Fragment fragment2 = this.MediaBrowserCompat$ItemReceiver.get(indexOf);
            if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                return fragment2;
            }
        }
        return null;
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(ArrayList<setTitleMarginEnd> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            setTitleMarginEnd settitlemarginend = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                settitlemarginend.MediaBrowserCompat$CustomActionResultReceiver(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                settitlemarginend.MediaBrowserCompat$CustomActionResultReceiver(z);
            } else {
                settitlemarginend.MediaBrowserCompat$CustomActionResultReceiver(1);
                settitlemarginend.read();
            }
            i++;
        }
    }

    private void IconCompatParcelizer(setAutoSizeTextTypeUniformWithConfiguration<Fragment> setautosizetexttypeuniformwithconfiguration) {
        int i = this.write;
        if (i > 0) {
            int min = Math.min(i, 3);
            int size = this.MediaBrowserCompat$ItemReceiver.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(i2);
                if (fragment.mState < min) {
                    IconCompatParcelizer(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        setautosizetexttypeuniformwithconfiguration.add(fragment);
                    }
                }
            }
        }
    }

    private void AppCompatDialogFragment() {
        if (this.ActionMenuItemView != null) {
            while (!this.ActionMenuItemView.isEmpty()) {
                this.ActionMenuItemView.remove(0).MediaBrowserCompat$ItemReceiver();
            }
        }
    }

    private void setContentView() {
        SparseArray<Fragment> sparseArray = this.mActive;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i = 0; i < size; i++) {
            Fragment valueAt = this.mActive.valueAt(i);
            if (valueAt != null) {
                if (valueAt.getAnimatingAway() != null) {
                    int stateAfterAnimating = valueAt.getStateAfterAnimating();
                    View animatingAway = valueAt.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    valueAt.setAnimatingAway((View) null);
                    IconCompatParcelizer(valueAt, stateAfterAnimating, 0, 0, false);
                } else if (valueAt.getAnimator() != null) {
                    valueAt.getAnimator().end();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean IconCompatParcelizer(java.util.ArrayList<p040o.setTitleMarginEnd> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<o.setLayoutResource$MediaMetadataCompat> r0 = r4.AppCompatViewInflater     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            java.util.ArrayList<o.setLayoutResource$MediaMetadataCompat> r0 = r4.AppCompatViewInflater     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            java.util.ArrayList<o.setLayoutResource$MediaMetadataCompat> r0 = r4.AppCompatViewInflater     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            r2 = r1
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<o.setLayoutResource$MediaMetadataCompat> r3 = r4.AppCompatViewInflater     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003a }
            o.setLayoutResource$MediaMetadataCompat r3 = (p040o.setLayoutResource.MediaMetadataCompat) r3     // Catch:{ all -> 0x003a }
            boolean r3 = r3.MediaBrowserCompat$ItemReceiver(r5, r6)     // Catch:{ all -> 0x003a }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<o.setLayoutResource$MediaMetadataCompat> r5 = r4.AppCompatViewInflater     // Catch:{ all -> 0x003a }
            r5.clear()     // Catch:{ all -> 0x003a }
            o.setTitleMarginTop r5 = r4.MediaDescriptionCompat     // Catch:{ all -> 0x003a }
            android.os.Handler r5 = r5.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x003a }
            java.lang.Runnable r6 = r4.setContentView     // Catch:{ all -> 0x003a }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r4)
            return r2
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setLayoutResource.IconCompatParcelizer(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    private void setExpandedFormat() {
        if (this.AlertController$RecycleListView != null) {
            for (int i = 0; i < this.AlertController$RecycleListView.size(); i++) {
                this.AlertController$RecycleListView.get(i).write();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(ArrayList<setTitleMarginEnd> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<setTitleMarginEnd> arrayList3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.MediaBrowserCompat$CustomActionResultReceiver.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = this.MediaBrowserCompat$CustomActionResultReceiver.size() - 1;
                while (size2 >= 0) {
                    setTitleMarginEnd settitlemarginend = this.MediaBrowserCompat$CustomActionResultReceiver.get(size2);
                    if ((str != null && str.equals(settitlemarginend.MediaBrowserCompat$MediaItem)) || (i >= 0 && i == settitlemarginend.MediaDescriptionCompat)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        setTitleMarginEnd settitlemarginend2 = this.MediaBrowserCompat$CustomActionResultReceiver.get(size2);
                        if ((str == null || !str.equals(settitlemarginend2.MediaBrowserCompat$MediaItem)) && (i < 0 || i != settitlemarginend2.MediaDescriptionCompat)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.MediaBrowserCompat$CustomActionResultReceiver.size() - 1) {
                return false;
            }
            for (int size3 = this.MediaBrowserCompat$CustomActionResultReceiver.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.MediaBrowserCompat$CustomActionResultReceiver.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    private void AppCompatViewInflater() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        setLayoutInflater setlayoutinflater;
        if (this.mActive != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i = 0; i < this.mActive.size(); i++) {
                Fragment valueAt = this.mActive.valueAt(i);
                if (valueAt != null) {
                    if (valueAt.mRetainInstance) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(valueAt);
                        valueAt.mTargetIndex = valueAt.mTarget != null ? valueAt.mTarget.mIndex : -1;
                    }
                    if (valueAt.mChildFragmentManager != null) {
                        valueAt.mChildFragmentManager.AppCompatViewInflater();
                        setlayoutinflater = valueAt.mChildFragmentManager.MediaSessionCompat$QueueItem;
                    } else {
                        setlayoutinflater = valueAt.mChildNonConfig;
                    }
                    if (arrayList2 == null && setlayoutinflater != null) {
                        arrayList2 = new ArrayList(this.mActive.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add((Object) null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(setlayoutinflater);
                    }
                    if (arrayList == null && valueAt.mViewModelStore != null) {
                        arrayList = new ArrayList(this.mActive.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add((Object) null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(valueAt.mViewModelStore);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.MediaSessionCompat$QueueItem = null;
        } else {
            this.MediaSessionCompat$QueueItem = new setLayoutInflater(arrayList3, arrayList2, arrayList);
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void m3116x50fd9e4a(Fragment fragment) {
        if (fragment.mInnerView != null) {
            SparseArray<Parcelable> sparseArray = this.setCheckable;
            if (sparseArray == null) {
                this.setCheckable = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.setCheckable);
            if (this.setCheckable.size() > 0) {
                fragment.mSavedViewState = this.setCheckable;
                this.setCheckable = null;
            }
        }
    }

    private Bundle ParcelableVolumeInfo(Fragment fragment) {
        if (this.setExpandedFormat == null) {
            this.setExpandedFormat = new Bundle();
        }
        fragment.performSaveInstanceState(this.setExpandedFormat);
        IconCompatParcelizer(fragment, this.setExpandedFormat, false);
        Bundle bundle = null;
        if (!this.setExpandedFormat.isEmpty()) {
            Bundle bundle2 = this.setExpandedFormat;
            this.setExpandedFormat = null;
            bundle = bundle2;
        }
        if (fragment.mView != null) {
            m3116x50fd9e4a(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    public final Parcelable AlertController$RecycleListView() {
        int[] iArr;
        int size;
        AppCompatDialogFragment();
        setContentView();
        PlaybackStateCompat$CustomAction();
        this.f2634x50fd9e4a = true;
        setTitleTextColor[] settitletextcolorArr = null;
        this.MediaSessionCompat$QueueItem = null;
        SparseArray<Fragment> sparseArray = this.mActive;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.mActive.size();
        setOnInflateListener[] setoninflatelistenerArr = new setOnInflateListener[size2];
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Fragment valueAt = this.mActive.valueAt(i);
            if (valueAt != null) {
                if (valueAt.mIndex < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failure saving state: active ");
                    sb.append(valueAt);
                    sb.append(" has cleared index: ");
                    sb.append(valueAt.mIndex);
                    MediaBrowserCompat$CustomActionResultReceiver((RuntimeException) new IllegalStateException(sb.toString()));
                }
                setOnInflateListener setoninflatelistener = new setOnInflateListener(valueAt);
                setoninflatelistenerArr[i] = setoninflatelistener;
                if (valueAt.mState <= 0 || setoninflatelistener.ParcelableVolumeInfo != null) {
                    setoninflatelistener.ParcelableVolumeInfo = valueAt.mSavedFragmentState;
                } else {
                    setoninflatelistener.ParcelableVolumeInfo = ParcelableVolumeInfo(valueAt);
                    if (valueAt.mTarget != null) {
                        if (valueAt.mTarget.mIndex < 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failure saving state: ");
                            sb2.append(valueAt);
                            sb2.append(" has target not in fragment manager: ");
                            sb2.append(valueAt.mTarget);
                            MediaBrowserCompat$CustomActionResultReceiver((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        if (setoninflatelistener.ParcelableVolumeInfo == null) {
                            setoninflatelistener.ParcelableVolumeInfo = new Bundle();
                        }
                        read(setoninflatelistener.ParcelableVolumeInfo, "android:target_state", valueAt.mTarget);
                        if (valueAt.mTargetRequestCode != 0) {
                            setoninflatelistener.ParcelableVolumeInfo.putInt("android:target_req_state", valueAt.mTargetRequestCode);
                        }
                    }
                }
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        int size3 = this.MediaBrowserCompat$ItemReceiver.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i2 = 0; i2 < size3; i2++) {
                iArr[i2] = this.MediaBrowserCompat$ItemReceiver.get(i2).mIndex;
                if (iArr[i2] < 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failure saving state: active ");
                    sb3.append(this.MediaBrowserCompat$ItemReceiver.get(i2));
                    sb3.append(" has cleared index: ");
                    sb3.append(iArr[i2]);
                    MediaBrowserCompat$CustomActionResultReceiver((RuntimeException) new IllegalStateException(sb3.toString()));
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<setTitleMarginEnd> arrayList = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            settitletextcolorArr = new setTitleTextColor[size];
            for (int i3 = 0; i3 < size; i3++) {
                settitletextcolorArr[i3] = new setTitleTextColor(this.MediaBrowserCompat$CustomActionResultReceiver.get(i3));
            }
        }
        setInflatedId setinflatedid = new setInflatedId();
        setinflatedid.IconCompatParcelizer = setoninflatelistenerArr;
        setinflatedid.MediaBrowserCompat$ItemReceiver = iArr;
        setinflatedid.read = settitletextcolorArr;
        Fragment fragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (fragment != null) {
            setinflatedid.write = fragment.mIndex;
        }
        setinflatedid.MediaBrowserCompat$CustomActionResultReceiver = this.setBackgroundResource;
        AppCompatViewInflater();
        return setinflatedid;
    }

    public final void read(Parcelable parcelable, setLayoutInflater setlayoutinflater) {
        List<trimToSize> list;
        List<setLayoutInflater> list2;
        if (parcelable != null) {
            setInflatedId setinflatedid = (setInflatedId) parcelable;
            if (setinflatedid.IconCompatParcelizer != null) {
                if (setlayoutinflater != null) {
                    List<Fragment> list3 = setlayoutinflater.MediaBrowserCompat$CustomActionResultReceiver;
                    list2 = setlayoutinflater.IconCompatParcelizer;
                    list = setlayoutinflater.write;
                    int size = list3 != null ? list3.size() : 0;
                    for (int i = 0; i < size; i++) {
                        Fragment fragment = list3.get(i);
                        int i2 = 0;
                        while (i2 < setinflatedid.IconCompatParcelizer.length && setinflatedid.IconCompatParcelizer[i2].MediaMetadataCompat != fragment.mIndex) {
                            i2++;
                        }
                        if (i2 == setinflatedid.IconCompatParcelizer.length) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Could not find active fragment with index ");
                            sb.append(fragment.mIndex);
                            MediaBrowserCompat$CustomActionResultReceiver((RuntimeException) new IllegalStateException(sb.toString()));
                        }
                        setOnInflateListener setoninflatelistener = setinflatedid.IconCompatParcelizer[i2];
                        setoninflatelistener.MediaBrowserCompat$MediaItem = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        fragment.mTarget = null;
                        if (setoninflatelistener.ParcelableVolumeInfo != null) {
                            setoninflatelistener.ParcelableVolumeInfo.setClassLoader(this.MediaDescriptionCompat.IconCompatParcelizer.getClassLoader());
                            fragment.mSavedViewState = setoninflatelistener.ParcelableVolumeInfo.getSparseParcelableArray("android:view_state");
                            fragment.mSavedFragmentState = setoninflatelistener.ParcelableVolumeInfo;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.mActive = new SparseArray<>(setinflatedid.IconCompatParcelizer.length);
                int i3 = 0;
                while (i3 < setinflatedid.IconCompatParcelizer.length) {
                    setOnInflateListener setoninflatelistener2 = setinflatedid.IconCompatParcelizer[i3];
                    if (setoninflatelistener2 != null) {
                        Fragment MediaBrowserCompat$ItemReceiver2 = setoninflatelistener2.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat, this.read, this.MediaBrowserCompat$MediaItem, (list2 == null || i3 >= list2.size()) ? null : list2.get(i3), (list == null || i3 >= list.size()) ? null : list.get(i3));
                        this.mActive.put(MediaBrowserCompat$ItemReceiver2.mIndex, MediaBrowserCompat$ItemReceiver2);
                        setoninflatelistener2.MediaBrowserCompat$MediaItem = null;
                    }
                    i3++;
                }
                if (setlayoutinflater != null) {
                    List<Fragment> list4 = setlayoutinflater.MediaBrowserCompat$CustomActionResultReceiver;
                    int size2 = list4 != null ? list4.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        Fragment fragment2 = list4.get(i4);
                        if (fragment2.mTargetIndex >= 0) {
                            fragment2.mTarget = this.mActive.get(fragment2.mTargetIndex);
                            if (fragment2.mTarget == null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Re-attaching retained fragment ");
                                sb2.append(fragment2);
                                sb2.append(" target no longer exists: ");
                                sb2.append(fragment2.mTargetIndex);
                                Log.w("FragmentManager", sb2.toString());
                            }
                        }
                    }
                }
                this.MediaBrowserCompat$ItemReceiver.clear();
                if (setinflatedid.MediaBrowserCompat$ItemReceiver != null) {
                    int i5 = 0;
                    while (i5 < setinflatedid.MediaBrowserCompat$ItemReceiver.length) {
                        Fragment fragment3 = this.mActive.get(setinflatedid.MediaBrowserCompat$ItemReceiver[i5]);
                        if (fragment3 == null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("No instantiated fragment for index #");
                            sb3.append(setinflatedid.MediaBrowserCompat$ItemReceiver[i5]);
                            MediaBrowserCompat$CustomActionResultReceiver((RuntimeException) new IllegalStateException(sb3.toString()));
                        }
                        fragment3.mAdded = true;
                        if (!this.MediaBrowserCompat$ItemReceiver.contains(fragment3)) {
                            synchronized (this.MediaBrowserCompat$ItemReceiver) {
                                this.MediaBrowserCompat$ItemReceiver.add(fragment3);
                            }
                            i5++;
                        } else {
                            throw new IllegalStateException("Already added!");
                        }
                    }
                }
                if (setinflatedid.read != null) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>(setinflatedid.read.length);
                    for (setTitleTextColor MediaBrowserCompat$ItemReceiver3 : setinflatedid.read) {
                        setTitleMarginEnd MediaBrowserCompat$ItemReceiver4 = MediaBrowserCompat$ItemReceiver3.MediaBrowserCompat$ItemReceiver(this);
                        this.MediaBrowserCompat$CustomActionResultReceiver.add(MediaBrowserCompat$ItemReceiver4);
                        if (MediaBrowserCompat$ItemReceiver4.MediaDescriptionCompat >= 0) {
                            MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver4.MediaDescriptionCompat, MediaBrowserCompat$ItemReceiver4);
                        }
                    }
                } else {
                    this.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
                if (setinflatedid.write >= 0) {
                    this.MediaBrowserCompat$SearchResultReceiver = this.mActive.get(setinflatedid.write);
                }
                this.setBackgroundResource = setinflatedid.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void AppCompatDelegateImpl$ListMenuDecorView() {
        SparseArray<Fragment> sparseArray = this.mActive;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.mActive.valueAt(size) == null) {
                    SparseArray<Fragment> sparseArray2 = this.mActive;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setTitleMarginTop settitlemargintop, ViewStubCompat viewStubCompat, Fragment fragment) {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = settitlemargintop;
            this.read = viewStubCompat;
            this.MediaBrowserCompat$MediaItem = fragment;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void PlaybackStateCompat() {
        this.MediaSessionCompat$QueueItem = null;
        this.f2634x50fd9e4a = false;
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        int size = this.MediaBrowserCompat$ItemReceiver.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.f2634x50fd9e4a = false;
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        try {
            this.RatingCompat = true;
            MediaBrowserCompat$ItemReceiver(1, false);
            this.RatingCompat = false;
            PlaybackStateCompat$CustomAction();
        } catch (Throwable th) {
            this.RatingCompat = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void MediaBrowserCompat$MediaItem() {
        this.f2634x50fd9e4a = false;
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        try {
            this.RatingCompat = true;
            MediaBrowserCompat$ItemReceiver(2, false);
            this.RatingCompat = false;
            PlaybackStateCompat$CustomAction();
        } catch (Throwable th) {
            this.RatingCompat = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void MediaSessionCompat$Token() {
        this.f2634x50fd9e4a = false;
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        try {
            this.RatingCompat = true;
            MediaBrowserCompat$ItemReceiver(3, false);
            this.RatingCompat = false;
            PlaybackStateCompat$CustomAction();
        } catch (Throwable th) {
            this.RatingCompat = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void ParcelableVolumeInfo() {
        this.f2634x50fd9e4a = false;
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        try {
            this.RatingCompat = true;
            MediaBrowserCompat$ItemReceiver(4, false);
            this.RatingCompat = false;
            PlaybackStateCompat$CustomAction();
        } catch (Throwable th) {
            this.RatingCompat = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void Keep() {
        this.MediaSessionCompat$ResultReceiverWrapper = true;
        try {
            this.RatingCompat = true;
            MediaBrowserCompat$ItemReceiver(2, false);
            this.RatingCompat = false;
            PlaybackStateCompat$CustomAction();
        } catch (Throwable th) {
            this.RatingCompat = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void MediaDescriptionCompat() {
        this.MediaMetadataCompat = true;
        PlaybackStateCompat$CustomAction();
        try {
            this.RatingCompat = true;
            MediaBrowserCompat$ItemReceiver(0, false);
            this.RatingCompat = false;
            PlaybackStateCompat$CustomAction();
            this.MediaDescriptionCompat = null;
            this.read = null;
            this.MediaBrowserCompat$MediaItem = null;
        } catch (Throwable th) {
            this.RatingCompat = false;
            throw th;
        }
    }

    public final void write(boolean z) {
        for (int size = this.MediaBrowserCompat$ItemReceiver.size() - 1; size >= 0; size--) {
            Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        for (int size = this.MediaBrowserCompat$ItemReceiver.size() - 1; size >= 0; size--) {
            Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public final void read(Configuration configuration) {
        for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.size(); i++) {
            Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public final void MediaSessionCompat$QueueItem() {
        for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.size(); i++) {
            Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(Menu menu, MenuInflater menuInflater) {
        if (this.write <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.size(); i++) {
            Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(i);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.setHasDecor != null) {
            for (int i2 = 0; i2 < this.setHasDecor.size(); i2++) {
                Fragment fragment2 = this.setHasDecor.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.setHasDecor = arrayList;
        return z;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(Menu menu) {
        if (this.write <= 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.size(); i++) {
            Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean IconCompatParcelizer(MenuItem menuItem) {
        if (this.write <= 0) {
            return false;
        }
        for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.size(); i++) {
            Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(MenuItem menuItem) {
        if (this.write <= 0) {
            return false;
        }
        for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.size(); i++) {
            Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void MediaBrowserCompat$ItemReceiver(Menu menu) {
        if (this.write > 0) {
            for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.size(); i++) {
                Fragment fragment = this.MediaBrowserCompat$ItemReceiver.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver(Fragment fragment) {
        if (fragment == null || (this.mActive.get(fragment.mIndex) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            this.MediaBrowserCompat$SearchResultReceiver = fragment;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).MediaBrowserCompat$CustomActionResultReceiver(fragment, context, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void IconCompatParcelizer(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).IconCompatParcelizer(fragment, context, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).MediaBrowserCompat$ItemReceiver(fragment, bundle, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).MediaBrowserCompat$CustomActionResultReceiver(fragment, bundle, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void write(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).write(fragment, bundle, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void read(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).read(fragment, view, bundle, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void MediaBrowserCompat$SearchResultReceiver(Fragment fragment, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).MediaBrowserCompat$SearchResultReceiver(fragment, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(Fragment fragment, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).MediaBrowserCompat$ItemReceiver(fragment, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void read(Fragment fragment, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).read(fragment, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void MediaDescriptionCompat(Fragment fragment, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).MediaDescriptionCompat(fragment, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void IconCompatParcelizer(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).IconCompatParcelizer(fragment, bundle, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void MediaBrowserCompat$MediaItem(Fragment fragment, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).MediaBrowserCompat$MediaItem(fragment, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Fragment fragment, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).MediaBrowserCompat$CustomActionResultReceiver(fragment, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    private void IconCompatParcelizer(Fragment fragment, boolean z) {
        Fragment fragment2 = this.MediaBrowserCompat$MediaItem;
        if (fragment2 != null) {
            setTitleMarginStart fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof setLayoutResource) {
                ((setLayoutResource) fragmentManager).IconCompatParcelizer(fragment, true);
            }
        }
        Iterator<setLayoutResource$MediaBrowserCompat$SearchResultReceiver> it = this.AppCompatDelegateImpl$ListMenuDecorView.iterator();
        while (it.hasNext()) {
            setLayoutResource$MediaBrowserCompat$SearchResultReceiver next = it.next();
            if (z) {
                boolean z2 = next.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, Name.LABEL);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MediaDescriptionCompat.IconCompatParcelizer);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.isSupportFragmentClass(this.MediaDescriptionCompat.IconCompatParcelizer, str2)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        Fragment findFragmentById = resourceId != -1 ? findFragmentById(resourceId) : null;
        if (findFragmentById == null && string != null) {
            findFragmentById = findFragmentByTag(string);
        }
        if (findFragmentById == null && i != -1) {
            findFragmentById = findFragmentById(i);
        }
        if (findFragmentById == null) {
            findFragmentById = this.read.IconCompatParcelizer(context, str2, (Bundle) null);
            findFragmentById.mFromLayout = true;
            findFragmentById.mFragmentId = resourceId != 0 ? resourceId : i;
            findFragmentById.mContainerId = i;
            findFragmentById.mTag = string;
            findFragmentById.mInLayout = true;
            findFragmentById.mFragmentManager = this;
            findFragmentById.mHost = this.MediaDescriptionCompat;
            findFragmentById.onInflate(this.MediaDescriptionCompat.IconCompatParcelizer, attributeSet, findFragmentById.mSavedFragmentState);
            write(findFragmentById, true);
        } else if (!findFragmentById.mInLayout) {
            findFragmentById.mInLayout = true;
            findFragmentById.mHost = this.MediaDescriptionCompat;
            if (!findFragmentById.mRetaining) {
                findFragmentById.onInflate(this.MediaDescriptionCompat.IconCompatParcelizer, attributeSet, findFragmentById.mSavedFragmentState);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Duplicate id 0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(", tag ");
            sb2.append(string);
            sb2.append(", or parent id 0x");
            sb2.append(Integer.toHexString(i));
            sb2.append(" with another fragment for ");
            sb2.append(str2);
            throw new IllegalArgumentException(sb2.toString());
        }
        Fragment fragment = findFragmentById;
        if (this.write > 0 || !fragment.mFromLayout) {
            IconCompatParcelizer(fragment, this.write, 0, 0, false);
        } else {
            IconCompatParcelizer(fragment, 1, 0, 0, false);
        }
        if (fragment.mView != null) {
            if (resourceId != 0) {
                fragment.mView.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            return fragment.mView;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Fragment ");
        sb3.append(str2);
        sb3.append(" did not create a view.");
        throw new IllegalStateException(sb3.toString());
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: o.setLayoutResource$RatingCompat */
    static class RatingCompat implements Fragment$MediaBrowserCompat$ItemReceiver {
        int MediaBrowserCompat$CustomActionResultReceiver;
        final setTitleMarginEnd MediaBrowserCompat$ItemReceiver;
        final boolean write;

        RatingCompat(setTitleMarginEnd settitlemarginend, boolean z) {
            this.write = z;
            this.MediaBrowserCompat$ItemReceiver = settitlemarginend;
        }

        public final void IconCompatParcelizer() {
            int i = this.MediaBrowserCompat$CustomActionResultReceiver - 1;
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            if (i == 0) {
                this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.setBackgroundResource();
            }
        }

        public final void write() {
            this.MediaBrowserCompat$CustomActionResultReceiver++;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver > 0;
            setLayoutResource setlayoutresource = this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
            int size = setlayoutresource.MediaBrowserCompat$ItemReceiver.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = setlayoutresource.MediaBrowserCompat$ItemReceiver.get(i);
                fragment.setOnStartEnterTransitionListener((Fragment$MediaBrowserCompat$ItemReceiver) null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.read(this.MediaBrowserCompat$ItemReceiver, this.write, !z, true);
        }
    }

    /* renamed from: o.setLayoutResource$IconCompatParcelizer */
    static class IconCompatParcelizer {
        public final Animation IconCompatParcelizer;
        public final Animator MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(Animation animation) {
            this.IconCompatParcelizer = animation;
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        IconCompatParcelizer(Animator animator) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: o.setLayoutResource$write */
    static class write implements Animation.AnimationListener {
        private final Animation.AnimationListener read;

        write(Animation.AnimationListener animationListener) {
            this.read = animationListener;
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.read;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.read;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.read;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }
    }

    /* renamed from: o.setLayoutResource$read */
    static class read extends AnimationSet implements Runnable {
        private final ViewGroup IconCompatParcelizer;
        private boolean MediaBrowserCompat$CustomActionResultReceiver = true;
        private boolean MediaBrowserCompat$ItemReceiver;
        private final View read;
        private boolean write;

        read(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.IconCompatParcelizer = viewGroup;
            this.read = view;
            addAnimation(animation);
            this.IconCompatParcelizer.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            if (this.MediaBrowserCompat$ItemReceiver) {
                return !this.write;
            }
            if (!super.getTransformation(j, transformation)) {
                this.MediaBrowserCompat$ItemReceiver = true;
                ViewGroup viewGroup = this.IconCompatParcelizer;
                C1454x8d0f0ffb setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver = new C1454x8d0f0ffb(viewGroup, this);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
                viewGroup.addOnAttachStateChangeListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
            }
            return true;
        }

        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            if (this.MediaBrowserCompat$ItemReceiver) {
                return !this.write;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.MediaBrowserCompat$ItemReceiver = true;
                ViewGroup viewGroup = this.IconCompatParcelizer;
                C1454x8d0f0ffb setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver = new C1454x8d0f0ffb(viewGroup, this);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
                viewGroup.addOnAttachStateChangeListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
            }
            return true;
        }

        public final void run() {
            if (this.MediaBrowserCompat$ItemReceiver || !this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.IconCompatParcelizer.endViewTransition(this.read);
                this.write = true;
                return;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
            this.IconCompatParcelizer.post(this);
        }
    }

    private void AppCompatActivity() {
        if (this.f2634x50fd9e4a || this.MediaSessionCompat$ResultReceiverWrapper) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public static void write(setLayoutInflater setlayoutinflater) {
        if (setlayoutinflater != null) {
            List<Fragment> list = setlayoutinflater.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                for (Fragment fragment : list) {
                    fragment.mRetaining = true;
                }
            }
            List<setLayoutInflater> list2 = setlayoutinflater.IconCompatParcelizer;
            if (list2 != null) {
                for (setLayoutInflater write2 : list2) {
                    write(write2);
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo20066x50fd9e4a() {
        try {
            this.RatingCompat = true;
            MediaBrowserCompat$ItemReceiver(1, false);
            this.RatingCompat = false;
            PlaybackStateCompat$CustomAction();
        } catch (Throwable th) {
            this.RatingCompat = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void MediaSessionCompat$ResultReceiverWrapper() {
        try {
            this.RatingCompat = true;
            MediaBrowserCompat$ItemReceiver(3, false);
            this.RatingCompat = false;
            PlaybackStateCompat$CustomAction();
        } catch (Throwable th) {
            this.RatingCompat = false;
            throw th;
        }
    }
}
