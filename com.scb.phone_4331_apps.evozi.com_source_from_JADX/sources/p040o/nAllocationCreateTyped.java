package p040o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p040o.isComplex;

/* renamed from: o.nAllocationCreateTyped */
public class nAllocationCreateTyped extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        getPointerSize.write(context);
        RenderScript$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = RenderScript.IconCompatParcelizer().read(queryParameter).IconCompatParcelizer(ZHPR2.IconCompatParcelizer(intValue));
        if (queryParameter2 != null) {
            IconCompatParcelizer.read(Base64.decode(queryParameter2, 0));
        }
        createMultiContext createmulticontext = getPointerSize.MediaBrowserCompat$CustomActionResultReceiver;
        if (createmulticontext != null) {
            isComplex.C138124 r0 = createmulticontext.write().MediaBrowserCompat$ItemReceiver;
            r0.write.execute(new isComplex.C137921(r0, IconCompatParcelizer.IconCompatParcelizer(), i, rsnScriptInvokeV$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver));
            return;
        }
        throw new IllegalStateException("Not initialized!");
    }
}
