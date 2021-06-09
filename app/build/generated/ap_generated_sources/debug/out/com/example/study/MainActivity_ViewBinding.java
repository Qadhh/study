// Generated code from Butter Knife. Do not modify!
package com.example.study;

import android.view.View;
import android.widget.RadioButton;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager2.widget.ViewPager2;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f0800fd;

  private View view7f0800fe;

  private View view7f0800ff;

  private View view7f080100;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.rb1, "field 'rb1' and method 'onClick'");
    target.rb1 = Utils.castView(view, R.id.rb1, "field 'rb1'", RadioButton.class);
    view7f0800fd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rb2, "field 'rb2' and method 'onClick'");
    target.rb2 = Utils.castView(view, R.id.rb2, "field 'rb2'", RadioButton.class);
    view7f0800fe = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rb3, "field 'rb3' and method 'onClick'");
    target.rb3 = Utils.castView(view, R.id.rb3, "field 'rb3'", RadioButton.class);
    view7f0800ff = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rb4, "field 'rb4' and method 'onClick'");
    target.rb4 = Utils.castView(view, R.id.rb4, "field 'rb4'", RadioButton.class);
    view7f080100 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.vp = Utils.findRequiredViewAsType(source, R.id.vp, "field 'vp'", ViewPager2.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rb1 = null;
    target.rb2 = null;
    target.rb3 = null;
    target.rb4 = null;
    target.vp = null;

    view7f0800fd.setOnClickListener(null);
    view7f0800fd = null;
    view7f0800fe.setOnClickListener(null);
    view7f0800fe = null;
    view7f0800ff.setOnClickListener(null);
    view7f0800ff = null;
    view7f080100.setOnClickListener(null);
    view7f080100 = null;
  }
}
