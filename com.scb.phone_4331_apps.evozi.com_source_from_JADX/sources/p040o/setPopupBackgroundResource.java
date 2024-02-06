package p040o;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040o.read;

/* renamed from: o.setPopupBackgroundResource */
public final class setPopupBackgroundResource {
    private static final Object IconCompatParcelizer = new Object();
    private static read MediaBrowserCompat$CustomActionResultReceiver;
    private static final Object MediaBrowserCompat$ItemReceiver = new Object();
    private static Set<String> read = new HashSet();
    private static String write;
    private final NotificationManager MediaDescriptionCompat;
    private final Context RatingCompat;

    /* renamed from: o.setPopupBackgroundResource$IconCompatParcelizer */
    interface IconCompatParcelizer {
        void MediaBrowserCompat$ItemReceiver(read read) throws RemoteException;
    }

    public static setPopupBackgroundResource MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new setPopupBackgroundResource(context);
    }

    private setPopupBackgroundResource(Context context) {
        this.RatingCompat = context;
        this.MediaDescriptionCompat = (NotificationManager) context.getSystemService("notification");
    }

    public final void IconCompatParcelizer(String str, int i) {
        this.MediaDescriptionCompat.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            MediaBrowserCompat$ItemReceiver((IconCompatParcelizer) new C7466xc08e0473(this.RatingCompat.getPackageName(), i, str));
        }
    }

    public final void write(int i, Notification notification) {
        write((String) null, i, notification);
    }

    public final void write(String str, int i, Notification notification) {
        if (MediaBrowserCompat$ItemReceiver(notification)) {
            MediaBrowserCompat$ItemReceiver((IconCompatParcelizer) new setPopupBackgroundResource$MediaBrowserCompat$ItemReceiver(this.RatingCompat.getPackageName(), i, str, notification));
            this.MediaDescriptionCompat.cancel(str, i);
            return;
        }
        this.MediaDescriptionCompat.notify(str, i, notification);
    }

    public static Set<String> IconCompatParcelizer(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (IconCompatParcelizer) {
            if (string != null) {
                if (!string.equals(write)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    read = hashSet;
                    write = string;
                }
            }
            set = read;
        }
        return set;
    }

    private static boolean MediaBrowserCompat$ItemReceiver(Notification notification) {
        Bundle IconCompatParcelizer2 = setDropDownHorizontalOffset.IconCompatParcelizer(notification);
        return IconCompatParcelizer2 != null && IconCompatParcelizer2.getBoolean("android.support.useSideChannel");
    }

    private void MediaBrowserCompat$ItemReceiver(IconCompatParcelizer iconCompatParcelizer) {
        synchronized (MediaBrowserCompat$ItemReceiver) {
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                MediaBrowserCompat$CustomActionResultReceiver = new read(this.RatingCompat.getApplicationContext());
            }
            MediaBrowserCompat$CustomActionResultReceiver.write(iconCompatParcelizer);
        }
    }

    /* renamed from: o.setPopupBackgroundResource$read */
    static class read implements Handler.Callback, ServiceConnection {
        private final HandlerThread IconCompatParcelizer;
        private final Handler MediaBrowserCompat$CustomActionResultReceiver;
        private final Context MediaBrowserCompat$ItemReceiver;
        private final Map<ComponentName, setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver> read = new HashMap();
        private Set<String> write = new HashSet();

        read(Context context) {
            this.MediaBrowserCompat$ItemReceiver = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.IconCompatParcelizer = handlerThread;
            handlerThread.start();
            this.MediaBrowserCompat$CustomActionResultReceiver = new Handler(this.IconCompatParcelizer.getLooper(), this);
        }

        public void write(IconCompatParcelizer iconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver.obtainMessage(0, iconCompatParcelizer).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                read((IconCompatParcelizer) message.obj);
                return true;
            } else if (i == 1) {
                write write2 = (write) message.obj;
                read(write2.IconCompatParcelizer, write2.MediaBrowserCompat$CustomActionResultReceiver);
                return true;
            } else if (i == 2) {
                MediaBrowserCompat$ItemReceiver((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                MediaBrowserCompat$CustomActionResultReceiver((ComponentName) message.obj);
                return true;
            }
        }

        private void read(IconCompatParcelizer iconCompatParcelizer) {
            write();
            for (setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver next : this.read.values()) {
                next.IconCompatParcelizer.add(iconCompatParcelizer);
                MediaBrowserCompat$CustomActionResultReceiver(next);
            }
        }

        private void read(ComponentName componentName, IBinder iBinder) {
            setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver = this.read.get(componentName);
            if (setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver != null) {
                setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.write = read.write.read(iBinder);
                setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = 0;
                MediaBrowserCompat$CustomActionResultReceiver(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver);
            }
        }

        private void MediaBrowserCompat$ItemReceiver(ComponentName componentName) {
            setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver = this.read.get(componentName);
            if (setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver != null) {
                MediaBrowserCompat$ItemReceiver(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver);
            }
        }

        private void MediaBrowserCompat$CustomActionResultReceiver(ComponentName componentName) {
            setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver = this.read.get(componentName);
            if (setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver != null) {
                MediaBrowserCompat$CustomActionResultReceiver(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver);
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
                Log.d("NotifManCompat", sb.toString());
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.obtainMessage(1, new write(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
                Log.d("NotifManCompat", sb.toString());
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.obtainMessage(2, componentName).sendToTarget();
        }

        private void write() {
            Set<String> IconCompatParcelizer2 = setPopupBackgroundResource.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
            if (!IconCompatParcelizer2.equals(this.write)) {
                this.write = IconCompatParcelizer2;
                List<ResolveInfo> queryIntentServices = this.MediaBrowserCompat$ItemReceiver.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (IconCompatParcelizer2.contains(next.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                            Log.w("NotifManCompat", sb.toString());
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.read.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Adding listener record for ");
                            sb2.append(componentName2);
                            Log.d("NotifManCompat", sb2.toString());
                        }
                        this.read.put(componentName2, new setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver>> it = this.read.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Removing listener record for ");
                            sb3.append(next2.getKey());
                            Log.d("NotifManCompat", sb3.toString());
                        }
                        MediaBrowserCompat$ItemReceiver((setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        private boolean write(setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver) {
            if (setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver) {
                return true;
            }
            setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.read), this, 33);
            if (setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver) {
                setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.read);
                Log.w("NotifManCompat", sb.toString());
                this.MediaBrowserCompat$ItemReceiver.unbindService(this);
            }
            return setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
        }

        private void MediaBrowserCompat$ItemReceiver(setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver) {
            if (setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver.unbindService(this);
                setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = false;
            }
            setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.write = null;
        }

        private void read(setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver) {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver.hasMessages(3, setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.read)) {
                setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver++;
                if (setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver > 6) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Giving up on delivering ");
                    sb.append(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.IconCompatParcelizer.size());
                    sb.append(" tasks to ");
                    sb.append(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.read);
                    sb.append(" after ");
                    sb.append(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
                    sb.append(" retries");
                    Log.w("NotifManCompat", sb.toString());
                    setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.IconCompatParcelizer.clear();
                    return;
                }
                int i = (1 << (setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Scheduling retry for ");
                    sb2.append(i);
                    sb2.append(" ms");
                    Log.d("NotifManCompat", sb2.toString());
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.sendMessageDelayed(this.MediaBrowserCompat$CustomActionResultReceiver.obtainMessage(3, setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.read), (long) i);
            }
        }

        private void MediaBrowserCompat$CustomActionResultReceiver(setPopupBackgroundResource$read$MediaBrowserCompat$ItemReceiver setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.read);
                sb.append(", ");
                sb.append(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.IconCompatParcelizer.size());
                sb.append(" queued tasks");
                Log.d("NotifManCompat", sb.toString());
            }
            if (!setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.IconCompatParcelizer.isEmpty()) {
                if (!write(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver) || setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.write == null) {
                    read(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver);
                    return;
                }
                while (true) {
                    IconCompatParcelizer peek = setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.IconCompatParcelizer.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(peek);
                            Log.d("NotifManCompat", sb2.toString());
                        }
                        peek.MediaBrowserCompat$ItemReceiver(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.write);
                        setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.IconCompatParcelizer.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Remote service has died: ");
                            sb3.append(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.read);
                            Log.d("NotifManCompat", sb3.toString());
                        }
                    } catch (RemoteException e) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("RemoteException communicating with ");
                        sb4.append(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.read);
                        Log.w("NotifManCompat", sb4.toString(), e);
                    }
                }
                if (!setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver.IconCompatParcelizer.isEmpty()) {
                    read(setpopupbackgroundresource_read_mediabrowsercompat_itemreceiver);
                }
            }
        }
    }

    /* renamed from: o.setPopupBackgroundResource$write */
    static class write {
        final ComponentName IconCompatParcelizer;
        final IBinder MediaBrowserCompat$CustomActionResultReceiver;

        write(ComponentName componentName, IBinder iBinder) {
            this.IconCompatParcelizer = componentName;
            this.MediaBrowserCompat$CustomActionResultReceiver = iBinder;
        }
    }
}
