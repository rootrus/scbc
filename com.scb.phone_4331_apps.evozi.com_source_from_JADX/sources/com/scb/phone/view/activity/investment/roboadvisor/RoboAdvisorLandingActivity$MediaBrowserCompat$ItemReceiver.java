package com.scb.phone.view.activity.investment.roboadvisor;

final class RoboAdvisorLandingActivity$MediaBrowserCompat$ItemReceiver implements Runnable {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ RoboAdvisorLandingActivity MediaBrowserCompat$ItemReceiver;

    RoboAdvisorLandingActivity$MediaBrowserCompat$ItemReceiver(RoboAdvisorLandingActivity roboAdvisorLandingActivity, String str) {
        this.MediaBrowserCompat$ItemReceiver = roboAdvisorLandingActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void run() {
        this.MediaBrowserCompat$ItemReceiver.aj_();
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
