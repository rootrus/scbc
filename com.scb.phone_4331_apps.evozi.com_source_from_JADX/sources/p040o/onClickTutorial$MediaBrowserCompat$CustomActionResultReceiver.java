package p040o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: o.onClickTutorial$MediaBrowserCompat$CustomActionResultReceiver */
class onClickTutorial$MediaBrowserCompat$CustomActionResultReceiver implements InvocationHandler {
    private /* synthetic */ onClickTutorial IconCompatParcelizer;

    private onClickTutorial$MediaBrowserCompat$CustomActionResultReceiver(onClickTutorial onclicktutorial) {
        this.IconCompatParcelizer = onclicktutorial;
    }

    /* synthetic */ onClickTutorial$MediaBrowserCompat$CustomActionResultReceiver(onClickTutorial onclicktutorial, byte b) {
        this(onclicktutorial);
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onDateChanged")) {
            return method.invoke(this, objArr);
        }
        onClickTutorial onclicktutorial = this.IconCompatParcelizer;
        onclicktutorial.onDateChanged(onclicktutorial.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.getYear(), this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.getMonth(), this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.getDayOfMonth());
        return null;
    }
}
