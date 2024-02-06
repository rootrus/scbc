package p040o;

/* renamed from: o.VideoPlaybackActivity */
public enum VideoPlaybackActivity implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    EPICS_COROUTINE_NULL("Process Epics Coroutine is null.", 26000),
    EPICS_COROUTINE_COMPLETE("Process Epics Coroutine is complete.", 26001),
    EPICS_ACTION_CHANNEL_CLOSED("Action Input is closed for send.", 26002),
    NO_RUNNING_EPICS("No epics running.", 26003),
    ERROR_DISPATCHING("Error dispatching epic result to the store.", 26004),
    ERROR_CREATING_EPICS("Error creating epics.", 26005),
    CANCELLABLE_EPIC_INPUT_FAILURE("Error processing epic input in cancellable epic.", 26006),
    EPIC_INPUT_CHANNEL_CLOSED("Epic Input Channel is closed for send.", 26007),
    ACTION_OFFER_FAILED("Offering the action to epics failed.", 26008),
    EPIC_OUTPUT_CHANNEL_CLOSED("Epic Output Channel is closed for send.", 26009),
    CANCELLABLE_EPIC_INPUT_OFFER_FAILED("Cancellable Epic Offer to worker failed.", 26010),
    EPIC_OUTPUT_CHANNEL_OFFER_FAILED("Failed to offer output to dispatch.", 26011),
    ERROR_CANCELLING_WORKER("There was an error cancelling a worker job.", 26012),
    LAUNCHING_JOB("Launching coroutine: %s %s", 26013),
    COMPLETING_JOB("Completing coroutine: %s %s", 26014),
    CLOSING_CHANNEL("Closing Coroutine Channel: %s %s", 26015),
    CLOSE_CHANNEL_ERROR("There was an error closing a coroutine channel.", 25016),
    KOTLIN_COROUTINES_DEBUG_ON("system property kotlinx.coroutines.debug set to 'on'", 25017);
    
    private final int code;
    private final String logMessage;

    private VideoPlaybackActivity(String str, int i) {
        this.logMessage = str;
        this.code = i;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.logMessage;
    }

    public final int IconCompatParcelizer() {
        return this.code;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n        ");
        sb.append(getClass().getSimpleName());
        sb.append(": {\n            code: ");
        sb.append(this.code);
        sb.append(",\n            i18nKey: ");
        sb.append(name());
        sb.append("\n        }\n    ");
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString());
    }
}
