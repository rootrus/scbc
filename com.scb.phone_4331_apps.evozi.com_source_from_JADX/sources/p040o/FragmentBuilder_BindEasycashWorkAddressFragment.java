package p040o;

import java.lang.reflect.Method;

/* renamed from: o.FragmentBuilder_BindEasycashWorkAddressFragment */
class FragmentBuilder_BindEasycashWorkAddressFragment {
    final Method IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver = true;
    final Object MediaBrowserCompat$ItemReceiver;
    private final int read;

    FragmentBuilder_BindEasycashWorkAddressFragment(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventHandler target cannot be null.");
        } else if (method != null) {
            this.MediaBrowserCompat$ItemReceiver = obj;
            this.IconCompatParcelizer = method;
            method.setAccessible(true);
            this.read = ((method.hashCode() + 31) * 31) + obj.hashCode();
        } else {
            throw new NullPointerException("EventHandler method cannot be null.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[EventHandler ");
        sb.append(this.IconCompatParcelizer);
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        return this.read;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FragmentBuilder_BindEasycashWorkAddressFragment fragmentBuilder_BindEasycashWorkAddressFragment = (FragmentBuilder_BindEasycashWorkAddressFragment) obj;
        if (!this.IconCompatParcelizer.equals(fragmentBuilder_BindEasycashWorkAddressFragment.IconCompatParcelizer) || this.MediaBrowserCompat$ItemReceiver != fragmentBuilder_BindEasycashWorkAddressFragment.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        return true;
    }
}
