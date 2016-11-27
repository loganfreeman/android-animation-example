package com.raywenderlich.rocketlaunch.animationactivities;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

public class LaunchRocketObjectAnimatorAnimationActivity extends BaseAnimationActivity {
  @Override
  protected void onStartAnimation() {
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(mRocket, "translationY",
            0, -mScreenHeight);
// 2
    objectAnimator.setDuration(DEFAULT_ANIMATION_DURATION);
    objectAnimator.start();
  }
}
