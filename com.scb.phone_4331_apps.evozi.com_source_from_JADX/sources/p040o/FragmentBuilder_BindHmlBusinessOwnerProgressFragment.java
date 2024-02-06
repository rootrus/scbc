package p040o;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindHmlBusinessOwnerProgressFragment */
public abstract class FragmentBuilder_BindHmlBusinessOwnerProgressFragment<T> extends FragmentBuilder_BindHmlDocumentListFragment {
    private Activity IconCompatParcelizer;

    /* access modifiers changed from: protected */
    public abstract List<T> IconCompatParcelizer(Activity activity);

    /* access modifiers changed from: protected */
    public abstract List<T> IconCompatParcelizer(T t);

    /* access modifiers changed from: protected */
    public abstract View write(T t);

    FragmentBuilder_BindHmlBusinessOwnerProgressFragment(Activity activity, FragmentBuilder_BindHmlBusinessOwnerResubmissionFragment fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment) {
        super(fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment);
        this.IconCompatParcelizer = activity;
    }

    public final boolean IconCompatParcelizer(View view) {
        View write;
        List MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        onRedeemAnotherRewardClick onredeemanotherrewardclick = new onRedeemAnotherRewardClick(view);
        boolean z = false;
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver.size(); i++) {
            Object obj = MediaBrowserCompat$ItemReceiver.get(i);
            if (!(obj == null || (write = write(obj)) == null)) {
                if (view == write) {
                    z |= true;
                }
                if (view == write || onRedeemAnotherRewardClick.MediaBrowserCompat$ItemReceiver(write, onredeemanotherrewardclick.read)) {
                    FragmentBuilder_BindHmlBusinessURLInfoFragment.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.get(i), write);
                }
            }
        }
        return z;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(View view) {
        View write;
        List MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        onRedeemAnotherRewardClick onredeemanotherrewardclick = new onRedeemAnotherRewardClick(view);
        boolean z = false;
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver.size(); i++) {
            Object obj = MediaBrowserCompat$ItemReceiver.get(i);
            if (!(obj == null || (write = write(obj)) == null)) {
                if (view == write) {
                    z |= true;
                }
                if (view == write || onRedeemAnotherRewardClick.MediaBrowserCompat$ItemReceiver(write, onredeemanotherrewardclick.read)) {
                    FragmentBuilder_BindHmlBusinessURLInfoFragment.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.get(i), write);
                }
            }
        }
        return z;
    }

    private List<T> MediaBrowserCompat$ItemReceiver() {
        List IconCompatParcelizer2 = IconCompatParcelizer(this.IconCompatParcelizer);
        if (IconCompatParcelizer2 == null || IconCompatParcelizer2.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(IconCompatParcelizer2);
        for (int i = 0; i < IconCompatParcelizer2.size(); i++) {
            if (IconCompatParcelizer2.get(i) != null) {
                arrayList.addAll(MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.get(i)));
            }
        }
        return arrayList;
    }

    private List<T> MediaBrowserCompat$ItemReceiver(T t) {
        ArrayList arrayList = new ArrayList();
        List IconCompatParcelizer2 = IconCompatParcelizer(t);
        if (IconCompatParcelizer2 == null) {
            return Collections.emptyList();
        }
        arrayList.addAll(IconCompatParcelizer2);
        for (int i = 0; i < IconCompatParcelizer2.size(); i++) {
            if (IconCompatParcelizer2.get(i) != null) {
                arrayList.addAll(MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.get(i)));
            }
        }
        return arrayList;
    }

    private void MediaBrowserCompat$ItemReceiver(View view, List<T> list) {
        for (T next : list) {
            if (!(next == null || write(next) == null || write(next) != view)) {
                FragmentBuilder_BindHmlBusinessURLInfoFragment.IconCompatParcelizer(next, view);
            }
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    MediaBrowserCompat$ItemReceiver(viewGroup.getChildAt(i), list);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        List MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        ViewGroup viewGroup = (ViewGroup) this.IconCompatParcelizer.findViewById(16908290);
        if (viewGroup == null) {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Fragment interaction detection: content root view not found");
        } else {
            MediaBrowserCompat$ItemReceiver(viewGroup, MediaBrowserCompat$ItemReceiver);
        }
    }
}
