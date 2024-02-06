package p040o;

import android.view.View;
import java.util.List;

/* renamed from: o.CardIoWrapperActivity */
public interface CardIoWrapperActivity {
    int IconCompatParcelizer();

    int MediaBrowserCompat$CustomActionResultReceiver();

    int MediaBrowserCompat$ItemReceiver(int i, int i2, int i3);

    void MediaBrowserCompat$ItemReceiver(int i, View view);

    int MediaBrowserCompat$MediaItem();

    boolean MediaBrowserCompat$SearchResultReceiver();

    int MediaDescriptionCompat();

    int MediaMetadataCompat();

    int RatingCompat();

    /* renamed from: a_ */
    View mo33247a_(int i);

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    /* renamed from: k_ */
    int mo33252k_();

    /* renamed from: l_ */
    int mo33253l_();

    /* renamed from: m_ */
    List<onNotifyListenerFailed> mo33254m_();

    int read(int i, int i2, int i3);

    View read(int i);

    void setFlexLines(List<onNotifyListenerFailed> list);

    int write(View view);

    int write(View view, int i, int i2);

    void write(View view, int i, int i2, onNotifyListenerFailed onnotifylistenerfailed);

    void write(onNotifyListenerFailed onnotifylistenerfailed);
}
