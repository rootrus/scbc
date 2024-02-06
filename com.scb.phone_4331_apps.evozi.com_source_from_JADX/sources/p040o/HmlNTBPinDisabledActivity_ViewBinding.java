package p040o;

import java.lang.reflect.InvocationTargetException;
import p039io.realm.exceptions.RealmException;

/* renamed from: o.HmlNTBPinDisabledActivity_ViewBinding */
public final class HmlNTBPinDisabledActivity_ViewBinding {
    private static final HmlNTBPinDisabledActivity_ViewBinding IconCompatParcelizer = new HmlNTBPinDisabledActivity_ViewBinding();
    private static HmlNTBPinDisabledActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;

    public static Object[] MediaBrowserCompat$CustomActionResultReceiver() {
        return new Object[12];
    }

    static {
        MediaBrowserCompat$CustomActionResultReceiver = null;
        try {
            MediaBrowserCompat$CustomActionResultReceiver = (HmlNTBPinDisabledActivity_ViewBinding) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
        } catch (InstantiationException e) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e);
        } catch (IllegalAccessException e2) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e2);
        } catch (NoSuchMethodException e3) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e3);
        } catch (InvocationTargetException e4) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e4.getTargetException());
        }
    }

    public static HmlNTBPinDisabledActivity_ViewBinding read(boolean z) {
        return IconCompatParcelizer;
    }

    public static HmlNTBPinDisabledActivity_ViewBinding MediaBrowserCompat$ItemReceiver() {
        HmlNTBPinDisabledActivity_ViewBinding hmlNTBPinDisabledActivity_ViewBinding = MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlNTBPinDisabledActivity_ViewBinding != null) {
            return hmlNTBPinDisabledActivity_ViewBinding;
        }
        return IconCompatParcelizer;
    }
}
