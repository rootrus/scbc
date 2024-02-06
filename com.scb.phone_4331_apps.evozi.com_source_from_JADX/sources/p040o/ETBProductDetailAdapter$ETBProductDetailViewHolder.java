package p040o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

/* renamed from: o.ETBProductDetailAdapter$ETBProductDetailViewHolder */
public class ETBProductDetailAdapter$ETBProductDetailViewHolder implements Serializable {
    public static final Class IconCompatParcelizer;
    public static final Class MediaBrowserCompat$CustomActionResultReceiver = Boolean.TRUE.getClass();
    public static final Class MediaBrowserCompat$ItemReceiver = new Object().getClass();
    public static final Class MediaBrowserCompat$MediaItem = "".getClass();
    public static final Class MediaBrowserCompat$SearchResultReceiver = new Vector().getClass();
    public static final Class read;
    public static final ETBProductDetailAdapter$ETBProductDetailViewHolder write = new ETBProductDetailAdapter$ETBProductDetailViewHolder();

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f5808x50fd9e4a;
    public ETBProductDetailAdapter$ETBProductDetailViewHolder MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    protected Object MediaSessionCompat$ResultReceiverWrapper;
    public Object ParcelableVolumeInfo = MediaBrowserCompat$ItemReceiver;
    public int RatingCompat;

    static {
        Integer num = 0;
        read = num.getClass();
        Long l = 0L;
        IconCompatParcelizer = l.getClass();
    }

    public final Object IconCompatParcelizer() {
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public final void write(Object obj) {
        this.MediaSessionCompat$ResultReceiverWrapper = obj;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.MediaSessionCompat$QueueItem);
        stringBuffer.append(" : ");
        Object obj = this.MediaSessionCompat$ResultReceiverWrapper;
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
