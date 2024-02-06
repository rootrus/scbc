package p040o;

import com.google.gson.JsonParseException;
import com.scb.phone.domain.errors.RetrofitException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import p040o.ILocationSourceDelegate;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.HttpException;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* renamed from: o.zabr */
public class zabr extends CallAdapter.Factory {
    private static ArrayList<String> IconCompatParcelizer;
    private final RxJava2CallAdapterFactory write = RxJava2CallAdapterFactory.create();

    private zabr() {
        ArrayList<String> arrayList = new ArrayList<>();
        IconCompatParcelizer = arrayList;
        arrayList.add("1000");
        IconCompatParcelizer.add("0");
    }

    public static CallAdapter.Factory MediaBrowserCompat$CustomActionResultReceiver() {
        return new zabr();
    }

    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (getRawType(type) == BScanCNotificationDeepLinkActivity.class) {
            return new zabr$MediaBrowserCompat$CustomActionResultReceiver(retrofit, this.write.get(type, annotationArr, retrofit));
        }
        return new zabr$MediaBrowserCompat$ItemReceiver(retrofit, this.write.get(type, annotationArr, retrofit));
    }

    public static void MediaBrowserCompat$ItemReceiver(setCurrentItemInternal setcurrentiteminternal) {
        isSupportFragmentClass issupportfragmentclass;
        if (setcurrentiteminternal.getError() != null) {
            IconCompatParcelizer(setcurrentiteminternal.getError());
        } else if (setcurrentiteminternal.getStatus() != null && setcurrentiteminternal.getStatus().write() != null) {
            String write2 = setcurrentiteminternal.getStatus().write();
            show show = new show(IconCompatParcelizer);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new getEnvDeviceID$MediaBrowserCompat$CustomActionResultReceiver(write2)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (!(issupportfragmentclass.IconCompatParcelizer != null)) {
                IconCompatParcelizer(setcurrentiteminternal.getStatus());
            }
        }
    }

    public static void IconCompatParcelizer(setOnPageChangeListener setonpagechangelistener) {
        String str;
        ILocationSourceDelegate.zza MediaBrowserCompat$ItemReceiver = ILocationSourceDelegate.zza.MediaBrowserCompat$ItemReceiver();
        try {
            MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = setonpagechangelistener.write();
            if (setonpagechangelistener.read() != null) {
                str = setonpagechangelistener.read();
            } else {
                str = setonpagechangelistener.IconCompatParcelizer();
            }
            MediaBrowserCompat$ItemReceiver.read = str;
            MediaBrowserCompat$ItemReceiver.write = setonpagechangelistener.MediaBrowserCompat$ItemReceiver();
            if ("xxxx".equals(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) || "1002".equals(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
                ILocationSourceDelegate write2 = ILocationSourceDelegate.write();
                write2.write = MediaBrowserCompat$ItemReceiver;
                throw RetrofitException.MediaMetadataCompat(write2);
            } else if ("1016".equals(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
                ILocationSourceDelegate write3 = ILocationSourceDelegate.write();
                write3.write = MediaBrowserCompat$ItemReceiver;
                throw RetrofitException.MediaBrowserCompat$MediaItem(write3);
            } else if ("901".equals(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
                ILocationSourceDelegate write4 = ILocationSourceDelegate.write();
                write4.write = MediaBrowserCompat$ItemReceiver;
                throw RetrofitException.MediaBrowserCompat$SearchResultReceiver(write4);
            } else if ("1035".equals(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
                ILocationSourceDelegate write5 = ILocationSourceDelegate.write();
                write5.write = MediaBrowserCompat$ItemReceiver;
                throw RetrofitException.IconCompatParcelizer(write5);
            } else if ("1037".equals(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
                ILocationSourceDelegate write6 = ILocationSourceDelegate.write();
                write6.write = MediaBrowserCompat$ItemReceiver;
                throw RetrofitException.read(write6);
            } else if ("1038".equals(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
                ILocationSourceDelegate write7 = ILocationSourceDelegate.write();
                write7.write = MediaBrowserCompat$ItemReceiver;
                throw RetrofitException.write(write7);
            } else if ("902".equals(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
                ILocationSourceDelegate write8 = ILocationSourceDelegate.write();
                write8.write = MediaBrowserCompat$ItemReceiver;
                throw RetrofitException.MediaBrowserCompat$ItemReceiver(write8);
            } else {
                ILocationSourceDelegate write9 = ILocationSourceDelegate.write();
                write9.write = MediaBrowserCompat$ItemReceiver;
                throw RetrofitException.MediaBrowserCompat$CustomActionResultReceiver(write9);
            }
        } catch (Exception e) {
            throw RetrofitException.IconCompatParcelizer((Throwable) e);
        }
    }

    public static void IconCompatParcelizer(String str) {
        if (!IconCompatParcelizer.contains(str)) {
            IconCompatParcelizer.add(str);
        }
    }

    public static void IconCompatParcelizer() {
        IconCompatParcelizer.clear();
        IconCompatParcelizer.add("1000");
        IconCompatParcelizer.add("0");
    }

    @Deprecated
    public static void write(String str) {
        IconCompatParcelizer.remove(str);
    }

    static /* synthetic */ RetrofitException MediaBrowserCompat$CustomActionResultReceiver(Retrofit retrofit, Throwable th) {
        if (th instanceof HttpException) {
            Response<?> response = ((HttpException) th).response();
            if (response != null && response.code() >= 500) {
                return RetrofitException.MediaBrowserCompat$ItemReceiver(response, retrofit);
            }
            return RetrofitException.MediaBrowserCompat$CustomActionResultReceiver(response, retrofit);
        } else if (th instanceof SocketTimeoutException) {
            return RetrofitException.read((IOException) (SocketTimeoutException) th);
        } else {
            boolean z = th instanceof SocketException;
            if (z || (th instanceof UnknownHostException)) {
                if (z && "Connection reset".equalsIgnoreCase(th.getMessage())) {
                    return RetrofitException.read((IOException) (SocketException) th);
                }
            } else if (th instanceof JsonParseException) {
                return RetrofitException.read(th);
            } else {
                if (!(th instanceof IOException)) {
                    if (th instanceof RetrofitException) {
                        return (RetrofitException) th;
                    }
                    return RetrofitException.IconCompatParcelizer(th);
                }
            }
            return RetrofitException.IconCompatParcelizer((IOException) th);
        }
    }
}
