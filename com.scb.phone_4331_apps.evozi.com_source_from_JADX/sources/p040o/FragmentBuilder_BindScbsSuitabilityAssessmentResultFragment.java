package p040o;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindScbsSuitabilityAssessmentResultFragment */
final class FragmentBuilder_BindScbsSuitabilityAssessmentResultFragment implements FragmentBuilder_BindSelectAccountFragment {
    private final FragmentBuilder_BindSelectAccountFragment[] write;

    public FragmentBuilder_BindScbsSuitabilityAssessmentResultFragment(FragmentBuilder_BindSelectAccountFragment... fragmentBuilder_BindSelectAccountFragmentArr) {
        onGetStartedClick.write((Object) fragmentBuilder_BindSelectAccountFragmentArr, "strategies");
        this.write = fragmentBuilder_BindSelectAccountFragmentArr;
    }

    public final Integer read(Context context) {
        FragmentBuilder_BindSelectAccountFragment[] fragmentBuilder_BindSelectAccountFragmentArr = this.write;
        Collection arrayList = new ArrayList();
        for (FragmentBuilder_BindSelectAccountFragment read : fragmentBuilder_BindSelectAccountFragmentArr) {
            Integer read2 = read.read(context);
            if (read2 != null) {
                arrayList.add(read2);
            }
        }
        List list = (List) arrayList;
        onGetStartedClick.write((Object) list, "$this$firstOrNull");
        return (Integer) (list.isEmpty() ? null : list.get(0));
    }
}
