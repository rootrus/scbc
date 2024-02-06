package p040o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

/* renamed from: o.AccountRemarkViewHolder */
public class AccountRemarkViewHolder implements Serializable {
    public static final AccountRemarkViewHolder IconCompatParcelizer = new AccountRemarkViewHolder();
    public static final Class MediaBrowserCompat$CustomActionResultReceiver = Boolean.TRUE.getClass();
    public static final Class MediaBrowserCompat$ItemReceiver = new Object().getClass();
    public static final Class MediaBrowserCompat$SearchResultReceiver = new Vector().getClass();
    public static final Class MediaDescriptionCompat = "".getClass();
    public static final Class read;
    public static final Class write;
    public int MediaBrowserCompat$MediaItem;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f5805x50fd9e4a;
    public boolean MediaMetadataCompat;
    public Object MediaSessionCompat$QueueItem = MediaBrowserCompat$ItemReceiver;
    public String MediaSessionCompat$ResultReceiverWrapper;
    protected Object MediaSessionCompat$Token;
    public AccountRemarkViewHolder RatingCompat;

    static {
        Integer num = 0;
        read = num.getClass();
        Long l = 0L;
        write = l.getClass();
    }

    public final Object MediaBrowserCompat$ItemReceiver() {
        return this.MediaSessionCompat$Token;
    }

    public final void write(Object obj) {
        this.MediaSessionCompat$Token = obj;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f5805x50fd9e4a);
        stringBuffer.append(" : ");
        Object obj = this.MediaSessionCompat$Token;
        if (obj != null) {
            stringBuffer.append(obj);
        } else {
            stringBuffer.append("(not set)");
        }
        return stringBuffer.toString();
    }

    public Object clone() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.flush();
            objectOutputStream.close();
            return new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (NotSerializableException e2) {
            e2.printStackTrace();
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
