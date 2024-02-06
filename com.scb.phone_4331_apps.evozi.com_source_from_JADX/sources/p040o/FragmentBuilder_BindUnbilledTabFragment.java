package p040o;

import java.util.Arrays;
import java.util.EnumSet;
import kotlin.TypeCastException;

/* renamed from: o.FragmentBuilder_BindUnbilledTabFragment */
public final class FragmentBuilder_BindUnbilledTabFragment {
    private static final EnumSet<FragmentBuilder_BindVerifyIdentityFragment> IconCompatParcelizer;
    private static final EnumSet<FragmentBuilder_BindVerifyIdentityFragment> read;

    static {
        EnumSet<FragmentBuilder_BindVerifyIdentityFragment> of = EnumSet.of(FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF, FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_ON);
        onGetStartedClick.IconCompatParcelizer((Object) of, "EnumSet.of(this, other)");
        read = of;
        EnumSet of2 = EnumSet.of(FragmentBuilder_BindVerifyIdentityFragment.PREVIEW_WORKS, FragmentBuilder_BindVerifyIdentityFragment.PREVIEW_LIVE);
        onGetStartedClick.IconCompatParcelizer((Object) of2, "EnumSet.of(this, other)");
        Enum enumR = FragmentBuilder_BindVerifyIdentityFragment.PREVIEW_LAUNCHPAD;
        Object[] array = of2.toArray(new FragmentBuilder_BindVerifyIdentityFragment[0]);
        if (array != null) {
            Enum[] enumArr = (Enum[]) array;
            EnumSet<FragmentBuilder_BindVerifyIdentityFragment> of3 = EnumSet.of(enumR, (Enum[]) Arrays.copyOf(enumArr, enumArr.length));
            onGetStartedClick.IconCompatParcelizer((Object) of3, "EnumSet.of(other, *this.toTypedArray())");
            IconCompatParcelizer = of3;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final EnumSet<FragmentBuilder_BindVerifyIdentityFragment> write() {
        return read;
    }

    public static final EnumSet<FragmentBuilder_BindVerifyIdentityFragment> read() {
        return IconCompatParcelizer;
    }
}
