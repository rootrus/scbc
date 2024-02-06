package p040o;

import android.text.TextUtils;
import com.scb.phone.domain.errors.RetrofitException;
import p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory;
import p040o.access$2300;

/* renamed from: o.writeUInt64NoTag */
public abstract class writeUInt64NoTag<T extends CheckCaptureModule_GetICheckDeserializerRttiFactory> {
    public RegularImmutableBiMap MediaBrowserCompat$CustomActionResultReceiver;
    public T RatingCompat;

    /* renamed from: o.writeUInt64NoTag$IconCompatParcelizer */
    public interface IconCompatParcelizer<V> {
        void IconCompatParcelizer(V v);
    }

    public void MediaBrowserCompat$ItemReceiver(T t) {
        this.RatingCompat = t;
    }

    public writeUInt64NoTag(RegularImmutableBiMap regularImmutableBiMap) {
        this.MediaBrowserCompat$CustomActionResultReceiver = regularImmutableBiMap;
    }

    public void write(int i) {
        RegularImmutableBiMap regularImmutableBiMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        access$2200 read = regularImmutableBiMap.read((String) null, regularImmutableBiMap.MediaBrowserCompat$CustomActionResultReceiver.getString(i), access$2300.write.JUST_DISMISS);
        boolean z = true;
        if (this.RatingCompat != null) {
            if (this.RatingCompat != null) {
                this.RatingCompat.ay_();
            }
            if (this.RatingCompat != null) {
                this.RatingCompat.aj_();
            }
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                this.RatingCompat.az_();
            }
            this.RatingCompat.write(read);
        }
    }

    public final void read(String str, String str2) {
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read(str, str2, access$2300.write.JUST_DISMISS));
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, access$2300.write write) {
        RegularImmutableBiMap regularImmutableBiMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        access$2200 read = regularImmutableBiMap.read((String) null, regularImmutableBiMap.MediaBrowserCompat$CustomActionResultReceiver.getString(i), write);
        boolean z = true;
        if (this.RatingCompat != null) {
            if (this.RatingCompat != null) {
                this.RatingCompat.ay_();
            }
            if (this.RatingCompat != null) {
                this.RatingCompat.aj_();
            }
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                this.RatingCompat.az_();
            }
            this.RatingCompat.write(read);
        }
    }

    /* access modifiers changed from: protected */
    public final void read(String str, String str2, access$2300.write write) {
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read(str, str2, write));
    }

    /* access modifiers changed from: protected */
    public final void read(String str, String str2, Runnable runnable) {
        RegularImmutableBiMap regularImmutableBiMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (TextUtils.isEmpty(str)) {
            str = regularImmutableBiMap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.common_error);
        }
        String string = regularImmutableBiMap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2737ok);
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = string;
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.MediaBrowserCompat$CustomActionResultReceiver = runnable;
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = str;
        access_2200.IconCompatParcelizer = str2;
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        MediaBrowserCompat$ItemReceiver(access_2200);
    }

    public final void read(int i, int i2, Runnable runnable) {
        access$2200 MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i, i2, runnable);
        boolean z = true;
        if (this.RatingCompat != null) {
            if (this.RatingCompat != null) {
                this.RatingCompat.ay_();
            }
            if (this.RatingCompat != null) {
                this.RatingCompat.aj_();
            }
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                this.RatingCompat.az_();
            }
            this.RatingCompat.write(MediaBrowserCompat$ItemReceiver);
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(Throwable th, boolean z) {
        boolean z2 = true;
        boolean z3 = (th instanceof RetrofitException) && ((RetrofitException) th).write == RetrofitException.read.SESSION_EXPIRED;
        if (z3 && z) {
            access$2200 MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
            if (this.RatingCompat != null) {
                if (this.RatingCompat != null) {
                    this.RatingCompat.ay_();
                }
                if (this.RatingCompat != null) {
                    this.RatingCompat.aj_();
                }
                if (this.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    this.RatingCompat.az_();
                }
                this.RatingCompat.write(MediaBrowserCompat$ItemReceiver);
            }
        }
        return z3;
    }

    public static boolean IconCompatParcelizer(Throwable th) {
        return (th instanceof RetrofitException) && ((RetrofitException) th).write == RetrofitException.read.REQUIRED_OTP;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        return (th instanceof RetrofitException) && ((RetrofitException) th).write == RetrofitException.read.OTP_FAILED;
    }

    public static boolean read(Throwable th) {
        return (th instanceof RetrofitException) && ((RetrofitException) th).write == RetrofitException.read.OTP_REACH_MAX_LIMIT;
    }

    public static boolean write(Throwable th) {
        return (th instanceof RetrofitException) && ((RetrofitException) th).write == RetrofitException.read.OTP_EXPIRED;
    }

    public static boolean MediaBrowserCompat$ItemReceiver(Throwable th) {
        return (th instanceof RetrofitException) && ((RetrofitException) th).write == RetrofitException.read.NON_FASTPAY;
    }

    public final void RatingCompat(Throwable th) {
        if (!MediaBrowserCompat$SearchResultReceiver(th)) {
            buildHttpRequest buildhttprequest = new buildHttpRequest(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            if (this.RatingCompat != null) {
                buildhttprequest.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final void write(boolean z, IconCompatParcelizer<T> iconCompatParcelizer) {
        if (z) {
            if (this.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final boolean MediaBrowserCompat$SearchResultReceiver(Throwable th) {
        boolean z = true;
        boolean z2 = (th instanceof RetrofitException) && ((RetrofitException) th).write == RetrofitException.read.SESSION_EXPIRED;
        if (z2) {
            access$2200 MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
            if (this.RatingCompat != null) {
                if (this.RatingCompat != null) {
                    this.RatingCompat.ay_();
                }
                if (this.RatingCompat != null) {
                    this.RatingCompat.aj_();
                }
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    this.RatingCompat.az_();
                }
                this.RatingCompat.write(MediaBrowserCompat$ItemReceiver);
            }
        }
        return z2;
    }

    public void onDestroy() {
        boolean z = true;
        if (this.RatingCompat != null) {
            this.RatingCompat.ay_();
        }
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            this.RatingCompat.aj_();
        }
        this.RatingCompat = null;
    }

    public final void MediaBrowserCompat$ItemReceiver(access$2200 access_2200) {
        boolean z = true;
        if (this.RatingCompat != null) {
            if (this.RatingCompat != null) {
                this.RatingCompat.ay_();
            }
            if (this.RatingCompat != null) {
                this.RatingCompat.aj_();
            }
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                this.RatingCompat.az_();
            }
            this.RatingCompat.write(access_2200);
        }
    }
}
