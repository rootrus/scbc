package p040o;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

/* renamed from: o.FragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$CustomActionResultReceiver */
class C6547x7937aadc extends FragmentBuilder_BindHmlDocumentKofaxInstructionFragment implements ViewPager.MediaMetadataCompat {
    private ViewGroup.OnHierarchyChangeListener IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = true;
    private ViewPager MediaBrowserCompat$ItemReceiver;
    private ViewPager.MediaMetadataCompat read;

    private C6547x7937aadc(ViewPager viewPager, ViewPager.MediaMetadataCompat mediaMetadataCompat, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2) {
        super(onHierarchyChangeListener2);
        this.MediaBrowserCompat$ItemReceiver = viewPager;
        this.IconCompatParcelizer = onHierarchyChangeListener;
        this.read = mediaMetadataCompat;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.MediaBrowserCompat$ItemReceiver.getChildCount() != 0) {
            Rect rect = new Rect();
            this.MediaBrowserCompat$ItemReceiver.getDrawingRect(rect);
            for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.getChildCount(); i++) {
                View childAt = this.MediaBrowserCompat$ItemReceiver.getChildAt(i);
                Rect rect2 = new Rect();
                childAt.getHitRect(rect2);
                if (rect.contains(rect2)) {
                    ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.IconCompatParcelizer;
                    ViewPager viewPager = this.MediaBrowserCompat$ItemReceiver;
                    onHierarchyChangeListener.onChildViewAdded(viewPager, viewPager.getChildAt(i));
                } else {
                    ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2 = this.IconCompatParcelizer;
                    ViewPager viewPager2 = this.MediaBrowserCompat$ItemReceiver;
                    onHierarchyChangeListener2.onChildViewRemoved(viewPager2, viewPager2.getChildAt(i));
                }
            }
        }
    }

    public final void onPageScrolled(int i, float f, int i2) {
        ViewPager.MediaMetadataCompat mediaMetadataCompat = this.read;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.onPageScrolled(i, f, i2);
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.IconCompatParcelizer;
            ViewPager viewPager = this.MediaBrowserCompat$ItemReceiver;
            onHierarchyChangeListener.onChildViewAdded(viewPager, viewPager.getChildAt(i));
        }
    }

    public final void onPageSelected(int i) {
        ViewPager.MediaMetadataCompat mediaMetadataCompat = this.read;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.onPageSelected(i);
        }
    }

    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
        ViewPager.MediaMetadataCompat mediaMetadataCompat = this.read;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.onPageScrollStateChanged(i);
        }
    }

    public final void onChildViewAdded(View view, View view2) {
        MediaBrowserCompat$CustomActionResultReceiver();
        super.onChildViewAdded(view, view2);
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.IconCompatParcelizer.onChildViewRemoved(view, view2);
        MediaBrowserCompat$CustomActionResultReceiver();
        super.onChildViewRemoved(view, view2);
    }

    static void MediaBrowserCompat$CustomActionResultReceiver(ViewPager viewPager, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        C6547x7937aadc fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$CustomActionResultReceiver;
        ViewPager.MediaMetadataCompat MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(viewPager);
        ViewGroup.OnHierarchyChangeListener read2 = FragmentBuilder_BindHmlDocumentCropTutorialFragment.read(viewPager);
        boolean z = read2 instanceof C6547x7937aadc;
        if (!z || !(MediaBrowserCompat$CustomActionResultReceiver2 instanceof C6547x7937aadc)) {
            if (MediaBrowserCompat$CustomActionResultReceiver2 instanceof C6547x7937aadc) {
                MediaBrowserCompat$CustomActionResultReceiver2 = ((C6547x7937aadc) MediaBrowserCompat$CustomActionResultReceiver2).read;
            }
            if (z) {
                read2 = ((C6547x7937aadc) read2).write();
            }
            fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$CustomActionResultReceiver = new C6547x7937aadc(viewPager, MediaBrowserCompat$CustomActionResultReceiver2, onHierarchyChangeListener, read2);
        } else {
            fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$CustomActionResultReceiver = (C6547x7937aadc) MediaBrowserCompat$CustomActionResultReceiver2;
        }
        fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        viewPager.setOnPageChangeListener(fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$CustomActionResultReceiver);
        viewPager.setOnHierarchyChangeListener(fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$CustomActionResultReceiver);
    }

    private static ViewPager.MediaMetadataCompat MediaBrowserCompat$CustomActionResultReceiver(ViewPager viewPager) {
        try {
            Class cls = viewPager.getClass();
            while (cls != ViewPager.class) {
                cls = cls.getSuperclass();
            }
            Field declaredField = cls.getDeclaredField("mOnPageChangeListener");
            declaredField.setAccessible(true);
            return (ViewPager.MediaMetadataCompat) declaredField.get(viewPager);
        } catch (Exception unused) {
            Log.d("HierarchySpyDecorator", "Error to traverse view hierarchy");
            return null;
        }
    }
}
