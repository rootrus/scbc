package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.C1251R;
import p040o.onActivityStarted;

/* renamed from: o.IAccountAccessor */
public final /* synthetic */ class IAccountAccessor implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ onActivityStarted IconCompatParcelizer;

    public /* synthetic */ IAccountAccessor(onActivityStarted onactivitystarted) {
        this.IconCompatParcelizer = onactivitystarted;
    }

    public final Object write(Object obj) {
        C4169camera camera;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        Integer num = ((C1251R.styleable) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver;
        if (num != null) {
            int intValue = num.intValue();
            String str = ((C1251R.styleable) singleDataEntity.getData()).read;
            if (str != null) {
                Integer num2 = ((C1251R.styleable) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver;
                boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((C1251R.styleable) singleDataEntity.getData()).write, (Object) "Y");
                List<C1251R.C1254style> list = ((C1251R.styleable) singleDataEntity.getData()).IconCompatParcelizer;
                if (list != null) {
                    Iterable<C1251R.C1254style> iterable = list;
                    int i = 10;
                    onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                    if (iterable instanceof Collection) {
                        i = ((Collection) iterable).size();
                    }
                    Collection arrayList = new ArrayList(i);
                    for (C1251R.C1254style style : iterable) {
                        String str2 = style.MediaBrowserCompat$ItemReceiver;
                        Integer num3 = style.MediaMetadataCompat;
                        String str3 = style.read;
                        String str4 = style.MediaBrowserCompat$CustomActionResultReceiver;
                        String str5 = style.IconCompatParcelizer;
                        boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) style.MediaBrowserCompat$SearchResultReceiver, (Object) "Y");
                        boolean MediaBrowserCompat$ItemReceiver3 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) style.RatingCompat, (Object) "Y");
                        Setter setter = style.write;
                        if (setter != null) {
                            camera = new C4169camera(setter.IconCompatParcelizer, setter.read);
                        } else {
                            camera = null;
                        }
                        arrayList.add(new compassEnabled(num3, str2, str3, (String) null, str4, (String) null, (String) null, (String) null, str5, MediaBrowserCompat$ItemReceiver3, MediaBrowserCompat$ItemReceiver2, camera, (String) null, (String) null, (String) null, 28904));
                    }
                    List write = HmlNTBBusinessURLInformationActivity.write((List) arrayList, new onActivityStarted.read());
                    if (write != null) {
                        return new GoogleMapOptions(intValue, MediaBrowserCompat$ItemReceiver, str, num2, write);
                    }
                }
                throw new EntityMappingException("transactions must not be null or empty");
            }
            throw new EntityMappingException("remark must not be null or empty");
        }
        throw new EntityMappingException("totalCount must not be null or empty");
    }

    /* renamed from: o.IAccountAccessor$Stub */
    public final /* synthetic */ class Stub implements DirectDebitDeepLinkActivity {

        /* renamed from: o.IAccountAccessor$Stub$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ zza MediaBrowserCompat$CustomActionResultReceiver = new zza();

            private /* synthetic */ zza() {
            }

            public final Object write(Object obj) {
                return (setMinFrame) ((SingleDataEntity) obj).getData();
            }
        }

        public /* synthetic */ Stub(getChimeraLifecycleFragmentImpl getchimeralifecyclefragmentimpl) {
        }

        public final Object write(Object obj) {
            DrawingContent drawingContent = (DrawingContent) ((SingleDataEntity) obj).getData();
            setPanningGesturesEnabled setpanninggesturesenabled = new setPanningGesturesEnabled();
            setpanninggesturesenabled.read = drawingContent.MediaSessionCompat$ResultReceiverWrapper;
            setpanninggesturesenabled.MediaBrowserCompat$CustomActionResultReceiver = drawingContent.write;
            setpanninggesturesenabled.write = drawingContent.read;
            setpanninggesturesenabled.IconCompatParcelizer = drawingContent.PlaybackStateCompat$CustomAction;
            setpanninggesturesenabled.MediaBrowserCompat$ItemReceiver = drawingContent.f5503x50fd9e4a;
            return setpanninggesturesenabled;
        }
    }
}
