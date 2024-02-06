package p040o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;

/* renamed from: o.nContextGetErrorMessage */
public class nContextGetErrorMessage<V extends View> extends CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver<V> {
    private FragmentBuilder_BindMyInsuranceFragment IconCompatParcelizer;
    private int MediaBrowserCompat$ItemReceiver = 0;

    public nContextGetErrorMessage() {
    }

    public nContextGetErrorMessage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, int i) {
        MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout, v, i);
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new FragmentBuilder_BindMyInsuranceFragment(v);
        }
        FragmentBuilder_BindMyInsuranceFragment fragmentBuilder_BindMyInsuranceFragment = this.IconCompatParcelizer;
        fragmentBuilder_BindMyInsuranceFragment.IconCompatParcelizer = fragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$ItemReceiver.getTop();
        fragmentBuilder_BindMyInsuranceFragment.read = fragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$ItemReceiver.getLeft();
        fragmentBuilder_BindMyInsuranceFragment.IconCompatParcelizer();
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        if (i2 == 0) {
            return true;
        }
        FragmentBuilder_BindMyInsuranceFragment fragmentBuilder_BindMyInsuranceFragment2 = this.IconCompatParcelizer;
        if (fragmentBuilder_BindMyInsuranceFragment2.MediaBrowserCompat$CustomActionResultReceiver != i2) {
            fragmentBuilder_BindMyInsuranceFragment2.MediaBrowserCompat$CustomActionResultReceiver = i2;
            fragmentBuilder_BindMyInsuranceFragment2.IconCompatParcelizer();
        }
        this.MediaBrowserCompat$ItemReceiver = 0;
        return true;
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.MediaBrowserCompat$ItemReceiver((View) v, i);
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
        FragmentBuilder_BindMyInsuranceFragment fragmentBuilder_BindMyInsuranceFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindMyInsuranceFragment == null) {
            this.MediaBrowserCompat$ItemReceiver = i;
            return false;
        } else if (fragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver == i) {
            return false;
        } else {
            fragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver = i;
            fragmentBuilder_BindMyInsuranceFragment.IconCompatParcelizer();
            return true;
        }
    }

    public int read() {
        FragmentBuilder_BindMyInsuranceFragment fragmentBuilder_BindMyInsuranceFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindMyInsuranceFragment != null) {
            return fragmentBuilder_BindMyInsuranceFragment.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return 0;
    }
}
