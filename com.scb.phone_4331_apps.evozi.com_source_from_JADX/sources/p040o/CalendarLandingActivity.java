package p040o;

/* renamed from: o.CalendarLandingActivity */
public final /* synthetic */ class CalendarLandingActivity implements C6560xb325287a {
    private final /* synthetic */ onClickNextAction write;

    public /* synthetic */ CalendarLandingActivity(onClickNextAction onclicknextaction) {
        this.write = onclicknextaction;
    }

    public final void onStateChange(Object obj) {
        onClickNextAction onclicknextaction = this.write;
        OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
        onclicknextaction.f3169x50fd9e4a = FragmentBuilder_BindTopHistoryFragment.write(onBoardingTutorialActivity);
        DeejungTransferLandingActivity IconCompatParcelizer = FragmentBuilder_BindTopHistoryFragment.IconCompatParcelizer(onBoardingTutorialActivity);
        onclicknextaction.write = IconCompatParcelizer;
        if (IconCompatParcelizer != null) {
            onclicknextaction.MediaDescriptionCompat = IconCompatParcelizer.MediaSessionCompat$QueueItem || IconCompatParcelizer.ParcelableVolumeInfo.equals(IconCompatParcelizer.MediaBrowserCompat$MediaItem);
        }
        onclicknextaction.MediaMetadataCompat = FragmentBuilder_BindTopHistoryFragment.MediaBrowserCompat$ItemReceiver(onBoardingTutorialActivity);
        onclicknextaction.MediaBrowserCompat$CustomActionResultReceiver = EasycashNcbCaseModule.read(onBoardingTutorialActivity);
    }
}
