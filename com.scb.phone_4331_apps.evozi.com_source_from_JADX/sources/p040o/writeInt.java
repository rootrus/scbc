package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import com.scb.phone.view.fragment.hml.C5985x82597580;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.zzca;

/* renamed from: o.writeInt */
public final /* synthetic */ class writeInt implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C5985x82597580 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ writeInt(C5985x82597580 hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$ItemReceiver = hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        filterByAuthorizedAccounts filterbyauthorizedaccounts = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        setTextLocales settextlocales = (setTextLocales) singleDataEntity.getData();
        zzca.zzb.C10819zzb zzb = null;
        if (settextlocales != null) {
            OffsetDateTime write = FragmentBuilder_BindSummaryFragment.write(settextlocales.MediaSessionCompat$QueueItem, (OffsetDateTime) null);
            String str = settextlocales.IconCompatParcelizer;
            if (str != null) {
                String str2 = settextlocales.MediaBrowserCompat$ItemReceiver;
                if (str2 != null) {
                    String str3 = settextlocales.MediaBrowserCompat$CustomActionResultReceiver;
                    if (str3 != null) {
                        String str4 = settextlocales.MediaBrowserCompat$SearchResultReceiver;
                        if (str4 != null) {
                            String str5 = settextlocales.MediaMetadataCompat;
                            if (str5 != null) {
                                String str6 = settextlocales.MediaBrowserCompat$MediaItem;
                                String str7 = settextlocales.write;
                                String str8 = settextlocales.read;
                                String str9 = settextlocales.ParcelableVolumeInfo;
                                String str10 = settextlocales.MediaDescriptionCompat;
                                String str11 = settextlocales.MediaSessionCompat$ResultReceiverWrapper;
                                List<String> list = settextlocales.RatingCompat;
                                if (list != null) {
                                    zzb = new zzca.zzb.C10819zzb(write, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, (List) list, 8192);
                                } else {
                                    throw new EntityMappingException("Missing some mandatory fields.");
                                }
                            } else {
                                throw new EntityMappingException("Missing some mandatory fields.");
                            }
                        } else {
                            throw new EntityMappingException("Missing some mandatory fields.");
                        }
                    } else {
                        throw new EntityMappingException("Missing some mandatory fields.");
                    }
                } else {
                    throw new EntityMappingException("Missing some mandatory fields.");
                }
            } else {
                throw new EntityMappingException("Missing some mandatory fields.");
            }
        }
        if ("1100".equals(singleDataEntity.getStatus().write())) {
            zzb.MediaDescriptionCompat = true;
        }
        return zzb;
    }
}
