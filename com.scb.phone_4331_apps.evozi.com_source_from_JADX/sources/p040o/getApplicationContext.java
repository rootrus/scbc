package p040o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p040o.isComplex;

@HmlSetNTBPinActivity
/* renamed from: o.getApplicationContext */
final class getApplicationContext implements getTopLeftCornerWidth {
    private final write MediaBrowserCompat$CustomActionResultReceiver;
    private final Map<String, nAllocationCopyToBitmap> MediaBrowserCompat$ItemReceiver;
    private final isComplex.C137212 read;

    @HmlPinActivity
    getApplicationContext(Context context, isComplex.C137212 r3) {
        this(new write(context), r3);
    }

    private getApplicationContext(write write2, isComplex.C137212 r3) {
        this.MediaBrowserCompat$ItemReceiver = new HashMap();
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
        this.read = r3;
    }

    public final nAllocationCopyToBitmap read(String str) {
        synchronized (this) {
            if (this.MediaBrowserCompat$ItemReceiver.containsKey(str)) {
                nAllocationCopyToBitmap nallocationcopytobitmap = this.MediaBrowserCompat$ItemReceiver.get(str);
                return nallocationcopytobitmap;
            }
            setupNative read2 = this.MediaBrowserCompat$CustomActionResultReceiver.read(str);
            if (read2 == null) {
                return null;
            }
            isComplex.C137212 r1 = this.read;
            nAllocationCopyToBitmap create = read2.create(new setBlackList(r1.MediaBrowserCompat$CustomActionResultReceiver, r1.MediaBrowserCompat$ItemReceiver, r1.write, str));
            this.MediaBrowserCompat$ItemReceiver.put(str, create);
            return create;
        }
    }

    /* renamed from: o.getApplicationContext$write */
    static class write {
        private Map<String, String> MediaBrowserCompat$ItemReceiver = null;
        private final Context write;

        write(Context context) {
            this.write = context;
        }

        private static Bundle MediaBrowserCompat$CustomActionResultReceiver(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public final setupNative read(String str) {
            Map<String, String> map;
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                Bundle MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(this.write);
                if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                    Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str2 : MediaBrowserCompat$CustomActionResultReceiver.keySet()) {
                        Object obj = MediaBrowserCompat$CustomActionResultReceiver.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String trim : ((String) obj).split(",", -1)) {
                                String trim2 = trim.trim();
                                if (!trim2.isEmpty()) {
                                    hashMap.put(trim2, str2.substring(8));
                                }
                            }
                        }
                    }
                    map = hashMap;
                }
                this.MediaBrowserCompat$ItemReceiver = map;
            }
            String str3 = this.MediaBrowserCompat$ItemReceiver.get(str);
            if (str3 == null) {
                return null;
            }
            try {
                return (setupNative) Class.forName(str3).asSubclass(setupNative.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{str3}), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str3}), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str3}), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str3}), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str3}), e5);
                return null;
            }
        }
    }
}
