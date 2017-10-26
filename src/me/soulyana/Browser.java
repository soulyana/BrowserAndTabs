package me.soulyana;

import java.util.ArrayList;

public class Browser {
    private String title;
    private ArrayList<Tabs> tabs;

    public Browser() {
        tabs = new ArrayList<Tabs>();

    }

    public Browser(String title) {
        this.title = title;
        tabs = new ArrayList<Tabs>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Tabs> getTabs() {
        return tabs;
    }

    public void setTabs(ArrayList<Tabs> tabs) {
        this.tabs = tabs;
    }

    public void addTab(Tabs aTab) {
        tabs.add(aTab);
    }
}
