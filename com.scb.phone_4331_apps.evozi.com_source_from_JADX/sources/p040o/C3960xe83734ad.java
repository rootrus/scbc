package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.XVrsBlur;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.XVrsBlur$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver */
final class C3960xe83734ad<V> implements writeUInt64NoTag.IconCompatParcelizer<IdWorkflowActivity_MembersInjector> {
    private /* synthetic */ Throwable IconCompatParcelizer;
    private /* synthetic */ XVrsBlur.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    C3960xe83734ad(XVrsBlur.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.IconCompatParcelizer = th;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        IdWorkflowActivity_MembersInjector idWorkflowActivity_MembersInjector = (IdWorkflowActivity_MembersInjector) obj;
        idWorkflowActivity_MembersInjector.aj_();
        if (!XVrsBlur.this.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer)) {
            Throwable th = this.IconCompatParcelizer;
            if (th instanceof RetrofitException) {
                ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
                if (iLocationSourceDelegate != null) {
                    ILocationSourceDelegate.zza zza = iLocationSourceDelegate.write;
                    onGetStartedClick.IconCompatParcelizer((Object) zza, "retrofitException");
                    String str = zza.IconCompatParcelizer;
                    String str2 = zza.write;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = str3;
                    }
                    String str4 = zza.read;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    if (str != null) {
                        switch (str.hashCode()) {
                            case 1567036:
                                if (str.equals("3010")) {
                                    idWorkflowActivity_MembersInjector.MediaBrowserCompat$CustomActionResultReceiver(str2, str3);
                                    return;
                                }
                                break;
                            case 1567038:
                                if (str.equals("3012")) {
                                    idWorkflowActivity_MembersInjector.read(str2, str3);
                                    return;
                                }
                                break;
                            case 1567039:
                                if (str.equals("3013")) {
                                    idWorkflowActivity_MembersInjector.read(str2, str3);
                                    return;
                                }
                                break;
                            case 1567040:
                                if (str.equals("3014")) {
                                    idWorkflowActivity_MembersInjector.read(str2, str3);
                                    return;
                                }
                                break;
                            case 1567041:
                                if (str.equals("3015")) {
                                    idWorkflowActivity_MembersInjector.MediaBrowserCompat$ItemReceiver(str2, str3);
                                    return;
                                }
                                break;
                        }
                    }
                    access$2200 MediaBrowserCompat$ItemReceiver2 = XVrsBlur.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS);
                    onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "errorDisplayMapper.transform(e)");
                    idWorkflowActivity_MembersInjector.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
                    return;
                }
                access$2200 MediaBrowserCompat$ItemReceiver3 = XVrsBlur.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS);
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver3, "errorDisplayMapper.transform(e)");
                idWorkflowActivity_MembersInjector.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver3);
                return;
            }
            access$2200 MediaBrowserCompat$ItemReceiver4 = XVrsBlur.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver4, "errorDisplayMapper.transform(e)");
            idWorkflowActivity_MembersInjector.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver4);
        }
    }
}
