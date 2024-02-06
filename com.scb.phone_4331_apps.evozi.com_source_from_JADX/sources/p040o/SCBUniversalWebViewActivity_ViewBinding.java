package p040o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;

/* renamed from: o.SCBUniversalWebViewActivity_ViewBinding */
public class SCBUniversalWebViewActivity_ViewBinding implements Serializable, Comparable<SCBUniversalWebViewActivity_ViewBinding> {
    public static final SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = PinChangeSuccessActivity.read();
    public static final C7043xa484e06c write = new C7043xa484e06c((byte) 0);
    public final byte[] IconCompatParcelizer;
    public transient String MediaBrowserCompat$ItemReceiver;
    public transient int read;

    public /* synthetic */ int compareTo(Object obj) {
        SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = (SCBUniversalWebViewActivity_ViewBinding) obj;
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "other");
        return PinChangeSuccessActivity.IconCompatParcelizer(this, sCBUniversalWebViewActivity_ViewBinding);
    }

    public SCBUniversalWebViewActivity_ViewBinding(byte[] bArr) {
        onGetStartedClick.write((Object) bArr, "data");
        this.IconCompatParcelizer = bArr;
    }

    public String MediaBrowserCompat$ItemReceiver() {
        return PinChangeSuccessActivity.write(this);
    }

    public SCBUniversalWebViewActivity_ViewBinding IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.IconCompatParcelizer);
        onGetStartedClick.IconCompatParcelizer((Object) digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new SCBUniversalWebViewActivity_ViewBinding(digest);
    }

    public String read() {
        return PinChangeSuccessActivity.read(this);
    }

    public SCBUniversalWebViewActivity_ViewBinding IconCompatParcelizer() {
        return PinChangeSuccessActivity.MediaBrowserCompat$MediaItem(this);
    }

    public byte IconCompatParcelizer(int i) {
        return PinChangeSuccessActivity.IconCompatParcelizer(this, i);
    }

    public int write() {
        return PinChangeSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public byte[] MediaMetadataCompat() {
        return PinChangeSuccessActivity.MediaDescriptionCompat(this);
    }

    public byte[] MediaBrowserCompat$CustomActionResultReceiver() {
        return PinChangeSuccessActivity.IconCompatParcelizer(this);
    }

    public void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "buffer");
        byte[] bArr = this.IconCompatParcelizer;
        sCBUniversalWebViewActivity.IconCompatParcelizer(bArr, 0, bArr.length);
    }

    public boolean read(int i, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, int i2) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "other");
        return PinChangeSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(this, 0, sCBUniversalWebViewActivity_ViewBinding, 0, i2);
    }

    public boolean read(int i, byte[] bArr, int i2, int i3) {
        onGetStartedClick.write((Object) bArr, "other");
        return PinChangeSuccessActivity.write(this, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        return PinChangeSuccessActivity.IconCompatParcelizer(this, obj);
    }

    public int hashCode() {
        return PinChangeSuccessActivity.MediaBrowserCompat$ItemReceiver(this);
    }

    public String toString() {
        return PinChangeSuccessActivity.MediaBrowserCompat$SearchResultReceiver(this);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        InputStream inputStream = objectInputStream;
        onGetStartedClick.write((Object) inputStream, "$receiver");
        int i = 0;
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            while (i < readInt) {
                int read2 = inputStream.read(bArr, i, readInt - i);
                if (read2 != -1) {
                    i += read2;
                } else {
                    throw new EOFException();
                }
            }
            SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = new SCBUniversalWebViewActivity_ViewBinding(bArr);
            Field declaredField = SCBUniversalWebViewActivity_ViewBinding.class.getDeclaredField("IconCompatParcelizer");
            onGetStartedClick.IconCompatParcelizer((Object) declaredField, "field");
            declaredField.setAccessible(true);
            declaredField.set(this, sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(readInt);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.IconCompatParcelizer.length);
        objectOutputStream.write(this.IconCompatParcelizer);
    }

    public static final SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$ItemReceiver(String str) {
        onGetStartedClick.write((Object) str, "$receiver");
        return PinChangeSuccessActivity.read(str);
    }
}
