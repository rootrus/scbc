package p040o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.FragmentBuilder_BindEasycashSuccessFragment */
class FragmentBuilder_BindEasycashSuccessFragment {
    final Object IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final Method MediaBrowserCompat$ItemReceiver;
    boolean write = true;

    FragmentBuilder_BindEasycashSuccessFragment(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventProducer target cannot be null.");
        } else if (method != null) {
            this.IconCompatParcelizer = obj;
            this.MediaBrowserCompat$ItemReceiver = method;
            method.setAccessible(true);
            this.MediaBrowserCompat$CustomActionResultReceiver = ((method.hashCode() + 31) * 31) + obj.hashCode();
        } else {
            throw new NullPointerException("EventProducer method cannot be null.");
        }
    }

    public final Object read() throws InvocationTargetException {
        if (this.write) {
            try {
                return this.MediaBrowserCompat$ItemReceiver.invoke(this.IconCompatParcelizer, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(toString());
            sb.append(" has been invalidated and can no longer produce events.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[EventProducer ");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FragmentBuilder_BindEasycashSuccessFragment fragmentBuilder_BindEasycashSuccessFragment = (FragmentBuilder_BindEasycashSuccessFragment) obj;
        if (!this.MediaBrowserCompat$ItemReceiver.equals(fragmentBuilder_BindEasycashSuccessFragment.MediaBrowserCompat$ItemReceiver) || this.IconCompatParcelizer != fragmentBuilder_BindEasycashSuccessFragment.IconCompatParcelizer) {
            return false;
        }
        return true;
    }
}
