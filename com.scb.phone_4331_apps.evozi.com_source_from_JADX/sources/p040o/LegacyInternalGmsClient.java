package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.LegacyInternalGmsClient */
public final /* synthetic */ class LegacyInternalGmsClient implements DirectDebitDeepLinkActivity {
    public /* synthetic */ LegacyInternalGmsClient(notifyListenerInternal notifylistenerinternal) {
    }

    public final Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        String str = ((CampaignTrackingService) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = ((CampaignTrackingService) singleDataEntity.getData()).write;
        String str3 = ((CampaignTrackingService) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver;
        return new setScrollGesturesEnabledDuringRotateOrZoom(str, ((CampaignTrackingService) singleDataEntity.getData()).MediaMetadataCompat, str2, ((CampaignTrackingService) singleDataEntity.getData()).IconCompatParcelizer, ((CampaignTrackingService) singleDataEntity.getData()).MediaBrowserCompat$MediaItem, str3, ((CampaignTrackingService) singleDataEntity.getData()).read, ((CampaignTrackingService) singleDataEntity.getData()).RatingCompat, ((CampaignTrackingService) singleDataEntity.getData()).MediaDescriptionCompat, ((CampaignTrackingService) singleDataEntity.getData()).MediaBrowserCompat$SearchResultReceiver);
    }
}
