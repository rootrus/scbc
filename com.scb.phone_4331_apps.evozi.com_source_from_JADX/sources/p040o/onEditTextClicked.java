package p040o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* renamed from: o.onEditTextClicked */
public final class onEditTextClicked {
    public static final onEditNicknameClick IconCompatParcelizer = MediaBrowserCompat$ItemReceiver();
    private static final boolean MediaBrowserCompat$CustomActionResultReceiver;

    private static onEditNicknameClick MediaBrowserCompat$ItemReceiver() {
        List<MainDispatcherFactory> list;
        Object obj;
        onEditNicknameClick MediaBrowserCompat$ItemReceiver;
        try {
            if (MediaBrowserCompat$CustomActionResultReceiver) {
                list = IdpLivenessCheckActivity.write.MediaBrowserCompat$CustomActionResultReceiver();
            } else {
                Iterator it = ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator();
                onGetStartedClick.IconCompatParcelizer((Object) it, "ServiceLoader.load(\n    …             ).iterator()");
                list = JuristicRequestFormActivity.MediaBrowserCompat$CustomActionResultReceiver(JuristicRequestFormActivity.read(it));
            }
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                obj = null;
            } else {
                obj = it2.next();
                if (it2.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) obj).getLoadPriority();
                    do {
                        Object next = it2.next();
                        int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            obj = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it2.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
            if (mainDispatcherFactory == null || (MediaBrowserCompat$ItemReceiver = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(mainDispatcherFactory, (List<? extends MainDispatcherFactory>) list)) == null) {
                return new NdidNationalIdInputActivity_ViewBinding((Throwable) null);
            }
            return MediaBrowserCompat$ItemReceiver;
        } catch (Throwable th) {
            return new NdidNationalIdInputActivity_ViewBinding(th);
        }
    }

    static {
        boolean z;
        onGetStartedClick.write((Object) "kotlinx.coroutines.fast.service.loader", "propertyName");
        String IconCompatParcelizer2 = EkycSuccessActivity_ViewBinding.IconCompatParcelizer("kotlinx.coroutines.fast.service.loader");
        if (IconCompatParcelizer2 != null) {
            z = Boolean.parseBoolean(IconCompatParcelizer2);
        } else {
            z = true;
        }
        MediaBrowserCompat$CustomActionResultReceiver = z;
    }
}
