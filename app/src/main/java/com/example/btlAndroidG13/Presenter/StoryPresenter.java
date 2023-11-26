package com.example.btlAndroidG13.Presenter;

import com.example.btlAndroidG13.Models.Story;
import com.example.btlAndroidG13.my_interface.IStory;
import com.example.btlAndroidG13.my_interface.StoryView;

public class StoryPresenter implements IStory {

    private Story story;
    private StoryView callback;

    public StoryPresenter(StoryView callback){
        story = new Story(this);
        this.callback = callback;
    }

    public void HandleGetStory(String iduser){
        story.HandleGetStory(iduser);
    }
    @Override
    public void getDataStory(String noidung) {
        callback.getDataStory(noidung);
    }
}
