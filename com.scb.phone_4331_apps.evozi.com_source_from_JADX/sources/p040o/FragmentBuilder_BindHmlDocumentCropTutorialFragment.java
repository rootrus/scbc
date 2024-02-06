package p040o;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

/* renamed from: o.FragmentBuilder_BindHmlDocumentCropTutorialFragment */
final class FragmentBuilder_BindHmlDocumentCropTutorialFragment extends FragmentBuilder_BindHmlDocumentKofaxInstructionFragment {
    private ViewGroup.OnHierarchyChangeListener MediaBrowserCompat$CustomActionResultReceiver;

    private FragmentBuilder_BindHmlDocumentCropTutorialFragment(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2) {
        super(onHierarchyChangeListener);
        this.MediaBrowserCompat$CustomActionResultReceiver = onHierarchyChangeListener2;
    }

    static void MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                MediaBrowserCompat$ItemReceiver((ViewGroup) viewGroup.getChildAt(i), onHierarchyChangeListener, fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver);
            }
        }
        if (viewGroup instanceof ViewPager) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable((ViewPager) viewGroup, onHierarchyChangeListener, fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver) {
                private /* synthetic */ ViewGroup.OnHierarchyChangeListener MediaBrowserCompat$ItemReceiver;
                private /* synthetic */ ViewPager read;

                {
                    this.read = r1;
                    this.MediaBrowserCompat$ItemReceiver = r2;
                }

                public final void run() {
                    C6547x7937aadc.MediaBrowserCompat$CustomActionResultReceiver(this.read, this.MediaBrowserCompat$ItemReceiver);
                }
            }, 200);
            return;
        }
        ViewGroup.OnHierarchyChangeListener read = read(viewGroup);
        if (!(read instanceof FragmentBuilder_BindHmlDocumentCropTutorialFragment)) {
            viewGroup.setOnHierarchyChangeListener(new FragmentBuilder_BindHmlDocumentCropTutorialFragment(read, onHierarchyChangeListener));
        }
    }

    static ViewGroup.OnHierarchyChangeListener read(ViewGroup viewGroup) {
        try {
            Class cls = viewGroup.getClass();
            if (!(viewGroup instanceof CoordinatorLayout)) {
                while (cls != ViewGroup.class) {
                    cls = cls.getSuperclass();
                }
            }
            Field declaredField = cls.getDeclaredField("mOnHierarchyChangeListener");
            declaredField.setAccessible(true);
            return (ViewGroup.OnHierarchyChangeListener) declaredField.get(viewGroup);
        } catch (Exception unused) {
            Log.d("HierarchySpyDecorator", "Error to traverse view hierarchy");
            return null;
        }
    }

    public final void onChildViewAdded(View view, View view2) {
        if (view2 instanceof ViewGroup) {
            MediaBrowserCompat$ItemReceiver((ViewGroup) view2, this.MediaBrowserCompat$CustomActionResultReceiver, (C6548x820c5aab) null);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.onChildViewAdded(view, view2);
        super.onChildViewAdded(view, view2);
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.onChildViewRemoved(view, view2);
        super.onChildViewRemoved(view, view2);
    }
}
