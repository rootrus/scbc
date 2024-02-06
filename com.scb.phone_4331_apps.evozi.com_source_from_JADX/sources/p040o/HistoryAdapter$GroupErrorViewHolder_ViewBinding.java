package p040o;

import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;

/* renamed from: o.HistoryAdapter$GroupErrorViewHolder_ViewBinding */
public interface HistoryAdapter$GroupErrorViewHolder_ViewBinding {
    public static final String[] read = {"START_DOCUMENT", "END_DOCUMENT", "START_TAG", "END_TAG", "TEXT", "CDSECT", "ENTITY_REF", "IGNORABLE_WHITESPACE", "PROCESSING_INSTRUCTION", "COMMENT", "DOCDECL"};

    String IconCompatParcelizer();

    String IconCompatParcelizer(int i) throws XmlPullParserException;

    String IconCompatParcelizer(String str);

    int MediaBrowserCompat$CustomActionResultReceiver();

    String MediaBrowserCompat$CustomActionResultReceiver(int i);

    void MediaBrowserCompat$CustomActionResultReceiver(int i, String str, String str2) throws XmlPullParserException, IOException;

    int MediaBrowserCompat$ItemReceiver();

    int MediaBrowserCompat$ItemReceiver(int i) throws XmlPullParserException;

    String MediaBrowserCompat$ItemReceiver(String str, String str2);

    String MediaBrowserCompat$MediaItem();

    String MediaBrowserCompat$SearchResultReceiver();

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    boolean mo60423x50fd9e4a() throws XmlPullParserException;

    String MediaDescriptionCompat();

    String MediaDescriptionCompat(int i) throws XmlPullParserException;

    int MediaMetadataCompat();

    int MediaSessionCompat$QueueItem() throws XmlPullParserException, IOException;

    String MediaSessionCompat$ResultReceiverWrapper() throws XmlPullParserException, IOException;

    int MediaSessionCompat$Token() throws XmlPullParserException, IOException;

    int ParcelableVolumeInfo() throws XmlPullParserException, IOException;

    String RatingCompat();

    int read();

    String read(int i);

    void read(InputStream inputStream) throws XmlPullParserException;

    int write() throws XmlPullParserException;

    String write(int i);

    void write(String str) throws XmlPullParserException;
}
