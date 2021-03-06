package com.master.old.tv.dagger.component;

import android.app.Activity;

import com.master.old.tv.dagger.module.FragmentModule;
import com.master.old.tv.dagger.scope.FragmentScope;
import com.master.old.tv.view.fragments.CommentFragment;
import com.master.old.tv.view.fragments.tab.TabFindFragment;
import com.master.old.tv.view.fragments.tab.TabMySelfFragment;
import com.master.old.tv.view.fragments.tab.TabChoiceFragment;
import com.master.old.tv.view.fragments.tab.TabTopicFragment;

import dagger.Component;

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {

    Activity getActivity();

    void inject(TabFindFragment findFragment);//发现

    void inject(TabTopicFragment topicFragment);//专题

    void inject(TabChoiceFragment tabChoiceFragment);//精选

    void inject(TabMySelfFragment tabMySelfFragment);//我的

    void inject(CommentFragment commentFragment);//评论

    //void inject(VideoIntroFragment videoIntroFragment);
}
