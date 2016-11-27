package com.raywenderlich.rocketlaunch.animationactivities;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;

public class LaunchAndSpinAnimatorSetAnimatorActivity extends BaseAnimationActivity {
  @Override
  protected void onStartAnimation() {
    ValueAnimator positionAnimator = ValueAnimator.ofFloat(0, -mScreenHeight);

// 2
    positionAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
      @Override
      public void onAnimationUpdate(ValueAnimator animation) {
        float value = (float) animation.getAnimatedValue();
        mRocket.setTranslationY(value);
      }
    });

// 3
    ObjectAnimator rotationAnimator = ObjectAnimator.ofFloat(mRocket, "rotation", 0, 180f);
// 4
    AnimatorSet animatorSet = new AnimatorSet();
// 5
    animatorSet.play(positionAnimator).with(rotationAnimator);
// 6
    animatorSet.setDuration(DEFAULT_ANIMATION_DURATION);
    animatorSet.start();
  }
}
