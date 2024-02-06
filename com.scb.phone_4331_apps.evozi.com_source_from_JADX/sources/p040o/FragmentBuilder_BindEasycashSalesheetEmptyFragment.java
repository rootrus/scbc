package p040o;

import java.util.Map;
import java.util.Set;

/* renamed from: o.FragmentBuilder_BindEasycashSalesheetEmptyFragment */
interface FragmentBuilder_BindEasycashSalesheetEmptyFragment {
    public static final FragmentBuilder_BindEasycashSalesheetEmptyFragment IconCompatParcelizer = new FragmentBuilder_BindEasycashSalesheetEmptyFragment() {
        public final Map<Class<?>, FragmentBuilder_BindEasycashSuccessFragment> write(Object obj) {
            return FragmentBuilder_BindEasycashMailingAddressFragment.IconCompatParcelizer(obj);
        }

        public final Map<Class<?>, Set<FragmentBuilder_BindEasycashWorkAddressFragment>> MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            return FragmentBuilder_BindEasycashMailingAddressFragment.MediaBrowserCompat$CustomActionResultReceiver(obj);
        }
    };

    Map<Class<?>, Set<FragmentBuilder_BindEasycashWorkAddressFragment>> MediaBrowserCompat$CustomActionResultReceiver(Object obj);

    Map<Class<?>, FragmentBuilder_BindEasycashSuccessFragment> write(Object obj);
}
