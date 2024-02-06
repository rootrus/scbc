package p040o;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Deprecated
/* renamed from: o.TransferActivity_ViewBinding */
class TransferActivity_ViewBinding implements InvocationHandler {
    private static final Constructor<?> IconCompatParcelizer;
    private final ScbPrivacyPolicyActivity MediaBrowserCompat$CustomActionResultReceiver;

    static {
        try {
            IconCompatParcelizer = Proxy.getProxyClass(TransferActivity_ViewBinding.class.getClassLoader(), new Class[]{FriendsRegistrationActivity.class}).getConstructor(new Class[]{InvocationHandler.class});
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }

    private TransferActivity_ViewBinding(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = scbPrivacyPolicyActivity;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        InputStream write;
        if (method.getName().equals("close")) {
            PrepaidResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null || !MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$MediaItem() || (write = MediaBrowserCompat$CustomActionResultReceiver2.write()) == null) {
                return null;
            }
            write.close();
            return null;
        }
        try {
            return method.invoke(this.MediaBrowserCompat$CustomActionResultReceiver, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e;
        }
    }

    public static FriendsRegistrationActivity MediaBrowserCompat$ItemReceiver(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) {
        try {
            return (FriendsRegistrationActivity) IconCompatParcelizer.newInstance(new Object[]{new TransferActivity_ViewBinding(scbPrivacyPolicyActivity)});
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        }
    }
}
