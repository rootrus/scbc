package p040o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/* renamed from: o.FragmentBuilder_BindHmlDocumentKofaxInstructionFragment */
abstract class FragmentBuilder_BindHmlDocumentKofaxInstructionFragment implements ViewGroup.OnHierarchyChangeListener {
    private ViewGroup.OnHierarchyChangeListener MediaBrowserCompat$CustomActionResultReceiver;

    FragmentBuilder_BindHmlDocumentKofaxInstructionFragment(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.MediaBrowserCompat$CustomActionResultReceiver = onHierarchyChangeListener;
    }

    public void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (onHierarchyChangeListener != null && !(view instanceof RadioGroup)) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (onHierarchyChangeListener != null && !(view instanceof RadioGroup)) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }

    /* access modifiers changed from: package-private */
    public final ViewGroup.OnHierarchyChangeListener write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
