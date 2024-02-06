package p040o;

import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* renamed from: o.setInitialSavedState */
public class setInitialSavedState implements isStateSaved {
    public final String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public final setNextAnim MediaBrowserCompat$ItemReceiver;
    private volatile byte[] MediaBrowserCompat$SearchResultReceiver;
    private int MediaMetadataCompat;
    public final URL RatingCompat;
    public URL read;

    public setInitialSavedState(URL url) {
        this(url, setNextAnim.IconCompatParcelizer);
    }

    public setInitialSavedState(String str) {
        this(str, setNextAnim.IconCompatParcelizer);
    }

    private setInitialSavedState(URL url, setNextAnim setnextanim) {
        if (url != null) {
            this.RatingCompat = url;
            this.IconCompatParcelizer = null;
            if (setnextanim != null) {
                this.MediaBrowserCompat$ItemReceiver = setnextanim;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    private setInitialSavedState(String str, setNextAnim setnextanim) {
        this.RatingCompat = null;
        if (!TextUtils.isEmpty(str)) {
            this.IconCompatParcelizer = str;
            if (setnextanim != null) {
                this.MediaBrowserCompat$ItemReceiver = setnextanim;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    private String MediaBrowserCompat$ItemReceiver() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str;
        }
        URL url = this.RatingCompat;
        if (url != null) {
            return url.toString();
        }
        throw new NullPointerException("Argument must not be null");
    }

    public String toString() {
        return MediaBrowserCompat$ItemReceiver();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof setInitialSavedState)) {
            return false;
        }
        setInitialSavedState setinitialsavedstate = (setInitialSavedState) obj;
        String str = this.IconCompatParcelizer;
        if (str == null) {
            URL url = this.RatingCompat;
            if (url != null) {
                str = url.toString();
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
        String str2 = setinitialsavedstate.IconCompatParcelizer;
        if (str2 == null) {
            URL url2 = setinitialsavedstate.RatingCompat;
            if (url2 != null) {
                str2 = url2.toString();
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
        if (!str.equals(str2) || !this.MediaBrowserCompat$ItemReceiver.equals(setinitialsavedstate.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.MediaMetadataCompat == 0) {
            int hashCode = MediaBrowserCompat$ItemReceiver().hashCode();
            this.MediaMetadataCompat = hashCode;
            this.MediaMetadataCompat = (hashCode * 31) + this.MediaBrowserCompat$ItemReceiver.hashCode();
        }
        return this.MediaMetadataCompat;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MessageDigest messageDigest) {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            this.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$ItemReceiver().getBytes(write);
        }
        messageDigest.update(this.MediaBrowserCompat$SearchResultReceiver);
    }
}
