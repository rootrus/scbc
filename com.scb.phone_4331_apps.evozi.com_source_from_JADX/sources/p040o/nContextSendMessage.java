package p040o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import java.io.IOException;
import p040o.nAllocationSetSurface;
import p040o.nDeviceSetConfig;

/* renamed from: o.nContextSendMessage */
public final class nContextSendMessage {
    private final int IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final int MediaBrowserCompat$ItemReceiver;
    private final int MediaBrowserCompat$SearchResultReceiver;
    private final int read;
    private final nAllocationSetSurface.RatingCompat write;

    public static Animator write(nDeviceSetConfig ndevicesetconfig, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(ndevicesetconfig, nDeviceSetConfig.IconCompatParcelizer.read, nDeviceSetConfig.write.MediaBrowserCompat$CustomActionResultReceiver, new nDeviceSetConfig.read[]{new nDeviceSetConfig.read(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        nDeviceSetConfig.read read2 = ndevicesetconfig.read();
        if (read2 != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) ndevicesetconfig, (int) f, (int) f2, read2.read, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public nContextSendMessage() {
    }

    public static void read(copy1DRangeFromUnchecked copy1drangefromunchecked, getSubElementOffsetBytes getsubelementoffsetbytes) {
        getSubElementArraySize getsubelementarraysize = new getSubElementArraySize();
        getsubelementoffsetbytes.IconCompatParcelizer.add(getsubelementarraysize);
        try {
            if (copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver() != 943870035) {
                getsubelementarraysize.IconCompatParcelizer.add("Invalid PSD file signature");
                return;
            }
            int RatingCompat = copy1drangefromunchecked.RatingCompat();
            if (RatingCompat == 1 || RatingCompat == 2) {
                copy1drangefromunchecked.write(6);
                getsubelementarraysize.IconCompatParcelizer(1, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
                getsubelementarraysize.IconCompatParcelizer(2, Integer.valueOf(copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver()));
                getsubelementarraysize.IconCompatParcelizer(3, Integer.valueOf(copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver()));
                getsubelementarraysize.IconCompatParcelizer(4, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
                getsubelementarraysize.IconCompatParcelizer(5, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
                try {
                    copy1drangefromunchecked.write(copy1drangefromunchecked.MediaMetadataCompat());
                    nAllocationSetSurface$MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(copy1drangefromunchecked, (int) copy1drangefromunchecked.MediaMetadataCompat(), getsubelementoffsetbytes);
                } catch (IOException unused) {
                }
            } else {
                getsubelementarraysize.IconCompatParcelizer.add("Invalid PSD file version (must be 1 or 2)");
            }
        } catch (IOException unused2) {
            getsubelementarraysize.IconCompatParcelizer.add("Unable to read PSD header");
        }
    }

    public nContextSendMessage(int i, int i2, int i3, int i4, String str, nAllocationSetSurface.RatingCompat ratingCompat) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.MediaBrowserCompat$SearchResultReceiver = i2;
        this.IconCompatParcelizer = i3;
        this.read = i4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = ratingCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nContextSendMessage ncontextsendmessage = (nContextSendMessage) obj;
        if (this.read != ncontextsendmessage.read || this.IconCompatParcelizer != ncontextsendmessage.IconCompatParcelizer || this.MediaBrowserCompat$ItemReceiver != ncontextsendmessage.MediaBrowserCompat$ItemReceiver || this.MediaBrowserCompat$SearchResultReceiver != ncontextsendmessage.MediaBrowserCompat$SearchResultReceiver) {
            return false;
        }
        nAllocationSetSurface.RatingCompat ratingCompat = this.write;
        if (ratingCompat == null ? ncontextsendmessage.write != null : !ratingCompat.equals(ncontextsendmessage.write)) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = ncontextsendmessage.MediaBrowserCompat$CustomActionResultReceiver;
        return str == null ? str2 == null : str.equals(str2);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        int i2 = this.MediaBrowserCompat$SearchResultReceiver;
        int i3 = this.IconCompatParcelizer;
        int i4 = this.read;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i5 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        nAllocationSetSurface.RatingCompat ratingCompat = this.write;
        if (ratingCompat != null) {
            i5 = ratingCompat.hashCode();
        }
        return (((((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode) * 31) + i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("x: ");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(" y: ");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(" width: ");
        sb.append(this.IconCompatParcelizer);
        sb.append(" height: ");
        sb.append(this.read);
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            sb.append(" name: ");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (this.write != null) {
            sb.append(" age: ");
            sb.append(this.write.MediaBrowserCompat$ItemReceiver());
        }
        return sb.toString();
    }
}
