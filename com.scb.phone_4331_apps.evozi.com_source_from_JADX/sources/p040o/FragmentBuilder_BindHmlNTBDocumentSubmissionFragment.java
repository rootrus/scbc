package p040o;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: o.FragmentBuilder_BindHmlNTBDocumentSubmissionFragment */
public class FragmentBuilder_BindHmlNTBDocumentSubmissionFragment extends FragmentBuilder_BindHmlDocumentListFragment {
    private Activity MediaBrowserCompat$ItemReceiver;

    public FragmentBuilder_BindHmlNTBDocumentSubmissionFragment(Activity activity, FragmentBuilder_BindHmlBusinessOwnerResubmissionFragment fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment) {
        super(fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment);
        this.MediaBrowserCompat$ItemReceiver = activity;
    }

    public final boolean IconCompatParcelizer(View view) {
        boolean z;
        Map map;
        String MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(view);
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver, view);
            z = true;
        } else {
            z = false;
        }
        FragmentBuilder_BindHmlNTBDocumentUploadFragment fragmentBuilder_BindHmlNTBDocumentUploadFragment = new FragmentBuilder_BindHmlNTBDocumentUploadFragment();
        if (!(view instanceof ViewGroup)) {
            map = Collections.emptyMap();
        } else {
            setTextAppearance settextappearance = new setTextAppearance();
            fragmentBuilder_BindHmlNTBDocumentUploadFragment.write((ViewGroup) view, settextappearance);
            map = settextappearance;
        }
        for (Map.Entry entry : map.entrySet()) {
            MediaBrowserCompat$CustomActionResultReceiver((String) entry.getKey(), (View) entry.getValue());
        }
        return z;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(View view) {
        boolean z;
        String MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(view);
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            read(MediaBrowserCompat$CustomActionResultReceiver, view);
            z = true;
        } else {
            z = false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                MediaBrowserCompat$ItemReceiver(viewGroup.getChildAt(i));
            }
        }
        return z;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        List<BondLandingActivity> MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver());
        for (int size = MediaBrowserCompat$ItemReceiver2.size() - 1; size >= 0; size--) {
            MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2.get(size).MediaBrowserCompat$ItemReceiver), MediaBrowserCompat$ItemReceiver2.get(size).MediaBrowserCompat$ItemReceiver);
        }
    }

    /* access modifiers changed from: protected */
    public final List<View> MediaBrowserCompat$ItemReceiver() {
        setTextAppearance settextappearance = new setTextAppearance();
        new FragmentBuilder_BindHmlNTBDocumentUploadFragment().write((ViewGroup) this.MediaBrowserCompat$ItemReceiver.findViewById(16908290), settextappearance);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : settextappearance.entrySet()) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }
}
