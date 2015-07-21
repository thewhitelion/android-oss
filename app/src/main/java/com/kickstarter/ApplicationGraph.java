package com.kickstarter;

import com.kickstarter.libs.CurrentUser;
import com.kickstarter.libs.Money;
import com.kickstarter.presenters.ActivityFeedPresenter;
import com.kickstarter.presenters.DiscoveryPresenter;
import com.kickstarter.presenters.LoginPresenter;
import com.kickstarter.presenters.ProjectDetailPresenter;
import com.kickstarter.presenters.TwoFactorPresenter;
import com.kickstarter.ui.activities.ActivityFeedActivity;
import com.kickstarter.ui.activities.DiscoveryActivity;
import com.kickstarter.ui.activities.ProjectDetailActivity;
import com.kickstarter.ui.view_holders.ProjectListViewHolder;
import com.kickstarter.ui.view_holders.ProjectStateChangedPositiveViewHolder;
import com.kickstarter.ui.views.DiscoveryToolbar;
import com.kickstarter.ui.views.IconTextView;
import com.kickstarter.ui.views.KickstarterWebView;
import com.kickstarter.ui.views.TiemposTextView;

public interface ApplicationGraph {
  void inject(ActivityFeedActivity activity);
  void inject(ActivityFeedPresenter presenter);
  void inject(CurrentUser current_user);
  void inject(DiscoveryActivity activity);
  void inject(DiscoveryToolbar toolbar);
  void inject(DiscoveryPresenter presenter);
  void inject(IconTextView view);
  void inject(KickstarterWebView view);
  void inject(KsrApplication application);
  void inject(LoginPresenter presenter);
  void inject(Money money);
  void inject(ProjectDetailActivity activity);
  void inject(ProjectDetailPresenter presenter);
  void inject(ProjectListViewHolder viewHolder);
  void inject(ProjectStateChangedPositiveViewHolder viewHolder);
  void inject(TiemposTextView view);
  void inject(TwoFactorPresenter presenter);
}