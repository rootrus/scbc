package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import p040o.C7506tP;

/* renamed from: o.zzkf$MediaBrowserCompat$ItemReceiver */
final class zzkf$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzkf$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new zzkf$MediaBrowserCompat$ItemReceiver();

    zzkf$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        nextDouble nextdouble = (nextDouble) data;
        onGetStartedClick.write((Object) nextdouble, "$this$toDomain");
        onGetStartedClick.write((Object) nextdouble, "entity");
        String[] strArr = nextdouble.IconCompatParcelizer;
        if (strArr != null) {
            Collection arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            Object[] array = ((List) arrayList).toArray(new String[0]);
            if (array != null) {
                String[] strArr2 = (String[]) array;
                if (strArr2 != null) {
                    return new C7506tP.read(strArr2);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        throw new EntityMappingException("Some mandatory is missing.");
    }
}
