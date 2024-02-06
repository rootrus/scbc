package p040o;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindScheduleOnceFragment */
final class FragmentBuilder_BindScheduleOnceFragment implements FragmentBuilder_BindSecondaryTabsFragment {
    private final FragmentBuilder_BindSecondaryTabsFragment[] write;

    public FragmentBuilder_BindScheduleOnceFragment(FragmentBuilder_BindSecondaryTabsFragment... fragmentBuilder_BindSecondaryTabsFragmentArr) {
        onGetStartedClick.write((Object) fragmentBuilder_BindSecondaryTabsFragmentArr, "strategies");
        this.write = fragmentBuilder_BindSecondaryTabsFragmentArr;
    }

    public final Integer IconCompatParcelizer(Context context) {
        FragmentBuilder_BindSecondaryTabsFragment[] fragmentBuilder_BindSecondaryTabsFragmentArr = this.write;
        Collection arrayList = new ArrayList();
        for (FragmentBuilder_BindSecondaryTabsFragment IconCompatParcelizer : fragmentBuilder_BindSecondaryTabsFragmentArr) {
            Integer IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(context);
            if (IconCompatParcelizer2 != null) {
                arrayList.add(IconCompatParcelizer2);
            }
        }
        List list = (List) arrayList;
        onGetStartedClick.write((Object) list, "$this$firstOrNull");
        return (Integer) (list.isEmpty() ? null : list.get(0));
    }
}
