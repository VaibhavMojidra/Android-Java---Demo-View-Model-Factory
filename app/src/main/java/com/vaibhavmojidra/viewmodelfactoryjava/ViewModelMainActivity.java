package com.vaibhavmojidra.viewmodelfactoryjava;

import androidx.lifecycle.ViewModel;

public class ViewModelMainActivity extends ViewModel {
    private String name;

    public ViewModelMainActivity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
